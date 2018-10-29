/**
 * GuestNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestNicInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String network;

    private java.lang.String[] ipAddress;

    private java.lang.String macAddress;

    private boolean connected;

    private int deviceConfigId;

    private com.vmware.converter.NetDnsConfigInfo dnsConfig;

    private com.vmware.converter.NetIpConfigInfo ipConfig;

    private com.vmware.converter.NetBIOSConfigInfo netBIOSConfig;

    public GuestNicInfo() {
    }

    public GuestNicInfo(
           java.lang.String network,
           java.lang.String[] ipAddress,
           java.lang.String macAddress,
           boolean connected,
           int deviceConfigId,
           com.vmware.converter.NetDnsConfigInfo dnsConfig,
           com.vmware.converter.NetIpConfigInfo ipConfig,
           com.vmware.converter.NetBIOSConfigInfo netBIOSConfig) {
        this.network = network;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.connected = connected;
        this.deviceConfigId = deviceConfigId;
        this.dnsConfig = dnsConfig;
        this.ipConfig = ipConfig;
        this.netBIOSConfig = netBIOSConfig;
    }


    /**
     * Gets the network value for this GuestNicInfo.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this GuestNicInfo.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the ipAddress value for this GuestNicInfo.
     * 
     * @return ipAddress
     */
    public java.lang.String[] getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this GuestNicInfo.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public java.lang.String getIpAddress(int i) {
        return this.ipAddress[i];
    }

    public void setIpAddress(int i, java.lang.String _value) {
        this.ipAddress[i] = _value;
    }


    /**
     * Gets the macAddress value for this GuestNicInfo.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this GuestNicInfo.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the connected value for this GuestNicInfo.
     * 
     * @return connected
     */
    public boolean isConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this GuestNicInfo.
     * 
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }


    /**
     * Gets the deviceConfigId value for this GuestNicInfo.
     * 
     * @return deviceConfigId
     */
    public int getDeviceConfigId() {
        return deviceConfigId;
    }


    /**
     * Sets the deviceConfigId value for this GuestNicInfo.
     * 
     * @param deviceConfigId
     */
    public void setDeviceConfigId(int deviceConfigId) {
        this.deviceConfigId = deviceConfigId;
    }


    /**
     * Gets the dnsConfig value for this GuestNicInfo.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.NetDnsConfigInfo getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this GuestNicInfo.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.NetDnsConfigInfo dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipConfig value for this GuestNicInfo.
     * 
     * @return ipConfig
     */
    public com.vmware.converter.NetIpConfigInfo getIpConfig() {
        return ipConfig;
    }


    /**
     * Sets the ipConfig value for this GuestNicInfo.
     * 
     * @param ipConfig
     */
    public void setIpConfig(com.vmware.converter.NetIpConfigInfo ipConfig) {
        this.ipConfig = ipConfig;
    }


    /**
     * Gets the netBIOSConfig value for this GuestNicInfo.
     * 
     * @return netBIOSConfig
     */
    public com.vmware.converter.NetBIOSConfigInfo getNetBIOSConfig() {
        return netBIOSConfig;
    }


    /**
     * Sets the netBIOSConfig value for this GuestNicInfo.
     * 
     * @param netBIOSConfig
     */
    public void setNetBIOSConfig(com.vmware.converter.NetBIOSConfigInfo netBIOSConfig) {
        this.netBIOSConfig = netBIOSConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestNicInfo)) return false;
        GuestNicInfo other = (GuestNicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              java.util.Arrays.equals(this.ipAddress, other.getIpAddress()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            this.connected == other.isConnected() &&
            this.deviceConfigId == other.getDeviceConfigId() &&
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipConfig==null && other.getIpConfig()==null) || 
             (this.ipConfig!=null &&
              this.ipConfig.equals(other.getIpConfig()))) &&
            ((this.netBIOSConfig==null && other.getNetBIOSConfig()==null) || 
             (this.netBIOSConfig!=null &&
              this.netBIOSConfig.equals(other.getNetBIOSConfig())));
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
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
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        _hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDeviceConfigId();
        if (getDnsConfig() != null) {
            _hashCode += getDnsConfig().hashCode();
        }
        if (getIpConfig() != null) {
            _hashCode += getIpConfig().hashCode();
        }
        if (getNetBIOSConfig() != null) {
            _hashCode += getNetBIOSConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestNicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestNicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceConfigId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceConfigId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDnsConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netBIOSConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netBIOSConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetBIOSConfigInfo"));
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
