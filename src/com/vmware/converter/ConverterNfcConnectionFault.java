/**
 * ConverterNfcConnectionFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNfcConnectionFault  extends com.vmware.converter.ConverterConverterFault  implements java.io.Serializable {
    private java.lang.String faultMsg;

    public ConverterNfcConnectionFault() {
    }

    public ConverterNfcConnectionFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String faultMsg) {
        super(
            faultCause,
            faultMessage);
        this.faultMsg = faultMsg;
    }


    /**
     * Gets the faultMsg value for this ConverterNfcConnectionFault.
     * 
     * @return faultMsg
     */
    public java.lang.String getFaultMsg() {
        return faultMsg;
    }


    /**
     * Sets the faultMsg value for this ConverterNfcConnectionFault.
     * 
     * @param faultMsg
     */
    public void setFaultMsg(java.lang.String faultMsg) {
        this.faultMsg = faultMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNfcConnectionFault)) return false;
        ConverterNfcConnectionFault other = (ConverterNfcConnectionFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.faultMsg==null && other.getFaultMsg()==null) || 
             (this.faultMsg!=null &&
              this.faultMsg.equals(other.getFaultMsg())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFaultMsg() != null) {
            _hashCode += getFaultMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterNfcConnectionFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNfcConnectionFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "faultMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
