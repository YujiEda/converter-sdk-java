/**
 * VFlashModuleNotSupportedReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VFlashModuleNotSupportedReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VFlashModuleNotSupportedReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CacheModeNotSupported = "CacheModeNotSupported";
    public static final java.lang.String _CacheConsistencyTypeNotSupported = "CacheConsistencyTypeNotSupported";
    public static final java.lang.String _CacheBlockSizeNotSupported = "CacheBlockSizeNotSupported";
    public static final java.lang.String _CacheReservationNotSupported = "CacheReservationNotSupported";
    public static final java.lang.String _DiskSizeNotSupported = "DiskSizeNotSupported";
    public static final VFlashModuleNotSupportedReason CacheModeNotSupported = new VFlashModuleNotSupportedReason(_CacheModeNotSupported);
    public static final VFlashModuleNotSupportedReason CacheConsistencyTypeNotSupported = new VFlashModuleNotSupportedReason(_CacheConsistencyTypeNotSupported);
    public static final VFlashModuleNotSupportedReason CacheBlockSizeNotSupported = new VFlashModuleNotSupportedReason(_CacheBlockSizeNotSupported);
    public static final VFlashModuleNotSupportedReason CacheReservationNotSupported = new VFlashModuleNotSupportedReason(_CacheReservationNotSupported);
    public static final VFlashModuleNotSupportedReason DiskSizeNotSupported = new VFlashModuleNotSupportedReason(_DiskSizeNotSupported);
    public java.lang.String getValue() { return _value_;}
    public static VFlashModuleNotSupportedReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VFlashModuleNotSupportedReason enumeration = (VFlashModuleNotSupportedReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VFlashModuleNotSupportedReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VFlashModuleNotSupportedReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VFlashModuleNotSupportedReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
