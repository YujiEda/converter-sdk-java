/**
 * HostActiveDirectoryInfoDomainMembershipStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostActiveDirectoryInfoDomainMembershipStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostActiveDirectoryInfoDomainMembershipStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _unknown = "unknown";
    public static final java.lang.String _ok = "ok";
    public static final java.lang.String _noServers = "noServers";
    public static final java.lang.String _clientTrustBroken = "clientTrustBroken";
    public static final java.lang.String _serverTrustBroken = "serverTrustBroken";
    public static final java.lang.String _inconsistentTrust = "inconsistentTrust";
    public static final java.lang.String _otherProblem = "otherProblem";
    public static final HostActiveDirectoryInfoDomainMembershipStatus unknown = new HostActiveDirectoryInfoDomainMembershipStatus(_unknown);
    public static final HostActiveDirectoryInfoDomainMembershipStatus ok = new HostActiveDirectoryInfoDomainMembershipStatus(_ok);
    public static final HostActiveDirectoryInfoDomainMembershipStatus noServers = new HostActiveDirectoryInfoDomainMembershipStatus(_noServers);
    public static final HostActiveDirectoryInfoDomainMembershipStatus clientTrustBroken = new HostActiveDirectoryInfoDomainMembershipStatus(_clientTrustBroken);
    public static final HostActiveDirectoryInfoDomainMembershipStatus serverTrustBroken = new HostActiveDirectoryInfoDomainMembershipStatus(_serverTrustBroken);
    public static final HostActiveDirectoryInfoDomainMembershipStatus inconsistentTrust = new HostActiveDirectoryInfoDomainMembershipStatus(_inconsistentTrust);
    public static final HostActiveDirectoryInfoDomainMembershipStatus otherProblem = new HostActiveDirectoryInfoDomainMembershipStatus(_otherProblem);
    public java.lang.String getValue() { return _value_;}
    public static HostActiveDirectoryInfoDomainMembershipStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostActiveDirectoryInfoDomainMembershipStatus enumeration = (HostActiveDirectoryInfoDomainMembershipStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostActiveDirectoryInfoDomainMembershipStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostActiveDirectoryInfoDomainMembershipStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostActiveDirectoryInfoDomainMembershipStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
