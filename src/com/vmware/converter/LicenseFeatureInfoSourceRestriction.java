/**
 * LicenseFeatureInfoSourceRestriction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class LicenseFeatureInfoSourceRestriction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LicenseFeatureInfoSourceRestriction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _unrestricted = "unrestricted";
    public static final java.lang.String _served = "served";
    public static final java.lang.String _file = "file";
    public static final LicenseFeatureInfoSourceRestriction unrestricted = new LicenseFeatureInfoSourceRestriction(_unrestricted);
    public static final LicenseFeatureInfoSourceRestriction served = new LicenseFeatureInfoSourceRestriction(_served);
    public static final LicenseFeatureInfoSourceRestriction file = new LicenseFeatureInfoSourceRestriction(_file);
    public java.lang.String getValue() { return _value_;}
    public static LicenseFeatureInfoSourceRestriction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LicenseFeatureInfoSourceRestriction enumeration = (LicenseFeatureInfoSourceRestriction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LicenseFeatureInfoSourceRestriction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LicenseFeatureInfoSourceRestriction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseFeatureInfoSourceRestriction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
