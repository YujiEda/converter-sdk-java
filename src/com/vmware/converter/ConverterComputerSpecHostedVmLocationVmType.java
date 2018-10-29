/**
 * ConverterComputerSpecHostedVmLocationVmType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerSpecHostedVmLocationVmType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterComputerSpecHostedVmLocationVmType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _vmwareVM = "vmwareVM";
    public static final java.lang.String _microsoftVirtualPCVM = "microsoftVirtualPCVM";
    public static final java.lang.String _parallelsVM = "parallelsVM";
    public static final java.lang.String _vmwareVCBBackup = "vmwareVCBBackup";
    public static final java.lang.String _livestateBackup = "livestateBackup";
    public static final java.lang.String _shadowProtectBackup = "shadowProtectBackup";
    public static final java.lang.String _acronisBackup = "acronisBackup";
    public static final ConverterComputerSpecHostedVmLocationVmType vmwareVM = new ConverterComputerSpecHostedVmLocationVmType(_vmwareVM);
    public static final ConverterComputerSpecHostedVmLocationVmType microsoftVirtualPCVM = new ConverterComputerSpecHostedVmLocationVmType(_microsoftVirtualPCVM);
    public static final ConverterComputerSpecHostedVmLocationVmType parallelsVM = new ConverterComputerSpecHostedVmLocationVmType(_parallelsVM);
    public static final ConverterComputerSpecHostedVmLocationVmType vmwareVCBBackup = new ConverterComputerSpecHostedVmLocationVmType(_vmwareVCBBackup);
    public static final ConverterComputerSpecHostedVmLocationVmType livestateBackup = new ConverterComputerSpecHostedVmLocationVmType(_livestateBackup);
    public static final ConverterComputerSpecHostedVmLocationVmType shadowProtectBackup = new ConverterComputerSpecHostedVmLocationVmType(_shadowProtectBackup);
    public static final ConverterComputerSpecHostedVmLocationVmType acronisBackup = new ConverterComputerSpecHostedVmLocationVmType(_acronisBackup);
    public java.lang.String getValue() { return _value_;}
    public static ConverterComputerSpecHostedVmLocationVmType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterComputerSpecHostedVmLocationVmType enumeration = (ConverterComputerSpecHostedVmLocationVmType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterComputerSpecHostedVmLocationVmType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterComputerSpecHostedVmLocationVmType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpecHostedVmLocationVmType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
