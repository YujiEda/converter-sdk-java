/**
 * NetStackInstanceProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetStackInstanceProfile  extends com.vmware.converter.ApplyProfile  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.converter.NetworkProfileDnsConfigProfile dnsConfig;

    private com.vmware.converter.IpRouteProfile ipRouteConfig;

    public NetStackInstanceProfile() {
    }

    public NetStackInstanceProfile(
           boolean enabled,
           com.vmware.converter.ProfilePolicy[] policy,
           java.lang.String profileTypeName,
           java.lang.String profileVersion,
           com.vmware.converter.ProfileApplyProfileProperty[] property,
           java.lang.String key,
           com.vmware.converter.NetworkProfileDnsConfigProfile dnsConfig,
           com.vmware.converter.IpRouteProfile ipRouteConfig) {
        super(
            enabled,
            policy,
            profileTypeName,
            profileVersion,
            property);
        this.key = key;
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the key value for this NetStackInstanceProfile.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this NetStackInstanceProfile.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the dnsConfig value for this NetStackInstanceProfile.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.NetworkProfileDnsConfigProfile getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this NetStackInstanceProfile.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.NetworkProfileDnsConfigProfile dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this NetStackInstanceProfile.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.converter.IpRouteProfile getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this NetStackInstanceProfile.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.converter.IpRouteProfile ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetStackInstanceProfile)) return false;
        NetStackInstanceProfile other = (NetStackInstanceProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipRouteConfig==null && other.getIpRouteConfig()==null) || 
             (this.ipRouteConfig!=null &&
              this.ipRouteConfig.equals(other.getIpRouteConfig())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getDnsConfig() != null) {
            _hashCode += getDnsConfig().hashCode();
        }
        if (getIpRouteConfig() != null) {
            _hashCode += getIpRouteConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetStackInstanceProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetStackInstanceProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetworkProfileDnsConfigProfile"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpRouteProfile"));
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
