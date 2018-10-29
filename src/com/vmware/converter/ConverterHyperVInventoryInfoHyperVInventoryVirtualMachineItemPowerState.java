/**
 * ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _poweredOn = "poweredOn";
    public static final java.lang.String _poweredOff = "poweredOff";
    public static final java.lang.String _suspended = "suspended";
    public static final java.lang.String _busy = "busy";
    public static final java.lang.String _unknown = "unknown";
    public static final ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState poweredOn = new ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState(_poweredOn);
    public static final ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState poweredOff = new ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState(_poweredOff);
    public static final ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState suspended = new ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState(_suspended);
    public static final ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState busy = new ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState(_busy);
    public static final ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState unknown = new ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState enumeration = (ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItemPowerState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
