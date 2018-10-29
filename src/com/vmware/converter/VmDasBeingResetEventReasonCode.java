/**
 * VmDasBeingResetEventReasonCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmDasBeingResetEventReasonCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VmDasBeingResetEventReasonCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _vmtoolsHeartbeatFailure = "vmtoolsHeartbeatFailure";
    public static final java.lang.String _appHeartbeatFailure = "appHeartbeatFailure";
    public static final java.lang.String _appImmediateResetRequest = "appImmediateResetRequest";
    public static final java.lang.String _vmcpResetApdCleared = "vmcpResetApdCleared";
    public static final VmDasBeingResetEventReasonCode vmtoolsHeartbeatFailure = new VmDasBeingResetEventReasonCode(_vmtoolsHeartbeatFailure);
    public static final VmDasBeingResetEventReasonCode appHeartbeatFailure = new VmDasBeingResetEventReasonCode(_appHeartbeatFailure);
    public static final VmDasBeingResetEventReasonCode appImmediateResetRequest = new VmDasBeingResetEventReasonCode(_appImmediateResetRequest);
    public static final VmDasBeingResetEventReasonCode vmcpResetApdCleared = new VmDasBeingResetEventReasonCode(_vmcpResetApdCleared);
    public java.lang.String getValue() { return _value_;}
    public static VmDasBeingResetEventReasonCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VmDasBeingResetEventReasonCode enumeration = (VmDasBeingResetEventReasonCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VmDasBeingResetEventReasonCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VmDasBeingResetEventReasonCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmDasBeingResetEventReasonCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
