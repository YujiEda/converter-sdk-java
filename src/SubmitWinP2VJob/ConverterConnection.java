package SubmitWinP2VJob;

import com.vmware.converter.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.*;

import javax.xml.rpc.ServiceException;

import org.apache.axis.MessageContext;
import org.apache.axis.client.Stub;
import org.apache.axis.transport.http.HTTPConstants;

public class ConverterConnection
{
   private ConverterServiceLocator _converterServiceLocator = null;
   private ConverterPortType _converterService = null;
   private ConverterServerContent _converterServerContent = null;
   private ConverterUserSession _userSession = null;
   private int _waitSeconds = 180;
   private int _totalAttempts = 5;

   /**
    * Connect to a converter server
    * @param serverUrl Server URL
    * @param username User name to log in
    * @param password Password to log in
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws ServiceException
    * @throws MalformedURLException
    */
   public final void
      connect(String serverUrl, String username, String password) throws RemoteException,
                                                                 MalformedURLException,
                                                                 ServiceException
   {
      assert !Common.isNullOrEmpty(serverUrl);

      ManagedObjectReference morServiceInstance = new ManagedObjectReference();
      morServiceInstance.setType("ConverterServiceInstance");
      morServiceInstance.set_value("ServiceInstance");

      _converterServiceLocator = new ConverterServiceLocator();
      _converterServiceLocator.setMaintainSession(true);

      _converterService = _converterServiceLocator.getConverterPort(new URL(serverUrl));
      ((Stub)_converterService).setTimeout(120000);

      Hashtable<String, String> properties = new Hashtable<String, String>();
      properties.put(HTTPConstants.HEADER_TRANSFER_ENCODING_CHUNKED, "false");

      ((Stub)_converterService)._setProperty(HTTPConstants.REQUEST_HEADERS, properties);
      ((Stub)_converterService)._setProperty(MessageContext.HTTP_TRANSPORT_VERSION,
         HTTPConstants.HEADER_PROTOCOL_V11);
      ((Stub)_converterService)
         ._setProperty(Stub.SESSION_MAINTAIN_PROPERTY, Boolean.TRUE);

      _converterServerContent =
         (ConverterServerContent)_converterService
            .converterRetrieveServiceContent(morServiceInstance);

      if (_converterServerContent.getSessionManager() == null) {
         throw new RemoteException("Session manager is null");
      }

      _userSession =
         _converterService.converterLogin(_converterServerContent.getSessionManager(),
            username, password, null);

      if (_userSession == null) {
         throw new RemoteException("User session is null");
      }

   }

   /**
    * Query the hardware and OS info of a source machine. Can prompt the user to
    * confirm the machine's SSL thumbprint. Side effect: will cache the
    * thumbprint in computerSpec.
    * @param computerSpec The machine to query.
    * @return The source info.
    * @throws RemoteException
    * @throws VimFault
    * @throws RuntimeFault
    */
   public final ConverterComputerInfo
      querySource(ConverterComputerSpec computerSpec) throws RuntimeFault,
                                                     VimFault,
                                                     RemoteException
   {
      ConverterComputerInfo result = null;
      boolean retry;

      do {
         retry = false;

         try {
            result =
               _converterService.converterQuery(
                  _converterServerContent.getQueryManager(), computerSpec);
         } catch (ConverterSSLVerificationFault e) {
            String remoteThumbprint = e.getThumbprint();
            if (!Common.isNullOrEmpty(remoteThumbprint)) {
               retry = checkCertificate(computerSpec.getLocation(), remoteThumbprint);
            }
            if (!retry) {
               throw e;
            }
         } catch (ConverterSysinfoQueryBadThumbprintFault e) {
            // Linux P2V case
            String remoteThumbprint = e.getThumbprint();
            if (!Common.isNullOrEmpty(remoteThumbprint)) {
               retry = checkCertificate(computerSpec.getLocation(), remoteThumbprint);
            }
            if (!retry) {
               throw e;
            }
         }
      } while (retry);

      return result;
   }

   /**
    * Validate a source machine against the destination host and get default
    * conversion parameters. Will not return defaults if validation fails. Can
    * prompt the user to confirm the machine's SSL thumbprint. Side effect: will
    * cache the thumbprint in computerSpec.
    * @param source The source machine.
    * @param targetVmSpec The destination host.
    * @return The default parameters.
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidLogin
    */
   public final ConverterDefaultConversionParamsResult
      validateTargetAndGetDefaults(ConverterComputerSpec source,
         ConverterTargetVmSpec targetVmSpec) throws InvalidLogin,
                                            RuntimeFault,
                                            RemoteException
   {
      ConverterDefaultConversionParamsResult result = null;
      boolean retry;

      do {
         retry = false;

         try {
            result =
               _converterService.converterValidateTargetAndGetDefaults(
                  _converterServerContent.getQueryManager(), source, targetVmSpec);
         } catch (ConverterSSLVerificationFault e) {
            String remoteThumbprint = e.getThumbprint();

            if (!Common.isNullOrEmpty(remoteThumbprint)) {
               // Check source certificate
               retry = checkCertificate(source.getLocation(), remoteThumbprint);

               if (!retry) {
                  // Check target certificate
                  retry = checkCertificate(targetVmSpec.getLocation(), remoteThumbprint);
               }
            }

            if (!retry) {
               throw e;
            }
         }
      } while (retry);

      return result;
   }

   /**
    * Install converter agent on live Windows source machine. Can prompt the
    * user to confirm the machine's SSL thumbprint. Side effect: will cache the
    * thumbprint in computerSpec.
    * @param liveComputerLocation The source machine.
    * @param sourceAgentPort The port the agent is supposed to listen to
    * @param sourcePostponeReboot In some cases the machine might need to be
    *           rebooted after installation. Whether to reboot immediately or
    *           not.
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidLogin
    * @throws InterruptedException
    */
   public final void
      installAgent(ConverterComputerSpecLiveComputerLocation liveComputerLocation,
         int sourceAgentPort,
         boolean sourcePostponeReboot) throws InvalidLogin,
                                      RuntimeFault,
                                      RemoteException,
                                      InterruptedException
   {
      // Check for Agent existence.
      ConverterComputerSpec computerSpec = new ConverterComputerSpec();
      computerSpec.setLocation(liveComputerLocation);

      boolean retry;
      do {
         retry = false;
         try {
            _converterService.converterValidateAgentAvailability(
               _converterServerContent.getQueryManager(), computerSpec);
            return;
         } catch (InvalidArgument e) {
            String remoteThumbprint = extractCertificateThumbprintFromFaultMessage(e);
            if (!Common.isNullOrEmpty(remoteThumbprint)) {
               retry = checkCertificate(computerSpec.getLocation(), remoteThumbprint);

               if (!retry) {
                  throw e;
               }
            } else {
               System.out.println(e.getMessage());
               System.out
                  .println("Agent isn't installed on source machine. Trying to install agent...");
            }
         } catch (RemoteException e) {
            System.out.println(e.getMessage());
            System.out
               .println("Agent isn't installed on source machine. Trying to install agent...");
         }
      } while (retry);

      ConverterAgentManagerAgentDeploymentResult result =
         _converterService.converterInstallAgent(
            _converterServerContent.getAgentManager(),
            liveComputerLocation.getHostname(), sourceAgentPort,
            liveComputerLocation.getUsername(), liveComputerLocation.getPassword(),
            sourcePostponeReboot);

      // Update source computer spec thumbprint with the one returned after
      // agent deployment, if any.
      liveComputerLocation.setSslThumbprint(result.getSslThumbprint());

      if (result.getStatus() == ConverterAgentManagerDeploymentStatus.completed) {
         return;
      } else if (result.getStatus() == ConverterAgentManagerDeploymentStatus.rebootRequired) {
         if (sourcePostponeReboot) {
            throw new RemoteException("A reboot of the physical source '"
               + liveComputerLocation.getHostname()
               + "' is required for the agent installation"
               + " to succeed. Please try the P2V after rebooting the source" + "\r\n");
         } else {
            _converterService.converterRebootMachine(
               _converterServerContent.getAgentManager(),
               liveComputerLocation.getHostname(), liveComputerLocation.getUsername(),
               liveComputerLocation.getPassword());
            System.out.format("A reboot of the physical source %1$s has been initiated."
               + "\r\n", liveComputerLocation.getHostname());
            // Go to waiting
         }
      } else if (result.getStatus() == ConverterAgentManagerDeploymentStatus.rebootInitiated) {
         // Go to waiting
      } else {
         assert false : "Unexpected deployment status";
      }

      // If a reboot of the physical source has been initiated.
      for (int attempt = 0; attempt < _totalAttempts; attempt++) {
         try {
            _converterService.converterValidateAgentAvailability(
               _converterServerContent.getQueryManager(), computerSpec);
            return;
         } catch (RemoteException e) {
            System.out.println("Unable to validate agent availability: "
               + e.getMessage() + ". Trying again...");
            Thread.sleep(_waitSeconds * 1000);
         }
      }

      String err =
         String.format("Unable to validate agent availability after %1$d attempts",
            _totalAttempts);
      throw new RemoteException(err);
   }

   /**
    * Submits a conversion or reconfiguration job.
    * @param jobSpec The job spec object
    * @return Info about the submitted job
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidLogin
    * @throws InvalidState
    * @throws InvalidName
    * @throws DuplicateName
    */
   public final ConverterServerConversionConversionJobInfo
      submitJob(ConverterServerConversionConversionJobSpec jobSpec) throws DuplicateName,
                                                                   InvalidName,
                                                                   InvalidState,
                                                                   InvalidLogin,
                                                                   RuntimeFault,
                                                                   RemoteException
   {
      ConverterServerConversionConversionJobInfo result = null;
      boolean retry;

      do {
         retry = false;

/*         try {
            result =
               _converterService.converterServerConversionManagerCreateJob(
                  _converterServerContent.getConversionManager(), jobSpec, null);
         } catch (InvalidArgument e) {
            String remoteThumbprint = extractCertificateThumbprintFromFaultMessage(e);

            if (!Common.isNullOrEmpty(remoteThumbprint)) {
               // Check source certificate
               retry =
                  checkCertificate(jobSpec.getSource().getLocation(), remoteThumbprint);

               if (!retry) {
                  // Check target certificate
                  retry =
                     checkCertificate(jobSpec.getConversionParams().getCloningParams()
                        .getTarget().getLocation(), remoteThumbprint);
               }
            }

            if (!retry) {
               throw e;
            }
         }*/
         
         try
         {
            result = _converterService.converterServerConversionManagerCreateJob(
                                                    _converterServerContent.getConversionManager(),
                                                    jobSpec,
                                                    null);
         }
         catch(InvalidArgument e)
         {
            ConverterSSLVerificationFault sslFault = null;
            if (e.getFaultCause() != null)
            {
               sslFault = (ConverterSSLVerificationFault) e.getFaultCause().getFault();
            }
            if (sslFault != null)
            {
               // source machine spec
               ConverterComputerSpecLiveComputerLocation liveSourceLocation =
                  (ConverterComputerSpecLiveComputerLocation) jobSpec.getSource().getLocation();

               // destination connection spec
               ConverterVimConnectionSpec vimConnectionSpec =
                  ((ConverterTargetVmSpecManagedVmLocation)
                     jobSpec.getConversionParams().getCloningParams().getTarget().getLocation()).getVimConnect();

               if (liveSourceLocation != null &&
                     (liveSourceLocation.getSslThumbprint() == null ||
                        liveSourceLocation.getSslThumbprint().length() == 0))
               {
                  if (readYesNo("\nSource machine certificate validation failed.\n" +
                                "Source machine: " + liveSourceLocation.getHostname() + "\n" +
                                "Certificate thumprint: " + sslFault.getThumbprint() + "\n" +
                                "Proceed with connecting to the source machine?", false))
                  {
                     liveSourceLocation.setSslThumbprint(sslFault.getThumbprint());
                     retry = true;
                  }
               }
               else if (vimConnectionSpec != null &&
                             (vimConnectionSpec.getSslThumbprint() == null ||
                                vimConnectionSpec.getSslThumbprint().length() == 0))
               {
                  if (readYesNo("\nDestination vCenter/ESX server certificate validation failed.\n" +
                                "Destination vCenter/ESX server: " + vimConnectionSpec.getHostname() + "\n" +
                                "Certificate thumprint: " + sslFault.getThumbprint() + "\n" +
                                "Proceed with connecting to the destination server?", false))
                  {
                     vimConnectionSpec.setSslThumbprint(sslFault.getThumbprint());
                     retry = true;
                  }
               }
            }
            if (!retry)
            {
               System.out.println(e.getMessage());
               e.printStackTrace();
            }
         }
         catch(Exception e)
         {
            System.out.println(e.getMessage());
            e.printStackTrace();
         }
      } while (retry);

      return result;
   }

   /**
    * Updates a synchronizable job. This may start an incremental update now or
    * schedule it for the future.
    * @param jobId The job id (as seen in converter client) to update
    * @param updateSpec The spec for update
    * @return The old conversion parameters before the update
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidState
    */
   public final ConverterConversionParams
      updateJob(int jobId, ConverterServerConversionConversionParamsUpdateSpec updateSpec) throws InvalidState,
                                                                                          RuntimeFault,
                                                                                          RemoteException
   {
      ManagedObjectReference job = new ManagedObjectReference();
      job.setType("ConverterServerConversionConversionJob");
      job.set_value("job-" + Integer.toString(jobId));

      ConverterConversionParams result =
         _converterService.converterServerConversionJobUpdateConversionParams(job,
            updateSpec);

      return result;
   }

   /**
    * Gets info for the last converter tasks
    * @param tasks Number of tasks to get
    * @return Task info array
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidState
    */
   public final ConverterTaskInfo[]
      getTaskHistory(int tasks) throws InvalidState,
                               RuntimeFault,
                               RemoteException
   {
      ConverterTaskFilterSpec filter = new ConverterTaskFilterSpec();
      // Customize filter if needed

      ManagedObjectReference taskCollector =
         _converterService.converterCreateCollectorForTasks(
            _converterServerContent.getTaskManager(), filter);

      return _converterService.converterReadNextTasks(taskCollector, tasks);
   }

   /**
    * Gets info for the last converter jobs
    * @param jobs Number of jobs to get
    * @return Jobs info array
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidState
    */
   public final ConverterServerConversionConversionJobInfo[]
      getJobHistory(int jobs) throws InvalidState,
                             RuntimeFault,
                             RemoteException
   {
      ConverterServerJobJobFilterSpec filter = new ConverterServerJobJobFilterSpec();
      // Customize filter if needed

      ManagedObjectReference jobCollector =
         _converterService.converterCreateCollectorForJobs(
            _converterServerContent.getConversionManager(), filter);

      return _converterService.converterReadNextConversionJobs(jobCollector, jobs);
   }

   /**
    * Prompts the user to accept the SSL thumbprint if not already set Utility
    * function to call when a call to converter server returns an SSL fault.
    * @param location Machine to authenticate to
    * @param remoteThumbprint Thumbprint to accept
    * @return Whether to retry the call (after accepting the thumbprint)
    */
   private boolean
      checkCertificate(Object location, String remoteThumbprint)
   {
      String thumbprint = Common.getThumbprint(location);
      String hostname = null;
      String label = null;

      if (location instanceof ConverterComputerSpecLiveComputerLocation) {
         // Physical source
         ConverterComputerSpecLiveComputerLocation loc =
            (ConverterComputerSpecLiveComputerLocation)location;
         hostname = loc.getHostname();
         label = "Live source machine";
      } else if (location instanceof ConverterComputerSpecManagedVmLocation) {
         // Managed source
         ConverterComputerSpecManagedVmLocation loc =
            (ConverterComputerSpecManagedVmLocation)location;
         hostname = loc.getVimConnect().getHostname();
         label = "Source vCenter or ESX server";
      } else if (location instanceof ConverterComputerSpecHyperVComputerLocation) {
         // Hyper-V source
         ConverterComputerSpecHyperVComputerLocation loc =
            (ConverterComputerSpecHyperVComputerLocation)location;
         hostname = loc.getHostname();
         label = "Source Hyper-V server";
      } else if (location instanceof ConverterTargetVmSpecManagedVmLocation) {
         // Managed target
         ConverterTargetVmSpecManagedVmLocation loc =
            (ConverterTargetVmSpecManagedVmLocation)location;
         hostname = loc.getVimConnect().getHostname();
         label = "Destination vCenter or ESX server";
      }

      boolean result = false;

      // Location that has SSL thumbprint but is not set
      if (!Common.isNullOrEmpty(hostname) && !Common.equals(thumbprint, remoteThumbprint)) {
         String message =
            String.format("\n%1$s certificate validation failed." + "\n%1$s: %2$s"
               + "\nCertificate thumbprint: %3$s"
               + "\nProceed with connecting to the destination server?", label, hostname,
               remoteThumbprint);
         result = readYesNo(message, false);

         if (result) {
            if (location instanceof ConverterComputerSpecLiveComputerLocation) {
               ConverterComputerSpecLiveComputerLocation loc =
                  (ConverterComputerSpecLiveComputerLocation)location;
               loc.setSslThumbprint(remoteThumbprint);
            } else if (location instanceof ConverterComputerSpecManagedVmLocation) {
               ConverterComputerSpecManagedVmLocation loc =
                  (ConverterComputerSpecManagedVmLocation)location;
               loc.getVimConnect().setSslThumbprint(remoteThumbprint);
            } else if (location instanceof ConverterComputerSpecHyperVComputerLocation) {
               ConverterComputerSpecHyperVComputerLocation loc =
                  (ConverterComputerSpecHyperVComputerLocation)location;
               loc.setSslThumbprint(remoteThumbprint);
            } else if (location instanceof ConverterTargetVmSpecManagedVmLocation) {
               ConverterTargetVmSpecManagedVmLocation loc =
                  (ConverterTargetVmSpecManagedVmLocation)location;
               loc.getVimConnect().setSslThumbprint(remoteThumbprint);
            }
         }
      }

      return result;
   }

   /**
    * Extract the thumbprint from the SSL fault
    * @param message Error message
    * @return SSL thumbprint
    */
   private String
      extractCertificateThumbprintFromFaultMessage(InvalidArgument e)
   {
         if (e.getFaultCause().getFault() instanceof ConverterSSLVerificationFault) {
         ConverterSSLVerificationFault sslFault =
            (ConverterSSLVerificationFault)e.getFaultCause().getFault();

         if (sslFault != null) {
            return sslFault.getThumbprint();
         }
      }

      return null;
   }

   /**
    * Prompt the user to accept thumbprint
    * @param prompt Text for the user
    * @param defaultValue Suggested answer
    * @return User's answer
    */
   private boolean
      readYesNo(String prompt, boolean defaultValue)
   {
      System.out.println(prompt);
      boolean result = defaultValue;
      boolean ready = false;

      do {
         System.out.print("(Enter [y]es, [n]o or [c]ancel): > ");

         char ch;
         StringBuffer lineBuffer = new StringBuffer();
         do {
            try {
               ch = (char)System.in.read();
               if (ch != '\r' && ch != '\n') {
                  lineBuffer.append(ch);
               }
            } catch (IOException e) {
               // Something went wrong
               ready = true;
               break;
            }
         } while (ch != '\n');

         String line = new String(lineBuffer).trim();
         if (line.compareToIgnoreCase("y") == 0 || line.compareToIgnoreCase("yes") == 0) {
            result = true;
            ready = true;
         } else if (line.compareToIgnoreCase("n") == 0
            || line.compareToIgnoreCase("no") == 0) {
            result = false;
            ready = true;
         } else if (line.compareToIgnoreCase("c") == 0
            || line.compareToIgnoreCase("cancel") == 0) {
            // Use default answer
            ready = true;
         }
      } while (!ready);

      return result;
   }
}