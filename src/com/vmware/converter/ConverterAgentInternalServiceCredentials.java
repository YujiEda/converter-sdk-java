/**
 * ConverterAgentInternalServiceCredentials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalServiceCredentials  extends com.vmware.converter.ConverterAgentInternalLoginCredentials  implements java.io.Serializable {
    private java.lang.String extensionId;

    private java.lang.String signedCredentials;

    private java.lang.String locale;

    public ConverterAgentInternalServiceCredentials() {
    }

    public ConverterAgentInternalServiceCredentials(
           java.lang.String host,
           java.lang.Integer port,
           java.lang.String username,
           java.lang.String password,
           java.lang.String extensionId,
           java.lang.String signedCredentials,
           java.lang.String locale) {
        super(
            host,
            port,
            username,
            password);
        this.extensionId = extensionId;
        this.signedCredentials = signedCredentials;
        this.locale = locale;
    }


    /**
     * Gets the extensionId value for this ConverterAgentInternalServiceCredentials.
     * 
     * @return extensionId
     */
    public java.lang.String getExtensionId() {
        return extensionId;
    }


    /**
     * Sets the extensionId value for this ConverterAgentInternalServiceCredentials.
     * 
     * @param extensionId
     */
    public void setExtensionId(java.lang.String extensionId) {
        this.extensionId = extensionId;
    }


    /**
     * Gets the signedCredentials value for this ConverterAgentInternalServiceCredentials.
     * 
     * @return signedCredentials
     */
    public java.lang.String getSignedCredentials() {
        return signedCredentials;
    }


    /**
     * Sets the signedCredentials value for this ConverterAgentInternalServiceCredentials.
     * 
     * @param signedCredentials
     */
    public void setSignedCredentials(java.lang.String signedCredentials) {
        this.signedCredentials = signedCredentials;
    }


    /**
     * Gets the locale value for this ConverterAgentInternalServiceCredentials.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ConverterAgentInternalServiceCredentials.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalServiceCredentials)) return false;
        ConverterAgentInternalServiceCredentials other = (ConverterAgentInternalServiceCredentials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extensionId==null && other.getExtensionId()==null) || 
             (this.extensionId!=null &&
              this.extensionId.equals(other.getExtensionId()))) &&
            ((this.signedCredentials==null && other.getSignedCredentials()==null) || 
             (this.signedCredentials!=null &&
              this.signedCredentials.equals(other.getSignedCredentials()))) &&
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
        int _hashCode = super.hashCode();
        if (getExtensionId() != null) {
            _hashCode += getExtensionId().hashCode();
        }
        if (getSignedCredentials() != null) {
            _hashCode += getSignedCredentials().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalServiceCredentials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalServiceCredentials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "extensionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "signedCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
