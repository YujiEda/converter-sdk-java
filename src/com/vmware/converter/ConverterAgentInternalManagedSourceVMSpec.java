/**
 * ConverterAgentInternalManagedSourceVMSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalManagedSourceVMSpec  extends com.vmware.converter.ConverterAgentInternalVMwareSourceVMSpec  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalLoginCredentials creds;

    private java.lang.String vmMoId;

    public ConverterAgentInternalManagedSourceVMSpec() {
    }

    public ConverterAgentInternalManagedSourceVMSpec(
           com.vmware.converter.ConverterAgentInternalLoginCredentials creds,
           java.lang.String vmMoId) {
        this.creds = creds;
        this.vmMoId = vmMoId;
    }


    /**
     * Gets the creds value for this ConverterAgentInternalManagedSourceVMSpec.
     * 
     * @return creds
     */
    public com.vmware.converter.ConverterAgentInternalLoginCredentials getCreds() {
        return creds;
    }


    /**
     * Sets the creds value for this ConverterAgentInternalManagedSourceVMSpec.
     * 
     * @param creds
     */
    public void setCreds(com.vmware.converter.ConverterAgentInternalLoginCredentials creds) {
        this.creds = creds;
    }


    /**
     * Gets the vmMoId value for this ConverterAgentInternalManagedSourceVMSpec.
     * 
     * @return vmMoId
     */
    public java.lang.String getVmMoId() {
        return vmMoId;
    }


    /**
     * Sets the vmMoId value for this ConverterAgentInternalManagedSourceVMSpec.
     * 
     * @param vmMoId
     */
    public void setVmMoId(java.lang.String vmMoId) {
        this.vmMoId = vmMoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalManagedSourceVMSpec)) return false;
        ConverterAgentInternalManagedSourceVMSpec other = (ConverterAgentInternalManagedSourceVMSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creds==null && other.getCreds()==null) || 
             (this.creds!=null &&
              this.creds.equals(other.getCreds()))) &&
            ((this.vmMoId==null && other.getVmMoId()==null) || 
             (this.vmMoId!=null &&
              this.vmMoId.equals(other.getVmMoId())));
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
        if (getCreds() != null) {
            _hashCode += getCreds().hashCode();
        }
        if (getVmMoId() != null) {
            _hashCode += getVmMoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalManagedSourceVMSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalManagedSourceVMSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "creds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLoginCredentials"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmMoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmMoId"));
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
