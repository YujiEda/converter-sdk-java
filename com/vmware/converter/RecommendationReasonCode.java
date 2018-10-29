/**
 * RecommendationReasonCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RecommendationReasonCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RecommendationReasonCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _fairnessCpuAvg = "fairnessCpuAvg";
    public static final java.lang.String _fairnessMemAvg = "fairnessMemAvg";
    public static final java.lang.String _jointAffin = "jointAffin";
    public static final java.lang.String _antiAffin = "antiAffin";
    public static final java.lang.String _hostMaint = "hostMaint";
    public static final java.lang.String _enterStandby = "enterStandby";
    public static final java.lang.String _reservationCpu = "reservationCpu";
    public static final java.lang.String _reservationMem = "reservationMem";
    public static final java.lang.String _powerOnVm = "powerOnVm";
    public static final java.lang.String _powerSaving = "powerSaving";
    public static final java.lang.String _increaseCapacity = "increaseCapacity";
    public static final java.lang.String _checkResource = "checkResource";
    public static final java.lang.String _unreservedCapacity = "unreservedCapacity";
    public static final java.lang.String _vmHostHardAffinity = "vmHostHardAffinity";
    public static final java.lang.String _vmHostSoftAffinity = "vmHostSoftAffinity";
    public static final java.lang.String _balanceDatastoreSpaceUsage = "balanceDatastoreSpaceUsage";
    public static final java.lang.String _balanceDatastoreIOLoad = "balanceDatastoreIOLoad";
    public static final java.lang.String _balanceDatastoreIOPSReservation = "balanceDatastoreIOPSReservation";
    public static final java.lang.String _datastoreMaint = "datastoreMaint";
    public static final java.lang.String _virtualDiskJointAffin = "virtualDiskJointAffin";
    public static final java.lang.String _virtualDiskAntiAffin = "virtualDiskAntiAffin";
    public static final java.lang.String _datastoreSpaceOutage = "datastoreSpaceOutage";
    public static final java.lang.String _storagePlacement = "storagePlacement";
    public static final java.lang.String _iolbDisabledInternal = "iolbDisabledInternal";
    public static final java.lang.String _xvmotionPlacement = "xvmotionPlacement";
    public static final java.lang.String _networkBandwidthReservation = "networkBandwidthReservation";
    public static final RecommendationReasonCode fairnessCpuAvg = new RecommendationReasonCode(_fairnessCpuAvg);
    public static final RecommendationReasonCode fairnessMemAvg = new RecommendationReasonCode(_fairnessMemAvg);
    public static final RecommendationReasonCode jointAffin = new RecommendationReasonCode(_jointAffin);
    public static final RecommendationReasonCode antiAffin = new RecommendationReasonCode(_antiAffin);
    public static final RecommendationReasonCode hostMaint = new RecommendationReasonCode(_hostMaint);
    public static final RecommendationReasonCode enterStandby = new RecommendationReasonCode(_enterStandby);
    public static final RecommendationReasonCode reservationCpu = new RecommendationReasonCode(_reservationCpu);
    public static final RecommendationReasonCode reservationMem = new RecommendationReasonCode(_reservationMem);
    public static final RecommendationReasonCode powerOnVm = new RecommendationReasonCode(_powerOnVm);
    public static final RecommendationReasonCode powerSaving = new RecommendationReasonCode(_powerSaving);
    public static final RecommendationReasonCode increaseCapacity = new RecommendationReasonCode(_increaseCapacity);
    public static final RecommendationReasonCode checkResource = new RecommendationReasonCode(_checkResource);
    public static final RecommendationReasonCode unreservedCapacity = new RecommendationReasonCode(_unreservedCapacity);
    public static final RecommendationReasonCode vmHostHardAffinity = new RecommendationReasonCode(_vmHostHardAffinity);
    public static final RecommendationReasonCode vmHostSoftAffinity = new RecommendationReasonCode(_vmHostSoftAffinity);
    public static final RecommendationReasonCode balanceDatastoreSpaceUsage = new RecommendationReasonCode(_balanceDatastoreSpaceUsage);
    public static final RecommendationReasonCode balanceDatastoreIOLoad = new RecommendationReasonCode(_balanceDatastoreIOLoad);
    public static final RecommendationReasonCode balanceDatastoreIOPSReservation = new RecommendationReasonCode(_balanceDatastoreIOPSReservation);
    public static final RecommendationReasonCode datastoreMaint = new RecommendationReasonCode(_datastoreMaint);
    public static final RecommendationReasonCode virtualDiskJointAffin = new RecommendationReasonCode(_virtualDiskJointAffin);
    public static final RecommendationReasonCode virtualDiskAntiAffin = new RecommendationReasonCode(_virtualDiskAntiAffin);
    public static final RecommendationReasonCode datastoreSpaceOutage = new RecommendationReasonCode(_datastoreSpaceOutage);
    public static final RecommendationReasonCode storagePlacement = new RecommendationReasonCode(_storagePlacement);
    public static final RecommendationReasonCode iolbDisabledInternal = new RecommendationReasonCode(_iolbDisabledInternal);
    public static final RecommendationReasonCode xvmotionPlacement = new RecommendationReasonCode(_xvmotionPlacement);
    public static final RecommendationReasonCode networkBandwidthReservation = new RecommendationReasonCode(_networkBandwidthReservation);
    public java.lang.String getValue() { return _value_;}
    public static RecommendationReasonCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RecommendationReasonCode enumeration = (RecommendationReasonCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RecommendationReasonCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RecommendationReasonCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RecommendationReasonCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
