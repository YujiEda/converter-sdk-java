/**
 * HostCapabilityFtUnsupportedReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostCapabilityFtUnsupportedReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostCapabilityFtUnsupportedReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _vMotionNotLicensed = "vMotionNotLicensed";
    public static final java.lang.String _missingVMotionNic = "missingVMotionNic";
    public static final java.lang.String _missingFTLoggingNic = "missingFTLoggingNic";
    public static final java.lang.String _ftNotLicensed = "ftNotLicensed";
    public static final java.lang.String _haAgentIssue = "haAgentIssue";
    public static final java.lang.String _unsupportedProduct = "unsupportedProduct";
    public static final java.lang.String _cpuHvUnsupported = "cpuHvUnsupported";
    public static final java.lang.String _cpuHwmmuUnsupported = "cpuHwmmuUnsupported";
    public static final java.lang.String _cpuHvDisabled = "cpuHvDisabled";
    public static final HostCapabilityFtUnsupportedReason vMotionNotLicensed = new HostCapabilityFtUnsupportedReason(_vMotionNotLicensed);
    public static final HostCapabilityFtUnsupportedReason missingVMotionNic = new HostCapabilityFtUnsupportedReason(_missingVMotionNic);
    public static final HostCapabilityFtUnsupportedReason missingFTLoggingNic = new HostCapabilityFtUnsupportedReason(_missingFTLoggingNic);
    public static final HostCapabilityFtUnsupportedReason ftNotLicensed = new HostCapabilityFtUnsupportedReason(_ftNotLicensed);
    public static final HostCapabilityFtUnsupportedReason haAgentIssue = new HostCapabilityFtUnsupportedReason(_haAgentIssue);
    public static final HostCapabilityFtUnsupportedReason unsupportedProduct = new HostCapabilityFtUnsupportedReason(_unsupportedProduct);
    public static final HostCapabilityFtUnsupportedReason cpuHvUnsupported = new HostCapabilityFtUnsupportedReason(_cpuHvUnsupported);
    public static final HostCapabilityFtUnsupportedReason cpuHwmmuUnsupported = new HostCapabilityFtUnsupportedReason(_cpuHwmmuUnsupported);
    public static final HostCapabilityFtUnsupportedReason cpuHvDisabled = new HostCapabilityFtUnsupportedReason(_cpuHvDisabled);
    public java.lang.String getValue() { return _value_;}
    public static HostCapabilityFtUnsupportedReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostCapabilityFtUnsupportedReason enumeration = (HostCapabilityFtUnsupportedReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostCapabilityFtUnsupportedReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostCapabilityFtUnsupportedReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCapabilityFtUnsupportedReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
