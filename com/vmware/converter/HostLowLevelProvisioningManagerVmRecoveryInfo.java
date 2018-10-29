/**
 * HostLowLevelProvisioningManagerVmRecoveryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLowLevelProvisioningManagerVmRecoveryInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String version;

    private java.lang.String biosUUID;

    private java.lang.String instanceUUID;

    private com.vmware.converter.FaultToleranceConfigInfo ftInfo;

    public HostLowLevelProvisioningManagerVmRecoveryInfo() {
    }

    public HostLowLevelProvisioningManagerVmRecoveryInfo(
           java.lang.String version,
           java.lang.String biosUUID,
           java.lang.String instanceUUID,
           com.vmware.converter.FaultToleranceConfigInfo ftInfo) {
        this.version = version;
        this.biosUUID = biosUUID;
        this.instanceUUID = instanceUUID;
        this.ftInfo = ftInfo;
    }


    /**
     * Gets the version value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the biosUUID value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @return biosUUID
     */
    public java.lang.String getBiosUUID() {
        return biosUUID;
    }


    /**
     * Sets the biosUUID value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @param biosUUID
     */
    public void setBiosUUID(java.lang.String biosUUID) {
        this.biosUUID = biosUUID;
    }


    /**
     * Gets the instanceUUID value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @return instanceUUID
     */
    public java.lang.String getInstanceUUID() {
        return instanceUUID;
    }


    /**
     * Sets the instanceUUID value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @param instanceUUID
     */
    public void setInstanceUUID(java.lang.String instanceUUID) {
        this.instanceUUID = instanceUUID;
    }


    /**
     * Gets the ftInfo value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @return ftInfo
     */
    public com.vmware.converter.FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }


    /**
     * Sets the ftInfo value for this HostLowLevelProvisioningManagerVmRecoveryInfo.
     * 
     * @param ftInfo
     */
    public void setFtInfo(com.vmware.converter.FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLowLevelProvisioningManagerVmRecoveryInfo)) return false;
        HostLowLevelProvisioningManagerVmRecoveryInfo other = (HostLowLevelProvisioningManagerVmRecoveryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.biosUUID==null && other.getBiosUUID()==null) || 
             (this.biosUUID!=null &&
              this.biosUUID.equals(other.getBiosUUID()))) &&
            ((this.instanceUUID==null && other.getInstanceUUID()==null) || 
             (this.instanceUUID!=null &&
              this.instanceUUID.equals(other.getInstanceUUID()))) &&
            ((this.ftInfo==null && other.getFtInfo()==null) || 
             (this.ftInfo!=null &&
              this.ftInfo.equals(other.getFtInfo())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBiosUUID() != null) {
            _hashCode += getBiosUUID().hashCode();
        }
        if (getInstanceUUID() != null) {
            _hashCode += getInstanceUUID().hashCode();
        }
        if (getFtInfo() != null) {
            _hashCode += getFtInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostLowLevelProvisioningManagerVmRecoveryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerVmRecoveryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biosUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "biosUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceConfigInfo"));
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
