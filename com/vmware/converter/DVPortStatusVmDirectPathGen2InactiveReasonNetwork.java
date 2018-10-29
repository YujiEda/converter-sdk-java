/**
 * DVPortStatusVmDirectPathGen2InactiveReasonNetwork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVPortStatusVmDirectPathGen2InactiveReasonNetwork implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DVPortStatusVmDirectPathGen2InactiveReasonNetwork(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _portNptIncompatibleDvs = "portNptIncompatibleDvs";
    public static final java.lang.String _portNptNoCompatibleNics = "portNptNoCompatibleNics";
    public static final java.lang.String _portNptNoVirtualFunctionsAvailable = "portNptNoVirtualFunctionsAvailable";
    public static final java.lang.String _portNptDisabledForPort = "portNptDisabledForPort";
    public static final DVPortStatusVmDirectPathGen2InactiveReasonNetwork portNptIncompatibleDvs = new DVPortStatusVmDirectPathGen2InactiveReasonNetwork(_portNptIncompatibleDvs);
    public static final DVPortStatusVmDirectPathGen2InactiveReasonNetwork portNptNoCompatibleNics = new DVPortStatusVmDirectPathGen2InactiveReasonNetwork(_portNptNoCompatibleNics);
    public static final DVPortStatusVmDirectPathGen2InactiveReasonNetwork portNptNoVirtualFunctionsAvailable = new DVPortStatusVmDirectPathGen2InactiveReasonNetwork(_portNptNoVirtualFunctionsAvailable);
    public static final DVPortStatusVmDirectPathGen2InactiveReasonNetwork portNptDisabledForPort = new DVPortStatusVmDirectPathGen2InactiveReasonNetwork(_portNptDisabledForPort);
    public java.lang.String getValue() { return _value_;}
    public static DVPortStatusVmDirectPathGen2InactiveReasonNetwork fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DVPortStatusVmDirectPathGen2InactiveReasonNetwork enumeration = (DVPortStatusVmDirectPathGen2InactiveReasonNetwork)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DVPortStatusVmDirectPathGen2InactiveReasonNetwork fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DVPortStatusVmDirectPathGen2InactiveReasonNetwork.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortStatusVmDirectPathGen2InactiveReasonNetwork"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
