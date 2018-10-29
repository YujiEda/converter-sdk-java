/**
 * VmFaultToleranceConfigIssueReasonForIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmFaultToleranceConfigIssueReasonForIssue implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VmFaultToleranceConfigIssueReasonForIssue(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _haNotEnabled = "haNotEnabled";
    public static final java.lang.String _moreThanOneSecondary = "moreThanOneSecondary";
    public static final java.lang.String _recordReplayNotSupported = "recordReplayNotSupported";
    public static final java.lang.String _replayNotSupported = "replayNotSupported";
    public static final java.lang.String _templateVm = "templateVm";
    public static final java.lang.String _multipleVCPU = "multipleVCPU";
    public static final java.lang.String _hostInactive = "hostInactive";
    public static final java.lang.String _ftUnsupportedHardware = "ftUnsupportedHardware";
    public static final java.lang.String _ftUnsupportedProduct = "ftUnsupportedProduct";
    public static final java.lang.String _missingVMotionNic = "missingVMotionNic";
    public static final java.lang.String _missingFTLoggingNic = "missingFTLoggingNic";
    public static final java.lang.String _thinDisk = "thinDisk";
    public static final java.lang.String _verifySSLCertificateFlagNotSet = "verifySSLCertificateFlagNotSet";
    public static final java.lang.String _hasSnapshots = "hasSnapshots";
    public static final java.lang.String _noConfig = "noConfig";
    public static final java.lang.String _ftSecondaryVm = "ftSecondaryVm";
    public static final java.lang.String _hasLocalDisk = "hasLocalDisk";
    public static final java.lang.String _esxAgentVm = "esxAgentVm";
    public static final java.lang.String _video3dEnabled = "video3dEnabled";
    public static final java.lang.String _hasUnsupportedDisk = "hasUnsupportedDisk";
    public static final java.lang.String _insufficientBandwidth = "insufficientBandwidth";
    public static final java.lang.String _hasNestedHVConfiguration = "hasNestedHVConfiguration";
    public static final java.lang.String _hasVFlashConfiguration = "hasVFlashConfiguration";
    public static final java.lang.String _unsupportedProduct = "unsupportedProduct";
    public static final java.lang.String _cpuHvUnsupported = "cpuHvUnsupported";
    public static final java.lang.String _cpuHwmmuUnsupported = "cpuHwmmuUnsupported";
    public static final java.lang.String _cpuHvDisabled = "cpuHvDisabled";
    public static final java.lang.String _hasEFIFirmware = "hasEFIFirmware";
    public static final VmFaultToleranceConfigIssueReasonForIssue haNotEnabled = new VmFaultToleranceConfigIssueReasonForIssue(_haNotEnabled);
    public static final VmFaultToleranceConfigIssueReasonForIssue moreThanOneSecondary = new VmFaultToleranceConfigIssueReasonForIssue(_moreThanOneSecondary);
    public static final VmFaultToleranceConfigIssueReasonForIssue recordReplayNotSupported = new VmFaultToleranceConfigIssueReasonForIssue(_recordReplayNotSupported);
    public static final VmFaultToleranceConfigIssueReasonForIssue replayNotSupported = new VmFaultToleranceConfigIssueReasonForIssue(_replayNotSupported);
    public static final VmFaultToleranceConfigIssueReasonForIssue templateVm = new VmFaultToleranceConfigIssueReasonForIssue(_templateVm);
    public static final VmFaultToleranceConfigIssueReasonForIssue multipleVCPU = new VmFaultToleranceConfigIssueReasonForIssue(_multipleVCPU);
    public static final VmFaultToleranceConfigIssueReasonForIssue hostInactive = new VmFaultToleranceConfigIssueReasonForIssue(_hostInactive);
    public static final VmFaultToleranceConfigIssueReasonForIssue ftUnsupportedHardware = new VmFaultToleranceConfigIssueReasonForIssue(_ftUnsupportedHardware);
    public static final VmFaultToleranceConfigIssueReasonForIssue ftUnsupportedProduct = new VmFaultToleranceConfigIssueReasonForIssue(_ftUnsupportedProduct);
    public static final VmFaultToleranceConfigIssueReasonForIssue missingVMotionNic = new VmFaultToleranceConfigIssueReasonForIssue(_missingVMotionNic);
    public static final VmFaultToleranceConfigIssueReasonForIssue missingFTLoggingNic = new VmFaultToleranceConfigIssueReasonForIssue(_missingFTLoggingNic);
    public static final VmFaultToleranceConfigIssueReasonForIssue thinDisk = new VmFaultToleranceConfigIssueReasonForIssue(_thinDisk);
    public static final VmFaultToleranceConfigIssueReasonForIssue verifySSLCertificateFlagNotSet = new VmFaultToleranceConfigIssueReasonForIssue(_verifySSLCertificateFlagNotSet);
    public static final VmFaultToleranceConfigIssueReasonForIssue hasSnapshots = new VmFaultToleranceConfigIssueReasonForIssue(_hasSnapshots);
    public static final VmFaultToleranceConfigIssueReasonForIssue noConfig = new VmFaultToleranceConfigIssueReasonForIssue(_noConfig);
    public static final VmFaultToleranceConfigIssueReasonForIssue ftSecondaryVm = new VmFaultToleranceConfigIssueReasonForIssue(_ftSecondaryVm);
    public static final VmFaultToleranceConfigIssueReasonForIssue hasLocalDisk = new VmFaultToleranceConfigIssueReasonForIssue(_hasLocalDisk);
    public static final VmFaultToleranceConfigIssueReasonForIssue esxAgentVm = new VmFaultToleranceConfigIssueReasonForIssue(_esxAgentVm);
    public static final VmFaultToleranceConfigIssueReasonForIssue video3dEnabled = new VmFaultToleranceConfigIssueReasonForIssue(_video3dEnabled);
    public static final VmFaultToleranceConfigIssueReasonForIssue hasUnsupportedDisk = new VmFaultToleranceConfigIssueReasonForIssue(_hasUnsupportedDisk);
    public static final VmFaultToleranceConfigIssueReasonForIssue insufficientBandwidth = new VmFaultToleranceConfigIssueReasonForIssue(_insufficientBandwidth);
    public static final VmFaultToleranceConfigIssueReasonForIssue hasNestedHVConfiguration = new VmFaultToleranceConfigIssueReasonForIssue(_hasNestedHVConfiguration);
    public static final VmFaultToleranceConfigIssueReasonForIssue hasVFlashConfiguration = new VmFaultToleranceConfigIssueReasonForIssue(_hasVFlashConfiguration);
    public static final VmFaultToleranceConfigIssueReasonForIssue unsupportedProduct = new VmFaultToleranceConfigIssueReasonForIssue(_unsupportedProduct);
    public static final VmFaultToleranceConfigIssueReasonForIssue cpuHvUnsupported = new VmFaultToleranceConfigIssueReasonForIssue(_cpuHvUnsupported);
    public static final VmFaultToleranceConfigIssueReasonForIssue cpuHwmmuUnsupported = new VmFaultToleranceConfigIssueReasonForIssue(_cpuHwmmuUnsupported);
    public static final VmFaultToleranceConfigIssueReasonForIssue cpuHvDisabled = new VmFaultToleranceConfigIssueReasonForIssue(_cpuHvDisabled);
    public static final VmFaultToleranceConfigIssueReasonForIssue hasEFIFirmware = new VmFaultToleranceConfigIssueReasonForIssue(_hasEFIFirmware);
    public java.lang.String getValue() { return _value_;}
    public static VmFaultToleranceConfigIssueReasonForIssue fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VmFaultToleranceConfigIssueReasonForIssue enumeration = (VmFaultToleranceConfigIssueReasonForIssue)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VmFaultToleranceConfigIssueReasonForIssue fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VmFaultToleranceConfigIssueReasonForIssue.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmFaultToleranceConfigIssueReasonForIssue"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
