/**
 * ConverterParamsStorageMappingHashDiskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterParamsStorageMappingHashDiskInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String hashDiskId;

    private java.lang.String[] hashVolumeIdArray;

    public ConverterParamsStorageMappingHashDiskInfo() {
    }

    public ConverterParamsStorageMappingHashDiskInfo(
           java.lang.String hashDiskId,
           java.lang.String[] hashVolumeIdArray) {
        this.hashDiskId = hashDiskId;
        this.hashVolumeIdArray = hashVolumeIdArray;
    }


    /**
     * Gets the hashDiskId value for this ConverterParamsStorageMappingHashDiskInfo.
     * 
     * @return hashDiskId
     */
    public java.lang.String getHashDiskId() {
        return hashDiskId;
    }


    /**
     * Sets the hashDiskId value for this ConverterParamsStorageMappingHashDiskInfo.
     * 
     * @param hashDiskId
     */
    public void setHashDiskId(java.lang.String hashDiskId) {
        this.hashDiskId = hashDiskId;
    }


    /**
     * Gets the hashVolumeIdArray value for this ConverterParamsStorageMappingHashDiskInfo.
     * 
     * @return hashVolumeIdArray
     */
    public java.lang.String[] getHashVolumeIdArray() {
        return hashVolumeIdArray;
    }


    /**
     * Sets the hashVolumeIdArray value for this ConverterParamsStorageMappingHashDiskInfo.
     * 
     * @param hashVolumeIdArray
     */
    public void setHashVolumeIdArray(java.lang.String[] hashVolumeIdArray) {
        this.hashVolumeIdArray = hashVolumeIdArray;
    }

    public java.lang.String getHashVolumeIdArray(int i) {
        return this.hashVolumeIdArray[i];
    }

    public void setHashVolumeIdArray(int i, java.lang.String _value) {
        this.hashVolumeIdArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterParamsStorageMappingHashDiskInfo)) return false;
        ConverterParamsStorageMappingHashDiskInfo other = (ConverterParamsStorageMappingHashDiskInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hashDiskId==null && other.getHashDiskId()==null) || 
             (this.hashDiskId!=null &&
              this.hashDiskId.equals(other.getHashDiskId()))) &&
            ((this.hashVolumeIdArray==null && other.getHashVolumeIdArray()==null) || 
             (this.hashVolumeIdArray!=null &&
              java.util.Arrays.equals(this.hashVolumeIdArray, other.getHashVolumeIdArray())));
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
        if (getHashDiskId() != null) {
            _hashCode += getHashDiskId().hashCode();
        }
        if (getHashVolumeIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHashVolumeIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHashVolumeIdArray(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterParamsStorageMappingHashDiskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingHashDiskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashDiskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hashDiskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashVolumeIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hashVolumeIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
