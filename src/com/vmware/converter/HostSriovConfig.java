/**
 * HostSriovConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostSriovConfig  extends com.vmware.converter.HostPciPassthruConfig  implements java.io.Serializable {
    private boolean sriovEnabled;

    private int numVirtualFunction;

    public HostSriovConfig() {
    }

    public HostSriovConfig(
           java.lang.String id,
           boolean passthruEnabled,
           boolean sriovEnabled,
           int numVirtualFunction) {
        super(
            id,
            passthruEnabled);
        this.sriovEnabled = sriovEnabled;
        this.numVirtualFunction = numVirtualFunction;
    }


    /**
     * Gets the sriovEnabled value for this HostSriovConfig.
     * 
     * @return sriovEnabled
     */
    public boolean isSriovEnabled() {
        return sriovEnabled;
    }


    /**
     * Sets the sriovEnabled value for this HostSriovConfig.
     * 
     * @param sriovEnabled
     */
    public void setSriovEnabled(boolean sriovEnabled) {
        this.sriovEnabled = sriovEnabled;
    }


    /**
     * Gets the numVirtualFunction value for this HostSriovConfig.
     * 
     * @return numVirtualFunction
     */
    public int getNumVirtualFunction() {
        return numVirtualFunction;
    }


    /**
     * Sets the numVirtualFunction value for this HostSriovConfig.
     * 
     * @param numVirtualFunction
     */
    public void setNumVirtualFunction(int numVirtualFunction) {
        this.numVirtualFunction = numVirtualFunction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostSriovConfig)) return false;
        HostSriovConfig other = (HostSriovConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sriovEnabled == other.isSriovEnabled() &&
            this.numVirtualFunction == other.getNumVirtualFunction();
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
        _hashCode += (isSriovEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumVirtualFunction();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostSriovConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSriovConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriovEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sriovEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVirtualFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVirtualFunction"));
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
