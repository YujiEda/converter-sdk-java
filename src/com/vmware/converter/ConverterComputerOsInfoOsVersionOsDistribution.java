/**
 * ConverterComputerOsInfoOsVersionOsDistribution.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfoOsVersionOsDistribution implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterComputerOsInfoOsVersionOsDistribution(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _otherDistro = "otherDistro";
    public static final java.lang.String _redHatDistro = "redHatDistro";
    public static final java.lang.String _redHatEnterpriseLinuxDistro = "redHatEnterpriseLinuxDistro";
    public static final java.lang.String _openSuseDistro = "openSuseDistro";
    public static final java.lang.String _suseLinuxEnterpriseDistro = "suseLinuxEnterpriseDistro";
    public static final java.lang.String _ubuntuDistro = "ubuntuDistro";
    public static final ConverterComputerOsInfoOsVersionOsDistribution otherDistro = new ConverterComputerOsInfoOsVersionOsDistribution(_otherDistro);
    public static final ConverterComputerOsInfoOsVersionOsDistribution redHatDistro = new ConverterComputerOsInfoOsVersionOsDistribution(_redHatDistro);
    public static final ConverterComputerOsInfoOsVersionOsDistribution redHatEnterpriseLinuxDistro = new ConverterComputerOsInfoOsVersionOsDistribution(_redHatEnterpriseLinuxDistro);
    public static final ConverterComputerOsInfoOsVersionOsDistribution openSuseDistro = new ConverterComputerOsInfoOsVersionOsDistribution(_openSuseDistro);
    public static final ConverterComputerOsInfoOsVersionOsDistribution suseLinuxEnterpriseDistro = new ConverterComputerOsInfoOsVersionOsDistribution(_suseLinuxEnterpriseDistro);
    public static final ConverterComputerOsInfoOsVersionOsDistribution ubuntuDistro = new ConverterComputerOsInfoOsVersionOsDistribution(_ubuntuDistro);
    public java.lang.String getValue() { return _value_;}
    public static ConverterComputerOsInfoOsVersionOsDistribution fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterComputerOsInfoOsVersionOsDistribution enumeration = (ConverterComputerOsInfoOsVersionOsDistribution)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterComputerOsInfoOsVersionOsDistribution fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfoOsVersionOsDistribution.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoOsVersionOsDistribution"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
