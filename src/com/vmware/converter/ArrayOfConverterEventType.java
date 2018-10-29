/**
 * ArrayOfConverterEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterEventType  implements java.io.Serializable {
    private com.vmware.converter.ConverterEventType[] converterEventType;

    public ArrayOfConverterEventType() {
    }

    public ArrayOfConverterEventType(
           com.vmware.converter.ConverterEventType[] converterEventType) {
           this.converterEventType = converterEventType;
    }


    /**
     * Gets the converterEventType value for this ArrayOfConverterEventType.
     * 
     * @return converterEventType
     */
    public com.vmware.converter.ConverterEventType[] getConverterEventType() {
        return converterEventType;
    }


    /**
     * Sets the converterEventType value for this ArrayOfConverterEventType.
     * 
     * @param converterEventType
     */
    public void setConverterEventType(com.vmware.converter.ConverterEventType[] converterEventType) {
        this.converterEventType = converterEventType;
    }

    public com.vmware.converter.ConverterEventType getConverterEventType(int i) {
        return this.converterEventType[i];
    }

    public void setConverterEventType(int i, com.vmware.converter.ConverterEventType _value) {
        this.converterEventType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterEventType)) return false;
        ArrayOfConverterEventType other = (ArrayOfConverterEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterEventType==null && other.getConverterEventType()==null) || 
             (this.converterEventType!=null &&
              java.util.Arrays.equals(this.converterEventType, other.getConverterEventType())));
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
        if (getConverterEventType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterEventType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterEventType(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventType"));
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
