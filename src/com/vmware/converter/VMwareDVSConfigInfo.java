/**
 * VMwareDVSConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSConfigInfo  extends com.vmware.converter.DVSConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.VMwareVspanSession[] vspanSession;

    private com.vmware.converter.VMwareDVSPvlanMapEntry[] pvlanConfig;

    private int maxMtu;

    private com.vmware.converter.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;

    private com.vmware.converter.VMwareIpfixConfig ipfixConfig;

    private com.vmware.converter.VMwareDvsLacpGroupConfig[] lacpGroupConfig;

    private java.lang.String lacpApiVersion;

    private java.lang.String multicastFilteringMode;

    public VMwareDVSConfigInfo() {
    }

    public VMwareDVSConfigInfo(
           java.lang.String uuid,
           java.lang.String name,
           int numStandalonePorts,
           int numPorts,
           int maxPorts,
           com.vmware.converter.DVSUplinkPortPolicy uplinkPortPolicy,
           com.vmware.converter.ManagedObjectReference[] uplinkPortgroup,
           com.vmware.converter.DVPortSetting defaultPortConfig,
           com.vmware.converter.DistributedVirtualSwitchHostMember[] host,
           com.vmware.converter.DistributedVirtualSwitchProductSpec productInfo,
           com.vmware.converter.DistributedVirtualSwitchProductSpec targetInfo,
           java.lang.String extensionKey,
           com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig,
           com.vmware.converter.DVSPolicy policy,
           java.lang.String description,
           java.lang.String configVersion,
           com.vmware.converter.DVSContactInfo contact,
           java.lang.String switchIpAddress,
           java.util.Calendar createTime,
           java.lang.Boolean networkResourceManagementEnabled,
           java.lang.Integer defaultProxySwitchMaxNumPorts,
           com.vmware.converter.DVSHealthCheckConfig[] healthCheckConfig,
           com.vmware.converter.DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig,
           java.lang.String networkResourceControlVersion,
           com.vmware.converter.DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool,
           java.lang.Integer pnicCapacityRatioForReservation,
           com.vmware.converter.VMwareVspanSession[] vspanSession,
           com.vmware.converter.VMwareDVSPvlanMapEntry[] pvlanConfig,
           int maxMtu,
           com.vmware.converter.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig,
           com.vmware.converter.VMwareIpfixConfig ipfixConfig,
           com.vmware.converter.VMwareDvsLacpGroupConfig[] lacpGroupConfig,
           java.lang.String lacpApiVersion,
           java.lang.String multicastFilteringMode) {
        super(
            uuid,
            name,
            numStandalonePorts,
            numPorts,
            maxPorts,
            uplinkPortPolicy,
            uplinkPortgroup,
            defaultPortConfig,
            host,
            productInfo,
            targetInfo,
            extensionKey,
            vendorSpecificConfig,
            policy,
            description,
            configVersion,
            contact,
            switchIpAddress,
            createTime,
            networkResourceManagementEnabled,
            defaultProxySwitchMaxNumPorts,
            healthCheckConfig,
            infrastructureTrafficResourceConfig,
            networkResourceControlVersion,
            vmVnicNetworkResourcePool,
            pnicCapacityRatioForReservation);
        this.vspanSession = vspanSession;
        this.pvlanConfig = pvlanConfig;
        this.maxMtu = maxMtu;
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
        this.ipfixConfig = ipfixConfig;
        this.lacpGroupConfig = lacpGroupConfig;
        this.lacpApiVersion = lacpApiVersion;
        this.multicastFilteringMode = multicastFilteringMode;
    }


    /**
     * Gets the vspanSession value for this VMwareDVSConfigInfo.
     * 
     * @return vspanSession
     */
    public com.vmware.converter.VMwareVspanSession[] getVspanSession() {
        return vspanSession;
    }


    /**
     * Sets the vspanSession value for this VMwareDVSConfigInfo.
     * 
     * @param vspanSession
     */
    public void setVspanSession(com.vmware.converter.VMwareVspanSession[] vspanSession) {
        this.vspanSession = vspanSession;
    }

    public com.vmware.converter.VMwareVspanSession getVspanSession(int i) {
        return this.vspanSession[i];
    }

    public void setVspanSession(int i, com.vmware.converter.VMwareVspanSession _value) {
        this.vspanSession[i] = _value;
    }


    /**
     * Gets the pvlanConfig value for this VMwareDVSConfigInfo.
     * 
     * @return pvlanConfig
     */
    public com.vmware.converter.VMwareDVSPvlanMapEntry[] getPvlanConfig() {
        return pvlanConfig;
    }


    /**
     * Sets the pvlanConfig value for this VMwareDVSConfigInfo.
     * 
     * @param pvlanConfig
     */
    public void setPvlanConfig(com.vmware.converter.VMwareDVSPvlanMapEntry[] pvlanConfig) {
        this.pvlanConfig = pvlanConfig;
    }

    public com.vmware.converter.VMwareDVSPvlanMapEntry getPvlanConfig(int i) {
        return this.pvlanConfig[i];
    }

    public void setPvlanConfig(int i, com.vmware.converter.VMwareDVSPvlanMapEntry _value) {
        this.pvlanConfig[i] = _value;
    }


    /**
     * Gets the maxMtu value for this VMwareDVSConfigInfo.
     * 
     * @return maxMtu
     */
    public int getMaxMtu() {
        return maxMtu;
    }


    /**
     * Sets the maxMtu value for this VMwareDVSConfigInfo.
     * 
     * @param maxMtu
     */
    public void setMaxMtu(int maxMtu) {
        this.maxMtu = maxMtu;
    }


    /**
     * Gets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigInfo.
     * 
     * @return linkDiscoveryProtocolConfig
     */
    public com.vmware.converter.LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }


    /**
     * Sets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigInfo.
     * 
     * @param linkDiscoveryProtocolConfig
     */
    public void setLinkDiscoveryProtocolConfig(com.vmware.converter.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
    }


    /**
     * Gets the ipfixConfig value for this VMwareDVSConfigInfo.
     * 
     * @return ipfixConfig
     */
    public com.vmware.converter.VMwareIpfixConfig getIpfixConfig() {
        return ipfixConfig;
    }


    /**
     * Sets the ipfixConfig value for this VMwareDVSConfigInfo.
     * 
     * @param ipfixConfig
     */
    public void setIpfixConfig(com.vmware.converter.VMwareIpfixConfig ipfixConfig) {
        this.ipfixConfig = ipfixConfig;
    }


    /**
     * Gets the lacpGroupConfig value for this VMwareDVSConfigInfo.
     * 
     * @return lacpGroupConfig
     */
    public com.vmware.converter.VMwareDvsLacpGroupConfig[] getLacpGroupConfig() {
        return lacpGroupConfig;
    }


    /**
     * Sets the lacpGroupConfig value for this VMwareDVSConfigInfo.
     * 
     * @param lacpGroupConfig
     */
    public void setLacpGroupConfig(com.vmware.converter.VMwareDvsLacpGroupConfig[] lacpGroupConfig) {
        this.lacpGroupConfig = lacpGroupConfig;
    }

    public com.vmware.converter.VMwareDvsLacpGroupConfig getLacpGroupConfig(int i) {
        return this.lacpGroupConfig[i];
    }

    public void setLacpGroupConfig(int i, com.vmware.converter.VMwareDvsLacpGroupConfig _value) {
        this.lacpGroupConfig[i] = _value;
    }


    /**
     * Gets the lacpApiVersion value for this VMwareDVSConfigInfo.
     * 
     * @return lacpApiVersion
     */
    public java.lang.String getLacpApiVersion() {
        return lacpApiVersion;
    }


    /**
     * Sets the lacpApiVersion value for this VMwareDVSConfigInfo.
     * 
     * @param lacpApiVersion
     */
    public void setLacpApiVersion(java.lang.String lacpApiVersion) {
        this.lacpApiVersion = lacpApiVersion;
    }


    /**
     * Gets the multicastFilteringMode value for this VMwareDVSConfigInfo.
     * 
     * @return multicastFilteringMode
     */
    public java.lang.String getMulticastFilteringMode() {
        return multicastFilteringMode;
    }


    /**
     * Sets the multicastFilteringMode value for this VMwareDVSConfigInfo.
     * 
     * @param multicastFilteringMode
     */
    public void setMulticastFilteringMode(java.lang.String multicastFilteringMode) {
        this.multicastFilteringMode = multicastFilteringMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSConfigInfo)) return false;
        VMwareDVSConfigInfo other = (VMwareDVSConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vspanSession==null && other.getVspanSession()==null) || 
             (this.vspanSession!=null &&
              java.util.Arrays.equals(this.vspanSession, other.getVspanSession()))) &&
            ((this.pvlanConfig==null && other.getPvlanConfig()==null) || 
             (this.pvlanConfig!=null &&
              java.util.Arrays.equals(this.pvlanConfig, other.getPvlanConfig()))) &&
            this.maxMtu == other.getMaxMtu() &&
            ((this.linkDiscoveryProtocolConfig==null && other.getLinkDiscoveryProtocolConfig()==null) || 
             (this.linkDiscoveryProtocolConfig!=null &&
              this.linkDiscoveryProtocolConfig.equals(other.getLinkDiscoveryProtocolConfig()))) &&
            ((this.ipfixConfig==null && other.getIpfixConfig()==null) || 
             (this.ipfixConfig!=null &&
              this.ipfixConfig.equals(other.getIpfixConfig()))) &&
            ((this.lacpGroupConfig==null && other.getLacpGroupConfig()==null) || 
             (this.lacpGroupConfig!=null &&
              java.util.Arrays.equals(this.lacpGroupConfig, other.getLacpGroupConfig()))) &&
            ((this.lacpApiVersion==null && other.getLacpApiVersion()==null) || 
             (this.lacpApiVersion!=null &&
              this.lacpApiVersion.equals(other.getLacpApiVersion()))) &&
            ((this.multicastFilteringMode==null && other.getMulticastFilteringMode()==null) || 
             (this.multicastFilteringMode!=null &&
              this.multicastFilteringMode.equals(other.getMulticastFilteringMode())));
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
        if (getVspanSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVspanSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVspanSession(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPvlanConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPvlanConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPvlanConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMaxMtu();
        if (getLinkDiscoveryProtocolConfig() != null) {
            _hashCode += getLinkDiscoveryProtocolConfig().hashCode();
        }
        if (getIpfixConfig() != null) {
            _hashCode += getIpfixConfig().hashCode();
        }
        if (getLacpGroupConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLacpGroupConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLacpGroupConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLacpApiVersion() != null) {
            _hashCode += getLacpApiVersion().hashCode();
        }
        if (getMulticastFilteringMode() != null) {
            _hashCode += getMulticastFilteringMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDVSConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanSession");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanSession"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pvlanConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pvlanConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPvlanMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkDiscoveryProtocolConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkDiscoveryProtocolConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LinkDiscoveryProtocolConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfixConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfixConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareIpfixConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpGroupConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lacpGroupConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpApiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lacpApiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multicastFilteringMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multicastFilteringMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
