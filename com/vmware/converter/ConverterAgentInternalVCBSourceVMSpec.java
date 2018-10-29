/**
 * ConverterAgentInternalVCBSourceVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVCBSourceVMSpec  extends com.vmware.converter.ConverterAgentInternalVMwareSourceVMSpec  implements java.io.Serializable {
    private java.lang.String vmxFilePath;

    private java.lang.String catalogFilePath;

    private java.lang.String networkUsername;

    private java.lang.String networkPassword;

    public ConverterAgentInternalVCBSourceVMSpec() {
    }

    public ConverterAgentInternalVCBSourceVMSpec(
           java.lang.String vmxFilePath,
           java.lang.String catalogFilePath,
           java.lang.String networkUsername,
           java.lang.String networkPassword) {
        this.vmxFilePath = vmxFilePath;
        this.catalogFilePath = catalogFilePath;
        this.networkUsername = networkUsername;
        this.networkPassword = networkPassword;
    }


    /**
     * Gets the vmxFilePath value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @return vmxFilePath
     */
    public java.lang.String getVmxFilePath() {
        return vmxFilePath;
    }


    /**
     * Sets the vmxFilePath value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @param vmxFilePath
     */
    public void setVmxFilePath(java.lang.String vmxFilePath) {
        this.vmxFilePath = vmxFilePath;
    }


    /**
     * Gets the catalogFilePath value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @return catalogFilePath
     */
    public java.lang.String getCatalogFilePath() {
        return catalogFilePath;
    }


    /**
     * Sets the catalogFilePath value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @param catalogFilePath
     */
    public void setCatalogFilePath(java.lang.String catalogFilePath) {
        this.catalogFilePath = catalogFilePath;
    }


    /**
     * Gets the networkUsername value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @return networkUsername
     */
    public java.lang.String getNetworkUsername() {
        return networkUsername;
    }


    /**
     * Sets the networkUsername value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @param networkUsername
     */
    public void setNetworkUsername(java.lang.String networkUsername) {
        this.networkUsername = networkUsername;
    }


    /**
     * Gets the networkPassword value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @return networkPassword
     */
    public java.lang.String getNetworkPassword() {
        return networkPassword;
    }


    /**
     * Sets the networkPassword value for this ConverterAgentInternalVCBSourceVMSpec.
     * 
     * @param networkPassword
     */
    public void setNetworkPassword(java.lang.String networkPassword) {
        this.networkPassword = networkPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVCBSourceVMSpec)) return false;
        ConverterAgentInternalVCBSourceVMSpec other = (ConverterAgentInternalVCBSourceVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmxFilePath==null && other.getVmxFilePath()==null) || 
             (this.vmxFilePath!=null &&
              this.vmxFilePath.equals(other.getVmxFilePath()))) &&
            ((this.catalogFilePath==null && other.getCatalogFilePath()==null) || 
             (this.catalogFilePath!=null &&
              this.catalogFilePath.equals(other.getCatalogFilePath()))) &&
            ((this.networkUsername==null && other.getNetworkUsername()==null) || 
             (this.networkUsername!=null &&
              this.networkUsername.equals(other.getNetworkUsername()))) &&
            ((this.networkPassword==null && other.getNetworkPassword()==null) || 
             (this.networkPassword!=null &&
              this.networkPassword.equals(other.getNetworkPassword())));
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
        if (getVmxFilePath() != null) {
            _hashCode += getVmxFilePath().hashCode();
        }
        if (getCatalogFilePath() != null) {
            _hashCode += getCatalogFilePath().hashCode();
        }
        if (getNetworkUsername() != null) {
            _hashCode += getNetworkUsername().hashCode();
        }
        if (getNetworkPassword() != null) {
            _hashCode += getNetworkPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVCBSourceVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVCBSourceVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmxFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmxFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "catalogFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
