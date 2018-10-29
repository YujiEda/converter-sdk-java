/**
 * ReplicationVmConfigFaultReasonForFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmConfigFaultReasonForFault implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReplicationVmConfigFaultReasonForFault(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _incompatibleHwVersion = "incompatibleHwVersion";
    public static final java.lang.String _invalidVmReplicationId = "invalidVmReplicationId";
    public static final java.lang.String _invalidGenerationNumber = "invalidGenerationNumber";
    public static final java.lang.String _outOfBoundsRpoValue = "outOfBoundsRpoValue";
    public static final java.lang.String _invalidDestinationIpAddress = "invalidDestinationIpAddress";
    public static final java.lang.String _invalidDestinationPort = "invalidDestinationPort";
    public static final java.lang.String _invalidExtraVmOptions = "invalidExtraVmOptions";
    public static final java.lang.String _staleGenerationNumber = "staleGenerationNumber";
    public static final java.lang.String _reconfigureVmReplicationIdNotAllowed = "reconfigureVmReplicationIdNotAllowed";
    public static final java.lang.String _cannotRetrieveVmReplicationConfiguration = "cannotRetrieveVmReplicationConfiguration";
    public static final java.lang.String _replicationAlreadyEnabled = "replicationAlreadyEnabled";
    public static final java.lang.String _invalidPriorConfiguration = "invalidPriorConfiguration";
    public static final java.lang.String _replicationNotEnabled = "replicationNotEnabled";
    public static final java.lang.String _replicationConfigurationFailed = "replicationConfigurationFailed";
    public static final ReplicationVmConfigFaultReasonForFault incompatibleHwVersion = new ReplicationVmConfigFaultReasonForFault(_incompatibleHwVersion);
    public static final ReplicationVmConfigFaultReasonForFault invalidVmReplicationId = new ReplicationVmConfigFaultReasonForFault(_invalidVmReplicationId);
    public static final ReplicationVmConfigFaultReasonForFault invalidGenerationNumber = new ReplicationVmConfigFaultReasonForFault(_invalidGenerationNumber);
    public static final ReplicationVmConfigFaultReasonForFault outOfBoundsRpoValue = new ReplicationVmConfigFaultReasonForFault(_outOfBoundsRpoValue);
    public static final ReplicationVmConfigFaultReasonForFault invalidDestinationIpAddress = new ReplicationVmConfigFaultReasonForFault(_invalidDestinationIpAddress);
    public static final ReplicationVmConfigFaultReasonForFault invalidDestinationPort = new ReplicationVmConfigFaultReasonForFault(_invalidDestinationPort);
    public static final ReplicationVmConfigFaultReasonForFault invalidExtraVmOptions = new ReplicationVmConfigFaultReasonForFault(_invalidExtraVmOptions);
    public static final ReplicationVmConfigFaultReasonForFault staleGenerationNumber = new ReplicationVmConfigFaultReasonForFault(_staleGenerationNumber);
    public static final ReplicationVmConfigFaultReasonForFault reconfigureVmReplicationIdNotAllowed = new ReplicationVmConfigFaultReasonForFault(_reconfigureVmReplicationIdNotAllowed);
    public static final ReplicationVmConfigFaultReasonForFault cannotRetrieveVmReplicationConfiguration = new ReplicationVmConfigFaultReasonForFault(_cannotRetrieveVmReplicationConfiguration);
    public static final ReplicationVmConfigFaultReasonForFault replicationAlreadyEnabled = new ReplicationVmConfigFaultReasonForFault(_replicationAlreadyEnabled);
    public static final ReplicationVmConfigFaultReasonForFault invalidPriorConfiguration = new ReplicationVmConfigFaultReasonForFault(_invalidPriorConfiguration);
    public static final ReplicationVmConfigFaultReasonForFault replicationNotEnabled = new ReplicationVmConfigFaultReasonForFault(_replicationNotEnabled);
    public static final ReplicationVmConfigFaultReasonForFault replicationConfigurationFailed = new ReplicationVmConfigFaultReasonForFault(_replicationConfigurationFailed);
    public java.lang.String getValue() { return _value_;}
    public static ReplicationVmConfigFaultReasonForFault fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReplicationVmConfigFaultReasonForFault enumeration = (ReplicationVmConfigFaultReasonForFault)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReplicationVmConfigFaultReasonForFault fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReplicationVmConfigFaultReasonForFault.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmConfigFaultReasonForFault"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
