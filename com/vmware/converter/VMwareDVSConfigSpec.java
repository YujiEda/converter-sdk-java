/**
 * VMwareDVSConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSConfigSpec  extends com.vmware.converter.DVSConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.VMwareDVSPvlanConfigSpec[] pvlanConfigSpec;

    private com.vmware.converter.VMwareDVSVspanConfigSpec[] vspanConfigSpec;

    private java.lang.Integer maxMtu;

    private com.vmware.converter.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;

    private com.vmware.converter.VMwareIpfixConfig ipfixConfig;

    private java.lang.String lacpApiVersion;

    private java.lang.String multicastFilteringMode;

    public VMwareDVSConfigSpec() {
    }

    public VMwareDVSConfigSpec(
           java.lang.String configVersion,
           java.lang.String name,
           java.lang.Integer numStandalonePorts,
           java.lang.Integer maxPorts,
           com.vmware.converter.DVSUplinkPortPolicy uplinkPortPolicy,
           com.vmware.converter.ManagedObjectReference[] uplinkPortgroup,
           com.vmware.converter.DVPortSetting defaultPortConfig,
           com.vmware.converter.DistributedVirtualSwitchHostMemberConfigSpec[] host,
           java.lang.String extensionKey,
           java.lang.String description,
           com.vmware.converter.DVSPolicy policy,
           com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig,
           com.vmware.converter.DVSContactInfo contact,
           java.lang.String switchIpAddress,
           java.lang.Integer defaultProxySwitchMaxNumPorts,
           com.vmware.converter.DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig,
           java.lang.String networkResourceControlVersion,
           com.vmware.converter.VMwareDVSPvlanConfigSpec[] pvlanConfigSpec,
           com.vmware.converter.VMwareDVSVspanConfigSpec[] vspanConfigSpec,
           java.lang.Integer maxMtu,
           com.vmware.converter.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig,
           com.vmware.converter.VMwareIpfixConfig ipfixConfig,
           java.lang.String lacpApiVersion,
           java.lang.String multicastFilteringMode) {
        super(
            configVersion,
            name,
            numStandalonePorts,
            maxPorts,
            uplinkPortPolicy,
            uplinkPortgroup,
            defaultPortConfig,
            host,
            extensionKey,
            description,
            policy,
            vendorSpecificConfig,
            contact,
            switchIpAddress,
            defaultProxySwitchMaxNumPorts,
            infrastructureTrafficResourceConfig,
            networkResourceControlVersion);
        this.pvlanConfigSpec = pvlanConfigSpec;
        this.vspanConfigSpec = vspanConfigSpec;
        this.maxMtu = maxMtu;
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
        this.ipfixConfig = ipfixConfig;
        this.lacpApiVersion = lacpApiVersion;
        this.multicastFilteringMode = multicastFilteringMode;
    }


    /**
     * Gets the pvlanConfigSpec value for this VMwareDVSConfigSpec.
     * 
     * @return pvlanConfigSpec
     */
    public com.vmware.converter.VMwareDVSPvlanConfigSpec[] getPvlanConfigSpec() {
        return pvlanConfigSpec;
    }


    /**
     * Sets the pvlanConfigSpec value for this VMwareDVSConfigSpec.
     * 
     * @param pvlanConfigSpec
     */
    public void setPvlanConfigSpec(com.vmware.converter.VMwareDVSPvlanConfigSpec[] pvlanConfigSpec) {
        this.pvlanConfigSpec = pvlanConfigSpec;
    }

    public com.vmware.converter.VMwareDVSPvlanConfigSpec getPvlanConfigSpec(int i) {
        return this.pvlanConfigSpec[i];
    }

    public void setPvlanConfigSpec(int i, com.vmware.converter.VMwareDVSPvlanConfigSpec _value) {
        this.pvlanConfigSpec[i] = _value;
    }


    /**
     * Gets the vspanConfigSpec value for this VMwareDVSConfigSpec.
     * 
     * @return vspanConfigSpec
     */
    public com.vmware.converter.VMwareDVSVspanConfigSpec[] getVspanConfigSpec() {
        return vspanConfigSpec;
    }


    /**
     * Sets the vspanConfigSpec value for this VMwareDVSConfigSpec.
     * 
     * @param vspanConfigSpec
     */
    public void setVspanConfigSpec(com.vmware.converter.VMwareDVSVspanConfigSpec[] vspanConfigSpec) {
        this.vspanConfigSpec = vspanConfigSpec;
    }

    public com.vmware.converter.VMwareDVSVspanConfigSpec getVspanConfigSpec(int i) {
        return this.vspanConfigSpec[i];
    }

    public void setVspanConfigSpec(int i, com.vmware.converter.VMwareDVSVspanConfigSpec _value) {
        this.vspanConfigSpec[i] = _value;
    }


    /**
     * Gets the maxMtu value for this VMwareDVSConfigSpec.
     * 
     * @return maxMtu
     */
    public java.lang.Integer getMaxMtu() {
        return maxMtu;
    }


    /**
     * Sets the maxMtu value for this VMwareDVSConfigSpec.
     * 
     * @param maxMtu
     */
    public void setMaxMtu(java.lang.Integer maxMtu) {
        this.maxMtu = maxMtu;
    }


    /**
     * Gets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigSpec.
     * 
     * @return linkDiscoveryProtocolConfig
     */
    public com.vmware.converter.LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }


    /**
     * Sets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigSpec.
     * 
     * @param linkDiscoveryProtocolConfig
     */
    public void setLinkDiscoveryProtocolConfig(com.vmware.converter.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
    }


    /**
     * Gets the ipfixConfig value for this VMwareDVSConfigSpec.
     * 
     * @return ipfixConfig
     */
    public com.vmware.converter.VMwareIpfixConfig getIpfixConfig() {
        return ipfixConfig;
    }


    /**
     * Sets the ipfixConfig value for this VMwareDVSConfigSpec.
     * 
     * @param ipfixConfig
     */
    public void setIpfixConfig(com.vmware.converter.VMwareIpfixConfig ipfixConfig) {
        this.ipfixConfig = ipfixConfig;
    }


    /**
     * Gets the lacpApiVersion value for this VMwareDVSConfigSpec.
     * 
     * @return lacpApiVersion
     */
    public java.lang.String getLacpApiVersion() {
        return lacpApiVersion;
    }


    /**
     * Sets the lacpApiVersion value for this VMwareDVSConfigSpec.
     * 
     * @param lacpApiVersion
     */
    public void setLacpApiVersion(java.lang.String lacpApiVersion) {
        this.lacpApiVersion = lacpApiVersion;
    }


    /**
     * Gets the multicastFilteringMode value for this VMwareDVSConfigSpec.
     * 
     * @return multicastFilteringMode
     */
    public java.lang.String getMulticastFilteringMode() {
        return multicastFilteringMode;
    }


    /**
     * Sets the multicastFilteringMode value for this VMwareDVSConfigSpec.
     * 
     * @param multicastFilteringMode
     */
    public void setMulticastFilteringMode(java.lang.String multicastFilteringMode) {
        this.multicastFilteringMode = multicastFilteringMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSConfigSpec)) return false;
        VMwareDVSConfigSpec other = (VMwareDVSConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pvlanConfigSpec==null && other.getPvlanConfigSpec()==null) || 
             (this.pvlanConfigSpec!=null &&
              java.util.Arrays.equals(this.pvlanConfigSpec, other.getPvlanConfigSpec()))) &&
            ((this.vspanConfigSpec==null && other.getVspanConfigSpec()==null) || 
             (this.vspanConfigSpec!=null &&
              java.util.Arrays.equals(this.vspanConfigSpec, other.getVspanConfigSpec()))) &&
            ((this.maxMtu==null && other.getMaxMtu()==null) || 
             (this.maxMtu!=null &&
              this.maxMtu.equals(other.getMaxMtu()))) &&
            ((this.linkDiscoveryProtocolConfig==null && other.getLinkDiscoveryProtocolConfig()==null) || 
             (this.linkDiscoveryProtocolConfig!=null &&
              this.linkDiscoveryProtocolConfig.equals(other.getLinkDiscoveryProtocolConfig()))) &&
            ((this.ipfixConfig==null && other.getIpfixConfig()==null) || 
             (this.ipfixConfig!=null &&
              this.ipfixConfig.equals(other.getIpfixConfig()))) &&
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
        if (getPvlanConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPvlanConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPvlanConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVspanConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVspanConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVspanConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxMtu() != null) {
            _hashCode += getMaxMtu().hashCode();
        }
        if (getLinkDiscoveryProtocolConfig() != null) {
            _hashCode += getLinkDiscoveryProtocolConfig().hashCode();
        }
        if (getIpfixConfig() != null) {
            _hashCode += getIpfixConfig().hashCode();
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
        new org.apache.axis.description.TypeDesc(VMwareDVSConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pvlanConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pvlanConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPvlanConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVspanConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
