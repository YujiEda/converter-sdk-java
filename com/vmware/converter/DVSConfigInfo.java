/**
 * DVSConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String uuid;

    private java.lang.String name;

    private int numStandalonePorts;

    private int numPorts;

    private int maxPorts;

    private com.vmware.converter.DVSUplinkPortPolicy uplinkPortPolicy;

    private com.vmware.converter.ManagedObjectReference[] uplinkPortgroup;

    private com.vmware.converter.DVPortSetting defaultPortConfig;

    private com.vmware.converter.DistributedVirtualSwitchHostMember[] host;

    private com.vmware.converter.DistributedVirtualSwitchProductSpec productInfo;

    private com.vmware.converter.DistributedVirtualSwitchProductSpec targetInfo;

    private java.lang.String extensionKey;

    private com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

    private com.vmware.converter.DVSPolicy policy;

    private java.lang.String description;

    private java.lang.String configVersion;

    private com.vmware.converter.DVSContactInfo contact;

    private java.lang.String switchIpAddress;

    private java.util.Calendar createTime;

    private java.lang.Boolean networkResourceManagementEnabled;

    private java.lang.Integer defaultProxySwitchMaxNumPorts;

    private com.vmware.converter.DVSHealthCheckConfig[] healthCheckConfig;

    private com.vmware.converter.DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;

    private java.lang.String networkResourceControlVersion;

    private com.vmware.converter.DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool;

    private java.lang.Integer pnicCapacityRatioForReservation;

    public DVSConfigInfo() {
    }

    public DVSConfigInfo(
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
           java.lang.Integer pnicCapacityRatioForReservation) {
        this.uuid = uuid;
        this.name = name;
        this.numStandalonePorts = numStandalonePorts;
        this.numPorts = numPorts;
        this.maxPorts = maxPorts;
        this.uplinkPortPolicy = uplinkPortPolicy;
        this.uplinkPortgroup = uplinkPortgroup;
        this.defaultPortConfig = defaultPortConfig;
        this.host = host;
        this.productInfo = productInfo;
        this.targetInfo = targetInfo;
        this.extensionKey = extensionKey;
        this.vendorSpecificConfig = vendorSpecificConfig;
        this.policy = policy;
        this.description = description;
        this.configVersion = configVersion;
        this.contact = contact;
        this.switchIpAddress = switchIpAddress;
        this.createTime = createTime;
        this.networkResourceManagementEnabled = networkResourceManagementEnabled;
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
        this.healthCheckConfig = healthCheckConfig;
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
        this.networkResourceControlVersion = networkResourceControlVersion;
        this.vmVnicNetworkResourcePool = vmVnicNetworkResourcePool;
        this.pnicCapacityRatioForReservation = pnicCapacityRatioForReservation;
    }


    /**
     * Gets the uuid value for this DVSConfigInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this DVSConfigInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the name value for this DVSConfigInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DVSConfigInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numStandalonePorts value for this DVSConfigInfo.
     * 
     * @return numStandalonePorts
     */
    public int getNumStandalonePorts() {
        return numStandalonePorts;
    }


    /**
     * Sets the numStandalonePorts value for this DVSConfigInfo.
     * 
     * @param numStandalonePorts
     */
    public void setNumStandalonePorts(int numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }


    /**
     * Gets the numPorts value for this DVSConfigInfo.
     * 
     * @return numPorts
     */
    public int getNumPorts() {
        return numPorts;
    }


    /**
     * Sets the numPorts value for this DVSConfigInfo.
     * 
     * @param numPorts
     */
    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }


    /**
     * Gets the maxPorts value for this DVSConfigInfo.
     * 
     * @return maxPorts
     */
    public int getMaxPorts() {
        return maxPorts;
    }


    /**
     * Sets the maxPorts value for this DVSConfigInfo.
     * 
     * @param maxPorts
     */
    public void setMaxPorts(int maxPorts) {
        this.maxPorts = maxPorts;
    }


    /**
     * Gets the uplinkPortPolicy value for this DVSConfigInfo.
     * 
     * @return uplinkPortPolicy
     */
    public com.vmware.converter.DVSUplinkPortPolicy getUplinkPortPolicy() {
        return uplinkPortPolicy;
    }


    /**
     * Sets the uplinkPortPolicy value for this DVSConfigInfo.
     * 
     * @param uplinkPortPolicy
     */
    public void setUplinkPortPolicy(com.vmware.converter.DVSUplinkPortPolicy uplinkPortPolicy) {
        this.uplinkPortPolicy = uplinkPortPolicy;
    }


    /**
     * Gets the uplinkPortgroup value for this DVSConfigInfo.
     * 
     * @return uplinkPortgroup
     */
    public com.vmware.converter.ManagedObjectReference[] getUplinkPortgroup() {
        return uplinkPortgroup;
    }


    /**
     * Sets the uplinkPortgroup value for this DVSConfigInfo.
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
     * Gets the defaultPortConfig value for this DVSConfigInfo.
     * 
     * @return defaultPortConfig
     */
    public com.vmware.converter.DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }


    /**
     * Sets the defaultPortConfig value for this DVSConfigInfo.
     * 
     * @param defaultPortConfig
     */
    public void setDefaultPortConfig(com.vmware.converter.DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }


    /**
     * Gets the host value for this DVSConfigInfo.
     * 
     * @return host
     */
    public com.vmware.converter.DistributedVirtualSwitchHostMember[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this DVSConfigInfo.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.DistributedVirtualSwitchHostMember[] host) {
        this.host = host;
    }

    public com.vmware.converter.DistributedVirtualSwitchHostMember getHost(int i) {
        return this.host[i];
    }

    public void setHost(int i, com.vmware.converter.DistributedVirtualSwitchHostMember _value) {
        this.host[i] = _value;
    }


    /**
     * Gets the productInfo value for this DVSConfigInfo.
     * 
     * @return productInfo
     */
    public com.vmware.converter.DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }


    /**
     * Sets the productInfo value for this DVSConfigInfo.
     * 
     * @param productInfo
     */
    public void setProductInfo(com.vmware.converter.DistributedVirtualSwitchProductSpec productInfo) {
        this.productInfo = productInfo;
    }


    /**
     * Gets the targetInfo value for this DVSConfigInfo.
     * 
     * @return targetInfo
     */
    public com.vmware.converter.DistributedVirtualSwitchProductSpec getTargetInfo() {
        return targetInfo;
    }


    /**
     * Sets the targetInfo value for this DVSConfigInfo.
     * 
     * @param targetInfo
     */
    public void setTargetInfo(com.vmware.converter.DistributedVirtualSwitchProductSpec targetInfo) {
        this.targetInfo = targetInfo;
    }


    /**
     * Gets the extensionKey value for this DVSConfigInfo.
     * 
     * @return extensionKey
     */
    public java.lang.String getExtensionKey() {
        return extensionKey;
    }


    /**
     * Sets the extensionKey value for this DVSConfigInfo.
     * 
     * @param extensionKey
     */
    public void setExtensionKey(java.lang.String extensionKey) {
        this.extensionKey = extensionKey;
    }


    /**
     * Gets the vendorSpecificConfig value for this DVSConfigInfo.
     * 
     * @return vendorSpecificConfig
     */
    public com.vmware.converter.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }


    /**
     * Sets the vendorSpecificConfig value for this DVSConfigInfo.
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
     * Gets the policy value for this DVSConfigInfo.
     * 
     * @return policy
     */
    public com.vmware.converter.DVSPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this DVSConfigInfo.
     * 
     * @param policy
     */
    public void setPolicy(com.vmware.converter.DVSPolicy policy) {
        this.policy = policy;
    }


    /**
     * Gets the description value for this DVSConfigInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DVSConfigInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the configVersion value for this DVSConfigInfo.
     * 
     * @return configVersion
     */
    public java.lang.String getConfigVersion() {
        return configVersion;
    }


    /**
     * Sets the configVersion value for this DVSConfigInfo.
     * 
     * @param configVersion
     */
    public void setConfigVersion(java.lang.String configVersion) {
        this.configVersion = configVersion;
    }


    /**
     * Gets the contact value for this DVSConfigInfo.
     * 
     * @return contact
     */
    public com.vmware.converter.DVSContactInfo getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this DVSConfigInfo.
     * 
     * @param contact
     */
    public void setContact(com.vmware.converter.DVSContactInfo contact) {
        this.contact = contact;
    }


    /**
     * Gets the switchIpAddress value for this DVSConfigInfo.
     * 
     * @return switchIpAddress
     */
    public java.lang.String getSwitchIpAddress() {
        return switchIpAddress;
    }


    /**
     * Sets the switchIpAddress value for this DVSConfigInfo.
     * 
     * @param switchIpAddress
     */
    public void setSwitchIpAddress(java.lang.String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
    }


    /**
     * Gets the createTime value for this DVSConfigInfo.
     * 
     * @return createTime
     */
    public java.util.Calendar getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this DVSConfigInfo.
     * 
     * @param createTime
     */
    public void setCreateTime(java.util.Calendar createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the networkResourceManagementEnabled value for this DVSConfigInfo.
     * 
     * @return networkResourceManagementEnabled
     */
    public java.lang.Boolean getNetworkResourceManagementEnabled() {
        return networkResourceManagementEnabled;
    }


    /**
     * Sets the networkResourceManagementEnabled value for this DVSConfigInfo.
     * 
     * @param networkResourceManagementEnabled
     */
    public void setNetworkResourceManagementEnabled(java.lang.Boolean networkResourceManagementEnabled) {
        this.networkResourceManagementEnabled = networkResourceManagementEnabled;
    }


    /**
     * Gets the defaultProxySwitchMaxNumPorts value for this DVSConfigInfo.
     * 
     * @return defaultProxySwitchMaxNumPorts
     */
    public java.lang.Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }


    /**
     * Sets the defaultProxySwitchMaxNumPorts value for this DVSConfigInfo.
     * 
     * @param defaultProxySwitchMaxNumPorts
     */
    public void setDefaultProxySwitchMaxNumPorts(java.lang.Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }


    /**
     * Gets the healthCheckConfig value for this DVSConfigInfo.
     * 
     * @return healthCheckConfig
     */
    public com.vmware.converter.DVSHealthCheckConfig[] getHealthCheckConfig() {
        return healthCheckConfig;
    }


    /**
     * Sets the healthCheckConfig value for this DVSConfigInfo.
     * 
     * @param healthCheckConfig
     */
    public void setHealthCheckConfig(com.vmware.converter.DVSHealthCheckConfig[] healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public com.vmware.converter.DVSHealthCheckConfig getHealthCheckConfig(int i) {
        return this.healthCheckConfig[i];
    }

    public void setHealthCheckConfig(int i, com.vmware.converter.DVSHealthCheckConfig _value) {
        this.healthCheckConfig[i] = _value;
    }


    /**
     * Gets the infrastructureTrafficResourceConfig value for this DVSConfigInfo.
     * 
     * @return infrastructureTrafficResourceConfig
     */
    public com.vmware.converter.DvsHostInfrastructureTrafficResource[] getInfrastructureTrafficResourceConfig() {
        return infrastructureTrafficResourceConfig;
    }


    /**
     * Sets the infrastructureTrafficResourceConfig value for this DVSConfigInfo.
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
     * Gets the networkResourceControlVersion value for this DVSConfigInfo.
     * 
     * @return networkResourceControlVersion
     */
    public java.lang.String getNetworkResourceControlVersion() {
        return networkResourceControlVersion;
    }


    /**
     * Sets the networkResourceControlVersion value for this DVSConfigInfo.
     * 
     * @param networkResourceControlVersion
     */
    public void setNetworkResourceControlVersion(java.lang.String networkResourceControlVersion) {
        this.networkResourceControlVersion = networkResourceControlVersion;
    }


    /**
     * Gets the vmVnicNetworkResourcePool value for this DVSConfigInfo.
     * 
     * @return vmVnicNetworkResourcePool
     */
    public com.vmware.converter.DVSVmVnicNetworkResourcePool[] getVmVnicNetworkResourcePool() {
        return vmVnicNetworkResourcePool;
    }


    /**
     * Sets the vmVnicNetworkResourcePool value for this DVSConfigInfo.
     * 
     * @param vmVnicNetworkResourcePool
     */
    public void setVmVnicNetworkResourcePool(com.vmware.converter.DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool) {
        this.vmVnicNetworkResourcePool = vmVnicNetworkResourcePool;
    }

    public com.vmware.converter.DVSVmVnicNetworkResourcePool getVmVnicNetworkResourcePool(int i) {
        return this.vmVnicNetworkResourcePool[i];
    }

    public void setVmVnicNetworkResourcePool(int i, com.vmware.converter.DVSVmVnicNetworkResourcePool _value) {
        this.vmVnicNetworkResourcePool[i] = _value;
    }


    /**
     * Gets the pnicCapacityRatioForReservation value for this DVSConfigInfo.
     * 
     * @return pnicCapacityRatioForReservation
     */
    public java.lang.Integer getPnicCapacityRatioForReservation() {
        return pnicCapacityRatioForReservation;
    }


    /**
     * Sets the pnicCapacityRatioForReservation value for this DVSConfigInfo.
     * 
     * @param pnicCapacityRatioForReservation
     */
    public void setPnicCapacityRatioForReservation(java.lang.Integer pnicCapacityRatioForReservation) {
        this.pnicCapacityRatioForReservation = pnicCapacityRatioForReservation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSConfigInfo)) return false;
        DVSConfigInfo other = (DVSConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.numStandalonePorts == other.getNumStandalonePorts() &&
            this.numPorts == other.getNumPorts() &&
            this.maxPorts == other.getMaxPorts() &&
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
            ((this.productInfo==null && other.getProductInfo()==null) || 
             (this.productInfo!=null &&
              this.productInfo.equals(other.getProductInfo()))) &&
            ((this.targetInfo==null && other.getTargetInfo()==null) || 
             (this.targetInfo!=null &&
              this.targetInfo.equals(other.getTargetInfo()))) &&
            ((this.extensionKey==null && other.getExtensionKey()==null) || 
             (this.extensionKey!=null &&
              this.extensionKey.equals(other.getExtensionKey()))) &&
            ((this.vendorSpecificConfig==null && other.getVendorSpecificConfig()==null) || 
             (this.vendorSpecificConfig!=null &&
              java.util.Arrays.equals(this.vendorSpecificConfig, other.getVendorSpecificConfig()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.configVersion==null && other.getConfigVersion()==null) || 
             (this.configVersion!=null &&
              this.configVersion.equals(other.getConfigVersion()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.switchIpAddress==null && other.getSwitchIpAddress()==null) || 
             (this.switchIpAddress!=null &&
              this.switchIpAddress.equals(other.getSwitchIpAddress()))) &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            ((this.networkResourceManagementEnabled==null && other.getNetworkResourceManagementEnabled()==null) || 
             (this.networkResourceManagementEnabled!=null &&
              this.networkResourceManagementEnabled.equals(other.getNetworkResourceManagementEnabled()))) &&
            ((this.defaultProxySwitchMaxNumPorts==null && other.getDefaultProxySwitchMaxNumPorts()==null) || 
             (this.defaultProxySwitchMaxNumPorts!=null &&
              this.defaultProxySwitchMaxNumPorts.equals(other.getDefaultProxySwitchMaxNumPorts()))) &&
            ((this.healthCheckConfig==null && other.getHealthCheckConfig()==null) || 
             (this.healthCheckConfig!=null &&
              java.util.Arrays.equals(this.healthCheckConfig, other.getHealthCheckConfig()))) &&
            ((this.infrastructureTrafficResourceConfig==null && other.getInfrastructureTrafficResourceConfig()==null) || 
             (this.infrastructureTrafficResourceConfig!=null &&
              java.util.Arrays.equals(this.infrastructureTrafficResourceConfig, other.getInfrastructureTrafficResourceConfig()))) &&
            ((this.networkResourceControlVersion==null && other.getNetworkResourceControlVersion()==null) || 
             (this.networkResourceControlVersion!=null &&
              this.networkResourceControlVersion.equals(other.getNetworkResourceControlVersion()))) &&
            ((this.vmVnicNetworkResourcePool==null && other.getVmVnicNetworkResourcePool()==null) || 
             (this.vmVnicNetworkResourcePool!=null &&
              java.util.Arrays.equals(this.vmVnicNetworkResourcePool, other.getVmVnicNetworkResourcePool()))) &&
            ((this.pnicCapacityRatioForReservation==null && other.getPnicCapacityRatioForReservation()==null) || 
             (this.pnicCapacityRatioForReservation!=null &&
              this.pnicCapacityRatioForReservation.equals(other.getPnicCapacityRatioForReservation())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getNumStandalonePorts();
        _hashCode += getNumPorts();
        _hashCode += getMaxPorts();
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
        if (getProductInfo() != null) {
            _hashCode += getProductInfo().hashCode();
        }
        if (getTargetInfo() != null) {
            _hashCode += getTargetInfo().hashCode();
        }
        if (getExtensionKey() != null) {
            _hashCode += getExtensionKey().hashCode();
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getConfigVersion() != null) {
            _hashCode += getConfigVersion().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getSwitchIpAddress() != null) {
            _hashCode += getSwitchIpAddress().hashCode();
        }
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        if (getNetworkResourceManagementEnabled() != null) {
            _hashCode += getNetworkResourceManagementEnabled().hashCode();
        }
        if (getDefaultProxySwitchMaxNumPorts() != null) {
            _hashCode += getDefaultProxySwitchMaxNumPorts().hashCode();
        }
        if (getHealthCheckConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHealthCheckConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHealthCheckConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getVmVnicNetworkResourcePool() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmVnicNetworkResourcePool());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmVnicNetworkResourcePool(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPnicCapacityRatioForReservation() != null) {
            _hashCode += getPnicCapacityRatioForReservation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numStandalonePorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numStandalonePorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSUplinkPortPolicy"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSPolicy"));
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
        elemField.setFieldName("configVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSContactInfo"));
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
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "createTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceManagementEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceManagementEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("healthCheckConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthCheckConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSHealthCheckConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmVnicNetworkResourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmVnicNetworkResourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSVmVnicNetworkResourcePool"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicCapacityRatioForReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicCapacityRatioForReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
