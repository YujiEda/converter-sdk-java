/**
 * NetIpConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.NetIpConfigInfoIpAddress[] ipAddress;

    private com.vmware.converter.NetDhcpConfigInfo dhcp;

    private java.lang.Boolean autoConfigurationEnabled;

    public NetIpConfigInfo() {
    }

    public NetIpConfigInfo(
           com.vmware.converter.NetIpConfigInfoIpAddress[] ipAddress,
           com.vmware.converter.NetDhcpConfigInfo dhcp,
           java.lang.Boolean autoConfigurationEnabled) {
        this.ipAddress = ipAddress;
        this.dhcp = dhcp;
        this.autoConfigurationEnabled = autoConfigurationEnabled;
    }


    /**
     * Gets the ipAddress value for this NetIpConfigInfo.
     * 
     * @return ipAddress
     */
    public com.vmware.converter.NetIpConfigInfoIpAddress[] getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this NetIpConfigInfo.
     * 
     * @param ipAddress
     */
    public void setIpAddress(com.vmware.converter.NetIpConfigInfoIpAddress[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public com.vmware.converter.NetIpConfigInfoIpAddress getIpAddress(int i) {
        return this.ipAddress[i];
    }

    public void setIpAddress(int i, com.vmware.converter.NetIpConfigInfoIpAddress _value) {
        this.ipAddress[i] = _value;
    }


    /**
     * Gets the dhcp value for this NetIpConfigInfo.
     * 
     * @return dhcp
     */
    public com.vmware.converter.NetDhcpConfigInfo getDhcp() {
        return dhcp;
    }


    /**
     * Sets the dhcp value for this NetIpConfigInfo.
     * 
     * @param dhcp
     */
    public void setDhcp(com.vmware.converter.NetDhcpConfigInfo dhcp) {
        this.dhcp = dhcp;
    }


    /**
     * Gets the autoConfigurationEnabled value for this NetIpConfigInfo.
     * 
     * @return autoConfigurationEnabled
     */
    public java.lang.Boolean getAutoConfigurationEnabled() {
        return autoConfigurationEnabled;
    }


    /**
     * Sets the autoConfigurationEnabled value for this NetIpConfigInfo.
     * 
     * @param autoConfigurationEnabled
     */
    public void setAutoConfigurationEnabled(java.lang.Boolean autoConfigurationEnabled) {
        this.autoConfigurationEnabled = autoConfigurationEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpConfigInfo)) return false;
        NetIpConfigInfo other = (NetIpConfigInfo) obj;
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
              java.util.Arrays.equals(this.ipAddress, other.getIpAddress()))) &&
            ((this.dhcp==null && other.getDhcp()==null) || 
             (this.dhcp!=null &&
              this.dhcp.equals(other.getDhcp()))) &&
            ((this.autoConfigurationEnabled==null && other.getAutoConfigurationEnabled()==null) || 
             (this.autoConfigurationEnabled!=null &&
              this.autoConfigurationEnabled.equals(other.getAutoConfigurationEnabled())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDhcp() != null) {
            _hashCode += getDhcp().hashCode();
        }
        if (getAutoConfigurationEnabled() != null) {
            _hashCode += getAutoConfigurationEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetIpConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpConfigInfoIpAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoConfigurationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoConfigurationEnabled"));
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
