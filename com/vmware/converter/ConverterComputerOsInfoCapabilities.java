/**
 * ConverterComputerOsInfoCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfoCapabilities  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean canSynchronize;

    private boolean canPowerOffSourceMachine;

    private boolean canStopServices;

    private boolean canSkipUnwantedFiles;

    private boolean canReconfig;

    private boolean canCustomize;

    private boolean canInstallTools;

    private java.lang.String defaultCloningMode;

    private java.lang.String[] supportedCloningMode;

    public ConverterComputerOsInfoCapabilities() {
    }

    public ConverterComputerOsInfoCapabilities(
           boolean canSynchronize,
           boolean canPowerOffSourceMachine,
           boolean canStopServices,
           boolean canSkipUnwantedFiles,
           boolean canReconfig,
           boolean canCustomize,
           boolean canInstallTools,
           java.lang.String defaultCloningMode,
           java.lang.String[] supportedCloningMode) {
        this.canSynchronize = canSynchronize;
        this.canPowerOffSourceMachine = canPowerOffSourceMachine;
        this.canStopServices = canStopServices;
        this.canSkipUnwantedFiles = canSkipUnwantedFiles;
        this.canReconfig = canReconfig;
        this.canCustomize = canCustomize;
        this.canInstallTools = canInstallTools;
        this.defaultCloningMode = defaultCloningMode;
        this.supportedCloningMode = supportedCloningMode;
    }


    /**
     * Gets the canSynchronize value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canSynchronize
     */
    public boolean isCanSynchronize() {
        return canSynchronize;
    }


    /**
     * Sets the canSynchronize value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canSynchronize
     */
    public void setCanSynchronize(boolean canSynchronize) {
        this.canSynchronize = canSynchronize;
    }


    /**
     * Gets the canPowerOffSourceMachine value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canPowerOffSourceMachine
     */
    public boolean isCanPowerOffSourceMachine() {
        return canPowerOffSourceMachine;
    }


    /**
     * Sets the canPowerOffSourceMachine value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canPowerOffSourceMachine
     */
    public void setCanPowerOffSourceMachine(boolean canPowerOffSourceMachine) {
        this.canPowerOffSourceMachine = canPowerOffSourceMachine;
    }


    /**
     * Gets the canStopServices value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canStopServices
     */
    public boolean isCanStopServices() {
        return canStopServices;
    }


    /**
     * Sets the canStopServices value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canStopServices
     */
    public void setCanStopServices(boolean canStopServices) {
        this.canStopServices = canStopServices;
    }


    /**
     * Gets the canSkipUnwantedFiles value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canSkipUnwantedFiles
     */
    public boolean isCanSkipUnwantedFiles() {
        return canSkipUnwantedFiles;
    }


    /**
     * Sets the canSkipUnwantedFiles value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canSkipUnwantedFiles
     */
    public void setCanSkipUnwantedFiles(boolean canSkipUnwantedFiles) {
        this.canSkipUnwantedFiles = canSkipUnwantedFiles;
    }


    /**
     * Gets the canReconfig value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canReconfig
     */
    public boolean isCanReconfig() {
        return canReconfig;
    }


    /**
     * Sets the canReconfig value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canReconfig
     */
    public void setCanReconfig(boolean canReconfig) {
        this.canReconfig = canReconfig;
    }


    /**
     * Gets the canCustomize value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canCustomize
     */
    public boolean isCanCustomize() {
        return canCustomize;
    }


    /**
     * Sets the canCustomize value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canCustomize
     */
    public void setCanCustomize(boolean canCustomize) {
        this.canCustomize = canCustomize;
    }


    /**
     * Gets the canInstallTools value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return canInstallTools
     */
    public boolean isCanInstallTools() {
        return canInstallTools;
    }


    /**
     * Sets the canInstallTools value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param canInstallTools
     */
    public void setCanInstallTools(boolean canInstallTools) {
        this.canInstallTools = canInstallTools;
    }


    /**
     * Gets the defaultCloningMode value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return defaultCloningMode
     */
    public java.lang.String getDefaultCloningMode() {
        return defaultCloningMode;
    }


    /**
     * Sets the defaultCloningMode value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param defaultCloningMode
     */
    public void setDefaultCloningMode(java.lang.String defaultCloningMode) {
        this.defaultCloningMode = defaultCloningMode;
    }


    /**
     * Gets the supportedCloningMode value for this ConverterComputerOsInfoCapabilities.
     * 
     * @return supportedCloningMode
     */
    public java.lang.String[] getSupportedCloningMode() {
        return supportedCloningMode;
    }


    /**
     * Sets the supportedCloningMode value for this ConverterComputerOsInfoCapabilities.
     * 
     * @param supportedCloningMode
     */
    public void setSupportedCloningMode(java.lang.String[] supportedCloningMode) {
        this.supportedCloningMode = supportedCloningMode;
    }

    public java.lang.String getSupportedCloningMode(int i) {
        return this.supportedCloningMode[i];
    }

    public void setSupportedCloningMode(int i, java.lang.String _value) {
        this.supportedCloningMode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerOsInfoCapabilities)) return false;
        ConverterComputerOsInfoCapabilities other = (ConverterComputerOsInfoCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.canSynchronize == other.isCanSynchronize() &&
            this.canPowerOffSourceMachine == other.isCanPowerOffSourceMachine() &&
            this.canStopServices == other.isCanStopServices() &&
            this.canSkipUnwantedFiles == other.isCanSkipUnwantedFiles() &&
            this.canReconfig == other.isCanReconfig() &&
            this.canCustomize == other.isCanCustomize() &&
            this.canInstallTools == other.isCanInstallTools() &&
            ((this.defaultCloningMode==null && other.getDefaultCloningMode()==null) || 
             (this.defaultCloningMode!=null &&
              this.defaultCloningMode.equals(other.getDefaultCloningMode()))) &&
            ((this.supportedCloningMode==null && other.getSupportedCloningMode()==null) || 
             (this.supportedCloningMode!=null &&
              java.util.Arrays.equals(this.supportedCloningMode, other.getSupportedCloningMode())));
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
        _hashCode += (isCanSynchronize() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanPowerOffSourceMachine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanStopServices() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSkipUnwantedFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanReconfig() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanCustomize() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanInstallTools() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDefaultCloningMode() != null) {
            _hashCode += getDefaultCloningMode().hashCode();
        }
        if (getSupportedCloningMode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedCloningMode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedCloningMode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfoCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSynchronize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canSynchronize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canPowerOffSourceMachine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canPowerOffSourceMachine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canStopServices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canStopServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSkipUnwantedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canSkipUnwantedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canReconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canReconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCustomize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canCustomize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canInstallTools");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canInstallTools"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCloningMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultCloningMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedCloningMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedCloningMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
