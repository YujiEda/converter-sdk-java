/**
 * ArrayOfConverterEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterEvent  implements java.io.Serializable {
    private com.vmware.converter.ConverterEvent[] converterEvent;

    public ArrayOfConverterEvent() {
    }

    public ArrayOfConverterEvent(
           com.vmware.converter.ConverterEvent[] converterEvent) {
           this.converterEvent = converterEvent;
    }


    /**
     * Gets the converterEvent value for this ArrayOfConverterEvent.
     * 
     * @return converterEvent
     */
    public com.vmware.converter.ConverterEvent[] getConverterEvent() {
        return converterEvent;
    }


    /**
     * Sets the converterEvent value for this ArrayOfConverterEvent.
     * 
     * @param converterEvent
     */
    public void setConverterEvent(com.vmware.converter.ConverterEvent[] converterEvent) {
        this.converterEvent = converterEvent;
    }

    public com.vmware.converter.ConverterEvent getConverterEvent(int i) {
        return this.converterEvent[i];
    }

    public void setConverterEvent(int i, com.vmware.converter.ConverterEvent _value) {
        this.converterEvent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterEvent)) return false;
        ArrayOfConverterEvent other = (ArrayOfConverterEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterEvent==null && other.getConverterEvent()==null) || 
             (this.converterEvent!=null &&
              java.util.Arrays.equals(this.converterEvent, other.getConverterEvent())));
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
        if (getConverterEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterEvent(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEvent"));
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
