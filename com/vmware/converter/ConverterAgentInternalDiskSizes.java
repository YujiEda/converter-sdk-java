/**
 * ConverterAgentInternalDiskSizes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDiskSizes  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long capacityInBytes;

    private long cloneSizeInBytes;

    private int blockSize;

    private com.vmware.converter.HostDiskDimensionsChs chs;

    public ConverterAgentInternalDiskSizes() {
    }

    public ConverterAgentInternalDiskSizes(
           long capacityInBytes,
           long cloneSizeInBytes,
           int blockSize,
           com.vmware.converter.HostDiskDimensionsChs chs) {
        this.capacityInBytes = capacityInBytes;
        this.cloneSizeInBytes = cloneSizeInBytes;
        this.blockSize = blockSize;
        this.chs = chs;
    }


    /**
     * Gets the capacityInBytes value for this ConverterAgentInternalDiskSizes.
     * 
     * @return capacityInBytes
     */
    public long getCapacityInBytes() {
        return capacityInBytes;
    }


    /**
     * Sets the capacityInBytes value for this ConverterAgentInternalDiskSizes.
     * 
     * @param capacityInBytes
     */
    public void setCapacityInBytes(long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }


    /**
     * Gets the cloneSizeInBytes value for this ConverterAgentInternalDiskSizes.
     * 
     * @return cloneSizeInBytes
     */
    public long getCloneSizeInBytes() {
        return cloneSizeInBytes;
    }


    /**
     * Sets the cloneSizeInBytes value for this ConverterAgentInternalDiskSizes.
     * 
     * @param cloneSizeInBytes
     */
    public void setCloneSizeInBytes(long cloneSizeInBytes) {
        this.cloneSizeInBytes = cloneSizeInBytes;
    }


    /**
     * Gets the blockSize value for this ConverterAgentInternalDiskSizes.
     * 
     * @return blockSize
     */
    public int getBlockSize() {
        return blockSize;
    }


    /**
     * Sets the blockSize value for this ConverterAgentInternalDiskSizes.
     * 
     * @param blockSize
     */
    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }


    /**
     * Gets the chs value for this ConverterAgentInternalDiskSizes.
     * 
     * @return chs
     */
    public com.vmware.converter.HostDiskDimensionsChs getChs() {
        return chs;
    }


    /**
     * Sets the chs value for this ConverterAgentInternalDiskSizes.
     * 
     * @param chs
     */
    public void setChs(com.vmware.converter.HostDiskDimensionsChs chs) {
        this.chs = chs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDiskSizes)) return false;
        ConverterAgentInternalDiskSizes other = (ConverterAgentInternalDiskSizes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.capacityInBytes == other.getCapacityInBytes() &&
            this.cloneSizeInBytes == other.getCloneSizeInBytes() &&
            this.blockSize == other.getBlockSize() &&
            ((this.chs==null && other.getChs()==null) || 
             (this.chs!=null &&
              this.chs.equals(other.getChs())));
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
        _hashCode += new Long(getCapacityInBytes()).hashCode();
        _hashCode += new Long(getCloneSizeInBytes()).hashCode();
        _hashCode += getBlockSize();
        if (getChs() != null) {
            _hashCode += getChs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDiskSizes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSizes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "capacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneSizeInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloneSizeInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "blockSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "chs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskDimensionsChs"));
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
