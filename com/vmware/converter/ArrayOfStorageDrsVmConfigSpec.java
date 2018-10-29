/**
 * ArrayOfStorageDrsVmConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfStorageDrsVmConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.StorageDrsVmConfigSpec[] storageDrsVmConfigSpec;

    public ArrayOfStorageDrsVmConfigSpec() {
    }

    public ArrayOfStorageDrsVmConfigSpec(
           com.vmware.converter.StorageDrsVmConfigSpec[] storageDrsVmConfigSpec) {
           this.storageDrsVmConfigSpec = storageDrsVmConfigSpec;
    }


    /**
     * Gets the storageDrsVmConfigSpec value for this ArrayOfStorageDrsVmConfigSpec.
     * 
     * @return storageDrsVmConfigSpec
     */
    public com.vmware.converter.StorageDrsVmConfigSpec[] getStorageDrsVmConfigSpec() {
        return storageDrsVmConfigSpec;
    }


    /**
     * Sets the storageDrsVmConfigSpec value for this ArrayOfStorageDrsVmConfigSpec.
     * 
     * @param storageDrsVmConfigSpec
     */
    public void setStorageDrsVmConfigSpec(com.vmware.converter.StorageDrsVmConfigSpec[] storageDrsVmConfigSpec) {
        this.storageDrsVmConfigSpec = storageDrsVmConfigSpec;
    }

    public com.vmware.converter.StorageDrsVmConfigSpec getStorageDrsVmConfigSpec(int i) {
        return this.storageDrsVmConfigSpec[i];
    }

    public void setStorageDrsVmConfigSpec(int i, com.vmware.converter.StorageDrsVmConfigSpec _value) {
        this.storageDrsVmConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfStorageDrsVmConfigSpec)) return false;
        ArrayOfStorageDrsVmConfigSpec other = (ArrayOfStorageDrsVmConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storageDrsVmConfigSpec==null && other.getStorageDrsVmConfigSpec()==null) || 
             (this.storageDrsVmConfigSpec!=null &&
              java.util.Arrays.equals(this.storageDrsVmConfigSpec, other.getStorageDrsVmConfigSpec())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStorageDrsVmConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorageDrsVmConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorageDrsVmConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfStorageDrsVmConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfStorageDrsVmConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageDrsVmConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "StorageDrsVmConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsVmConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
