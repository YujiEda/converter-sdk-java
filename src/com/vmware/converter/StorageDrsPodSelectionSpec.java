/**
 * StorageDrsPodSelectionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsPodSelectionSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VmPodConfigForPlacement[] initialVmConfig;

    private com.vmware.converter.ManagedObjectReference storagePod;

    public StorageDrsPodSelectionSpec() {
    }

    public StorageDrsPodSelectionSpec(
           com.vmware.converter.VmPodConfigForPlacement[] initialVmConfig,
           com.vmware.converter.ManagedObjectReference storagePod) {
        this.initialVmConfig = initialVmConfig;
        this.storagePod = storagePod;
    }


    /**
     * Gets the initialVmConfig value for this StorageDrsPodSelectionSpec.
     * 
     * @return initialVmConfig
     */
    public com.vmware.converter.VmPodConfigForPlacement[] getInitialVmConfig() {
        return initialVmConfig;
    }


    /**
     * Sets the initialVmConfig value for this StorageDrsPodSelectionSpec.
     * 
     * @param initialVmConfig
     */
    public void setInitialVmConfig(com.vmware.converter.VmPodConfigForPlacement[] initialVmConfig) {
        this.initialVmConfig = initialVmConfig;
    }

    public com.vmware.converter.VmPodConfigForPlacement getInitialVmConfig(int i) {
        return this.initialVmConfig[i];
    }

    public void setInitialVmConfig(int i, com.vmware.converter.VmPodConfigForPlacement _value) {
        this.initialVmConfig[i] = _value;
    }


    /**
     * Gets the storagePod value for this StorageDrsPodSelectionSpec.
     * 
     * @return storagePod
     */
    public com.vmware.converter.ManagedObjectReference getStoragePod() {
        return storagePod;
    }


    /**
     * Sets the storagePod value for this StorageDrsPodSelectionSpec.
     * 
     * @param storagePod
     */
    public void setStoragePod(com.vmware.converter.ManagedObjectReference storagePod) {
        this.storagePod = storagePod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsPodSelectionSpec)) return false;
        StorageDrsPodSelectionSpec other = (StorageDrsPodSelectionSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.initialVmConfig==null && other.getInitialVmConfig()==null) || 
             (this.initialVmConfig!=null &&
              java.util.Arrays.equals(this.initialVmConfig, other.getInitialVmConfig()))) &&
            ((this.storagePod==null && other.getStoragePod()==null) || 
             (this.storagePod!=null &&
              this.storagePod.equals(other.getStoragePod())));
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
        if (getInitialVmConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInitialVmConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInitialVmConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoragePod() != null) {
            _hashCode += getStoragePod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsPodSelectionSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPodSelectionSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialVmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "initialVmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmPodConfigForPlacement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagePod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storagePod"));
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
