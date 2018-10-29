/**
 * ConverterAgentInternalVolumeBlockCloningOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVolumeBlockCloningOptions  extends com.vmware.converter.ConverterAgentInternalVolumeCloningOptions  implements java.io.Serializable {
    private boolean skipZeroSectors;

    private boolean expandFileSystem;

    private boolean finalPass;

    private boolean useDirtyBitmap;

    public ConverterAgentInternalVolumeBlockCloningOptions() {
    }

    public ConverterAgentInternalVolumeBlockCloningOptions(
           boolean skipPageFiles,
           boolean skipBadBlocks,
           boolean skipSystemRestore,
           boolean compareTargetToSource,
           boolean skipZeroSectors,
           boolean expandFileSystem,
           boolean finalPass,
           boolean useDirtyBitmap) {
        super(
            skipPageFiles,
            skipBadBlocks,
            skipSystemRestore,
            compareTargetToSource);
        this.skipZeroSectors = skipZeroSectors;
        this.expandFileSystem = expandFileSystem;
        this.finalPass = finalPass;
        this.useDirtyBitmap = useDirtyBitmap;
    }


    /**
     * Gets the skipZeroSectors value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @return skipZeroSectors
     */
    public boolean isSkipZeroSectors() {
        return skipZeroSectors;
    }


    /**
     * Sets the skipZeroSectors value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @param skipZeroSectors
     */
    public void setSkipZeroSectors(boolean skipZeroSectors) {
        this.skipZeroSectors = skipZeroSectors;
    }


    /**
     * Gets the expandFileSystem value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @return expandFileSystem
     */
    public boolean isExpandFileSystem() {
        return expandFileSystem;
    }


    /**
     * Sets the expandFileSystem value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @param expandFileSystem
     */
    public void setExpandFileSystem(boolean expandFileSystem) {
        this.expandFileSystem = expandFileSystem;
    }


    /**
     * Gets the finalPass value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @return finalPass
     */
    public boolean isFinalPass() {
        return finalPass;
    }


    /**
     * Sets the finalPass value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @param finalPass
     */
    public void setFinalPass(boolean finalPass) {
        this.finalPass = finalPass;
    }


    /**
     * Gets the useDirtyBitmap value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @return useDirtyBitmap
     */
    public boolean isUseDirtyBitmap() {
        return useDirtyBitmap;
    }


    /**
     * Sets the useDirtyBitmap value for this ConverterAgentInternalVolumeBlockCloningOptions.
     * 
     * @param useDirtyBitmap
     */
    public void setUseDirtyBitmap(boolean useDirtyBitmap) {
        this.useDirtyBitmap = useDirtyBitmap;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVolumeBlockCloningOptions)) return false;
        ConverterAgentInternalVolumeBlockCloningOptions other = (ConverterAgentInternalVolumeBlockCloningOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.skipZeroSectors == other.isSkipZeroSectors() &&
            this.expandFileSystem == other.isExpandFileSystem() &&
            this.finalPass == other.isFinalPass() &&
            this.useDirtyBitmap == other.isUseDirtyBitmap();
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
        _hashCode += (isSkipZeroSectors() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExpandFileSystem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFinalPass() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUseDirtyBitmap() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVolumeBlockCloningOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVolumeBlockCloningOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipZeroSectors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipZeroSectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandFileSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "expandFileSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalPass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "finalPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDirtyBitmap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useDirtyBitmap"));
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
