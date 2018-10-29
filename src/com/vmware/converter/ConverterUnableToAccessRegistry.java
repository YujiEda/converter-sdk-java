/**
 * ConverterUnableToAccessRegistry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterUnableToAccessRegistry  extends com.vmware.converter.ConverterConverterFault  implements java.io.Serializable {
    private int errCode;

    private java.lang.String errMessage;

    public ConverterUnableToAccessRegistry() {
    }

    public ConverterUnableToAccessRegistry(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int errCode,
           java.lang.String errMessage) {
        super(
            faultCause,
            faultMessage);
        this.errCode = errCode;
        this.errMessage = errMessage;
    }


    /**
     * Gets the errCode value for this ConverterUnableToAccessRegistry.
     * 
     * @return errCode
     */
    public int getErrCode() {
        return errCode;
    }


    /**
     * Sets the errCode value for this ConverterUnableToAccessRegistry.
     * 
     * @param errCode
     */
    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }


    /**
     * Gets the errMessage value for this ConverterUnableToAccessRegistry.
     * 
     * @return errMessage
     */
    public java.lang.String getErrMessage() {
        return errMessage;
    }


    /**
     * Sets the errMessage value for this ConverterUnableToAccessRegistry.
     * 
     * @param errMessage
     */
    public void setErrMessage(java.lang.String errMessage) {
        this.errMessage = errMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterUnableToAccessRegistry)) return false;
        ConverterUnableToAccessRegistry other = (ConverterUnableToAccessRegistry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.errCode == other.getErrCode() &&
            ((this.errMessage==null && other.getErrMessage()==null) || 
             (this.errMessage!=null &&
              this.errMessage.equals(other.getErrMessage())));
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
        _hashCode += getErrCode();
        if (getErrMessage() != null) {
            _hashCode += getErrMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterUnableToAccessRegistry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterUnableToAccessRegistry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "errCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "errMessage"));
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
