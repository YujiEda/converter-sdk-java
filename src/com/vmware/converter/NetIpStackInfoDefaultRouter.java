/**
 * NetIpStackInfoDefaultRouter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpStackInfoDefaultRouter  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ipAddress;

    private java.lang.String device;

    private java.util.Calendar lifetime;

    private java.lang.String preference;

    public NetIpStackInfoDefaultRouter() {
    }

    public NetIpStackInfoDefaultRouter(
           java.lang.String ipAddress,
           java.lang.String device,
           java.util.Calendar lifetime,
           java.lang.String preference) {
        this.ipAddress = ipAddress;
        this.device = device;
        this.lifetime = lifetime;
        this.preference = preference;
    }


    /**
     * Gets the ipAddress value for this NetIpStackInfoDefaultRouter.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this NetIpStackInfoDefaultRouter.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the device value for this NetIpStackInfoDefaultRouter.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this NetIpStackInfoDefaultRouter.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the lifetime value for this NetIpStackInfoDefaultRouter.
     * 
     * @return lifetime
     */
    public java.util.Calendar getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this NetIpStackInfoDefaultRouter.
     * 
     * @param lifetime
     */
    public void setLifetime(java.util.Calendar lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the preference value for this NetIpStackInfoDefaultRouter.
     * 
     * @return preference
     */
    public java.lang.String getPreference() {
        return preference;
    }


    /**
     * Sets the preference value for this NetIpStackInfoDefaultRouter.
     * 
     * @param preference
     */
    public void setPreference(java.lang.String preference) {
        this.preference = preference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpStackInfoDefaultRouter)) return false;
        NetIpStackInfoDefaultRouter other = (NetIpStackInfoDefaultRouter) obj;
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
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.preference==null && other.getPreference()==null) || 
             (this.preference!=null &&
              this.preference.equals(other.getPreference())));
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getPreference() != null) {
            _hashCode += getPreference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetIpStackInfoDefaultRouter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpStackInfoDefaultRouter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
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
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "preference"));
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
