/**
 * HostConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostNasVolumeConfig[] nasDatastore;

    private com.vmware.converter.HostNetworkConfig network;

    private com.vmware.converter.HostVirtualNicManagerNicTypeSelection[] nicTypeSelection;

    private com.vmware.converter.HostServiceConfig[] service;

    private com.vmware.converter.HostFirewallConfig firewall;

    private com.vmware.converter.OptionValue[] option;

    private java.lang.String datastorePrincipal;

    private java.lang.String datastorePrincipalPasswd;

    private com.vmware.converter.HostDateTimeConfig datetime;

    private com.vmware.converter.HostStorageDeviceInfo storageDevice;

    private com.vmware.converter.HostLicenseSpec license;

    private com.vmware.converter.HostSecuritySpec security;

    private com.vmware.converter.HostAccountSpec[] userAccount;

    private com.vmware.converter.HostAccountSpec[] usergroupAccount;

    private com.vmware.converter.HostMemorySpec memory;

    private com.vmware.converter.HostActiveDirectory[] activeDirectory;

    private com.vmware.converter.KeyAnyValue[] genericConfig;

    public HostConfigSpec() {
    }

    public HostConfigSpec(
           com.vmware.converter.HostNasVolumeConfig[] nasDatastore,
           com.vmware.converter.HostNetworkConfig network,
           com.vmware.converter.HostVirtualNicManagerNicTypeSelection[] nicTypeSelection,
           com.vmware.converter.HostServiceConfig[] service,
           com.vmware.converter.HostFirewallConfig firewall,
           com.vmware.converter.OptionValue[] option,
           java.lang.String datastorePrincipal,
           java.lang.String datastorePrincipalPasswd,
           com.vmware.converter.HostDateTimeConfig datetime,
           com.vmware.converter.HostStorageDeviceInfo storageDevice,
           com.vmware.converter.HostLicenseSpec license,
           com.vmware.converter.HostSecuritySpec security,
           com.vmware.converter.HostAccountSpec[] userAccount,
           com.vmware.converter.HostAccountSpec[] usergroupAccount,
           com.vmware.converter.HostMemorySpec memory,
           com.vmware.converter.HostActiveDirectory[] activeDirectory,
           com.vmware.converter.KeyAnyValue[] genericConfig) {
        this.nasDatastore = nasDatastore;
        this.network = network;
        this.nicTypeSelection = nicTypeSelection;
        this.service = service;
        this.firewall = firewall;
        this.option = option;
        this.datastorePrincipal = datastorePrincipal;
        this.datastorePrincipalPasswd = datastorePrincipalPasswd;
        this.datetime = datetime;
        this.storageDevice = storageDevice;
        this.license = license;
        this.security = security;
        this.userAccount = userAccount;
        this.usergroupAccount = usergroupAccount;
        this.memory = memory;
        this.activeDirectory = activeDirectory;
        this.genericConfig = genericConfig;
    }


    /**
     * Gets the nasDatastore value for this HostConfigSpec.
     * 
     * @return nasDatastore
     */
    public com.vmware.converter.HostNasVolumeConfig[] getNasDatastore() {
        return nasDatastore;
    }


    /**
     * Sets the nasDatastore value for this HostConfigSpec.
     * 
     * @param nasDatastore
     */
    public void setNasDatastore(com.vmware.converter.HostNasVolumeConfig[] nasDatastore) {
        this.nasDatastore = nasDatastore;
    }

    public com.vmware.converter.HostNasVolumeConfig getNasDatastore(int i) {
        return this.nasDatastore[i];
    }

    public void setNasDatastore(int i, com.vmware.converter.HostNasVolumeConfig _value) {
        this.nasDatastore[i] = _value;
    }


    /**
     * Gets the network value for this HostConfigSpec.
     * 
     * @return network
     */
    public com.vmware.converter.HostNetworkConfig getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this HostConfigSpec.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.HostNetworkConfig network) {
        this.network = network;
    }


    /**
     * Gets the nicTypeSelection value for this HostConfigSpec.
     * 
     * @return nicTypeSelection
     */
    public com.vmware.converter.HostVirtualNicManagerNicTypeSelection[] getNicTypeSelection() {
        return nicTypeSelection;
    }


    /**
     * Sets the nicTypeSelection value for this HostConfigSpec.
     * 
     * @param nicTypeSelection
     */
    public void setNicTypeSelection(com.vmware.converter.HostVirtualNicManagerNicTypeSelection[] nicTypeSelection) {
        this.nicTypeSelection = nicTypeSelection;
    }

    public com.vmware.converter.HostVirtualNicManagerNicTypeSelection getNicTypeSelection(int i) {
        return this.nicTypeSelection[i];
    }

    public void setNicTypeSelection(int i, com.vmware.converter.HostVirtualNicManagerNicTypeSelection _value) {
        this.nicTypeSelection[i] = _value;
    }


    /**
     * Gets the service value for this HostConfigSpec.
     * 
     * @return service
     */
    public com.vmware.converter.HostServiceConfig[] getService() {
        return service;
    }


    /**
     * Sets the service value for this HostConfigSpec.
     * 
     * @param service
     */
    public void setService(com.vmware.converter.HostServiceConfig[] service) {
        this.service = service;
    }

    public com.vmware.converter.HostServiceConfig getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.vmware.converter.HostServiceConfig _value) {
        this.service[i] = _value;
    }


    /**
     * Gets the firewall value for this HostConfigSpec.
     * 
     * @return firewall
     */
    public com.vmware.converter.HostFirewallConfig getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this HostConfigSpec.
     * 
     * @param firewall
     */
    public void setFirewall(com.vmware.converter.HostFirewallConfig firewall) {
        this.firewall = firewall;
    }


    /**
     * Gets the option value for this HostConfigSpec.
     * 
     * @return option
     */
    public com.vmware.converter.OptionValue[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this HostConfigSpec.
     * 
     * @param option
     */
    public void setOption(com.vmware.converter.OptionValue[] option) {
        this.option = option;
    }

    public com.vmware.converter.OptionValue getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.vmware.converter.OptionValue _value) {
        this.option[i] = _value;
    }


    /**
     * Gets the datastorePrincipal value for this HostConfigSpec.
     * 
     * @return datastorePrincipal
     */
    public java.lang.String getDatastorePrincipal() {
        return datastorePrincipal;
    }


    /**
     * Sets the datastorePrincipal value for this HostConfigSpec.
     * 
     * @param datastorePrincipal
     */
    public void setDatastorePrincipal(java.lang.String datastorePrincipal) {
        this.datastorePrincipal = datastorePrincipal;
    }


    /**
     * Gets the datastorePrincipalPasswd value for this HostConfigSpec.
     * 
     * @return datastorePrincipalPasswd
     */
    public java.lang.String getDatastorePrincipalPasswd() {
        return datastorePrincipalPasswd;
    }


    /**
     * Sets the datastorePrincipalPasswd value for this HostConfigSpec.
     * 
     * @param datastorePrincipalPasswd
     */
    public void setDatastorePrincipalPasswd(java.lang.String datastorePrincipalPasswd) {
        this.datastorePrincipalPasswd = datastorePrincipalPasswd;
    }


    /**
     * Gets the datetime value for this HostConfigSpec.
     * 
     * @return datetime
     */
    public com.vmware.converter.HostDateTimeConfig getDatetime() {
        return datetime;
    }


    /**
     * Sets the datetime value for this HostConfigSpec.
     * 
     * @param datetime
     */
    public void setDatetime(com.vmware.converter.HostDateTimeConfig datetime) {
        this.datetime = datetime;
    }


    /**
     * Gets the storageDevice value for this HostConfigSpec.
     * 
     * @return storageDevice
     */
    public com.vmware.converter.HostStorageDeviceInfo getStorageDevice() {
        return storageDevice;
    }


    /**
     * Sets the storageDevice value for this HostConfigSpec.
     * 
     * @param storageDevice
     */
    public void setStorageDevice(com.vmware.converter.HostStorageDeviceInfo storageDevice) {
        this.storageDevice = storageDevice;
    }


    /**
     * Gets the license value for this HostConfigSpec.
     * 
     * @return license
     */
    public com.vmware.converter.HostLicenseSpec getLicense() {
        return license;
    }


    /**
     * Sets the license value for this HostConfigSpec.
     * 
     * @param license
     */
    public void setLicense(com.vmware.converter.HostLicenseSpec license) {
        this.license = license;
    }


    /**
     * Gets the security value for this HostConfigSpec.
     * 
     * @return security
     */
    public com.vmware.converter.HostSecuritySpec getSecurity() {
        return security;
    }


    /**
     * Sets the security value for this HostConfigSpec.
     * 
     * @param security
     */
    public void setSecurity(com.vmware.converter.HostSecuritySpec security) {
        this.security = security;
    }


    /**
     * Gets the userAccount value for this HostConfigSpec.
     * 
     * @return userAccount
     */
    public com.vmware.converter.HostAccountSpec[] getUserAccount() {
        return userAccount;
    }


    /**
     * Sets the userAccount value for this HostConfigSpec.
     * 
     * @param userAccount
     */
    public void setUserAccount(com.vmware.converter.HostAccountSpec[] userAccount) {
        this.userAccount = userAccount;
    }

    public com.vmware.converter.HostAccountSpec getUserAccount(int i) {
        return this.userAccount[i];
    }

    public void setUserAccount(int i, com.vmware.converter.HostAccountSpec _value) {
        this.userAccount[i] = _value;
    }


    /**
     * Gets the usergroupAccount value for this HostConfigSpec.
     * 
     * @return usergroupAccount
     */
    public com.vmware.converter.HostAccountSpec[] getUsergroupAccount() {
        return usergroupAccount;
    }


    /**
     * Sets the usergroupAccount value for this HostConfigSpec.
     * 
     * @param usergroupAccount
     */
    public void setUsergroupAccount(com.vmware.converter.HostAccountSpec[] usergroupAccount) {
        this.usergroupAccount = usergroupAccount;
    }

    public com.vmware.converter.HostAccountSpec getUsergroupAccount(int i) {
        return this.usergroupAccount[i];
    }

    public void setUsergroupAccount(int i, com.vmware.converter.HostAccountSpec _value) {
        this.usergroupAccount[i] = _value;
    }


    /**
     * Gets the memory value for this HostConfigSpec.
     * 
     * @return memory
     */
    public com.vmware.converter.HostMemorySpec getMemory() {
        return memory;
    }


    /**
     * Sets the memory value for this HostConfigSpec.
     * 
     * @param memory
     */
    public void setMemory(com.vmware.converter.HostMemorySpec memory) {
        this.memory = memory;
    }


    /**
     * Gets the activeDirectory value for this HostConfigSpec.
     * 
     * @return activeDirectory
     */
    public com.vmware.converter.HostActiveDirectory[] getActiveDirectory() {
        return activeDirectory;
    }


    /**
     * Sets the activeDirectory value for this HostConfigSpec.
     * 
     * @param activeDirectory
     */
    public void setActiveDirectory(com.vmware.converter.HostActiveDirectory[] activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    public com.vmware.converter.HostActiveDirectory getActiveDirectory(int i) {
        return this.activeDirectory[i];
    }

    public void setActiveDirectory(int i, com.vmware.converter.HostActiveDirectory _value) {
        this.activeDirectory[i] = _value;
    }


    /**
     * Gets the genericConfig value for this HostConfigSpec.
     * 
     * @return genericConfig
     */
    public com.vmware.converter.KeyAnyValue[] getGenericConfig() {
        return genericConfig;
    }


    /**
     * Sets the genericConfig value for this HostConfigSpec.
     * 
     * @param genericConfig
     */
    public void setGenericConfig(com.vmware.converter.KeyAnyValue[] genericConfig) {
        this.genericConfig = genericConfig;
    }

    public com.vmware.converter.KeyAnyValue getGenericConfig(int i) {
        return this.genericConfig[i];
    }

    public void setGenericConfig(int i, com.vmware.converter.KeyAnyValue _value) {
        this.genericConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConfigSpec)) return false;
        HostConfigSpec other = (HostConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nasDatastore==null && other.getNasDatastore()==null) || 
             (this.nasDatastore!=null &&
              java.util.Arrays.equals(this.nasDatastore, other.getNasDatastore()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.nicTypeSelection==null && other.getNicTypeSelection()==null) || 
             (this.nicTypeSelection!=null &&
              java.util.Arrays.equals(this.nicTypeSelection, other.getNicTypeSelection()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.firewall==null && other.getFirewall()==null) || 
             (this.firewall!=null &&
              this.firewall.equals(other.getFirewall()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
            ((this.datastorePrincipal==null && other.getDatastorePrincipal()==null) || 
             (this.datastorePrincipal!=null &&
              this.datastorePrincipal.equals(other.getDatastorePrincipal()))) &&
            ((this.datastorePrincipalPasswd==null && other.getDatastorePrincipalPasswd()==null) || 
             (this.datastorePrincipalPasswd!=null &&
              this.datastorePrincipalPasswd.equals(other.getDatastorePrincipalPasswd()))) &&
            ((this.datetime==null && other.getDatetime()==null) || 
             (this.datetime!=null &&
              this.datetime.equals(other.getDatetime()))) &&
            ((this.storageDevice==null && other.getStorageDevice()==null) || 
             (this.storageDevice!=null &&
              this.storageDevice.equals(other.getStorageDevice()))) &&
            ((this.license==null && other.getLicense()==null) || 
             (this.license!=null &&
              this.license.equals(other.getLicense()))) &&
            ((this.security==null && other.getSecurity()==null) || 
             (this.security!=null &&
              this.security.equals(other.getSecurity()))) &&
            ((this.userAccount==null && other.getUserAccount()==null) || 
             (this.userAccount!=null &&
              java.util.Arrays.equals(this.userAccount, other.getUserAccount()))) &&
            ((this.usergroupAccount==null && other.getUsergroupAccount()==null) || 
             (this.usergroupAccount!=null &&
              java.util.Arrays.equals(this.usergroupAccount, other.getUsergroupAccount()))) &&
            ((this.memory==null && other.getMemory()==null) || 
             (this.memory!=null &&
              this.memory.equals(other.getMemory()))) &&
            ((this.activeDirectory==null && other.getActiveDirectory()==null) || 
             (this.activeDirectory!=null &&
              java.util.Arrays.equals(this.activeDirectory, other.getActiveDirectory()))) &&
            ((this.genericConfig==null && other.getGenericConfig()==null) || 
             (this.genericConfig!=null &&
              java.util.Arrays.equals(this.genericConfig, other.getGenericConfig())));
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
        if (getNasDatastore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNasDatastore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNasDatastore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNicTypeSelection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNicTypeSelection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNicTypeSelection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirewall() != null) {
            _hashCode += getFirewall().hashCode();
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastorePrincipal() != null) {
            _hashCode += getDatastorePrincipal().hashCode();
        }
        if (getDatastorePrincipalPasswd() != null) {
            _hashCode += getDatastorePrincipalPasswd().hashCode();
        }
        if (getDatetime() != null) {
            _hashCode += getDatetime().hashCode();
        }
        if (getStorageDevice() != null) {
            _hashCode += getStorageDevice().hashCode();
        }
        if (getLicense() != null) {
            _hashCode += getLicense().hashCode();
        }
        if (getSecurity() != null) {
            _hashCode += getSecurity().hashCode();
        }
        if (getUserAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsergroupAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsergroupAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsergroupAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemory() != null) {
            _hashCode += getMemory().hashCode();
        }
        if (getActiveDirectory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveDirectory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActiveDirectory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenericConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericConfig(), i);
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
        new org.apache.axis.description.TypeDesc(HostConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nasDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nasDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNasVolumeConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTypeSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicTypeSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicManagerNicTypeSelection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostServiceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "firewall"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastorePrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePrincipalPasswd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastorePrincipalPasswd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDateTimeConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageDeviceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "license"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLicenseSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "security"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSecuritySpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccountSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usergroupAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usergroupAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccountSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemorySpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostActiveDirectory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "genericConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyAnyValue"));
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
