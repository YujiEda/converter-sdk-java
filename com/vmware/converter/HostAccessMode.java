/**
 * HostAccessMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostAccessMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostAccessMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _accessNone = "accessNone";
    public static final java.lang.String _accessAdmin = "accessAdmin";
    public static final java.lang.String _accessNoAccess = "accessNoAccess";
    public static final java.lang.String _accessReadOnly = "accessReadOnly";
    public static final java.lang.String _accessOther = "accessOther";
    public static final HostAccessMode accessNone = new HostAccessMode(_accessNone);
    public static final HostAccessMode accessAdmin = new HostAccessMode(_accessAdmin);
    public static final HostAccessMode accessNoAccess = new HostAccessMode(_accessNoAccess);
    public static final HostAccessMode accessReadOnly = new HostAccessMode(_accessReadOnly);
    public static final HostAccessMode accessOther = new HostAccessMode(_accessOther);
    public java.lang.String getValue() { return _value_;}
    public static HostAccessMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostAccessMode enumeration = (HostAccessMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostAccessMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostAccessMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccessMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
