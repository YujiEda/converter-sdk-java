/**
 * VirtualMachineMemoryAllocationPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineMemoryAllocationPolicy implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineMemoryAllocationPolicy(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _swapNone = "swapNone";
    public static final java.lang.String _swapSome = "swapSome";
    public static final java.lang.String _swapMost = "swapMost";
    public static final VirtualMachineMemoryAllocationPolicy swapNone = new VirtualMachineMemoryAllocationPolicy(_swapNone);
    public static final VirtualMachineMemoryAllocationPolicy swapSome = new VirtualMachineMemoryAllocationPolicy(_swapSome);
    public static final VirtualMachineMemoryAllocationPolicy swapMost = new VirtualMachineMemoryAllocationPolicy(_swapMost);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineMemoryAllocationPolicy fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineMemoryAllocationPolicy enumeration = (VirtualMachineMemoryAllocationPolicy)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineMemoryAllocationPolicy fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineMemoryAllocationPolicy.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMemoryAllocationPolicy"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
