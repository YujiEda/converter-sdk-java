/**
 * ReplicationVmState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReplicationVmState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _paused = "paused";
    public static final java.lang.String _syncing = "syncing";
    public static final java.lang.String _idle = "idle";
    public static final java.lang.String _active = "active";
    public static final java.lang.String _error = "error";
    public static final ReplicationVmState none = new ReplicationVmState(_none);
    public static final ReplicationVmState paused = new ReplicationVmState(_paused);
    public static final ReplicationVmState syncing = new ReplicationVmState(_syncing);
    public static final ReplicationVmState idle = new ReplicationVmState(_idle);
    public static final ReplicationVmState active = new ReplicationVmState(_active);
    public static final ReplicationVmState error = new ReplicationVmState(_error);
    public java.lang.String getValue() { return _value_;}
    public static ReplicationVmState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReplicationVmState enumeration = (ReplicationVmState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReplicationVmState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReplicationVmState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
