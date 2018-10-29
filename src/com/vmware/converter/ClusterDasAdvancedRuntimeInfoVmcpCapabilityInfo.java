/**
 * ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean storageAPDSupported;

    private boolean storagePDLSupported;

    public ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo() {
    }

    public ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo(
           boolean storageAPDSupported,
           boolean storagePDLSupported) {
        this.storageAPDSupported = storageAPDSupported;
        this.storagePDLSupported = storagePDLSupported;
    }


    /**
     * Gets the storageAPDSupported value for this ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.
     * 
     * @return storageAPDSupported
     */
    public boolean isStorageAPDSupported() {
        return storageAPDSupported;
    }


    /**
     * Sets the storageAPDSupported value for this ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.
     * 
     * @param storageAPDSupported
     */
    public void setStorageAPDSupported(boolean storageAPDSupported) {
        this.storageAPDSupported = storageAPDSupported;
    }


    /**
     * Gets the storagePDLSupported value for this ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.
     * 
     * @return storagePDLSupported
     */
    public boolean isStoragePDLSupported() {
        return storagePDLSupported;
    }


    /**
     * Sets the storagePDLSupported value for this ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.
     * 
     * @param storagePDLSupported
     */
    public void setStoragePDLSupported(boolean storagePDLSupported) {
        this.storagePDLSupported = storagePDLSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo)) return false;
        ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo other = (ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.storageAPDSupported == other.isStorageAPDSupported() &&
            this.storagePDLSupported == other.isStoragePDLSupported();
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
        _hashCode += (isStorageAPDSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStoragePDLSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageAPDSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageAPDSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagePDLSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storagePDLSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
