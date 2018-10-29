/**
 * ConverterUserSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterUserSession  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String userName;

    private java.lang.String fullName;

    private java.util.Calendar loginTime;

    private java.util.Calendar lastActiveTime;

    private java.lang.String locale;

    private java.lang.String messageLocale;

    private java.lang.Boolean fullAccess;

    public ConverterUserSession() {
    }

    public ConverterUserSession(
           java.lang.String key,
           java.lang.String userName,
           java.lang.String fullName,
           java.util.Calendar loginTime,
           java.util.Calendar lastActiveTime,
           java.lang.String locale,
           java.lang.String messageLocale,
           java.lang.Boolean fullAccess) {
        this.key = key;
        this.userName = userName;
        this.fullName = fullName;
        this.loginTime = loginTime;
        this.lastActiveTime = lastActiveTime;
        this.locale = locale;
        this.messageLocale = messageLocale;
        this.fullAccess = fullAccess;
    }


    /**
     * Gets the key value for this ConverterUserSession.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterUserSession.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the userName value for this ConverterUserSession.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ConverterUserSession.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the fullName value for this ConverterUserSession.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this ConverterUserSession.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the loginTime value for this ConverterUserSession.
     * 
     * @return loginTime
     */
    public java.util.Calendar getLoginTime() {
        return loginTime;
    }


    /**
     * Sets the loginTime value for this ConverterUserSession.
     * 
     * @param loginTime
     */
    public void setLoginTime(java.util.Calendar loginTime) {
        this.loginTime = loginTime;
    }


    /**
     * Gets the lastActiveTime value for this ConverterUserSession.
     * 
     * @return lastActiveTime
     */
    public java.util.Calendar getLastActiveTime() {
        return lastActiveTime;
    }


    /**
     * Sets the lastActiveTime value for this ConverterUserSession.
     * 
     * @param lastActiveTime
     */
    public void setLastActiveTime(java.util.Calendar lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }


    /**
     * Gets the locale value for this ConverterUserSession.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ConverterUserSession.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the messageLocale value for this ConverterUserSession.
     * 
     * @return messageLocale
     */
    public java.lang.String getMessageLocale() {
        return messageLocale;
    }


    /**
     * Sets the messageLocale value for this ConverterUserSession.
     * 
     * @param messageLocale
     */
    public void setMessageLocale(java.lang.String messageLocale) {
        this.messageLocale = messageLocale;
    }


    /**
     * Gets the fullAccess value for this ConverterUserSession.
     * 
     * @return fullAccess
     */
    public java.lang.Boolean getFullAccess() {
        return fullAccess;
    }


    /**
     * Sets the fullAccess value for this ConverterUserSession.
     * 
     * @param fullAccess
     */
    public void setFullAccess(java.lang.Boolean fullAccess) {
        this.fullAccess = fullAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterUserSession)) return false;
        ConverterUserSession other = (ConverterUserSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.loginTime==null && other.getLoginTime()==null) || 
             (this.loginTime!=null &&
              this.loginTime.equals(other.getLoginTime()))) &&
            ((this.lastActiveTime==null && other.getLastActiveTime()==null) || 
             (this.lastActiveTime!=null &&
              this.lastActiveTime.equals(other.getLastActiveTime()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.messageLocale==null && other.getMessageLocale()==null) || 
             (this.messageLocale!=null &&
              this.messageLocale.equals(other.getMessageLocale()))) &&
            ((this.fullAccess==null && other.getFullAccess()==null) || 
             (this.fullAccess!=null &&
              this.fullAccess.equals(other.getFullAccess())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getLoginTime() != null) {
            _hashCode += getLoginTime().hashCode();
        }
        if (getLastActiveTime() != null) {
            _hashCode += getLastActiveTime().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getMessageLocale() != null) {
            _hashCode += getMessageLocale().hashCode();
        }
        if (getFullAccess() != null) {
            _hashCode += getFullAccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterUserSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterUserSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "loginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lastActiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "messageLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "fullAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
