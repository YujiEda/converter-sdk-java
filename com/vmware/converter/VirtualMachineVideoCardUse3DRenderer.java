/**
 * VirtualMachineVideoCardUse3DRenderer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVideoCardUse3DRenderer implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineVideoCardUse3DRenderer(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _automatic = "automatic";
    public static final java.lang.String _software = "software";
    public static final java.lang.String _hardware = "hardware";
    public static final VirtualMachineVideoCardUse3DRenderer automatic = new VirtualMachineVideoCardUse3DRenderer(_automatic);
    public static final VirtualMachineVideoCardUse3DRenderer software = new VirtualMachineVideoCardUse3DRenderer(_software);
    public static final VirtualMachineVideoCardUse3DRenderer hardware = new VirtualMachineVideoCardUse3DRenderer(_hardware);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineVideoCardUse3DRenderer fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineVideoCardUse3DRenderer enumeration = (VirtualMachineVideoCardUse3DRenderer)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineVideoCardUse3DRenderer fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineVideoCardUse3DRenderer.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVideoCardUse3dRenderer"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
