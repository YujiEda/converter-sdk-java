/**
 * ConverterVimConnectionSpecSessionVimCredentials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterVimConnectionSpecSessionVimCredentials  extends com.vmware.converter.ConverterVimConnectionSpecVimCredentials  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String key;

    private java.lang.String cookie;

    public ConverterVimConnectionSpecSessionVimCredentials() {
    }

    public ConverterVimConnectionSpecSessionVimCredentials(
           java.lang.String username,
           java.lang.String key,
           java.lang.String cookie) {
        this.username = username;
        this.key = key;
        this.cookie = cookie;
    }


    /**
     * Gets the username value for this ConverterVimConnectionSpecSessionVimCredentials.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ConverterVimConnectionSpecSessionVimCredentials.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the key value for this ConverterVimConnectionSpecSessionVimCredentials.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterVimConnectionSpecSessionVimCredentials.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the cookie value for this ConverterVimConnectionSpecSessionVimCredentials.
     * 
     * @return cookie
     */
    public java.lang.String getCookie() {
        return cookie;
    }


    /**
     * Sets the cookie value for this ConverterVimConnectionSpecSessionVimCredentials.
     * 
     * @param cookie
     */
    public void setCookie(java.lang.String cookie) {
        this.cookie = cookie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterVimConnectionSpecSessionVimCredentials)) return false;
        ConverterVimConnectionSpecSessionVimCredentials other = (ConverterVimConnectionSpecSessionVimCredentials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.cookie==null && other.getCookie()==null) || 
             (this.cookie!=null &&
              this.cookie.equals(other.getCookie())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getCookie() != null) {
            _hashCode += getCookie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterVimConnectionSpecSessionVimCredentials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVimConnectionSpecSessionVimCredentials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookie");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
