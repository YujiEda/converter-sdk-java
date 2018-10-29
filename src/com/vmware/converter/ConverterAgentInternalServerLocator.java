/**
 * ConverterAgentInternalServerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalServerLocator  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalLiveComputerSpec host;

    private java.lang.String uuid;

    public ConverterAgentInternalServerLocator() {
    }

    public ConverterAgentInternalServerLocator(
           com.vmware.converter.ConverterAgentInternalLiveComputerSpec host,
           java.lang.String uuid) {
        this.host = host;
        this.uuid = uuid;
    }


    /**
     * Gets the host value for this ConverterAgentInternalServerLocator.
     * 
     * @return host
     */
    public com.vmware.converter.ConverterAgentInternalLiveComputerSpec getHost() {
        return host;
    }


    /**
     * Sets the host value for this ConverterAgentInternalServerLocator.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ConverterAgentInternalLiveComputerSpec host) {
        this.host = host;
    }


    /**
     * Gets the uuid value for this ConverterAgentInternalServerLocator.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this ConverterAgentInternalServerLocator.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalServerLocator)) return false;
        ConverterAgentInternalServerLocator other = (ConverterAgentInternalServerLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalServerLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalServerLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLiveComputerSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "uuid"));
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
