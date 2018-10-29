/**
 * ConverterAgentInternalVPCSourceVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVPCSourceVMSpec  extends com.vmware.converter.ConverterAgentInternalForeignSourceVMSpec  implements java.io.Serializable {
    private java.lang.String vmcFilePath;

    public ConverterAgentInternalVPCSourceVMSpec() {
    }

    public ConverterAgentInternalVPCSourceVMSpec(
           java.lang.String networkUsername,
           java.lang.String networkPassword,
           java.lang.String vmcFilePath) {
        super(
            networkUsername,
            networkPassword);
        this.vmcFilePath = vmcFilePath;
    }


    /**
     * Gets the vmcFilePath value for this ConverterAgentInternalVPCSourceVMSpec.
     * 
     * @return vmcFilePath
     */
    public java.lang.String getVmcFilePath() {
        return vmcFilePath;
    }


    /**
     * Sets the vmcFilePath value for this ConverterAgentInternalVPCSourceVMSpec.
     * 
     * @param vmcFilePath
     */
    public void setVmcFilePath(java.lang.String vmcFilePath) {
        this.vmcFilePath = vmcFilePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVPCSourceVMSpec)) return false;
        ConverterAgentInternalVPCSourceVMSpec other = (ConverterAgentInternalVPCSourceVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmcFilePath==null && other.getVmcFilePath()==null) || 
             (this.vmcFilePath!=null &&
              this.vmcFilePath.equals(other.getVmcFilePath())));
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
        if (getVmcFilePath() != null) {
            _hashCode += getVmcFilePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVPCSourceVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVPCSourceVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmcFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmcFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
