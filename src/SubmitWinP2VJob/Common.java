package SubmitWinP2VJob;

import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.vmware.converter.*;

public class Common
{
   /**
    * Dumps a complex object's value to string This class does not provide full
    * functionality but is enough for dumping VMware data objects.
    */
   private static class Dumper
   {
      private StringBuilder _res;
      private Object _obj;
      private java.text.DateFormat _formatter;

      public Dumper(Object obj) throws IllegalArgumentException, IllegalAccessException,
         InvocationTargetException
      {
         assert(obj != null) : "obj is null";

         _obj = obj;
         _res = new StringBuilder();
         _formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      }

      public String
         dump() throws IllegalArgumentException,
               IllegalAccessException,
               InvocationTargetException
      {
         dumpImpl(_obj, _obj.getClass().getName(), "");
         return _res.toString();
      }

      private void
         dumpImpl(Object obj, String propName, String indent) throws IllegalArgumentException,
                                                             IllegalAccessException,
                                                             InvocationTargetException
      {
         if (obj == null) {
            _res.append(String.format("%1$s%2$s: <unspecified>\n", indent, propName));
            return;
         }

         java.lang.Class<?> t = obj.getClass();

         if (isPrimitive(t)) {
            _res.append(String.format("%1$s%2$s: %3$s\n", indent, propName,
               obj.toString()));
            return;
         }

         // Special treating for dates
         if (obj instanceof Calendar) {
            Calendar cal = (Calendar)obj;
            _res.append(String.format("%1$s%2$s: %3$s\n", indent, propName,
               _formatter.format(cal.getTime())));
            return;
         }

         if (obj instanceof Date) {
            Date date = (Date)obj;
            _res.append(String.format("%1$s%2$s: %3$s\n", indent, propName,
               _formatter.format(date)));
            return;
         }

         String newIndent = indent + "\t";

         if (t.isArray()) {
            for (int i = 0; i < Array.getLength(obj); ++i) {
               _res.append(String.format("%1$s%2$s:\n", indent, propName));
               String arrayPropName = String.format("#%1$s", i);
               dumpImpl(Array.get(obj, i), arrayPropName, newIndent);
            }
         } else {
            // Traverse only VMware types
            if (t.getName().startsWith("com.vmware")) {
               // Short notation for MoRefs
               if (obj instanceof ManagedObjectReference) {
                  ManagedObjectReference moRef = (ManagedObjectReference)obj;
                  _res.append(String.format("%1$s%2$s: '%3$s:%4$s'\n", indent, propName,
                     moRef.getType(), moRef.get_value()));
                  return;
               }

               _res.append(String.format("%1$s%2$s:\n", indent, propName));

               Method[] methods = t.getMethods();
               for (Method method : methods) {
                  // Traverse only accessors. Remove 'get' from their names.
                  if (method.getName().startsWith("get")
                     && method.getParameterTypes().length == 0) {
                     Object newO = method.invoke(obj);
                     dumpImpl(newO, method.getName().substring(3), newIndent);
                  }
               }
            }
         }
      }
   }

   private static boolean
      isPrimitive(java.lang.Class<?> t)
   {
      return t.isPrimitive() || t == java.lang.Boolean.class
         || t == java.lang.String.class || t == java.lang.Character.class
         || t == java.lang.Integer.class || t == java.lang.Long.class
         || t == java.lang.Short.class || t == java.lang.Byte.class
         || t == java.lang.Float.class || t == java.lang.Double.class;
   }

   /**
    * Dump an object to string. The object should be a VMware data object
    * @param o The object to dump
    * @return The string result
    */
   public static String
      dump(Object o)
   {
      Dumper dumper;
      try {
         dumper = new Dumper(o);
         return dumper.dump();
      } catch (IllegalArgumentException | IllegalAccessException
         | InvocationTargetException e) {
         System.err.println(e.getMessage());
         e.printStackTrace();
      }

      return "";
   }

   /**
    * Checks for empty string
    */
   public static boolean
      isNullOrEmpty(String s)
   {
      return s == null || s.isEmpty();
   }

   /**
    * Compares 2 strings when each can be null
    */
   public static boolean
      equals(String lhs, String rhs)
   {
      if (lhs == null && rhs == null) {
         return true;
      }

      if ((lhs == null && rhs != null) || (lhs != null && rhs == null)) {
         return false;
      }

      return lhs.equals(rhs);
   }

   /**
    * Extracts the SSL thumbprint from a location object
    * @param location The location to probe
    * @return The thumbprint
    */
   public static String
      getThumbprint(Object location)
   {
      assert location != null;

      if (location instanceof ConverterComputerSpecLiveComputerLocation) {
         // Physical source
         return ((ConverterComputerSpecLiveComputerLocation)location).getSslThumbprint();
      } else if (location instanceof ConverterComputerSpecManagedVmLocation) {
         // Managed source
         return ((ConverterComputerSpecManagedVmLocation)location).getVimConnect()
            .getSslThumbprint();
      } else if (location instanceof ConverterComputerSpecHyperVComputerLocation) {
         // Hyper-V source
         return ((ConverterComputerSpecHyperVComputerLocation)location)
            .getSslThumbprint();
      } else if (location instanceof ConverterTargetVmSpecManagedVmLocation) {
         // Managed target
         return ((ConverterTargetVmSpecManagedVmLocation)location).getVimConnect()
            .getSslThumbprint();
      } else if (location instanceof ConverterComputerSpecHostedVmLocation
         || location instanceof ConverterTargetVmSpecHostedVmLocation) {
         // Hosted source or hosted target - no thumbprint
         return null;
      } else {
         assert false : "Unexpected location type";
         return null;
      }
   }
}