/**
 * ConverterAgentImpersonateUserRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentImpersonateUserRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private java.lang.String userName;

    private long token;

    private java.lang.String locale;

    public ConverterAgentImpersonateUserRequestType() {
    }

    public ConverterAgentImpersonateUserRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           java.lang.String userName,
           long token,
           java.lang.String locale) {
           this._this = _this;
           this.userName = userName;
           this.token = token;
           this.locale = locale;
    }


    /**
     * Gets the _this value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the userName value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the token value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @return token
     */
    public long getToken() {
        return token;
    }


    /**
     * Sets the token value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @param token
     */
    public void setToken(long token) {
        this.token = token;
    }


    /**
     * Gets the locale value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ConverterAgentImpersonateUserRequestType.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentImpersonateUserRequestType)) return false;
        ConverterAgentImpersonateUserRequestType other = (ConverterAgentImpersonateUserRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            this.token == other.getToken() &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        _hashCode += new Long(getToken()).hashCode();
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentImpersonateUserRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentImpersonateUserRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "locale"));
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
