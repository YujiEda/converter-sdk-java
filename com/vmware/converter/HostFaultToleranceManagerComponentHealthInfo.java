/**
 * HostFaultToleranceManagerComponentHealthInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFaultToleranceManagerComponentHealthInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean isStorageHealthy;

    private boolean isNetworkHealthy;

    public HostFaultToleranceManagerComponentHealthInfo() {
    }

    public HostFaultToleranceManagerComponentHealthInfo(
           boolean isStorageHealthy,
           boolean isNetworkHealthy) {
        this.isStorageHealthy = isStorageHealthy;
        this.isNetworkHealthy = isNetworkHealthy;
    }


    /**
     * Gets the isStorageHealthy value for this HostFaultToleranceManagerComponentHealthInfo.
     * 
     * @return isStorageHealthy
     */
    public boolean isIsStorageHealthy() {
        return isStorageHealthy;
    }


    /**
     * Sets the isStorageHealthy value for this HostFaultToleranceManagerComponentHealthInfo.
     * 
     * @param isStorageHealthy
     */
    public void setIsStorageHealthy(boolean isStorageHealthy) {
        this.isStorageHealthy = isStorageHealthy;
    }


    /**
     * Gets the isNetworkHealthy value for this HostFaultToleranceManagerComponentHealthInfo.
     * 
     * @return isNetworkHealthy
     */
    public boolean isIsNetworkHealthy() {
        return isNetworkHealthy;
    }


    /**
     * Sets the isNetworkHealthy value for this HostFaultToleranceManagerComponentHealthInfo.
     * 
     * @param isNetworkHealthy
     */
    public void setIsNetworkHealthy(boolean isNetworkHealthy) {
        this.isNetworkHealthy = isNetworkHealthy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFaultToleranceManagerComponentHealthInfo)) return false;
        HostFaultToleranceManagerComponentHealthInfo other = (HostFaultToleranceManagerComponentHealthInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.isStorageHealthy == other.isIsStorageHealthy() &&
            this.isNetworkHealthy == other.isIsNetworkHealthy();
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
        _hashCode += (isIsStorageHealthy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsNetworkHealthy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFaultToleranceManagerComponentHealthInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFaultToleranceManagerComponentHealthInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStorageHealthy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isStorageHealthy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNetworkHealthy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isNetworkHealthy"));
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
