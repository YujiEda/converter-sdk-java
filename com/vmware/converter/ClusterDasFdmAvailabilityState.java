/**
 * ClusterDasFdmAvailabilityState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasFdmAvailabilityState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClusterDasFdmAvailabilityState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _uninitialized = "uninitialized";
    public static final java.lang.String _election = "election";
    public static final java.lang.String _master = "master";
    public static final java.lang.String _connectedToMaster = "connectedToMaster";
    public static final java.lang.String _networkPartitionedFromMaster = "networkPartitionedFromMaster";
    public static final java.lang.String _networkIsolated = "networkIsolated";
    public static final java.lang.String _hostDown = "hostDown";
    public static final java.lang.String _initializationError = "initializationError";
    public static final java.lang.String _uninitializationError = "uninitializationError";
    public static final java.lang.String _fdmUnreachable = "fdmUnreachable";
    public static final ClusterDasFdmAvailabilityState uninitialized = new ClusterDasFdmAvailabilityState(_uninitialized);
    public static final ClusterDasFdmAvailabilityState election = new ClusterDasFdmAvailabilityState(_election);
    public static final ClusterDasFdmAvailabilityState master = new ClusterDasFdmAvailabilityState(_master);
    public static final ClusterDasFdmAvailabilityState connectedToMaster = new ClusterDasFdmAvailabilityState(_connectedToMaster);
    public static final ClusterDasFdmAvailabilityState networkPartitionedFromMaster = new ClusterDasFdmAvailabilityState(_networkPartitionedFromMaster);
    public static final ClusterDasFdmAvailabilityState networkIsolated = new ClusterDasFdmAvailabilityState(_networkIsolated);
    public static final ClusterDasFdmAvailabilityState hostDown = new ClusterDasFdmAvailabilityState(_hostDown);
    public static final ClusterDasFdmAvailabilityState initializationError = new ClusterDasFdmAvailabilityState(_initializationError);
    public static final ClusterDasFdmAvailabilityState uninitializationError = new ClusterDasFdmAvailabilityState(_uninitializationError);
    public static final ClusterDasFdmAvailabilityState fdmUnreachable = new ClusterDasFdmAvailabilityState(_fdmUnreachable);
    public java.lang.String getValue() { return _value_;}
    public static ClusterDasFdmAvailabilityState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ClusterDasFdmAvailabilityState enumeration = (ClusterDasFdmAvailabilityState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClusterDasFdmAvailabilityState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ClusterDasFdmAvailabilityState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFdmAvailabilityState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
