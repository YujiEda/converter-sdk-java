/**
 * NetIpRouteConfigSpecIpRouteSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpRouteConfigSpecIpRouteSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String network;

    private int prefixLength;

    private com.vmware.converter.NetIpRouteConfigSpecGatewaySpec gateway;

    private java.lang.String operation;

    public NetIpRouteConfigSpecIpRouteSpec() {
    }

    public NetIpRouteConfigSpecIpRouteSpec(
           java.lang.String network,
           int prefixLength,
           com.vmware.converter.NetIpRouteConfigSpecGatewaySpec gateway,
           java.lang.String operation) {
        this.network = network;
        this.prefixLength = prefixLength;
        this.gateway = gateway;
        this.operation = operation;
    }


    /**
     * Gets the network value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the prefixLength value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @return prefixLength
     */
    public int getPrefixLength() {
        return prefixLength;
    }


    /**
     * Sets the prefixLength value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @param prefixLength
     */
    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }


    /**
     * Gets the gateway value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @return gateway
     */
    public com.vmware.converter.NetIpRouteConfigSpecGatewaySpec getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @param gateway
     */
    public void setGateway(com.vmware.converter.NetIpRouteConfigSpecGatewaySpec gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the operation value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this NetIpRouteConfigSpecIpRouteSpec.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpRouteConfigSpecIpRouteSpec)) return false;
        NetIpRouteConfigSpecIpRouteSpec other = (NetIpRouteConfigSpecIpRouteSpec) obj;
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        _hashCode += getPrefixLength();
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetIpRouteConfigSpecIpRouteSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigSpecIpRouteSpec"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigSpecGatewaySpec"));
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
