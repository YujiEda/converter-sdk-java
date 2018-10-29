/**
 * ConverterAgentInternalHostedTargetVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalHostedTargetVMSpec  extends com.vmware.converter.ConverterAgentInternalTargetVMSpec  implements java.io.Serializable {
    private java.lang.String vmPath;

    private java.lang.String username;

    private java.lang.String password;

    public ConverterAgentInternalHostedTargetVMSpec() {
    }

    public ConverterAgentInternalHostedTargetVMSpec(
           java.lang.String vmName,
           java.lang.String vmPath,
           java.lang.String username,
           java.lang.String password) {
        super(
            vmName);
        this.vmPath = vmPath;
        this.username = username;
        this.password = password;
    }


    /**
     * Gets the vmPath value for this ConverterAgentInternalHostedTargetVMSpec.
     * 
     * @return vmPath
     */
    public java.lang.String getVmPath() {
        return vmPath;
    }


    /**
     * Sets the vmPath value for this ConverterAgentInternalHostedTargetVMSpec.
     * 
     * @param vmPath
     */
    public void setVmPath(java.lang.String vmPath) {
        this.vmPath = vmPath;
    }


    /**
     * Gets the username value for this ConverterAgentInternalHostedTargetVMSpec.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ConverterAgentInternalHostedTargetVMSpec.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this ConverterAgentInternalHostedTargetVMSpec.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterAgentInternalHostedTargetVMSpec.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalHostedTargetVMSpec)) return false;
        ConverterAgentInternalHostedTargetVMSpec other = (ConverterAgentInternalHostedTargetVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmPath==null && other.getVmPath()==null) || 
             (this.vmPath!=null &&
              this.vmPath.equals(other.getVmPath()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getVmPath() != null) {
            _hashCode += getVmPath().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalHostedTargetVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalHostedTargetVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
