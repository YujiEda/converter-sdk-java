/**
 * HostInternetScsiHbaStaticTargetTargetDiscoveryMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostInternetScsiHbaStaticTargetTargetDiscoveryMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _staticMethod = "staticMethod";
    public static final java.lang.String _sendTargetMethod = "sendTargetMethod";
    public static final java.lang.String _slpMethod = "slpMethod";
    public static final java.lang.String _isnsMethod = "isnsMethod";
    public static final java.lang.String _unknownMethod = "unknownMethod";
    public static final HostInternetScsiHbaStaticTargetTargetDiscoveryMethod staticMethod = new HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(_staticMethod);
    public static final HostInternetScsiHbaStaticTargetTargetDiscoveryMethod sendTargetMethod = new HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(_sendTargetMethod);
    public static final HostInternetScsiHbaStaticTargetTargetDiscoveryMethod slpMethod = new HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(_slpMethod);
    public static final HostInternetScsiHbaStaticTargetTargetDiscoveryMethod isnsMethod = new HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(_isnsMethod);
    public static final HostInternetScsiHbaStaticTargetTargetDiscoveryMethod unknownMethod = new HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(_unknownMethod);
    public java.lang.String getValue() { return _value_;}
    public static HostInternetScsiHbaStaticTargetTargetDiscoveryMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostInternetScsiHbaStaticTargetTargetDiscoveryMethod enumeration = (HostInternetScsiHbaStaticTargetTargetDiscoveryMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostInternetScsiHbaStaticTargetTargetDiscoveryMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaStaticTargetTargetDiscoveryMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaStaticTargetTargetDiscoveryMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
