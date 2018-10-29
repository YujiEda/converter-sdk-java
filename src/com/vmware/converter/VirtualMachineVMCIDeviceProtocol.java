/**
 * VirtualMachineVMCIDeviceProtocol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVMCIDeviceProtocol implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineVMCIDeviceProtocol(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _hypervisor = "hypervisor";
    public static final java.lang.String _doorbell = "doorbell";
    public static final java.lang.String _queuepair = "queuepair";
    public static final java.lang.String _datagram = "datagram";
    public static final java.lang.String _stream = "stream";
    public static final java.lang.String _anyProtocol = "anyProtocol";
    public static final VirtualMachineVMCIDeviceProtocol hypervisor = new VirtualMachineVMCIDeviceProtocol(_hypervisor);
    public static final VirtualMachineVMCIDeviceProtocol doorbell = new VirtualMachineVMCIDeviceProtocol(_doorbell);
    public static final VirtualMachineVMCIDeviceProtocol queuepair = new VirtualMachineVMCIDeviceProtocol(_queuepair);
    public static final VirtualMachineVMCIDeviceProtocol datagram = new VirtualMachineVMCIDeviceProtocol(_datagram);
    public static final VirtualMachineVMCIDeviceProtocol stream = new VirtualMachineVMCIDeviceProtocol(_stream);
    public static final VirtualMachineVMCIDeviceProtocol anyProtocol = new VirtualMachineVMCIDeviceProtocol(_anyProtocol);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineVMCIDeviceProtocol fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineVMCIDeviceProtocol enumeration = (VirtualMachineVMCIDeviceProtocol)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineVMCIDeviceProtocol fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDeviceProtocol.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceProtocol"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
