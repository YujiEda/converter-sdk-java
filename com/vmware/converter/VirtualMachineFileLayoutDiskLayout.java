/**
 * VirtualMachineFileLayoutDiskLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineFileLayoutDiskLayout  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int key;

    private java.lang.String[] diskFile;

    public VirtualMachineFileLayoutDiskLayout() {
    }

    public VirtualMachineFileLayoutDiskLayout(
           int key,
           java.lang.String[] diskFile) {
        this.key = key;
        this.diskFile = diskFile;
    }


    /**
     * Gets the key value for this VirtualMachineFileLayoutDiskLayout.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this VirtualMachineFileLayoutDiskLayout.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the diskFile value for this VirtualMachineFileLayoutDiskLayout.
     * 
     * @return diskFile
     */
    public java.lang.String[] getDiskFile() {
        return diskFile;
    }


    /**
     * Sets the diskFile value for this VirtualMachineFileLayoutDiskLayout.
     * 
     * @param diskFile
     */
    public void setDiskFile(java.lang.String[] diskFile) {
        this.diskFile = diskFile;
    }

    public java.lang.String getDiskFile(int i) {
        return this.diskFile[i];
    }

    public void setDiskFile(int i, java.lang.String _value) {
        this.diskFile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFileLayoutDiskLayout)) return false;
        VirtualMachineFileLayoutDiskLayout other = (VirtualMachineFileLayoutDiskLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            ((this.diskFile==null && other.getDiskFile()==null) || 
             (this.diskFile!=null &&
              java.util.Arrays.equals(this.diskFile, other.getDiskFile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getKey();
        if (getDiskFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskFile(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineFileLayoutDiskLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutDiskLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
