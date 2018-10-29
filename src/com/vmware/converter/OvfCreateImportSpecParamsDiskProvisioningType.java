/**
 * OvfCreateImportSpecParamsDiskProvisioningType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfCreateImportSpecParamsDiskProvisioningType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OvfCreateImportSpecParamsDiskProvisioningType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _monolithicSparse = "monolithicSparse";
    public static final java.lang.String _monolithicFlat = "monolithicFlat";
    public static final java.lang.String _twoGbMaxExtentSparse = "twoGbMaxExtentSparse";
    public static final java.lang.String _twoGbMaxExtentFlat = "twoGbMaxExtentFlat";
    public static final java.lang.String _thin = "thin";
    public static final java.lang.String _thick = "thick";
    public static final java.lang.String _seSparse = "seSparse";
    public static final java.lang.String _eagerZeroedThick = "eagerZeroedThick";
    public static final java.lang.String _sparse = "sparse";
    public static final java.lang.String _flat = "flat";
    public static final OvfCreateImportSpecParamsDiskProvisioningType monolithicSparse = new OvfCreateImportSpecParamsDiskProvisioningType(_monolithicSparse);
    public static final OvfCreateImportSpecParamsDiskProvisioningType monolithicFlat = new OvfCreateImportSpecParamsDiskProvisioningType(_monolithicFlat);
    public static final OvfCreateImportSpecParamsDiskProvisioningType twoGbMaxExtentSparse = new OvfCreateImportSpecParamsDiskProvisioningType(_twoGbMaxExtentSparse);
    public static final OvfCreateImportSpecParamsDiskProvisioningType twoGbMaxExtentFlat = new OvfCreateImportSpecParamsDiskProvisioningType(_twoGbMaxExtentFlat);
    public static final OvfCreateImportSpecParamsDiskProvisioningType thin = new OvfCreateImportSpecParamsDiskProvisioningType(_thin);
    public static final OvfCreateImportSpecParamsDiskProvisioningType thick = new OvfCreateImportSpecParamsDiskProvisioningType(_thick);
    public static final OvfCreateImportSpecParamsDiskProvisioningType seSparse = new OvfCreateImportSpecParamsDiskProvisioningType(_seSparse);
    public static final OvfCreateImportSpecParamsDiskProvisioningType eagerZeroedThick = new OvfCreateImportSpecParamsDiskProvisioningType(_eagerZeroedThick);
    public static final OvfCreateImportSpecParamsDiskProvisioningType sparse = new OvfCreateImportSpecParamsDiskProvisioningType(_sparse);
    public static final OvfCreateImportSpecParamsDiskProvisioningType flat = new OvfCreateImportSpecParamsDiskProvisioningType(_flat);
    public java.lang.String getValue() { return _value_;}
    public static OvfCreateImportSpecParamsDiskProvisioningType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OvfCreateImportSpecParamsDiskProvisioningType enumeration = (OvfCreateImportSpecParamsDiskProvisioningType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OvfCreateImportSpecParamsDiskProvisioningType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OvfCreateImportSpecParamsDiskProvisioningType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfCreateImportSpecParamsDiskProvisioningType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
