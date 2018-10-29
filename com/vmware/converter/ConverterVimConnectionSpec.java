/**
 * ConverterVimConnectionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterVimConnectionSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.Integer port;

    private com.vmware.converter.ConverterVimConnectionSpecVimCredentials credentials;

    private java.lang.Boolean verifyPeer;

    private java.lang.String sslThumbprint;

    public ConverterVimConnectionSpec() {
    }

    public ConverterVimConnectionSpec(
           java.lang.String hostname,
           java.lang.Integer port,
           com.vmware.converter.ConverterVimConnectionSpecVimCredentials credentials,
           java.lang.Boolean verifyPeer,
           java.lang.String sslThumbprint) {
        this.hostname = hostname;
        this.port = port;
        this.credentials = credentials;
        this.verifyPeer = verifyPeer;
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the hostname value for this ConverterVimConnectionSpec.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterVimConnectionSpec.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the port value for this ConverterVimConnectionSpec.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this ConverterVimConnectionSpec.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the credentials value for this ConverterVimConnectionSpec.
     * 
     * @return credentials
     */
    public com.vmware.converter.ConverterVimConnectionSpecVimCredentials getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this ConverterVimConnectionSpec.
     * 
     * @param credentials
     */
    public void setCredentials(com.vmware.converter.ConverterVimConnectionSpecVimCredentials credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the verifyPeer value for this ConverterVimConnectionSpec.
     * 
     * @return verifyPeer
     */
    public java.lang.Boolean getVerifyPeer() {
        return verifyPeer;
    }


    /**
     * Sets the verifyPeer value for this ConverterVimConnectionSpec.
     * 
     * @param verifyPeer
     */
    public void setVerifyPeer(java.lang.Boolean verifyPeer) {
        this.verifyPeer = verifyPeer;
    }


    /**
     * Gets the sslThumbprint value for this ConverterVimConnectionSpec.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this ConverterVimConnectionSpec.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterVimConnectionSpec)) return false;
        ConverterVimConnectionSpec other = (ConverterVimConnectionSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.verifyPeer==null && other.getVerifyPeer()==null) || 
             (this.verifyPeer!=null &&
              this.verifyPeer.equals(other.getVerifyPeer()))) &&
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getVerifyPeer() != null) {
            _hashCode += getVerifyPeer().hashCode();
        }
        if (getSslThumbprint() != null) {
            _hashCode += getSslThumbprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterVimConnectionSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVimConnectionSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVimConnectionSpecVimCredentials"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyPeer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "verifyPeer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sslThumbprint"));
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
