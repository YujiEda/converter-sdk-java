/**
 * HostNetworkConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNetworkConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostVirtualSwitchConfig[] vswitch;

    private com.vmware.converter.HostProxySwitchConfig[] proxySwitch;

    private com.vmware.converter.HostPortGroupConfig[] portgroup;

    private com.vmware.converter.PhysicalNicConfig[] pnic;

    private com.vmware.converter.HostVirtualNicConfig[] vnic;

    private com.vmware.converter.HostVirtualNicConfig[] consoleVnic;

    private com.vmware.converter.HostDnsConfig dnsConfig;

    private com.vmware.converter.HostIpRouteConfig ipRouteConfig;

    private com.vmware.converter.HostIpRouteConfig consoleIpRouteConfig;

    private com.vmware.converter.HostIpRouteTableConfig routeTableConfig;

    private com.vmware.converter.HostDhcpServiceConfig[] dhcp;

    private com.vmware.converter.HostNatServiceConfig[] nat;

    private java.lang.Boolean ipV6Enabled;

    private com.vmware.converter.HostNetworkConfigNetStackSpec[] netStackSpec;

    public HostNetworkConfig() {
    }

    public HostNetworkConfig(
           com.vmware.converter.HostVirtualSwitchConfig[] vswitch,
           com.vmware.converter.HostProxySwitchConfig[] proxySwitch,
           com.vmware.converter.HostPortGroupConfig[] portgroup,
           com.vmware.converter.PhysicalNicConfig[] pnic,
           com.vmware.converter.HostVirtualNicConfig[] vnic,
           com.vmware.converter.HostVirtualNicConfig[] consoleVnic,
           com.vmware.converter.HostDnsConfig dnsConfig,
           com.vmware.converter.HostIpRouteConfig ipRouteConfig,
           com.vmware.converter.HostIpRouteConfig consoleIpRouteConfig,
           com.vmware.converter.HostIpRouteTableConfig routeTableConfig,
           com.vmware.converter.HostDhcpServiceConfig[] dhcp,
           com.vmware.converter.HostNatServiceConfig[] nat,
           java.lang.Boolean ipV6Enabled,
           com.vmware.converter.HostNetworkConfigNetStackSpec[] netStackSpec) {
        this.vswitch = vswitch;
        this.proxySwitch = proxySwitch;
        this.portgroup = portgroup;
        this.pnic = pnic;
        this.vnic = vnic;
        this.consoleVnic = consoleVnic;
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
        this.consoleIpRouteConfig = consoleIpRouteConfig;
        this.routeTableConfig = routeTableConfig;
        this.dhcp = dhcp;
        this.nat = nat;
        this.ipV6Enabled = ipV6Enabled;
        this.netStackSpec = netStackSpec;
    }


    /**
     * Gets the vswitch value for this HostNetworkConfig.
     * 
     * @return vswitch
     */
    public com.vmware.converter.HostVirtualSwitchConfig[] getVswitch() {
        return vswitch;
    }


    /**
     * Sets the vswitch value for this HostNetworkConfig.
     * 
     * @param vswitch
     */
    public void setVswitch(com.vmware.converter.HostVirtualSwitchConfig[] vswitch) {
        this.vswitch = vswitch;
    }

    public com.vmware.converter.HostVirtualSwitchConfig getVswitch(int i) {
        return this.vswitch[i];
    }

    public void setVswitch(int i, com.vmware.converter.HostVirtualSwitchConfig _value) {
        this.vswitch[i] = _value;
    }


    /**
     * Gets the proxySwitch value for this HostNetworkConfig.
     * 
     * @return proxySwitch
     */
    public com.vmware.converter.HostProxySwitchConfig[] getProxySwitch() {
        return proxySwitch;
    }


    /**
     * Sets the proxySwitch value for this HostNetworkConfig.
     * 
     * @param proxySwitch
     */
    public void setProxySwitch(com.vmware.converter.HostProxySwitchConfig[] proxySwitch) {
        this.proxySwitch = proxySwitch;
    }

    public com.vmware.converter.HostProxySwitchConfig getProxySwitch(int i) {
        return this.proxySwitch[i];
    }

    public void setProxySwitch(int i, com.vmware.converter.HostProxySwitchConfig _value) {
        this.proxySwitch[i] = _value;
    }


    /**
     * Gets the portgroup value for this HostNetworkConfig.
     * 
     * @return portgroup
     */
    public com.vmware.converter.HostPortGroupConfig[] getPortgroup() {
        return portgroup;
    }


    /**
     * Sets the portgroup value for this HostNetworkConfig.
     * 
     * @param portgroup
     */
    public void setPortgroup(com.vmware.converter.HostPortGroupConfig[] portgroup) {
        this.portgroup = portgroup;
    }

    public com.vmware.converter.HostPortGroupConfig getPortgroup(int i) {
        return this.portgroup[i];
    }

    public void setPortgroup(int i, com.vmware.converter.HostPortGroupConfig _value) {
        this.portgroup[i] = _value;
    }


    /**
     * Gets the pnic value for this HostNetworkConfig.
     * 
     * @return pnic
     */
    public com.vmware.converter.PhysicalNicConfig[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this HostNetworkConfig.
     * 
     * @param pnic
     */
    public void setPnic(com.vmware.converter.PhysicalNicConfig[] pnic) {
        this.pnic = pnic;
    }

    public com.vmware.converter.PhysicalNicConfig getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, com.vmware.converter.PhysicalNicConfig _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the vnic value for this HostNetworkConfig.
     * 
     * @return vnic
     */
    public com.vmware.converter.HostVirtualNicConfig[] getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this HostNetworkConfig.
     * 
     * @param vnic
     */
    public void setVnic(com.vmware.converter.HostVirtualNicConfig[] vnic) {
        this.vnic = vnic;
    }

    public com.vmware.converter.HostVirtualNicConfig getVnic(int i) {
        return this.vnic[i];
    }

    public void setVnic(int i, com.vmware.converter.HostVirtualNicConfig _value) {
        this.vnic[i] = _value;
    }


    /**
     * Gets the consoleVnic value for this HostNetworkConfig.
     * 
     * @return consoleVnic
     */
    public com.vmware.converter.HostVirtualNicConfig[] getConsoleVnic() {
        return consoleVnic;
    }


    /**
     * Sets the consoleVnic value for this HostNetworkConfig.
     * 
     * @param consoleVnic
     */
    public void setConsoleVnic(com.vmware.converter.HostVirtualNicConfig[] consoleVnic) {
        this.consoleVnic = consoleVnic;
    }

    public com.vmware.converter.HostVirtualNicConfig getConsoleVnic(int i) {
        return this.consoleVnic[i];
    }

    public void setConsoleVnic(int i, com.vmware.converter.HostVirtualNicConfig _value) {
        this.consoleVnic[i] = _value;
    }


    /**
     * Gets the dnsConfig value for this HostNetworkConfig.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this HostNetworkConfig.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this HostNetworkConfig.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.converter.HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this HostNetworkConfig.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.converter.HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the consoleIpRouteConfig value for this HostNetworkConfig.
     * 
     * @return consoleIpRouteConfig
     */
    public com.vmware.converter.HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }


    /**
     * Sets the consoleIpRouteConfig value for this HostNetworkConfig.
     * 
     * @param consoleIpRouteConfig
     */
    public void setConsoleIpRouteConfig(com.vmware.converter.HostIpRouteConfig consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }


    /**
     * Gets the routeTableConfig value for this HostNetworkConfig.
     * 
     * @return routeTableConfig
     */
    public com.vmware.converter.HostIpRouteTableConfig getRouteTableConfig() {
        return routeTableConfig;
    }


    /**
     * Sets the routeTableConfig value for this HostNetworkConfig.
     * 
     * @param routeTableConfig
     */
    public void setRouteTableConfig(com.vmware.converter.HostIpRouteTableConfig routeTableConfig) {
        this.routeTableConfig = routeTableConfig;
    }


    /**
     * Gets the dhcp value for this HostNetworkConfig.
     * 
     * @return dhcp
     */
    public com.vmware.converter.HostDhcpServiceConfig[] getDhcp() {
        return dhcp;
    }


    /**
     * Sets the dhcp value for this HostNetworkConfig.
     * 
     * @param dhcp
     */
    public void setDhcp(com.vmware.converter.HostDhcpServiceConfig[] dhcp) {
        this.dhcp = dhcp;
    }

    public com.vmware.converter.HostDhcpServiceConfig getDhcp(int i) {
        return this.dhcp[i];
    }

    public void setDhcp(int i, com.vmware.converter.HostDhcpServiceConfig _value) {
        this.dhcp[i] = _value;
    }


    /**
     * Gets the nat value for this HostNetworkConfig.
     * 
     * @return nat
     */
    public com.vmware.converter.HostNatServiceConfig[] getNat() {
        return nat;
    }


    /**
     * Sets the nat value for this HostNetworkConfig.
     * 
     * @param nat
     */
    public void setNat(com.vmware.converter.HostNatServiceConfig[] nat) {
        this.nat = nat;
    }

    public com.vmware.converter.HostNatServiceConfig getNat(int i) {
        return this.nat[i];
    }

    public void setNat(int i, com.vmware.converter.HostNatServiceConfig _value) {
        this.nat[i] = _value;
    }


    /**
     * Gets the ipV6Enabled value for this HostNetworkConfig.
     * 
     * @return ipV6Enabled
     */
    public java.lang.Boolean getIpV6Enabled() {
        return ipV6Enabled;
    }


    /**
     * Sets the ipV6Enabled value for this HostNetworkConfig.
     * 
     * @param ipV6Enabled
     */
    public void setIpV6Enabled(java.lang.Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }


    /**
     * Gets the netStackSpec value for this HostNetworkConfig.
     * 
     * @return netStackSpec
     */
    public com.vmware.converter.HostNetworkConfigNetStackSpec[] getNetStackSpec() {
        return netStackSpec;
    }


    /**
     * Sets the netStackSpec value for this HostNetworkConfig.
     * 
     * @param netStackSpec
     */
    public void setNetStackSpec(com.vmware.converter.HostNetworkConfigNetStackSpec[] netStackSpec) {
        this.netStackSpec = netStackSpec;
    }

    public com.vmware.converter.HostNetworkConfigNetStackSpec getNetStackSpec(int i) {
        return this.netStackSpec[i];
    }

    public void setNetStackSpec(int i, com.vmware.converter.HostNetworkConfigNetStackSpec _value) {
        this.netStackSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetworkConfig)) return false;
        HostNetworkConfig other = (HostNetworkConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vswitch==null && other.getVswitch()==null) || 
             (this.vswitch!=null &&
              java.util.Arrays.equals(this.vswitch, other.getVswitch()))) &&
            ((this.proxySwitch==null && other.getProxySwitch()==null) || 
             (this.proxySwitch!=null &&
              java.util.Arrays.equals(this.proxySwitch, other.getProxySwitch()))) &&
            ((this.portgroup==null && other.getPortgroup()==null) || 
             (this.portgroup!=null &&
              java.util.Arrays.equals(this.portgroup, other.getPortgroup()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              java.util.Arrays.equals(this.pnic, other.getPnic()))) &&
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              java.util.Arrays.equals(this.vnic, other.getVnic()))) &&
            ((this.consoleVnic==null && other.getConsoleVnic()==null) || 
             (this.consoleVnic!=null &&
              java.util.Arrays.equals(this.consoleVnic, other.getConsoleVnic()))) &&
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipRouteConfig==null && other.getIpRouteConfig()==null) || 
             (this.ipRouteConfig!=null &&
              this.ipRouteConfig.equals(other.getIpRouteConfig()))) &&
            ((this.consoleIpRouteConfig==null && other.getConsoleIpRouteConfig()==null) || 
             (this.consoleIpRouteConfig!=null &&
              this.consoleIpRouteConfig.equals(other.getConsoleIpRouteConfig()))) &&
            ((this.routeTableConfig==null && other.getRouteTableConfig()==null) || 
             (this.routeTableConfig!=null &&
              this.routeTableConfig.equals(other.getRouteTableConfig()))) &&
            ((this.dhcp==null && other.getDhcp()==null) || 
             (this.dhcp!=null &&
              java.util.Arrays.equals(this.dhcp, other.getDhcp()))) &&
            ((this.nat==null && other.getNat()==null) || 
             (this.nat!=null &&
              java.util.Arrays.equals(this.nat, other.getNat()))) &&
            ((this.ipV6Enabled==null && other.getIpV6Enabled()==null) || 
             (this.ipV6Enabled!=null &&
              this.ipV6Enabled.equals(other.getIpV6Enabled()))) &&
            ((this.netStackSpec==null && other.getNetStackSpec()==null) || 
             (this.netStackSpec!=null &&
              java.util.Arrays.equals(this.netStackSpec, other.getNetStackSpec())));
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
        if (getVswitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVswitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVswitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProxySwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProxySwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProxySwitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsoleVnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsoleVnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsoleVnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnsConfig() != null) {
            _hashCode += getDnsConfig().hashCode();
        }
        if (getIpRouteConfig() != null) {
            _hashCode += getIpRouteConfig().hashCode();
        }
        if (getConsoleIpRouteConfig() != null) {
            _hashCode += getConsoleIpRouteConfig().hashCode();
        }
        if (getRouteTableConfig() != null) {
            _hashCode += getRouteTableConfig().hashCode();
        }
        if (getDhcp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDhcp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDhcp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpV6Enabled() != null) {
            _hashCode += getIpV6Enabled().hashCode();
        }
        if (getNetStackSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetStackSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetStackSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNetworkConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxySwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "proxySwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProxySwitchConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleVnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consoleVnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDnsConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleIpRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consoleIpRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeTableConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "routeTableConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteTableConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDhcpServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipV6Enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipV6Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netStackSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netStackSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkConfigNetStackSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
