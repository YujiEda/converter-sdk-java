/**
 * HostConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.AboutInfo product;

    private com.vmware.converter.HostHyperThreadScheduleInfo hyperThread;

    private com.vmware.converter.ServiceConsoleReservationInfo consoleReservation;

    private com.vmware.converter.VirtualMachineMemoryReservationInfo virtualMachineReservation;

    private com.vmware.converter.HostStorageDeviceInfo storageDevice;

    private com.vmware.converter.HostMultipathStateInfo multipathState;

    private com.vmware.converter.HostFileSystemVolumeInfo fileSystemVolume;

    private java.lang.String[] systemFile;

    private com.vmware.converter.HostNetworkInfo network;

    private com.vmware.converter.HostVMotionInfo vmotion;

    private com.vmware.converter.HostVirtualNicManagerInfo virtualNicManagerInfo;

    private com.vmware.converter.HostNetCapabilities capabilities;

    private com.vmware.converter.HostDatastoreSystemCapabilities datastoreCapabilities;

    private com.vmware.converter.HostNetOffloadCapabilities offloadCapabilities;

    private com.vmware.converter.HostServiceInfo service;

    private com.vmware.converter.HostFirewallInfo firewall;

    private com.vmware.converter.HostAutoStartManagerConfig autoStart;

    private com.vmware.converter.HostDiagnosticPartition activeDiagnosticPartition;

    private com.vmware.converter.OptionValue[] option;

    private com.vmware.converter.OptionDef[] optionDef;

    private java.lang.String datastorePrincipal;

    private com.vmware.converter.ManagedObjectReference localSwapDatastore;

    private com.vmware.converter.HostSystemSwapConfiguration systemSwapConfiguration;

    private com.vmware.converter.HostSystemResourceInfo systemResources;

    private com.vmware.converter.HostDateTimeInfo dateTimeInfo;

    private com.vmware.converter.HostFlagInfo flags;

    private java.lang.Boolean adminDisabled;

    private com.vmware.converter.HostLockdownMode lockdownMode;

    private com.vmware.converter.HostIpmiInfo ipmi;

    private com.vmware.converter.HostSslThumbprintInfo sslThumbprintInfo;

    private com.vmware.converter.HostSslThumbprintInfo[] sslThumbprintData;

    private byte[] certificate;

    private com.vmware.converter.HostPciPassthruInfo[] pciPassthruInfo;

    private com.vmware.converter.HostAuthenticationManagerInfo authenticationManagerInfo;

    private com.vmware.converter.HostFeatureVersionInfo[] featureVersion;

    private com.vmware.converter.PowerSystemCapability powerSystemCapability;

    private com.vmware.converter.PowerSystemInfo powerSystemInfo;

    private com.vmware.converter.HostCacheConfigurationInfo[] cacheConfigurationInfo;

    private java.lang.Boolean wakeOnLanCapable;

    private com.vmware.converter.HostFeatureCapability[] featureCapability;

    private com.vmware.converter.HostFeatureCapability[] maskedFeatureCapability;

    private com.vmware.converter.HostVFlashManagerVFlashConfigInfo vFlashConfigInfo;

    private com.vmware.converter.VsanHostConfigInfo vsanHostConfig;

    private java.lang.String[] domainList;

    private byte[] scriptCheckSum;

    private byte[] hostConfigCheckSum;

    private com.vmware.converter.HostGraphicsInfo[] graphicsInfo;

    private java.lang.String[] sharedPassthruGpuTypes;

    private com.vmware.converter.HostIoFilterInfo[] ioFilterInfo;

    public HostConfigInfo() {
    }

    public HostConfigInfo(
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.AboutInfo product,
           com.vmware.converter.HostHyperThreadScheduleInfo hyperThread,
           com.vmware.converter.ServiceConsoleReservationInfo consoleReservation,
           com.vmware.converter.VirtualMachineMemoryReservationInfo virtualMachineReservation,
           com.vmware.converter.HostStorageDeviceInfo storageDevice,
           com.vmware.converter.HostMultipathStateInfo multipathState,
           com.vmware.converter.HostFileSystemVolumeInfo fileSystemVolume,
           java.lang.String[] systemFile,
           com.vmware.converter.HostNetworkInfo network,
           com.vmware.converter.HostVMotionInfo vmotion,
           com.vmware.converter.HostVirtualNicManagerInfo virtualNicManagerInfo,
           com.vmware.converter.HostNetCapabilities capabilities,
           com.vmware.converter.HostDatastoreSystemCapabilities datastoreCapabilities,
           com.vmware.converter.HostNetOffloadCapabilities offloadCapabilities,
           com.vmware.converter.HostServiceInfo service,
           com.vmware.converter.HostFirewallInfo firewall,
           com.vmware.converter.HostAutoStartManagerConfig autoStart,
           com.vmware.converter.HostDiagnosticPartition activeDiagnosticPartition,
           com.vmware.converter.OptionValue[] option,
           com.vmware.converter.OptionDef[] optionDef,
           java.lang.String datastorePrincipal,
           com.vmware.converter.ManagedObjectReference localSwapDatastore,
           com.vmware.converter.HostSystemSwapConfiguration systemSwapConfiguration,
           com.vmware.converter.HostSystemResourceInfo systemResources,
           com.vmware.converter.HostDateTimeInfo dateTimeInfo,
           com.vmware.converter.HostFlagInfo flags,
           java.lang.Boolean adminDisabled,
           com.vmware.converter.HostLockdownMode lockdownMode,
           com.vmware.converter.HostIpmiInfo ipmi,
           com.vmware.converter.HostSslThumbprintInfo sslThumbprintInfo,
           com.vmware.converter.HostSslThumbprintInfo[] sslThumbprintData,
           byte[] certificate,
           com.vmware.converter.HostPciPassthruInfo[] pciPassthruInfo,
           com.vmware.converter.HostAuthenticationManagerInfo authenticationManagerInfo,
           com.vmware.converter.HostFeatureVersionInfo[] featureVersion,
           com.vmware.converter.PowerSystemCapability powerSystemCapability,
           com.vmware.converter.PowerSystemInfo powerSystemInfo,
           com.vmware.converter.HostCacheConfigurationInfo[] cacheConfigurationInfo,
           java.lang.Boolean wakeOnLanCapable,
           com.vmware.converter.HostFeatureCapability[] featureCapability,
           com.vmware.converter.HostFeatureCapability[] maskedFeatureCapability,
           com.vmware.converter.HostVFlashManagerVFlashConfigInfo vFlashConfigInfo,
           com.vmware.converter.VsanHostConfigInfo vsanHostConfig,
           java.lang.String[] domainList,
           byte[] scriptCheckSum,
           byte[] hostConfigCheckSum,
           com.vmware.converter.HostGraphicsInfo[] graphicsInfo,
           java.lang.String[] sharedPassthruGpuTypes,
           com.vmware.converter.HostIoFilterInfo[] ioFilterInfo) {
        this.host = host;
        this.product = product;
        this.hyperThread = hyperThread;
        this.consoleReservation = consoleReservation;
        this.virtualMachineReservation = virtualMachineReservation;
        this.storageDevice = storageDevice;
        this.multipathState = multipathState;
        this.fileSystemVolume = fileSystemVolume;
        this.systemFile = systemFile;
        this.network = network;
        this.vmotion = vmotion;
        this.virtualNicManagerInfo = virtualNicManagerInfo;
        this.capabilities = capabilities;
        this.datastoreCapabilities = datastoreCapabilities;
        this.offloadCapabilities = offloadCapabilities;
        this.service = service;
        this.firewall = firewall;
        this.autoStart = autoStart;
        this.activeDiagnosticPartition = activeDiagnosticPartition;
        this.option = option;
        this.optionDef = optionDef;
        this.datastorePrincipal = datastorePrincipal;
        this.localSwapDatastore = localSwapDatastore;
        this.systemSwapConfiguration = systemSwapConfiguration;
        this.systemResources = systemResources;
        this.dateTimeInfo = dateTimeInfo;
        this.flags = flags;
        this.adminDisabled = adminDisabled;
        this.lockdownMode = lockdownMode;
        this.ipmi = ipmi;
        this.sslThumbprintInfo = sslThumbprintInfo;
        this.sslThumbprintData = sslThumbprintData;
        this.certificate = certificate;
        this.pciPassthruInfo = pciPassthruInfo;
        this.authenticationManagerInfo = authenticationManagerInfo;
        this.featureVersion = featureVersion;
        this.powerSystemCapability = powerSystemCapability;
        this.powerSystemInfo = powerSystemInfo;
        this.cacheConfigurationInfo = cacheConfigurationInfo;
        this.wakeOnLanCapable = wakeOnLanCapable;
        this.featureCapability = featureCapability;
        this.maskedFeatureCapability = maskedFeatureCapability;
        this.vFlashConfigInfo = vFlashConfigInfo;
        this.vsanHostConfig = vsanHostConfig;
        this.domainList = domainList;
        this.scriptCheckSum = scriptCheckSum;
        this.hostConfigCheckSum = hostConfigCheckSum;
        this.graphicsInfo = graphicsInfo;
        this.sharedPassthruGpuTypes = sharedPassthruGpuTypes;
        this.ioFilterInfo = ioFilterInfo;
    }


    /**
     * Gets the host value for this HostConfigInfo.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this HostConfigInfo.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the product value for this HostConfigInfo.
     * 
     * @return product
     */
    public com.vmware.converter.AboutInfo getProduct() {
        return product;
    }


    /**
     * Sets the product value for this HostConfigInfo.
     * 
     * @param product
     */
    public void setProduct(com.vmware.converter.AboutInfo product) {
        this.product = product;
    }


    /**
     * Gets the hyperThread value for this HostConfigInfo.
     * 
     * @return hyperThread
     */
    public com.vmware.converter.HostHyperThreadScheduleInfo getHyperThread() {
        return hyperThread;
    }


    /**
     * Sets the hyperThread value for this HostConfigInfo.
     * 
     * @param hyperThread
     */
    public void setHyperThread(com.vmware.converter.HostHyperThreadScheduleInfo hyperThread) {
        this.hyperThread = hyperThread;
    }


    /**
     * Gets the consoleReservation value for this HostConfigInfo.
     * 
     * @return consoleReservation
     */
    public com.vmware.converter.ServiceConsoleReservationInfo getConsoleReservation() {
        return consoleReservation;
    }


    /**
     * Sets the consoleReservation value for this HostConfigInfo.
     * 
     * @param consoleReservation
     */
    public void setConsoleReservation(com.vmware.converter.ServiceConsoleReservationInfo consoleReservation) {
        this.consoleReservation = consoleReservation;
    }


    /**
     * Gets the virtualMachineReservation value for this HostConfigInfo.
     * 
     * @return virtualMachineReservation
     */
    public com.vmware.converter.VirtualMachineMemoryReservationInfo getVirtualMachineReservation() {
        return virtualMachineReservation;
    }


    /**
     * Sets the virtualMachineReservation value for this HostConfigInfo.
     * 
     * @param virtualMachineReservation
     */
    public void setVirtualMachineReservation(com.vmware.converter.VirtualMachineMemoryReservationInfo virtualMachineReservation) {
        this.virtualMachineReservation = virtualMachineReservation;
    }


    /**
     * Gets the storageDevice value for this HostConfigInfo.
     * 
     * @return storageDevice
     */
    public com.vmware.converter.HostStorageDeviceInfo getStorageDevice() {
        return storageDevice;
    }


    /**
     * Sets the storageDevice value for this HostConfigInfo.
     * 
     * @param storageDevice
     */
    public void setStorageDevice(com.vmware.converter.HostStorageDeviceInfo storageDevice) {
        this.storageDevice = storageDevice;
    }


    /**
     * Gets the multipathState value for this HostConfigInfo.
     * 
     * @return multipathState
     */
    public com.vmware.converter.HostMultipathStateInfo getMultipathState() {
        return multipathState;
    }


    /**
     * Sets the multipathState value for this HostConfigInfo.
     * 
     * @param multipathState
     */
    public void setMultipathState(com.vmware.converter.HostMultipathStateInfo multipathState) {
        this.multipathState = multipathState;
    }


    /**
     * Gets the fileSystemVolume value for this HostConfigInfo.
     * 
     * @return fileSystemVolume
     */
    public com.vmware.converter.HostFileSystemVolumeInfo getFileSystemVolume() {
        return fileSystemVolume;
    }


    /**
     * Sets the fileSystemVolume value for this HostConfigInfo.
     * 
     * @param fileSystemVolume
     */
    public void setFileSystemVolume(com.vmware.converter.HostFileSystemVolumeInfo fileSystemVolume) {
        this.fileSystemVolume = fileSystemVolume;
    }


    /**
     * Gets the systemFile value for this HostConfigInfo.
     * 
     * @return systemFile
     */
    public java.lang.String[] getSystemFile() {
        return systemFile;
    }


    /**
     * Sets the systemFile value for this HostConfigInfo.
     * 
     * @param systemFile
     */
    public void setSystemFile(java.lang.String[] systemFile) {
        this.systemFile = systemFile;
    }

    public java.lang.String getSystemFile(int i) {
        return this.systemFile[i];
    }

    public void setSystemFile(int i, java.lang.String _value) {
        this.systemFile[i] = _value;
    }


    /**
     * Gets the network value for this HostConfigInfo.
     * 
     * @return network
     */
    public com.vmware.converter.HostNetworkInfo getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this HostConfigInfo.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.HostNetworkInfo network) {
        this.network = network;
    }


    /**
     * Gets the vmotion value for this HostConfigInfo.
     * 
     * @return vmotion
     */
    public com.vmware.converter.HostVMotionInfo getVmotion() {
        return vmotion;
    }


    /**
     * Sets the vmotion value for this HostConfigInfo.
     * 
     * @param vmotion
     */
    public void setVmotion(com.vmware.converter.HostVMotionInfo vmotion) {
        this.vmotion = vmotion;
    }


    /**
     * Gets the virtualNicManagerInfo value for this HostConfigInfo.
     * 
     * @return virtualNicManagerInfo
     */
    public com.vmware.converter.HostVirtualNicManagerInfo getVirtualNicManagerInfo() {
        return virtualNicManagerInfo;
    }


    /**
     * Sets the virtualNicManagerInfo value for this HostConfigInfo.
     * 
     * @param virtualNicManagerInfo
     */
    public void setVirtualNicManagerInfo(com.vmware.converter.HostVirtualNicManagerInfo virtualNicManagerInfo) {
        this.virtualNicManagerInfo = virtualNicManagerInfo;
    }


    /**
     * Gets the capabilities value for this HostConfigInfo.
     * 
     * @return capabilities
     */
    public com.vmware.converter.HostNetCapabilities getCapabilities() {
        return capabilities;
    }


    /**
     * Sets the capabilities value for this HostConfigInfo.
     * 
     * @param capabilities
     */
    public void setCapabilities(com.vmware.converter.HostNetCapabilities capabilities) {
        this.capabilities = capabilities;
    }


    /**
     * Gets the datastoreCapabilities value for this HostConfigInfo.
     * 
     * @return datastoreCapabilities
     */
    public com.vmware.converter.HostDatastoreSystemCapabilities getDatastoreCapabilities() {
        return datastoreCapabilities;
    }


    /**
     * Sets the datastoreCapabilities value for this HostConfigInfo.
     * 
     * @param datastoreCapabilities
     */
    public void setDatastoreCapabilities(com.vmware.converter.HostDatastoreSystemCapabilities datastoreCapabilities) {
        this.datastoreCapabilities = datastoreCapabilities;
    }


    /**
     * Gets the offloadCapabilities value for this HostConfigInfo.
     * 
     * @return offloadCapabilities
     */
    public com.vmware.converter.HostNetOffloadCapabilities getOffloadCapabilities() {
        return offloadCapabilities;
    }


    /**
     * Sets the offloadCapabilities value for this HostConfigInfo.
     * 
     * @param offloadCapabilities
     */
    public void setOffloadCapabilities(com.vmware.converter.HostNetOffloadCapabilities offloadCapabilities) {
        this.offloadCapabilities = offloadCapabilities;
    }


    /**
     * Gets the service value for this HostConfigInfo.
     * 
     * @return service
     */
    public com.vmware.converter.HostServiceInfo getService() {
        return service;
    }


    /**
     * Sets the service value for this HostConfigInfo.
     * 
     * @param service
     */
    public void setService(com.vmware.converter.HostServiceInfo service) {
        this.service = service;
    }


    /**
     * Gets the firewall value for this HostConfigInfo.
     * 
     * @return firewall
     */
    public com.vmware.converter.HostFirewallInfo getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this HostConfigInfo.
     * 
     * @param firewall
     */
    public void setFirewall(com.vmware.converter.HostFirewallInfo firewall) {
        this.firewall = firewall;
    }


    /**
     * Gets the autoStart value for this HostConfigInfo.
     * 
     * @return autoStart
     */
    public com.vmware.converter.HostAutoStartManagerConfig getAutoStart() {
        return autoStart;
    }


    /**
     * Sets the autoStart value for this HostConfigInfo.
     * 
     * @param autoStart
     */
    public void setAutoStart(com.vmware.converter.HostAutoStartManagerConfig autoStart) {
        this.autoStart = autoStart;
    }


    /**
     * Gets the activeDiagnosticPartition value for this HostConfigInfo.
     * 
     * @return activeDiagnosticPartition
     */
    public com.vmware.converter.HostDiagnosticPartition getActiveDiagnosticPartition() {
        return activeDiagnosticPartition;
    }


    /**
     * Sets the activeDiagnosticPartition value for this HostConfigInfo.
     * 
     * @param activeDiagnosticPartition
     */
    public void setActiveDiagnosticPartition(com.vmware.converter.HostDiagnosticPartition activeDiagnosticPartition) {
        this.activeDiagnosticPartition = activeDiagnosticPartition;
    }


    /**
     * Gets the option value for this HostConfigInfo.
     * 
     * @return option
     */
    public com.vmware.converter.OptionValue[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this HostConfigInfo.
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
     * Gets the optionDef value for this HostConfigInfo.
     * 
     * @return optionDef
     */
    public com.vmware.converter.OptionDef[] getOptionDef() {
        return optionDef;
    }


    /**
     * Sets the optionDef value for this HostConfigInfo.
     * 
     * @param optionDef
     */
    public void setOptionDef(com.vmware.converter.OptionDef[] optionDef) {
        this.optionDef = optionDef;
    }

    public com.vmware.converter.OptionDef getOptionDef(int i) {
        return this.optionDef[i];
    }

    public void setOptionDef(int i, com.vmware.converter.OptionDef _value) {
        this.optionDef[i] = _value;
    }


    /**
     * Gets the datastorePrincipal value for this HostConfigInfo.
     * 
     * @return datastorePrincipal
     */
    public java.lang.String getDatastorePrincipal() {
        return datastorePrincipal;
    }


    /**
     * Sets the datastorePrincipal value for this HostConfigInfo.
     * 
     * @param datastorePrincipal
     */
    public void setDatastorePrincipal(java.lang.String datastorePrincipal) {
        this.datastorePrincipal = datastorePrincipal;
    }


    /**
     * Gets the localSwapDatastore value for this HostConfigInfo.
     * 
     * @return localSwapDatastore
     */
    public com.vmware.converter.ManagedObjectReference getLocalSwapDatastore() {
        return localSwapDatastore;
    }


    /**
     * Sets the localSwapDatastore value for this HostConfigInfo.
     * 
     * @param localSwapDatastore
     */
    public void setLocalSwapDatastore(com.vmware.converter.ManagedObjectReference localSwapDatastore) {
        this.localSwapDatastore = localSwapDatastore;
    }


    /**
     * Gets the systemSwapConfiguration value for this HostConfigInfo.
     * 
     * @return systemSwapConfiguration
     */
    public com.vmware.converter.HostSystemSwapConfiguration getSystemSwapConfiguration() {
        return systemSwapConfiguration;
    }


    /**
     * Sets the systemSwapConfiguration value for this HostConfigInfo.
     * 
     * @param systemSwapConfiguration
     */
    public void setSystemSwapConfiguration(com.vmware.converter.HostSystemSwapConfiguration systemSwapConfiguration) {
        this.systemSwapConfiguration = systemSwapConfiguration;
    }


    /**
     * Gets the systemResources value for this HostConfigInfo.
     * 
     * @return systemResources
     */
    public com.vmware.converter.HostSystemResourceInfo getSystemResources() {
        return systemResources;
    }


    /**
     * Sets the systemResources value for this HostConfigInfo.
     * 
     * @param systemResources
     */
    public void setSystemResources(com.vmware.converter.HostSystemResourceInfo systemResources) {
        this.systemResources = systemResources;
    }


    /**
     * Gets the dateTimeInfo value for this HostConfigInfo.
     * 
     * @return dateTimeInfo
     */
    public com.vmware.converter.HostDateTimeInfo getDateTimeInfo() {
        return dateTimeInfo;
    }


    /**
     * Sets the dateTimeInfo value for this HostConfigInfo.
     * 
     * @param dateTimeInfo
     */
    public void setDateTimeInfo(com.vmware.converter.HostDateTimeInfo dateTimeInfo) {
        this.dateTimeInfo = dateTimeInfo;
    }


    /**
     * Gets the flags value for this HostConfigInfo.
     * 
     * @return flags
     */
    public com.vmware.converter.HostFlagInfo getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this HostConfigInfo.
     * 
     * @param flags
     */
    public void setFlags(com.vmware.converter.HostFlagInfo flags) {
        this.flags = flags;
    }


    /**
     * Gets the adminDisabled value for this HostConfigInfo.
     * 
     * @return adminDisabled
     */
    public java.lang.Boolean getAdminDisabled() {
        return adminDisabled;
    }


    /**
     * Sets the adminDisabled value for this HostConfigInfo.
     * 
     * @param adminDisabled
     */
    public void setAdminDisabled(java.lang.Boolean adminDisabled) {
        this.adminDisabled = adminDisabled;
    }


    /**
     * Gets the lockdownMode value for this HostConfigInfo.
     * 
     * @return lockdownMode
     */
    public com.vmware.converter.HostLockdownMode getLockdownMode() {
        return lockdownMode;
    }


    /**
     * Sets the lockdownMode value for this HostConfigInfo.
     * 
     * @param lockdownMode
     */
    public void setLockdownMode(com.vmware.converter.HostLockdownMode lockdownMode) {
        this.lockdownMode = lockdownMode;
    }


    /**
     * Gets the ipmi value for this HostConfigInfo.
     * 
     * @return ipmi
     */
    public com.vmware.converter.HostIpmiInfo getIpmi() {
        return ipmi;
    }


    /**
     * Sets the ipmi value for this HostConfigInfo.
     * 
     * @param ipmi
     */
    public void setIpmi(com.vmware.converter.HostIpmiInfo ipmi) {
        this.ipmi = ipmi;
    }


    /**
     * Gets the sslThumbprintInfo value for this HostConfigInfo.
     * 
     * @return sslThumbprintInfo
     */
    public com.vmware.converter.HostSslThumbprintInfo getSslThumbprintInfo() {
        return sslThumbprintInfo;
    }


    /**
     * Sets the sslThumbprintInfo value for this HostConfigInfo.
     * 
     * @param sslThumbprintInfo
     */
    public void setSslThumbprintInfo(com.vmware.converter.HostSslThumbprintInfo sslThumbprintInfo) {
        this.sslThumbprintInfo = sslThumbprintInfo;
    }


    /**
     * Gets the sslThumbprintData value for this HostConfigInfo.
     * 
     * @return sslThumbprintData
     */
    public com.vmware.converter.HostSslThumbprintInfo[] getSslThumbprintData() {
        return sslThumbprintData;
    }


    /**
     * Sets the sslThumbprintData value for this HostConfigInfo.
     * 
     * @param sslThumbprintData
     */
    public void setSslThumbprintData(com.vmware.converter.HostSslThumbprintInfo[] sslThumbprintData) {
        this.sslThumbprintData = sslThumbprintData;
    }

    public com.vmware.converter.HostSslThumbprintInfo getSslThumbprintData(int i) {
        return this.sslThumbprintData[i];
    }

    public void setSslThumbprintData(int i, com.vmware.converter.HostSslThumbprintInfo _value) {
        this.sslThumbprintData[i] = _value;
    }


    /**
     * Gets the certificate value for this HostConfigInfo.
     * 
     * @return certificate
     */
    public byte[] getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this HostConfigInfo.
     * 
     * @param certificate
     */
    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    public byte getCertificate(int i) {
        return this.certificate[i];
    }

    public void setCertificate(int i, byte _value) {
        this.certificate[i] = _value;
    }


    /**
     * Gets the pciPassthruInfo value for this HostConfigInfo.
     * 
     * @return pciPassthruInfo
     */
    public com.vmware.converter.HostPciPassthruInfo[] getPciPassthruInfo() {
        return pciPassthruInfo;
    }


    /**
     * Sets the pciPassthruInfo value for this HostConfigInfo.
     * 
     * @param pciPassthruInfo
     */
    public void setPciPassthruInfo(com.vmware.converter.HostPciPassthruInfo[] pciPassthruInfo) {
        this.pciPassthruInfo = pciPassthruInfo;
    }

    public com.vmware.converter.HostPciPassthruInfo getPciPassthruInfo(int i) {
        return this.pciPassthruInfo[i];
    }

    public void setPciPassthruInfo(int i, com.vmware.converter.HostPciPassthruInfo _value) {
        this.pciPassthruInfo[i] = _value;
    }


    /**
     * Gets the authenticationManagerInfo value for this HostConfigInfo.
     * 
     * @return authenticationManagerInfo
     */
    public com.vmware.converter.HostAuthenticationManagerInfo getAuthenticationManagerInfo() {
        return authenticationManagerInfo;
    }


    /**
     * Sets the authenticationManagerInfo value for this HostConfigInfo.
     * 
     * @param authenticationManagerInfo
     */
    public void setAuthenticationManagerInfo(com.vmware.converter.HostAuthenticationManagerInfo authenticationManagerInfo) {
        this.authenticationManagerInfo = authenticationManagerInfo;
    }


    /**
     * Gets the featureVersion value for this HostConfigInfo.
     * 
     * @return featureVersion
     */
    public com.vmware.converter.HostFeatureVersionInfo[] getFeatureVersion() {
        return featureVersion;
    }


    /**
     * Sets the featureVersion value for this HostConfigInfo.
     * 
     * @param featureVersion
     */
    public void setFeatureVersion(com.vmware.converter.HostFeatureVersionInfo[] featureVersion) {
        this.featureVersion = featureVersion;
    }

    public com.vmware.converter.HostFeatureVersionInfo getFeatureVersion(int i) {
        return this.featureVersion[i];
    }

    public void setFeatureVersion(int i, com.vmware.converter.HostFeatureVersionInfo _value) {
        this.featureVersion[i] = _value;
    }


    /**
     * Gets the powerSystemCapability value for this HostConfigInfo.
     * 
     * @return powerSystemCapability
     */
    public com.vmware.converter.PowerSystemCapability getPowerSystemCapability() {
        return powerSystemCapability;
    }


    /**
     * Sets the powerSystemCapability value for this HostConfigInfo.
     * 
     * @param powerSystemCapability
     */
    public void setPowerSystemCapability(com.vmware.converter.PowerSystemCapability powerSystemCapability) {
        this.powerSystemCapability = powerSystemCapability;
    }


    /**
     * Gets the powerSystemInfo value for this HostConfigInfo.
     * 
     * @return powerSystemInfo
     */
    public com.vmware.converter.PowerSystemInfo getPowerSystemInfo() {
        return powerSystemInfo;
    }


    /**
     * Sets the powerSystemInfo value for this HostConfigInfo.
     * 
     * @param powerSystemInfo
     */
    public void setPowerSystemInfo(com.vmware.converter.PowerSystemInfo powerSystemInfo) {
        this.powerSystemInfo = powerSystemInfo;
    }


    /**
     * Gets the cacheConfigurationInfo value for this HostConfigInfo.
     * 
     * @return cacheConfigurationInfo
     */
    public com.vmware.converter.HostCacheConfigurationInfo[] getCacheConfigurationInfo() {
        return cacheConfigurationInfo;
    }


    /**
     * Sets the cacheConfigurationInfo value for this HostConfigInfo.
     * 
     * @param cacheConfigurationInfo
     */
    public void setCacheConfigurationInfo(com.vmware.converter.HostCacheConfigurationInfo[] cacheConfigurationInfo) {
        this.cacheConfigurationInfo = cacheConfigurationInfo;
    }

    public com.vmware.converter.HostCacheConfigurationInfo getCacheConfigurationInfo(int i) {
        return this.cacheConfigurationInfo[i];
    }

    public void setCacheConfigurationInfo(int i, com.vmware.converter.HostCacheConfigurationInfo _value) {
        this.cacheConfigurationInfo[i] = _value;
    }


    /**
     * Gets the wakeOnLanCapable value for this HostConfigInfo.
     * 
     * @return wakeOnLanCapable
     */
    public java.lang.Boolean getWakeOnLanCapable() {
        return wakeOnLanCapable;
    }


    /**
     * Sets the wakeOnLanCapable value for this HostConfigInfo.
     * 
     * @param wakeOnLanCapable
     */
    public void setWakeOnLanCapable(java.lang.Boolean wakeOnLanCapable) {
        this.wakeOnLanCapable = wakeOnLanCapable;
    }


    /**
     * Gets the featureCapability value for this HostConfigInfo.
     * 
     * @return featureCapability
     */
    public com.vmware.converter.HostFeatureCapability[] getFeatureCapability() {
        return featureCapability;
    }


    /**
     * Sets the featureCapability value for this HostConfigInfo.
     * 
     * @param featureCapability
     */
    public void setFeatureCapability(com.vmware.converter.HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
    }

    public com.vmware.converter.HostFeatureCapability getFeatureCapability(int i) {
        return this.featureCapability[i];
    }

    public void setFeatureCapability(int i, com.vmware.converter.HostFeatureCapability _value) {
        this.featureCapability[i] = _value;
    }


    /**
     * Gets the maskedFeatureCapability value for this HostConfigInfo.
     * 
     * @return maskedFeatureCapability
     */
    public com.vmware.converter.HostFeatureCapability[] getMaskedFeatureCapability() {
        return maskedFeatureCapability;
    }


    /**
     * Sets the maskedFeatureCapability value for this HostConfigInfo.
     * 
     * @param maskedFeatureCapability
     */
    public void setMaskedFeatureCapability(com.vmware.converter.HostFeatureCapability[] maskedFeatureCapability) {
        this.maskedFeatureCapability = maskedFeatureCapability;
    }

    public com.vmware.converter.HostFeatureCapability getMaskedFeatureCapability(int i) {
        return this.maskedFeatureCapability[i];
    }

    public void setMaskedFeatureCapability(int i, com.vmware.converter.HostFeatureCapability _value) {
        this.maskedFeatureCapability[i] = _value;
    }


    /**
     * Gets the vFlashConfigInfo value for this HostConfigInfo.
     * 
     * @return vFlashConfigInfo
     */
    public com.vmware.converter.HostVFlashManagerVFlashConfigInfo getVFlashConfigInfo() {
        return vFlashConfigInfo;
    }


    /**
     * Sets the vFlashConfigInfo value for this HostConfigInfo.
     * 
     * @param vFlashConfigInfo
     */
    public void setVFlashConfigInfo(com.vmware.converter.HostVFlashManagerVFlashConfigInfo vFlashConfigInfo) {
        this.vFlashConfigInfo = vFlashConfigInfo;
    }


    /**
     * Gets the vsanHostConfig value for this HostConfigInfo.
     * 
     * @return vsanHostConfig
     */
    public com.vmware.converter.VsanHostConfigInfo getVsanHostConfig() {
        return vsanHostConfig;
    }


    /**
     * Sets the vsanHostConfig value for this HostConfigInfo.
     * 
     * @param vsanHostConfig
     */
    public void setVsanHostConfig(com.vmware.converter.VsanHostConfigInfo vsanHostConfig) {
        this.vsanHostConfig = vsanHostConfig;
    }


    /**
     * Gets the domainList value for this HostConfigInfo.
     * 
     * @return domainList
     */
    public java.lang.String[] getDomainList() {
        return domainList;
    }


    /**
     * Sets the domainList value for this HostConfigInfo.
     * 
     * @param domainList
     */
    public void setDomainList(java.lang.String[] domainList) {
        this.domainList = domainList;
    }

    public java.lang.String getDomainList(int i) {
        return this.domainList[i];
    }

    public void setDomainList(int i, java.lang.String _value) {
        this.domainList[i] = _value;
    }


    /**
     * Gets the scriptCheckSum value for this HostConfigInfo.
     * 
     * @return scriptCheckSum
     */
    public byte[] getScriptCheckSum() {
        return scriptCheckSum;
    }


    /**
     * Sets the scriptCheckSum value for this HostConfigInfo.
     * 
     * @param scriptCheckSum
     */
    public void setScriptCheckSum(byte[] scriptCheckSum) {
        this.scriptCheckSum = scriptCheckSum;
    }


    /**
     * Gets the hostConfigCheckSum value for this HostConfigInfo.
     * 
     * @return hostConfigCheckSum
     */
    public byte[] getHostConfigCheckSum() {
        return hostConfigCheckSum;
    }


    /**
     * Sets the hostConfigCheckSum value for this HostConfigInfo.
     * 
     * @param hostConfigCheckSum
     */
    public void setHostConfigCheckSum(byte[] hostConfigCheckSum) {
        this.hostConfigCheckSum = hostConfigCheckSum;
    }


    /**
     * Gets the graphicsInfo value for this HostConfigInfo.
     * 
     * @return graphicsInfo
     */
    public com.vmware.converter.HostGraphicsInfo[] getGraphicsInfo() {
        return graphicsInfo;
    }


    /**
     * Sets the graphicsInfo value for this HostConfigInfo.
     * 
     * @param graphicsInfo
     */
    public void setGraphicsInfo(com.vmware.converter.HostGraphicsInfo[] graphicsInfo) {
        this.graphicsInfo = graphicsInfo;
    }

    public com.vmware.converter.HostGraphicsInfo getGraphicsInfo(int i) {
        return this.graphicsInfo[i];
    }

    public void setGraphicsInfo(int i, com.vmware.converter.HostGraphicsInfo _value) {
        this.graphicsInfo[i] = _value;
    }


    /**
     * Gets the sharedPassthruGpuTypes value for this HostConfigInfo.
     * 
     * @return sharedPassthruGpuTypes
     */
    public java.lang.String[] getSharedPassthruGpuTypes() {
        return sharedPassthruGpuTypes;
    }


    /**
     * Sets the sharedPassthruGpuTypes value for this HostConfigInfo.
     * 
     * @param sharedPassthruGpuTypes
     */
    public void setSharedPassthruGpuTypes(java.lang.String[] sharedPassthruGpuTypes) {
        this.sharedPassthruGpuTypes = sharedPassthruGpuTypes;
    }

    public java.lang.String getSharedPassthruGpuTypes(int i) {
        return this.sharedPassthruGpuTypes[i];
    }

    public void setSharedPassthruGpuTypes(int i, java.lang.String _value) {
        this.sharedPassthruGpuTypes[i] = _value;
    }


    /**
     * Gets the ioFilterInfo value for this HostConfigInfo.
     * 
     * @return ioFilterInfo
     */
    public com.vmware.converter.HostIoFilterInfo[] getIoFilterInfo() {
        return ioFilterInfo;
    }


    /**
     * Sets the ioFilterInfo value for this HostConfigInfo.
     * 
     * @param ioFilterInfo
     */
    public void setIoFilterInfo(com.vmware.converter.HostIoFilterInfo[] ioFilterInfo) {
        this.ioFilterInfo = ioFilterInfo;
    }

    public com.vmware.converter.HostIoFilterInfo getIoFilterInfo(int i) {
        return this.ioFilterInfo[i];
    }

    public void setIoFilterInfo(int i, com.vmware.converter.HostIoFilterInfo _value) {
        this.ioFilterInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConfigInfo)) return false;
        HostConfigInfo other = (HostConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.hyperThread==null && other.getHyperThread()==null) || 
             (this.hyperThread!=null &&
              this.hyperThread.equals(other.getHyperThread()))) &&
            ((this.consoleReservation==null && other.getConsoleReservation()==null) || 
             (this.consoleReservation!=null &&
              this.consoleReservation.equals(other.getConsoleReservation()))) &&
            ((this.virtualMachineReservation==null && other.getVirtualMachineReservation()==null) || 
             (this.virtualMachineReservation!=null &&
              this.virtualMachineReservation.equals(other.getVirtualMachineReservation()))) &&
            ((this.storageDevice==null && other.getStorageDevice()==null) || 
             (this.storageDevice!=null &&
              this.storageDevice.equals(other.getStorageDevice()))) &&
            ((this.multipathState==null && other.getMultipathState()==null) || 
             (this.multipathState!=null &&
              this.multipathState.equals(other.getMultipathState()))) &&
            ((this.fileSystemVolume==null && other.getFileSystemVolume()==null) || 
             (this.fileSystemVolume!=null &&
              this.fileSystemVolume.equals(other.getFileSystemVolume()))) &&
            ((this.systemFile==null && other.getSystemFile()==null) || 
             (this.systemFile!=null &&
              java.util.Arrays.equals(this.systemFile, other.getSystemFile()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.vmotion==null && other.getVmotion()==null) || 
             (this.vmotion!=null &&
              this.vmotion.equals(other.getVmotion()))) &&
            ((this.virtualNicManagerInfo==null && other.getVirtualNicManagerInfo()==null) || 
             (this.virtualNicManagerInfo!=null &&
              this.virtualNicManagerInfo.equals(other.getVirtualNicManagerInfo()))) &&
            ((this.capabilities==null && other.getCapabilities()==null) || 
             (this.capabilities!=null &&
              this.capabilities.equals(other.getCapabilities()))) &&
            ((this.datastoreCapabilities==null && other.getDatastoreCapabilities()==null) || 
             (this.datastoreCapabilities!=null &&
              this.datastoreCapabilities.equals(other.getDatastoreCapabilities()))) &&
            ((this.offloadCapabilities==null && other.getOffloadCapabilities()==null) || 
             (this.offloadCapabilities!=null &&
              this.offloadCapabilities.equals(other.getOffloadCapabilities()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.firewall==null && other.getFirewall()==null) || 
             (this.firewall!=null &&
              this.firewall.equals(other.getFirewall()))) &&
            ((this.autoStart==null && other.getAutoStart()==null) || 
             (this.autoStart!=null &&
              this.autoStart.equals(other.getAutoStart()))) &&
            ((this.activeDiagnosticPartition==null && other.getActiveDiagnosticPartition()==null) || 
             (this.activeDiagnosticPartition!=null &&
              this.activeDiagnosticPartition.equals(other.getActiveDiagnosticPartition()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
            ((this.optionDef==null && other.getOptionDef()==null) || 
             (this.optionDef!=null &&
              java.util.Arrays.equals(this.optionDef, other.getOptionDef()))) &&
            ((this.datastorePrincipal==null && other.getDatastorePrincipal()==null) || 
             (this.datastorePrincipal!=null &&
              this.datastorePrincipal.equals(other.getDatastorePrincipal()))) &&
            ((this.localSwapDatastore==null && other.getLocalSwapDatastore()==null) || 
             (this.localSwapDatastore!=null &&
              this.localSwapDatastore.equals(other.getLocalSwapDatastore()))) &&
            ((this.systemSwapConfiguration==null && other.getSystemSwapConfiguration()==null) || 
             (this.systemSwapConfiguration!=null &&
              this.systemSwapConfiguration.equals(other.getSystemSwapConfiguration()))) &&
            ((this.systemResources==null && other.getSystemResources()==null) || 
             (this.systemResources!=null &&
              this.systemResources.equals(other.getSystemResources()))) &&
            ((this.dateTimeInfo==null && other.getDateTimeInfo()==null) || 
             (this.dateTimeInfo!=null &&
              this.dateTimeInfo.equals(other.getDateTimeInfo()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.adminDisabled==null && other.getAdminDisabled()==null) || 
             (this.adminDisabled!=null &&
              this.adminDisabled.equals(other.getAdminDisabled()))) &&
            ((this.lockdownMode==null && other.getLockdownMode()==null) || 
             (this.lockdownMode!=null &&
              this.lockdownMode.equals(other.getLockdownMode()))) &&
            ((this.ipmi==null && other.getIpmi()==null) || 
             (this.ipmi!=null &&
              this.ipmi.equals(other.getIpmi()))) &&
            ((this.sslThumbprintInfo==null && other.getSslThumbprintInfo()==null) || 
             (this.sslThumbprintInfo!=null &&
              this.sslThumbprintInfo.equals(other.getSslThumbprintInfo()))) &&
            ((this.sslThumbprintData==null && other.getSslThumbprintData()==null) || 
             (this.sslThumbprintData!=null &&
              java.util.Arrays.equals(this.sslThumbprintData, other.getSslThumbprintData()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              java.util.Arrays.equals(this.certificate, other.getCertificate()))) &&
            ((this.pciPassthruInfo==null && other.getPciPassthruInfo()==null) || 
             (this.pciPassthruInfo!=null &&
              java.util.Arrays.equals(this.pciPassthruInfo, other.getPciPassthruInfo()))) &&
            ((this.authenticationManagerInfo==null && other.getAuthenticationManagerInfo()==null) || 
             (this.authenticationManagerInfo!=null &&
              this.authenticationManagerInfo.equals(other.getAuthenticationManagerInfo()))) &&
            ((this.featureVersion==null && other.getFeatureVersion()==null) || 
             (this.featureVersion!=null &&
              java.util.Arrays.equals(this.featureVersion, other.getFeatureVersion()))) &&
            ((this.powerSystemCapability==null && other.getPowerSystemCapability()==null) || 
             (this.powerSystemCapability!=null &&
              this.powerSystemCapability.equals(other.getPowerSystemCapability()))) &&
            ((this.powerSystemInfo==null && other.getPowerSystemInfo()==null) || 
             (this.powerSystemInfo!=null &&
              this.powerSystemInfo.equals(other.getPowerSystemInfo()))) &&
            ((this.cacheConfigurationInfo==null && other.getCacheConfigurationInfo()==null) || 
             (this.cacheConfigurationInfo!=null &&
              java.util.Arrays.equals(this.cacheConfigurationInfo, other.getCacheConfigurationInfo()))) &&
            ((this.wakeOnLanCapable==null && other.getWakeOnLanCapable()==null) || 
             (this.wakeOnLanCapable!=null &&
              this.wakeOnLanCapable.equals(other.getWakeOnLanCapable()))) &&
            ((this.featureCapability==null && other.getFeatureCapability()==null) || 
             (this.featureCapability!=null &&
              java.util.Arrays.equals(this.featureCapability, other.getFeatureCapability()))) &&
            ((this.maskedFeatureCapability==null && other.getMaskedFeatureCapability()==null) || 
             (this.maskedFeatureCapability!=null &&
              java.util.Arrays.equals(this.maskedFeatureCapability, other.getMaskedFeatureCapability()))) &&
            ((this.vFlashConfigInfo==null && other.getVFlashConfigInfo()==null) || 
             (this.vFlashConfigInfo!=null &&
              this.vFlashConfigInfo.equals(other.getVFlashConfigInfo()))) &&
            ((this.vsanHostConfig==null && other.getVsanHostConfig()==null) || 
             (this.vsanHostConfig!=null &&
              this.vsanHostConfig.equals(other.getVsanHostConfig()))) &&
            ((this.domainList==null && other.getDomainList()==null) || 
             (this.domainList!=null &&
              java.util.Arrays.equals(this.domainList, other.getDomainList()))) &&
            ((this.scriptCheckSum==null && other.getScriptCheckSum()==null) || 
             (this.scriptCheckSum!=null &&
              java.util.Arrays.equals(this.scriptCheckSum, other.getScriptCheckSum()))) &&
            ((this.hostConfigCheckSum==null && other.getHostConfigCheckSum()==null) || 
             (this.hostConfigCheckSum!=null &&
              java.util.Arrays.equals(this.hostConfigCheckSum, other.getHostConfigCheckSum()))) &&
            ((this.graphicsInfo==null && other.getGraphicsInfo()==null) || 
             (this.graphicsInfo!=null &&
              java.util.Arrays.equals(this.graphicsInfo, other.getGraphicsInfo()))) &&
            ((this.sharedPassthruGpuTypes==null && other.getSharedPassthruGpuTypes()==null) || 
             (this.sharedPassthruGpuTypes!=null &&
              java.util.Arrays.equals(this.sharedPassthruGpuTypes, other.getSharedPassthruGpuTypes()))) &&
            ((this.ioFilterInfo==null && other.getIoFilterInfo()==null) || 
             (this.ioFilterInfo!=null &&
              java.util.Arrays.equals(this.ioFilterInfo, other.getIoFilterInfo())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getHyperThread() != null) {
            _hashCode += getHyperThread().hashCode();
        }
        if (getConsoleReservation() != null) {
            _hashCode += getConsoleReservation().hashCode();
        }
        if (getVirtualMachineReservation() != null) {
            _hashCode += getVirtualMachineReservation().hashCode();
        }
        if (getStorageDevice() != null) {
            _hashCode += getStorageDevice().hashCode();
        }
        if (getMultipathState() != null) {
            _hashCode += getMultipathState().hashCode();
        }
        if (getFileSystemVolume() != null) {
            _hashCode += getFileSystemVolume().hashCode();
        }
        if (getSystemFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSystemFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSystemFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getVmotion() != null) {
            _hashCode += getVmotion().hashCode();
        }
        if (getVirtualNicManagerInfo() != null) {
            _hashCode += getVirtualNicManagerInfo().hashCode();
        }
        if (getCapabilities() != null) {
            _hashCode += getCapabilities().hashCode();
        }
        if (getDatastoreCapabilities() != null) {
            _hashCode += getDatastoreCapabilities().hashCode();
        }
        if (getOffloadCapabilities() != null) {
            _hashCode += getOffloadCapabilities().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getFirewall() != null) {
            _hashCode += getFirewall().hashCode();
        }
        if (getAutoStart() != null) {
            _hashCode += getAutoStart().hashCode();
        }
        if (getActiveDiagnosticPartition() != null) {
            _hashCode += getActiveDiagnosticPartition().hashCode();
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
        if (getOptionDef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionDef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionDef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastorePrincipal() != null) {
            _hashCode += getDatastorePrincipal().hashCode();
        }
        if (getLocalSwapDatastore() != null) {
            _hashCode += getLocalSwapDatastore().hashCode();
        }
        if (getSystemSwapConfiguration() != null) {
            _hashCode += getSystemSwapConfiguration().hashCode();
        }
        if (getSystemResources() != null) {
            _hashCode += getSystemResources().hashCode();
        }
        if (getDateTimeInfo() != null) {
            _hashCode += getDateTimeInfo().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getAdminDisabled() != null) {
            _hashCode += getAdminDisabled().hashCode();
        }
        if (getLockdownMode() != null) {
            _hashCode += getLockdownMode().hashCode();
        }
        if (getIpmi() != null) {
            _hashCode += getIpmi().hashCode();
        }
        if (getSslThumbprintInfo() != null) {
            _hashCode += getSslThumbprintInfo().hashCode();
        }
        if (getSslThumbprintData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslThumbprintData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslThumbprintData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertificate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPciPassthruInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPciPassthruInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPciPassthruInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthenticationManagerInfo() != null) {
            _hashCode += getAuthenticationManagerInfo().hashCode();
        }
        if (getFeatureVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureVersion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPowerSystemCapability() != null) {
            _hashCode += getPowerSystemCapability().hashCode();
        }
        if (getPowerSystemInfo() != null) {
            _hashCode += getPowerSystemInfo().hashCode();
        }
        if (getCacheConfigurationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCacheConfigurationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCacheConfigurationInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWakeOnLanCapable() != null) {
            _hashCode += getWakeOnLanCapable().hashCode();
        }
        if (getFeatureCapability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureCapability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureCapability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaskedFeatureCapability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaskedFeatureCapability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaskedFeatureCapability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVFlashConfigInfo() != null) {
            _hashCode += getVFlashConfigInfo().hashCode();
        }
        if (getVsanHostConfig() != null) {
            _hashCode += getVsanHostConfig().hashCode();
        }
        if (getDomainList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScriptCheckSum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScriptCheckSum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScriptCheckSum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHostConfigCheckSum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostConfigCheckSum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostConfigCheckSum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGraphicsInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphicsInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGraphicsInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharedPassthruGpuTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedPassthruGpuTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedPassthruGpuTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIoFilterInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIoFilterInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIoFilterInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AboutInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hyperThread");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hyperThread"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostHyperThreadScheduleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consoleReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceConsoleReservationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMachineReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMemoryReservationInfo"));
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
        elemField.setFieldName("multipathState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multipathState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathStateInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSystemVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileSystemVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemVolumeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVMotionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualNicManagerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualNicManagerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicManagerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetCapabilities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDatastoreSystemCapabilities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offloadCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "offloadCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetOffloadCapabilities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostServiceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "firewall"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAutoStartManagerConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDiagnosticPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeDiagnosticPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiagnosticPartition"));
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
        elemField.setFieldName("optionDef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "optionDef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionDef"));
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
        elemField.setFieldName("localSwapDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localSwapDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemSwapConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemSwapConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemSwapConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemResourceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dateTimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDateTimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFlagInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "adminDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockdownMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lockdownMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLockdownMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipmi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipmi"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpmiInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprintInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprintInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSslThumbprintInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprintData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprintData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSslThumbprintInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciPassthruInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciPassthruInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPciPassthruInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationManagerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "authenticationManagerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAuthenticationManagerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureVersionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerSystemCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerSystemCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PowerSystemCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerSystemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerSystemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PowerSystemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheConfigurationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cacheConfigurationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCacheConfigurationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wakeOnLanCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wakeOnLanCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedFeatureCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maskedFeatureCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanHostConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "domainList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptCheckSum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scriptCheckSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostConfigCheckSum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostConfigCheckSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "graphicsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostGraphicsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedPassthruGpuTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sharedPassthruGpuTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioFilterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioFilterInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIoFilterInfo"));
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
