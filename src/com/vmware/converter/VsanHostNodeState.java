/**
 * VsanHostNodeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostNodeState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VsanHostNodeState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _error = "error";
    public static final java.lang.String _disabled = "disabled";
    public static final java.lang.String _agent = "agent";
    public static final java.lang.String _master = "master";
    public static final java.lang.String _backup = "backup";
    public static final java.lang.String _starting = "starting";
    public static final java.lang.String _stopping = "stopping";
    public static final java.lang.String _enteringMaintenanceMode = "enteringMaintenanceMode";
    public static final java.lang.String _exitingMaintenanceMode = "exitingMaintenanceMode";
    public static final java.lang.String _decommissioning = "decommissioning";
    public static final VsanHostNodeState error = new VsanHostNodeState(_error);
    public static final VsanHostNodeState disabled = new VsanHostNodeState(_disabled);
    public static final VsanHostNodeState agent = new VsanHostNodeState(_agent);
    public static final VsanHostNodeState master = new VsanHostNodeState(_master);
    public static final VsanHostNodeState backup = new VsanHostNodeState(_backup);
    public static final VsanHostNodeState starting = new VsanHostNodeState(_starting);
    public static final VsanHostNodeState stopping = new VsanHostNodeState(_stopping);
    public static final VsanHostNodeState enteringMaintenanceMode = new VsanHostNodeState(_enteringMaintenanceMode);
    public static final VsanHostNodeState exitingMaintenanceMode = new VsanHostNodeState(_exitingMaintenanceMode);
    public static final VsanHostNodeState decommissioning = new VsanHostNodeState(_decommissioning);
    public java.lang.String getValue() { return _value_;}
    public static VsanHostNodeState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VsanHostNodeState enumeration = (VsanHostNodeState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VsanHostNodeState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VsanHostNodeState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostNodeState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
