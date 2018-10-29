/**
 * ArrayOfConverterConfigOptionsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterConfigOptionsInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterConfigOptionsInfo[] converterConfigOptionsInfo;

    public ArrayOfConverterConfigOptionsInfo() {
    }

    public ArrayOfConverterConfigOptionsInfo(
           com.vmware.converter.ConverterConfigOptionsInfo[] converterConfigOptionsInfo) {
           this.converterConfigOptionsInfo = converterConfigOptionsInfo;
    }


    /**
     * Gets the converterConfigOptionsInfo value for this ArrayOfConverterConfigOptionsInfo.
     * 
     * @return converterConfigOptionsInfo
     */
    public com.vmware.converter.ConverterConfigOptionsInfo[] getConverterConfigOptionsInfo() {
        return converterConfigOptionsInfo;
    }


    /**
     * Sets the converterConfigOptionsInfo value for this ArrayOfConverterConfigOptionsInfo.
     * 
     * @param converterConfigOptionsInfo
     */
    public void setConverterConfigOptionsInfo(com.vmware.converter.ConverterConfigOptionsInfo[] converterConfigOptionsInfo) {
        this.converterConfigOptionsInfo = converterConfigOptionsInfo;
    }

    public com.vmware.converter.ConverterConfigOptionsInfo getConverterConfigOptionsInfo(int i) {
        return this.converterConfigOptionsInfo[i];
    }

    public void setConverterConfigOptionsInfo(int i, com.vmware.converter.ConverterConfigOptionsInfo _value) {
        this.converterConfigOptionsInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterConfigOptionsInfo)) return false;
        ArrayOfConverterConfigOptionsInfo other = (ArrayOfConverterConfigOptionsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterConfigOptionsInfo==null && other.getConverterConfigOptionsInfo()==null) || 
             (this.converterConfigOptionsInfo!=null &&
              java.util.Arrays.equals(this.converterConfigOptionsInfo, other.getConverterConfigOptionsInfo())));
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
        if (getConverterConfigOptionsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterConfigOptionsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterConfigOptionsInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterConfigOptionsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterConfigOptionsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterConfigOptionsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterConfigOptionsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConfigOptionsInfo"));
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
