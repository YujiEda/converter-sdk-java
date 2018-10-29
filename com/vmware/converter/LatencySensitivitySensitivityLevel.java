/**
 * LatencySensitivitySensitivityLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class LatencySensitivitySensitivityLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LatencySensitivitySensitivityLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _low = "low";
    public static final java.lang.String _normal = "normal";
    public static final java.lang.String _medium = "medium";
    public static final java.lang.String _high = "high";
    public static final java.lang.String _custom = "custom";
    public static final LatencySensitivitySensitivityLevel low = new LatencySensitivitySensitivityLevel(_low);
    public static final LatencySensitivitySensitivityLevel normal = new LatencySensitivitySensitivityLevel(_normal);
    public static final LatencySensitivitySensitivityLevel medium = new LatencySensitivitySensitivityLevel(_medium);
    public static final LatencySensitivitySensitivityLevel high = new LatencySensitivitySensitivityLevel(_high);
    public static final LatencySensitivitySensitivityLevel custom = new LatencySensitivitySensitivityLevel(_custom);
    public java.lang.String getValue() { return _value_;}
    public static LatencySensitivitySensitivityLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LatencySensitivitySensitivityLevel enumeration = (LatencySensitivitySensitivityLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LatencySensitivitySensitivityLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LatencySensitivitySensitivityLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LatencySensitivitySensitivityLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
