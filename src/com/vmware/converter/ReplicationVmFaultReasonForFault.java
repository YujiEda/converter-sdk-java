/**
 * ReplicationVmFaultReasonForFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmFaultReasonForFault implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReplicationVmFaultReasonForFault(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _notConfigured = "notConfigured";
    public static final java.lang.String _poweredOff = "poweredOff";
    public static final java.lang.String _suspended = "suspended";
    public static final java.lang.String _poweredOn = "poweredOn";
    public static final java.lang.String _offlineReplicating = "offlineReplicating";
    public static final java.lang.String _invalidState = "invalidState";
    public static final java.lang.String _invalidInstanceId = "invalidInstanceId";
    public static final ReplicationVmFaultReasonForFault notConfigured = new ReplicationVmFaultReasonForFault(_notConfigured);
    public static final ReplicationVmFaultReasonForFault poweredOff = new ReplicationVmFaultReasonForFault(_poweredOff);
    public static final ReplicationVmFaultReasonForFault suspended = new ReplicationVmFaultReasonForFault(_suspended);
    public static final ReplicationVmFaultReasonForFault poweredOn = new ReplicationVmFaultReasonForFault(_poweredOn);
    public static final ReplicationVmFaultReasonForFault offlineReplicating = new ReplicationVmFaultReasonForFault(_offlineReplicating);
    public static final ReplicationVmFaultReasonForFault invalidState = new ReplicationVmFaultReasonForFault(_invalidState);
    public static final ReplicationVmFaultReasonForFault invalidInstanceId = new ReplicationVmFaultReasonForFault(_invalidInstanceId);
    public java.lang.String getValue() { return _value_;}
    public static ReplicationVmFaultReasonForFault fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReplicationVmFaultReasonForFault enumeration = (ReplicationVmFaultReasonForFault)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReplicationVmFaultReasonForFault fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReplicationVmFaultReasonForFault.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmFaultReasonForFault"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
