/**
 * ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes sourceInfo;

    private long capacityInBytes;

    private int targetDiskIndex;

    public ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo() {
    }

    public ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo(
           com.vmware.converter.ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes sourceInfo,
           long capacityInBytes,
           int targetDiskIndex) {
        this.sourceInfo = sourceInfo;
        this.capacityInBytes = capacityInBytes;
        this.targetDiskIndex = targetDiskIndex;
    }


    /**
     * Gets the sourceInfo value for this ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @return sourceInfo
     */
    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes getSourceInfo() {
        return sourceInfo;
    }


    /**
     * Sets the sourceInfo value for this ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @param sourceInfo
     */
    public void setSourceInfo(com.vmware.converter.ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes sourceInfo) {
        this.sourceInfo = sourceInfo;
    }


    /**
     * Gets the capacityInBytes value for this ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @return capacityInBytes
     */
    public long getCapacityInBytes() {
        return capacityInBytes;
    }


    /**
     * Sets the capacityInBytes value for this ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @param capacityInBytes
     */
    public void setCapacityInBytes(long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }


    /**
     * Gets the targetDiskIndex value for this ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @return targetDiskIndex
     */
    public int getTargetDiskIndex() {
        return targetDiskIndex;
    }


    /**
     * Sets the targetDiskIndex value for this ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @param targetDiskIndex
     */
    public void setTargetDiskIndex(int targetDiskIndex) {
        this.targetDiskIndex = targetDiskIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo)) return false;
        ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo other = (ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceInfo==null && other.getSourceInfo()==null) || 
             (this.sourceInfo!=null &&
              this.sourceInfo.equals(other.getSourceInfo()))) &&
            this.capacityInBytes == other.getCapacityInBytes() &&
            this.targetDiskIndex == other.getTargetDiskIndex();
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
        if (getSourceInfo() != null) {
            _hashCode += getSourceInfo().hashCode();
        }
        _hashCode += new Long(getCapacityInBytes()).hashCode();
        _hashCode += getTargetDiskIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "capacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDiskIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetDiskIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
