/**
 * ConverterInstallAgentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterInstallAgentRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private java.lang.String hostname;

    private java.lang.Integer port;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.Boolean postponeReboot;

    public ConverterInstallAgentRequestType() {
    }

    public ConverterInstallAgentRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           java.lang.String hostname,
           java.lang.Integer port,
           java.lang.String username,
           java.lang.String password,
           java.lang.Boolean postponeReboot) {
           this._this = _this;
           this.hostname = hostname;
           this.port = port;
           this.username = username;
           this.password = password;
           this.postponeReboot = postponeReboot;
    }


    /**
     * Gets the _this value for this ConverterInstallAgentRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterInstallAgentRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the hostname value for this ConverterInstallAgentRequestType.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterInstallAgentRequestType.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the port value for this ConverterInstallAgentRequestType.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this ConverterInstallAgentRequestType.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the username value for this ConverterInstallAgentRequestType.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ConverterInstallAgentRequestType.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this ConverterInstallAgentRequestType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterInstallAgentRequestType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the postponeReboot value for this ConverterInstallAgentRequestType.
     * 
     * @return postponeReboot
     */
    public java.lang.Boolean getPostponeReboot() {
        return postponeReboot;
    }


    /**
     * Sets the postponeReboot value for this ConverterInstallAgentRequestType.
     * 
     * @param postponeReboot
     */
    public void setPostponeReboot(java.lang.Boolean postponeReboot) {
        this.postponeReboot = postponeReboot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterInstallAgentRequestType)) return false;
        ConverterInstallAgentRequestType other = (ConverterInstallAgentRequestType) obj;
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
            ((this.postponeReboot==null && other.getPostponeReboot()==null) || 
             (this.postponeReboot!=null &&
              this.postponeReboot.equals(other.getPostponeReboot())));
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
        if (getPostponeReboot() != null) {
            _hashCode += getPostponeReboot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterInstallAgentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterInstallAgentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postponeReboot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "postponeReboot"));
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
