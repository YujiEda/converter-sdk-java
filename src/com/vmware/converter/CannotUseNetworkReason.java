/**
 * CannotUseNetworkReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class CannotUseNetworkReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CannotUseNetworkReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NetworkReservationNotSupported = "NetworkReservationNotSupported";
    public static final java.lang.String _MismatchedNetworkPolicies = "MismatchedNetworkPolicies";
    public static final java.lang.String _MismatchedDvsVersionOrVendor = "MismatchedDvsVersionOrVendor";
    public static final java.lang.String _VMotionToUnsupportedNetworkType = "VMotionToUnsupportedNetworkType";
    public static final CannotUseNetworkReason NetworkReservationNotSupported = new CannotUseNetworkReason(_NetworkReservationNotSupported);
    public static final CannotUseNetworkReason MismatchedNetworkPolicies = new CannotUseNetworkReason(_MismatchedNetworkPolicies);
    public static final CannotUseNetworkReason MismatchedDvsVersionOrVendor = new CannotUseNetworkReason(_MismatchedDvsVersionOrVendor);
    public static final CannotUseNetworkReason VMotionToUnsupportedNetworkType = new CannotUseNetworkReason(_VMotionToUnsupportedNetworkType);
    public java.lang.String getValue() { return _value_;}
    public static CannotUseNetworkReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CannotUseNetworkReason enumeration = (CannotUseNetworkReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CannotUseNetworkReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CannotUseNetworkReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CannotUseNetworkReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
