/**
 * EVCMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EVCMode  extends com.vmware.converter.ElementDescription  implements java.io.Serializable {
    private com.vmware.converter.HostCpuIdInfo[] guaranteedCPUFeatures;

    private com.vmware.converter.HostFeatureCapability[] featureCapability;

    private com.vmware.converter.HostFeatureMask[] featureMask;

    private com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement;

    private java.lang.String vendor;

    private java.lang.String[] track;

    private int vendorTier;

    public EVCMode() {
    }

    public EVCMode(
           java.lang.String label,
           java.lang.String summary,
           java.lang.String key,
           com.vmware.converter.HostCpuIdInfo[] guaranteedCPUFeatures,
           com.vmware.converter.HostFeatureCapability[] featureCapability,
           com.vmware.converter.HostFeatureMask[] featureMask,
           com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement,
           java.lang.String vendor,
           java.lang.String[] track,
           int vendorTier) {
        super(
            label,
            summary,
            key);
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
        this.featureCapability = featureCapability;
        this.featureMask = featureMask;
        this.featureRequirement = featureRequirement;
        this.vendor = vendor;
        this.track = track;
        this.vendorTier = vendorTier;
    }


    /**
     * Gets the guaranteedCPUFeatures value for this EVCMode.
     * 
     * @return guaranteedCPUFeatures
     */
    public com.vmware.converter.HostCpuIdInfo[] getGuaranteedCPUFeatures() {
        return guaranteedCPUFeatures;
    }


    /**
     * Sets the guaranteedCPUFeatures value for this EVCMode.
     * 
     * @param guaranteedCPUFeatures
     */
    public void setGuaranteedCPUFeatures(com.vmware.converter.HostCpuIdInfo[] guaranteedCPUFeatures) {
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
    }

    public com.vmware.converter.HostCpuIdInfo getGuaranteedCPUFeatures(int i) {
        return this.guaranteedCPUFeatures[i];
    }

    public void setGuaranteedCPUFeatures(int i, com.vmware.converter.HostCpuIdInfo _value) {
        this.guaranteedCPUFeatures[i] = _value;
    }


    /**
     * Gets the featureCapability value for this EVCMode.
     * 
     * @return featureCapability
     */
    public com.vmware.converter.HostFeatureCapability[] getFeatureCapability() {
        return featureCapability;
    }


    /**
     * Sets the featureCapability value for this EVCMode.
     * 
     * @param featureCapability
     */
    public void setFeatureCapability(com.vmware.converter.HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
    }

    public com.vmware.converter.HostFeatureCapability getFeatureCapability(int i) {
        return this.featureCapability[i];
    }

    public void setFeatureCapability(int i, com.vmware.converter.HostFeatureCapability _value) {
        this.featureCapability[i] = _value;
    }


    /**
     * Gets the featureMask value for this EVCMode.
     * 
     * @return featureMask
     */
    public com.vmware.converter.HostFeatureMask[] getFeatureMask() {
        return featureMask;
    }


    /**
     * Sets the featureMask value for this EVCMode.
     * 
     * @param featureMask
     */
    public void setFeatureMask(com.vmware.converter.HostFeatureMask[] featureMask) {
        this.featureMask = featureMask;
    }

    public com.vmware.converter.HostFeatureMask getFeatureMask(int i) {
        return this.featureMask[i];
    }

    public void setFeatureMask(int i, com.vmware.converter.HostFeatureMask _value) {
        this.featureMask[i] = _value;
    }


    /**
     * Gets the featureRequirement value for this EVCMode.
     * 
     * @return featureRequirement
     */
    public com.vmware.converter.VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return featureRequirement;
    }


    /**
     * Sets the featureRequirement value for this EVCMode.
     * 
     * @param featureRequirement
     */
    public void setFeatureRequirement(com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public com.vmware.converter.VirtualMachineFeatureRequirement getFeatureRequirement(int i) {
        return this.featureRequirement[i];
    }

    public void setFeatureRequirement(int i, com.vmware.converter.VirtualMachineFeatureRequirement _value) {
        this.featureRequirement[i] = _value;
    }


    /**
     * Gets the vendor value for this EVCMode.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this EVCMode.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the track value for this EVCMode.
     * 
     * @return track
     */
    public java.lang.String[] getTrack() {
        return track;
    }


    /**
     * Sets the track value for this EVCMode.
     * 
     * @param track
     */
    public void setTrack(java.lang.String[] track) {
        this.track = track;
    }

    public java.lang.String getTrack(int i) {
        return this.track[i];
    }

    public void setTrack(int i, java.lang.String _value) {
        this.track[i] = _value;
    }


    /**
     * Gets the vendorTier value for this EVCMode.
     * 
     * @return vendorTier
     */
    public int getVendorTier() {
        return vendorTier;
    }


    /**
     * Sets the vendorTier value for this EVCMode.
     * 
     * @param vendorTier
     */
    public void setVendorTier(int vendorTier) {
        this.vendorTier = vendorTier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVCMode)) return false;
        EVCMode other = (EVCMode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.guaranteedCPUFeatures==null && other.getGuaranteedCPUFeatures()==null) || 
             (this.guaranteedCPUFeatures!=null &&
              java.util.Arrays.equals(this.guaranteedCPUFeatures, other.getGuaranteedCPUFeatures()))) &&
            ((this.featureCapability==null && other.getFeatureCapability()==null) || 
             (this.featureCapability!=null &&
              java.util.Arrays.equals(this.featureCapability, other.getFeatureCapability()))) &&
            ((this.featureMask==null && other.getFeatureMask()==null) || 
             (this.featureMask!=null &&
              java.util.Arrays.equals(this.featureMask, other.getFeatureMask()))) &&
            ((this.featureRequirement==null && other.getFeatureRequirement()==null) || 
             (this.featureRequirement!=null &&
              java.util.Arrays.equals(this.featureRequirement, other.getFeatureRequirement()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.track==null && other.getTrack()==null) || 
             (this.track!=null &&
              java.util.Arrays.equals(this.track, other.getTrack()))) &&
            this.vendorTier == other.getVendorTier();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getGuaranteedCPUFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuaranteedCPUFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuaranteedCPUFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatureCapability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureCapability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureCapability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatureMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureMask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatureRequirement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureRequirement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureRequirement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getTrack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getVendorTier();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EVCMode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCMode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteedCPUFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guaranteedCPUFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureMask"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureRequirement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureRequirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFeatureRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "track"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorTier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorTier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
