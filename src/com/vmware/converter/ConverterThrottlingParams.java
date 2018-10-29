/**
 * ConverterThrottlingParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterThrottlingParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String cpuThrottling;

    private java.lang.Integer networkBandwidthThrottlingInMB;

    public ConverterThrottlingParams() {
    }

    public ConverterThrottlingParams(
           java.lang.String cpuThrottling,
           java.lang.Integer networkBandwidthThrottlingInMB) {
        this.cpuThrottling = cpuThrottling;
        this.networkBandwidthThrottlingInMB = networkBandwidthThrottlingInMB;
    }


    /**
     * Gets the cpuThrottling value for this ConverterThrottlingParams.
     * 
     * @return cpuThrottling
     */
    public java.lang.String getCpuThrottling() {
        return cpuThrottling;
    }


    /**
     * Sets the cpuThrottling value for this ConverterThrottlingParams.
     * 
     * @param cpuThrottling
     */
    public void setCpuThrottling(java.lang.String cpuThrottling) {
        this.cpuThrottling = cpuThrottling;
    }


    /**
     * Gets the networkBandwidthThrottlingInMB value for this ConverterThrottlingParams.
     * 
     * @return networkBandwidthThrottlingInMB
     */
    public java.lang.Integer getNetworkBandwidthThrottlingInMB() {
        return networkBandwidthThrottlingInMB;
    }


    /**
     * Sets the networkBandwidthThrottlingInMB value for this ConverterThrottlingParams.
     * 
     * @param networkBandwidthThrottlingInMB
     */
    public void setNetworkBandwidthThrottlingInMB(java.lang.Integer networkBandwidthThrottlingInMB) {
        this.networkBandwidthThrottlingInMB = networkBandwidthThrottlingInMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterThrottlingParams)) return false;
        ConverterThrottlingParams other = (ConverterThrottlingParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpuThrottling==null && other.getCpuThrottling()==null) || 
             (this.cpuThrottling!=null &&
              this.cpuThrottling.equals(other.getCpuThrottling()))) &&
            ((this.networkBandwidthThrottlingInMB==null && other.getNetworkBandwidthThrottlingInMB()==null) || 
             (this.networkBandwidthThrottlingInMB!=null &&
              this.networkBandwidthThrottlingInMB.equals(other.getNetworkBandwidthThrottlingInMB())));
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
        if (getCpuThrottling() != null) {
            _hashCode += getCpuThrottling().hashCode();
        }
        if (getNetworkBandwidthThrottlingInMB() != null) {
            _hashCode += getNetworkBandwidthThrottlingInMB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterThrottlingParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterThrottlingParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuThrottling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cpuThrottling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkBandwidthThrottlingInMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkBandwidthThrottlingInMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
