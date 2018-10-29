/**
 * ClusterDasVmSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasVmSettings  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String restartPriority;

    private java.lang.String isolationResponse;

    private com.vmware.converter.ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings;

    private com.vmware.converter.ClusterVmComponentProtectionSettings vmComponentProtectionSettings;

    public ClusterDasVmSettings() {
    }

    public ClusterDasVmSettings(
           java.lang.String restartPriority,
           java.lang.String isolationResponse,
           com.vmware.converter.ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings,
           com.vmware.converter.ClusterVmComponentProtectionSettings vmComponentProtectionSettings) {
        this.restartPriority = restartPriority;
        this.isolationResponse = isolationResponse;
        this.vmToolsMonitoringSettings = vmToolsMonitoringSettings;
        this.vmComponentProtectionSettings = vmComponentProtectionSettings;
    }


    /**
     * Gets the restartPriority value for this ClusterDasVmSettings.
     * 
     * @return restartPriority
     */
    public java.lang.String getRestartPriority() {
        return restartPriority;
    }


    /**
     * Sets the restartPriority value for this ClusterDasVmSettings.
     * 
     * @param restartPriority
     */
    public void setRestartPriority(java.lang.String restartPriority) {
        this.restartPriority = restartPriority;
    }


    /**
     * Gets the isolationResponse value for this ClusterDasVmSettings.
     * 
     * @return isolationResponse
     */
    public java.lang.String getIsolationResponse() {
        return isolationResponse;
    }


    /**
     * Sets the isolationResponse value for this ClusterDasVmSettings.
     * 
     * @param isolationResponse
     */
    public void setIsolationResponse(java.lang.String isolationResponse) {
        this.isolationResponse = isolationResponse;
    }


    /**
     * Gets the vmToolsMonitoringSettings value for this ClusterDasVmSettings.
     * 
     * @return vmToolsMonitoringSettings
     */
    public com.vmware.converter.ClusterVmToolsMonitoringSettings getVmToolsMonitoringSettings() {
        return vmToolsMonitoringSettings;
    }


    /**
     * Sets the vmToolsMonitoringSettings value for this ClusterDasVmSettings.
     * 
     * @param vmToolsMonitoringSettings
     */
    public void setVmToolsMonitoringSettings(com.vmware.converter.ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings) {
        this.vmToolsMonitoringSettings = vmToolsMonitoringSettings;
    }


    /**
     * Gets the vmComponentProtectionSettings value for this ClusterDasVmSettings.
     * 
     * @return vmComponentProtectionSettings
     */
    public com.vmware.converter.ClusterVmComponentProtectionSettings getVmComponentProtectionSettings() {
        return vmComponentProtectionSettings;
    }


    /**
     * Sets the vmComponentProtectionSettings value for this ClusterDasVmSettings.
     * 
     * @param vmComponentProtectionSettings
     */
    public void setVmComponentProtectionSettings(com.vmware.converter.ClusterVmComponentProtectionSettings vmComponentProtectionSettings) {
        this.vmComponentProtectionSettings = vmComponentProtectionSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasVmSettings)) return false;
        ClusterDasVmSettings other = (ClusterDasVmSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.restartPriority==null && other.getRestartPriority()==null) || 
             (this.restartPriority!=null &&
              this.restartPriority.equals(other.getRestartPriority()))) &&
            ((this.isolationResponse==null && other.getIsolationResponse()==null) || 
             (this.isolationResponse!=null &&
              this.isolationResponse.equals(other.getIsolationResponse()))) &&
            ((this.vmToolsMonitoringSettings==null && other.getVmToolsMonitoringSettings()==null) || 
             (this.vmToolsMonitoringSettings!=null &&
              this.vmToolsMonitoringSettings.equals(other.getVmToolsMonitoringSettings()))) &&
            ((this.vmComponentProtectionSettings==null && other.getVmComponentProtectionSettings()==null) || 
             (this.vmComponentProtectionSettings!=null &&
              this.vmComponentProtectionSettings.equals(other.getVmComponentProtectionSettings())));
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
        if (getRestartPriority() != null) {
            _hashCode += getRestartPriority().hashCode();
        }
        if (getIsolationResponse() != null) {
            _hashCode += getIsolationResponse().hashCode();
        }
        if (getVmToolsMonitoringSettings() != null) {
            _hashCode += getVmToolsMonitoringSettings().hashCode();
        }
        if (getVmComponentProtectionSettings() != null) {
            _hashCode += getVmComponentProtectionSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasVmSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasVmSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restartPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "restartPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isolationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isolationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmToolsMonitoringSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmToolsMonitoringSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterVmToolsMonitoringSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmComponentProtectionSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmComponentProtectionSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterVmComponentProtectionSettings"));
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
