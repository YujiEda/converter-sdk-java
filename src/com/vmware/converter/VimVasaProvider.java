/**
 * VimVasaProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VimVasaProvider  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String url;

    private java.lang.String name;

    private java.lang.String selfSignedCertificate;

    public VimVasaProvider() {
    }

    public VimVasaProvider(
           java.lang.String url,
           java.lang.String name,
           java.lang.String selfSignedCertificate) {
        this.url = url;
        this.name = name;
        this.selfSignedCertificate = selfSignedCertificate;
    }


    /**
     * Gets the url value for this VimVasaProvider.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this VimVasaProvider.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the name value for this VimVasaProvider.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VimVasaProvider.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the selfSignedCertificate value for this VimVasaProvider.
     * 
     * @return selfSignedCertificate
     */
    public java.lang.String getSelfSignedCertificate() {
        return selfSignedCertificate;
    }


    /**
     * Sets the selfSignedCertificate value for this VimVasaProvider.
     * 
     * @param selfSignedCertificate
     */
    public void setSelfSignedCertificate(java.lang.String selfSignedCertificate) {
        this.selfSignedCertificate = selfSignedCertificate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VimVasaProvider)) return false;
        VimVasaProvider other = (VimVasaProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.selfSignedCertificate==null && other.getSelfSignedCertificate()==null) || 
             (this.selfSignedCertificate!=null &&
              this.selfSignedCertificate.equals(other.getSelfSignedCertificate())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSelfSignedCertificate() != null) {
            _hashCode += getSelfSignedCertificate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VimVasaProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfSignedCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "selfSignedCertificate"));
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
