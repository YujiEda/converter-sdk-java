/**
 * ArrayOfConverterBootConfigInfoBootLoaderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterBootConfigInfoBootLoaderInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterBootConfigInfoBootLoaderInfo[] converterBootConfigInfoBootLoaderInfo;

    public ArrayOfConverterBootConfigInfoBootLoaderInfo() {
    }

    public ArrayOfConverterBootConfigInfoBootLoaderInfo(
           com.vmware.converter.ConverterBootConfigInfoBootLoaderInfo[] converterBootConfigInfoBootLoaderInfo) {
           this.converterBootConfigInfoBootLoaderInfo = converterBootConfigInfoBootLoaderInfo;
    }


    /**
     * Gets the converterBootConfigInfoBootLoaderInfo value for this ArrayOfConverterBootConfigInfoBootLoaderInfo.
     * 
     * @return converterBootConfigInfoBootLoaderInfo
     */
    public com.vmware.converter.ConverterBootConfigInfoBootLoaderInfo[] getConverterBootConfigInfoBootLoaderInfo() {
        return converterBootConfigInfoBootLoaderInfo;
    }


    /**
     * Sets the converterBootConfigInfoBootLoaderInfo value for this ArrayOfConverterBootConfigInfoBootLoaderInfo.
     * 
     * @param converterBootConfigInfoBootLoaderInfo
     */
    public void setConverterBootConfigInfoBootLoaderInfo(com.vmware.converter.ConverterBootConfigInfoBootLoaderInfo[] converterBootConfigInfoBootLoaderInfo) {
        this.converterBootConfigInfoBootLoaderInfo = converterBootConfigInfoBootLoaderInfo;
    }

    public com.vmware.converter.ConverterBootConfigInfoBootLoaderInfo getConverterBootConfigInfoBootLoaderInfo(int i) {
        return this.converterBootConfigInfoBootLoaderInfo[i];
    }

    public void setConverterBootConfigInfoBootLoaderInfo(int i, com.vmware.converter.ConverterBootConfigInfoBootLoaderInfo _value) {
        this.converterBootConfigInfoBootLoaderInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterBootConfigInfoBootLoaderInfo)) return false;
        ArrayOfConverterBootConfigInfoBootLoaderInfo other = (ArrayOfConverterBootConfigInfoBootLoaderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterBootConfigInfoBootLoaderInfo==null && other.getConverterBootConfigInfoBootLoaderInfo()==null) || 
             (this.converterBootConfigInfoBootLoaderInfo!=null &&
              java.util.Arrays.equals(this.converterBootConfigInfoBootLoaderInfo, other.getConverterBootConfigInfoBootLoaderInfo())));
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
        if (getConverterBootConfigInfoBootLoaderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterBootConfigInfoBootLoaderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterBootConfigInfoBootLoaderInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterBootConfigInfoBootLoaderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterBootConfigInfoBootLoaderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterBootConfigInfoBootLoaderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderInfo"));
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
