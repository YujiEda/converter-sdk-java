/**
 * ArrayOfHttpNfcLeaseDeviceUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHttpNfcLeaseDeviceUrl  implements java.io.Serializable {
    private com.vmware.converter.HttpNfcLeaseDeviceUrl[] httpNfcLeaseDeviceUrl;

    public ArrayOfHttpNfcLeaseDeviceUrl() {
    }

    public ArrayOfHttpNfcLeaseDeviceUrl(
           com.vmware.converter.HttpNfcLeaseDeviceUrl[] httpNfcLeaseDeviceUrl) {
           this.httpNfcLeaseDeviceUrl = httpNfcLeaseDeviceUrl;
    }


    /**
     * Gets the httpNfcLeaseDeviceUrl value for this ArrayOfHttpNfcLeaseDeviceUrl.
     * 
     * @return httpNfcLeaseDeviceUrl
     */
    public com.vmware.converter.HttpNfcLeaseDeviceUrl[] getHttpNfcLeaseDeviceUrl() {
        return httpNfcLeaseDeviceUrl;
    }


    /**
     * Sets the httpNfcLeaseDeviceUrl value for this ArrayOfHttpNfcLeaseDeviceUrl.
     * 
     * @param httpNfcLeaseDeviceUrl
     */
    public void setHttpNfcLeaseDeviceUrl(com.vmware.converter.HttpNfcLeaseDeviceUrl[] httpNfcLeaseDeviceUrl) {
        this.httpNfcLeaseDeviceUrl = httpNfcLeaseDeviceUrl;
    }

    public com.vmware.converter.HttpNfcLeaseDeviceUrl getHttpNfcLeaseDeviceUrl(int i) {
        return this.httpNfcLeaseDeviceUrl[i];
    }

    public void setHttpNfcLeaseDeviceUrl(int i, com.vmware.converter.HttpNfcLeaseDeviceUrl _value) {
        this.httpNfcLeaseDeviceUrl[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHttpNfcLeaseDeviceUrl)) return false;
        ArrayOfHttpNfcLeaseDeviceUrl other = (ArrayOfHttpNfcLeaseDeviceUrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpNfcLeaseDeviceUrl==null && other.getHttpNfcLeaseDeviceUrl()==null) || 
             (this.httpNfcLeaseDeviceUrl!=null &&
              java.util.Arrays.equals(this.httpNfcLeaseDeviceUrl, other.getHttpNfcLeaseDeviceUrl())));
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
        if (getHttpNfcLeaseDeviceUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHttpNfcLeaseDeviceUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHttpNfcLeaseDeviceUrl(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHttpNfcLeaseDeviceUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHttpNfcLeaseDeviceUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpNfcLeaseDeviceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseDeviceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseDeviceUrl"));
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
