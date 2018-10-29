/**
 * ArrayOfHttpNfcLeaseHostInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHttpNfcLeaseHostInfo  implements java.io.Serializable {
    private com.vmware.converter.HttpNfcLeaseHostInfo[] httpNfcLeaseHostInfo;

    public ArrayOfHttpNfcLeaseHostInfo() {
    }

    public ArrayOfHttpNfcLeaseHostInfo(
           com.vmware.converter.HttpNfcLeaseHostInfo[] httpNfcLeaseHostInfo) {
           this.httpNfcLeaseHostInfo = httpNfcLeaseHostInfo;
    }


    /**
     * Gets the httpNfcLeaseHostInfo value for this ArrayOfHttpNfcLeaseHostInfo.
     * 
     * @return httpNfcLeaseHostInfo
     */
    public com.vmware.converter.HttpNfcLeaseHostInfo[] getHttpNfcLeaseHostInfo() {
        return httpNfcLeaseHostInfo;
    }


    /**
     * Sets the httpNfcLeaseHostInfo value for this ArrayOfHttpNfcLeaseHostInfo.
     * 
     * @param httpNfcLeaseHostInfo
     */
    public void setHttpNfcLeaseHostInfo(com.vmware.converter.HttpNfcLeaseHostInfo[] httpNfcLeaseHostInfo) {
        this.httpNfcLeaseHostInfo = httpNfcLeaseHostInfo;
    }

    public com.vmware.converter.HttpNfcLeaseHostInfo getHttpNfcLeaseHostInfo(int i) {
        return this.httpNfcLeaseHostInfo[i];
    }

    public void setHttpNfcLeaseHostInfo(int i, com.vmware.converter.HttpNfcLeaseHostInfo _value) {
        this.httpNfcLeaseHostInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHttpNfcLeaseHostInfo)) return false;
        ArrayOfHttpNfcLeaseHostInfo other = (ArrayOfHttpNfcLeaseHostInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpNfcLeaseHostInfo==null && other.getHttpNfcLeaseHostInfo()==null) || 
             (this.httpNfcLeaseHostInfo!=null &&
              java.util.Arrays.equals(this.httpNfcLeaseHostInfo, other.getHttpNfcLeaseHostInfo())));
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
        if (getHttpNfcLeaseHostInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHttpNfcLeaseHostInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHttpNfcLeaseHostInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHttpNfcLeaseHostInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHttpNfcLeaseHostInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpNfcLeaseHostInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseHostInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseHostInfo"));
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
