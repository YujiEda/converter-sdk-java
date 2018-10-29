/**
 * ConverterServerContentVcServerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerContentVcServerInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String url;

    private java.lang.String serverThumbprint;

    public ConverterServerContentVcServerInfo() {
    }

    public ConverterServerContentVcServerInfo(
           java.lang.String url,
           java.lang.String serverThumbprint) {
        this.url = url;
        this.serverThumbprint = serverThumbprint;
    }


    /**
     * Gets the url value for this ConverterServerContentVcServerInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ConverterServerContentVcServerInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the serverThumbprint value for this ConverterServerContentVcServerInfo.
     * 
     * @return serverThumbprint
     */
    public java.lang.String getServerThumbprint() {
        return serverThumbprint;
    }


    /**
     * Sets the serverThumbprint value for this ConverterServerContentVcServerInfo.
     * 
     * @param serverThumbprint
     */
    public void setServerThumbprint(java.lang.String serverThumbprint) {
        this.serverThumbprint = serverThumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerContentVcServerInfo)) return false;
        ConverterServerContentVcServerInfo other = (ConverterServerContentVcServerInfo) obj;
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
            ((this.serverThumbprint==null && other.getServerThumbprint()==null) || 
             (this.serverThumbprint!=null &&
              this.serverThumbprint.equals(other.getServerThumbprint())));
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
        if (getServerThumbprint() != null) {
            _hashCode += getServerThumbprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerContentVcServerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerContentVcServerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "serverThumbprint"));
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
