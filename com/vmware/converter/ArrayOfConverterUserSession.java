/**
 * ArrayOfConverterUserSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterUserSession  implements java.io.Serializable {
    private com.vmware.converter.ConverterUserSession[] converterUserSession;

    public ArrayOfConverterUserSession() {
    }

    public ArrayOfConverterUserSession(
           com.vmware.converter.ConverterUserSession[] converterUserSession) {
           this.converterUserSession = converterUserSession;
    }


    /**
     * Gets the converterUserSession value for this ArrayOfConverterUserSession.
     * 
     * @return converterUserSession
     */
    public com.vmware.converter.ConverterUserSession[] getConverterUserSession() {
        return converterUserSession;
    }


    /**
     * Sets the converterUserSession value for this ArrayOfConverterUserSession.
     * 
     * @param converterUserSession
     */
    public void setConverterUserSession(com.vmware.converter.ConverterUserSession[] converterUserSession) {
        this.converterUserSession = converterUserSession;
    }

    public com.vmware.converter.ConverterUserSession getConverterUserSession(int i) {
        return this.converterUserSession[i];
    }

    public void setConverterUserSession(int i, com.vmware.converter.ConverterUserSession _value) {
        this.converterUserSession[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterUserSession)) return false;
        ArrayOfConverterUserSession other = (ArrayOfConverterUserSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterUserSession==null && other.getConverterUserSession()==null) || 
             (this.converterUserSession!=null &&
              java.util.Arrays.equals(this.converterUserSession, other.getConverterUserSession())));
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
        if (getConverterUserSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterUserSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterUserSession(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterUserSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterUserSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterUserSession");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterUserSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterUserSession"));
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
