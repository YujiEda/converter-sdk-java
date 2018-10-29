package SubmitWinP2VJob;

import java.io.*;
import java.rmi.RemoteException;
import java.text.*;
import java.util.*;

import com.vmware.converter.*;

public class ConverterOperation
{
   /**
    * Type of the operation to perform. One instance of ConverterOperation will
    * perform one operation.
    */
   private enum OperationType
   {
      Convert,
      Reconfig,
      Synchronize,   // Schedule incremental task of a
                   // synchronizable Windows P2V job
      QuerySource,   // Prints source machine info
      GetDefaults,   // Calls ValidateTargetAndGetDefaults and prints default
                   // conversion parameters
      List;          // List recent jobs and tasks
   }

   /**
    * Type of the conversion source. Not applicable to operations of type List.
    */
   private enum SourceType
   {
      Invalid,

      Physical,
      Managed,    // VC, ESX
      Hosted,     // WS, Player, Fusion. Also third party images and backups
      HyperV;
   }

   /**
    * Type of the source machine OS.
    */
   private enum OsType
   {
      Invalid,

      windowsOs,
      linuxOs;
   }

   /**
    * Type of the destination VM Applicable only to operations of type Convert
    */
   private enum TargetType
   {
      Invalid,

      Managed, // VC, ESX
      Hosted;  // WS, Player, Fusion
   }

   /**
    * Type of cloning Applicable only to operations of type Convert
    */
   private enum CloningMode
   {
      Invalid,

      diskBasedCloning,
      volumeBasedCloning,
      linkedClone;
   }

   // Conversion Job details
   private OperationType[] _operations = null;
   private SourceType _sourceType = SourceType.Invalid;
   private TargetType _targetType = TargetType.Invalid;
   private int _jobId = 0;
   private boolean _jobSync = false;
   private Date _jobSyncStart = new Date(0);
   private boolean _jobSyncFinalize;

   // Source details
   private String _sourcePhysAddress;
   private String _sourcePhysUsername;
   private String _sourcePhysPassword;
   private OsType _sourcePhysOsType = OsType.Invalid;
   private int _sourcePhysAgentPort = 0; // 9089
   private String _sourcePhysThumbprint;
   private boolean _sourcePhysReboot = false;
   private String _sourceManagedAddress;
   private String _sourceManagedThumbprint;
   private String _sourceManagedUsername;
   private String _sourceManagedPassword;
   private String _sourceManagedVm;
   private String _sourceHostedType;
   private String _sourceHostedConfigFilePath;
   private String _sourceHostedPassword;
   private String _sourceHostedNetworkUsername;
   private String _sourceHostedNetworkPassword;
   private String _sourceHypervHostname;
   private int _sourceHypervPort;
   private String _sourceHypervUsername;
   private String _sourceHypervPassword;
   private String _sourceHypervVmName;
   private String _sourceHypervVmGuid;
   private String _sourceHypervThumbprint;

   // Target details
   private String _targetManagedAddress;
   private String _targetManagedThumbprint;
   private String _targetManagedUsername;
   private String _targetManagedPassword;
   private String _targetManagedHost;
   private String _targetManagedResourcePool;
   private String _targetManagedCluster;
   private String _targetManagedVmFolder;
   private String _vmName;
   private String _targetHostedDirectory;
   private String _targetHostedNetworkUsername;
   private String _targetHostedNetworkPassword;

   // Target VM attributes
   private int _vmVcpu = 0;
   private Long _vmMemory = 0L;
   private int _coresPerSocket = 0;

   // Storage parameters
   private CloningMode _cloningMode = CloningMode.Invalid;
   private String _diskControllerType;
   private boolean _optimizeAlignment = true; // Default value if not set
   private ConverterStorageParamsTargetDiskParams[] _targetDiskParams;

   // List
   private int _tasks;
   private int _jobs;

   private ConverterConnection _converterServer = null;
   private String _propertiesFile;

   /**
    * Constructor
    * @param converterServer Connection to converter server
    * @param propertiesFile Path to file with operation details
    */
   public ConverterOperation(ConverterConnection converterServer, String propertiesFile)
   {
      _converterServer = converterServer;
      _propertiesFile = propertiesFile;
   }

   /**
    * Execute the operation
    */
   public final void
      execute()
   {
      BufferedReader reader = null;

      try {
         FileReader fileReader = new FileReader(_propertiesFile);
         reader = new BufferedReader(fileReader);
         getInputFromFile(reader);
      } catch (IOException | ParseException e) {
         System.err.println("Failed to load input file " + _propertiesFile);
         System.err.println(e.getMessage());
         e.printStackTrace();
         return;
      } finally {
         if (reader != null) {
            try {
               reader.close();
            } catch (IOException e) {
            }
         }
      }

      String op = "";

      try {
         for (OperationType operation : _operations) {
            op = operation.toString();
            System.out.format("Executing operation '%1$s' from properties file '%2$s'",
               op, _propertiesFile);
            System.out.println();

            switch (operation) {
            case Convert:
               convert();
               break;

            case Reconfig:
               reconfig();
               break;

            case Synchronize:
               synchronize();
               break;

            case QuerySource:
               querySource();
               break;

            case GetDefaults:
               getDefaults();
               break;

            case List:
               list();
               break;

            default:
               assert false : "Invalid operation";
               break;
            }
         }
      } catch (Exception e) {
         System.out.format("Failed to execute operation '%1$s' from file '%2$s'",
            op, _propertiesFile);
         System.err.println();
         System.err.println(e.getMessage());
         e.printStackTrace();
      }
   }

   /**
    * Parse the properties file and saves its data to member variables
    * @param propertiesFile
    * @return
    * @throws IOException
    * @throws FileNotFoundException
    * @throws ParseException
    */
   private void
      getInputFromFile(BufferedReader reader) throws FileNotFoundException,
                                             IOException,
                                             ParseException
   {
      assert (reader != null) : "Reader is null!";

      for (String readLine = reader.readLine(); readLine != null; readLine =
         reader.readLine()) {
         // Remove comments
         if (readLine.contains(";")) {
            readLine = readLine.substring(0, readLine.indexOf(';'));
         }

         readLine = readLine.trim();

         if (Common.isNullOrEmpty(readLine)) {
            continue;
         }

         String[] props = readLine.split("[=#]", -1);

         switch (props[0]) {
         case "operation.count":
            if (!Common.isNullOrEmpty(props[1])) {
               int count = Integer.parseInt(props[1]);
               _operations = new OperationType[count];
            }
            break;
         case "operation":
            if (!Common.isNullOrEmpty(props[2])) {
               int op = Integer.parseInt(props[1]);
               if (_operations != null && op < _operations.length) {
                  _operations[op] = OperationType.valueOf(props[2]);
               }
            }
            break;

         case "job.id":
            if (!Common.isNullOrEmpty(props[1])) {
               _jobId = Integer.parseInt(props[1]);
            }
            break;
         case "job.sync":
            if (!Common.isNullOrEmpty(props[1])) {
               _jobSync = Boolean.parseBoolean(props[1]);
            }
            break;
         case "job.sync.start":
            if (!Common.isNullOrEmpty(props[1])) {
               _jobSyncStart =
                  DateFormat.getDateInstance(DateFormat.SHORT, Locale.US).parse(props[1]);
            }
            break;
         case "job.sync.finalize":
            if (!Common.isNullOrEmpty(props[1])) {
               _jobSyncFinalize = Boolean.parseBoolean(props[1]);
            }
            break;

         case "source.type":
            if (!Common.isNullOrEmpty(props[1])) {
               _sourceType = SourceType.valueOf(props[1]);
            }
            break;
         case "source.physical.address":
            _sourcePhysAddress = props[1];
            break;
         case "source.physical.username":
            _sourcePhysUsername = props[1];
            break;
         case "source.physical.password":
            _sourcePhysPassword = props[1];
            break;
         case "source.physical.ostype":
            if (!Common.isNullOrEmpty(props[1])) {
               _sourcePhysOsType = OsType.valueOf(props[1]);
            }
            break;
         case "source.physical.agentport":
            if (!Common.isNullOrEmpty(props[1])) {
               _sourcePhysAgentPort = Integer.parseInt(props[1]);
            }
            break;
         case "source.physical.thumbprint":
            _sourcePhysThumbprint = props[1];
            break;
         case "source.physical.reboot":
            if (!Common.isNullOrEmpty(props[1])) {
               _sourcePhysReboot = Boolean.parseBoolean(props[1]);
            }
            break;
         case "source.managed.address":
            _sourceManagedAddress = props[1];
            break;
         case "source.managed.thumbprint":
            _sourceManagedThumbprint = props[1];
            break;
         case "source.managed.username":
            _sourceManagedUsername = props[1];
            break;
         case "source.managed.password":
            _sourceManagedPassword = props[1];
            break;
         case "source.managed.vm":
            _sourceManagedVm = props[1];
            break;
         case "source.hosted.type":
            _sourceHostedType = props[1];
            break;
         case "source.hosted.configfilepath":
            _sourceHostedConfigFilePath = props[1];
            break;
         case "source.hosted.password":
            _sourceHostedPassword = props[1];
            break;
         case "source.hosted.networkusername":
            _sourceHostedNetworkUsername = props[1];
            break;
         case "source.hosted.networkpassword":
            _sourceHostedNetworkPassword = props[1];
            break;
         case "source.hyperv.hostname":
            _sourceHypervHostname = props[1];
            break;
         case "source.hyperv.port":
            if (!Common.isNullOrEmpty(props[1])) {
               _sourceHypervPort = Integer.parseInt(props[1]);
            }
            break;
         case "source.hyperv.username":
            _sourceHypervUsername = props[1];
            break;
         case "source.hyperv.password":
            _sourceHypervPassword = props[1];
            break;
         case "source.hyperv.vmname":
            _sourceHypervVmName = props[1];
            break;
         case "source.hyperv.vmguid":
            _sourceHypervVmGuid = props[1];
            break;
         case "source.hyperv.thumbprint":
            _sourceHypervThumbprint = props[1];
            break;

         case "target.type":
            if (!Common.isNullOrEmpty(props[1])) {
               _targetType = TargetType.valueOf(props[1]);
            }
            break;
         case "target.managed.address":
            _targetManagedAddress = props[1];
            break;
         case "target.managed.thumbprint":
            _targetManagedThumbprint = props[1];
            break;
         case "target.managed.username":
            _targetManagedUsername = props[1];
            break;
         case "target.managed.password":
            _targetManagedPassword = props[1];
            break;
         case "target.managed.host":
            _targetManagedHost = props[1];
            break;
         case "target.managed.resourcepool":
            _targetManagedResourcePool = props[1];
            break;
         case "target.managed.cluster":
            _targetManagedCluster = props[1];
            break;
         case "target.managed.vmfolder":
            _targetManagedVmFolder = props[1];
            break;

         case "target.hosted.directory":
            _targetHostedDirectory = props[1];
            break;
         case "target.hosted.networkusername":
            _targetHostedNetworkUsername = props[1];
            break;
         case "target.hosted.networkpassword":
            _targetHostedNetworkPassword = props[1];
            break;

         case "vmtocreate.name":
            _vmName = props[1];
            break;
         case "vmtocreate.vcpu":
            if (!Common.isNullOrEmpty(props[1])) {
               _vmVcpu = Integer.parseInt(props[1]);
            }
            break;
         case "vmtocreate.corespersocket":
            if (!Common.isNullOrEmpty(props[1])) {
               _coresPerSocket = Integer.parseInt(props[1]);
            }
            break;
         case "vmtocreate.memory":
            if (!Common.isNullOrEmpty(props[1])) {
               _vmMemory = Long.parseLong(props[1]);
            }
            break;

         case "storage.cloningmode":
            if (!Common.isNullOrEmpty(props[1])) {
               _cloningMode = CloningMode.valueOf(props[1]);
            }
            break;
         case "storage.diskcontrollertype":
            _diskControllerType = props[1];
            break;

         case "storage.optimizealignment":
            if (!Common.isNullOrEmpty(props[1])) {
               _optimizeAlignment = Boolean.parseBoolean(props[1]);
            }
            break;

         case "storage.targetdisk.count":
            if (!Common.isNullOrEmpty(props[1])) {
               int count = Integer.parseInt(props[1]);
               switch (_targetType) {
               case Hosted:
                  _targetDiskParams =
                     new ConverterStorageParamsHostedTargetDiskParams[count];
                  for (int i = 0; i < count; ++i) {
                     _targetDiskParams[i] =
                        new ConverterStorageParamsHostedTargetDiskParams();
                  }
                  break;

               case Managed:
                  _targetDiskParams =
                     new ConverterStorageParamsManagedTargetDiskParams[count];
                  for (int i = 0; i < count; ++i) {
                     _targetDiskParams[i] =
                        new ConverterStorageParamsManagedTargetDiskParams();
                  }
                  break;

               default:
                  throw new ParseException("Invalid target type", 0);
               }
            }
            break;

         case "storage.targetdisk.sourcediskid":
            if (!Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length) {
                  _targetDiskParams[disk].setSourceDiskId(props[2]);
               }
            }
            break;

         case "storage.targetdisk.disktype":
            if (!Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length) {
                  _targetDiskParams[disk].setDiskType(props[2]);
               }
            }
            break;

         case "storage.targetdisk.lvg":
            if (!Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length) {
                  _targetDiskParams[disk].setLvg(Boolean.parseBoolean(props[2]));
               }
            }
            break;

         case "storage.targetdisk.gpt":
            if (!Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length) {
                  _targetDiskParams[disk].setGpt(Boolean.parseBoolean(props[2]));
               }
            }
            break;

         case "storage.targetdisk.datastore":
            if (_targetType == TargetType.Managed && !Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length) {
                  ConverterStorageParamsManagedTargetDiskParams diskParams =
                     (ConverterStorageParamsManagedTargetDiskParams)_targetDiskParams[disk];
                  diskParams.setDatastoreName(props[2]);
               }
            }
            break;

         case "storage.targetdisk.volumestoclone.count":
            if (!Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length) {
                  int count = Integer.parseInt(props[2]);
                  _targetDiskParams[disk]
                     .setVolumesToClone(new ConverterStorageParamsVolumeCloningParams[count]);
                  for (int i = 0; i < count; ++i) {
                     _targetDiskParams[disk].getVolumesToClone()[i] =
                        new ConverterStorageParamsVolumeCloningParams();
                  }
               }
            }
            break;

         case "storage.targetdisk.volumestoclone.sourcevolumeid":
            if (!Common.isNullOrEmpty(props[2])) {
               int disk = Integer.parseInt(props[1]);
               int vol = Integer.parseInt(props[2]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length
                  && _targetDiskParams[disk].getVolumesToClone() != null
                  && vol < _targetDiskParams[disk].getVolumesToClone().length) {
                  _targetDiskParams[disk].getVolumesToClone()[vol]
                     .setSourceVolumeId(props[3]);
                  // sourceVolumeId may contain '='
                  if (props.length == 5) {
                     String volId =
                        _targetDiskParams[disk].getVolumesToClone()[vol]
                           .getSourceVolumeId();
                     _targetDiskParams[disk].getVolumesToClone()[vol]
                        .setSourceVolumeId(volId + "=" + props[4]);
                  }
               }
            }
            break;

         case "storage.targetdisk.volumestoclone.resize":
            if (!Common.isNullOrEmpty(props[3])) {
               int disk = Integer.parseInt(props[1]);
               int vol = Integer.parseInt(props[2]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length
                  && _targetDiskParams[disk].getVolumesToClone() != null
                  && vol < _targetDiskParams[disk].getVolumesToClone().length) {
                  _targetDiskParams[disk].getVolumesToClone()[vol].setResize(Boolean
                     .parseBoolean(props[3]));
               }
            }
            break;

         case "storage.targetdisk.volumestoclone.newcapacityinbytes":
            if (!Common.isNullOrEmpty(props[3])) {
               int disk = Integer.parseInt(props[1]);
               int vol = Integer.parseInt(props[2]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length
                  && _targetDiskParams[disk].getVolumesToClone() != null
                  && vol < _targetDiskParams[disk].getVolumesToClone().length) {
                  _targetDiskParams[disk].getVolumesToClone()[vol]
                     .setNewCapacityInBytes(Long.parseLong(props[3]));
               }
            }
            break;

         case "storage.targetdisk.volumestoclone.newclustersizeinbytes":
            if (!Common.isNullOrEmpty(props[3])) {
               int disk = Integer.parseInt(props[1]);
               int vol = Integer.parseInt(props[2]);
               if (_targetDiskParams != null && disk < _targetDiskParams.length
                  && _targetDiskParams[disk].getVolumesToClone() != null
                  && vol < _targetDiskParams[disk].getVolumesToClone().length) {
                  _targetDiskParams[disk].getVolumesToClone()[vol]
                     .setNewClusterSizeInBytes(Long.parseLong(props[3]));
               }
            }
            break;

         case "list.tasks":
            if (!Common.isNullOrEmpty(props[1])) {
               _tasks = Integer.parseInt(props[1]);
            }
            break;

         case "list.jobs":
            if (!Common.isNullOrEmpty(props[1])) {
               _jobs = Integer.parseInt(props[1]);
            }
            break;

         default:
            throw new ParseException("Unknown property: " + props[0], 0);
         }
      }
   }

   /**
    * Conversion operation. The most usual Converter operation - converts a
    * source to a destination machine. May also install converter agent on the
    * source machine.
    * @throws InterruptedException
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidLogin
    */
   private void
      convert() throws InvalidLogin,
               RuntimeFault,
               RemoteException,
               InterruptedException
   {
      if (_sourceType == SourceType.Physical && _sourcePhysOsType == OsType.windowsOs
         && _sourcePhysAgentPort > 0) {

         ConverterComputerSpecLiveComputerLocation liveComputerLocation =
            buildLiveSourceLocation(_sourcePhysAddress, _sourcePhysUsername,
               _sourcePhysPassword, OsType.windowsOs, _sourcePhysThumbprint);

         _converterServer.installAgent(liveComputerLocation, _sourcePhysAgentPort,
            !_sourcePhysReboot);

         // Update source thumbprint with the one from agent install
         SetSourceThumbprint(Common.getThumbprint(liveComputerLocation));
      }

      ConverterServerConversionConversionJobSpec jobSpec = buildConversionJobSpec(false);
      assert (jobSpec != null);

      ConverterServerConversionConversionJobInfo jobInfo =
         _converterServer.submitJob(jobSpec);

      if (jobInfo == null) {
         throw new RemoteException("Failed to submit Conversion Job.");
      }

      System.out.format("Conversion Job Id = %1$s created sucessfully." + "\r\n",
         jobInfo.getKey());
   }

   /**
    * Reconfiguration operation. Reconfigures a virtual machine.
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidLogin
    * @throws InvalidState
    * @throws InvalidName
    * @throws DuplicateName
    */
   private void
      reconfig() throws DuplicateName,
                InvalidName,
                InvalidState,
                InvalidLogin,
                RuntimeFault,
                RemoteException
   {
      ConverterServerConversionConversionJobSpec jobSpec = buildConversionJobSpec(true);
      assert (jobSpec != null);

      ConverterServerConversionConversionJobInfo jobInfo =
         _converterServer.submitJob(jobSpec);

      if (jobInfo == null) {
         throw new RemoteException("Failed to submit Reconfig Job.");
      }

      System.out.format("Conversion Job Id = %1$s created sucessfully." + "\r\n",
         jobInfo.getKey());
   }

   /**
    * Synchronization operation. Starts an incremental update of a
    * synchronizable job.
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidState
    */
   private void
      synchronize() throws InvalidState,
                   RuntimeFault,
                   RemoteException
   {
      // Reschedule or start an incremental task for a synchronizable Windows
      // P2V job.
      ConverterServerConversionConversionParamsUpdateSpec newParams =
         new ConverterServerConversionConversionParamsUpdateSpec();
      Calendar cal = Calendar.getInstance();
      if (_jobSyncStart.getTime() != 0) {
         cal.setTime(_jobSyncStart);
         newParams.setSynchronizationStartTime(cal);
      } else {
         cal.setTime(new Date());
         newParams.setSynchronizationStartTime(cal);
      }
      newParams.setDoFinalize(_jobSyncFinalize);

      ConverterConversionParams convParams =
         _converterServer.updateJob(_jobId, newParams);

      if (convParams == null) {
         throw new RemoteException("Failed to update Conversion Job.");
      }
   }

   /**
    * Queries the source info and dumps it to the console.
    * @throws RemoteException
    * @throws VimFault
    * @throws RuntimeFault
    */
   private void
      querySource() throws RuntimeFault,
                   VimFault,
                   RemoteException
   {
      ConverterComputerSpec sourceSpec = buildSourceSpec();
      assert (sourceSpec != null);

      ConverterComputerInfo info = _converterServer.querySource(sourceSpec);

      if (info == null) {
         throw new RemoteException("Failed to query source.");
      }

      String dump = Common.dump(info);
      System.out.println(dump);

      // Cache thumbprint
      SetSourceThumbprint(Common.getThumbprint(sourceSpec.getLocation()));
   }

   /**
    * Dumps various default cloning parameters. May fail the source against
    * target location validation, in which case it will not return the defaults.
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidLogin
    */
   private void
      getDefaults() throws InvalidLogin,
                   RuntimeFault,
                   RemoteException
   {
      ConverterComputerSpec sourceSpec = buildSourceSpec();
      assert (sourceSpec != null);
      ConverterTargetVmSpec targetSpec = buildTargetVMSpec();
      assert (targetSpec != null);

      ConverterDefaultConversionParamsResult result =
         _converterServer.validateTargetAndGetDefaults(sourceSpec, targetSpec);

      if (result == null) {
         throw new RemoteException("Failed to validate target and get defaults.");
      }

      String dump = Common.dump(result);
      System.out.println(dump);

      // Cache thumbprints
      SetSourceThumbprint(Common.getThumbprint(sourceSpec.getLocation()));
      SetTargetThumbprint(Common.getThumbprint(targetSpec.getLocation()));
   }

   /**
    * Dumps the last tasks and jobs to the console
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidState
    */
   private void
      list() throws InvalidState,
            RuntimeFault,
            RemoteException
   {
      String dump;

      if (_tasks > 0) {
         ConverterTaskInfo[] taskInfo = _converterServer.getTaskHistory(_tasks);

         if (taskInfo == null) {
            throw new RemoteException("Failed to get tasks history.");
         }

         dump = Common.dump(taskInfo);
         System.out.println(dump);
      }

      if (_jobs > 0) {
         ConverterServerConversionConversionJobInfo[] jobInfo =
            _converterServer.getJobHistory(_jobs);

         if (jobInfo == null) {
            throw new RemoteException("Failed to get jobs history.");
         }

         dump = Common.dump(jobInfo);
         System.out.println(dump);
      }
   }

   /**
    * Creates a computer location object for a live (powered on) source machine
    * Converter treats any live machine as physical though it might be a powered
    * on virtual machine.
    * @param sourceName Name or IP address of the machine
    * @param sourceUsername Administrative user name to log in
    * @param sourcePassword Password to log in
    * @param osType OS type - Windows or Linux
    * @param sslThumbprint Optional SSL thumbprint of converter agent (for
    *           Windows machines)
    * @return The location object
    */
   private static ConverterComputerSpecLiveComputerLocation
      buildLiveSourceLocation(String sourceName,
         String sourceUsername,
         String sourcePassword,
         OsType osType,
         String sslThumbprint)
   {
      ConverterComputerSpecLiveComputerLocation liveSourceLocation =
         new ConverterComputerSpecLiveComputerLocation();
      liveSourceLocation.setHostname(sourceName);
      liveSourceLocation.setUsername(sourceUsername);
      liveSourceLocation.setPassword(sourcePassword);
      liveSourceLocation.setOsType(osType.toString());
      liveSourceLocation.setVerifyPeer(null); // Do not specify
      liveSourceLocation.setSslThumbprint(sslThumbprint);

      return liveSourceLocation;
   }

   /**
    * Creates a object for connection to vSphere host (ESXi or VCenter server)
    * @param hostname Name or IP address of the host
    * @param username User name to log in
    * @param password Password to log in
    * @param thumbprint Optional SSL thumbprint
    * @return
    */
   private static ConverterVimConnectionSpec
      buildVimConnectionSpec(String hostname,
         String username,
         String password,
         String thumbprint)
   {
      ConverterVimConnectionSpecLoginVimCredentials vimCredentials =
         new ConverterVimConnectionSpecLoginVimCredentials();
      vimCredentials.setPassword(password);
      vimCredentials.setUsername(username);

      ConverterVimConnectionSpec vimConnectionSpec = new ConverterVimConnectionSpec();
      vimConnectionSpec.setHostname(hostname);
      vimConnectionSpec.setCredentials(vimCredentials);
      vimConnectionSpec.setVerifyPeer(null); // Do not specify
      vimConnectionSpec.setSslThumbprint(thumbprint);

      return vimConnectionSpec;
   }

   /**
    * Creates a spec object for conversion. This is the object with which
    * conversion can be started
    * @param reconfigOnly Whether it is a conversion or reconfig job
    * @return The spec object
    */
   private ConverterServerConversionConversionJobSpec
      buildConversionJobSpec(boolean reconfigOnly)
   {
      ConverterServerConversionConversionJobSpec jobSpec =
         new ConverterServerConversionConversionJobSpec();
      jobSpec.setName(reconfigOnly ? "Reconfig" : "Convert");
      jobSpec.setFirstRun(null); // Do not specify
      jobSpec.setStartSuspended(null); // Do not specify
      jobSpec.setSource(buildSourceSpec());
      jobSpec.setConversionParams(buildConversionParams(reconfigOnly));
      jobSpec
         .setP2VSourceModificationSpec(new ConverterServerConversionP2VSourceModificationSpec());

      // Synchronization is applicable only to Windows P2V
      if (_sourceType == SourceType.Physical && _sourcePhysOsType == OsType.windowsOs
         && _jobSync) {
         if (_jobSyncStart.getTime() != 0) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(_jobSyncStart);
            jobSpec.setSynchronizeImmediately(false);
            jobSpec.setSynchronizationStartTime(cal);
         } else {
            jobSpec.setSynchronizeImmediately(true);
         }
      }

      return jobSpec;
   }

   /**
    * Create a computer spec object for the source of conversion
    * reconfiguration, query, or getting defaults.
    * @return
    */
   private ConverterComputerSpec
      buildSourceSpec()
   {
      ConverterComputerSpec sourceSpec = new ConverterComputerSpec();

      switch (_sourceType) {
      case Physical:
         sourceSpec.setLocation(buildLiveSourceLocation(_sourcePhysAddress,
            _sourcePhysUsername, _sourcePhysPassword, _sourcePhysOsType,
            _sourcePhysThumbprint));
         break;
      case Managed:
         sourceSpec.setLocation(buildManagedSourceLocation());
         break;
      case Hosted:
         sourceSpec.setLocation(buildHostedSourceLocation());
         break;
      case HyperV:
         sourceSpec.setLocation(buildHypervSourceLocation());
         break;
      default:
         assert false : "Invalid source type";
         break;
      }

      return sourceSpec;
   }

   /**
    * Create an object with conversion parameters. This is the most essential
    * part of a conversion job.
    * @return
    */
   private ConverterConversionParams
      buildConversionParams(boolean reconfigOnly)
   {
      ConverterConversionParams conversionParams = new ConverterConversionParams();

      if (reconfigOnly) {
         conversionParams.setDoClone(false);
      } else {
         conversionParams.setDoClone(true);
         conversionParams.setCloningParams(buildCloningParams());
      }

      conversionParams.setDoReconfig(true);
      // Possible addition:
      // Create reconfiguration parameters for changing service states
      conversionParams.setReconfigParams(null);

      // For installing VMware Tools
      // Applicable to Windows only; check reconfiguration capabilities
      conversionParams.setDoInstallTools(false);

      // Possible addition:
      // Create conversionParams.customizationParams.specification
      // to customize the resulting VM
      // Applicable to Windows only; check reconfiguration capabilities
      conversionParams.setDoCustomize(false);
      conversionParams.setCustomizationParams(null);

      // Possible addition: specify if needed.
      conversionParams.setDoUninstallAgent(null);
      conversionParams.setPowerOnTargetVM(null);
      conversionParams.setRemoveRestoreCheckpoints(null);

      // Applicable only to Linux P2V
      if (_sourceType == SourceType.Physical && _sourcePhysOsType == OsType.linuxOs) {
         // Possible addition:
         // Create helper network params to change default helper network
         // setting
         conversionParams.setHelperVmNetworkParams(null);
      }

      // Possible addition:
      // Create throttling parameters to throttle the cloning
      conversionParams.setThrottlingParams(null);

      return conversionParams;
   }

   /**
    * Create an object with cloning parameters. Part of conversion parameters.
    * @return
    */
   private ConverterCloningParams
      buildCloningParams()
   {
      ConverterCloningParams cloningParams = new ConverterCloningParams();

      cloningParams.setTarget(buildTargetVMSpec());
      cloningParams.setStorageParams(buildStorageParams());
      cloningParams.setBasicHardwareParams(buildBasicHardwareParams());
      // Possible addition:
      // Set to customize network settings
      cloningParams.setNetworkParams(null);

      // Synchronization settings are applicable only to Windows P2V
      if (_sourceType == SourceType.Physical && _sourcePhysOsType == OsType.windowsOs) {
         cloningParams.setDoSynchronize(_jobSync);

         if (_jobSync) {
            cloningParams.setDoFinalize(_jobSyncFinalize);
         }

         // Possible addition:
         // Set to stop services before final sync
         cloningParams.setServicesToSuspend(null);
      }

      return cloningParams;
   }

   /**
    * Create an object with hardware parameters. Part of cloning parameters.
    * @return
    */
   private ConverterBasicHardwareParams
      buildBasicHardwareParams()
   {
      ConverterBasicHardwareParams hardwareParams = new ConverterBasicHardwareParams();

      if (_vmVcpu > 0) {
         hardwareParams.setNumCPUs(_vmVcpu);
      }

      if (_coresPerSocket > 0) {
         hardwareParams.setNumCoresPerSocket(_coresPerSocket);
      }

      if (_vmMemory > 0) {
         hardwareParams.setMemoryMB(_vmMemory);
      }

      return hardwareParams;
   }

   /**
    * Create an object with storage parameters. Part of cloning parameters.
    * @return
    */
   private ConverterStorageParams
      buildStorageParams()
   {
      ConverterStorageParams converterStorageParams = new ConverterStorageParams();
      converterStorageParams.setCloningMode(_cloningMode.toString());
      if (!Common.isNullOrEmpty(_diskControllerType)) {
         converterStorageParams.setDiskControllerType(_diskControllerType);
      }
      converterStorageParams.setTargetDiskParams(_targetDiskParams);
      converterStorageParams.setOptimizedPartitionAlignment(_optimizeAlignment);

      return converterStorageParams;
   }

   /**
    * Create an object specifying the destination VM. Part of cloning
    * parameters.
    * @return
    */
   private ConverterTargetVmSpec
      buildTargetVMSpec()
   {
      ConverterTargetVmSpec targetVMSpec = new ConverterTargetVmSpec();
      targetVMSpec.setName(_vmName);

      switch (_targetType) {
      case Managed:
         ConverterTargetVmSpecManagedVmLocation managedVMLocation =
            new ConverterTargetVmSpecManagedVmLocation();
         managedVMLocation.setVimConnect(buildVimConnectionSpec(_targetManagedAddress,
            _targetManagedUsername, _targetManagedPassword, _targetManagedThumbprint));
         if (!Common.isNullOrEmpty(_targetManagedHost)) {
            ManagedObjectReference mor = new ManagedObjectReference();
            mor.setType("HostSystem");
            mor.set_value(_targetManagedHost);
            managedVMLocation.setHost(mor);
         }
         if (!Common.isNullOrEmpty(_targetManagedResourcePool)) {
            ManagedObjectReference mor = new ManagedObjectReference();
            mor.setType("ResourcePool");
            mor.set_value(_targetManagedResourcePool);
            managedVMLocation.setResourcePool(mor);
         }
         if (!Common.isNullOrEmpty(_targetManagedCluster)) {
            ManagedObjectReference mor = new ManagedObjectReference();
            mor.setType("ClusterComputeResource");
            mor.set_value(_targetManagedCluster);
            managedVMLocation.setComputeResource(mor);
         }
         if (!Common.isNullOrEmpty(_targetManagedVmFolder)) {
            ManagedObjectReference mor = new ManagedObjectReference();
            mor.setType("Folder");
            mor.set_value(_targetManagedVmFolder);
            managedVMLocation.setVmFolder(mor);
         }
         targetVMSpec.setLocation(managedVMLocation);
         // Possible addition:
         // Set for using a specific hardware version
         targetVMSpec.setHardwareVersion(null); // Use target default
         break;

      case Hosted:
         ConverterTargetVmSpecHostedVmLocation hostedVMLocation =
            new ConverterTargetVmSpecHostedVmLocation();
         hostedVMLocation.setDirectory(_targetHostedDirectory);
         if (!Common.isNullOrEmpty(_targetHostedNetworkUsername)) {
            hostedVMLocation.setNetworkUsername(_targetHostedNetworkUsername);
         }
         if (!Common.isNullOrEmpty(_targetHostedNetworkPassword)) {
            hostedVMLocation.setNetworkPassword(_targetHostedNetworkPassword);
         }
         targetVMSpec.setLocation(hostedVMLocation);
         // Change for other product versions.
         // Currently supported:
         // workstation10x, workstation11x,
         // player6x, player7x,
         // fusion6x, fusion7x
         targetVMSpec.setProductVersion("workstation11x");
         break;

      default:
         assert false : "Invalid target type";
         break;
      }

      return targetVMSpec;
   }

   /**
    * Create an object specifying a powered off managed VMware (ESX or vCenter
    * server) virtual source machine.
    * @return
    */
   private ConverterComputerSpecManagedVmLocation
      buildManagedSourceLocation()
   {
      ConverterComputerSpecManagedVmLocation managedVmLocation =
         new ConverterComputerSpecManagedVmLocation();
      managedVmLocation.setVimConnect(buildVimConnectionSpec(_sourceManagedAddress,
         _sourceManagedUsername, _sourceManagedPassword, _sourceManagedThumbprint));

      ManagedObjectReference morVm = new ManagedObjectReference();
      morVm.setType("VirtualMachine");
      morVm.set_value(_sourceManagedVm);

      managedVmLocation.setVm(morVm);

      return managedVmLocation;
   }

   /**
    * Create an object specifying a hosted source machine. It can be one of:
    * powered off hosted VMware (Workstation, Player, Fusion) virtual source
    * machine; VMware backup; third party image
    * @return
    */
   private ConverterComputerSpecHostedVmLocation
      buildHostedSourceLocation()
   {
      ConverterComputerSpecHostedVmLocation hostedVmLocation = null;

      if (_sourceHostedType.equals("vmwareVM")) {
         // VNware hosted VM
         hostedVmLocation = new ConverterComputerSpecVMwareHostedVmLocation();
      } else {
         // Third party image or VMware backup
         hostedVmLocation = new ConverterComputerSpecHostedVmLocation();
      }

      hostedVmLocation.setType(_sourceHostedType);
      hostedVmLocation.setConfigFilePath(_sourceHostedConfigFilePath);
      if (!Common.isNullOrEmpty(_sourceHostedPassword)) {
         hostedVmLocation.setPassword(_sourceHostedPassword);
      }
      if (!Common.isNullOrEmpty(_sourceHostedNetworkUsername)) {
         hostedVmLocation.setNetworkUsername(_sourceHostedNetworkUsername);
      }
      if (!Common.isNullOrEmpty(_sourceHostedNetworkPassword)) {
         hostedVmLocation.setNetworkPassword(_sourceHostedNetworkPassword);
      }

      return hostedVmLocation;
   }

   /**
    * Create an object specifying a powered off Hyper-V virtual source machine.
    * @return
    */
   private ConverterComputerSpecHyperVComputerLocation
      buildHypervSourceLocation()
   {
      ConverterComputerSpecHyperVComputerLocation hyperVLocation =
         new ConverterComputerSpecHyperVComputerLocation();

      hyperVLocation.setHostname(_sourceHypervHostname);
      if (_sourceHypervPort > 0) {
         hyperVLocation.setPort(_sourceHypervPort);
      }
      if (!Common.isNullOrEmpty(_sourceHypervUsername)) {
         hyperVLocation.setUsername(_sourceHypervUsername);
      }
      if (!Common.isNullOrEmpty(_sourceHypervPassword)) {
         hyperVLocation.setPassword(_sourceHypervPassword);
      }
      if (!Common.isNullOrEmpty(_sourceHypervVmName)) {
         hyperVLocation.setVmName(_sourceHypervVmName);
      }
      hyperVLocation.setVmGUID(_sourceHypervVmGuid);
      hyperVLocation.setVerifyPeer(null); // Do not specify
      hyperVLocation.setSslThumbprint(_sourceHypervThumbprint);

      return hyperVLocation;
   }

   /**
    * Cache the source machine SSL thumbprint
    * @param thumbprint
    */
   private void
      SetSourceThumbprint(String thumbprint)
   {
      // Cache thumbprint from source
      switch (_sourceType) {
      case Physical:
         _sourcePhysThumbprint = thumbprint;
         break;

      case Managed:
         _sourceManagedThumbprint = thumbprint;
         break;

      case HyperV:
         _sourceHypervThumbprint = thumbprint;
         break;

      default:
         // Nothing to cache for hosted
      }
   }

   /**
    * Cache the destination host SSL thumbprint
    * @param thumbprint
    */
   private void
      SetTargetThumbprint(String thumbprint)
   {
      // Cache thumbprint from destination.
      switch (_targetType) {
      case Managed:
         _targetManagedThumbprint = thumbprint;
         break;

      default:
         // Nothing to cache for hosted
      }
   }
}