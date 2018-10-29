/**
 * ConverterStorageInfoVolumeInfoXfsFeatures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageInfoVolumeInfoXfsFeatures  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int blockSize;

    private long agSizeInBlocks;

    private int inodeSize;

    private int iMaxPct;

    private boolean ciMode;

    public ConverterStorageInfoVolumeInfoXfsFeatures() {
    }

    public ConverterStorageInfoVolumeInfoXfsFeatures(
           int blockSize,
           long agSizeInBlocks,
           int inodeSize,
           int iMaxPct,
           boolean ciMode) {
        this.blockSize = blockSize;
        this.agSizeInBlocks = agSizeInBlocks;
        this.inodeSize = inodeSize;
        this.iMaxPct = iMaxPct;
        this.ciMode = ciMode;
    }


    /**
     * Gets the blockSize value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @return blockSize
     */
    public int getBlockSize() {
        return blockSize;
    }


    /**
     * Sets the blockSize value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @param blockSize
     */
    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }


    /**
     * Gets the agSizeInBlocks value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @return agSizeInBlocks
     */
    public long getAgSizeInBlocks() {
        return agSizeInBlocks;
    }


    /**
     * Sets the agSizeInBlocks value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @param agSizeInBlocks
     */
    public void setAgSizeInBlocks(long agSizeInBlocks) {
        this.agSizeInBlocks = agSizeInBlocks;
    }


    /**
     * Gets the inodeSize value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @return inodeSize
     */
    public int getInodeSize() {
        return inodeSize;
    }


    /**
     * Sets the inodeSize value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @param inodeSize
     */
    public void setInodeSize(int inodeSize) {
        this.inodeSize = inodeSize;
    }


    /**
     * Gets the iMaxPct value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @return iMaxPct
     */
    public int getIMaxPct() {
        return iMaxPct;
    }


    /**
     * Sets the iMaxPct value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @param iMaxPct
     */
    public void setIMaxPct(int iMaxPct) {
        this.iMaxPct = iMaxPct;
    }


    /**
     * Gets the ciMode value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @return ciMode
     */
    public boolean isCiMode() {
        return ciMode;
    }


    /**
     * Sets the ciMode value for this ConverterStorageInfoVolumeInfoXfsFeatures.
     * 
     * @param ciMode
     */
    public void setCiMode(boolean ciMode) {
        this.ciMode = ciMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageInfoVolumeInfoXfsFeatures)) return false;
        ConverterStorageInfoVolumeInfoXfsFeatures other = (ConverterStorageInfoVolumeInfoXfsFeatures) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.blockSize == other.getBlockSize() &&
            this.agSizeInBlocks == other.getAgSizeInBlocks() &&
            this.inodeSize == other.getInodeSize() &&
            this.iMaxPct == other.getIMaxPct() &&
            this.ciMode == other.isCiMode();
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
        _hashCode += getBlockSize();
        _hashCode += new Long(getAgSizeInBlocks()).hashCode();
        _hashCode += getInodeSize();
        _hashCode += getIMaxPct();
        _hashCode += (isCiMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageInfoVolumeInfoXfsFeatures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfoXfsFeatures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "blockSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agSizeInBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "agSizeInBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inodeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "inodeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMaxPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "iMaxPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ciMode"));
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
