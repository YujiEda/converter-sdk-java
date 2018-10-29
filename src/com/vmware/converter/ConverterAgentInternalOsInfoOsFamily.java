/**
 * ConverterAgentInternalOsInfoOsFamily.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalOsInfoOsFamily implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterAgentInternalOsInfoOsFamily(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_OS = "NO_OS";
    public static final java.lang.String _WINDOWS = "WINDOWS";
    public static final java.lang.String _WIN9X_DOS = "WIN9X_DOS";
    public static final java.lang.String _LINUX = "LINUX";
    public static final java.lang.String _NETWARE = "NETWARE";
    public static final java.lang.String _SOLARIS = "SOLARIS";
    public static final java.lang.String _FREEBSD = "FREEBSD";
    public static final java.lang.String _OS2 = "OS2";
    public static final java.lang.String _DARWIN = "DARWIN";
    public static final java.lang.String _OTHER = "OTHER";
    public static final ConverterAgentInternalOsInfoOsFamily NO_OS = new ConverterAgentInternalOsInfoOsFamily(_NO_OS);
    public static final ConverterAgentInternalOsInfoOsFamily WINDOWS = new ConverterAgentInternalOsInfoOsFamily(_WINDOWS);
    public static final ConverterAgentInternalOsInfoOsFamily WIN9X_DOS = new ConverterAgentInternalOsInfoOsFamily(_WIN9X_DOS);
    public static final ConverterAgentInternalOsInfoOsFamily LINUX = new ConverterAgentInternalOsInfoOsFamily(_LINUX);
    public static final ConverterAgentInternalOsInfoOsFamily NETWARE = new ConverterAgentInternalOsInfoOsFamily(_NETWARE);
    public static final ConverterAgentInternalOsInfoOsFamily SOLARIS = new ConverterAgentInternalOsInfoOsFamily(_SOLARIS);
    public static final ConverterAgentInternalOsInfoOsFamily FREEBSD = new ConverterAgentInternalOsInfoOsFamily(_FREEBSD);
    public static final ConverterAgentInternalOsInfoOsFamily OS2 = new ConverterAgentInternalOsInfoOsFamily(_OS2);
    public static final ConverterAgentInternalOsInfoOsFamily DARWIN = new ConverterAgentInternalOsInfoOsFamily(_DARWIN);
    public static final ConverterAgentInternalOsInfoOsFamily OTHER = new ConverterAgentInternalOsInfoOsFamily(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static ConverterAgentInternalOsInfoOsFamily fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterAgentInternalOsInfoOsFamily enumeration = (ConverterAgentInternalOsInfoOsFamily)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterAgentInternalOsInfoOsFamily fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalOsInfoOsFamily.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalOsInfoOsFamily"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
