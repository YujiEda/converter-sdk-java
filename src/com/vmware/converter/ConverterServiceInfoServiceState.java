/**
 * ConverterServiceInfoServiceState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServiceInfoServiceState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterServiceInfoServiceState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _stopped = "stopped";
    public static final java.lang.String _startPending = "startPending";
    public static final java.lang.String _stopPending = "stopPending";
    public static final java.lang.String _running = "running";
    public static final java.lang.String _continuePending = "continuePending";
    public static final java.lang.String _pausePending = "pausePending";
    public static final java.lang.String _paused = "paused";
    public static final ConverterServiceInfoServiceState stopped = new ConverterServiceInfoServiceState(_stopped);
    public static final ConverterServiceInfoServiceState startPending = new ConverterServiceInfoServiceState(_startPending);
    public static final ConverterServiceInfoServiceState stopPending = new ConverterServiceInfoServiceState(_stopPending);
    public static final ConverterServiceInfoServiceState running = new ConverterServiceInfoServiceState(_running);
    public static final ConverterServiceInfoServiceState continuePending = new ConverterServiceInfoServiceState(_continuePending);
    public static final ConverterServiceInfoServiceState pausePending = new ConverterServiceInfoServiceState(_pausePending);
    public static final ConverterServiceInfoServiceState paused = new ConverterServiceInfoServiceState(_paused);
    public java.lang.String getValue() { return _value_;}
    public static ConverterServiceInfoServiceState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterServiceInfoServiceState enumeration = (ConverterServiceInfoServiceState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterServiceInfoServiceState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterServiceInfoServiceState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceInfoServiceState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
