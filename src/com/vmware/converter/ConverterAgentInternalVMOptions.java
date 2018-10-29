/**
 * ConverterAgentInternalVMOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVMOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineConfigSpec config;

    private com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout;

    private java.lang.String vmName;

    private com.vmware.converter.ConverterNetworkParams networkParams;

    private com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams;

    private java.lang.Boolean vmxnetPresent;

    private java.lang.Boolean preserveDeviceBacking;

    private java.lang.Boolean preserveIdentity;

    public ConverterAgentInternalVMOptions() {
    }

    public ConverterAgentInternalVMOptions(
           com.vmware.converter.VirtualMachineConfigSpec config,
           com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout,
           java.lang.String vmName,
           com.vmware.converter.ConverterNetworkParams networkParams,
           com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams,
           java.lang.Boolean vmxnetPresent,
           java.lang.Boolean preserveDeviceBacking,
           java.lang.Boolean preserveIdentity) {
        this.config = config;
        this.targetStorageLayout = targetStorageLayout;
        this.vmName = vmName;
        this.networkParams = networkParams;
        this.basicHardwareParams = basicHardwareParams;
        this.vmxnetPresent = vmxnetPresent;
        this.preserveDeviceBacking = preserveDeviceBacking;
        this.preserveIdentity = preserveIdentity;
    }


    /**
     * Gets the config value for this ConverterAgentInternalVMOptions.
     * 
     * @return config
     */
    public com.vmware.converter.VirtualMachineConfigSpec getConfig() {
        return config;
    }


    /**
     * Sets the config value for this ConverterAgentInternalVMOptions.
     * 
     * @param config
     */
    public void setConfig(com.vmware.converter.VirtualMachineConfigSpec config) {
        this.config = config;
    }


    /**
     * Gets the targetStorageLayout value for this ConverterAgentInternalVMOptions.
     * 
     * @return targetStorageLayout
     */
    public com.vmware.converter.ConverterAgentInternalTargetStorageLayout getTargetStorageLayout() {
        return targetStorageLayout;
    }


    /**
     * Sets the targetStorageLayout value for this ConverterAgentInternalVMOptions.
     * 
     * @param targetStorageLayout
     */
    public void setTargetStorageLayout(com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout) {
        this.targetStorageLayout = targetStorageLayout;
    }


    /**
     * Gets the vmName value for this ConverterAgentInternalVMOptions.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this ConverterAgentInternalVMOptions.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the networkParams value for this ConverterAgentInternalVMOptions.
     * 
     * @return networkParams
     */
    public com.vmware.converter.ConverterNetworkParams getNetworkParams() {
        return networkParams;
    }


    /**
     * Sets the networkParams value for this ConverterAgentInternalVMOptions.
     * 
     * @param networkParams
     */
    public void setNetworkParams(com.vmware.converter.ConverterNetworkParams networkParams) {
        this.networkParams = networkParams;
    }


    /**
     * Gets the basicHardwareParams value for this ConverterAgentInternalVMOptions.
     * 
     * @return basicHardwareParams
     */
    public com.vmware.converter.ConverterBasicHardwareParams getBasicHardwareParams() {
        return basicHardwareParams;
    }


    /**
     * Sets the basicHardwareParams value for this ConverterAgentInternalVMOptions.
     * 
     * @param basicHardwareParams
     */
    public void setBasicHardwareParams(com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams) {
        this.basicHardwareParams = basicHardwareParams;
    }


    /**
     * Gets the vmxnetPresent value for this ConverterAgentInternalVMOptions.
     * 
     * @return vmxnetPresent
     */
    public java.lang.Boolean getVmxnetPresent() {
        return vmxnetPresent;
    }


    /**
     * Sets the vmxnetPresent value for this ConverterAgentInternalVMOptions.
     * 
     * @param vmxnetPresent
     */
    public void setVmxnetPresent(java.lang.Boolean vmxnetPresent) {
        this.vmxnetPresent = vmxnetPresent;
    }


    /**
     * Gets the preserveDeviceBacking value for this ConverterAgentInternalVMOptions.
     * 
     * @return preserveDeviceBacking
     */
    public java.lang.Boolean getPreserveDeviceBacking() {
        return preserveDeviceBacking;
    }


    /**
     * Sets the preserveDeviceBacking value for this ConverterAgentInternalVMOptions.
     * 
     * @param preserveDeviceBacking
     */
    public void setPreserveDeviceBacking(java.lang.Boolean preserveDeviceBacking) {
        this.preserveDeviceBacking = preserveDeviceBacking;
    }


    /**
     * Gets the preserveIdentity value for this ConverterAgentInternalVMOptions.
     * 
     * @return preserveIdentity
     */
    public java.lang.Boolean getPreserveIdentity() {
        return preserveIdentity;
    }


    /**
     * Sets the preserveIdentity value for this ConverterAgentInternalVMOptions.
     * 
     * @param preserveIdentity
     */
    public void setPreserveIdentity(java.lang.Boolean preserveIdentity) {
        this.preserveIdentity = preserveIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVMOptions)) return false;
        ConverterAgentInternalVMOptions other = (ConverterAgentInternalVMOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.targetStorageLayout==null && other.getTargetStorageLayout()==null) || 
             (this.targetStorageLayout!=null &&
              this.targetStorageLayout.equals(other.getTargetStorageLayout()))) &&
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.networkParams==null && other.getNetworkParams()==null) || 
             (this.networkParams!=null &&
              this.networkParams.equals(other.getNetworkParams()))) &&
            ((this.basicHardwareParams==null && other.getBasicHardwareParams()==null) || 
             (this.basicHardwareParams!=null &&
              this.basicHardwareParams.equals(other.getBasicHardwareParams()))) &&
            ((this.vmxnetPresent==null && other.getVmxnetPresent()==null) || 
             (this.vmxnetPresent!=null &&
              this.vmxnetPresent.equals(other.getVmxnetPresent()))) &&
            ((this.preserveDeviceBacking==null && other.getPreserveDeviceBacking()==null) || 
             (this.preserveDeviceBacking!=null &&
              this.preserveDeviceBacking.equals(other.getPreserveDeviceBacking()))) &&
            ((this.preserveIdentity==null && other.getPreserveIdentity()==null) || 
             (this.preserveIdentity!=null &&
              this.preserveIdentity.equals(other.getPreserveIdentity())));
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
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getTargetStorageLayout() != null) {
            _hashCode += getTargetStorageLayout().hashCode();
        }
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getNetworkParams() != null) {
            _hashCode += getNetworkParams().hashCode();
        }
        if (getBasicHardwareParams() != null) {
            _hashCode += getBasicHardwareParams().hashCode();
        }
        if (getVmxnetPresent() != null) {
            _hashCode += getVmxnetPresent().hashCode();
        }
        if (getPreserveDeviceBacking() != null) {
            _hashCode += getPreserveDeviceBacking().hashCode();
        }
        if (getPreserveIdentity() != null) {
            _hashCode += getPreserveIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVMOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVMOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetStorageLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetStorageLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayout"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicHardwareParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "basicHardwareParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBasicHardwareParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmxnetPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmxnetPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveDeviceBacking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preserveDeviceBacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preserveIdentity"));
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
