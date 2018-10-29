/**
 * StorageDrsVmConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsVmConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private java.lang.Boolean enabled;

    private java.lang.String behavior;

    private java.lang.Boolean intraVmAffinity;

    private com.vmware.converter.VirtualDiskAntiAffinityRuleSpec intraVmAntiAffinity;

    public StorageDrsVmConfigInfo() {
    }

    public StorageDrsVmConfigInfo(
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.Boolean enabled,
           java.lang.String behavior,
           java.lang.Boolean intraVmAffinity,
           com.vmware.converter.VirtualDiskAntiAffinityRuleSpec intraVmAntiAffinity) {
        this.vm = vm;
        this.enabled = enabled;
        this.behavior = behavior;
        this.intraVmAffinity = intraVmAffinity;
        this.intraVmAntiAffinity = intraVmAntiAffinity;
    }


    /**
     * Gets the vm value for this StorageDrsVmConfigInfo.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this StorageDrsVmConfigInfo.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the enabled value for this StorageDrsVmConfigInfo.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this StorageDrsVmConfigInfo.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the behavior value for this StorageDrsVmConfigInfo.
     * 
     * @return behavior
     */
    public java.lang.String getBehavior() {
        return behavior;
    }


    /**
     * Sets the behavior value for this StorageDrsVmConfigInfo.
     * 
     * @param behavior
     */
    public void setBehavior(java.lang.String behavior) {
        this.behavior = behavior;
    }


    /**
     * Gets the intraVmAffinity value for this StorageDrsVmConfigInfo.
     * 
     * @return intraVmAffinity
     */
    public java.lang.Boolean getIntraVmAffinity() {
        return intraVmAffinity;
    }


    /**
     * Sets the intraVmAffinity value for this StorageDrsVmConfigInfo.
     * 
     * @param intraVmAffinity
     */
    public void setIntraVmAffinity(java.lang.Boolean intraVmAffinity) {
        this.intraVmAffinity = intraVmAffinity;
    }


    /**
     * Gets the intraVmAntiAffinity value for this StorageDrsVmConfigInfo.
     * 
     * @return intraVmAntiAffinity
     */
    public com.vmware.converter.VirtualDiskAntiAffinityRuleSpec getIntraVmAntiAffinity() {
        return intraVmAntiAffinity;
    }


    /**
     * Sets the intraVmAntiAffinity value for this StorageDrsVmConfigInfo.
     * 
     * @param intraVmAntiAffinity
     */
    public void setIntraVmAntiAffinity(com.vmware.converter.VirtualDiskAntiAffinityRuleSpec intraVmAntiAffinity) {
        this.intraVmAntiAffinity = intraVmAntiAffinity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsVmConfigInfo)) return false;
        StorageDrsVmConfigInfo other = (StorageDrsVmConfigInfo) obj;
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
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.behavior==null && other.getBehavior()==null) || 
             (this.behavior!=null &&
              this.behavior.equals(other.getBehavior()))) &&
            ((this.intraVmAffinity==null && other.getIntraVmAffinity()==null) || 
             (this.intraVmAffinity!=null &&
              this.intraVmAffinity.equals(other.getIntraVmAffinity()))) &&
            ((this.intraVmAntiAffinity==null && other.getIntraVmAntiAffinity()==null) || 
             (this.intraVmAntiAffinity!=null &&
              this.intraVmAntiAffinity.equals(other.getIntraVmAntiAffinity())));
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getBehavior() != null) {
            _hashCode += getBehavior().hashCode();
        }
        if (getIntraVmAffinity() != null) {
            _hashCode += getIntraVmAffinity().hashCode();
        }
        if (getIntraVmAntiAffinity() != null) {
            _hashCode += getIntraVmAntiAffinity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsVmConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsVmConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("behavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "behavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraVmAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "intraVmAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraVmAntiAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "intraVmAntiAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskAntiAffinityRuleSpec"));
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
