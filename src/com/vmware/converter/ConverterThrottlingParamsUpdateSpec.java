/**
 * ConverterThrottlingParamsUpdateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterThrottlingParamsUpdateSpec  extends com.vmware.converter.ConverterThrottlingParams  implements java.io.Serializable {
    private java.lang.Boolean disableNetworkBandwidthThrottling;

    public ConverterThrottlingParamsUpdateSpec() {
    }

    public ConverterThrottlingParamsUpdateSpec(
           java.lang.String cpuThrottling,
           java.lang.Integer networkBandwidthThrottlingInMB,
           java.lang.Boolean disableNetworkBandwidthThrottling) {
        super(
            cpuThrottling,
            networkBandwidthThrottlingInMB);
        this.disableNetworkBandwidthThrottling = disableNetworkBandwidthThrottling;
    }


    /**
     * Gets the disableNetworkBandwidthThrottling value for this ConverterThrottlingParamsUpdateSpec.
     * 
     * @return disableNetworkBandwidthThrottling
     */
    public java.lang.Boolean getDisableNetworkBandwidthThrottling() {
        return disableNetworkBandwidthThrottling;
    }


    /**
     * Sets the disableNetworkBandwidthThrottling value for this ConverterThrottlingParamsUpdateSpec.
     * 
     * @param disableNetworkBandwidthThrottling
     */
    public void setDisableNetworkBandwidthThrottling(java.lang.Boolean disableNetworkBandwidthThrottling) {
        this.disableNetworkBandwidthThrottling = disableNetworkBandwidthThrottling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterThrottlingParamsUpdateSpec)) return false;
        ConverterThrottlingParamsUpdateSpec other = (ConverterThrottlingParamsUpdateSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disableNetworkBandwidthThrottling==null && other.getDisableNetworkBandwidthThrottling()==null) || 
             (this.disableNetworkBandwidthThrottling!=null &&
              this.disableNetworkBandwidthThrottling.equals(other.getDisableNetworkBandwidthThrottling())));
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
        if (getDisableNetworkBandwidthThrottling() != null) {
            _hashCode += getDisableNetworkBandwidthThrottling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterThrottlingParamsUpdateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterThrottlingParamsUpdateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableNetworkBandwidthThrottling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "disableNetworkBandwidthThrottling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
