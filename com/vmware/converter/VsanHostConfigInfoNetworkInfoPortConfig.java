/**
 * VsanHostConfigInfoNetworkInfoPortConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostConfigInfoNetworkInfoPortConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VsanHostIpConfig ipConfig;

    private java.lang.String device;

    public VsanHostConfigInfoNetworkInfoPortConfig() {
    }

    public VsanHostConfigInfoNetworkInfoPortConfig(
           com.vmware.converter.VsanHostIpConfig ipConfig,
           java.lang.String device) {
        this.ipConfig = ipConfig;
        this.device = device;
    }


    /**
     * Gets the ipConfig value for this VsanHostConfigInfoNetworkInfoPortConfig.
     * 
     * @return ipConfig
     */
    public com.vmware.converter.VsanHostIpConfig getIpConfig() {
        return ipConfig;
    }


    /**
     * Sets the ipConfig value for this VsanHostConfigInfoNetworkInfoPortConfig.
     * 
     * @param ipConfig
     */
    public void setIpConfig(com.vmware.converter.VsanHostIpConfig ipConfig) {
        this.ipConfig = ipConfig;
    }


    /**
     * Gets the device value for this VsanHostConfigInfoNetworkInfoPortConfig.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this VsanHostConfigInfoNetworkInfoPortConfig.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostConfigInfoNetworkInfoPortConfig)) return false;
        VsanHostConfigInfoNetworkInfoPortConfig other = (VsanHostConfigInfoNetworkInfoPortConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipConfig==null && other.getIpConfig()==null) || 
             (this.ipConfig!=null &&
              this.ipConfig.equals(other.getIpConfig()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice())));
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
        if (getIpConfig() != null) {
            _hashCode += getIpConfig().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostConfigInfoNetworkInfoPortConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoNetworkInfoPortConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostIpConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
