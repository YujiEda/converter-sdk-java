/**
 * VsanHostIpConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostIpConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String upstreamIpAddress;

    private java.lang.String downstreamIpAddress;

    public VsanHostIpConfig() {
    }

    public VsanHostIpConfig(
           java.lang.String upstreamIpAddress,
           java.lang.String downstreamIpAddress) {
        this.upstreamIpAddress = upstreamIpAddress;
        this.downstreamIpAddress = downstreamIpAddress;
    }


    /**
     * Gets the upstreamIpAddress value for this VsanHostIpConfig.
     * 
     * @return upstreamIpAddress
     */
    public java.lang.String getUpstreamIpAddress() {
        return upstreamIpAddress;
    }


    /**
     * Sets the upstreamIpAddress value for this VsanHostIpConfig.
     * 
     * @param upstreamIpAddress
     */
    public void setUpstreamIpAddress(java.lang.String upstreamIpAddress) {
        this.upstreamIpAddress = upstreamIpAddress;
    }


    /**
     * Gets the downstreamIpAddress value for this VsanHostIpConfig.
     * 
     * @return downstreamIpAddress
     */
    public java.lang.String getDownstreamIpAddress() {
        return downstreamIpAddress;
    }


    /**
     * Sets the downstreamIpAddress value for this VsanHostIpConfig.
     * 
     * @param downstreamIpAddress
     */
    public void setDownstreamIpAddress(java.lang.String downstreamIpAddress) {
        this.downstreamIpAddress = downstreamIpAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostIpConfig)) return false;
        VsanHostIpConfig other = (VsanHostIpConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.upstreamIpAddress==null && other.getUpstreamIpAddress()==null) || 
             (this.upstreamIpAddress!=null &&
              this.upstreamIpAddress.equals(other.getUpstreamIpAddress()))) &&
            ((this.downstreamIpAddress==null && other.getDownstreamIpAddress()==null) || 
             (this.downstreamIpAddress!=null &&
              this.downstreamIpAddress.equals(other.getDownstreamIpAddress())));
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
        if (getUpstreamIpAddress() != null) {
            _hashCode += getUpstreamIpAddress().hashCode();
        }
        if (getDownstreamIpAddress() != null) {
            _hashCode += getDownstreamIpAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostIpConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostIpConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upstreamIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "upstreamIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstreamIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "downstreamIpAddress"));
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
