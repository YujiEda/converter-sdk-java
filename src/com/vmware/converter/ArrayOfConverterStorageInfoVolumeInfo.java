/**
 * ArrayOfConverterStorageInfoVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterStorageInfoVolumeInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterStorageInfoVolumeInfo[] converterStorageInfoVolumeInfo;

    public ArrayOfConverterStorageInfoVolumeInfo() {
    }

    public ArrayOfConverterStorageInfoVolumeInfo(
           com.vmware.converter.ConverterStorageInfoVolumeInfo[] converterStorageInfoVolumeInfo) {
           this.converterStorageInfoVolumeInfo = converterStorageInfoVolumeInfo;
    }


    /**
     * Gets the converterStorageInfoVolumeInfo value for this ArrayOfConverterStorageInfoVolumeInfo.
     * 
     * @return converterStorageInfoVolumeInfo
     */
    public com.vmware.converter.ConverterStorageInfoVolumeInfo[] getConverterStorageInfoVolumeInfo() {
        return converterStorageInfoVolumeInfo;
    }


    /**
     * Sets the converterStorageInfoVolumeInfo value for this ArrayOfConverterStorageInfoVolumeInfo.
     * 
     * @param converterStorageInfoVolumeInfo
     */
    public void setConverterStorageInfoVolumeInfo(com.vmware.converter.ConverterStorageInfoVolumeInfo[] converterStorageInfoVolumeInfo) {
        this.converterStorageInfoVolumeInfo = converterStorageInfoVolumeInfo;
    }

    public com.vmware.converter.ConverterStorageInfoVolumeInfo getConverterStorageInfoVolumeInfo(int i) {
        return this.converterStorageInfoVolumeInfo[i];
    }

    public void setConverterStorageInfoVolumeInfo(int i, com.vmware.converter.ConverterStorageInfoVolumeInfo _value) {
        this.converterStorageInfoVolumeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterStorageInfoVolumeInfo)) return false;
        ArrayOfConverterStorageInfoVolumeInfo other = (ArrayOfConverterStorageInfoVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterStorageInfoVolumeInfo==null && other.getConverterStorageInfoVolumeInfo()==null) || 
             (this.converterStorageInfoVolumeInfo!=null &&
              java.util.Arrays.equals(this.converterStorageInfoVolumeInfo, other.getConverterStorageInfoVolumeInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConverterStorageInfoVolumeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterStorageInfoVolumeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterStorageInfoVolumeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterStorageInfoVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterStorageInfoVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterStorageInfoVolumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfo"));
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
