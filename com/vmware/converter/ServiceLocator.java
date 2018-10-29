/**
 * ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ServiceLocator  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String instanceUuid;

    private java.lang.String url;

    private com.vmware.converter.ServiceLocatorCredential credential;

    private java.lang.String sslThumbprint;

    public ServiceLocator() {
    }

    public ServiceLocator(
           java.lang.String instanceUuid,
           java.lang.String url,
           com.vmware.converter.ServiceLocatorCredential credential,
           java.lang.String sslThumbprint) {
        this.instanceUuid = instanceUuid;
        this.url = url;
        this.credential = credential;
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the instanceUuid value for this ServiceLocator.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this ServiceLocator.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the url value for this ServiceLocator.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ServiceLocator.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the credential value for this ServiceLocator.
     * 
     * @return credential
     */
    public com.vmware.converter.ServiceLocatorCredential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this ServiceLocator.
     * 
     * @param credential
     */
    public void setCredential(com.vmware.converter.ServiceLocatorCredential credential) {
        this.credential = credential;
    }


    /**
     * Gets the sslThumbprint value for this ServiceLocator.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this ServiceLocator.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceLocator)) return false;
        ServiceLocator other = (ServiceLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.instanceUuid==null && other.getInstanceUuid()==null) || 
             (this.instanceUuid!=null &&
              this.instanceUuid.equals(other.getInstanceUuid()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.credential==null && other.getCredential()==null) || 
             (this.credential!=null &&
              this.credential.equals(other.getCredential()))) &&
            ((this.sslThumbprint==null && other.getSslThumbprint()==null) || 
             (this.sslThumbprint!=null &&
              this.sslThumbprint.equals(other.getSslThumbprint())));
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
        if (getInstanceUuid() != null) {
            _hashCode += getInstanceUuid().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getCredential() != null) {
            _hashCode += getCredential().hashCode();
        }
        if (getSslThumbprint() != null) {
            _hashCode += getSslThumbprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceLocatorCredential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprint"));
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
