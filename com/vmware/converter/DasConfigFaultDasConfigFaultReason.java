/**
 * DasConfigFaultDasConfigFaultReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DasConfigFaultDasConfigFaultReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DasConfigFaultDasConfigFaultReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HostNetworkMisconfiguration = "HostNetworkMisconfiguration";
    public static final java.lang.String _HostMisconfiguration = "HostMisconfiguration";
    public static final java.lang.String _InsufficientPrivileges = "InsufficientPrivileges";
    public static final java.lang.String _NoPrimaryAgentAvailable = "NoPrimaryAgentAvailable";
    public static final java.lang.String _Other = "Other";
    public static final java.lang.String _NoDatastoresConfigured = "NoDatastoresConfigured";
    public static final java.lang.String _CreateConfigVvolFailed = "CreateConfigVvolFailed";
    public static final java.lang.String _VSanNotSupportedOnHost = "VSanNotSupportedOnHost";
    public static final java.lang.String _DasNetworkMisconfiguration = "DasNetworkMisconfiguration";
    public static final DasConfigFaultDasConfigFaultReason HostNetworkMisconfiguration = new DasConfigFaultDasConfigFaultReason(_HostNetworkMisconfiguration);
    public static final DasConfigFaultDasConfigFaultReason HostMisconfiguration = new DasConfigFaultDasConfigFaultReason(_HostMisconfiguration);
    public static final DasConfigFaultDasConfigFaultReason InsufficientPrivileges = new DasConfigFaultDasConfigFaultReason(_InsufficientPrivileges);
    public static final DasConfigFaultDasConfigFaultReason NoPrimaryAgentAvailable = new DasConfigFaultDasConfigFaultReason(_NoPrimaryAgentAvailable);
    public static final DasConfigFaultDasConfigFaultReason Other = new DasConfigFaultDasConfigFaultReason(_Other);
    public static final DasConfigFaultDasConfigFaultReason NoDatastoresConfigured = new DasConfigFaultDasConfigFaultReason(_NoDatastoresConfigured);
    public static final DasConfigFaultDasConfigFaultReason CreateConfigVvolFailed = new DasConfigFaultDasConfigFaultReason(_CreateConfigVvolFailed);
    public static final DasConfigFaultDasConfigFaultReason VSanNotSupportedOnHost = new DasConfigFaultDasConfigFaultReason(_VSanNotSupportedOnHost);
    public static final DasConfigFaultDasConfigFaultReason DasNetworkMisconfiguration = new DasConfigFaultDasConfigFaultReason(_DasNetworkMisconfiguration);
    public java.lang.String getValue() { return _value_;}
    public static DasConfigFaultDasConfigFaultReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DasConfigFaultDasConfigFaultReason enumeration = (DasConfigFaultDasConfigFaultReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DasConfigFaultDasConfigFaultReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DasConfigFaultDasConfigFaultReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DasConfigFaultDasConfigFaultReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
