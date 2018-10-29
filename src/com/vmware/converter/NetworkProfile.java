/**
 * NetworkProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetworkProfile  extends com.vmware.converter.ApplyProfile  implements java.io.Serializable {
    private com.vmware.converter.VirtualSwitchProfile[] vswitch;

    private com.vmware.converter.VmPortGroupProfile[] vmPortGroup;

    private com.vmware.converter.HostPortGroupProfile[] hostPortGroup;

    private com.vmware.converter.ServiceConsolePortGroupProfile[] serviceConsolePortGroup;

    private com.vmware.converter.NetworkProfileDnsConfigProfile dnsConfig;

    private com.vmware.converter.IpRouteProfile ipRouteConfig;

    private com.vmware.converter.IpRouteProfile consoleIpRouteConfig;

    private com.vmware.converter.PhysicalNicProfile[] pnic;

    private com.vmware.converter.DvsProfile[] dvswitch;

    private com.vmware.converter.DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic;

    private com.vmware.converter.DvsHostVNicProfile[] dvsHostNic;

    private com.vmware.converter.NetStackInstanceProfile[] netStackInstance;

    public NetworkProfile() {
    }

    public NetworkProfile(
           boolean enabled,
           com.vmware.converter.ProfilePolicy[] policy,
           java.lang.String profileTypeName,
           java.lang.String profileVersion,
           com.vmware.converter.ProfileApplyProfileProperty[] property,
           com.vmware.converter.VirtualSwitchProfile[] vswitch,
           com.vmware.converter.VmPortGroupProfile[] vmPortGroup,
           com.vmware.converter.HostPortGroupProfile[] hostPortGroup,
           com.vmware.converter.ServiceConsolePortGroupProfile[] serviceConsolePortGroup,
           com.vmware.converter.NetworkProfileDnsConfigProfile dnsConfig,
           com.vmware.converter.IpRouteProfile ipRouteConfig,
           com.vmware.converter.IpRouteProfile consoleIpRouteConfig,
           com.vmware.converter.PhysicalNicProfile[] pnic,
           com.vmware.converter.DvsProfile[] dvswitch,
           com.vmware.converter.DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic,
           com.vmware.converter.DvsHostVNicProfile[] dvsHostNic,
           com.vmware.converter.NetStackInstanceProfile[] netStackInstance) {
        super(
            enabled,
            policy,
            profileTypeName,
            profileVersion,
            property);
        this.vswitch = vswitch;
        this.vmPortGroup = vmPortGroup;
        this.hostPortGroup = hostPortGroup;
        this.serviceConsolePortGroup = serviceConsolePortGroup;
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
        this.consoleIpRouteConfig = consoleIpRouteConfig;
        this.pnic = pnic;
        this.dvswitch = dvswitch;
        this.dvsServiceConsoleNic = dvsServiceConsoleNic;
        this.dvsHostNic = dvsHostNic;
        this.netStackInstance = netStackInstance;
    }


    /**
     * Gets the vswitch value for this NetworkProfile.
     * 
     * @return vswitch
     */
    public com.vmware.converter.VirtualSwitchProfile[] getVswitch() {
        return vswitch;
    }


    /**
     * Sets the vswitch value for this NetworkProfile.
     * 
     * @param vswitch
     */
    public void setVswitch(com.vmware.converter.VirtualSwitchProfile[] vswitch) {
        this.vswitch = vswitch;
    }

    public com.vmware.converter.VirtualSwitchProfile getVswitch(int i) {
        return this.vswitch[i];
    }

    public void setVswitch(int i, com.vmware.converter.VirtualSwitchProfile _value) {
        this.vswitch[i] = _value;
    }


    /**
     * Gets the vmPortGroup value for this NetworkProfile.
     * 
     * @return vmPortGroup
     */
    public com.vmware.converter.VmPortGroupProfile[] getVmPortGroup() {
        return vmPortGroup;
    }


    /**
     * Sets the vmPortGroup value for this NetworkProfile.
     * 
     * @param vmPortGroup
     */
    public void setVmPortGroup(com.vmware.converter.VmPortGroupProfile[] vmPortGroup) {
        this.vmPortGroup = vmPortGroup;
    }

    public com.vmware.converter.VmPortGroupProfile getVmPortGroup(int i) {
        return this.vmPortGroup[i];
    }

    public void setVmPortGroup(int i, com.vmware.converter.VmPortGroupProfile _value) {
        this.vmPortGroup[i] = _value;
    }


    /**
     * Gets the hostPortGroup value for this NetworkProfile.
     * 
     * @return hostPortGroup
     */
    public com.vmware.converter.HostPortGroupProfile[] getHostPortGroup() {
        return hostPortGroup;
    }


    /**
     * Sets the hostPortGroup value for this NetworkProfile.
     * 
     * @param hostPortGroup
     */
    public void setHostPortGroup(com.vmware.converter.HostPortGroupProfile[] hostPortGroup) {
        this.hostPortGroup = hostPortGroup;
    }

    public com.vmware.converter.HostPortGroupProfile getHostPortGroup(int i) {
        return this.hostPortGroup[i];
    }

    public void setHostPortGroup(int i, com.vmware.converter.HostPortGroupProfile _value) {
        this.hostPortGroup[i] = _value;
    }


    /**
     * Gets the serviceConsolePortGroup value for this NetworkProfile.
     * 
     * @return serviceConsolePortGroup
     */
    public com.vmware.converter.ServiceConsolePortGroupProfile[] getServiceConsolePortGroup() {
        return serviceConsolePortGroup;
    }


    /**
     * Sets the serviceConsolePortGroup value for this NetworkProfile.
     * 
     * @param serviceConsolePortGroup
     */
    public void setServiceConsolePortGroup(com.vmware.converter.ServiceConsolePortGroupProfile[] serviceConsolePortGroup) {
        this.serviceConsolePortGroup = serviceConsolePortGroup;
    }

    public com.vmware.converter.ServiceConsolePortGroupProfile getServiceConsolePortGroup(int i) {
        return this.serviceConsolePortGroup[i];
    }

    public void setServiceConsolePortGroup(int i, com.vmware.converter.ServiceConsolePortGroupProfile _value) {
        this.serviceConsolePortGroup[i] = _value;
    }


    /**
     * Gets the dnsConfig value for this NetworkProfile.
     * 
     * @return dnsConfig
     */
    public com.vmware.converter.NetworkProfileDnsConfigProfile getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this NetworkProfile.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.converter.NetworkProfileDnsConfigProfile dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this NetworkProfile.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.converter.IpRouteProfile getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this NetworkProfile.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.converter.IpRouteProfile ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the consoleIpRouteConfig value for this NetworkProfile.
     * 
     * @return consoleIpRouteConfig
     */
    public com.vmware.converter.IpRouteProfile getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }


    /**
     * Sets the consoleIpRouteConfig value for this NetworkProfile.
     * 
     * @param consoleIpRouteConfig
     */
    public void setConsoleIpRouteConfig(com.vmware.converter.IpRouteProfile consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }


    /**
     * Gets the pnic value for this NetworkProfile.
     * 
     * @return pnic
     */
    public com.vmware.converter.PhysicalNicProfile[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this NetworkProfile.
     * 
     * @param pnic
     */
    public void setPnic(com.vmware.converter.PhysicalNicProfile[] pnic) {
        this.pnic = pnic;
    }

    public com.vmware.converter.PhysicalNicProfile getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, com.vmware.converter.PhysicalNicProfile _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the dvswitch value for this NetworkProfile.
     * 
     * @return dvswitch
     */
    public com.vmware.converter.DvsProfile[] getDvswitch() {
        return dvswitch;
    }


    /**
     * Sets the dvswitch value for this NetworkProfile.
     * 
     * @param dvswitch
     */
    public void setDvswitch(com.vmware.converter.DvsProfile[] dvswitch) {
        this.dvswitch = dvswitch;
    }

    public com.vmware.converter.DvsProfile getDvswitch(int i) {
        return this.dvswitch[i];
    }

    public void setDvswitch(int i, com.vmware.converter.DvsProfile _value) {
        this.dvswitch[i] = _value;
    }


    /**
     * Gets the dvsServiceConsoleNic value for this NetworkProfile.
     * 
     * @return dvsServiceConsoleNic
     */
    public com.vmware.converter.DvsServiceConsoleVNicProfile[] getDvsServiceConsoleNic() {
        return dvsServiceConsoleNic;
    }


    /**
     * Sets the dvsServiceConsoleNic value for this NetworkProfile.
     * 
     * @param dvsServiceConsoleNic
     */
    public void setDvsServiceConsoleNic(com.vmware.converter.DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic) {
        this.dvsServiceConsoleNic = dvsServiceConsoleNic;
    }

    public com.vmware.converter.DvsServiceConsoleVNicProfile getDvsServiceConsoleNic(int i) {
        return this.dvsServiceConsoleNic[i];
    }

    public void setDvsServiceConsoleNic(int i, com.vmware.converter.DvsServiceConsoleVNicProfile _value) {
        this.dvsServiceConsoleNic[i] = _value;
    }


    /**
     * Gets the dvsHostNic value for this NetworkProfile.
     * 
     * @return dvsHostNic
     */
    public com.vmware.converter.DvsHostVNicProfile[] getDvsHostNic() {
        return dvsHostNic;
    }


    /**
     * Sets the dvsHostNic value for this NetworkProfile.
     * 
     * @param dvsHostNic
     */
    public void setDvsHostNic(com.vmware.converter.DvsHostVNicProfile[] dvsHostNic) {
        this.dvsHostNic = dvsHostNic;
    }

    public com.vmware.converter.DvsHostVNicProfile getDvsHostNic(int i) {
        return this.dvsHostNic[i];
    }

    public void setDvsHostNic(int i, com.vmware.converter.DvsHostVNicProfile _value) {
        this.dvsHostNic[i] = _value;
    }


    /**
     * Gets the netStackInstance value for this NetworkProfile.
     * 
     * @return netStackInstance
     */
    public com.vmware.converter.NetStackInstanceProfile[] getNetStackInstance() {
        return netStackInstance;
    }


    /**
     * Sets the netStackInstance value for this NetworkProfile.
     * 
     * @param netStackInstance
     */
    public void setNetStackInstance(com.vmware.converter.NetStackInstanceProfile[] netStackInstance) {
        this.netStackInstance = netStackInstance;
    }

    public com.vmware.converter.NetStackInstanceProfile getNetStackInstance(int i) {
        return this.netStackInstance[i];
    }

    public void setNetStackInstance(int i, com.vmware.converter.NetStackInstanceProfile _value) {
        this.netStackInstance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkProfile)) return false;
        NetworkProfile other = (NetworkProfile) obj;
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
            ((this.vmPortGroup==null && other.getVmPortGroup()==null) || 
             (this.vmPortGroup!=null &&
              java.util.Arrays.equals(this.vmPortGroup, other.getVmPortGroup()))) &&
            ((this.hostPortGroup==null && other.getHostPortGroup()==null) || 
             (this.hostPortGroup!=null &&
              java.util.Arrays.equals(this.hostPortGroup, other.getHostPortGroup()))) &&
            ((this.serviceConsolePortGroup==null && other.getServiceConsolePortGroup()==null) || 
             (this.serviceConsolePortGroup!=null &&
              java.util.Arrays.equals(this.serviceConsolePortGroup, other.getServiceConsolePortGroup()))) &&
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipRouteConfig==null && other.getIpRouteConfig()==null) || 
             (this.ipRouteConfig!=null &&
              this.ipRouteConfig.equals(other.getIpRouteConfig()))) &&
            ((this.consoleIpRouteConfig==null && other.getConsoleIpRouteConfig()==null) || 
             (this.consoleIpRouteConfig!=null &&
              this.consoleIpRouteConfig.equals(other.getConsoleIpRouteConfig()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              java.util.Arrays.equals(this.pnic, other.getPnic()))) &&
            ((this.dvswitch==null && other.getDvswitch()==null) || 
             (this.dvswitch!=null &&
              java.util.Arrays.equals(this.dvswitch, other.getDvswitch()))) &&
            ((this.dvsServiceConsoleNic==null && other.getDvsServiceConsoleNic()==null) || 
             (this.dvsServiceConsoleNic!=null &&
              java.util.Arrays.equals(this.dvsServiceConsoleNic, other.getDvsServiceConsoleNic()))) &&
            ((this.dvsHostNic==null && other.getDvsHostNic()==null) || 
             (this.dvsHostNic!=null &&
              java.util.Arrays.equals(this.dvsHostNic, other.getDvsHostNic()))) &&
            ((this.netStackInstance==null && other.getNetStackInstance()==null) || 
             (this.netStackInstance!=null &&
              java.util.Arrays.equals(this.netStackInstance, other.getNetStackInstance())));
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
        if (getVmPortGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmPortGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmPortGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHostPortGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPortGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPortGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceConsolePortGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceConsolePortGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceConsolePortGroup(), i);
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
        if (getDvswitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvswitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvswitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDvsServiceConsoleNic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsServiceConsoleNic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsServiceConsoleNic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDvsHostNic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsHostNic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsHostNic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetworkProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSwitchProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmPortGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmPortGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmPortGroupProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPortGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostPortGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceConsolePortGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serviceConsolePortGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceConsolePortGroupProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetworkProfileDnsConfigProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpRouteProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleIpRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consoleIpRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpRouteProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsServiceConsoleNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsServiceConsoleNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsServiceConsoleVNicProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsHostNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsHostNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsHostVNicProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netStackInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netStackInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetStackInstanceProfile"));
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
