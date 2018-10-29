/**
 * HostLowLevelProvisioningManagerFileReserveSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLowLevelProvisioningManagerFileReserveSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String baseName;

    private java.lang.String parentDir;

    private java.lang.String fileType;

    private java.lang.String storageProfile;

    public HostLowLevelProvisioningManagerFileReserveSpec() {
    }

    public HostLowLevelProvisioningManagerFileReserveSpec(
           java.lang.String baseName,
           java.lang.String parentDir,
           java.lang.String fileType,
           java.lang.String storageProfile) {
        this.baseName = baseName;
        this.parentDir = parentDir;
        this.fileType = fileType;
        this.storageProfile = storageProfile;
    }


    /**
     * Gets the baseName value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @return baseName
     */
    public java.lang.String getBaseName() {
        return baseName;
    }


    /**
     * Sets the baseName value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @param baseName
     */
    public void setBaseName(java.lang.String baseName) {
        this.baseName = baseName;
    }


    /**
     * Gets the parentDir value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @return parentDir
     */
    public java.lang.String getParentDir() {
        return parentDir;
    }


    /**
     * Sets the parentDir value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @param parentDir
     */
    public void setParentDir(java.lang.String parentDir) {
        this.parentDir = parentDir;
    }


    /**
     * Gets the fileType value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the storageProfile value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @return storageProfile
     */
    public java.lang.String getStorageProfile() {
        return storageProfile;
    }


    /**
     * Sets the storageProfile value for this HostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @param storageProfile
     */
    public void setStorageProfile(java.lang.String storageProfile) {
        this.storageProfile = storageProfile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLowLevelProvisioningManagerFileReserveSpec)) return false;
        HostLowLevelProvisioningManagerFileReserveSpec other = (HostLowLevelProvisioningManagerFileReserveSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseName==null && other.getBaseName()==null) || 
             (this.baseName!=null &&
              this.baseName.equals(other.getBaseName()))) &&
            ((this.parentDir==null && other.getParentDir()==null) || 
             (this.parentDir!=null &&
              this.parentDir.equals(other.getParentDir()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.storageProfile==null && other.getStorageProfile()==null) || 
             (this.storageProfile!=null &&
              this.storageProfile.equals(other.getStorageProfile())));
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
        if (getBaseName() != null) {
            _hashCode += getBaseName().hashCode();
        }
        if (getParentDir() != null) {
            _hashCode += getParentDir().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getStorageProfile() != null) {
            _hashCode += getStorageProfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostLowLevelProvisioningManagerFileReserveSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileReserveSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "baseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDir");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parentDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
