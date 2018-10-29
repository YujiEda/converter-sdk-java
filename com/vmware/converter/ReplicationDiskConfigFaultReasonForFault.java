/**
 * ReplicationDiskConfigFaultReasonForFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationDiskConfigFaultReasonForFault implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReplicationDiskConfigFaultReasonForFault(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _diskNotFound = "diskNotFound";
    public static final java.lang.String _diskTypeNotSupported = "diskTypeNotSupported";
    public static final java.lang.String _invalidDiskKey = "invalidDiskKey";
    public static final java.lang.String _invalidDiskReplicationId = "invalidDiskReplicationId";
    public static final java.lang.String _duplicateDiskReplicationId = "duplicateDiskReplicationId";
    public static final java.lang.String _invalidPersistentFilePath = "invalidPersistentFilePath";
    public static final java.lang.String _reconfigureDiskReplicationIdNotAllowed = "reconfigureDiskReplicationIdNotAllowed";
    public static final ReplicationDiskConfigFaultReasonForFault diskNotFound = new ReplicationDiskConfigFaultReasonForFault(_diskNotFound);
    public static final ReplicationDiskConfigFaultReasonForFault diskTypeNotSupported = new ReplicationDiskConfigFaultReasonForFault(_diskTypeNotSupported);
    public static final ReplicationDiskConfigFaultReasonForFault invalidDiskKey = new ReplicationDiskConfigFaultReasonForFault(_invalidDiskKey);
    public static final ReplicationDiskConfigFaultReasonForFault invalidDiskReplicationId = new ReplicationDiskConfigFaultReasonForFault(_invalidDiskReplicationId);
    public static final ReplicationDiskConfigFaultReasonForFault duplicateDiskReplicationId = new ReplicationDiskConfigFaultReasonForFault(_duplicateDiskReplicationId);
    public static final ReplicationDiskConfigFaultReasonForFault invalidPersistentFilePath = new ReplicationDiskConfigFaultReasonForFault(_invalidPersistentFilePath);
    public static final ReplicationDiskConfigFaultReasonForFault reconfigureDiskReplicationIdNotAllowed = new ReplicationDiskConfigFaultReasonForFault(_reconfigureDiskReplicationIdNotAllowed);
    public java.lang.String getValue() { return _value_;}
    public static ReplicationDiskConfigFaultReasonForFault fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReplicationDiskConfigFaultReasonForFault enumeration = (ReplicationDiskConfigFaultReasonForFault)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReplicationDiskConfigFaultReasonForFault fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReplicationDiskConfigFaultReasonForFault.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationDiskConfigFaultReasonForFault"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
