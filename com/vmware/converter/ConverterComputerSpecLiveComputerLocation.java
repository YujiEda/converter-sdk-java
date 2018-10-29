/**
 * ConverterComputerSpecLiveComputerLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerSpecLiveComputerLocation  extends com.vmware.converter.ConverterComputerSpecComputerLocation  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.Integer port;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String osType;

    private java.lang.Boolean verifyPeer;

    private java.lang.String sslThumbprint;

    public ConverterComputerSpecLiveComputerLocation() {
    }

    public ConverterComputerSpecLiveComputerLocation(
           java.lang.String hostname,
           java.lang.Integer port,
           java.lang.String username,
           java.lang.String password,
           java.lang.String osType,
           java.lang.Boolean verifyPeer,
           java.lang.String sslThumbprint) {
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
        this.osType = osType;
        this.verifyPeer = verifyPeer;
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the hostname value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the port value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the username value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the osType value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return osType
     */
    public java.lang.String getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param osType
     */
    public void setOsType(java.lang.String osType) {
        this.osType = osType;
    }


    /**
     * Gets the verifyPeer value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return verifyPeer
     */
    public java.lang.Boolean getVerifyPeer() {
        return verifyPeer;
    }


    /**
     * Sets the verifyPeer value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param verifyPeer
     */
    public void setVerifyPeer(java.lang.Boolean verifyPeer) {
        this.verifyPeer = verifyPeer;
    }


    /**
     * Gets the sslThumbprint value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this ConverterComputerSpecLiveComputerLocation.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerSpecLiveComputerLocation)) return false;
        ConverterComputerSpecLiveComputerLocation other = (ConverterComputerSpecLiveComputerLocation) obj;
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
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConverterComputerSpecLiveComputerLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpecLiveComputerLocation"));
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
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
