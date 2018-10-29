/**
 * ClusterResourceUsageSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterResourceUsageSummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int cpuUsedMHz;

    private int cpuCapacityMHz;

    private int memUsedMB;

    private int memCapacityMB;

    private long storageUsedMB;

    private long storageCapacityMB;

    public ClusterResourceUsageSummary() {
    }

    public ClusterResourceUsageSummary(
           int cpuUsedMHz,
           int cpuCapacityMHz,
           int memUsedMB,
           int memCapacityMB,
           long storageUsedMB,
           long storageCapacityMB) {
        this.cpuUsedMHz = cpuUsedMHz;
        this.cpuCapacityMHz = cpuCapacityMHz;
        this.memUsedMB = memUsedMB;
        this.memCapacityMB = memCapacityMB;
        this.storageUsedMB = storageUsedMB;
        this.storageCapacityMB = storageCapacityMB;
    }


    /**
     * Gets the cpuUsedMHz value for this ClusterResourceUsageSummary.
     * 
     * @return cpuUsedMHz
     */
    public int getCpuUsedMHz() {
        return cpuUsedMHz;
    }


    /**
     * Sets the cpuUsedMHz value for this ClusterResourceUsageSummary.
     * 
     * @param cpuUsedMHz
     */
    public void setCpuUsedMHz(int cpuUsedMHz) {
        this.cpuUsedMHz = cpuUsedMHz;
    }


    /**
     * Gets the cpuCapacityMHz value for this ClusterResourceUsageSummary.
     * 
     * @return cpuCapacityMHz
     */
    public int getCpuCapacityMHz() {
        return cpuCapacityMHz;
    }


    /**
     * Sets the cpuCapacityMHz value for this ClusterResourceUsageSummary.
     * 
     * @param cpuCapacityMHz
     */
    public void setCpuCapacityMHz(int cpuCapacityMHz) {
        this.cpuCapacityMHz = cpuCapacityMHz;
    }


    /**
     * Gets the memUsedMB value for this ClusterResourceUsageSummary.
     * 
     * @return memUsedMB
     */
    public int getMemUsedMB() {
        return memUsedMB;
    }


    /**
     * Sets the memUsedMB value for this ClusterResourceUsageSummary.
     * 
     * @param memUsedMB
     */
    public void setMemUsedMB(int memUsedMB) {
        this.memUsedMB = memUsedMB;
    }


    /**
     * Gets the memCapacityMB value for this ClusterResourceUsageSummary.
     * 
     * @return memCapacityMB
     */
    public int getMemCapacityMB() {
        return memCapacityMB;
    }


    /**
     * Sets the memCapacityMB value for this ClusterResourceUsageSummary.
     * 
     * @param memCapacityMB
     */
    public void setMemCapacityMB(int memCapacityMB) {
        this.memCapacityMB = memCapacityMB;
    }


    /**
     * Gets the storageUsedMB value for this ClusterResourceUsageSummary.
     * 
     * @return storageUsedMB
     */
    public long getStorageUsedMB() {
        return storageUsedMB;
    }


    /**
     * Sets the storageUsedMB value for this ClusterResourceUsageSummary.
     * 
     * @param storageUsedMB
     */
    public void setStorageUsedMB(long storageUsedMB) {
        this.storageUsedMB = storageUsedMB;
    }


    /**
     * Gets the storageCapacityMB value for this ClusterResourceUsageSummary.
     * 
     * @return storageCapacityMB
     */
    public long getStorageCapacityMB() {
        return storageCapacityMB;
    }


    /**
     * Sets the storageCapacityMB value for this ClusterResourceUsageSummary.
     * 
     * @param storageCapacityMB
     */
    public void setStorageCapacityMB(long storageCapacityMB) {
        this.storageCapacityMB = storageCapacityMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterResourceUsageSummary)) return false;
        ClusterResourceUsageSummary other = (ClusterResourceUsageSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cpuUsedMHz == other.getCpuUsedMHz() &&
            this.cpuCapacityMHz == other.getCpuCapacityMHz() &&
            this.memUsedMB == other.getMemUsedMB() &&
            this.memCapacityMB == other.getMemCapacityMB() &&
            this.storageUsedMB == other.getStorageUsedMB() &&
            this.storageCapacityMB == other.getStorageCapacityMB();
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
        _hashCode += getCpuUsedMHz();
        _hashCode += getCpuCapacityMHz();
        _hashCode += getMemUsedMB();
        _hashCode += getMemCapacityMB();
        _hashCode += new Long(getStorageUsedMB()).hashCode();
        _hashCode += new Long(getStorageCapacityMB()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterResourceUsageSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterResourceUsageSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuUsedMHz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuUsedMHz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuCapacityMHz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuCapacityMHz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memUsedMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memUsedMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memCapacityMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memCapacityMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageUsedMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageUsedMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageCapacityMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageCapacityMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
