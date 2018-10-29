/**
 * ConverterComputerOsInfoOsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfoOsType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterComputerOsInfoOsType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _otherOs = "otherOs";
    public static final java.lang.String _windowsOs = "windowsOs";
    public static final java.lang.String _linuxOs = "linuxOs";
    public static final java.lang.String _solarisOs = "solarisOs";
    public static final ConverterComputerOsInfoOsType otherOs = new ConverterComputerOsInfoOsType(_otherOs);
    public static final ConverterComputerOsInfoOsType windowsOs = new ConverterComputerOsInfoOsType(_windowsOs);
    public static final ConverterComputerOsInfoOsType linuxOs = new ConverterComputerOsInfoOsType(_linuxOs);
    public static final ConverterComputerOsInfoOsType solarisOs = new ConverterComputerOsInfoOsType(_solarisOs);
    public java.lang.String getValue() { return _value_;}
    public static ConverterComputerOsInfoOsType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterComputerOsInfoOsType enumeration = (ConverterComputerOsInfoOsType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterComputerOsInfoOsType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfoOsType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoOsType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
