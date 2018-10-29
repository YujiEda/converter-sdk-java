/**
 * HostIpConfigIpV6AddressConfigType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostIpConfigIpV6AddressConfigType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostIpConfigIpV6AddressConfigType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _other = "other";
    public static final java.lang.String _manual = "manual";
    public static final java.lang.String _dhcp = "dhcp";
    public static final java.lang.String _linklayer = "linklayer";
    public static final java.lang.String _random = "random";
    public static final HostIpConfigIpV6AddressConfigType other = new HostIpConfigIpV6AddressConfigType(_other);
    public static final HostIpConfigIpV6AddressConfigType manual = new HostIpConfigIpV6AddressConfigType(_manual);
    public static final HostIpConfigIpV6AddressConfigType dhcp = new HostIpConfigIpV6AddressConfigType(_dhcp);
    public static final HostIpConfigIpV6AddressConfigType linklayer = new HostIpConfigIpV6AddressConfigType(_linklayer);
    public static final HostIpConfigIpV6AddressConfigType random = new HostIpConfigIpV6AddressConfigType(_random);
    public java.lang.String getValue() { return _value_;}
    public static HostIpConfigIpV6AddressConfigType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostIpConfigIpV6AddressConfigType enumeration = (HostIpConfigIpV6AddressConfigType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostIpConfigIpV6AddressConfigType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostIpConfigIpV6AddressConfigType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpConfigIpV6AddressConfigType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
