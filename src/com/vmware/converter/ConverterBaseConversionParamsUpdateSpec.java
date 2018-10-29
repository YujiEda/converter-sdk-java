/**
 * ConverterBaseConversionParamsUpdateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBaseConversionParamsUpdateSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterReconfigParams reconfigParams;

    private java.lang.Boolean doCustomize;

    private com.vmware.converter.ConverterCustomizationParams customizationParams;

    private java.lang.Boolean doInstallTools;

    private java.lang.Boolean removeRestoreCheckpoints;

    private java.lang.String agentSslThumbprint;

    private java.lang.Boolean unsetAgentSslThumbprint;

    private com.vmware.converter.ConverterThrottlingParamsUpdateSpec throttling;

    public ConverterBaseConversionParamsUpdateSpec() {
    }

    public ConverterBaseConversionParamsUpdateSpec(
           com.vmware.converter.ConverterReconfigParams reconfigParams,
           java.lang.Boolean doCustomize,
           com.vmware.converter.ConverterCustomizationParams customizationParams,
           java.lang.Boolean doInstallTools,
           java.lang.Boolean removeRestoreCheckpoints,
           java.lang.String agentSslThumbprint,
           java.lang.Boolean unsetAgentSslThumbprint,
           com.vmware.converter.ConverterThrottlingParamsUpdateSpec throttling) {
        this.reconfigParams = reconfigParams;
        this.doCustomize = doCustomize;
        this.customizationParams = customizationParams;
        this.doInstallTools = doInstallTools;
        this.removeRestoreCheckpoints = removeRestoreCheckpoints;
        this.agentSslThumbprint = agentSslThumbprint;
        this.unsetAgentSslThumbprint = unsetAgentSslThumbprint;
        this.throttling = throttling;
    }


    /**
     * Gets the reconfigParams value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return reconfigParams
     */
    public com.vmware.converter.ConverterReconfigParams getReconfigParams() {
        return reconfigParams;
    }


    /**
     * Sets the reconfigParams value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param reconfigParams
     */
    public void setReconfigParams(com.vmware.converter.ConverterReconfigParams reconfigParams) {
        this.reconfigParams = reconfigParams;
    }


    /**
     * Gets the doCustomize value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return doCustomize
     */
    public java.lang.Boolean getDoCustomize() {
        return doCustomize;
    }


    /**
     * Sets the doCustomize value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param doCustomize
     */
    public void setDoCustomize(java.lang.Boolean doCustomize) {
        this.doCustomize = doCustomize;
    }


    /**
     * Gets the customizationParams value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return customizationParams
     */
    public com.vmware.converter.ConverterCustomizationParams getCustomizationParams() {
        return customizationParams;
    }


    /**
     * Sets the customizationParams value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param customizationParams
     */
    public void setCustomizationParams(com.vmware.converter.ConverterCustomizationParams customizationParams) {
        this.customizationParams = customizationParams;
    }


    /**
     * Gets the doInstallTools value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return doInstallTools
     */
    public java.lang.Boolean getDoInstallTools() {
        return doInstallTools;
    }


    /**
     * Sets the doInstallTools value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param doInstallTools
     */
    public void setDoInstallTools(java.lang.Boolean doInstallTools) {
        this.doInstallTools = doInstallTools;
    }


    /**
     * Gets the removeRestoreCheckpoints value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return removeRestoreCheckpoints
     */
    public java.lang.Boolean getRemoveRestoreCheckpoints() {
        return removeRestoreCheckpoints;
    }


    /**
     * Sets the removeRestoreCheckpoints value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param removeRestoreCheckpoints
     */
    public void setRemoveRestoreCheckpoints(java.lang.Boolean removeRestoreCheckpoints) {
        this.removeRestoreCheckpoints = removeRestoreCheckpoints;
    }


    /**
     * Gets the agentSslThumbprint value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return agentSslThumbprint
     */
    public java.lang.String getAgentSslThumbprint() {
        return agentSslThumbprint;
    }


    /**
     * Sets the agentSslThumbprint value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param agentSslThumbprint
     */
    public void setAgentSslThumbprint(java.lang.String agentSslThumbprint) {
        this.agentSslThumbprint = agentSslThumbprint;
    }


    /**
     * Gets the unsetAgentSslThumbprint value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return unsetAgentSslThumbprint
     */
    public java.lang.Boolean getUnsetAgentSslThumbprint() {
        return unsetAgentSslThumbprint;
    }


    /**
     * Sets the unsetAgentSslThumbprint value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param unsetAgentSslThumbprint
     */
    public void setUnsetAgentSslThumbprint(java.lang.Boolean unsetAgentSslThumbprint) {
        this.unsetAgentSslThumbprint = unsetAgentSslThumbprint;
    }


    /**
     * Gets the throttling value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @return throttling
     */
    public com.vmware.converter.ConverterThrottlingParamsUpdateSpec getThrottling() {
        return throttling;
    }


    /**
     * Sets the throttling value for this ConverterBaseConversionParamsUpdateSpec.
     * 
     * @param throttling
     */
    public void setThrottling(com.vmware.converter.ConverterThrottlingParamsUpdateSpec throttling) {
        this.throttling = throttling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBaseConversionParamsUpdateSpec)) return false;
        ConverterBaseConversionParamsUpdateSpec other = (ConverterBaseConversionParamsUpdateSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reconfigParams==null && other.getReconfigParams()==null) || 
             (this.reconfigParams!=null &&
              this.reconfigParams.equals(other.getReconfigParams()))) &&
            ((this.doCustomize==null && other.getDoCustomize()==null) || 
             (this.doCustomize!=null &&
              this.doCustomize.equals(other.getDoCustomize()))) &&
            ((this.customizationParams==null && other.getCustomizationParams()==null) || 
             (this.customizationParams!=null &&
              this.customizationParams.equals(other.getCustomizationParams()))) &&
            ((this.doInstallTools==null && other.getDoInstallTools()==null) || 
             (this.doInstallTools!=null &&
              this.doInstallTools.equals(other.getDoInstallTools()))) &&
            ((this.removeRestoreCheckpoints==null && other.getRemoveRestoreCheckpoints()==null) || 
             (this.removeRestoreCheckpoints!=null &&
              this.removeRestoreCheckpoints.equals(other.getRemoveRestoreCheckpoints()))) &&
            ((this.agentSslThumbprint==null && other.getAgentSslThumbprint()==null) || 
             (this.agentSslThumbprint!=null &&
              this.agentSslThumbprint.equals(other.getAgentSslThumbprint()))) &&
            ((this.unsetAgentSslThumbprint==null && other.getUnsetAgentSslThumbprint()==null) || 
             (this.unsetAgentSslThumbprint!=null &&
              this.unsetAgentSslThumbprint.equals(other.getUnsetAgentSslThumbprint()))) &&
            ((this.throttling==null && other.getThrottling()==null) || 
             (this.throttling!=null &&
              this.throttling.equals(other.getThrottling())));
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
        if (getReconfigParams() != null) {
            _hashCode += getReconfigParams().hashCode();
        }
        if (getDoCustomize() != null) {
            _hashCode += getDoCustomize().hashCode();
        }
        if (getCustomizationParams() != null) {
            _hashCode += getCustomizationParams().hashCode();
        }
        if (getDoInstallTools() != null) {
            _hashCode += getDoInstallTools().hashCode();
        }
        if (getRemoveRestoreCheckpoints() != null) {
            _hashCode += getRemoveRestoreCheckpoints().hashCode();
        }
        if (getAgentSslThumbprint() != null) {
            _hashCode += getAgentSslThumbprint().hashCode();
        }
        if (getUnsetAgentSslThumbprint() != null) {
            _hashCode += getUnsetAgentSslThumbprint().hashCode();
        }
        if (getThrottling() != null) {
            _hashCode += getThrottling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterBaseConversionParamsUpdateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBaseConversionParamsUpdateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconfigParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "reconfigParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("removeRestoreCheckpoints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "removeRestoreCheckpoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentSslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "agentSslThumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsetAgentSslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "unsetAgentSslThumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "throttling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterThrottlingParamsUpdateSpec"));
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
