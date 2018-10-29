/**
 * ConverterParamsAgentCustomizationParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterParamsAgentCustomizationParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean doCustomize;

    private com.vmware.converter.ConverterCustomizationParams customizationParams;

    private java.lang.Boolean doInstallTools;

    private java.lang.Boolean doUninstallAgent;

    public ConverterParamsAgentCustomizationParams() {
    }

    public ConverterParamsAgentCustomizationParams(
           java.lang.Boolean doCustomize,
           com.vmware.converter.ConverterCustomizationParams customizationParams,
           java.lang.Boolean doInstallTools,
           java.lang.Boolean doUninstallAgent) {
        this.doCustomize = doCustomize;
        this.customizationParams = customizationParams;
        this.doInstallTools = doInstallTools;
        this.doUninstallAgent = doUninstallAgent;
    }


    /**
     * Gets the doCustomize value for this ConverterParamsAgentCustomizationParams.
     * 
     * @return doCustomize
     */
    public java.lang.Boolean getDoCustomize() {
        return doCustomize;
    }


    /**
     * Sets the doCustomize value for this ConverterParamsAgentCustomizationParams.
     * 
     * @param doCustomize
     */
    public void setDoCustomize(java.lang.Boolean doCustomize) {
        this.doCustomize = doCustomize;
    }


    /**
     * Gets the customizationParams value for this ConverterParamsAgentCustomizationParams.
     * 
     * @return customizationParams
     */
    public com.vmware.converter.ConverterCustomizationParams getCustomizationParams() {
        return customizationParams;
    }


    /**
     * Sets the customizationParams value for this ConverterParamsAgentCustomizationParams.
     * 
     * @param customizationParams
     */
    public void setCustomizationParams(com.vmware.converter.ConverterCustomizationParams customizationParams) {
        this.customizationParams = customizationParams;
    }


    /**
     * Gets the doInstallTools value for this ConverterParamsAgentCustomizationParams.
     * 
     * @return doInstallTools
     */
    public java.lang.Boolean getDoInstallTools() {
        return doInstallTools;
    }


    /**
     * Sets the doInstallTools value for this ConverterParamsAgentCustomizationParams.
     * 
     * @param doInstallTools
     */
    public void setDoInstallTools(java.lang.Boolean doInstallTools) {
        this.doInstallTools = doInstallTools;
    }


    /**
     * Gets the doUninstallAgent value for this ConverterParamsAgentCustomizationParams.
     * 
     * @return doUninstallAgent
     */
    public java.lang.Boolean getDoUninstallAgent() {
        return doUninstallAgent;
    }


    /**
     * Sets the doUninstallAgent value for this ConverterParamsAgentCustomizationParams.
     * 
     * @param doUninstallAgent
     */
    public void setDoUninstallAgent(java.lang.Boolean doUninstallAgent) {
        this.doUninstallAgent = doUninstallAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterParamsAgentCustomizationParams)) return false;
        ConverterParamsAgentCustomizationParams other = (ConverterParamsAgentCustomizationParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doCustomize==null && other.getDoCustomize()==null) || 
             (this.doCustomize!=null &&
              this.doCustomize.equals(other.getDoCustomize()))) &&
            ((this.customizationParams==null && other.getCustomizationParams()==null) || 
             (this.customizationParams!=null &&
              this.customizationParams.equals(other.getCustomizationParams()))) &&
            ((this.doInstallTools==null && other.getDoInstallTools()==null) || 
             (this.doInstallTools!=null &&
              this.doInstallTools.equals(other.getDoInstallTools()))) &&
            ((this.doUninstallAgent==null && other.getDoUninstallAgent()==null) || 
             (this.doUninstallAgent!=null &&
              this.doUninstallAgent.equals(other.getDoUninstallAgent())));
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
        if (getDoCustomize() != null) {
            _hashCode += getDoCustomize().hashCode();
        }
        if (getCustomizationParams() != null) {
            _hashCode += getCustomizationParams().hashCode();
        }
        if (getDoInstallTools() != null) {
            _hashCode += getDoInstallTools().hashCode();
        }
        if (getDoUninstallAgent() != null) {
            _hashCode += getDoUninstallAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterParamsAgentCustomizationParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsAgentCustomizationParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doCustomize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doCustomize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "customizationParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCustomizationParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doInstallTools");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doInstallTools"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doUninstallAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doUninstallAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
