/**
 * ClusterFixedSizeSlotPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterFixedSizeSlotPolicy  extends com.vmware.converter.ClusterSlotPolicy  implements java.io.Serializable {
    private int cpu;

    private int memory;

    public ClusterFixedSizeSlotPolicy() {
    }

    public ClusterFixedSizeSlotPolicy(
           int cpu,
           int memory) {
        this.cpu = cpu;
        this.memory = memory;
    }


    /**
     * Gets the cpu value for this ClusterFixedSizeSlotPolicy.
     * 
     * @return cpu
     */
    public int getCpu() {
        return cpu;
    }


    /**
     * Sets the cpu value for this ClusterFixedSizeSlotPolicy.
     * 
     * @param cpu
     */
    public void setCpu(int cpu) {
        this.cpu = cpu;
    }


    /**
     * Gets the memory value for this ClusterFixedSizeSlotPolicy.
     * 
     * @return memory
     */
    public int getMemory() {
        return memory;
    }


    /**
     * Sets the memory value for this ClusterFixedSizeSlotPolicy.
     * 
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterFixedSizeSlotPolicy)) return false;
        ClusterFixedSizeSlotPolicy other = (ClusterFixedSizeSlotPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cpu == other.getCpu() &&
            this.memory == other.getMemory();
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
        _hashCode += getCpu();
        _hashCode += getMemory();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterFixedSizeSlotPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterFixedSizeSlotPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memory"));
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
