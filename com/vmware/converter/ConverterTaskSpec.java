/**
 * ConverterTaskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTaskSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerSpec source;

    private com.vmware.converter.ConverterComputerSpec target;

    private com.vmware.converter.ConverterParamsStorageMapping storageMapping;

    private com.vmware.converter.ConverterConversionParams conversionParams;

    private com.vmware.converter.ConverterComputerHardwareInfo hardwareInfo;

    private com.vmware.converter.ConverterComputerOsInfo osInfo;

    private java.lang.Boolean installAgent;

    private java.lang.Boolean uninstallAgent;

    private java.lang.Boolean shutdownSource;

    private java.lang.Integer startDelay;

    public ConverterTaskSpec() {
    }

    public ConverterTaskSpec(
           com.vmware.converter.ConverterComputerSpec source,
           com.vmware.converter.ConverterComputerSpec target,
           com.vmware.converter.ConverterParamsStorageMapping storageMapping,
           com.vmware.converter.ConverterConversionParams conversionParams,
           com.vmware.converter.ConverterComputerHardwareInfo hardwareInfo,
           com.vmware.converter.ConverterComputerOsInfo osInfo,
           java.lang.Boolean installAgent,
           java.lang.Boolean uninstallAgent,
           java.lang.Boolean shutdownSource,
           java.lang.Integer startDelay) {
        this.source = source;
        this.target = target;
        this.storageMapping = storageMapping;
        this.conversionParams = conversionParams;
        this.hardwareInfo = hardwareInfo;
        this.osInfo = osInfo;
        this.installAgent = installAgent;
        this.uninstallAgent = uninstallAgent;
        this.shutdownSource = shutdownSource;
        this.startDelay = startDelay;
    }


    /**
     * Gets the source value for this ConverterTaskSpec.
     * 
     * @return source
     */
    public com.vmware.converter.ConverterComputerSpec getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterTaskSpec.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ConverterComputerSpec source) {
        this.source = source;
    }


    /**
     * Gets the target value for this ConverterTaskSpec.
     * 
     * @return target
     */
    public com.vmware.converter.ConverterComputerSpec getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterTaskSpec.
     * 
     * @param target
     */
    public void setTarget(com.vmware.converter.ConverterComputerSpec target) {
        this.target = target;
    }


    /**
     * Gets the storageMapping value for this ConverterTaskSpec.
     * 
     * @return storageMapping
     */
    public com.vmware.converter.ConverterParamsStorageMapping getStorageMapping() {
        return storageMapping;
    }


    /**
     * Sets the storageMapping value for this ConverterTaskSpec.
     * 
     * @param storageMapping
     */
    public void setStorageMapping(com.vmware.converter.ConverterParamsStorageMapping storageMapping) {
        this.storageMapping = storageMapping;
    }


    /**
     * Gets the conversionParams value for this ConverterTaskSpec.
     * 
     * @return conversionParams
     */
    public com.vmware.converter.ConverterConversionParams getConversionParams() {
        return conversionParams;
    }


    /**
     * Sets the conversionParams value for this ConverterTaskSpec.
     * 
     * @param conversionParams
     */
    public void setConversionParams(com.vmware.converter.ConverterConversionParams conversionParams) {
        this.conversionParams = conversionParams;
    }


    /**
     * Gets the hardwareInfo value for this ConverterTaskSpec.
     * 
     * @return hardwareInfo
     */
    public com.vmware.converter.ConverterComputerHardwareInfo getHardwareInfo() {
        return hardwareInfo;
    }


    /**
     * Sets the hardwareInfo value for this ConverterTaskSpec.
     * 
     * @param hardwareInfo
     */
    public void setHardwareInfo(com.vmware.converter.ConverterComputerHardwareInfo hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
    }


    /**
     * Gets the osInfo value for this ConverterTaskSpec.
     * 
     * @return osInfo
     */
    public com.vmware.converter.ConverterComputerOsInfo getOsInfo() {
        return osInfo;
    }


    /**
     * Sets the osInfo value for this ConverterTaskSpec.
     * 
     * @param osInfo
     */
    public void setOsInfo(com.vmware.converter.ConverterComputerOsInfo osInfo) {
        this.osInfo = osInfo;
    }


    /**
     * Gets the installAgent value for this ConverterTaskSpec.
     * 
     * @return installAgent
     */
    public java.lang.Boolean getInstallAgent() {
        return installAgent;
    }


    /**
     * Sets the installAgent value for this ConverterTaskSpec.
     * 
     * @param installAgent
     */
    public void setInstallAgent(java.lang.Boolean installAgent) {
        this.installAgent = installAgent;
    }


    /**
     * Gets the uninstallAgent value for this ConverterTaskSpec.
     * 
     * @return uninstallAgent
     */
    public java.lang.Boolean getUninstallAgent() {
        return uninstallAgent;
    }


    /**
     * Sets the uninstallAgent value for this ConverterTaskSpec.
     * 
     * @param uninstallAgent
     */
    public void setUninstallAgent(java.lang.Boolean uninstallAgent) {
        this.uninstallAgent = uninstallAgent;
    }


    /**
     * Gets the shutdownSource value for this ConverterTaskSpec.
     * 
     * @return shutdownSource
     */
    public java.lang.Boolean getShutdownSource() {
        return shutdownSource;
    }


    /**
     * Sets the shutdownSource value for this ConverterTaskSpec.
     * 
     * @param shutdownSource
     */
    public void setShutdownSource(java.lang.Boolean shutdownSource) {
        this.shutdownSource = shutdownSource;
    }


    /**
     * Gets the startDelay value for this ConverterTaskSpec.
     * 
     * @return startDelay
     */
    public java.lang.Integer getStartDelay() {
        return startDelay;
    }


    /**
     * Sets the startDelay value for this ConverterTaskSpec.
     * 
     * @param startDelay
     */
    public void setStartDelay(java.lang.Integer startDelay) {
        this.startDelay = startDelay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterTaskSpec)) return false;
        ConverterTaskSpec other = (ConverterTaskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.storageMapping==null && other.getStorageMapping()==null) || 
             (this.storageMapping!=null &&
              this.storageMapping.equals(other.getStorageMapping()))) &&
            ((this.conversionParams==null && other.getConversionParams()==null) || 
             (this.conversionParams!=null &&
              this.conversionParams.equals(other.getConversionParams()))) &&
            ((this.hardwareInfo==null && other.getHardwareInfo()==null) || 
             (this.hardwareInfo!=null &&
              this.hardwareInfo.equals(other.getHardwareInfo()))) &&
            ((this.osInfo==null && other.getOsInfo()==null) || 
             (this.osInfo!=null &&
              this.osInfo.equals(other.getOsInfo()))) &&
            ((this.installAgent==null && other.getInstallAgent()==null) || 
             (this.installAgent!=null &&
              this.installAgent.equals(other.getInstallAgent()))) &&
            ((this.uninstallAgent==null && other.getUninstallAgent()==null) || 
             (this.uninstallAgent!=null &&
              this.uninstallAgent.equals(other.getUninstallAgent()))) &&
            ((this.shutdownSource==null && other.getShutdownSource()==null) || 
             (this.shutdownSource!=null &&
              this.shutdownSource.equals(other.getShutdownSource()))) &&
            ((this.startDelay==null && other.getStartDelay()==null) || 
             (this.startDelay!=null &&
              this.startDelay.equals(other.getStartDelay())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getStorageMapping() != null) {
            _hashCode += getStorageMapping().hashCode();
        }
        if (getConversionParams() != null) {
            _hashCode += getConversionParams().hashCode();
        }
        if (getHardwareInfo() != null) {
            _hashCode += getHardwareInfo().hashCode();
        }
        if (getOsInfo() != null) {
            _hashCode += getOsInfo().hashCode();
        }
        if (getInstallAgent() != null) {
            _hashCode += getInstallAgent().hashCode();
        }
        if (getUninstallAgent() != null) {
            _hashCode += getUninstallAgent().hashCode();
        }
        if (getShutdownSource() != null) {
            _hashCode += getShutdownSource().hashCode();
        }
        if (getStartDelay() != null) {
            _hashCode += getStartDelay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterTaskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "storageMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "conversionParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConversionParams"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hardwareInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerHardwareInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "installAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uninstallAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "uninstallAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "shutdownSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "startDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
