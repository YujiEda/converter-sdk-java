/**
 * FeatureRequirementsNotMet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FeatureRequirementsNotMet  extends com.vmware.converter.VirtualHardwareCompatibilityIssue  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement;

    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.ManagedObjectReference host;

    public FeatureRequirementsNotMet() {
    }

    public FeatureRequirementsNotMet(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.ManagedObjectReference host) {
        super(
            faultCause,
            faultMessage);
        this.featureRequirement = featureRequirement;
        this.vm = vm;
        this.host = host;
    }


    /**
     * Gets the featureRequirement value for this FeatureRequirementsNotMet.
     * 
     * @return featureRequirement
     */
    public com.vmware.converter.VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return featureRequirement;
    }


    /**
     * Sets the featureRequirement value for this FeatureRequirementsNotMet.
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
     * Gets the vm value for this FeatureRequirementsNotMet.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this FeatureRequirementsNotMet.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the host value for this FeatureRequirementsNotMet.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this FeatureRequirementsNotMet.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureRequirementsNotMet)) return false;
        FeatureRequirementsNotMet other = (FeatureRequirementsNotMet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.featureRequirement==null && other.getFeatureRequirement()==null) || 
             (this.featureRequirement!=null &&
              java.util.Arrays.equals(this.featureRequirement, other.getFeatureRequirement()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureRequirementsNotMet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FeatureRequirementsNotMet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureRequirement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureRequirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFeatureRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
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
