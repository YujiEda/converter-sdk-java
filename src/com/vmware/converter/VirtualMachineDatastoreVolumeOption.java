/**
 * VirtualMachineDatastoreVolumeOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineDatastoreVolumeOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String fileSystemType;

    private java.lang.Integer majorVersion;

    public VirtualMachineDatastoreVolumeOption() {
    }

    public VirtualMachineDatastoreVolumeOption(
           java.lang.String fileSystemType,
           java.lang.Integer majorVersion) {
        this.fileSystemType = fileSystemType;
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the fileSystemType value for this VirtualMachineDatastoreVolumeOption.
     * 
     * @return fileSystemType
     */
    public java.lang.String getFileSystemType() {
        return fileSystemType;
    }


    /**
     * Sets the fileSystemType value for this VirtualMachineDatastoreVolumeOption.
     * 
     * @param fileSystemType
     */
    public void setFileSystemType(java.lang.String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }


    /**
     * Gets the majorVersion value for this VirtualMachineDatastoreVolumeOption.
     * 
     * @return majorVersion
     */
    public java.lang.Integer getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this VirtualMachineDatastoreVolumeOption.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(java.lang.Integer majorVersion) {
        this.majorVersion = majorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineDatastoreVolumeOption)) return false;
        VirtualMachineDatastoreVolumeOption other = (VirtualMachineDatastoreVolumeOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fileSystemType==null && other.getFileSystemType()==null) || 
             (this.fileSystemType!=null &&
              this.fileSystemType.equals(other.getFileSystemType()))) &&
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion())));
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
        if (getFileSystemType() != null) {
            _hashCode += getFileSystemType().hashCode();
        }
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineDatastoreVolumeOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDatastoreVolumeOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSystemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileSystemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
