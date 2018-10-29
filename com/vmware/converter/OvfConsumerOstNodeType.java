/**
 * OvfConsumerOstNodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfConsumerOstNodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OvfConsumerOstNodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _envelope = "envelope";
    public static final java.lang.String _virtualSystem = "virtualSystem";
    public static final java.lang.String _virtualSystemCollection = "virtualSystemCollection";
    public static final OvfConsumerOstNodeType envelope = new OvfConsumerOstNodeType(_envelope);
    public static final OvfConsumerOstNodeType virtualSystem = new OvfConsumerOstNodeType(_virtualSystem);
    public static final OvfConsumerOstNodeType virtualSystemCollection = new OvfConsumerOstNodeType(_virtualSystemCollection);
    public java.lang.String getValue() { return _value_;}
    public static OvfConsumerOstNodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OvfConsumerOstNodeType enumeration = (OvfConsumerOstNodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OvfConsumerOstNodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OvfConsumerOstNodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerOstNodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
