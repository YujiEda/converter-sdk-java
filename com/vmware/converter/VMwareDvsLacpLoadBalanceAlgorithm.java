/**
 * VMwareDvsLacpLoadBalanceAlgorithm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDvsLacpLoadBalanceAlgorithm implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VMwareDvsLacpLoadBalanceAlgorithm(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _srcMac = "srcMac";
    public static final java.lang.String _destMac = "destMac";
    public static final java.lang.String _srcDestMac = "srcDestMac";
    public static final java.lang.String _destIpVlan = "destIpVlan";
    public static final java.lang.String _srcIpVlan = "srcIpVlan";
    public static final java.lang.String _srcDestIpVlan = "srcDestIpVlan";
    public static final java.lang.String _destTcpUdpPort = "destTcpUdpPort";
    public static final java.lang.String _srcTcpUdpPort = "srcTcpUdpPort";
    public static final java.lang.String _srcDestTcpUdpPort = "srcDestTcpUdpPort";
    public static final java.lang.String _destIpTcpUdpPort = "destIpTcpUdpPort";
    public static final java.lang.String _srcIpTcpUdpPort = "srcIpTcpUdpPort";
    public static final java.lang.String _srcDestIpTcpUdpPort = "srcDestIpTcpUdpPort";
    public static final java.lang.String _destIpTcpUdpPortVlan = "destIpTcpUdpPortVlan";
    public static final java.lang.String _srcIpTcpUdpPortVlan = "srcIpTcpUdpPortVlan";
    public static final java.lang.String _srcDestIpTcpUdpPortVlan = "srcDestIpTcpUdpPortVlan";
    public static final java.lang.String _destIp = "destIp";
    public static final java.lang.String _srcIp = "srcIp";
    public static final java.lang.String _srcDestIp = "srcDestIp";
    public static final java.lang.String _vlan = "vlan";
    public static final java.lang.String _srcPortId = "srcPortId";
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcMac = new VMwareDvsLacpLoadBalanceAlgorithm(_srcMac);
    public static final VMwareDvsLacpLoadBalanceAlgorithm destMac = new VMwareDvsLacpLoadBalanceAlgorithm(_destMac);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcDestMac = new VMwareDvsLacpLoadBalanceAlgorithm(_srcDestMac);
    public static final VMwareDvsLacpLoadBalanceAlgorithm destIpVlan = new VMwareDvsLacpLoadBalanceAlgorithm(_destIpVlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcIpVlan = new VMwareDvsLacpLoadBalanceAlgorithm(_srcIpVlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcDestIpVlan = new VMwareDvsLacpLoadBalanceAlgorithm(_srcDestIpVlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm destTcpUdpPort = new VMwareDvsLacpLoadBalanceAlgorithm(_destTcpUdpPort);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcTcpUdpPort = new VMwareDvsLacpLoadBalanceAlgorithm(_srcTcpUdpPort);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcDestTcpUdpPort = new VMwareDvsLacpLoadBalanceAlgorithm(_srcDestTcpUdpPort);
    public static final VMwareDvsLacpLoadBalanceAlgorithm destIpTcpUdpPort = new VMwareDvsLacpLoadBalanceAlgorithm(_destIpTcpUdpPort);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcIpTcpUdpPort = new VMwareDvsLacpLoadBalanceAlgorithm(_srcIpTcpUdpPort);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcDestIpTcpUdpPort = new VMwareDvsLacpLoadBalanceAlgorithm(_srcDestIpTcpUdpPort);
    public static final VMwareDvsLacpLoadBalanceAlgorithm destIpTcpUdpPortVlan = new VMwareDvsLacpLoadBalanceAlgorithm(_destIpTcpUdpPortVlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcIpTcpUdpPortVlan = new VMwareDvsLacpLoadBalanceAlgorithm(_srcIpTcpUdpPortVlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcDestIpTcpUdpPortVlan = new VMwareDvsLacpLoadBalanceAlgorithm(_srcDestIpTcpUdpPortVlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm destIp = new VMwareDvsLacpLoadBalanceAlgorithm(_destIp);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcIp = new VMwareDvsLacpLoadBalanceAlgorithm(_srcIp);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcDestIp = new VMwareDvsLacpLoadBalanceAlgorithm(_srcDestIp);
    public static final VMwareDvsLacpLoadBalanceAlgorithm vlan = new VMwareDvsLacpLoadBalanceAlgorithm(_vlan);
    public static final VMwareDvsLacpLoadBalanceAlgorithm srcPortId = new VMwareDvsLacpLoadBalanceAlgorithm(_srcPortId);
    public java.lang.String getValue() { return _value_;}
    public static VMwareDvsLacpLoadBalanceAlgorithm fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VMwareDvsLacpLoadBalanceAlgorithm enumeration = (VMwareDvsLacpLoadBalanceAlgorithm)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VMwareDvsLacpLoadBalanceAlgorithm fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDvsLacpLoadBalanceAlgorithm.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpLoadBalanceAlgorithm"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
