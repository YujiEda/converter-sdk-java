/**
 * ConverterHelperServiceContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHelperServiceContent  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference sessionManager;

    private com.vmware.converter.ManagedObjectReference propertyCollector;

    private com.vmware.converter.ManagedObjectReference eventManager;

    private com.vmware.converter.ManagedObjectReference taskManager;

    private com.vmware.converter.ManagedObjectReference converterHelper;

    private com.vmware.converter.ManagedObjectReference diagnosticManager;

    private com.vmware.converter.AboutInfo about;

    public ConverterHelperServiceContent() {
    }

    public ConverterHelperServiceContent(
           com.vmware.converter.ManagedObjectReference sessionManager,
           com.vmware.converter.ManagedObjectReference propertyCollector,
           com.vmware.converter.ManagedObjectReference eventManager,
           com.vmware.converter.ManagedObjectReference taskManager,
           com.vmware.converter.ManagedObjectReference converterHelper,
           com.vmware.converter.ManagedObjectReference diagnosticManager,
           com.vmware.converter.AboutInfo about) {
        this.sessionManager = sessionManager;
        this.propertyCollector = propertyCollector;
        this.eventManager = eventManager;
        this.taskManager = taskManager;
        this.converterHelper = converterHelper;
        this.diagnosticManager = diagnosticManager;
        this.about = about;
    }


    /**
     * Gets the sessionManager value for this ConverterHelperServiceContent.
     * 
     * @return sessionManager
     */
    public com.vmware.converter.ManagedObjectReference getSessionManager() {
        return sessionManager;
    }


    /**
     * Sets the sessionManager value for this ConverterHelperServiceContent.
     * 
     * @param sessionManager
     */
    public void setSessionManager(com.vmware.converter.ManagedObjectReference sessionManager) {
        this.sessionManager = sessionManager;
    }


    /**
     * Gets the propertyCollector value for this ConverterHelperServiceContent.
     * 
     * @return propertyCollector
     */
    public com.vmware.converter.ManagedObjectReference getPropertyCollector() {
        return propertyCollector;
    }


    /**
     * Sets the propertyCollector value for this ConverterHelperServiceContent.
     * 
     * @param propertyCollector
     */
    public void setPropertyCollector(com.vmware.converter.ManagedObjectReference propertyCollector) {
        this.propertyCollector = propertyCollector;
    }


    /**
     * Gets the eventManager value for this ConverterHelperServiceContent.
     * 
     * @return eventManager
     */
    public com.vmware.converter.ManagedObjectReference getEventManager() {
        return eventManager;
    }


    /**
     * Sets the eventManager value for this ConverterHelperServiceContent.
     * 
     * @param eventManager
     */
    public void setEventManager(com.vmware.converter.ManagedObjectReference eventManager) {
        this.eventManager = eventManager;
    }


    /**
     * Gets the taskManager value for this ConverterHelperServiceContent.
     * 
     * @return taskManager
     */
    public com.vmware.converter.ManagedObjectReference getTaskManager() {
        return taskManager;
    }


    /**
     * Sets the taskManager value for this ConverterHelperServiceContent.
     * 
     * @param taskManager
     */
    public void setTaskManager(com.vmware.converter.ManagedObjectReference taskManager) {
        this.taskManager = taskManager;
    }


    /**
     * Gets the converterHelper value for this ConverterHelperServiceContent.
     * 
     * @return converterHelper
     */
    public com.vmware.converter.ManagedObjectReference getConverterHelper() {
        return converterHelper;
    }


    /**
     * Sets the converterHelper value for this ConverterHelperServiceContent.
     * 
     * @param converterHelper
     */
    public void setConverterHelper(com.vmware.converter.ManagedObjectReference converterHelper) {
        this.converterHelper = converterHelper;
    }


    /**
     * Gets the diagnosticManager value for this ConverterHelperServiceContent.
     * 
     * @return diagnosticManager
     */
    public com.vmware.converter.ManagedObjectReference getDiagnosticManager() {
        return diagnosticManager;
    }


    /**
     * Sets the diagnosticManager value for this ConverterHelperServiceContent.
     * 
     * @param diagnosticManager
     */
    public void setDiagnosticManager(com.vmware.converter.ManagedObjectReference diagnosticManager) {
        this.diagnosticManager = diagnosticManager;
    }


    /**
     * Gets the about value for this ConverterHelperServiceContent.
     * 
     * @return about
     */
    public com.vmware.converter.AboutInfo getAbout() {
        return about;
    }


    /**
     * Sets the about value for this ConverterHelperServiceContent.
     * 
     * @param about
     */
    public void setAbout(com.vmware.converter.AboutInfo about) {
        this.about = about;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterHelperServiceContent)) return false;
        ConverterHelperServiceContent other = (ConverterHelperServiceContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sessionManager==null && other.getSessionManager()==null) || 
             (this.sessionManager!=null &&
              this.sessionManager.equals(other.getSessionManager()))) &&
            ((this.propertyCollector==null && other.getPropertyCollector()==null) || 
             (this.propertyCollector!=null &&
              this.propertyCollector.equals(other.getPropertyCollector()))) &&
            ((this.eventManager==null && other.getEventManager()==null) || 
             (this.eventManager!=null &&
              this.eventManager.equals(other.getEventManager()))) &&
            ((this.taskManager==null && other.getTaskManager()==null) || 
             (this.taskManager!=null &&
              this.taskManager.equals(other.getTaskManager()))) &&
            ((this.converterHelper==null && other.getConverterHelper()==null) || 
             (this.converterHelper!=null &&
              this.converterHelper.equals(other.getConverterHelper()))) &&
            ((this.diagnosticManager==null && other.getDiagnosticManager()==null) || 
             (this.diagnosticManager!=null &&
              this.diagnosticManager.equals(other.getDiagnosticManager()))) &&
            ((this.about==null && other.getAbout()==null) || 
             (this.about!=null &&
              this.about.equals(other.getAbout())));
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
        if (getSessionManager() != null) {
            _hashCode += getSessionManager().hashCode();
        }
        if (getPropertyCollector() != null) {
            _hashCode += getPropertyCollector().hashCode();
        }
        if (getEventManager() != null) {
            _hashCode += getEventManager().hashCode();
        }
        if (getTaskManager() != null) {
            _hashCode += getTaskManager().hashCode();
        }
        if (getConverterHelper() != null) {
            _hashCode += getConverterHelper().hashCode();
        }
        if (getDiagnosticManager() != null) {
            _hashCode += getDiagnosticManager().hashCode();
        }
        if (getAbout() != null) {
            _hashCode += getAbout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterHelperServiceContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperServiceContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sessionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCollector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "propertyCollector"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "eventManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "taskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterHelper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "converterHelper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diagnosticManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("about");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "about"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AboutInfo"));
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
