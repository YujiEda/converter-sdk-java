/**
 * VmPodConfigForPlacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmPodConfigForPlacement  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference storagePod;

    private com.vmware.converter.PodDiskLocator[] disk;

    private com.vmware.converter.StorageDrsVmConfigInfo vmConfig;

    private com.vmware.converter.ClusterRuleInfo[] interVmRule;

    public VmPodConfigForPlacement() {
    }

    public VmPodConfigForPlacement(
           com.vmware.converter.ManagedObjectReference storagePod,
           com.vmware.converter.PodDiskLocator[] disk,
           com.vmware.converter.StorageDrsVmConfigInfo vmConfig,
           com.vmware.converter.ClusterRuleInfo[] interVmRule) {
        this.storagePod = storagePod;
        this.disk = disk;
        this.vmConfig = vmConfig;
        this.interVmRule = interVmRule;
    }


    /**
     * Gets the storagePod value for this VmPodConfigForPlacement.
     * 
     * @return storagePod
     */
    public com.vmware.converter.ManagedObjectReference getStoragePod() {
        return storagePod;
    }


    /**
     * Sets the storagePod value for this VmPodConfigForPlacement.
     * 
     * @param storagePod
     */
    public void setStoragePod(com.vmware.converter.ManagedObjectReference storagePod) {
        this.storagePod = storagePod;
    }


    /**
     * Gets the disk value for this VmPodConfigForPlacement.
     * 
     * @return disk
     */
    public com.vmware.converter.PodDiskLocator[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VmPodConfigForPlacement.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.PodDiskLocator[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.PodDiskLocator getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.PodDiskLocator _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the vmConfig value for this VmPodConfigForPlacement.
     * 
     * @return vmConfig
     */
    public com.vmware.converter.StorageDrsVmConfigInfo getVmConfig() {
        return vmConfig;
    }


    /**
     * Sets the vmConfig value for this VmPodConfigForPlacement.
     * 
     * @param vmConfig
     */
    public void setVmConfig(com.vmware.converter.StorageDrsVmConfigInfo vmConfig) {
        this.vmConfig = vmConfig;
    }


    /**
     * Gets the interVmRule value for this VmPodConfigForPlacement.
     * 
     * @return interVmRule
     */
    public com.vmware.converter.ClusterRuleInfo[] getInterVmRule() {
        return interVmRule;
    }


    /**
     * Sets the interVmRule value for this VmPodConfigForPlacement.
     * 
     * @param interVmRule
     */
    public void setInterVmRule(com.vmware.converter.ClusterRuleInfo[] interVmRule) {
        this.interVmRule = interVmRule;
    }

    public com.vmware.converter.ClusterRuleInfo getInterVmRule(int i) {
        return this.interVmRule[i];
    }

    public void setInterVmRule(int i, com.vmware.converter.ClusterRuleInfo _value) {
        this.interVmRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmPodConfigForPlacement)) return false;
        VmPodConfigForPlacement other = (VmPodConfigForPlacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.storagePod==null && other.getStoragePod()==null) || 
             (this.storagePod!=null &&
              this.storagePod.equals(other.getStoragePod()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.vmConfig==null && other.getVmConfig()==null) || 
             (this.vmConfig!=null &&
              this.vmConfig.equals(other.getVmConfig()))) &&
            ((this.interVmRule==null && other.getInterVmRule()==null) || 
             (this.interVmRule!=null &&
              java.util.Arrays.equals(this.interVmRule, other.getInterVmRule())));
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
        if (getStoragePod() != null) {
            _hashCode += getStoragePod().hashCode();
        }
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVmConfig() != null) {
            _hashCode += getVmConfig().hashCode();
        }
        if (getInterVmRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterVmRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterVmRule(), i);
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
        new org.apache.axis.description.TypeDesc(VmPodConfigForPlacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmPodConfigForPlacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagePod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storagePod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PodDiskLocator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsVmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interVmRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "interVmRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
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
