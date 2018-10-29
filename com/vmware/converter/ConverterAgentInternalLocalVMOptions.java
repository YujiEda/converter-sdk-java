/**
 * ConverterAgentInternalLocalVMOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalLocalVMOptions  extends com.vmware.converter.ConverterAgentInternalVMOptions  implements java.io.Serializable {
    private java.lang.String baseDir;

    private boolean linkToSourceDisks;

    private boolean writeToSourceDisks;

    private java.lang.String sourceVM;

    public ConverterAgentInternalLocalVMOptions() {
    }

    public ConverterAgentInternalLocalVMOptions(
           com.vmware.converter.VirtualMachineConfigSpec config,
           com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout,
           java.lang.String vmName,
           com.vmware.converter.ConverterNetworkParams networkParams,
           com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams,
           java.lang.Boolean vmxnetPresent,
           java.lang.Boolean preserveDeviceBacking,
           java.lang.Boolean preserveIdentity,
           java.lang.String baseDir,
           boolean linkToSourceDisks,
           boolean writeToSourceDisks,
           java.lang.String sourceVM) {
        super(
            config,
            targetStorageLayout,
            vmName,
            networkParams,
            basicHardwareParams,
            vmxnetPresent,
            preserveDeviceBacking,
            preserveIdentity);
        this.baseDir = baseDir;
        this.linkToSourceDisks = linkToSourceDisks;
        this.writeToSourceDisks = writeToSourceDisks;
        this.sourceVM = sourceVM;
    }


    /**
     * Gets the baseDir value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @return baseDir
     */
    public java.lang.String getBaseDir() {
        return baseDir;
    }


    /**
     * Sets the baseDir value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @param baseDir
     */
    public void setBaseDir(java.lang.String baseDir) {
        this.baseDir = baseDir;
    }


    /**
     * Gets the linkToSourceDisks value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @return linkToSourceDisks
     */
    public boolean isLinkToSourceDisks() {
        return linkToSourceDisks;
    }


    /**
     * Sets the linkToSourceDisks value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @param linkToSourceDisks
     */
    public void setLinkToSourceDisks(boolean linkToSourceDisks) {
        this.linkToSourceDisks = linkToSourceDisks;
    }


    /**
     * Gets the writeToSourceDisks value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @return writeToSourceDisks
     */
    public boolean isWriteToSourceDisks() {
        return writeToSourceDisks;
    }


    /**
     * Sets the writeToSourceDisks value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @param writeToSourceDisks
     */
    public void setWriteToSourceDisks(boolean writeToSourceDisks) {
        this.writeToSourceDisks = writeToSourceDisks;
    }


    /**
     * Gets the sourceVM value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @return sourceVM
     */
    public java.lang.String getSourceVM() {
        return sourceVM;
    }


    /**
     * Sets the sourceVM value for this ConverterAgentInternalLocalVMOptions.
     * 
     * @param sourceVM
     */
    public void setSourceVM(java.lang.String sourceVM) {
        this.sourceVM = sourceVM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalLocalVMOptions)) return false;
        ConverterAgentInternalLocalVMOptions other = (ConverterAgentInternalLocalVMOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseDir==null && other.getBaseDir()==null) || 
             (this.baseDir!=null &&
              this.baseDir.equals(other.getBaseDir()))) &&
            this.linkToSourceDisks == other.isLinkToSourceDisks() &&
            this.writeToSourceDisks == other.isWriteToSourceDisks() &&
            ((this.sourceVM==null && other.getSourceVM()==null) || 
             (this.sourceVM!=null &&
              this.sourceVM.equals(other.getSourceVM())));
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
        if (getBaseDir() != null) {
            _hashCode += getBaseDir().hashCode();
        }
        _hashCode += (isLinkToSourceDisks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWriteToSourceDisks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourceVM() != null) {
            _hashCode += getSourceVM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalLocalVMOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLocalVMOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseDir");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "baseDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkToSourceDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "linkToSourceDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeToSourceDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "writeToSourceDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceVM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceVM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
