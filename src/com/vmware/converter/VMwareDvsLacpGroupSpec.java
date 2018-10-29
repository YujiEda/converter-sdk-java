/**
 * VMwareDvsLacpGroupSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDvsLacpGroupSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VMwareDvsLacpGroupConfig lacpGroupConfig;

    private java.lang.String operation;

    public VMwareDvsLacpGroupSpec() {
    }

    public VMwareDvsLacpGroupSpec(
           com.vmware.converter.VMwareDvsLacpGroupConfig lacpGroupConfig,
           java.lang.String operation) {
        this.lacpGroupConfig = lacpGroupConfig;
        this.operation = operation;
    }


    /**
     * Gets the lacpGroupConfig value for this VMwareDvsLacpGroupSpec.
     * 
     * @return lacpGroupConfig
     */
    public com.vmware.converter.VMwareDvsLacpGroupConfig getLacpGroupConfig() {
        return lacpGroupConfig;
    }


    /**
     * Sets the lacpGroupConfig value for this VMwareDvsLacpGroupSpec.
     * 
     * @param lacpGroupConfig
     */
    public void setLacpGroupConfig(com.vmware.converter.VMwareDvsLacpGroupConfig lacpGroupConfig) {
        this.lacpGroupConfig = lacpGroupConfig;
    }


    /**
     * Gets the operation value for this VMwareDvsLacpGroupSpec.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this VMwareDvsLacpGroupSpec.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDvsLacpGroupSpec)) return false;
        VMwareDvsLacpGroupSpec other = (VMwareDvsLacpGroupSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lacpGroupConfig==null && other.getLacpGroupConfig()==null) || 
             (this.lacpGroupConfig!=null &&
              this.lacpGroupConfig.equals(other.getLacpGroupConfig()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getLacpGroupConfig() != null) {
            _hashCode += getLacpGroupConfig().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDvsLacpGroupSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpGroupConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lacpGroupConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupConfig"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operation"));
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
