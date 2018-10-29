/**
 * ActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MigrationV1 = "MigrationV1";
    public static final java.lang.String _VmPowerV1 = "VmPowerV1";
    public static final java.lang.String _HostPowerV1 = "HostPowerV1";
    public static final java.lang.String _HostMaintenanceV1 = "HostMaintenanceV1";
    public static final java.lang.String _StorageMigrationV1 = "StorageMigrationV1";
    public static final java.lang.String _StoragePlacementV1 = "StoragePlacementV1";
    public static final java.lang.String _PlacementV1 = "PlacementV1";
    public static final ActionType MigrationV1 = new ActionType(_MigrationV1);
    public static final ActionType VmPowerV1 = new ActionType(_VmPowerV1);
    public static final ActionType HostPowerV1 = new ActionType(_HostPowerV1);
    public static final ActionType HostMaintenanceV1 = new ActionType(_HostMaintenanceV1);
    public static final ActionType StorageMigrationV1 = new ActionType(_StorageMigrationV1);
    public static final ActionType StoragePlacementV1 = new ActionType(_StoragePlacementV1);
    public static final ActionType PlacementV1 = new ActionType(_PlacementV1);
    public java.lang.String getValue() { return _value_;}
    public static ActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionType enumeration = (ActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
