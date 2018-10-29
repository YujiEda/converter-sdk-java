/**
 * ClusterEVCManagerEVCState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterEVCManagerEVCState  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.EVCMode[] supportedEVCMode;

    private java.lang.String currentEVCModeKey;

    private com.vmware.converter.HostCpuIdInfo[] guaranteedCPUFeatures;

    private com.vmware.converter.HostFeatureCapability[] featureCapability;

    private com.vmware.converter.HostFeatureMask[] featureMask;

    private com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement;

    public ClusterEVCManagerEVCState() {
    }

    public ClusterEVCManagerEVCState(
           com.vmware.converter.EVCMode[] supportedEVCMode,
           java.lang.String currentEVCModeKey,
           com.vmware.converter.HostCpuIdInfo[] guaranteedCPUFeatures,
           com.vmware.converter.HostFeatureCapability[] featureCapability,
           com.vmware.converter.HostFeatureMask[] featureMask,
           com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement) {
        this.supportedEVCMode = supportedEVCMode;
        this.currentEVCModeKey = currentEVCModeKey;
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
        this.featureCapability = featureCapability;
        this.featureMask = featureMask;
        this.featureRequirement = featureRequirement;
    }


    /**
     * Gets the supportedEVCMode value for this ClusterEVCManagerEVCState.
     * 
     * @return supportedEVCMode
     */
    public com.vmware.converter.EVCMode[] getSupportedEVCMode() {
        return supportedEVCMode;
    }


    /**
     * Sets the supportedEVCMode value for this ClusterEVCManagerEVCState.
     * 
     * @param supportedEVCMode
     */
    public void setSupportedEVCMode(com.vmware.converter.EVCMode[] supportedEVCMode) {
        this.supportedEVCMode = supportedEVCMode;
    }

    public com.vmware.converter.EVCMode getSupportedEVCMode(int i) {
        return this.supportedEVCMode[i];
    }

    public void setSupportedEVCMode(int i, com.vmware.converter.EVCMode _value) {
        this.supportedEVCMode[i] = _value;
    }


    /**
     * Gets the currentEVCModeKey value for this ClusterEVCManagerEVCState.
     * 
     * @return currentEVCModeKey
     */
    public java.lang.String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }


    /**
     * Sets the currentEVCModeKey value for this ClusterEVCManagerEVCState.
     * 
     * @param currentEVCModeKey
     */
    public void setCurrentEVCModeKey(java.lang.String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }


    /**
     * Gets the guaranteedCPUFeatures value for this ClusterEVCManagerEVCState.
     * 
     * @return guaranteedCPUFeatures
     */
    public com.vmware.converter.HostCpuIdInfo[] getGuaranteedCPUFeatures() {
        return guaranteedCPUFeatures;
    }


    /**
     * Sets the guaranteedCPUFeatures value for this ClusterEVCManagerEVCState.
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
     * Gets the featureCapability value for this ClusterEVCManagerEVCState.
     * 
     * @return featureCapability
     */
    public com.vmware.converter.HostFeatureCapability[] getFeatureCapability() {
        return featureCapability;
    }


    /**
     * Sets the featureCapability value for this ClusterEVCManagerEVCState.
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
     * Gets the featureMask value for this ClusterEVCManagerEVCState.
     * 
     * @return featureMask
     */
    public com.vmware.converter.HostFeatureMask[] getFeatureMask() {
        return featureMask;
    }


    /**
     * Sets the featureMask value for this ClusterEVCManagerEVCState.
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
     * Gets the featureRequirement value for this ClusterEVCManagerEVCState.
     * 
     * @return featureRequirement
     */
    public com.vmware.converter.VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return featureRequirement;
    }


    /**
     * Sets the featureRequirement value for this ClusterEVCManagerEVCState.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterEVCManagerEVCState)) return false;
        ClusterEVCManagerEVCState other = (ClusterEVCManagerEVCState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.supportedEVCMode==null && other.getSupportedEVCMode()==null) || 
             (this.supportedEVCMode!=null &&
              java.util.Arrays.equals(this.supportedEVCMode, other.getSupportedEVCMode()))) &&
            ((this.currentEVCModeKey==null && other.getCurrentEVCModeKey()==null) || 
             (this.currentEVCModeKey!=null &&
              this.currentEVCModeKey.equals(other.getCurrentEVCModeKey()))) &&
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
              java.util.Arrays.equals(this.featureRequirement, other.getFeatureRequirement())));
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
        if (getSupportedEVCMode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedEVCMode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedEVCMode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentEVCModeKey() != null) {
            _hashCode += getCurrentEVCModeKey().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterEVCManagerEVCState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterEVCManagerEVCState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedEVCMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedEVCMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCMode"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentEVCModeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentEVCModeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
