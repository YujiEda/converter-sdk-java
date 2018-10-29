/**
 * PlacementAffinityRuleRuleScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementAffinityRuleRuleScope implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlacementAffinityRuleRuleScope(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _cluster = "cluster";
    public static final java.lang.String _host = "host";
    public static final java.lang.String _storagePod = "storagePod";
    public static final java.lang.String _datastore = "datastore";
    public static final PlacementAffinityRuleRuleScope cluster = new PlacementAffinityRuleRuleScope(_cluster);
    public static final PlacementAffinityRuleRuleScope host = new PlacementAffinityRuleRuleScope(_host);
    public static final PlacementAffinityRuleRuleScope storagePod = new PlacementAffinityRuleRuleScope(_storagePod);
    public static final PlacementAffinityRuleRuleScope datastore = new PlacementAffinityRuleRuleScope(_datastore);
    public java.lang.String getValue() { return _value_;}
    public static PlacementAffinityRuleRuleScope fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlacementAffinityRuleRuleScope enumeration = (PlacementAffinityRuleRuleScope)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlacementAffinityRuleRuleScope fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlacementAffinityRuleRuleScope.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementAffinityRuleRuleScope"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
