/**
 * ConverterParamsStorageMappingVolumeMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterParamsStorageMappingVolumeMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String sourceVolumeId;

    private java.lang.String targetVolumeId;

    private boolean resizeRequested;

    private java.lang.Long clusterSizeInBytes;

    public ConverterParamsStorageMappingVolumeMapping() {
    }

    public ConverterParamsStorageMappingVolumeMapping(
           java.lang.String sourceVolumeId,
           java.lang.String targetVolumeId,
           boolean resizeRequested,
           java.lang.Long clusterSizeInBytes) {
        this.sourceVolumeId = sourceVolumeId;
        this.targetVolumeId = targetVolumeId;
        this.resizeRequested = resizeRequested;
        this.clusterSizeInBytes = clusterSizeInBytes;
    }


    /**
     * Gets the sourceVolumeId value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @return sourceVolumeId
     */
    public java.lang.String getSourceVolumeId() {
        return sourceVolumeId;
    }


    /**
     * Sets the sourceVolumeId value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @param sourceVolumeId
     */
    public void setSourceVolumeId(java.lang.String sourceVolumeId) {
        this.sourceVolumeId = sourceVolumeId;
    }


    /**
     * Gets the targetVolumeId value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @return targetVolumeId
     */
    public java.lang.String getTargetVolumeId() {
        return targetVolumeId;
    }


    /**
     * Sets the targetVolumeId value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @param targetVolumeId
     */
    public void setTargetVolumeId(java.lang.String targetVolumeId) {
        this.targetVolumeId = targetVolumeId;
    }


    /**
     * Gets the resizeRequested value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @return resizeRequested
     */
    public boolean isResizeRequested() {
        return resizeRequested;
    }


    /**
     * Sets the resizeRequested value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @param resizeRequested
     */
    public void setResizeRequested(boolean resizeRequested) {
        this.resizeRequested = resizeRequested;
    }


    /**
     * Gets the clusterSizeInBytes value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @return clusterSizeInBytes
     */
    public java.lang.Long getClusterSizeInBytes() {
        return clusterSizeInBytes;
    }


    /**
     * Sets the clusterSizeInBytes value for this ConverterParamsStorageMappingVolumeMapping.
     * 
     * @param clusterSizeInBytes
     */
    public void setClusterSizeInBytes(java.lang.Long clusterSizeInBytes) {
        this.clusterSizeInBytes = clusterSizeInBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterParamsStorageMappingVolumeMapping)) return false;
        ConverterParamsStorageMappingVolumeMapping other = (ConverterParamsStorageMappingVolumeMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceVolumeId==null && other.getSourceVolumeId()==null) || 
             (this.sourceVolumeId!=null &&
              this.sourceVolumeId.equals(other.getSourceVolumeId()))) &&
            ((this.targetVolumeId==null && other.getTargetVolumeId()==null) || 
             (this.targetVolumeId!=null &&
              this.targetVolumeId.equals(other.getTargetVolumeId()))) &&
            this.resizeRequested == other.isResizeRequested() &&
            ((this.clusterSizeInBytes==null && other.getClusterSizeInBytes()==null) || 
             (this.clusterSizeInBytes!=null &&
              this.clusterSizeInBytes.equals(other.getClusterSizeInBytes())));
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
        if (getSourceVolumeId() != null) {
            _hashCode += getSourceVolumeId().hashCode();
        }
        if (getTargetVolumeId() != null) {
            _hashCode += getTargetVolumeId().hashCode();
        }
        _hashCode += (isResizeRequested() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClusterSizeInBytes() != null) {
            _hashCode += getClusterSizeInBytes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterParamsStorageMappingVolumeMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingVolumeMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceVolumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceVolumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetVolumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetVolumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resizeRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resizeRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSizeInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "clusterSizeInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
