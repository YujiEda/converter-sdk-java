/**
 * VMwareDvsLacpCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDvsLacpCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean lacpSupported;

    private java.lang.Boolean multiLacpGroupSupported;

    public VMwareDvsLacpCapability() {
    }

    public VMwareDvsLacpCapability(
           java.lang.Boolean lacpSupported,
           java.lang.Boolean multiLacpGroupSupported) {
        this.lacpSupported = lacpSupported;
        this.multiLacpGroupSupported = multiLacpGroupSupported;
    }


    /**
     * Gets the lacpSupported value for this VMwareDvsLacpCapability.
     * 
     * @return lacpSupported
     */
    public java.lang.Boolean getLacpSupported() {
        return lacpSupported;
    }


    /**
     * Sets the lacpSupported value for this VMwareDvsLacpCapability.
     * 
     * @param lacpSupported
     */
    public void setLacpSupported(java.lang.Boolean lacpSupported) {
        this.lacpSupported = lacpSupported;
    }


    /**
     * Gets the multiLacpGroupSupported value for this VMwareDvsLacpCapability.
     * 
     * @return multiLacpGroupSupported
     */
    public java.lang.Boolean getMultiLacpGroupSupported() {
        return multiLacpGroupSupported;
    }


    /**
     * Sets the multiLacpGroupSupported value for this VMwareDvsLacpCapability.
     * 
     * @param multiLacpGroupSupported
     */
    public void setMultiLacpGroupSupported(java.lang.Boolean multiLacpGroupSupported) {
        this.multiLacpGroupSupported = multiLacpGroupSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDvsLacpCapability)) return false;
        VMwareDvsLacpCapability other = (VMwareDvsLacpCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lacpSupported==null && other.getLacpSupported()==null) || 
             (this.lacpSupported!=null &&
              this.lacpSupported.equals(other.getLacpSupported()))) &&
            ((this.multiLacpGroupSupported==null && other.getMultiLacpGroupSupported()==null) || 
             (this.multiLacpGroupSupported!=null &&
              this.multiLacpGroupSupported.equals(other.getMultiLacpGroupSupported())));
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
        if (getLacpSupported() != null) {
            _hashCode += getLacpSupported().hashCode();
        }
        if (getMultiLacpGroupSupported() != null) {
            _hashCode += getMultiLacpGroupSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDvsLacpCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lacpSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiLacpGroupSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multiLacpGroupSupported"));
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
