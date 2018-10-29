/**
 * ConverterConversionParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConversionParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean doClone;

    private com.vmware.converter.ConverterCloningParams cloningParams;

    private java.lang.Boolean doReconfig;

    private com.vmware.converter.ConverterReconfigParams reconfigParams;

    private java.lang.Boolean doInstallTools;

    private java.lang.Boolean doCustomize;

    private com.vmware.converter.ConverterCustomizationParams customizationParams;

    private java.lang.Boolean doUninstallAgent;

    private java.lang.Boolean powerOnTargetVM;

    private java.lang.Boolean removeRestoreCheckpoints;

    private com.vmware.converter.ConverterHelperVmNetworkParams helperVmNetworkParams;

    private com.vmware.converter.ConverterThrottlingParams throttlingParams;

    public ConverterConversionParams() {
    }

    public ConverterConversionParams(
           java.lang.Boolean doClone,
           com.vmware.converter.ConverterCloningParams cloningParams,
           java.lang.Boolean doReconfig,
           com.vmware.converter.ConverterReconfigParams reconfigParams,
           java.lang.Boolean doInstallTools,
           java.lang.Boolean doCustomize,
           com.vmware.converter.ConverterCustomizationParams customizationParams,
           java.lang.Boolean doUninstallAgent,
           java.lang.Boolean powerOnTargetVM,
           java.lang.Boolean removeRestoreCheckpoints,
           com.vmware.converter.ConverterHelperVmNetworkParams helperVmNetworkParams,
           com.vmware.converter.ConverterThrottlingParams throttlingParams) {
        this.doClone = doClone;
        this.cloningParams = cloningParams;
        this.doReconfig = doReconfig;
        this.reconfigParams = reconfigParams;
        this.doInstallTools = doInstallTools;
        this.doCustomize = doCustomize;
        this.customizationParams = customizationParams;
        this.doUninstallAgent = doUninstallAgent;
        this.powerOnTargetVM = powerOnTargetVM;
        this.removeRestoreCheckpoints = removeRestoreCheckpoints;
        this.helperVmNetworkParams = helperVmNetworkParams;
        this.throttlingParams = throttlingParams;
    }


    /**
     * Gets the doClone value for this ConverterConversionParams.
     * 
     * @return doClone
     */
    public java.lang.Boolean getDoClone() {
        return doClone;
    }


    /**
     * Sets the doClone value for this ConverterConversionParams.
     * 
     * @param doClone
     */
    public void setDoClone(java.lang.Boolean doClone) {
        this.doClone = doClone;
    }


    /**
     * Gets the cloningParams value for this ConverterConversionParams.
     * 
     * @return cloningParams
     */
    public com.vmware.converter.ConverterCloningParams getCloningParams() {
        return cloningParams;
    }


    /**
     * Sets the cloningParams value for this ConverterConversionParams.
     * 
     * @param cloningParams
     */
    public void setCloningParams(com.vmware.converter.ConverterCloningParams cloningParams) {
        this.cloningParams = cloningParams;
    }


    /**
     * Gets the doReconfig value for this ConverterConversionParams.
     * 
     * @return doReconfig
     */
    public java.lang.Boolean getDoReconfig() {
        return doReconfig;
    }


    /**
     * Sets the doReconfig value for this ConverterConversionParams.
     * 
     * @param doReconfig
     */
    public void setDoReconfig(java.lang.Boolean doReconfig) {
        this.doReconfig = doReconfig;
    }


    /**
     * Gets the reconfigParams value for this ConverterConversionParams.
     * 
     * @return reconfigParams
     */
    public com.vmware.converter.ConverterReconfigParams getReconfigParams() {
        return reconfigParams;
    }


    /**
     * Sets the reconfigParams value for this ConverterConversionParams.
     * 
     * @param reconfigParams
     */
    public void setReconfigParams(com.vmware.converter.ConverterReconfigParams reconfigParams) {
        this.reconfigParams = reconfigParams;
    }


    /**
     * Gets the doInstallTools value for this ConverterConversionParams.
     * 
     * @return doInstallTools
     */
    public java.lang.Boolean getDoInstallTools() {
        return doInstallTools;
    }


    /**
     * Sets the doInstallTools value for this ConverterConversionParams.
     * 
     * @param doInstallTools
     */
    public void setDoInstallTools(java.lang.Boolean doInstallTools) {
        this.doInstallTools = doInstallTools;
    }


    /**
     * Gets the doCustomize value for this ConverterConversionParams.
     * 
     * @return doCustomize
     */
    public java.lang.Boolean getDoCustomize() {
        return doCustomize;
    }


    /**
     * Sets the doCustomize value for this ConverterConversionParams.
     * 
     * @param doCustomize
     */
    public void setDoCustomize(java.lang.Boolean doCustomize) {
        this.doCustomize = doCustomize;
    }


    /**
     * Gets the customizationParams value for this ConverterConversionParams.
     * 
     * @return customizationParams
     */
    public com.vmware.converter.ConverterCustomizationParams getCustomizationParams() {
        return customizationParams;
    }


    /**
     * Sets the customizationParams value for this ConverterConversionParams.
     * 
     * @param customizationParams
     */
    public void setCustomizationParams(com.vmware.converter.ConverterCustomizationParams customizationParams) {
        this.customizationParams = customizationParams;
    }


    /**
     * Gets the doUninstallAgent value for this ConverterConversionParams.
     * 
     * @return doUninstallAgent
     */
    public java.lang.Boolean getDoUninstallAgent() {
        return doUninstallAgent;
    }


    /**
     * Sets the doUninstallAgent value for this ConverterConversionParams.
     * 
     * @param doUninstallAgent
     */
    public void setDoUninstallAgent(java.lang.Boolean doUninstallAgent) {
        this.doUninstallAgent = doUninstallAgent;
    }


    /**
     * Gets the powerOnTargetVM value for this ConverterConversionParams.
     * 
     * @return powerOnTargetVM
     */
    public java.lang.Boolean getPowerOnTargetVM() {
        return powerOnTargetVM;
    }


    /**
     * Sets the powerOnTargetVM value for this ConverterConversionParams.
     * 
     * @param powerOnTargetVM
     */
    public void setPowerOnTargetVM(java.lang.Boolean powerOnTargetVM) {
        this.powerOnTargetVM = powerOnTargetVM;
    }


    /**
     * Gets the removeRestoreCheckpoints value for this ConverterConversionParams.
     * 
     * @return removeRestoreCheckpoints
     */
    public java.lang.Boolean getRemoveRestoreCheckpoints() {
        return removeRestoreCheckpoints;
    }


    /**
     * Sets the removeRestoreCheckpoints value for this ConverterConversionParams.
     * 
     * @param removeRestoreCheckpoints
     */
    public void setRemoveRestoreCheckpoints(java.lang.Boolean removeRestoreCheckpoints) {
        this.removeRestoreCheckpoints = removeRestoreCheckpoints;
    }


    /**
     * Gets the helperVmNetworkParams value for this ConverterConversionParams.
     * 
     * @return helperVmNetworkParams
     */
    public com.vmware.converter.ConverterHelperVmNetworkParams getHelperVmNetworkParams() {
        return helperVmNetworkParams;
    }


    /**
     * Sets the helperVmNetworkParams value for this ConverterConversionParams.
     * 
     * @param helperVmNetworkParams
     */
    public void setHelperVmNetworkParams(com.vmware.converter.ConverterHelperVmNetworkParams helperVmNetworkParams) {
        this.helperVmNetworkParams = helperVmNetworkParams;
    }


    /**
     * Gets the throttlingParams value for this ConverterConversionParams.
     * 
     * @return throttlingParams
     */
    public com.vmware.converter.ConverterThrottlingParams getThrottlingParams() {
        return throttlingParams;
    }


    /**
     * Sets the throttlingParams value for this ConverterConversionParams.
     * 
     * @param throttlingParams
     */
    public void setThrottlingParams(com.vmware.converter.ConverterThrottlingParams throttlingParams) {
        this.throttlingParams = throttlingParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConversionParams)) return false;
        ConverterConversionParams other = (ConverterConversionParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doClone==null && other.getDoClone()==null) || 
             (this.doClone!=null &&
              this.doClone.equals(other.getDoClone()))) &&
            ((this.cloningParams==null && other.getCloningParams()==null) || 
             (this.cloningParams!=null &&
              this.cloningParams.equals(other.getCloningParams()))) &&
            ((this.doReconfig==null && other.getDoReconfig()==null) || 
             (this.doReconfig!=null &&
              this.doReconfig.equals(other.getDoReconfig()))) &&
            ((this.reconfigParams==null && other.getReconfigParams()==null) || 
             (this.reconfigParams!=null &&
              this.reconfigParams.equals(other.getReconfigParams()))) &&
            ((this.doInstallTools==null && other.getDoInstallTools()==null) || 
             (this.doInstallTools!=null &&
              this.doInstallTools.equals(other.getDoInstallTools()))) &&
            ((this.doCustomize==null && other.getDoCustomize()==null) || 
             (this.doCustomize!=null &&
              this.doCustomize.equals(other.getDoCustomize()))) &&
            ((this.customizationParams==null && other.getCustomizationParams()==null) || 
             (this.customizationParams!=null &&
              this.customizationParams.equals(other.getCustomizationParams()))) &&
            ((this.doUninstallAgent==null && other.getDoUninstallAgent()==null) || 
             (this.doUninstallAgent!=null &&
              this.doUninstallAgent.equals(other.getDoUninstallAgent()))) &&
            ((this.powerOnTargetVM==null && other.getPowerOnTargetVM()==null) || 
             (this.powerOnTargetVM!=null &&
              this.powerOnTargetVM.equals(other.getPowerOnTargetVM()))) &&
            ((this.removeRestoreCheckpoints==null && other.getRemoveRestoreCheckpoints()==null) || 
             (this.removeRestoreCheckpoints!=null &&
              this.removeRestoreCheckpoints.equals(other.getRemoveRestoreCheckpoints()))) &&
            ((this.helperVmNetworkParams==null && other.getHelperVmNetworkParams()==null) || 
             (this.helperVmNetworkParams!=null &&
              this.helperVmNetworkParams.equals(other.getHelperVmNetworkParams()))) &&
            ((this.throttlingParams==null && other.getThrottlingParams()==null) || 
             (this.throttlingParams!=null &&
              this.throttlingParams.equals(other.getThrottlingParams())));
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
        if (getDoClone() != null) {
            _hashCode += getDoClone().hashCode();
        }
        if (getCloningParams() != null) {
            _hashCode += getCloningParams().hashCode();
        }
        if (getDoReconfig() != null) {
            _hashCode += getDoReconfig().hashCode();
        }
        if (getReconfigParams() != null) {
            _hashCode += getReconfigParams().hashCode();
        }
        if (getDoInstallTools() != null) {
            _hashCode += getDoInstallTools().hashCode();
        }
        if (getDoCustomize() != null) {
            _hashCode += getDoCustomize().hashCode();
        }
        if (getCustomizationParams() != null) {
            _hashCode += getCustomizationParams().hashCode();
        }
        if (getDoUninstallAgent() != null) {
            _hashCode += getDoUninstallAgent().hashCode();
        }
        if (getPowerOnTargetVM() != null) {
            _hashCode += getPowerOnTargetVM().hashCode();
        }
        if (getRemoveRestoreCheckpoints() != null) {
            _hashCode += getRemoveRestoreCheckpoints().hashCode();
        }
        if (getHelperVmNetworkParams() != null) {
            _hashCode += getHelperVmNetworkParams().hashCode();
        }
        if (getThrottlingParams() != null) {
            _hashCode += getThrottlingParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConversionParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConversionParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doClone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doClone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCloningParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doReconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconfigParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "reconfigParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigParams"));
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
        elemField.setFieldName("doUninstallAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doUninstallAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerOnTargetVM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "powerOnTargetVM"));
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
        elemField.setFieldName("helperVmNetworkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "helperVmNetworkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttlingParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "throttlingParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterThrottlingParams"));
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
