/**
 * ConverterVMReconfigurationCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterVMReconfigurationCapabilities  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean canReconfigure;

    private boolean canInstallVMwareTools;

    private boolean canCustomizeGuestOS;

    private boolean canUninstallAgentFromTarget;

    private boolean canRemoveRestoreCheckpoints;

    public ConverterVMReconfigurationCapabilities() {
    }

    public ConverterVMReconfigurationCapabilities(
           boolean canReconfigure,
           boolean canInstallVMwareTools,
           boolean canCustomizeGuestOS,
           boolean canUninstallAgentFromTarget,
           boolean canRemoveRestoreCheckpoints) {
        this.canReconfigure = canReconfigure;
        this.canInstallVMwareTools = canInstallVMwareTools;
        this.canCustomizeGuestOS = canCustomizeGuestOS;
        this.canUninstallAgentFromTarget = canUninstallAgentFromTarget;
        this.canRemoveRestoreCheckpoints = canRemoveRestoreCheckpoints;
    }


    /**
     * Gets the canReconfigure value for this ConverterVMReconfigurationCapabilities.
     * 
     * @return canReconfigure
     */
    public boolean isCanReconfigure() {
        return canReconfigure;
    }


    /**
     * Sets the canReconfigure value for this ConverterVMReconfigurationCapabilities.
     * 
     * @param canReconfigure
     */
    public void setCanReconfigure(boolean canReconfigure) {
        this.canReconfigure = canReconfigure;
    }


    /**
     * Gets the canInstallVMwareTools value for this ConverterVMReconfigurationCapabilities.
     * 
     * @return canInstallVMwareTools
     */
    public boolean isCanInstallVMwareTools() {
        return canInstallVMwareTools;
    }


    /**
     * Sets the canInstallVMwareTools value for this ConverterVMReconfigurationCapabilities.
     * 
     * @param canInstallVMwareTools
     */
    public void setCanInstallVMwareTools(boolean canInstallVMwareTools) {
        this.canInstallVMwareTools = canInstallVMwareTools;
    }


    /**
     * Gets the canCustomizeGuestOS value for this ConverterVMReconfigurationCapabilities.
     * 
     * @return canCustomizeGuestOS
     */
    public boolean isCanCustomizeGuestOS() {
        return canCustomizeGuestOS;
    }


    /**
     * Sets the canCustomizeGuestOS value for this ConverterVMReconfigurationCapabilities.
     * 
     * @param canCustomizeGuestOS
     */
    public void setCanCustomizeGuestOS(boolean canCustomizeGuestOS) {
        this.canCustomizeGuestOS = canCustomizeGuestOS;
    }


    /**
     * Gets the canUninstallAgentFromTarget value for this ConverterVMReconfigurationCapabilities.
     * 
     * @return canUninstallAgentFromTarget
     */
    public boolean isCanUninstallAgentFromTarget() {
        return canUninstallAgentFromTarget;
    }


    /**
     * Sets the canUninstallAgentFromTarget value for this ConverterVMReconfigurationCapabilities.
     * 
     * @param canUninstallAgentFromTarget
     */
    public void setCanUninstallAgentFromTarget(boolean canUninstallAgentFromTarget) {
        this.canUninstallAgentFromTarget = canUninstallAgentFromTarget;
    }


    /**
     * Gets the canRemoveRestoreCheckpoints value for this ConverterVMReconfigurationCapabilities.
     * 
     * @return canRemoveRestoreCheckpoints
     */
    public boolean isCanRemoveRestoreCheckpoints() {
        return canRemoveRestoreCheckpoints;
    }


    /**
     * Sets the canRemoveRestoreCheckpoints value for this ConverterVMReconfigurationCapabilities.
     * 
     * @param canRemoveRestoreCheckpoints
     */
    public void setCanRemoveRestoreCheckpoints(boolean canRemoveRestoreCheckpoints) {
        this.canRemoveRestoreCheckpoints = canRemoveRestoreCheckpoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterVMReconfigurationCapabilities)) return false;
        ConverterVMReconfigurationCapabilities other = (ConverterVMReconfigurationCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.canReconfigure == other.isCanReconfigure() &&
            this.canInstallVMwareTools == other.isCanInstallVMwareTools() &&
            this.canCustomizeGuestOS == other.isCanCustomizeGuestOS() &&
            this.canUninstallAgentFromTarget == other.isCanUninstallAgentFromTarget() &&
            this.canRemoveRestoreCheckpoints == other.isCanRemoveRestoreCheckpoints();
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
        _hashCode += (isCanReconfigure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanInstallVMwareTools() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanCustomizeGuestOS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanUninstallAgentFromTarget() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanRemoveRestoreCheckpoints() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterVMReconfigurationCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVMReconfigurationCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canReconfigure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canReconfigure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canInstallVMwareTools");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canInstallVMwareTools"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCustomizeGuestOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canCustomizeGuestOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canUninstallAgentFromTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canUninstallAgentFromTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canRemoveRestoreCheckpoints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canRemoveRestoreCheckpoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
