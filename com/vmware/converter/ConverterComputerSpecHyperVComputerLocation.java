/**
 * ConverterComputerSpecHyperVComputerLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerSpecHyperVComputerLocation  extends com.vmware.converter.ConverterComputerSpecComputerLocation  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.Integer port;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String vmName;

    private java.lang.String vmGUID;

    private java.lang.Boolean verifyPeer;

    private java.lang.String sslThumbprint;

    public ConverterComputerSpecHyperVComputerLocation() {
    }

    public ConverterComputerSpecHyperVComputerLocation(
           java.lang.String hostname,
           java.lang.Integer port,
           java.lang.String username,
           java.lang.String password,
           java.lang.String vmName,
           java.lang.String vmGUID,
           java.lang.Boolean verifyPeer,
           java.lang.String sslThumbprint) {
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
        this.vmName = vmName;
        this.vmGUID = vmGUID;
        this.verifyPeer = verifyPeer;
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the hostname value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the port value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the username value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the vmName value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the vmGUID value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return vmGUID
     */
    public java.lang.String getVmGUID() {
        return vmGUID;
    }


    /**
     * Sets the vmGUID value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param vmGUID
     */
    public void setVmGUID(java.lang.String vmGUID) {
        this.vmGUID = vmGUID;
    }


    /**
     * Gets the verifyPeer value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return verifyPeer
     */
    public java.lang.Boolean getVerifyPeer() {
        return verifyPeer;
    }


    /**
     * Sets the verifyPeer value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param verifyPeer
     */
    public void setVerifyPeer(java.lang.Boolean verifyPeer) {
        this.verifyPeer = verifyPeer;
    }


    /**
     * Gets the sslThumbprint value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this ConverterComputerSpecHyperVComputerLocation.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerSpecHyperVComputerLocation)) return false;
        ConverterComputerSpecHyperVComputerLocation other = (ConverterComputerSpecHyperVComputerLocation) obj;
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
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.vmGUID==null && other.getVmGUID()==null) || 
             (this.vmGUID!=null &&
              this.vmGUID.equals(other.getVmGUID()))) &&
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
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getVmGUID() != null) {
            _hashCode += getVmGUID().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConverterComputerSpecHyperVComputerLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpecHyperVComputerLocation"));
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
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
