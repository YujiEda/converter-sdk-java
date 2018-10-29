/**
 * ArrayOfConverterSSLCertificateData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterSSLCertificateData  implements java.io.Serializable {
    private com.vmware.converter.ConverterSSLCertificateData[] converterSSLCertificateData;

    public ArrayOfConverterSSLCertificateData() {
    }

    public ArrayOfConverterSSLCertificateData(
           com.vmware.converter.ConverterSSLCertificateData[] converterSSLCertificateData) {
           this.converterSSLCertificateData = converterSSLCertificateData;
    }


    /**
     * Gets the converterSSLCertificateData value for this ArrayOfConverterSSLCertificateData.
     * 
     * @return converterSSLCertificateData
     */
    public com.vmware.converter.ConverterSSLCertificateData[] getConverterSSLCertificateData() {
        return converterSSLCertificateData;
    }


    /**
     * Sets the converterSSLCertificateData value for this ArrayOfConverterSSLCertificateData.
     * 
     * @param converterSSLCertificateData
     */
    public void setConverterSSLCertificateData(com.vmware.converter.ConverterSSLCertificateData[] converterSSLCertificateData) {
        this.converterSSLCertificateData = converterSSLCertificateData;
    }

    public com.vmware.converter.ConverterSSLCertificateData getConverterSSLCertificateData(int i) {
        return this.converterSSLCertificateData[i];
    }

    public void setConverterSSLCertificateData(int i, com.vmware.converter.ConverterSSLCertificateData _value) {
        this.converterSSLCertificateData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterSSLCertificateData)) return false;
        ArrayOfConverterSSLCertificateData other = (ArrayOfConverterSSLCertificateData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterSSLCertificateData==null && other.getConverterSSLCertificateData()==null) || 
             (this.converterSSLCertificateData!=null &&
              java.util.Arrays.equals(this.converterSSLCertificateData, other.getConverterSSLCertificateData())));
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
        if (getConverterSSLCertificateData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterSSLCertificateData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterSSLCertificateData(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterSSLCertificateData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterSSLCertificateData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterSSLCertificateData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterSSLCertificateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSSLCertificateData"));
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
