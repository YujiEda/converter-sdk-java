/**
 * DistributedVirtualSwitchNicTeamingPolicyMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchNicTeamingPolicyMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DistributedVirtualSwitchNicTeamingPolicyMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _loadbalance_ip = "loadbalance_ip";
    public static final java.lang.String _loadbalance_srcmac = "loadbalance_srcmac";
    public static final java.lang.String _loadbalance_srcid = "loadbalance_srcid";
    public static final java.lang.String _failover_explicit = "failover_explicit";
    public static final java.lang.String _loadbalance_loadbased = "loadbalance_loadbased";
    public static final DistributedVirtualSwitchNicTeamingPolicyMode loadbalance_ip = new DistributedVirtualSwitchNicTeamingPolicyMode(_loadbalance_ip);
    public static final DistributedVirtualSwitchNicTeamingPolicyMode loadbalance_srcmac = new DistributedVirtualSwitchNicTeamingPolicyMode(_loadbalance_srcmac);
    public static final DistributedVirtualSwitchNicTeamingPolicyMode loadbalance_srcid = new DistributedVirtualSwitchNicTeamingPolicyMode(_loadbalance_srcid);
    public static final DistributedVirtualSwitchNicTeamingPolicyMode failover_explicit = new DistributedVirtualSwitchNicTeamingPolicyMode(_failover_explicit);
    public static final DistributedVirtualSwitchNicTeamingPolicyMode loadbalance_loadbased = new DistributedVirtualSwitchNicTeamingPolicyMode(_loadbalance_loadbased);
    public java.lang.String getValue() { return _value_;}
    public static DistributedVirtualSwitchNicTeamingPolicyMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DistributedVirtualSwitchNicTeamingPolicyMode enumeration = (DistributedVirtualSwitchNicTeamingPolicyMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DistributedVirtualSwitchNicTeamingPolicyMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchNicTeamingPolicyMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchNicTeamingPolicyMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
