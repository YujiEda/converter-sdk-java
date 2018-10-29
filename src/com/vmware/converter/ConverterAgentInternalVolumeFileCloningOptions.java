/**
 * ConverterAgentInternalVolumeFileCloningOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVolumeFileCloningOptions  extends com.vmware.converter.ConverterAgentInternalVolumeCloningOptions  implements java.io.Serializable {
    private boolean enableWriteCaching;

    private boolean skipTempFiles;

    private boolean skipTempInternetFiles;

    public ConverterAgentInternalVolumeFileCloningOptions() {
    }

    public ConverterAgentInternalVolumeFileCloningOptions(
           boolean skipPageFiles,
           boolean skipBadBlocks,
           boolean skipSystemRestore,
           boolean compareTargetToSource,
           boolean enableWriteCaching,
           boolean skipTempFiles,
           boolean skipTempInternetFiles) {
        super(
            skipPageFiles,
            skipBadBlocks,
            skipSystemRestore,
            compareTargetToSource);
        this.enableWriteCaching = enableWriteCaching;
        this.skipTempFiles = skipTempFiles;
        this.skipTempInternetFiles = skipTempInternetFiles;
    }


    /**
     * Gets the enableWriteCaching value for this ConverterAgentInternalVolumeFileCloningOptions.
     * 
     * @return enableWriteCaching
     */
    public boolean isEnableWriteCaching() {
        return enableWriteCaching;
    }


    /**
     * Sets the enableWriteCaching value for this ConverterAgentInternalVolumeFileCloningOptions.
     * 
     * @param enableWriteCaching
     */
    public void setEnableWriteCaching(boolean enableWriteCaching) {
        this.enableWriteCaching = enableWriteCaching;
    }


    /**
     * Gets the skipTempFiles value for this ConverterAgentInternalVolumeFileCloningOptions.
     * 
     * @return skipTempFiles
     */
    public boolean isSkipTempFiles() {
        return skipTempFiles;
    }


    /**
     * Sets the skipTempFiles value for this ConverterAgentInternalVolumeFileCloningOptions.
     * 
     * @param skipTempFiles
     */
    public void setSkipTempFiles(boolean skipTempFiles) {
        this.skipTempFiles = skipTempFiles;
    }


    /**
     * Gets the skipTempInternetFiles value for this ConverterAgentInternalVolumeFileCloningOptions.
     * 
     * @return skipTempInternetFiles
     */
    public boolean isSkipTempInternetFiles() {
        return skipTempInternetFiles;
    }


    /**
     * Sets the skipTempInternetFiles value for this ConverterAgentInternalVolumeFileCloningOptions.
     * 
     * @param skipTempInternetFiles
     */
    public void setSkipTempInternetFiles(boolean skipTempInternetFiles) {
        this.skipTempInternetFiles = skipTempInternetFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVolumeFileCloningOptions)) return false;
        ConverterAgentInternalVolumeFileCloningOptions other = (ConverterAgentInternalVolumeFileCloningOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.enableWriteCaching == other.isEnableWriteCaching() &&
            this.skipTempFiles == other.isSkipTempFiles() &&
            this.skipTempInternetFiles == other.isSkipTempInternetFiles();
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
        _hashCode += (isEnableWriteCaching() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSkipTempFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSkipTempInternetFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVolumeFileCloningOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVolumeFileCloningOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableWriteCaching");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "enableWriteCaching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipTempFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipTempFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipTempInternetFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipTempInternetFiles"));
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
