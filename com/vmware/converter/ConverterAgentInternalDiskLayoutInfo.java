/**
 * ConverterAgentInternalDiskLayoutInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDiskLayoutInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalDiskSizes dimensions;

    private java.lang.Integer diskSignature;

    private java.lang.String diskGuid;

    private com.vmware.converter.ConverterAgentInternalLegacyPartition[] partition;

    public ConverterAgentInternalDiskLayoutInfo() {
    }

    public ConverterAgentInternalDiskLayoutInfo(
           com.vmware.converter.ConverterAgentInternalDiskSizes dimensions,
           java.lang.Integer diskSignature,
           java.lang.String diskGuid,
           com.vmware.converter.ConverterAgentInternalLegacyPartition[] partition) {
        this.dimensions = dimensions;
        this.diskSignature = diskSignature;
        this.diskGuid = diskGuid;
        this.partition = partition;
    }


    /**
     * Gets the dimensions value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @return dimensions
     */
    public com.vmware.converter.ConverterAgentInternalDiskSizes getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @param dimensions
     */
    public void setDimensions(com.vmware.converter.ConverterAgentInternalDiskSizes dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the diskSignature value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @return diskSignature
     */
    public java.lang.Integer getDiskSignature() {
        return diskSignature;
    }


    /**
     * Sets the diskSignature value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @param diskSignature
     */
    public void setDiskSignature(java.lang.Integer diskSignature) {
        this.diskSignature = diskSignature;
    }


    /**
     * Gets the diskGuid value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @return diskGuid
     */
    public java.lang.String getDiskGuid() {
        return diskGuid;
    }


    /**
     * Sets the diskGuid value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @param diskGuid
     */
    public void setDiskGuid(java.lang.String diskGuid) {
        this.diskGuid = diskGuid;
    }


    /**
     * Gets the partition value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @return partition
     */
    public com.vmware.converter.ConverterAgentInternalLegacyPartition[] getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this ConverterAgentInternalDiskLayoutInfo.
     * 
     * @param partition
     */
    public void setPartition(com.vmware.converter.ConverterAgentInternalLegacyPartition[] partition) {
        this.partition = partition;
    }

    public com.vmware.converter.ConverterAgentInternalLegacyPartition getPartition(int i) {
        return this.partition[i];
    }

    public void setPartition(int i, com.vmware.converter.ConverterAgentInternalLegacyPartition _value) {
        this.partition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDiskLayoutInfo)) return false;
        ConverterAgentInternalDiskLayoutInfo other = (ConverterAgentInternalDiskLayoutInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.diskSignature==null && other.getDiskSignature()==null) || 
             (this.diskSignature!=null &&
              this.diskSignature.equals(other.getDiskSignature()))) &&
            ((this.diskGuid==null && other.getDiskGuid()==null) || 
             (this.diskGuid!=null &&
              this.diskGuid.equals(other.getDiskGuid()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              java.util.Arrays.equals(this.partition, other.getPartition())));
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
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getDiskSignature() != null) {
            _hashCode += getDiskSignature().hashCode();
        }
        if (getDiskGuid() != null) {
            _hashCode += getDiskGuid().hashCode();
        }
        if (getPartition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartition(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDiskLayoutInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskLayoutInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSizes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLegacyPartition"));
        elemField.setMinOccurs(0);
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
