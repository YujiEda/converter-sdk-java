/**
 * VirtualMachineSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineSummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.VirtualMachineRuntimeInfo runtime;

    private com.vmware.converter.VirtualMachineGuestSummary guest;

    private com.vmware.converter.VirtualMachineConfigSummary config;

    private com.vmware.converter.VirtualMachineStorageSummary storage;

    private com.vmware.converter.VirtualMachineQuickStats quickStats;

    private com.vmware.converter.ManagedEntityStatus overallStatus;

    private com.vmware.converter.CustomFieldValue[] customValue;

    public VirtualMachineSummary() {
    }

    public VirtualMachineSummary(
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.VirtualMachineRuntimeInfo runtime,
           com.vmware.converter.VirtualMachineGuestSummary guest,
           com.vmware.converter.VirtualMachineConfigSummary config,
           com.vmware.converter.VirtualMachineStorageSummary storage,
           com.vmware.converter.VirtualMachineQuickStats quickStats,
           com.vmware.converter.ManagedEntityStatus overallStatus,
           com.vmware.converter.CustomFieldValue[] customValue) {
        this.vm = vm;
        this.runtime = runtime;
        this.guest = guest;
        this.config = config;
        this.storage = storage;
        this.quickStats = quickStats;
        this.overallStatus = overallStatus;
        this.customValue = customValue;
    }


    /**
     * Gets the vm value for this VirtualMachineSummary.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this VirtualMachineSummary.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the runtime value for this VirtualMachineSummary.
     * 
     * @return runtime
     */
    public com.vmware.converter.VirtualMachineRuntimeInfo getRuntime() {
        return runtime;
    }


    /**
     * Sets the runtime value for this VirtualMachineSummary.
     * 
     * @param runtime
     */
    public void setRuntime(com.vmware.converter.VirtualMachineRuntimeInfo runtime) {
        this.runtime = runtime;
    }


    /**
     * Gets the guest value for this VirtualMachineSummary.
     * 
     * @return guest
     */
    public com.vmware.converter.VirtualMachineGuestSummary getGuest() {
        return guest;
    }


    /**
     * Sets the guest value for this VirtualMachineSummary.
     * 
     * @param guest
     */
    public void setGuest(com.vmware.converter.VirtualMachineGuestSummary guest) {
        this.guest = guest;
    }


    /**
     * Gets the config value for this VirtualMachineSummary.
     * 
     * @return config
     */
    public com.vmware.converter.VirtualMachineConfigSummary getConfig() {
        return config;
    }


    /**
     * Sets the config value for this VirtualMachineSummary.
     * 
     * @param config
     */
    public void setConfig(com.vmware.converter.VirtualMachineConfigSummary config) {
        this.config = config;
    }


    /**
     * Gets the storage value for this VirtualMachineSummary.
     * 
     * @return storage
     */
    public com.vmware.converter.VirtualMachineStorageSummary getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this VirtualMachineSummary.
     * 
     * @param storage
     */
    public void setStorage(com.vmware.converter.VirtualMachineStorageSummary storage) {
        this.storage = storage;
    }


    /**
     * Gets the quickStats value for this VirtualMachineSummary.
     * 
     * @return quickStats
     */
    public com.vmware.converter.VirtualMachineQuickStats getQuickStats() {
        return quickStats;
    }


    /**
     * Sets the quickStats value for this VirtualMachineSummary.
     * 
     * @param quickStats
     */
    public void setQuickStats(com.vmware.converter.VirtualMachineQuickStats quickStats) {
        this.quickStats = quickStats;
    }


    /**
     * Gets the overallStatus value for this VirtualMachineSummary.
     * 
     * @return overallStatus
     */
    public com.vmware.converter.ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }


    /**
     * Sets the overallStatus value for this VirtualMachineSummary.
     * 
     * @param overallStatus
     */
    public void setOverallStatus(com.vmware.converter.ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }


    /**
     * Gets the customValue value for this VirtualMachineSummary.
     * 
     * @return customValue
     */
    public com.vmware.converter.CustomFieldValue[] getCustomValue() {
        return customValue;
    }


    /**
     * Sets the customValue value for this VirtualMachineSummary.
     * 
     * @param customValue
     */
    public void setCustomValue(com.vmware.converter.CustomFieldValue[] customValue) {
        this.customValue = customValue;
    }

    public com.vmware.converter.CustomFieldValue getCustomValue(int i) {
        return this.customValue[i];
    }

    public void setCustomValue(int i, com.vmware.converter.CustomFieldValue _value) {
        this.customValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineSummary)) return false;
        VirtualMachineSummary other = (VirtualMachineSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.runtime==null && other.getRuntime()==null) || 
             (this.runtime!=null &&
              this.runtime.equals(other.getRuntime()))) &&
            ((this.guest==null && other.getGuest()==null) || 
             (this.guest!=null &&
              this.guest.equals(other.getGuest()))) &&
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.storage==null && other.getStorage()==null) || 
             (this.storage!=null &&
              this.storage.equals(other.getStorage()))) &&
            ((this.quickStats==null && other.getQuickStats()==null) || 
             (this.quickStats!=null &&
              this.quickStats.equals(other.getQuickStats()))) &&
            ((this.overallStatus==null && other.getOverallStatus()==null) || 
             (this.overallStatus!=null &&
              this.overallStatus.equals(other.getOverallStatus()))) &&
            ((this.customValue==null && other.getCustomValue()==null) || 
             (this.customValue!=null &&
              java.util.Arrays.equals(this.customValue, other.getCustomValue())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getRuntime() != null) {
            _hashCode += getRuntime().hashCode();
        }
        if (getGuest() != null) {
            _hashCode += getGuest().hashCode();
        }
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getStorage() != null) {
            _hashCode += getStorage().hashCode();
        }
        if (getQuickStats() != null) {
            _hashCode += getQuickStats().hashCode();
        }
        if (getOverallStatus() != null) {
            _hashCode += getOverallStatus().hashCode();
        }
        if (getCustomValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomValue(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRuntimeInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineGuestSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineStorageSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickStats");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "quickStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineQuickStats"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overallStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedEntityStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "customValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomFieldValue"));
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
