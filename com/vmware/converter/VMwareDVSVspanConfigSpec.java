/**
 * VMwareDVSVspanConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSVspanConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VMwareVspanSession vspanSession;

    private java.lang.String operation;

    public VMwareDVSVspanConfigSpec() {
    }

    public VMwareDVSVspanConfigSpec(
           com.vmware.converter.VMwareVspanSession vspanSession,
           java.lang.String operation) {
        this.vspanSession = vspanSession;
        this.operation = operation;
    }


    /**
     * Gets the vspanSession value for this VMwareDVSVspanConfigSpec.
     * 
     * @return vspanSession
     */
    public com.vmware.converter.VMwareVspanSession getVspanSession() {
        return vspanSession;
    }


    /**
     * Sets the vspanSession value for this VMwareDVSVspanConfigSpec.
     * 
     * @param vspanSession
     */
    public void setVspanSession(com.vmware.converter.VMwareVspanSession vspanSession) {
        this.vspanSession = vspanSession;
    }


    /**
     * Gets the operation value for this VMwareDVSVspanConfigSpec.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this VMwareDVSVspanConfigSpec.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSVspanConfigSpec)) return false;
        VMwareDVSVspanConfigSpec other = (VMwareDVSVspanConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vspanSession==null && other.getVspanSession()==null) || 
             (this.vspanSession!=null &&
              this.vspanSession.equals(other.getVspanSession()))) &&
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
        if (getVspanSession() != null) {
            _hashCode += getVspanSession().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDVSVspanConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVspanConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanSession");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanSession"));
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
