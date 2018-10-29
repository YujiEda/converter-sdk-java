/**
 * ConverterAgentInternalV2ISourceVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalV2ISourceVMSpec  extends com.vmware.converter.ConverterAgentInternalForeignSourceVMSpec  implements java.io.Serializable {
    private java.lang.String v2IFilePath;

    private java.lang.String password;

    public ConverterAgentInternalV2ISourceVMSpec() {
    }

    public ConverterAgentInternalV2ISourceVMSpec(
           java.lang.String networkUsername,
           java.lang.String networkPassword,
           java.lang.String v2IFilePath,
           java.lang.String password) {
        super(
            networkUsername,
            networkPassword);
        this.v2IFilePath = v2IFilePath;
        this.password = password;
    }


    /**
     * Gets the v2IFilePath value for this ConverterAgentInternalV2ISourceVMSpec.
     * 
     * @return v2IFilePath
     */
    public java.lang.String getV2IFilePath() {
        return v2IFilePath;
    }


    /**
     * Sets the v2IFilePath value for this ConverterAgentInternalV2ISourceVMSpec.
     * 
     * @param v2IFilePath
     */
    public void setV2IFilePath(java.lang.String v2IFilePath) {
        this.v2IFilePath = v2IFilePath;
    }


    /**
     * Gets the password value for this ConverterAgentInternalV2ISourceVMSpec.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterAgentInternalV2ISourceVMSpec.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalV2ISourceVMSpec)) return false;
        ConverterAgentInternalV2ISourceVMSpec other = (ConverterAgentInternalV2ISourceVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.v2IFilePath==null && other.getV2IFilePath()==null) || 
             (this.v2IFilePath!=null &&
              this.v2IFilePath.equals(other.getV2IFilePath()))) &&
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
        if (getV2IFilePath() != null) {
            _hashCode += getV2IFilePath().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalV2ISourceVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalV2ISourceVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v2IFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "v2iFilePath"));
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
