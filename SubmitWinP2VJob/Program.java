package SubmitWinP2VJob;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Program
{
   private ConverterConnection _converterServer = null;

   /**
    * Entry point
    * @param args
    */
   public static void
      main(String[] args)
   {
      Program program = new Program();
      program.run(args);
   }

   /**
    * Run the program with the following arguments: converter server name or IP
    * address, converter server user name, converter server password, one or
    * more properties files
    * @param args
    */
   private void
      run(String[] args)
   {
      if (args.length < 4) {
         System.out.println("Missing command line arguments.");
         System.out.println("USAGE: ConverterSamples <converterServerAddress> "
            + "<userName> <password> <propertiesfile>...");
         return;
      }

      if (args[0].equals("/?")) {
         System.err.println("USAGE: ConverterSamples <converterServerAddress> "
            + "<userName> <password> <propertiesfile>...");
         return;
      }

      System.setProperty("org.apache.axis.components.net.SecureSocketFactory",
         "org.apache.axis.components.net.SunFakeTrustSocketFactory");

      _converterServer = new ConverterConnection();

      String address = "https://" + args[0] + "/converter/sdk";

      try {
         _converterServer.connect(address, args[1], args[2]);
      } catch (RemoteException | MalformedURLException | ServiceException e) {
         System.err.println("Failed to Connect to Converter Server.");
         System.err.println();
         System.err.println(e.getMessage());
         e.printStackTrace();
         return;
      }

      for (int i = 3; i < args.length; ++i) {
         ConverterOperation op = new ConverterOperation(_converterServer, args[i]);
         op.execute();
      }
   }

}