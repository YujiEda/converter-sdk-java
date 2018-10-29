/**
 * ConverterConversionRuntimeEnvironmentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConversionRuntimeEnvironmentInfo  extends com.vmware.converter.ConverterRuntimeEnvironmentInfo  implements java.io.Serializable {
    private int networkBandwidthInMbps;

    private java.lang.Integer maxConnection;

    public ConverterConversionRuntimeEnvironmentInfo() {
    }

    public ConverterConversionRuntimeEnvironmentInfo(
           int networkBandwidthInMbps,
           java.lang.Integer maxConnection) {
        this.networkBandwidthInMbps = networkBandwidthInMbps;
        this.maxConnection = maxConnection;
    }


    /**
     * Gets the networkBandwidthInMbps value for this ConverterConversionRuntimeEnvironmentInfo.
     * 
     * @return networkBandwidthInMbps
     */
    public int getNetworkBandwidthInMbps() {
        return networkBandwidthInMbps;
    }


    /**
     * Sets the networkBandwidthInMbps value for this ConverterConversionRuntimeEnvironmentInfo.
     * 
     * @param networkBandwidthInMbps
     */
    public void setNetworkBandwidthInMbps(int networkBandwidthInMbps) {
        this.networkBandwidthInMbps = networkBandwidthInMbps;
    }


    /**
     * Gets the maxConnection value for this ConverterConversionRuntimeEnvironmentInfo.
     * 
     * @return maxConnection
     */
    public java.lang.Integer getMaxConnection() {
        return maxConnection;
    }


    /**
     * Sets the maxConnection value for this ConverterConversionRuntimeEnvironmentInfo.
     * 
     * @param maxConnection
     */
    public void setMaxConnection(java.lang.Integer maxConnection) {
        this.maxConnection = maxConnection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConversionRuntimeEnvironmentInfo)) return false;
        ConverterConversionRuntimeEnvironmentInfo other = (ConverterConversionRuntimeEnvironmentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.networkBandwidthInMbps == other.getNetworkBandwidthInMbps() &&
            ((this.maxConnection==null && other.getMaxConnection()==null) || 
             (this.maxConnection!=null &&
              this.maxConnection.equals(other.getMaxConnection())));
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
        _hashCode += getNetworkBandwidthInMbps();
        if (getMaxConnection() != null) {
            _hashCode += getMaxConnection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConversionRuntimeEnvironmentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConversionRuntimeEnvironmentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkBandwidthInMbps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkBandwidthInMbps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "maxConnection"));
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
