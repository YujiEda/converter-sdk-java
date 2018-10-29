/**
 * ConverterTargetVmSpecProductVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTargetVmSpecProductVersion implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterTargetVmSpecProductVersion(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _workstation7x = "workstation7x";
    public static final java.lang.String _workstation8x = "workstation8x";
    public static final java.lang.String _workstation9x = "workstation9x";
    public static final java.lang.String _workstation10x = "workstation10x";
    public static final java.lang.String _workstation11x = "workstation11x";
    public static final java.lang.String _player3x = "player3x";
    public static final java.lang.String _player4x = "player4x";
    public static final java.lang.String _player5x = "player5x";
    public static final java.lang.String _player6x = "player6x";
    public static final java.lang.String _player7x = "player7x";
    public static final java.lang.String _fusion3x = "fusion3x";
    public static final java.lang.String _fusion4x = "fusion4x";
    public static final java.lang.String _fusion5x = "fusion5x";
    public static final java.lang.String _fusion6x = "fusion6x";
    public static final java.lang.String _fusion7x = "fusion7x";
    public static final ConverterTargetVmSpecProductVersion workstation7x = new ConverterTargetVmSpecProductVersion(_workstation7x);
    public static final ConverterTargetVmSpecProductVersion workstation8x = new ConverterTargetVmSpecProductVersion(_workstation8x);
    public static final ConverterTargetVmSpecProductVersion workstation9x = new ConverterTargetVmSpecProductVersion(_workstation9x);
    public static final ConverterTargetVmSpecProductVersion workstation10x = new ConverterTargetVmSpecProductVersion(_workstation10x);
    public static final ConverterTargetVmSpecProductVersion workstation11x = new ConverterTargetVmSpecProductVersion(_workstation11x);
    public static final ConverterTargetVmSpecProductVersion player3x = new ConverterTargetVmSpecProductVersion(_player3x);
    public static final ConverterTargetVmSpecProductVersion player4x = new ConverterTargetVmSpecProductVersion(_player4x);
    public static final ConverterTargetVmSpecProductVersion player5x = new ConverterTargetVmSpecProductVersion(_player5x);
    public static final ConverterTargetVmSpecProductVersion player6x = new ConverterTargetVmSpecProductVersion(_player6x);
    public static final ConverterTargetVmSpecProductVersion player7x = new ConverterTargetVmSpecProductVersion(_player7x);
    public static final ConverterTargetVmSpecProductVersion fusion3x = new ConverterTargetVmSpecProductVersion(_fusion3x);
    public static final ConverterTargetVmSpecProductVersion fusion4x = new ConverterTargetVmSpecProductVersion(_fusion4x);
    public static final ConverterTargetVmSpecProductVersion fusion5x = new ConverterTargetVmSpecProductVersion(_fusion5x);
    public static final ConverterTargetVmSpecProductVersion fusion6x = new ConverterTargetVmSpecProductVersion(_fusion6x);
    public static final ConverterTargetVmSpecProductVersion fusion7x = new ConverterTargetVmSpecProductVersion(_fusion7x);
    public java.lang.String getValue() { return _value_;}
    public static ConverterTargetVmSpecProductVersion fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterTargetVmSpecProductVersion enumeration = (ConverterTargetVmSpecProductVersion)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterTargetVmSpecProductVersion fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterTargetVmSpecProductVersion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpecProductVersion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
