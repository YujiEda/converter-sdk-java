/**
 * ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private int slots;

    public ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots() {
    }

    public ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots(
           com.vmware.converter.ManagedObjectReference vm,
           int slots) {
        this.vm = vm;
        this.slots = slots;
    }


    /**
     * Gets the vm value for this ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the slots value for this ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.
     * 
     * @return slots
     */
    public int getSlots() {
        return slots;
    }


    /**
     * Sets the slots value for this ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.
     * 
     * @param slots
     */
    public void setSlots(int slots) {
        this.slots = slots;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots)) return false;
        ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots other = (ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots) obj;
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
            this.slots == other.getSlots();
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
        _hashCode += getSlots();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slots"));
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
