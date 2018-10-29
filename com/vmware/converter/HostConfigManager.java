/**
 * HostConfigManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostConfigManager  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference cpuScheduler;

    private com.vmware.converter.ManagedObjectReference datastoreSystem;

    private com.vmware.converter.ManagedObjectReference memoryManager;

    private com.vmware.converter.ManagedObjectReference storageSystem;

    private com.vmware.converter.ManagedObjectReference networkSystem;

    private com.vmware.converter.ManagedObjectReference vmotionSystem;

    private com.vmware.converter.ManagedObjectReference virtualNicManager;

    private com.vmware.converter.ManagedObjectReference serviceSystem;

    private com.vmware.converter.ManagedObjectReference firewallSystem;

    private com.vmware.converter.ManagedObjectReference advancedOption;

    private com.vmware.converter.ManagedObjectReference diagnosticSystem;

    private com.vmware.converter.ManagedObjectReference autoStartManager;

    private com.vmware.converter.ManagedObjectReference snmpSystem;

    private com.vmware.converter.ManagedObjectReference dateTimeSystem;

    private com.vmware.converter.ManagedObjectReference patchManager;

    private com.vmware.converter.ManagedObjectReference imageConfigManager;

    private com.vmware.converter.ManagedObjectReference bootDeviceSystem;

    private com.vmware.converter.ManagedObjectReference firmwareSystem;

    private com.vmware.converter.ManagedObjectReference healthStatusSystem;

    private com.vmware.converter.ManagedObjectReference pciPassthruSystem;

    private com.vmware.converter.ManagedObjectReference licenseManager;

    private com.vmware.converter.ManagedObjectReference kernelModuleSystem;

    private com.vmware.converter.ManagedObjectReference authenticationManager;

    private com.vmware.converter.ManagedObjectReference powerSystem;

    private com.vmware.converter.ManagedObjectReference cacheConfigurationManager;

    private com.vmware.converter.ManagedObjectReference esxAgentHostManager;

    private com.vmware.converter.ManagedObjectReference iscsiManager;

    private com.vmware.converter.ManagedObjectReference vFlashManager;

    private com.vmware.converter.ManagedObjectReference vsanSystem;

    private com.vmware.converter.ManagedObjectReference messageBusProxy;

    private com.vmware.converter.ManagedObjectReference userDirectory;

    private com.vmware.converter.ManagedObjectReference accountManager;

    private com.vmware.converter.ManagedObjectReference hostAccessManager;

    private com.vmware.converter.ManagedObjectReference graphicsManager;

    private com.vmware.converter.ManagedObjectReference vsanInternalSystem;

    private com.vmware.converter.ManagedObjectReference certificateManager;

    public HostConfigManager() {
    }

    public HostConfigManager(
           com.vmware.converter.ManagedObjectReference cpuScheduler,
           com.vmware.converter.ManagedObjectReference datastoreSystem,
           com.vmware.converter.ManagedObjectReference memoryManager,
           com.vmware.converter.ManagedObjectReference storageSystem,
           com.vmware.converter.ManagedObjectReference networkSystem,
           com.vmware.converter.ManagedObjectReference vmotionSystem,
           com.vmware.converter.ManagedObjectReference virtualNicManager,
           com.vmware.converter.ManagedObjectReference serviceSystem,
           com.vmware.converter.ManagedObjectReference firewallSystem,
           com.vmware.converter.ManagedObjectReference advancedOption,
           com.vmware.converter.ManagedObjectReference diagnosticSystem,
           com.vmware.converter.ManagedObjectReference autoStartManager,
           com.vmware.converter.ManagedObjectReference snmpSystem,
           com.vmware.converter.ManagedObjectReference dateTimeSystem,
           com.vmware.converter.ManagedObjectReference patchManager,
           com.vmware.converter.ManagedObjectReference imageConfigManager,
           com.vmware.converter.ManagedObjectReference bootDeviceSystem,
           com.vmware.converter.ManagedObjectReference firmwareSystem,
           com.vmware.converter.ManagedObjectReference healthStatusSystem,
           com.vmware.converter.ManagedObjectReference pciPassthruSystem,
           com.vmware.converter.ManagedObjectReference licenseManager,
           com.vmware.converter.ManagedObjectReference kernelModuleSystem,
           com.vmware.converter.ManagedObjectReference authenticationManager,
           com.vmware.converter.ManagedObjectReference powerSystem,
           com.vmware.converter.ManagedObjectReference cacheConfigurationManager,
           com.vmware.converter.ManagedObjectReference esxAgentHostManager,
           com.vmware.converter.ManagedObjectReference iscsiManager,
           com.vmware.converter.ManagedObjectReference vFlashManager,
           com.vmware.converter.ManagedObjectReference vsanSystem,
           com.vmware.converter.ManagedObjectReference messageBusProxy,
           com.vmware.converter.ManagedObjectReference userDirectory,
           com.vmware.converter.ManagedObjectReference accountManager,
           com.vmware.converter.ManagedObjectReference hostAccessManager,
           com.vmware.converter.ManagedObjectReference graphicsManager,
           com.vmware.converter.ManagedObjectReference vsanInternalSystem,
           com.vmware.converter.ManagedObjectReference certificateManager) {
        this.cpuScheduler = cpuScheduler;
        this.datastoreSystem = datastoreSystem;
        this.memoryManager = memoryManager;
        this.storageSystem = storageSystem;
        this.networkSystem = networkSystem;
        this.vmotionSystem = vmotionSystem;
        this.virtualNicManager = virtualNicManager;
        this.serviceSystem = serviceSystem;
        this.firewallSystem = firewallSystem;
        this.advancedOption = advancedOption;
        this.diagnosticSystem = diagnosticSystem;
        this.autoStartManager = autoStartManager;
        this.snmpSystem = snmpSystem;
        this.dateTimeSystem = dateTimeSystem;
        this.patchManager = patchManager;
        this.imageConfigManager = imageConfigManager;
        this.bootDeviceSystem = bootDeviceSystem;
        this.firmwareSystem = firmwareSystem;
        this.healthStatusSystem = healthStatusSystem;
        this.pciPassthruSystem = pciPassthruSystem;
        this.licenseManager = licenseManager;
        this.kernelModuleSystem = kernelModuleSystem;
        this.authenticationManager = authenticationManager;
        this.powerSystem = powerSystem;
        this.cacheConfigurationManager = cacheConfigurationManager;
        this.esxAgentHostManager = esxAgentHostManager;
        this.iscsiManager = iscsiManager;
        this.vFlashManager = vFlashManager;
        this.vsanSystem = vsanSystem;
        this.messageBusProxy = messageBusProxy;
        this.userDirectory = userDirectory;
        this.accountManager = accountManager;
        this.hostAccessManager = hostAccessManager;
        this.graphicsManager = graphicsManager;
        this.vsanInternalSystem = vsanInternalSystem;
        this.certificateManager = certificateManager;
    }


    /**
     * Gets the cpuScheduler value for this HostConfigManager.
     * 
     * @return cpuScheduler
     */
    public com.vmware.converter.ManagedObjectReference getCpuScheduler() {
        return cpuScheduler;
    }


    /**
     * Sets the cpuScheduler value for this HostConfigManager.
     * 
     * @param cpuScheduler
     */
    public void setCpuScheduler(com.vmware.converter.ManagedObjectReference cpuScheduler) {
        this.cpuScheduler = cpuScheduler;
    }


    /**
     * Gets the datastoreSystem value for this HostConfigManager.
     * 
     * @return datastoreSystem
     */
    public com.vmware.converter.ManagedObjectReference getDatastoreSystem() {
        return datastoreSystem;
    }


    /**
     * Sets the datastoreSystem value for this HostConfigManager.
     * 
     * @param datastoreSystem
     */
    public void setDatastoreSystem(com.vmware.converter.ManagedObjectReference datastoreSystem) {
        this.datastoreSystem = datastoreSystem;
    }


    /**
     * Gets the memoryManager value for this HostConfigManager.
     * 
     * @return memoryManager
     */
    public com.vmware.converter.ManagedObjectReference getMemoryManager() {
        return memoryManager;
    }


    /**
     * Sets the memoryManager value for this HostConfigManager.
     * 
     * @param memoryManager
     */
    public void setMemoryManager(com.vmware.converter.ManagedObjectReference memoryManager) {
        this.memoryManager = memoryManager;
    }


    /**
     * Gets the storageSystem value for this HostConfigManager.
     * 
     * @return storageSystem
     */
    public com.vmware.converter.ManagedObjectReference getStorageSystem() {
        return storageSystem;
    }


    /**
     * Sets the storageSystem value for this HostConfigManager.
     * 
     * @param storageSystem
     */
    public void setStorageSystem(com.vmware.converter.ManagedObjectReference storageSystem) {
        this.storageSystem = storageSystem;
    }


    /**
     * Gets the networkSystem value for this HostConfigManager.
     * 
     * @return networkSystem
     */
    public com.vmware.converter.ManagedObjectReference getNetworkSystem() {
        return networkSystem;
    }


    /**
     * Sets the networkSystem value for this HostConfigManager.
     * 
     * @param networkSystem
     */
    public void setNetworkSystem(com.vmware.converter.ManagedObjectReference networkSystem) {
        this.networkSystem = networkSystem;
    }


    /**
     * Gets the vmotionSystem value for this HostConfigManager.
     * 
     * @return vmotionSystem
     */
    public com.vmware.converter.ManagedObjectReference getVmotionSystem() {
        return vmotionSystem;
    }


    /**
     * Sets the vmotionSystem value for this HostConfigManager.
     * 
     * @param vmotionSystem
     */
    public void setVmotionSystem(com.vmware.converter.ManagedObjectReference vmotionSystem) {
        this.vmotionSystem = vmotionSystem;
    }


    /**
     * Gets the virtualNicManager value for this HostConfigManager.
     * 
     * @return virtualNicManager
     */
    public com.vmware.converter.ManagedObjectReference getVirtualNicManager() {
        return virtualNicManager;
    }


    /**
     * Sets the virtualNicManager value for this HostConfigManager.
     * 
     * @param virtualNicManager
     */
    public void setVirtualNicManager(com.vmware.converter.ManagedObjectReference virtualNicManager) {
        this.virtualNicManager = virtualNicManager;
    }


    /**
     * Gets the serviceSystem value for this HostConfigManager.
     * 
     * @return serviceSystem
     */
    public com.vmware.converter.ManagedObjectReference getServiceSystem() {
        return serviceSystem;
    }


    /**
     * Sets the serviceSystem value for this HostConfigManager.
     * 
     * @param serviceSystem
     */
    public void setServiceSystem(com.vmware.converter.ManagedObjectReference serviceSystem) {
        this.serviceSystem = serviceSystem;
    }


    /**
     * Gets the firewallSystem value for this HostConfigManager.
     * 
     * @return firewallSystem
     */
    public com.vmware.converter.ManagedObjectReference getFirewallSystem() {
        return firewallSystem;
    }


    /**
     * Sets the firewallSystem value for this HostConfigManager.
     * 
     * @param firewallSystem
     */
    public void setFirewallSystem(com.vmware.converter.ManagedObjectReference firewallSystem) {
        this.firewallSystem = firewallSystem;
    }


    /**
     * Gets the advancedOption value for this HostConfigManager.
     * 
     * @return advancedOption
     */
    public com.vmware.converter.ManagedObjectReference getAdvancedOption() {
        return advancedOption;
    }


    /**
     * Sets the advancedOption value for this HostConfigManager.
     * 
     * @param advancedOption
     */
    public void setAdvancedOption(com.vmware.converter.ManagedObjectReference advancedOption) {
        this.advancedOption = advancedOption;
    }


    /**
     * Gets the diagnosticSystem value for this HostConfigManager.
     * 
     * @return diagnosticSystem
     */
    public com.vmware.converter.ManagedObjectReference getDiagnosticSystem() {
        return diagnosticSystem;
    }


    /**
     * Sets the diagnosticSystem value for this HostConfigManager.
     * 
     * @param diagnosticSystem
     */
    public void setDiagnosticSystem(com.vmware.converter.ManagedObjectReference diagnosticSystem) {
        this.diagnosticSystem = diagnosticSystem;
    }


    /**
     * Gets the autoStartManager value for this HostConfigManager.
     * 
     * @return autoStartManager
     */
    public com.vmware.converter.ManagedObjectReference getAutoStartManager() {
        return autoStartManager;
    }


    /**
     * Sets the autoStartManager value for this HostConfigManager.
     * 
     * @param autoStartManager
     */
    public void setAutoStartManager(com.vmware.converter.ManagedObjectReference autoStartManager) {
        this.autoStartManager = autoStartManager;
    }


    /**
     * Gets the snmpSystem value for this HostConfigManager.
     * 
     * @return snmpSystem
     */
    public com.vmware.converter.ManagedObjectReference getSnmpSystem() {
        return snmpSystem;
    }


    /**
     * Sets the snmpSystem value for this HostConfigManager.
     * 
     * @param snmpSystem
     */
    public void setSnmpSystem(com.vmware.converter.ManagedObjectReference snmpSystem) {
        this.snmpSystem = snmpSystem;
    }


    /**
     * Gets the dateTimeSystem value for this HostConfigManager.
     * 
     * @return dateTimeSystem
     */
    public com.vmware.converter.ManagedObjectReference getDateTimeSystem() {
        return dateTimeSystem;
    }


    /**
     * Sets the dateTimeSystem value for this HostConfigManager.
     * 
     * @param dateTimeSystem
     */
    public void setDateTimeSystem(com.vmware.converter.ManagedObjectReference dateTimeSystem) {
        this.dateTimeSystem = dateTimeSystem;
    }


    /**
     * Gets the patchManager value for this HostConfigManager.
     * 
     * @return patchManager
     */
    public com.vmware.converter.ManagedObjectReference getPatchManager() {
        return patchManager;
    }


    /**
     * Sets the patchManager value for this HostConfigManager.
     * 
     * @param patchManager
     */
    public void setPatchManager(com.vmware.converter.ManagedObjectReference patchManager) {
        this.patchManager = patchManager;
    }


    /**
     * Gets the imageConfigManager value for this HostConfigManager.
     * 
     * @return imageConfigManager
     */
    public com.vmware.converter.ManagedObjectReference getImageConfigManager() {
        return imageConfigManager;
    }


    /**
     * Sets the imageConfigManager value for this HostConfigManager.
     * 
     * @param imageConfigManager
     */
    public void setImageConfigManager(com.vmware.converter.ManagedObjectReference imageConfigManager) {
        this.imageConfigManager = imageConfigManager;
    }


    /**
     * Gets the bootDeviceSystem value for this HostConfigManager.
     * 
     * @return bootDeviceSystem
     */
    public com.vmware.converter.ManagedObjectReference getBootDeviceSystem() {
        return bootDeviceSystem;
    }


    /**
     * Sets the bootDeviceSystem value for this HostConfigManager.
     * 
     * @param bootDeviceSystem
     */
    public void setBootDeviceSystem(com.vmware.converter.ManagedObjectReference bootDeviceSystem) {
        this.bootDeviceSystem = bootDeviceSystem;
    }


    /**
     * Gets the firmwareSystem value for this HostConfigManager.
     * 
     * @return firmwareSystem
     */
    public com.vmware.converter.ManagedObjectReference getFirmwareSystem() {
        return firmwareSystem;
    }


    /**
     * Sets the firmwareSystem value for this HostConfigManager.
     * 
     * @param firmwareSystem
     */
    public void setFirmwareSystem(com.vmware.converter.ManagedObjectReference firmwareSystem) {
        this.firmwareSystem = firmwareSystem;
    }


    /**
     * Gets the healthStatusSystem value for this HostConfigManager.
     * 
     * @return healthStatusSystem
     */
    public com.vmware.converter.ManagedObjectReference getHealthStatusSystem() {
        return healthStatusSystem;
    }


    /**
     * Sets the healthStatusSystem value for this HostConfigManager.
     * 
     * @param healthStatusSystem
     */
    public void setHealthStatusSystem(com.vmware.converter.ManagedObjectReference healthStatusSystem) {
        this.healthStatusSystem = healthStatusSystem;
    }


    /**
     * Gets the pciPassthruSystem value for this HostConfigManager.
     * 
     * @return pciPassthruSystem
     */
    public com.vmware.converter.ManagedObjectReference getPciPassthruSystem() {
        return pciPassthruSystem;
    }


    /**
     * Sets the pciPassthruSystem value for this HostConfigManager.
     * 
     * @param pciPassthruSystem
     */
    public void setPciPassthruSystem(com.vmware.converter.ManagedObjectReference pciPassthruSystem) {
        this.pciPassthruSystem = pciPassthruSystem;
    }


    /**
     * Gets the licenseManager value for this HostConfigManager.
     * 
     * @return licenseManager
     */
    public com.vmware.converter.ManagedObjectReference getLicenseManager() {
        return licenseManager;
    }


    /**
     * Sets the licenseManager value for this HostConfigManager.
     * 
     * @param licenseManager
     */
    public void setLicenseManager(com.vmware.converter.ManagedObjectReference licenseManager) {
        this.licenseManager = licenseManager;
    }


    /**
     * Gets the kernelModuleSystem value for this HostConfigManager.
     * 
     * @return kernelModuleSystem
     */
    public com.vmware.converter.ManagedObjectReference getKernelModuleSystem() {
        return kernelModuleSystem;
    }


    /**
     * Sets the kernelModuleSystem value for this HostConfigManager.
     * 
     * @param kernelModuleSystem
     */
    public void setKernelModuleSystem(com.vmware.converter.ManagedObjectReference kernelModuleSystem) {
        this.kernelModuleSystem = kernelModuleSystem;
    }


    /**
     * Gets the authenticationManager value for this HostConfigManager.
     * 
     * @return authenticationManager
     */
    public com.vmware.converter.ManagedObjectReference getAuthenticationManager() {
        return authenticationManager;
    }


    /**
     * Sets the authenticationManager value for this HostConfigManager.
     * 
     * @param authenticationManager
     */
    public void setAuthenticationManager(com.vmware.converter.ManagedObjectReference authenticationManager) {
        this.authenticationManager = authenticationManager;
    }


    /**
     * Gets the powerSystem value for this HostConfigManager.
     * 
     * @return powerSystem
     */
    public com.vmware.converter.ManagedObjectReference getPowerSystem() {
        return powerSystem;
    }


    /**
     * Sets the powerSystem value for this HostConfigManager.
     * 
     * @param powerSystem
     */
    public void setPowerSystem(com.vmware.converter.ManagedObjectReference powerSystem) {
        this.powerSystem = powerSystem;
    }


    /**
     * Gets the cacheConfigurationManager value for this HostConfigManager.
     * 
     * @return cacheConfigurationManager
     */
    public com.vmware.converter.ManagedObjectReference getCacheConfigurationManager() {
        return cacheConfigurationManager;
    }


    /**
     * Sets the cacheConfigurationManager value for this HostConfigManager.
     * 
     * @param cacheConfigurationManager
     */
    public void setCacheConfigurationManager(com.vmware.converter.ManagedObjectReference cacheConfigurationManager) {
        this.cacheConfigurationManager = cacheConfigurationManager;
    }


    /**
     * Gets the esxAgentHostManager value for this HostConfigManager.
     * 
     * @return esxAgentHostManager
     */
    public com.vmware.converter.ManagedObjectReference getEsxAgentHostManager() {
        return esxAgentHostManager;
    }


    /**
     * Sets the esxAgentHostManager value for this HostConfigManager.
     * 
     * @param esxAgentHostManager
     */
    public void setEsxAgentHostManager(com.vmware.converter.ManagedObjectReference esxAgentHostManager) {
        this.esxAgentHostManager = esxAgentHostManager;
    }


    /**
     * Gets the iscsiManager value for this HostConfigManager.
     * 
     * @return iscsiManager
     */
    public com.vmware.converter.ManagedObjectReference getIscsiManager() {
        return iscsiManager;
    }


    /**
     * Sets the iscsiManager value for this HostConfigManager.
     * 
     * @param iscsiManager
     */
    public void setIscsiManager(com.vmware.converter.ManagedObjectReference iscsiManager) {
        this.iscsiManager = iscsiManager;
    }


    /**
     * Gets the vFlashManager value for this HostConfigManager.
     * 
     * @return vFlashManager
     */
    public com.vmware.converter.ManagedObjectReference getVFlashManager() {
        return vFlashManager;
    }


    /**
     * Sets the vFlashManager value for this HostConfigManager.
     * 
     * @param vFlashManager
     */
    public void setVFlashManager(com.vmware.converter.ManagedObjectReference vFlashManager) {
        this.vFlashManager = vFlashManager;
    }


    /**
     * Gets the vsanSystem value for this HostConfigManager.
     * 
     * @return vsanSystem
     */
    public com.vmware.converter.ManagedObjectReference getVsanSystem() {
        return vsanSystem;
    }


    /**
     * Sets the vsanSystem value for this HostConfigManager.
     * 
     * @param vsanSystem
     */
    public void setVsanSystem(com.vmware.converter.ManagedObjectReference vsanSystem) {
        this.vsanSystem = vsanSystem;
    }


    /**
     * Gets the messageBusProxy value for this HostConfigManager.
     * 
     * @return messageBusProxy
     */
    public com.vmware.converter.ManagedObjectReference getMessageBusProxy() {
        return messageBusProxy;
    }


    /**
     * Sets the messageBusProxy value for this HostConfigManager.
     * 
     * @param messageBusProxy
     */
    public void setMessageBusProxy(com.vmware.converter.ManagedObjectReference messageBusProxy) {
        this.messageBusProxy = messageBusProxy;
    }


    /**
     * Gets the userDirectory value for this HostConfigManager.
     * 
     * @return userDirectory
     */
    public com.vmware.converter.ManagedObjectReference getUserDirectory() {
        return userDirectory;
    }


    /**
     * Sets the userDirectory value for this HostConfigManager.
     * 
     * @param userDirectory
     */
    public void setUserDirectory(com.vmware.converter.ManagedObjectReference userDirectory) {
        this.userDirectory = userDirectory;
    }


    /**
     * Gets the accountManager value for this HostConfigManager.
     * 
     * @return accountManager
     */
    public com.vmware.converter.ManagedObjectReference getAccountManager() {
        return accountManager;
    }


    /**
     * Sets the accountManager value for this HostConfigManager.
     * 
     * @param accountManager
     */
    public void setAccountManager(com.vmware.converter.ManagedObjectReference accountManager) {
        this.accountManager = accountManager;
    }


    /**
     * Gets the hostAccessManager value for this HostConfigManager.
     * 
     * @return hostAccessManager
     */
    public com.vmware.converter.ManagedObjectReference getHostAccessManager() {
        return hostAccessManager;
    }


    /**
     * Sets the hostAccessManager value for this HostConfigManager.
     * 
     * @param hostAccessManager
     */
    public void setHostAccessManager(com.vmware.converter.ManagedObjectReference hostAccessManager) {
        this.hostAccessManager = hostAccessManager;
    }


    /**
     * Gets the graphicsManager value for this HostConfigManager.
     * 
     * @return graphicsManager
     */
    public com.vmware.converter.ManagedObjectReference getGraphicsManager() {
        return graphicsManager;
    }


    /**
     * Sets the graphicsManager value for this HostConfigManager.
     * 
     * @param graphicsManager
     */
    public void setGraphicsManager(com.vmware.converter.ManagedObjectReference graphicsManager) {
        this.graphicsManager = graphicsManager;
    }


    /**
     * Gets the vsanInternalSystem value for this HostConfigManager.
     * 
     * @return vsanInternalSystem
     */
    public com.vmware.converter.ManagedObjectReference getVsanInternalSystem() {
        return vsanInternalSystem;
    }


    /**
     * Sets the vsanInternalSystem value for this HostConfigManager.
     * 
     * @param vsanInternalSystem
     */
    public void setVsanInternalSystem(com.vmware.converter.ManagedObjectReference vsanInternalSystem) {
        this.vsanInternalSystem = vsanInternalSystem;
    }


    /**
     * Gets the certificateManager value for this HostConfigManager.
     * 
     * @return certificateManager
     */
    public com.vmware.converter.ManagedObjectReference getCertificateManager() {
        return certificateManager;
    }


    /**
     * Sets the certificateManager value for this HostConfigManager.
     * 
     * @param certificateManager
     */
    public void setCertificateManager(com.vmware.converter.ManagedObjectReference certificateManager) {
        this.certificateManager = certificateManager;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConfigManager)) return false;
        HostConfigManager other = (HostConfigManager) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpuScheduler==null && other.getCpuScheduler()==null) || 
             (this.cpuScheduler!=null &&
              this.cpuScheduler.equals(other.getCpuScheduler()))) &&
            ((this.datastoreSystem==null && other.getDatastoreSystem()==null) || 
             (this.datastoreSystem!=null &&
              this.datastoreSystem.equals(other.getDatastoreSystem()))) &&
            ((this.memoryManager==null && other.getMemoryManager()==null) || 
             (this.memoryManager!=null &&
              this.memoryManager.equals(other.getMemoryManager()))) &&
            ((this.storageSystem==null && other.getStorageSystem()==null) || 
             (this.storageSystem!=null &&
              this.storageSystem.equals(other.getStorageSystem()))) &&
            ((this.networkSystem==null && other.getNetworkSystem()==null) || 
             (this.networkSystem!=null &&
              this.networkSystem.equals(other.getNetworkSystem()))) &&
            ((this.vmotionSystem==null && other.getVmotionSystem()==null) || 
             (this.vmotionSystem!=null &&
              this.vmotionSystem.equals(other.getVmotionSystem()))) &&
            ((this.virtualNicManager==null && other.getVirtualNicManager()==null) || 
             (this.virtualNicManager!=null &&
              this.virtualNicManager.equals(other.getVirtualNicManager()))) &&
            ((this.serviceSystem==null && other.getServiceSystem()==null) || 
             (this.serviceSystem!=null &&
              this.serviceSystem.equals(other.getServiceSystem()))) &&
            ((this.firewallSystem==null && other.getFirewallSystem()==null) || 
             (this.firewallSystem!=null &&
              this.firewallSystem.equals(other.getFirewallSystem()))) &&
            ((this.advancedOption==null && other.getAdvancedOption()==null) || 
             (this.advancedOption!=null &&
              this.advancedOption.equals(other.getAdvancedOption()))) &&
            ((this.diagnosticSystem==null && other.getDiagnosticSystem()==null) || 
             (this.diagnosticSystem!=null &&
              this.diagnosticSystem.equals(other.getDiagnosticSystem()))) &&
            ((this.autoStartManager==null && other.getAutoStartManager()==null) || 
             (this.autoStartManager!=null &&
              this.autoStartManager.equals(other.getAutoStartManager()))) &&
            ((this.snmpSystem==null && other.getSnmpSystem()==null) || 
             (this.snmpSystem!=null &&
              this.snmpSystem.equals(other.getSnmpSystem()))) &&
            ((this.dateTimeSystem==null && other.getDateTimeSystem()==null) || 
             (this.dateTimeSystem!=null &&
              this.dateTimeSystem.equals(other.getDateTimeSystem()))) &&
            ((this.patchManager==null && other.getPatchManager()==null) || 
             (this.patchManager!=null &&
              this.patchManager.equals(other.getPatchManager()))) &&
            ((this.imageConfigManager==null && other.getImageConfigManager()==null) || 
             (this.imageConfigManager!=null &&
              this.imageConfigManager.equals(other.getImageConfigManager()))) &&
            ((this.bootDeviceSystem==null && other.getBootDeviceSystem()==null) || 
             (this.bootDeviceSystem!=null &&
              this.bootDeviceSystem.equals(other.getBootDeviceSystem()))) &&
            ((this.firmwareSystem==null && other.getFirmwareSystem()==null) || 
             (this.firmwareSystem!=null &&
              this.firmwareSystem.equals(other.getFirmwareSystem()))) &&
            ((this.healthStatusSystem==null && other.getHealthStatusSystem()==null) || 
             (this.healthStatusSystem!=null &&
              this.healthStatusSystem.equals(other.getHealthStatusSystem()))) &&
            ((this.pciPassthruSystem==null && other.getPciPassthruSystem()==null) || 
             (this.pciPassthruSystem!=null &&
              this.pciPassthruSystem.equals(other.getPciPassthruSystem()))) &&
            ((this.licenseManager==null && other.getLicenseManager()==null) || 
             (this.licenseManager!=null &&
              this.licenseManager.equals(other.getLicenseManager()))) &&
            ((this.kernelModuleSystem==null && other.getKernelModuleSystem()==null) || 
             (this.kernelModuleSystem!=null &&
              this.kernelModuleSystem.equals(other.getKernelModuleSystem()))) &&
            ((this.authenticationManager==null && other.getAuthenticationManager()==null) || 
             (this.authenticationManager!=null &&
              this.authenticationManager.equals(other.getAuthenticationManager()))) &&
            ((this.powerSystem==null && other.getPowerSystem()==null) || 
             (this.powerSystem!=null &&
              this.powerSystem.equals(other.getPowerSystem()))) &&
            ((this.cacheConfigurationManager==null && other.getCacheConfigurationManager()==null) || 
             (this.cacheConfigurationManager!=null &&
              this.cacheConfigurationManager.equals(other.getCacheConfigurationManager()))) &&
            ((this.esxAgentHostManager==null && other.getEsxAgentHostManager()==null) || 
             (this.esxAgentHostManager!=null &&
              this.esxAgentHostManager.equals(other.getEsxAgentHostManager()))) &&
            ((this.iscsiManager==null && other.getIscsiManager()==null) || 
             (this.iscsiManager!=null &&
              this.iscsiManager.equals(other.getIscsiManager()))) &&
            ((this.vFlashManager==null && other.getVFlashManager()==null) || 
             (this.vFlashManager!=null &&
              this.vFlashManager.equals(other.getVFlashManager()))) &&
            ((this.vsanSystem==null && other.getVsanSystem()==null) || 
             (this.vsanSystem!=null &&
              this.vsanSystem.equals(other.getVsanSystem()))) &&
            ((this.messageBusProxy==null && other.getMessageBusProxy()==null) || 
             (this.messageBusProxy!=null &&
              this.messageBusProxy.equals(other.getMessageBusProxy()))) &&
            ((this.userDirectory==null && other.getUserDirectory()==null) || 
             (this.userDirectory!=null &&
              this.userDirectory.equals(other.getUserDirectory()))) &&
            ((this.accountManager==null && other.getAccountManager()==null) || 
             (this.accountManager!=null &&
              this.accountManager.equals(other.getAccountManager()))) &&
            ((this.hostAccessManager==null && other.getHostAccessManager()==null) || 
             (this.hostAccessManager!=null &&
              this.hostAccessManager.equals(other.getHostAccessManager()))) &&
            ((this.graphicsManager==null && other.getGraphicsManager()==null) || 
             (this.graphicsManager!=null &&
              this.graphicsManager.equals(other.getGraphicsManager()))) &&
            ((this.vsanInternalSystem==null && other.getVsanInternalSystem()==null) || 
             (this.vsanInternalSystem!=null &&
              this.vsanInternalSystem.equals(other.getVsanInternalSystem()))) &&
            ((this.certificateManager==null && other.getCertificateManager()==null) || 
             (this.certificateManager!=null &&
              this.certificateManager.equals(other.getCertificateManager())));
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
        if (getCpuScheduler() != null) {
            _hashCode += getCpuScheduler().hashCode();
        }
        if (getDatastoreSystem() != null) {
            _hashCode += getDatastoreSystem().hashCode();
        }
        if (getMemoryManager() != null) {
            _hashCode += getMemoryManager().hashCode();
        }
        if (getStorageSystem() != null) {
            _hashCode += getStorageSystem().hashCode();
        }
        if (getNetworkSystem() != null) {
            _hashCode += getNetworkSystem().hashCode();
        }
        if (getVmotionSystem() != null) {
            _hashCode += getVmotionSystem().hashCode();
        }
        if (getVirtualNicManager() != null) {
            _hashCode += getVirtualNicManager().hashCode();
        }
        if (getServiceSystem() != null) {
            _hashCode += getServiceSystem().hashCode();
        }
        if (getFirewallSystem() != null) {
            _hashCode += getFirewallSystem().hashCode();
        }
        if (getAdvancedOption() != null) {
            _hashCode += getAdvancedOption().hashCode();
        }
        if (getDiagnosticSystem() != null) {
            _hashCode += getDiagnosticSystem().hashCode();
        }
        if (getAutoStartManager() != null) {
            _hashCode += getAutoStartManager().hashCode();
        }
        if (getSnmpSystem() != null) {
            _hashCode += getSnmpSystem().hashCode();
        }
        if (getDateTimeSystem() != null) {
            _hashCode += getDateTimeSystem().hashCode();
        }
        if (getPatchManager() != null) {
            _hashCode += getPatchManager().hashCode();
        }
        if (getImageConfigManager() != null) {
            _hashCode += getImageConfigManager().hashCode();
        }
        if (getBootDeviceSystem() != null) {
            _hashCode += getBootDeviceSystem().hashCode();
        }
        if (getFirmwareSystem() != null) {
            _hashCode += getFirmwareSystem().hashCode();
        }
        if (getHealthStatusSystem() != null) {
            _hashCode += getHealthStatusSystem().hashCode();
        }
        if (getPciPassthruSystem() != null) {
            _hashCode += getPciPassthruSystem().hashCode();
        }
        if (getLicenseManager() != null) {
            _hashCode += getLicenseManager().hashCode();
        }
        if (getKernelModuleSystem() != null) {
            _hashCode += getKernelModuleSystem().hashCode();
        }
        if (getAuthenticationManager() != null) {
            _hashCode += getAuthenticationManager().hashCode();
        }
        if (getPowerSystem() != null) {
            _hashCode += getPowerSystem().hashCode();
        }
        if (getCacheConfigurationManager() != null) {
            _hashCode += getCacheConfigurationManager().hashCode();
        }
        if (getEsxAgentHostManager() != null) {
            _hashCode += getEsxAgentHostManager().hashCode();
        }
        if (getIscsiManager() != null) {
            _hashCode += getIscsiManager().hashCode();
        }
        if (getVFlashManager() != null) {
            _hashCode += getVFlashManager().hashCode();
        }
        if (getVsanSystem() != null) {
            _hashCode += getVsanSystem().hashCode();
        }
        if (getMessageBusProxy() != null) {
            _hashCode += getMessageBusProxy().hashCode();
        }
        if (getUserDirectory() != null) {
            _hashCode += getUserDirectory().hashCode();
        }
        if (getAccountManager() != null) {
            _hashCode += getAccountManager().hashCode();
        }
        if (getHostAccessManager() != null) {
            _hashCode += getHostAccessManager().hashCode();
        }
        if (getGraphicsManager() != null) {
            _hashCode += getGraphicsManager().hashCode();
        }
        if (getVsanInternalSystem() != null) {
            _hashCode += getVsanInternalSystem().hashCode();
        }
        if (getCertificateManager() != null) {
            _hashCode += getCertificateManager().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostConfigManager.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConfigManager"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuScheduler");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuScheduler"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualNicManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualNicManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serviceSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "firewallSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "advancedOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diagnosticSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoStartManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoStartManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snmpSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dateTimeSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patchManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "patchManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageConfigManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "imageConfigManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDeviceSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootDeviceSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "firmwareSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthStatusSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthStatusSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciPassthruSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciPassthruSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "licenseManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernelModuleSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "kernelModuleSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "authenticationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheConfigurationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cacheConfigurationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esxAgentHostManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "esxAgentHostManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscsiManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iscsiManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageBusProxy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "messageBusProxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accountManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAccessManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostAccessManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicsManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "graphicsManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanInternalSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanInternalSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "certificateManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
