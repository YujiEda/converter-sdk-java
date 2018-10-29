/**
 * CustomizationIPSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class CustomizationIPSettings  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.CustomizationIpGenerator ip;

    private java.lang.String subnetMask;

    private java.lang.String[] gateway;

    private com.vmware.converter.CustomizationIPSettingsIpV6AddressSpec ipV6Spec;

    private java.lang.String[] dnsServerList;

    private java.lang.String dnsDomain;

    private java.lang.String primaryWINS;

    private java.lang.String secondaryWINS;

    private com.vmware.converter.CustomizationNetBIOSMode netBIOS;

    public CustomizationIPSettings() {
    }

    public CustomizationIPSettings(
           com.vmware.converter.CustomizationIpGenerator ip,
           java.lang.String subnetMask,
           java.lang.String[] gateway,
           com.vmware.converter.CustomizationIPSettingsIpV6AddressSpec ipV6Spec,
           java.lang.String[] dnsServerList,
           java.lang.String dnsDomain,
           java.lang.String primaryWINS,
           java.lang.String secondaryWINS,
           com.vmware.converter.CustomizationNetBIOSMode netBIOS) {
        this.ip = ip;
        this.subnetMask = subnetMask;
        this.gateway = gateway;
        this.ipV6Spec = ipV6Spec;
        this.dnsServerList = dnsServerList;
        this.dnsDomain = dnsDomain;
        this.primaryWINS = primaryWINS;
        this.secondaryWINS = secondaryWINS;
        this.netBIOS = netBIOS;
    }


    /**
     * Gets the ip value for this CustomizationIPSettings.
     * 
     * @return ip
     */
    public com.vmware.converter.CustomizationIpGenerator getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this CustomizationIPSettings.
     * 
     * @param ip
     */
    public void setIp(com.vmware.converter.CustomizationIpGenerator ip) {
        this.ip = ip;
    }


    /**
     * Gets the subnetMask value for this CustomizationIPSettings.
     * 
     * @return subnetMask
     */
    public java.lang.String getSubnetMask() {
        return subnetMask;
    }


    /**
     * Sets the subnetMask value for this CustomizationIPSettings.
     * 
     * @param subnetMask
     */
    public void setSubnetMask(java.lang.String subnetMask) {
        this.subnetMask = subnetMask;
    }


    /**
     * Gets the gateway value for this CustomizationIPSettings.
     * 
     * @return gateway
     */
    public java.lang.String[] getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this CustomizationIPSettings.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String[] gateway) {
        this.gateway = gateway;
    }

    public java.lang.String getGateway(int i) {
        return this.gateway[i];
    }

    public void setGateway(int i, java.lang.String _value) {
        this.gateway[i] = _value;
    }


    /**
     * Gets the ipV6Spec value for this CustomizationIPSettings.
     * 
     * @return ipV6Spec
     */
    public com.vmware.converter.CustomizationIPSettingsIpV6AddressSpec getIpV6Spec() {
        return ipV6Spec;
    }


    /**
     * Sets the ipV6Spec value for this CustomizationIPSettings.
     * 
     * @param ipV6Spec
     */
    public void setIpV6Spec(com.vmware.converter.CustomizationIPSettingsIpV6AddressSpec ipV6Spec) {
        this.ipV6Spec = ipV6Spec;
    }


    /**
     * Gets the dnsServerList value for this CustomizationIPSettings.
     * 
     * @return dnsServerList
     */
    public java.lang.String[] getDnsServerList() {
        return dnsServerList;
    }


    /**
     * Sets the dnsServerList value for this CustomizationIPSettings.
     * 
     * @param dnsServerList
     */
    public void setDnsServerList(java.lang.String[] dnsServerList) {
        this.dnsServerList = dnsServerList;
    }

    public java.lang.String getDnsServerList(int i) {
        return this.dnsServerList[i];
    }

    public void setDnsServerList(int i, java.lang.String _value) {
        this.dnsServerList[i] = _value;
    }


    /**
     * Gets the dnsDomain value for this CustomizationIPSettings.
     * 
     * @return dnsDomain
     */
    public java.lang.String getDnsDomain() {
        return dnsDomain;
    }


    /**
     * Sets the dnsDomain value for this CustomizationIPSettings.
     * 
     * @param dnsDomain
     */
    public void setDnsDomain(java.lang.String dnsDomain) {
        this.dnsDomain = dnsDomain;
    }


    /**
     * Gets the primaryWINS value for this CustomizationIPSettings.
     * 
     * @return primaryWINS
     */
    public java.lang.String getPrimaryWINS() {
        return primaryWINS;
    }


    /**
     * Sets the primaryWINS value for this CustomizationIPSettings.
     * 
     * @param primaryWINS
     */
    public void setPrimaryWINS(java.lang.String primaryWINS) {
        this.primaryWINS = primaryWINS;
    }


    /**
     * Gets the secondaryWINS value for this CustomizationIPSettings.
     * 
     * @return secondaryWINS
     */
    public java.lang.String getSecondaryWINS() {
        return secondaryWINS;
    }


    /**
     * Sets the secondaryWINS value for this CustomizationIPSettings.
     * 
     * @param secondaryWINS
     */
    public void setSecondaryWINS(java.lang.String secondaryWINS) {
        this.secondaryWINS = secondaryWINS;
    }


    /**
     * Gets the netBIOS value for this CustomizationIPSettings.
     * 
     * @return netBIOS
     */
    public com.vmware.converter.CustomizationNetBIOSMode getNetBIOS() {
        return netBIOS;
    }


    /**
     * Sets the netBIOS value for this CustomizationIPSettings.
     * 
     * @param netBIOS
     */
    public void setNetBIOS(com.vmware.converter.CustomizationNetBIOSMode netBIOS) {
        this.netBIOS = netBIOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationIPSettings)) return false;
        CustomizationIPSettings other = (CustomizationIPSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.subnetMask==null && other.getSubnetMask()==null) || 
             (this.subnetMask!=null &&
              this.subnetMask.equals(other.getSubnetMask()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              java.util.Arrays.equals(this.gateway, other.getGateway()))) &&
            ((this.ipV6Spec==null && other.getIpV6Spec()==null) || 
             (this.ipV6Spec!=null &&
              this.ipV6Spec.equals(other.getIpV6Spec()))) &&
            ((this.dnsServerList==null && other.getDnsServerList()==null) || 
             (this.dnsServerList!=null &&
              java.util.Arrays.equals(this.dnsServerList, other.getDnsServerList()))) &&
            ((this.dnsDomain==null && other.getDnsDomain()==null) || 
             (this.dnsDomain!=null &&
              this.dnsDomain.equals(other.getDnsDomain()))) &&
            ((this.primaryWINS==null && other.getPrimaryWINS()==null) || 
             (this.primaryWINS!=null &&
              this.primaryWINS.equals(other.getPrimaryWINS()))) &&
            ((this.secondaryWINS==null && other.getSecondaryWINS()==null) || 
             (this.secondaryWINS!=null &&
              this.secondaryWINS.equals(other.getSecondaryWINS()))) &&
            ((this.netBIOS==null && other.getNetBIOS()==null) || 
             (this.netBIOS!=null &&
              this.netBIOS.equals(other.getNetBIOS())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getSubnetMask() != null) {
            _hashCode += getSubnetMask().hashCode();
        }
        if (getGateway() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGateway());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGateway(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpV6Spec() != null) {
            _hashCode += getIpV6Spec().hashCode();
        }
        if (getDnsServerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnsServerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnsServerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnsDomain() != null) {
            _hashCode += getDnsDomain().hashCode();
        }
        if (getPrimaryWINS() != null) {
            _hashCode += getPrimaryWINS().hashCode();
        }
        if (getSecondaryWINS() != null) {
            _hashCode += getSecondaryWINS().hashCode();
        }
        if (getNetBIOS() != null) {
            _hashCode += getNetBIOS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizationIPSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIPSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIpGenerator"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subnetMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipV6Spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipV6Spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIPSettingsIpV6AddressSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsServerList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsServerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryWINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryWINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryWINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "secondaryWINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netBIOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netBIOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationNetBIOSMode"));
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
