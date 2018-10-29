/**
 * ConverterStorageParamsVolumeCloningParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageParamsVolumeCloningParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String sourceVolumeId;

    private java.lang.Boolean resize;

    private java.lang.Long newCapacityInBytes;

    private java.lang.Long newClusterSizeInBytes;

    public ConverterStorageParamsVolumeCloningParams() {
    }

    public ConverterStorageParamsVolumeCloningParams(
           java.lang.String sourceVolumeId,
           java.lang.Boolean resize,
           java.lang.Long newCapacityInBytes,
           java.lang.Long newClusterSizeInBytes) {
        this.sourceVolumeId = sourceVolumeId;
        this.resize = resize;
        this.newCapacityInBytes = newCapacityInBytes;
        this.newClusterSizeInBytes = newClusterSizeInBytes;
    }


    /**
     * Gets the sourceVolumeId value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @return sourceVolumeId
     */
    public java.lang.String getSourceVolumeId() {
        return sourceVolumeId;
    }


    /**
     * Sets the sourceVolumeId value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @param sourceVolumeId
     */
    public void setSourceVolumeId(java.lang.String sourceVolumeId) {
        this.sourceVolumeId = sourceVolumeId;
    }


    /**
     * Gets the resize value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @return resize
     */
    public java.lang.Boolean getResize() {
        return resize;
    }


    /**
     * Sets the resize value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @param resize
     */
    public void setResize(java.lang.Boolean resize) {
        this.resize = resize;
    }


    /**
     * Gets the newCapacityInBytes value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @return newCapacityInBytes
     */
    public java.lang.Long getNewCapacityInBytes() {
        return newCapacityInBytes;
    }


    /**
     * Sets the newCapacityInBytes value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @param newCapacityInBytes
     */
    public void setNewCapacityInBytes(java.lang.Long newCapacityInBytes) {
        this.newCapacityInBytes = newCapacityInBytes;
    }


    /**
     * Gets the newClusterSizeInBytes value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @return newClusterSizeInBytes
     */
    public java.lang.Long getNewClusterSizeInBytes() {
        return newClusterSizeInBytes;
    }


    /**
     * Sets the newClusterSizeInBytes value for this ConverterStorageParamsVolumeCloningParams.
     * 
     * @param newClusterSizeInBytes
     */
    public void setNewClusterSizeInBytes(java.lang.Long newClusterSizeInBytes) {
        this.newClusterSizeInBytes = newClusterSizeInBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageParamsVolumeCloningParams)) return false;
        ConverterStorageParamsVolumeCloningParams other = (ConverterStorageParamsVolumeCloningParams) obj;
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
            ((this.resize==null && other.getResize()==null) || 
             (this.resize!=null &&
              this.resize.equals(other.getResize()))) &&
            ((this.newCapacityInBytes==null && other.getNewCapacityInBytes()==null) || 
             (this.newCapacityInBytes!=null &&
              this.newCapacityInBytes.equals(other.getNewCapacityInBytes()))) &&
            ((this.newClusterSizeInBytes==null && other.getNewClusterSizeInBytes()==null) || 
             (this.newClusterSizeInBytes!=null &&
              this.newClusterSizeInBytes.equals(other.getNewClusterSizeInBytes())));
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
        if (getResize() != null) {
            _hashCode += getResize().hashCode();
        }
        if (getNewCapacityInBytes() != null) {
            _hashCode += getNewCapacityInBytes().hashCode();
        }
        if (getNewClusterSizeInBytes() != null) {
            _hashCode += getNewClusterSizeInBytes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageParamsVolumeCloningParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsVolumeCloningParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceVolumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceVolumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCapacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "newCapacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newClusterSizeInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "newClusterSizeInBytes"));
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
