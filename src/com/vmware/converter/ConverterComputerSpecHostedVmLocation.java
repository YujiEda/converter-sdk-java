/**
 * ConverterComputerSpecHostedVmLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerSpecHostedVmLocation  extends com.vmware.converter.ConverterComputerSpecVmLocation  implements java.io.Serializable {
    private java.lang.String configFilePath;

    private java.lang.String password;

    private java.lang.String networkUsername;

    private java.lang.String networkPassword;

    private java.lang.String type;

    public ConverterComputerSpecHostedVmLocation() {
    }

    public ConverterComputerSpecHostedVmLocation(
           java.lang.String configFilePath,
           java.lang.String password,
           java.lang.String networkUsername,
           java.lang.String networkPassword,
           java.lang.String type) {
        this.configFilePath = configFilePath;
        this.password = password;
        this.networkUsername = networkUsername;
        this.networkPassword = networkPassword;
        this.type = type;
    }


    /**
     * Gets the configFilePath value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @return configFilePath
     */
    public java.lang.String getConfigFilePath() {
        return configFilePath;
    }


    /**
     * Sets the configFilePath value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @param configFilePath
     */
    public void setConfigFilePath(java.lang.String configFilePath) {
        this.configFilePath = configFilePath;
    }


    /**
     * Gets the password value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the networkUsername value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @return networkUsername
     */
    public java.lang.String getNetworkUsername() {
        return networkUsername;
    }


    /**
     * Sets the networkUsername value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @param networkUsername
     */
    public void setNetworkUsername(java.lang.String networkUsername) {
        this.networkUsername = networkUsername;
    }


    /**
     * Gets the networkPassword value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @return networkPassword
     */
    public java.lang.String getNetworkPassword() {
        return networkPassword;
    }


    /**
     * Sets the networkPassword value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @param networkPassword
     */
    public void setNetworkPassword(java.lang.String networkPassword) {
        this.networkPassword = networkPassword;
    }


    /**
     * Gets the type value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ConverterComputerSpecHostedVmLocation.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerSpecHostedVmLocation)) return false;
        ConverterComputerSpecHostedVmLocation other = (ConverterComputerSpecHostedVmLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configFilePath==null && other.getConfigFilePath()==null) || 
             (this.configFilePath!=null &&
              this.configFilePath.equals(other.getConfigFilePath()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.networkUsername==null && other.getNetworkUsername()==null) || 
             (this.networkUsername!=null &&
              this.networkUsername.equals(other.getNetworkUsername()))) &&
            ((this.networkPassword==null && other.getNetworkPassword()==null) || 
             (this.networkPassword!=null &&
              this.networkPassword.equals(other.getNetworkPassword()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getConfigFilePath() != null) {
            _hashCode += getConfigFilePath().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getNetworkUsername() != null) {
            _hashCode += getNetworkUsername().hashCode();
        }
        if (getNetworkPassword() != null) {
            _hashCode += getNetworkPassword().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerSpecHostedVmLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpecHostedVmLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "configFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("networkUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "type"));
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
