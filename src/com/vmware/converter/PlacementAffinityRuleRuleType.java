/**
 * PlacementAffinityRuleRuleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementAffinityRuleRuleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlacementAffinityRuleRuleType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _affinity = "affinity";
    public static final java.lang.String _antiAffinity = "antiAffinity";
    public static final java.lang.String _softAffinity = "softAffinity";
    public static final java.lang.String _softAntiAffinity = "softAntiAffinity";
    public static final PlacementAffinityRuleRuleType affinity = new PlacementAffinityRuleRuleType(_affinity);
    public static final PlacementAffinityRuleRuleType antiAffinity = new PlacementAffinityRuleRuleType(_antiAffinity);
    public static final PlacementAffinityRuleRuleType softAffinity = new PlacementAffinityRuleRuleType(_softAffinity);
    public static final PlacementAffinityRuleRuleType softAntiAffinity = new PlacementAffinityRuleRuleType(_softAntiAffinity);
    public java.lang.String getValue() { return _value_;}
    public static PlacementAffinityRuleRuleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlacementAffinityRuleRuleType enumeration = (PlacementAffinityRuleRuleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlacementAffinityRuleRuleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlacementAffinityRuleRuleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementAffinityRuleRuleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
