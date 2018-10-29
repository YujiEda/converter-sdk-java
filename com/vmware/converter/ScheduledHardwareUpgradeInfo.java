/**
 * ScheduledHardwareUpgradeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ScheduledHardwareUpgradeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String upgradePolicy;

    private java.lang.String versionKey;

    private java.lang.String scheduledHardwareUpgradeStatus;

    private com.vmware.converter.LocalizedMethodFault fault;

    public ScheduledHardwareUpgradeInfo() {
    }

    public ScheduledHardwareUpgradeInfo(
           java.lang.String upgradePolicy,
           java.lang.String versionKey,
           java.lang.String scheduledHardwareUpgradeStatus,
           com.vmware.converter.LocalizedMethodFault fault) {
        this.upgradePolicy = upgradePolicy;
        this.versionKey = versionKey;
        this.scheduledHardwareUpgradeStatus = scheduledHardwareUpgradeStatus;
        this.fault = fault;
    }


    /**
     * Gets the upgradePolicy value for this ScheduledHardwareUpgradeInfo.
     * 
     * @return upgradePolicy
     */
    public java.lang.String getUpgradePolicy() {
        return upgradePolicy;
    }


    /**
     * Sets the upgradePolicy value for this ScheduledHardwareUpgradeInfo.
     * 
     * @param upgradePolicy
     */
    public void setUpgradePolicy(java.lang.String upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
    }


    /**
     * Gets the versionKey value for this ScheduledHardwareUpgradeInfo.
     * 
     * @return versionKey
     */
    public java.lang.String getVersionKey() {
        return versionKey;
    }


    /**
     * Sets the versionKey value for this ScheduledHardwareUpgradeInfo.
     * 
     * @param versionKey
     */
    public void setVersionKey(java.lang.String versionKey) {
        this.versionKey = versionKey;
    }


    /**
     * Gets the scheduledHardwareUpgradeStatus value for this ScheduledHardwareUpgradeInfo.
     * 
     * @return scheduledHardwareUpgradeStatus
     */
    public java.lang.String getScheduledHardwareUpgradeStatus() {
        return scheduledHardwareUpgradeStatus;
    }


    /**
     * Sets the scheduledHardwareUpgradeStatus value for this ScheduledHardwareUpgradeInfo.
     * 
     * @param scheduledHardwareUpgradeStatus
     */
    public void setScheduledHardwareUpgradeStatus(java.lang.String scheduledHardwareUpgradeStatus) {
        this.scheduledHardwareUpgradeStatus = scheduledHardwareUpgradeStatus;
    }


    /**
     * Gets the fault value for this ScheduledHardwareUpgradeInfo.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this ScheduledHardwareUpgradeInfo.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledHardwareUpgradeInfo)) return false;
        ScheduledHardwareUpgradeInfo other = (ScheduledHardwareUpgradeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.upgradePolicy==null && other.getUpgradePolicy()==null) || 
             (this.upgradePolicy!=null &&
              this.upgradePolicy.equals(other.getUpgradePolicy()))) &&
            ((this.versionKey==null && other.getVersionKey()==null) || 
             (this.versionKey!=null &&
              this.versionKey.equals(other.getVersionKey()))) &&
            ((this.scheduledHardwareUpgradeStatus==null && other.getScheduledHardwareUpgradeStatus()==null) || 
             (this.scheduledHardwareUpgradeStatus!=null &&
              this.scheduledHardwareUpgradeStatus.equals(other.getScheduledHardwareUpgradeStatus()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
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
        if (getUpgradePolicy() != null) {
            _hashCode += getUpgradePolicy().hashCode();
        }
        if (getVersionKey() != null) {
            _hashCode += getVersionKey().hashCode();
        }
        if (getScheduledHardwareUpgradeStatus() != null) {
            _hashCode += getScheduledHardwareUpgradeStatus().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledHardwareUpgradeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledHardwareUpgradeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgradePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "upgradePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "versionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledHardwareUpgradeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scheduledHardwareUpgradeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
