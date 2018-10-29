/**
 * HostNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNetworkInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostVirtualSwitch[] vswitch;

    private com.vmware.converter.HostProxySwitch[] proxySwitch;

    private com.vmware.converter.HostPortGroup[] portgroup;

    private com.vmware.converter.PhysicalNic[] pnic;

    private com.vmware.converter.HostVirtualNic[] vnic;

    private com.vmware.converter.HostVirtualNic[] consoleVnic;

    private com.vmware.converter.HostDnsConfig dnsConfig;

    private com.vmware.converter.HostIpRouteConfig ipRouteConfig;

    private com.vmware.converter.HostIpRouteConfig consoleIpRouteConfig;

    private com.vmware.converter.HostIpRouteTableInfo routeTableInfo;

    private com.vmware.converter.HostDhcpService[] dhcp;

    private com.vmware.converter.HostNatService[] nat;

    private java.lang.Boolean ipV6Enabled;

    private java.lang.Boolean atBootIpV6Enabled;

    private com.vmware.converter.HostNetStackInstance[] netStackInstance;

    private com.vmware.converter.HostOpaqueSwitch[] opaqueSwitch;

    private com.vmware.converter.HostOpaqueNetworkInfo[] opaqueNetwork;

    public HostNetworkInfo() {
    }

    public HostNetworkInfo(
           com.vmware.converter.HostVirtualSwitch[] vswitch,
           com.vmware.converter.HostProxySwitch[] proxySwitch,
           com.vmware.converter.HostPortGroup[] portgroup,
           com.vmware.converter.PhysicalNic[] pnic,
           com.vmware.converter.HostVirtualNic[] vnic,
           com.vmware.converter.HostVirtualNic[] consoleVnic,
           com.vmware.converter.HostDnsConfig dnsConfig,
           com.vmware.converter.HostIpRouteConfig ipRouteConfig,
           com.vmware.converter.HostIpRouteConfig consoleIpRouteConfig,
           com.vmware.converter.HostIpRouteTableInfo routeTableInfo,
           com.vmware.converter.HostDhcpService[] dhcp,
           com.vmware.converter.HostNatService[] nat,
           java.lang.Boolean ipV6Enabled,
           java.lang.Boolean atBootIpV6Enabled,
           com.vmware.converter.HostNetStackInstance[] netStackInstance,
           com.vmware.converter.HostOpaqueSwitch[] opaqueSwitch,
           com.vmware.converter.HostOpaqueNetworkInfo[] opaqueNetwork) {
        this.vswitch = vswitch;
        this.proxySwitch = proxySwitch;
        this.portgroup = portgroup;
        this.pnic = pnic;
        this.vnic = vnic;
        this.consoleVnic = consoleVnic;
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
        this.consoleIpRouteConfig = consoleIpRouteConfig;
        this.routeTableInfo = routeTableInfo;
        this.dhcp = dhcp;
        this.nat = nat;
        this.ipV6Enabled = ipV6Enabled;
        this.atBootIpV6Enabled = atBootIpV6Enabled;
        this.netStackInstance = netStackInstance;
        this.opaqueSwitch = opaqueSwitch;
        this.opaqueNetwork = opaqueNetwork;
    }


    /**
     * Gets the vswitch value for this HostNetworkInfo.
     * 
     * @return vswitch
     */
    public com.vmware.converter.HostVirtualSwitch[] getVswitch() {
        return vswitch;
    }


    /**
     * Sets the vswitch value for this HostNetworkInfo.
     * 
     * @param vswitch
     */
    public void setVswitch(com.vmware.converter.HostVirtualSwitch[] vswitch) {
        this.vswitch = vswitch;
    }

    public com.vmware.converter.HostVirtualSwitch getVswitch(int i) {
        return this.vswitch[i];
    }

    public void setVswitch(int i, com.vmware.converter.HostVirtualSwitch _value) {
        this.vswitch[i] = _value;
    }


    /**
     * Gets the proxySwitch value for this HostNetworkInfo.
     * 
     * @return proxySwitch
     */
    public com.vmware.converter.HostProxySwitch[] getProxySwitch() {
        return proxySwitch;
    }


    /**
     * Sets the proxySwitch value for this HostNetworkInfo.
     * 
     * @param proxySwitch
     */
    public void setProxySwitch(com.vmware.converter.HostProxySwitch[] proxySwitch) {
        this.proxySwitch = proxySwitch;
    }

    public com.vmware.converter.HostProxySwitch getProxySwitch(int i) {
        return this.proxySwitch[i];
    }

    public void setProxySwitch(int i, com.vmware.converter.HostProxySwitch _value) {
        this.proxySwitch[i] = _value;
    }


    /**
     * Gets the portgroup value for this HostNetworkInfo.
     * 
     * @return portgroup
     */
    public com.vmware.converter.HostPortGroup[] getPortgroup() {
        return portgroup;
    }


    /**
     * Sets the portgroup value for this HostNetworkInfo.
     * 
     * @param portgroup
     */
    public void setPortgroup(com.vmware.converter.HostPortGroup[] portgroup) {
        this.portgroup = portgroup;
    }

    public com.vmware.converter.HostPortGroup getPortgroup(int i) {
        return this.portgroup[i];
    }

    public void setPortgroup(int i, com.vmware.converter.HostPortGroup _value) {
        this.portgroup[i] = _value;
    }


    /**
     * Gets the pnic value for this HostNetworkInfo.
     * 
     * @return pnic
     */
    public com.vmware.converter.PhysicalNic[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this HostNetworkInfo.
     * 
     * @param pnic
     */
    public void setPnic(com.vmware.converter.PhysicalNic[] pnic) {
        this.pnic = pnic;
    }

    public com.vmware.converter.PhysicalNic getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, com.vmware.converter.PhysicalNic _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the vnic value for this HostNetworkInfo.
     * 
     * @return vnic
     */
    public com.vmware.converter.HostVirtualNic[] getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this HostNetworkInfo.
     * 
     * @param vnic
     */
    public void setVnic(com.vmware.converter.HostVirtualNic[] vnic) {
        this.vnic = vnic;
    }

    public com.vmware.converter.HostVirtualNic getVnic(int i) {
        return this.vnic[i];
    }

    public void setVnic(int i, com.vmware.converter.HostVirtualNic _value) {
        this.vnic[i] = _value;
    }


    /**
     * Gets the consoleVnic value for this HostNetworkInfo.
     * 
     * @return consoleVnic
     */
    public com.vmware.converter.HostVirtualNic[] getConsoleVnic() {
        return consoleVnic;
    }


    /**
     * Sets the consoleVnic value for this HostNetworkInfo.
     * 
     * @param consoleVnic
     */
    public void setConsoleVnic(com.vmware.converter.HostVirtualNic[] consoleVnic) {
        this.consoleVnic = consoleVnic;
    }

    public com.vmware.converter.HostVirtualNic getConsoleVnic(int i) {
        return this.consoleVnic[i];
    }

    public void setConsoleVnic(int i, com.vmware.converter.HostVirtualNic _value) {
        this.consoleVnic[i] = _value;
    }


    /**
     * Gets the dnsConfig value for this HostNetworkInfo.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this HostNetworkInfo.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this HostNetworkInfo.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.converter.HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this HostNetworkInfo.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.converter.HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the consoleIpRouteConfig value for this HostNetworkInfo.
     * 
     * @return consoleIpRouteConfig
     */
    public com.vmware.converter.HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }


    /**
     * Sets the consoleIpRouteConfig value for this HostNetworkInfo.
     * 
     * @param consoleIpRouteConfig
     */
    public void setConsoleIpRouteConfig(com.vmware.converter.HostIpRouteConfig consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }


    /**
     * Gets the routeTableInfo value for this HostNetworkInfo.
     * 
     * @return routeTableInfo
     */
    public com.vmware.converter.HostIpRouteTableInfo getRouteTableInfo() {
        return routeTableInfo;
    }


    /**
     * Sets the routeTableInfo value for this HostNetworkInfo.
     * 
     * @param routeTableInfo
     */
    public void setRouteTableInfo(com.vmware.converter.HostIpRouteTableInfo routeTableInfo) {
        this.routeTableInfo = routeTableInfo;
    }


    /**
     * Gets the dhcp value for this HostNetworkInfo.
     * 
     * @return dhcp
     */
    public com.vmware.converter.HostDhcpService[] getDhcp() {
        return dhcp;
    }


    /**
     * Sets the dhcp value for this HostNetworkInfo.
     * 
     * @param dhcp
     */
    public void setDhcp(com.vmware.converter.HostDhcpService[] dhcp) {
        this.dhcp = dhcp;
    }

    public com.vmware.converter.HostDhcpService getDhcp(int i) {
        return this.dhcp[i];
    }

    public void setDhcp(int i, com.vmware.converter.HostDhcpService _value) {
        this.dhcp[i] = _value;
    }


    /**
     * Gets the nat value for this HostNetworkInfo.
     * 
     * @return nat
     */
    public com.vmware.converter.HostNatService[] getNat() {
        return nat;
    }


    /**
     * Sets the nat value for this HostNetworkInfo.
     * 
     * @param nat
     */
    public void setNat(com.vmware.converter.HostNatService[] nat) {
        this.nat = nat;
    }

    public com.vmware.converter.HostNatService getNat(int i) {
        return this.nat[i];
    }

    public void setNat(int i, com.vmware.converter.HostNatService _value) {
        this.nat[i] = _value;
    }


    /**
     * Gets the ipV6Enabled value for this HostNetworkInfo.
     * 
     * @return ipV6Enabled
     */
    public java.lang.Boolean getIpV6Enabled() {
        return ipV6Enabled;
    }


    /**
     * Sets the ipV6Enabled value for this HostNetworkInfo.
     * 
     * @param ipV6Enabled
     */
    public void setIpV6Enabled(java.lang.Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }


    /**
     * Gets the atBootIpV6Enabled value for this HostNetworkInfo.
     * 
     * @return atBootIpV6Enabled
     */
    public java.lang.Boolean getAtBootIpV6Enabled() {
        return atBootIpV6Enabled;
    }


    /**
     * Sets the atBootIpV6Enabled value for this HostNetworkInfo.
     * 
     * @param atBootIpV6Enabled
     */
    public void setAtBootIpV6Enabled(java.lang.Boolean atBootIpV6Enabled) {
        this.atBootIpV6Enabled = atBootIpV6Enabled;
    }


    /**
     * Gets the netStackInstance value for this HostNetworkInfo.
     * 
     * @return netStackInstance
     */
    public com.vmware.converter.HostNetStackInstance[] getNetStackInstance() {
        return netStackInstance;
    }


    /**
     * Sets the netStackInstance value for this HostNetworkInfo.
     * 
     * @param netStackInstance
     */
    public void setNetStackInstance(com.vmware.converter.HostNetStackInstance[] netStackInstance) {
        this.netStackInstance = netStackInstance;
    }

    public com.vmware.converter.HostNetStackInstance getNetStackInstance(int i) {
        return this.netStackInstance[i];
    }

    public void setNetStackInstance(int i, com.vmware.converter.HostNetStackInstance _value) {
        this.netStackInstance[i] = _value;
    }


    /**
     * Gets the opaqueSwitch value for this HostNetworkInfo.
     * 
     * @return opaqueSwitch
     */
    public com.vmware.converter.HostOpaqueSwitch[] getOpaqueSwitch() {
        return opaqueSwitch;
    }


    /**
     * Sets the opaqueSwitch value for this HostNetworkInfo.
     * 
     * @param opaqueSwitch
     */
    public void setOpaqueSwitch(com.vmware.converter.HostOpaqueSwitch[] opaqueSwitch) {
        this.opaqueSwitch = opaqueSwitch;
    }

    public com.vmware.converter.HostOpaqueSwitch getOpaqueSwitch(int i) {
        return this.opaqueSwitch[i];
    }

    public void setOpaqueSwitch(int i, com.vmware.converter.HostOpaqueSwitch _value) {
        this.opaqueSwitch[i] = _value;
    }


    /**
     * Gets the opaqueNetwork value for this HostNetworkInfo.
     * 
     * @return opaqueNetwork
     */
    public com.vmware.converter.HostOpaqueNetworkInfo[] getOpaqueNetwork() {
        return opaqueNetwork;
    }


    /**
     * Sets the opaqueNetwork value for this HostNetworkInfo.
     * 
     * @param opaqueNetwork
     */
    public void setOpaqueNetwork(com.vmware.converter.HostOpaqueNetworkInfo[] opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public com.vmware.converter.HostOpaqueNetworkInfo getOpaqueNetwork(int i) {
        return this.opaqueNetwork[i];
    }

    public void setOpaqueNetwork(int i, com.vmware.converter.HostOpaqueNetworkInfo _value) {
        this.opaqueNetwork[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetworkInfo)) return false;
        HostNetworkInfo other = (HostNetworkInfo) obj;
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
            ((this.routeTableInfo==null && other.getRouteTableInfo()==null) || 
             (this.routeTableInfo!=null &&
              this.routeTableInfo.equals(other.getRouteTableInfo()))) &&
            ((this.dhcp==null && other.getDhcp()==null) || 
             (this.dhcp!=null &&
              java.util.Arrays.equals(this.dhcp, other.getDhcp()))) &&
            ((this.nat==null && other.getNat()==null) || 
             (this.nat!=null &&
              java.util.Arrays.equals(this.nat, other.getNat()))) &&
            ((this.ipV6Enabled==null && other.getIpV6Enabled()==null) || 
             (this.ipV6Enabled!=null &&
              this.ipV6Enabled.equals(other.getIpV6Enabled()))) &&
            ((this.atBootIpV6Enabled==null && other.getAtBootIpV6Enabled()==null) || 
             (this.atBootIpV6Enabled!=null &&
              this.atBootIpV6Enabled.equals(other.getAtBootIpV6Enabled()))) &&
            ((this.netStackInstance==null && other.getNetStackInstance()==null) || 
             (this.netStackInstance!=null &&
              java.util.Arrays.equals(this.netStackInstance, other.getNetStackInstance()))) &&
            ((this.opaqueSwitch==null && other.getOpaqueSwitch()==null) || 
             (this.opaqueSwitch!=null &&
              java.util.Arrays.equals(this.opaqueSwitch, other.getOpaqueSwitch()))) &&
            ((this.opaqueNetwork==null && other.getOpaqueNetwork()==null) || 
             (this.opaqueNetwork!=null &&
              java.util.Arrays.equals(this.opaqueNetwork, other.getOpaqueNetwork())));
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
        if (getRouteTableInfo() != null) {
            _hashCode += getRouteTableInfo().hashCode();
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
        if (getAtBootIpV6Enabled() != null) {
            _hashCode += getAtBootIpV6Enabled().hashCode();
        }
        if (getNetStackInstance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetStackInstance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetStackInstance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpaqueSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpaqueSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpaqueSwitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpaqueNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpaqueNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpaqueNetwork(), i);
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
        new org.apache.axis.description.TypeDesc(HostNetworkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxySwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "proxySwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProxySwitch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleVnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consoleVnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
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
        elemField.setFieldName("routeTableInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "routeTableInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteTableInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDhcpService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatService"));
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
        elemField.setFieldName("atBootIpV6Enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "atBootIpV6Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netStackInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netStackInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetStackInstance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueNetworkInfo"));
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
