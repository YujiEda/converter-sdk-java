/**
 * NetIpStackInfoNetToMedia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpStackInfoNetToMedia  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ipAddress;

    private java.lang.String physicalAddress;

    private java.lang.String device;

    private java.lang.String type;

    public NetIpStackInfoNetToMedia() {
    }

    public NetIpStackInfoNetToMedia(
           java.lang.String ipAddress,
           java.lang.String physicalAddress,
           java.lang.String device,
           java.lang.String type) {
        this.ipAddress = ipAddress;
        this.physicalAddress = physicalAddress;
        this.device = device;
        this.type = type;
    }


    /**
     * Gets the ipAddress value for this NetIpStackInfoNetToMedia.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this NetIpStackInfoNetToMedia.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the physicalAddress value for this NetIpStackInfoNetToMedia.
     * 
     * @return physicalAddress
     */
    public java.lang.String getPhysicalAddress() {
        return physicalAddress;
    }


    /**
     * Sets the physicalAddress value for this NetIpStackInfoNetToMedia.
     * 
     * @param physicalAddress
     */
    public void setPhysicalAddress(java.lang.String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }


    /**
     * Gets the device value for this NetIpStackInfoNetToMedia.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this NetIpStackInfoNetToMedia.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the type value for this NetIpStackInfoNetToMedia.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this NetIpStackInfoNetToMedia.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpStackInfoNetToMedia)) return false;
        NetIpStackInfoNetToMedia other = (NetIpStackInfoNetToMedia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.physicalAddress==null && other.getPhysicalAddress()==null) || 
             (this.physicalAddress!=null &&
              this.physicalAddress.equals(other.getPhysicalAddress()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getPhysicalAddress() != null) {
            _hashCode += getPhysicalAddress().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetIpStackInfoNetToMedia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpStackInfoNetToMedia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "physicalAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
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
