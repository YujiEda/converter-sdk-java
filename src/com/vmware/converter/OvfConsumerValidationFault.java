/**
 * OvfConsumerValidationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfConsumerValidationFault  extends com.vmware.converter.VmConfigFault  implements java.io.Serializable {
    private java.lang.String extensionKey;

    private java.lang.String extensionName;

    private java.lang.String message;

    public OvfConsumerValidationFault() {
    }

    public OvfConsumerValidationFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String extensionKey,
           java.lang.String extensionName,
           java.lang.String message) {
        super(
            faultCause,
            faultMessage);
        this.extensionKey = extensionKey;
        this.extensionName = extensionName;
        this.message = message;
    }


    /**
     * Gets the extensionKey value for this OvfConsumerValidationFault.
     * 
     * @return extensionKey
     */
    public java.lang.String getExtensionKey() {
        return extensionKey;
    }


    /**
     * Sets the extensionKey value for this OvfConsumerValidationFault.
     * 
     * @param extensionKey
     */
    public void setExtensionKey(java.lang.String extensionKey) {
        this.extensionKey = extensionKey;
    }


    /**
     * Gets the extensionName value for this OvfConsumerValidationFault.
     * 
     * @return extensionName
     */
    public java.lang.String getExtensionName() {
        return extensionName;
    }


    /**
     * Sets the extensionName value for this OvfConsumerValidationFault.
     * 
     * @param extensionName
     */
    public void setExtensionName(java.lang.String extensionName) {
        this.extensionName = extensionName;
    }


    /**
     * Gets the message value for this OvfConsumerValidationFault.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OvfConsumerValidationFault.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfConsumerValidationFault)) return false;
        OvfConsumerValidationFault other = (OvfConsumerValidationFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extensionKey==null && other.getExtensionKey()==null) || 
             (this.extensionKey!=null &&
              this.extensionKey.equals(other.getExtensionKey()))) &&
            ((this.extensionName==null && other.getExtensionName()==null) || 
             (this.extensionName!=null &&
              this.extensionName.equals(other.getExtensionName()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getExtensionKey() != null) {
            _hashCode += getExtensionKey().hashCode();
        }
        if (getExtensionName() != null) {
            _hashCode += getExtensionName().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfConsumerValidationFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerValidationFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "message"));
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

}
