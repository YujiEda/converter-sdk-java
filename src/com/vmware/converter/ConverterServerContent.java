/**
 * ConverterServerContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerContent  extends com.vmware.converter.ConverterServiceContent  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference agentManager;

    private com.vmware.converter.ManagedObjectReference scheduledTaskManager;

    private com.vmware.converter.ConverterServerContentVcServerInfo vcServerInfo;

    public ConverterServerContent() {
    }

    public ConverterServerContent(
           com.vmware.converter.ManagedObjectReference propertyCollector,
           com.vmware.converter.ManagedObjectReference sessionManager,
           com.vmware.converter.ManagedObjectReference eventManager,
           com.vmware.converter.ManagedObjectReference taskManager,
           com.vmware.converter.ManagedObjectReference queryManager,
           com.vmware.converter.ManagedObjectReference diagnosticManager,
           com.vmware.converter.AboutInfo about,
           com.vmware.converter.ManagedObjectReference conversionManager,
           com.vmware.converter.ManagedObjectReference agentManager,
           com.vmware.converter.ManagedObjectReference scheduledTaskManager,
           com.vmware.converter.ConverterServerContentVcServerInfo vcServerInfo) {
        super(
            propertyCollector,
            sessionManager,
            eventManager,
            taskManager,
            queryManager,
            diagnosticManager,
            about,
            conversionManager);
        this.agentManager = agentManager;
        this.scheduledTaskManager = scheduledTaskManager;
        this.vcServerInfo = vcServerInfo;
    }


    /**
     * Gets the agentManager value for this ConverterServerContent.
     * 
     * @return agentManager
     */
    public com.vmware.converter.ManagedObjectReference getAgentManager() {
        return agentManager;
    }


    /**
     * Sets the agentManager value for this ConverterServerContent.
     * 
     * @param agentManager
     */
    public void setAgentManager(com.vmware.converter.ManagedObjectReference agentManager) {
        this.agentManager = agentManager;
    }


    /**
     * Gets the scheduledTaskManager value for this ConverterServerContent.
     * 
     * @return scheduledTaskManager
     */
    public com.vmware.converter.ManagedObjectReference getScheduledTaskManager() {
        return scheduledTaskManager;
    }


    /**
     * Sets the scheduledTaskManager value for this ConverterServerContent.
     * 
     * @param scheduledTaskManager
     */
    public void setScheduledTaskManager(com.vmware.converter.ManagedObjectReference scheduledTaskManager) {
        this.scheduledTaskManager = scheduledTaskManager;
    }


    /**
     * Gets the vcServerInfo value for this ConverterServerContent.
     * 
     * @return vcServerInfo
     */
    public com.vmware.converter.ConverterServerContentVcServerInfo getVcServerInfo() {
        return vcServerInfo;
    }


    /**
     * Sets the vcServerInfo value for this ConverterServerContent.
     * 
     * @param vcServerInfo
     */
    public void setVcServerInfo(com.vmware.converter.ConverterServerContentVcServerInfo vcServerInfo) {
        this.vcServerInfo = vcServerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerContent)) return false;
        ConverterServerContent other = (ConverterServerContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agentManager==null && other.getAgentManager()==null) || 
             (this.agentManager!=null &&
              this.agentManager.equals(other.getAgentManager()))) &&
            ((this.scheduledTaskManager==null && other.getScheduledTaskManager()==null) || 
             (this.scheduledTaskManager!=null &&
              this.scheduledTaskManager.equals(other.getScheduledTaskManager()))) &&
            ((this.vcServerInfo==null && other.getVcServerInfo()==null) || 
             (this.vcServerInfo!=null &&
              this.vcServerInfo.equals(other.getVcServerInfo())));
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
        if (getAgentManager() != null) {
            _hashCode += getAgentManager().hashCode();
        }
        if (getScheduledTaskManager() != null) {
            _hashCode += getScheduledTaskManager().hashCode();
        }
        if (getVcServerInfo() != null) {
            _hashCode += getVcServerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "agentManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTaskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "scheduledTaskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcServerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vcServerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerContentVcServerInfo"));
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
