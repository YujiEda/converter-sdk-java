/**
 * ConverterAgentInternalVolumeCloningOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVolumeCloningOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean skipPageFiles;

    private boolean skipBadBlocks;

    private boolean skipSystemRestore;

    private boolean compareTargetToSource;

    public ConverterAgentInternalVolumeCloningOptions() {
    }

    public ConverterAgentInternalVolumeCloningOptions(
           boolean skipPageFiles,
           boolean skipBadBlocks,
           boolean skipSystemRestore,
           boolean compareTargetToSource) {
        this.skipPageFiles = skipPageFiles;
        this.skipBadBlocks = skipBadBlocks;
        this.skipSystemRestore = skipSystemRestore;
        this.compareTargetToSource = compareTargetToSource;
    }


    /**
     * Gets the skipPageFiles value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @return skipPageFiles
     */
    public boolean isSkipPageFiles() {
        return skipPageFiles;
    }


    /**
     * Sets the skipPageFiles value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @param skipPageFiles
     */
    public void setSkipPageFiles(boolean skipPageFiles) {
        this.skipPageFiles = skipPageFiles;
    }


    /**
     * Gets the skipBadBlocks value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @return skipBadBlocks
     */
    public boolean isSkipBadBlocks() {
        return skipBadBlocks;
    }


    /**
     * Sets the skipBadBlocks value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @param skipBadBlocks
     */
    public void setSkipBadBlocks(boolean skipBadBlocks) {
        this.skipBadBlocks = skipBadBlocks;
    }


    /**
     * Gets the skipSystemRestore value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @return skipSystemRestore
     */
    public boolean isSkipSystemRestore() {
        return skipSystemRestore;
    }


    /**
     * Sets the skipSystemRestore value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @param skipSystemRestore
     */
    public void setSkipSystemRestore(boolean skipSystemRestore) {
        this.skipSystemRestore = skipSystemRestore;
    }


    /**
     * Gets the compareTargetToSource value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @return compareTargetToSource
     */
    public boolean isCompareTargetToSource() {
        return compareTargetToSource;
    }


    /**
     * Sets the compareTargetToSource value for this ConverterAgentInternalVolumeCloningOptions.
     * 
     * @param compareTargetToSource
     */
    public void setCompareTargetToSource(boolean compareTargetToSource) {
        this.compareTargetToSource = compareTargetToSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVolumeCloningOptions)) return false;
        ConverterAgentInternalVolumeCloningOptions other = (ConverterAgentInternalVolumeCloningOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.skipPageFiles == other.isSkipPageFiles() &&
            this.skipBadBlocks == other.isSkipBadBlocks() &&
            this.skipSystemRestore == other.isSkipSystemRestore() &&
            this.compareTargetToSource == other.isCompareTargetToSource();
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
        _hashCode += (isSkipPageFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSkipBadBlocks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSkipSystemRestore() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCompareTargetToSource() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVolumeCloningOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVolumeCloningOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipPageFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipPageFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipBadBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipBadBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipSystemRestore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipSystemRestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compareTargetToSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "compareTargetToSource"));
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
