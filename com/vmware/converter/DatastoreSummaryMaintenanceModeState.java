/**
 * DatastoreSummaryMaintenanceModeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DatastoreSummaryMaintenanceModeState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DatastoreSummaryMaintenanceModeState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _normal = "normal";
    public static final java.lang.String _enteringMaintenance = "enteringMaintenance";
    public static final java.lang.String _inMaintenance = "inMaintenance";
    public static final DatastoreSummaryMaintenanceModeState normal = new DatastoreSummaryMaintenanceModeState(_normal);
    public static final DatastoreSummaryMaintenanceModeState enteringMaintenance = new DatastoreSummaryMaintenanceModeState(_enteringMaintenance);
    public static final DatastoreSummaryMaintenanceModeState inMaintenance = new DatastoreSummaryMaintenanceModeState(_inMaintenance);
    public java.lang.String getValue() { return _value_;}
    public static DatastoreSummaryMaintenanceModeState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DatastoreSummaryMaintenanceModeState enumeration = (DatastoreSummaryMaintenanceModeState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DatastoreSummaryMaintenanceModeState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DatastoreSummaryMaintenanceModeState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreSummaryMaintenanceModeState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
