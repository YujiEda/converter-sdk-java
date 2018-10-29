/**
 * GuestInfoAppStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestInfoAppStateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GuestInfoAppStateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _appStateOk = "appStateOk";
    public static final java.lang.String _appStateNeedReset = "appStateNeedReset";
    public static final GuestInfoAppStateType none = new GuestInfoAppStateType(_none);
    public static final GuestInfoAppStateType appStateOk = new GuestInfoAppStateType(_appStateOk);
    public static final GuestInfoAppStateType appStateNeedReset = new GuestInfoAppStateType(_appStateNeedReset);
    public java.lang.String getValue() { return _value_;}
    public static GuestInfoAppStateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GuestInfoAppStateType enumeration = (GuestInfoAppStateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GuestInfoAppStateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GuestInfoAppStateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestInfoAppStateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
