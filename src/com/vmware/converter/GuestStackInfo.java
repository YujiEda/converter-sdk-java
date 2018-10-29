/**
 * GuestStackInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestStackInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.NetDnsConfigInfo dnsConfig;

    private com.vmware.converter.NetIpRouteConfigInfo ipRouteConfig;

    private com.vmware.converter.KeyValue[] ipStackConfig;

    private com.vmware.converter.NetDhcpConfigInfo dhcpConfig;

    public GuestStackInfo() {
    }

    public GuestStackInfo(
           com.vmware.converter.NetDnsConfigInfo dnsConfig,
           com.vmware.converter.NetIpRouteConfigInfo ipRouteConfig,
           com.vmware.converter.KeyValue[] ipStackConfig,
           com.vmware.converter.NetDhcpConfigInfo dhcpConfig) {
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
        this.ipStackConfig = ipStackConfig;
        this.dhcpConfig = dhcpConfig;
    }


    /**
     * Gets the dnsConfig value for this GuestStackInfo.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.NetDnsConfigInfo getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this GuestStackInfo.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.NetDnsConfigInfo dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this GuestStackInfo.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.converter.NetIpRouteConfigInfo getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this GuestStackInfo.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.converter.NetIpRouteConfigInfo ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the ipStackConfig value for this GuestStackInfo.
     * 
     * @return ipStackConfig
     */
    public com.vmware.converter.KeyValue[] getIpStackConfig() {
        return ipStackConfig;
    }


    /**
     * Sets the ipStackConfig value for this GuestStackInfo.
     * 
     * @param ipStackConfig
     */
    public void setIpStackConfig(com.vmware.converter.KeyValue[] ipStackConfig) {
        this.ipStackConfig = ipStackConfig;
    }

    public com.vmware.converter.KeyValue getIpStackConfig(int i) {
        return this.ipStackConfig[i];
    }

    public void setIpStackConfig(int i, com.vmware.converter.KeyValue _value) {
        this.ipStackConfig[i] = _value;
    }


    /**
     * Gets the dhcpConfig value for this GuestStackInfo.
     * 
     * @return dhcpConfig
     */
    public com.vmware.converter.NetDhcpConfigInfo getDhcpConfig() {
        return dhcpConfig;
    }


    /**
     * Sets the dhcpConfig value for this GuestStackInfo.
     * 
     * @param dhcpConfig
     */
    public void setDhcpConfig(com.vmware.converter.NetDhcpConfigInfo dhcpConfig) {
        this.dhcpConfig = dhcpConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestStackInfo)) return false;
        GuestStackInfo other = (GuestStackInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipRouteConfig==null && other.getIpRouteConfig()==null) || 
             (this.ipRouteConfig!=null &&
              this.ipRouteConfig.equals(other.getIpRouteConfig()))) &&
            ((this.ipStackConfig==null && other.getIpStackConfig()==null) || 
             (this.ipStackConfig!=null &&
              java.util.Arrays.equals(this.ipStackConfig, other.getIpStackConfig()))) &&
            ((this.dhcpConfig==null && other.getDhcpConfig()==null) || 
             (this.dhcpConfig!=null &&
              this.dhcpConfig.equals(other.getDhcpConfig())));
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
        if (getDnsConfig() != null) {
            _hashCode += getDnsConfig().hashCode();
        }
        if (getIpRouteConfig() != null) {
            _hashCode += getIpRouteConfig().hashCode();
        }
        if (getIpStackConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpStackConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpStackConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDhcpConfig() != null) {
            _hashCode += getDhcpConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestStackInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestStackInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDnsConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipStackConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipStackConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcpConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcpConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigInfo"));
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
