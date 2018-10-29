/**
 * ConverterHelperVmNetworkParamsStaticIpv6NetworkParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHelperVmNetworkParamsStaticIpv6NetworkParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ipAddress;

    private java.lang.String gateway;

    public ConverterHelperVmNetworkParamsStaticIpv6NetworkParams() {
    }

    public ConverterHelperVmNetworkParamsStaticIpv6NetworkParams(
           java.lang.String ipAddress,
           java.lang.String gateway) {
        this.ipAddress = ipAddress;
        this.gateway = gateway;
    }


    /**
     * Gets the ipAddress value for this ConverterHelperVmNetworkParamsStaticIpv6NetworkParams.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this ConverterHelperVmNetworkParamsStaticIpv6NetworkParams.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the gateway value for this ConverterHelperVmNetworkParamsStaticIpv6NetworkParams.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this ConverterHelperVmNetworkParamsStaticIpv6NetworkParams.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterHelperVmNetworkParamsStaticIpv6NetworkParams)) return false;
        ConverterHelperVmNetworkParamsStaticIpv6NetworkParams other = (ConverterHelperVmNetworkParamsStaticIpv6NetworkParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterHelperVmNetworkParamsStaticIpv6NetworkParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParamsStaticIpv6NetworkParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "gateway"));
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
