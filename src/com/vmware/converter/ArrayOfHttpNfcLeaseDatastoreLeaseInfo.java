/**
 * ArrayOfHttpNfcLeaseDatastoreLeaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHttpNfcLeaseDatastoreLeaseInfo  implements java.io.Serializable {
    private com.vmware.converter.HttpNfcLeaseDatastoreLeaseInfo[] httpNfcLeaseDatastoreLeaseInfo;

    public ArrayOfHttpNfcLeaseDatastoreLeaseInfo() {
    }

    public ArrayOfHttpNfcLeaseDatastoreLeaseInfo(
           com.vmware.converter.HttpNfcLeaseDatastoreLeaseInfo[] httpNfcLeaseDatastoreLeaseInfo) {
           this.httpNfcLeaseDatastoreLeaseInfo = httpNfcLeaseDatastoreLeaseInfo;
    }


    /**
     * Gets the httpNfcLeaseDatastoreLeaseInfo value for this ArrayOfHttpNfcLeaseDatastoreLeaseInfo.
     * 
     * @return httpNfcLeaseDatastoreLeaseInfo
     */
    public com.vmware.converter.HttpNfcLeaseDatastoreLeaseInfo[] getHttpNfcLeaseDatastoreLeaseInfo() {
        return httpNfcLeaseDatastoreLeaseInfo;
    }


    /**
     * Sets the httpNfcLeaseDatastoreLeaseInfo value for this ArrayOfHttpNfcLeaseDatastoreLeaseInfo.
     * 
     * @param httpNfcLeaseDatastoreLeaseInfo
     */
    public void setHttpNfcLeaseDatastoreLeaseInfo(com.vmware.converter.HttpNfcLeaseDatastoreLeaseInfo[] httpNfcLeaseDatastoreLeaseInfo) {
        this.httpNfcLeaseDatastoreLeaseInfo = httpNfcLeaseDatastoreLeaseInfo;
    }

    public com.vmware.converter.HttpNfcLeaseDatastoreLeaseInfo getHttpNfcLeaseDatastoreLeaseInfo(int i) {
        return this.httpNfcLeaseDatastoreLeaseInfo[i];
    }

    public void setHttpNfcLeaseDatastoreLeaseInfo(int i, com.vmware.converter.HttpNfcLeaseDatastoreLeaseInfo _value) {
        this.httpNfcLeaseDatastoreLeaseInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHttpNfcLeaseDatastoreLeaseInfo)) return false;
        ArrayOfHttpNfcLeaseDatastoreLeaseInfo other = (ArrayOfHttpNfcLeaseDatastoreLeaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpNfcLeaseDatastoreLeaseInfo==null && other.getHttpNfcLeaseDatastoreLeaseInfo()==null) || 
             (this.httpNfcLeaseDatastoreLeaseInfo!=null &&
              java.util.Arrays.equals(this.httpNfcLeaseDatastoreLeaseInfo, other.getHttpNfcLeaseDatastoreLeaseInfo())));
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
        if (getHttpNfcLeaseDatastoreLeaseInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHttpNfcLeaseDatastoreLeaseInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHttpNfcLeaseDatastoreLeaseInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHttpNfcLeaseDatastoreLeaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHttpNfcLeaseDatastoreLeaseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpNfcLeaseDatastoreLeaseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseDatastoreLeaseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseDatastoreLeaseInfo"));
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
