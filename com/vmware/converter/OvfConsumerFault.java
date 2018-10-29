/**
 * OvfConsumerFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfConsumerFault  extends com.vmware.converter.OvfConsumerCallbackFault  implements java.io.Serializable {
    private java.lang.String errorKey;

    private java.lang.String message;

    private com.vmware.converter.KeyValue[] params;

    public OvfConsumerFault() {
    }

    public OvfConsumerFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String extensionKey,
           java.lang.String extensionName,
           java.lang.String errorKey,
           java.lang.String message,
           com.vmware.converter.KeyValue[] params) {
        super(
            faultCause,
            faultMessage,
            extensionKey,
            extensionName);
        this.errorKey = errorKey;
        this.message = message;
        this.params = params;
    }


    /**
     * Gets the errorKey value for this OvfConsumerFault.
     * 
     * @return errorKey
     */
    public java.lang.String getErrorKey() {
        return errorKey;
    }


    /**
     * Sets the errorKey value for this OvfConsumerFault.
     * 
     * @param errorKey
     */
    public void setErrorKey(java.lang.String errorKey) {
        this.errorKey = errorKey;
    }


    /**
     * Gets the message value for this OvfConsumerFault.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OvfConsumerFault.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the params value for this OvfConsumerFault.
     * 
     * @return params
     */
    public com.vmware.converter.KeyValue[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this OvfConsumerFault.
     * 
     * @param params
     */
    public void setParams(com.vmware.converter.KeyValue[] params) {
        this.params = params;
    }

    public com.vmware.converter.KeyValue getParams(int i) {
        return this.params[i];
    }

    public void setParams(int i, com.vmware.converter.KeyValue _value) {
        this.params[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfConsumerFault)) return false;
        OvfConsumerFault other = (OvfConsumerFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorKey==null && other.getErrorKey()==null) || 
             (this.errorKey!=null &&
              this.errorKey.equals(other.getErrorKey()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams())));
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
        if (getErrorKey() != null) {
            _hashCode += getErrorKey().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
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
        new org.apache.axis.description.TypeDesc(OvfConsumerFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "errorKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "params"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
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
