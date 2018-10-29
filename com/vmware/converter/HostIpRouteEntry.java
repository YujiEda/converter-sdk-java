/**
 * HostIpRouteEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostIpRouteEntry  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String network;

    private int prefixLength;

    private java.lang.String gateway;

    private java.lang.String deviceName;

    public HostIpRouteEntry() {
    }

    public HostIpRouteEntry(
           java.lang.String network,
           int prefixLength,
           java.lang.String gateway,
           java.lang.String deviceName) {
        this.network = network;
        this.prefixLength = prefixLength;
        this.gateway = gateway;
        this.deviceName = deviceName;
    }


    /**
     * Gets the network value for this HostIpRouteEntry.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this HostIpRouteEntry.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the prefixLength value for this HostIpRouteEntry.
     * 
     * @return prefixLength
     */
    public int getPrefixLength() {
        return prefixLength;
    }


    /**
     * Sets the prefixLength value for this HostIpRouteEntry.
     * 
     * @param prefixLength
     */
    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }


    /**
     * Gets the gateway value for this HostIpRouteEntry.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this HostIpRouteEntry.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the deviceName value for this HostIpRouteEntry.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this HostIpRouteEntry.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostIpRouteEntry)) return false;
        HostIpRouteEntry other = (HostIpRouteEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            this.prefixLength == other.getPrefixLength() &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName())));
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        _hashCode += getPrefixLength();
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostIpRouteEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceName"));
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
