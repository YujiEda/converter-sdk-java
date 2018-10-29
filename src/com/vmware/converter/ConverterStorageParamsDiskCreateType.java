/**
 * ConverterStorageParamsDiskCreateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageParamsDiskCreateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterStorageParamsDiskCreateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _monolithicFlat = "monolithicFlat";
    public static final java.lang.String _monolithicSparse = "monolithicSparse";
    public static final java.lang.String _twoGbFlat = "twoGbFlat";
    public static final java.lang.String _twoGbSparse = "twoGbSparse";
    public static final java.lang.String _vmfsMonolithicFlat = "vmfsMonolithicFlat";
    public static final java.lang.String _vmfsMonolithicFlatThinProvisioned = "vmfsMonolithicFlatThinProvisioned";
    public static final java.lang.String _vmfsTwoGbFlat = "vmfsTwoGbFlat";
    public static final java.lang.String _vmfsTwoGbFlatThinProvisioned = "vmfsTwoGbFlatThinProvisioned";
    public static final java.lang.String _compressedVMDK = "compressedVMDK";
    public static final ConverterStorageParamsDiskCreateType monolithicFlat = new ConverterStorageParamsDiskCreateType(_monolithicFlat);
    public static final ConverterStorageParamsDiskCreateType monolithicSparse = new ConverterStorageParamsDiskCreateType(_monolithicSparse);
    public static final ConverterStorageParamsDiskCreateType twoGbFlat = new ConverterStorageParamsDiskCreateType(_twoGbFlat);
    public static final ConverterStorageParamsDiskCreateType twoGbSparse = new ConverterStorageParamsDiskCreateType(_twoGbSparse);
    public static final ConverterStorageParamsDiskCreateType vmfsMonolithicFlat = new ConverterStorageParamsDiskCreateType(_vmfsMonolithicFlat);
    public static final ConverterStorageParamsDiskCreateType vmfsMonolithicFlatThinProvisioned = new ConverterStorageParamsDiskCreateType(_vmfsMonolithicFlatThinProvisioned);
    public static final ConverterStorageParamsDiskCreateType vmfsTwoGbFlat = new ConverterStorageParamsDiskCreateType(_vmfsTwoGbFlat);
    public static final ConverterStorageParamsDiskCreateType vmfsTwoGbFlatThinProvisioned = new ConverterStorageParamsDiskCreateType(_vmfsTwoGbFlatThinProvisioned);
    public static final ConverterStorageParamsDiskCreateType compressedVMDK = new ConverterStorageParamsDiskCreateType(_compressedVMDK);
    public java.lang.String getValue() { return _value_;}
    public static ConverterStorageParamsDiskCreateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterStorageParamsDiskCreateType enumeration = (ConverterStorageParamsDiskCreateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterStorageParamsDiskCreateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterStorageParamsDiskCreateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsDiskCreateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
