/**
 * DVSConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String configVersion;

    private java.lang.String name;

    private java.lang.Integer numStandalonePorts;

    private java.lang.Integer maxPorts;

    private com.vmware.converter.DVSUplinkPortPolicy uplinkPortPolicy;

    private com.vmware.converter.ManagedObjectReference[] uplinkPortgroup;

    private com.vmware.converter.DVPortSetting defaultPortConfig;

    private com.vmware.converter.DistributedVirtualSwitchHostMemberConfigSpec[] host;

    private java.lang.String extensionKey;

    private java.lang.String description;

    private com.vmware.converter.DVSPolicy policy;

    private com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

    private com.vmware.converter.DVSContactInfo contact;

    private java.lang.String switchIpAddress;

    private java.lang.Integer defaultProxySwitchMaxNumPorts;

    private com.vmware.converter.DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;

    private java.lang.String networkResourceControlVersion;

    public DVSConfigSpec() {
    }

    public DVSConfigSpec(
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
           java.lang.String networkResourceControlVersion) {
        this.configVersion = configVersion;
        this.name = name;
        this.numStandalonePorts = numStandalonePorts;
        this.maxPorts = maxPorts;
        this.uplinkPortPolicy = uplinkPortPolicy;
        this.uplinkPortgroup = uplinkPortgroup;
        this.defaultPortConfig = defaultPortConfig;
        this.host = host;
        this.extensionKey = extensionKey;
        this.description = description;
        this.policy = policy;
        this.vendorSpecificConfig = vendorSpecificConfig;
        this.contact = contact;
        this.switchIpAddress = switchIpAddress;
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
        this.networkResourceControlVersion = networkResourceControlVersion;
    }


    /**
     * Gets the configVersion value for this DVSConfigSpec.
     * 
     * @return configVersion
     */
    public java.lang.String getConfigVersion() {
        return configVersion;
    }


    /**
     * Sets the configVersion value for this DVSConfigSpec.
     * 
     * @param configVersion
     */
    public void setConfigVersion(java.lang.String configVersion) {
        this.configVersion = configVersion;
    }


    /**
     * Gets the name value for this DVSConfigSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DVSConfigSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numStandalonePorts value for this DVSConfigSpec.
     * 
     * @return numStandalonePorts
     */
    public java.lang.Integer getNumStandalonePorts() {
        return numStandalonePorts;
    }


    /**
     * Sets the numStandalonePorts value for this DVSConfigSpec.
     * 
     * @param numStandalonePorts
     */
    public void setNumStandalonePorts(java.lang.Integer numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }


    /**
     * Gets the maxPorts value for this DVSConfigSpec.
     * 
     * @return maxPorts
     */
    public java.lang.Integer getMaxPorts() {
        return maxPorts;
    }


    /**
     * Sets the maxPorts value for this DVSConfigSpec.
     * 
     * @param maxPorts
     */
    public void setMaxPorts(java.lang.Integer maxPorts) {
        this.maxPorts = maxPorts;
    }


    /**
     * Gets the uplinkPortPolicy value for this DVSConfigSpec.
     * 
     * @return uplinkPortPolicy
     */
    public com.vmware.converter.DVSUplinkPortPolicy getUplinkPortPolicy() {
        return uplinkPortPolicy;
    }


    /**
     * Sets the uplinkPortPolicy value for this DVSConfigSpec.
     * 
     * @param uplinkPortPolicy
     */
    public void setUplinkPortPolicy(com.vmware.converter.DVSUplinkPortPolicy uplinkPortPolicy) {
        this.uplinkPortPolicy = uplinkPortPolicy;
    }


    /**
     * Gets the uplinkPortgroup value for this DVSConfigSpec.
     * 
     * @return uplinkPortgroup
     */
    public com.vmware.converter.ManagedObjectReference[] getUplinkPortgroup() {
        return uplinkPortgroup;
    }


    /**
     * Sets the uplinkPortgroup value for this DVSConfigSpec.
     * 
     * @param uplinkPortgroup
     */
    public void setUplinkPortgroup(com.vmware.converter.ManagedObjectReference[] uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public com.vmware.converter.ManagedObjectReference getUplinkPortgroup(int i) {
        return this.uplinkPortgroup[i];
    }

    public void setUplinkPortgroup(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.uplinkPortgroup[i] = _value;
    }


    /**
     * Gets the defaultPortConfig value for this DVSConfigSpec.
     * 
     * @return defaultPortConfig
     */
    public com.vmware.converter.DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }


    /**
     * Sets the defaultPortConfig value for this DVSConfigSpec.
     * 
     * @param defaultPortConfig
     */
    public void setDefaultPortConfig(com.vmware.converter.DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }


    /**
     * Gets the host value for this DVSConfigSpec.
     * 
     * @return host
     */
    public com.vmware.converter.DistributedVirtualSwitchHostMemberConfigSpec[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this DVSConfigSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.DistributedVirtualSwitchHostMemberConfigSpec[] host) {
        this.host = host;
    }

    public com.vmware.converter.DistributedVirtualSwitchHostMemberConfigSpec getHost(int i) {
        return this.host[i];
    }

    public void setHost(int i, com.vmware.converter.DistributedVirtualSwitchHostMemberConfigSpec _value) {
        this.host[i] = _value;
    }


    /**
     * Gets the extensionKey value for this DVSConfigSpec.
     * 
     * @return extensionKey
     */
    public java.lang.String getExtensionKey() {
        return extensionKey;
    }


    /**
     * Sets the extensionKey value for this DVSConfigSpec.
     * 
     * @param extensionKey
     */
    public void setExtensionKey(java.lang.String extensionKey) {
        this.extensionKey = extensionKey;
    }


    /**
     * Gets the description value for this DVSConfigSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DVSConfigSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the policy value for this DVSConfigSpec.
     * 
     * @return policy
     */
    public com.vmware.converter.DVSPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this DVSConfigSpec.
     * 
     * @param policy
     */
    public void setPolicy(com.vmware.converter.DVSPolicy policy) {
        this.policy = policy;
    }


    /**
     * Gets the vendorSpecificConfig value for this DVSConfigSpec.
     * 
     * @return vendorSpecificConfig
     */
    public com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }


    /**
     * Sets the vendorSpecificConfig value for this DVSConfigSpec.
     * 
     * @param vendorSpecificConfig
     */
    public void setVendorSpecificConfig(com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob getVendorSpecificConfig(int i) {
        return this.vendorSpecificConfig[i];
    }

    public void setVendorSpecificConfig(int i, com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob _value) {
        this.vendorSpecificConfig[i] = _value;
    }


    /**
     * Gets the contact value for this DVSConfigSpec.
     * 
     * @return contact
     */
    public com.vmware.converter.DVSContactInfo getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this DVSConfigSpec.
     * 
     * @param contact
     */
    public void setContact(com.vmware.converter.DVSContactInfo contact) {
        this.contact = contact;
    }


    /**
     * Gets the switchIpAddress value for this DVSConfigSpec.
     * 
     * @return switchIpAddress
     */
    public java.lang.String getSwitchIpAddress() {
        return switchIpAddress;
    }


    /**
     * Sets the switchIpAddress value for this DVSConfigSpec.
     * 
     * @param switchIpAddress
     */
    public void setSwitchIpAddress(java.lang.String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
    }


    /**
     * Gets the defaultProxySwitchMaxNumPorts value for this DVSConfigSpec.
     * 
     * @return defaultProxySwitchMaxNumPorts
     */
    public java.lang.Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }


    /**
     * Sets the defaultProxySwitchMaxNumPorts value for this DVSConfigSpec.
     * 
     * @param defaultProxySwitchMaxNumPorts
     */
    public void setDefaultProxySwitchMaxNumPorts(java.lang.Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }


    /**
     * Gets the infrastructureTrafficResourceConfig value for this DVSConfigSpec.
     * 
     * @return infrastructureTrafficResourceConfig
     */
    public com.vmware.converter.DvsHostInfrastructureTrafficResource[] getInfrastructureTrafficResourceConfig() {
        return infrastructureTrafficResourceConfig;
    }


    /**
     * Sets the infrastructureTrafficResourceConfig value for this DVSConfigSpec.
     * 
     * @param infrastructureTrafficResourceConfig
     */
    public void setInfrastructureTrafficResourceConfig(com.vmware.converter.DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig) {
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
    }

    public com.vmware.converter.DvsHostInfrastructureTrafficResource getInfrastructureTrafficResourceConfig(int i) {
        return this.infrastructureTrafficResourceConfig[i];
    }

    public void setInfrastructureTrafficResourceConfig(int i, com.vmware.converter.DvsHostInfrastructureTrafficResource _value) {
        this.infrastructureTrafficResourceConfig[i] = _value;
    }


    /**
     * Gets the networkResourceControlVersion value for this DVSConfigSpec.
     * 
     * @return networkResourceControlVersion
     */
    public java.lang.String getNetworkResourceControlVersion() {
        return networkResourceControlVersion;
    }


    /**
     * Sets the networkResourceControlVersion value for this DVSConfigSpec.
     * 
     * @param networkResourceControlVersion
     */
    public void setNetworkResourceControlVersion(java.lang.String networkResourceControlVersion) {
        this.networkResourceControlVersion = networkResourceControlVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSConfigSpec)) return false;
        DVSConfigSpec other = (DVSConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configVersion==null && other.getConfigVersion()==null) || 
             (this.configVersion!=null &&
              this.configVersion.equals(other.getConfigVersion()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numStandalonePorts==null && other.getNumStandalonePorts()==null) || 
             (this.numStandalonePorts!=null &&
              this.numStandalonePorts.equals(other.getNumStandalonePorts()))) &&
            ((this.maxPorts==null && other.getMaxPorts()==null) || 
             (this.maxPorts!=null &&
              this.maxPorts.equals(other.getMaxPorts()))) &&
            ((this.uplinkPortPolicy==null && other.getUplinkPortPolicy()==null) || 
             (this.uplinkPortPolicy!=null &&
              this.uplinkPortPolicy.equals(other.getUplinkPortPolicy()))) &&
            ((this.uplinkPortgroup==null && other.getUplinkPortgroup()==null) || 
             (this.uplinkPortgroup!=null &&
              java.util.Arrays.equals(this.uplinkPortgroup, other.getUplinkPortgroup()))) &&
            ((this.defaultPortConfig==null && other.getDefaultPortConfig()==null) || 
             (this.defaultPortConfig!=null &&
              this.defaultPortConfig.equals(other.getDefaultPortConfig()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              java.util.Arrays.equals(this.host, other.getHost()))) &&
            ((this.extensionKey==null && other.getExtensionKey()==null) || 
             (this.extensionKey!=null &&
              this.extensionKey.equals(other.getExtensionKey()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.vendorSpecificConfig==null && other.getVendorSpecificConfig()==null) || 
             (this.vendorSpecificConfig!=null &&
              java.util.Arrays.equals(this.vendorSpecificConfig, other.getVendorSpecificConfig()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.switchIpAddress==null && other.getSwitchIpAddress()==null) || 
             (this.switchIpAddress!=null &&
              this.switchIpAddress.equals(other.getSwitchIpAddress()))) &&
            ((this.defaultProxySwitchMaxNumPorts==null && other.getDefaultProxySwitchMaxNumPorts()==null) || 
             (this.defaultProxySwitchMaxNumPorts!=null &&
              this.defaultProxySwitchMaxNumPorts.equals(other.getDefaultProxySwitchMaxNumPorts()))) &&
            ((this.infrastructureTrafficResourceConfig==null && other.getInfrastructureTrafficResourceConfig()==null) || 
             (this.infrastructureTrafficResourceConfig!=null &&
              java.util.Arrays.equals(this.infrastructureTrafficResourceConfig, other.getInfrastructureTrafficResourceConfig()))) &&
            ((this.networkResourceControlVersion==null && other.getNetworkResourceControlVersion()==null) || 
             (this.networkResourceControlVersion!=null &&
              this.networkResourceControlVersion.equals(other.getNetworkResourceControlVersion())));
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
        if (getConfigVersion() != null) {
            _hashCode += getConfigVersion().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumStandalonePorts() != null) {
            _hashCode += getNumStandalonePorts().hashCode();
        }
        if (getMaxPorts() != null) {
            _hashCode += getMaxPorts().hashCode();
        }
        if (getUplinkPortPolicy() != null) {
            _hashCode += getUplinkPortPolicy().hashCode();
        }
        if (getUplinkPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultPortConfig() != null) {
            _hashCode += getDefaultPortConfig().hashCode();
        }
        if (getHost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtensionKey() != null) {
            _hashCode += getExtensionKey().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getVendorSpecificConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorSpecificConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorSpecificConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getSwitchIpAddress() != null) {
            _hashCode += getSwitchIpAddress().hashCode();
        }
        if (getDefaultProxySwitchMaxNumPorts() != null) {
            _hashCode += getDefaultProxySwitchMaxNumPorts().hashCode();
        }
        if (getInfrastructureTrafficResourceConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfrastructureTrafficResourceConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfrastructureTrafficResourceConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkResourceControlVersion() != null) {
            _hashCode += getNetworkResourceControlVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numStandalonePorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numStandalonePorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSUplinkPortPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPortConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultPortConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSpecificConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorSpecificConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchKeyedOpaqueBlob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSContactInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultProxySwitchMaxNumPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultProxySwitchMaxNumPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infrastructureTrafficResourceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "infrastructureTrafficResourceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsHostInfrastructureTrafficResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceControlVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceControlVersion"));
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
