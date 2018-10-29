/**
 * VMwareDVSTeamingMatchStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSTeamingMatchStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VMwareDVSTeamingMatchStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _iphashMatch = "iphashMatch";
    public static final java.lang.String _nonIphashMatch = "nonIphashMatch";
    public static final java.lang.String _iphashMismatch = "iphashMismatch";
    public static final java.lang.String _nonIphashMismatch = "nonIphashMismatch";
    public static final VMwareDVSTeamingMatchStatus iphashMatch = new VMwareDVSTeamingMatchStatus(_iphashMatch);
    public static final VMwareDVSTeamingMatchStatus nonIphashMatch = new VMwareDVSTeamingMatchStatus(_nonIphashMatch);
    public static final VMwareDVSTeamingMatchStatus iphashMismatch = new VMwareDVSTeamingMatchStatus(_iphashMismatch);
    public static final VMwareDVSTeamingMatchStatus nonIphashMismatch = new VMwareDVSTeamingMatchStatus(_nonIphashMismatch);
    public java.lang.String getValue() { return _value_;}
    public static VMwareDVSTeamingMatchStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VMwareDVSTeamingMatchStatus enumeration = (VMwareDVSTeamingMatchStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VMwareDVSTeamingMatchStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VMwareDVSTeamingMatchStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSTeamingMatchStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
