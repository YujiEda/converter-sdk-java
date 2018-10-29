/**
 * MultipathState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class MultipathState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MultipathState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _standby = "standby";
    public static final java.lang.String _active = "active";
    public static final java.lang.String _disabled = "disabled";
    public static final java.lang.String _dead = "dead";
    public static final java.lang.String _unknown = "unknown";
    public static final MultipathState standby = new MultipathState(_standby);
    public static final MultipathState active = new MultipathState(_active);
    public static final MultipathState disabled = new MultipathState(_disabled);
    public static final MultipathState dead = new MultipathState(_dead);
    public static final MultipathState unknown = new MultipathState(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static MultipathState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MultipathState enumeration = (MultipathState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MultipathState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MultipathState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MultipathState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
