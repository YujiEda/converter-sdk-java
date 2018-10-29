/**
 * VirtualMachineToolsVersionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineToolsVersionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineToolsVersionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _guestToolsNotInstalled = "guestToolsNotInstalled";
    public static final java.lang.String _guestToolsNeedUpgrade = "guestToolsNeedUpgrade";
    public static final java.lang.String _guestToolsCurrent = "guestToolsCurrent";
    public static final java.lang.String _guestToolsUnmanaged = "guestToolsUnmanaged";
    public static final java.lang.String _guestToolsTooOld = "guestToolsTooOld";
    public static final java.lang.String _guestToolsSupportedOld = "guestToolsSupportedOld";
    public static final java.lang.String _guestToolsSupportedNew = "guestToolsSupportedNew";
    public static final java.lang.String _guestToolsTooNew = "guestToolsTooNew";
    public static final java.lang.String _guestToolsBlacklisted = "guestToolsBlacklisted";
    public static final VirtualMachineToolsVersionStatus guestToolsNotInstalled = new VirtualMachineToolsVersionStatus(_guestToolsNotInstalled);
    public static final VirtualMachineToolsVersionStatus guestToolsNeedUpgrade = new VirtualMachineToolsVersionStatus(_guestToolsNeedUpgrade);
    public static final VirtualMachineToolsVersionStatus guestToolsCurrent = new VirtualMachineToolsVersionStatus(_guestToolsCurrent);
    public static final VirtualMachineToolsVersionStatus guestToolsUnmanaged = new VirtualMachineToolsVersionStatus(_guestToolsUnmanaged);
    public static final VirtualMachineToolsVersionStatus guestToolsTooOld = new VirtualMachineToolsVersionStatus(_guestToolsTooOld);
    public static final VirtualMachineToolsVersionStatus guestToolsSupportedOld = new VirtualMachineToolsVersionStatus(_guestToolsSupportedOld);
    public static final VirtualMachineToolsVersionStatus guestToolsSupportedNew = new VirtualMachineToolsVersionStatus(_guestToolsSupportedNew);
    public static final VirtualMachineToolsVersionStatus guestToolsTooNew = new VirtualMachineToolsVersionStatus(_guestToolsTooNew);
    public static final VirtualMachineToolsVersionStatus guestToolsBlacklisted = new VirtualMachineToolsVersionStatus(_guestToolsBlacklisted);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineToolsVersionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineToolsVersionStatus enumeration = (VirtualMachineToolsVersionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineToolsVersionStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineToolsVersionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineToolsVersionStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
