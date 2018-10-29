/**
 * ArrayOfConverterServiceChangeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterServiceChangeRequest  implements java.io.Serializable {
    private com.vmware.converter.ConverterServiceChangeRequest[] converterServiceChangeRequest;

    public ArrayOfConverterServiceChangeRequest() {
    }

    public ArrayOfConverterServiceChangeRequest(
           com.vmware.converter.ConverterServiceChangeRequest[] converterServiceChangeRequest) {
           this.converterServiceChangeRequest = converterServiceChangeRequest;
    }


    /**
     * Gets the converterServiceChangeRequest value for this ArrayOfConverterServiceChangeRequest.
     * 
     * @return converterServiceChangeRequest
     */
    public com.vmware.converter.ConverterServiceChangeRequest[] getConverterServiceChangeRequest() {
        return converterServiceChangeRequest;
    }


    /**
     * Sets the converterServiceChangeRequest value for this ArrayOfConverterServiceChangeRequest.
     * 
     * @param converterServiceChangeRequest
     */
    public void setConverterServiceChangeRequest(com.vmware.converter.ConverterServiceChangeRequest[] converterServiceChangeRequest) {
        this.converterServiceChangeRequest = converterServiceChangeRequest;
    }

    public com.vmware.converter.ConverterServiceChangeRequest getConverterServiceChangeRequest(int i) {
        return this.converterServiceChangeRequest[i];
    }

    public void setConverterServiceChangeRequest(int i, com.vmware.converter.ConverterServiceChangeRequest _value) {
        this.converterServiceChangeRequest[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterServiceChangeRequest)) return false;
        ArrayOfConverterServiceChangeRequest other = (ArrayOfConverterServiceChangeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterServiceChangeRequest==null && other.getConverterServiceChangeRequest()==null) || 
             (this.converterServiceChangeRequest!=null &&
              java.util.Arrays.equals(this.converterServiceChangeRequest, other.getConverterServiceChangeRequest())));
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
        if (getConverterServiceChangeRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterServiceChangeRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterServiceChangeRequest(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterServiceChangeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterServiceChangeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterServiceChangeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterServiceChangeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceChangeRequest"));
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
