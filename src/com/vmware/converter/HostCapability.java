/**
 * HostCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean recursiveResourcePoolsSupported;

    private boolean cpuMemoryResourceConfigurationSupported;

    private boolean rebootSupported;

    private boolean shutdownSupported;

    private boolean vmotionSupported;

    private boolean standbySupported;

    private java.lang.Boolean ipmiSupported;

    private java.lang.Integer maxSupportedVMs;

    private java.lang.Integer maxRunningVMs;

    private java.lang.Integer maxSupportedVcpus;

    private java.lang.Integer maxRegisteredVMs;

    private boolean datastorePrincipalSupported;

    private boolean sanSupported;

    private boolean nfsSupported;

    private boolean iscsiSupported;

    private boolean vlanTaggingSupported;

    private boolean nicTeamingSupported;

    private boolean highGuestMemSupported;

    private boolean maintenanceModeSupported;

    private boolean suspendedRelocateSupported;

    private boolean restrictedSnapshotRelocateSupported;

    private boolean perVmSwapFiles;

    private boolean localSwapDatastoreSupported;

    private boolean unsharedSwapVMotionSupported;

    private boolean backgroundSnapshotsSupported;

    private boolean preAssignedPCIUnitNumbersSupported;

    private boolean screenshotSupported;

    private boolean scaledScreenshotSupported;

    private java.lang.Boolean storageVMotionSupported;

    private java.lang.Boolean vmotionWithStorageVMotionSupported;

    private java.lang.Boolean vmotionAcrossNetworkSupported;

    private java.lang.Integer maxNumDisksSVMotion;

    private java.lang.Boolean hbrNicSelectionSupported;

    private java.lang.Boolean vrNfcNicSelectionSupported;

    private java.lang.Boolean recordReplaySupported;

    private java.lang.Boolean ftSupported;

    private java.lang.String replayUnsupportedReason;

    private java.lang.String[] replayCompatibilityIssues;

    private java.lang.Boolean smpFtSupported;

    private java.lang.String[] ftCompatibilityIssues;

    private java.lang.String[] smpFtCompatibilityIssues;

    private java.lang.Integer maxVcpusPerFtVm;

    private java.lang.Boolean loginBySSLThumbprintSupported;

    private java.lang.Boolean cloneFromSnapshotSupported;

    private java.lang.Boolean deltaDiskBackingsSupported;

    private java.lang.Boolean perVMNetworkTrafficShapingSupported;

    private java.lang.Boolean tpmSupported;

    private com.vmware.converter.HostCpuIdInfo[] supportedCpuFeature;

    private java.lang.Boolean virtualExecUsageSupported;

    private java.lang.Boolean storageIORMSupported;

    private java.lang.Boolean vmDirectPathGen2Supported;

    private java.lang.String[] vmDirectPathGen2UnsupportedReason;

    private java.lang.String vmDirectPathGen2UnsupportedReasonExtended;

    private int[] supportedVmfsMajorVersion;

    private java.lang.Boolean vStorageCapable;

    private java.lang.Boolean snapshotRelayoutSupported;

    private java.lang.Boolean firewallIpRulesSupported;

    private java.lang.Boolean servicePackageInfoSupported;

    private java.lang.Integer maxHostRunningVms;

    private java.lang.Integer maxHostSupportedVcpus;

    private java.lang.Boolean vmfsDatastoreMountCapable;

    private java.lang.Boolean eightPlusHostVmfsSharedAccessSupported;

    private java.lang.Boolean nestedHVSupported;

    private java.lang.Boolean vPMCSupported;

    private java.lang.Boolean interVMCommunicationThroughVMCISupported;

    private java.lang.Boolean scheduledHardwareUpgradeSupported;

    private java.lang.Boolean featureCapabilitiesSupported;

    private java.lang.Boolean latencySensitivitySupported;

    private java.lang.Boolean storagePolicySupported;

    private java.lang.Boolean accel3DSupported;

    private java.lang.Boolean reliableMemoryAware;

    private java.lang.Boolean multipleNetworkStackInstanceSupported;

    private java.lang.Boolean messageBusProxySupported;

    private java.lang.Boolean vsanSupported;

    private java.lang.Boolean vFlashSupported;

    private java.lang.Boolean hostAccessManagerSupported;

    private java.lang.Boolean provisioningNicSelectionSupported;

    private java.lang.Boolean nfs41Supported;

    private java.lang.Boolean turnDiskLocatorLedSupported;

    private java.lang.Boolean virtualVolumeDatastoreSupported;

    private java.lang.Boolean markAsSsdSupported;

    private java.lang.Boolean markAsLocalSupported;

    private java.lang.Boolean smartCardAuthenticationSupported;

    public HostCapability() {
    }

    public HostCapability(
           boolean recursiveResourcePoolsSupported,
           boolean cpuMemoryResourceConfigurationSupported,
           boolean rebootSupported,
           boolean shutdownSupported,
           boolean vmotionSupported,
           boolean standbySupported,
           java.lang.Boolean ipmiSupported,
           java.lang.Integer maxSupportedVMs,
           java.lang.Integer maxRunningVMs,
           java.lang.Integer maxSupportedVcpus,
           java.lang.Integer maxRegisteredVMs,
           boolean datastorePrincipalSupported,
           boolean sanSupported,
           boolean nfsSupported,
           boolean iscsiSupported,
           boolean vlanTaggingSupported,
           boolean nicTeamingSupported,
           boolean highGuestMemSupported,
           boolean maintenanceModeSupported,
           boolean suspendedRelocateSupported,
           boolean restrictedSnapshotRelocateSupported,
           boolean perVmSwapFiles,
           boolean localSwapDatastoreSupported,
           boolean unsharedSwapVMotionSupported,
           boolean backgroundSnapshotsSupported,
           boolean preAssignedPCIUnitNumbersSupported,
           boolean screenshotSupported,
           boolean scaledScreenshotSupported,
           java.lang.Boolean storageVMotionSupported,
           java.lang.Boolean vmotionWithStorageVMotionSupported,
           java.lang.Boolean vmotionAcrossNetworkSupported,
           java.lang.Integer maxNumDisksSVMotion,
           java.lang.Boolean hbrNicSelectionSupported,
           java.lang.Boolean vrNfcNicSelectionSupported,
           java.lang.Boolean recordReplaySupported,
           java.lang.Boolean ftSupported,
           java.lang.String replayUnsupportedReason,
           java.lang.String[] replayCompatibilityIssues,
           java.lang.Boolean smpFtSupported,
           java.lang.String[] ftCompatibilityIssues,
           java.lang.String[] smpFtCompatibilityIssues,
           java.lang.Integer maxVcpusPerFtVm,
           java.lang.Boolean loginBySSLThumbprintSupported,
           java.lang.Boolean cloneFromSnapshotSupported,
           java.lang.Boolean deltaDiskBackingsSupported,
           java.lang.Boolean perVMNetworkTrafficShapingSupported,
           java.lang.Boolean tpmSupported,
           com.vmware.converter.HostCpuIdInfo[] supportedCpuFeature,
           java.lang.Boolean virtualExecUsageSupported,
           java.lang.Boolean storageIORMSupported,
           java.lang.Boolean vmDirectPathGen2Supported,
           java.lang.String[] vmDirectPathGen2UnsupportedReason,
           java.lang.String vmDirectPathGen2UnsupportedReasonExtended,
           int[] supportedVmfsMajorVersion,
           java.lang.Boolean vStorageCapable,
           java.lang.Boolean snapshotRelayoutSupported,
           java.lang.Boolean firewallIpRulesSupported,
           java.lang.Boolean servicePackageInfoSupported,
           java.lang.Integer maxHostRunningVms,
           java.lang.Integer maxHostSupportedVcpus,
           java.lang.Boolean vmfsDatastoreMountCapable,
           java.lang.Boolean eightPlusHostVmfsSharedAccessSupported,
           java.lang.Boolean nestedHVSupported,
           java.lang.Boolean vPMCSupported,
           java.lang.Boolean interVMCommunicationThroughVMCISupported,
           java.lang.Boolean scheduledHardwareUpgradeSupported,
           java.lang.Boolean featureCapabilitiesSupported,
           java.lang.Boolean latencySensitivitySupported,
           java.lang.Boolean storagePolicySupported,
           java.lang.Boolean accel3DSupported,
           java.lang.Boolean reliableMemoryAware,
           java.lang.Boolean multipleNetworkStackInstanceSupported,
           java.lang.Boolean messageBusProxySupported,
           java.lang.Boolean vsanSupported,
           java.lang.Boolean vFlashSupported,
           java.lang.Boolean hostAccessManagerSupported,
           java.lang.Boolean provisioningNicSelectionSupported,
           java.lang.Boolean nfs41Supported,
           java.lang.Boolean turnDiskLocatorLedSupported,
           java.lang.Boolean virtualVolumeDatastoreSupported,
           java.lang.Boolean markAsSsdSupported,
           java.lang.Boolean markAsLocalSupported,
           java.lang.Boolean smartCardAuthenticationSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
        this.rebootSupported = rebootSupported;
        this.shutdownSupported = shutdownSupported;
        this.vmotionSupported = vmotionSupported;
        this.standbySupported = standbySupported;
        this.ipmiSupported = ipmiSupported;
        this.maxSupportedVMs = maxSupportedVMs;
        this.maxRunningVMs = maxRunningVMs;
        this.maxSupportedVcpus = maxSupportedVcpus;
        this.maxRegisteredVMs = maxRegisteredVMs;
        this.datastorePrincipalSupported = datastorePrincipalSupported;
        this.sanSupported = sanSupported;
        this.nfsSupported = nfsSupported;
        this.iscsiSupported = iscsiSupported;
        this.vlanTaggingSupported = vlanTaggingSupported;
        this.nicTeamingSupported = nicTeamingSupported;
        this.highGuestMemSupported = highGuestMemSupported;
        this.maintenanceModeSupported = maintenanceModeSupported;
        this.suspendedRelocateSupported = suspendedRelocateSupported;
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
        this.perVmSwapFiles = perVmSwapFiles;
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
        this.screenshotSupported = screenshotSupported;
        this.scaledScreenshotSupported = scaledScreenshotSupported;
        this.storageVMotionSupported = storageVMotionSupported;
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
        this.vmotionAcrossNetworkSupported = vmotionAcrossNetworkSupported;
        this.maxNumDisksSVMotion = maxNumDisksSVMotion;
        this.hbrNicSelectionSupported = hbrNicSelectionSupported;
        this.vrNfcNicSelectionSupported = vrNfcNicSelectionSupported;
        this.recordReplaySupported = recordReplaySupported;
        this.ftSupported = ftSupported;
        this.replayUnsupportedReason = replayUnsupportedReason;
        this.replayCompatibilityIssues = replayCompatibilityIssues;
        this.smpFtSupported = smpFtSupported;
        this.ftCompatibilityIssues = ftCompatibilityIssues;
        this.smpFtCompatibilityIssues = smpFtCompatibilityIssues;
        this.maxVcpusPerFtVm = maxVcpusPerFtVm;
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
        this.tpmSupported = tpmSupported;
        this.supportedCpuFeature = supportedCpuFeature;
        this.virtualExecUsageSupported = virtualExecUsageSupported;
        this.storageIORMSupported = storageIORMSupported;
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
        this.vmDirectPathGen2UnsupportedReason = vmDirectPathGen2UnsupportedReason;
        this.vmDirectPathGen2UnsupportedReasonExtended = vmDirectPathGen2UnsupportedReasonExtended;
        this.supportedVmfsMajorVersion = supportedVmfsMajorVersion;
        this.vStorageCapable = vStorageCapable;
        this.snapshotRelayoutSupported = snapshotRelayoutSupported;
        this.firewallIpRulesSupported = firewallIpRulesSupported;
        this.servicePackageInfoSupported = servicePackageInfoSupported;
        this.maxHostRunningVms = maxHostRunningVms;
        this.maxHostSupportedVcpus = maxHostSupportedVcpus;
        this.vmfsDatastoreMountCapable = vmfsDatastoreMountCapable;
        this.eightPlusHostVmfsSharedAccessSupported = eightPlusHostVmfsSharedAccessSupported;
        this.nestedHVSupported = nestedHVSupported;
        this.vPMCSupported = vPMCSupported;
        this.interVMCommunicationThroughVMCISupported = interVMCommunicationThroughVMCISupported;
        this.scheduledHardwareUpgradeSupported = scheduledHardwareUpgradeSupported;
        this.featureCapabilitiesSupported = featureCapabilitiesSupported;
        this.latencySensitivitySupported = latencySensitivitySupported;
        this.storagePolicySupported = storagePolicySupported;
        this.accel3DSupported = accel3DSupported;
        this.reliableMemoryAware = reliableMemoryAware;
        this.multipleNetworkStackInstanceSupported = multipleNetworkStackInstanceSupported;
        this.messageBusProxySupported = messageBusProxySupported;
        this.vsanSupported = vsanSupported;
        this.vFlashSupported = vFlashSupported;
        this.hostAccessManagerSupported = hostAccessManagerSupported;
        this.provisioningNicSelectionSupported = provisioningNicSelectionSupported;
        this.nfs41Supported = nfs41Supported;
        this.turnDiskLocatorLedSupported = turnDiskLocatorLedSupported;
        this.virtualVolumeDatastoreSupported = virtualVolumeDatastoreSupported;
        this.markAsSsdSupported = markAsSsdSupported;
        this.markAsLocalSupported = markAsLocalSupported;
        this.smartCardAuthenticationSupported = smartCardAuthenticationSupported;
    }


    /**
     * Gets the recursiveResourcePoolsSupported value for this HostCapability.
     * 
     * @return recursiveResourcePoolsSupported
     */
    public boolean isRecursiveResourcePoolsSupported() {
        return recursiveResourcePoolsSupported;
    }


    /**
     * Sets the recursiveResourcePoolsSupported value for this HostCapability.
     * 
     * @param recursiveResourcePoolsSupported
     */
    public void setRecursiveResourcePoolsSupported(boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }


    /**
     * Gets the cpuMemoryResourceConfigurationSupported value for this HostCapability.
     * 
     * @return cpuMemoryResourceConfigurationSupported
     */
    public boolean isCpuMemoryResourceConfigurationSupported() {
        return cpuMemoryResourceConfigurationSupported;
    }


    /**
     * Sets the cpuMemoryResourceConfigurationSupported value for this HostCapability.
     * 
     * @param cpuMemoryResourceConfigurationSupported
     */
    public void setCpuMemoryResourceConfigurationSupported(boolean cpuMemoryResourceConfigurationSupported) {
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
    }


    /**
     * Gets the rebootSupported value for this HostCapability.
     * 
     * @return rebootSupported
     */
    public boolean isRebootSupported() {
        return rebootSupported;
    }


    /**
     * Sets the rebootSupported value for this HostCapability.
     * 
     * @param rebootSupported
     */
    public void setRebootSupported(boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }


    /**
     * Gets the shutdownSupported value for this HostCapability.
     * 
     * @return shutdownSupported
     */
    public boolean isShutdownSupported() {
        return shutdownSupported;
    }


    /**
     * Sets the shutdownSupported value for this HostCapability.
     * 
     * @param shutdownSupported
     */
    public void setShutdownSupported(boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }


    /**
     * Gets the vmotionSupported value for this HostCapability.
     * 
     * @return vmotionSupported
     */
    public boolean isVmotionSupported() {
        return vmotionSupported;
    }


    /**
     * Sets the vmotionSupported value for this HostCapability.
     * 
     * @param vmotionSupported
     */
    public void setVmotionSupported(boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }


    /**
     * Gets the standbySupported value for this HostCapability.
     * 
     * @return standbySupported
     */
    public boolean isStandbySupported() {
        return standbySupported;
    }


    /**
     * Sets the standbySupported value for this HostCapability.
     * 
     * @param standbySupported
     */
    public void setStandbySupported(boolean standbySupported) {
        this.standbySupported = standbySupported;
    }


    /**
     * Gets the ipmiSupported value for this HostCapability.
     * 
     * @return ipmiSupported
     */
    public java.lang.Boolean getIpmiSupported() {
        return ipmiSupported;
    }


    /**
     * Sets the ipmiSupported value for this HostCapability.
     * 
     * @param ipmiSupported
     */
    public void setIpmiSupported(java.lang.Boolean ipmiSupported) {
        this.ipmiSupported = ipmiSupported;
    }


    /**
     * Gets the maxSupportedVMs value for this HostCapability.
     * 
     * @return maxSupportedVMs
     */
    public java.lang.Integer getMaxSupportedVMs() {
        return maxSupportedVMs;
    }


    /**
     * Sets the maxSupportedVMs value for this HostCapability.
     * 
     * @param maxSupportedVMs
     */
    public void setMaxSupportedVMs(java.lang.Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
    }


    /**
     * Gets the maxRunningVMs value for this HostCapability.
     * 
     * @return maxRunningVMs
     */
    public java.lang.Integer getMaxRunningVMs() {
        return maxRunningVMs;
    }


    /**
     * Sets the maxRunningVMs value for this HostCapability.
     * 
     * @param maxRunningVMs
     */
    public void setMaxRunningVMs(java.lang.Integer maxRunningVMs) {
        this.maxRunningVMs = maxRunningVMs;
    }


    /**
     * Gets the maxSupportedVcpus value for this HostCapability.
     * 
     * @return maxSupportedVcpus
     */
    public java.lang.Integer getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }


    /**
     * Sets the maxSupportedVcpus value for this HostCapability.
     * 
     * @param maxSupportedVcpus
     */
    public void setMaxSupportedVcpus(java.lang.Integer maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }


    /**
     * Gets the maxRegisteredVMs value for this HostCapability.
     * 
     * @return maxRegisteredVMs
     */
    public java.lang.Integer getMaxRegisteredVMs() {
        return maxRegisteredVMs;
    }


    /**
     * Sets the maxRegisteredVMs value for this HostCapability.
     * 
     * @param maxRegisteredVMs
     */
    public void setMaxRegisteredVMs(java.lang.Integer maxRegisteredVMs) {
        this.maxRegisteredVMs = maxRegisteredVMs;
    }


    /**
     * Gets the datastorePrincipalSupported value for this HostCapability.
     * 
     * @return datastorePrincipalSupported
     */
    public boolean isDatastorePrincipalSupported() {
        return datastorePrincipalSupported;
    }


    /**
     * Sets the datastorePrincipalSupported value for this HostCapability.
     * 
     * @param datastorePrincipalSupported
     */
    public void setDatastorePrincipalSupported(boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }


    /**
     * Gets the sanSupported value for this HostCapability.
     * 
     * @return sanSupported
     */
    public boolean isSanSupported() {
        return sanSupported;
    }


    /**
     * Sets the sanSupported value for this HostCapability.
     * 
     * @param sanSupported
     */
    public void setSanSupported(boolean sanSupported) {
        this.sanSupported = sanSupported;
    }


    /**
     * Gets the nfsSupported value for this HostCapability.
     * 
     * @return nfsSupported
     */
    public boolean isNfsSupported() {
        return nfsSupported;
    }


    /**
     * Sets the nfsSupported value for this HostCapability.
     * 
     * @param nfsSupported
     */
    public void setNfsSupported(boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }


    /**
     * Gets the iscsiSupported value for this HostCapability.
     * 
     * @return iscsiSupported
     */
    public boolean isIscsiSupported() {
        return iscsiSupported;
    }


    /**
     * Sets the iscsiSupported value for this HostCapability.
     * 
     * @param iscsiSupported
     */
    public void setIscsiSupported(boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }


    /**
     * Gets the vlanTaggingSupported value for this HostCapability.
     * 
     * @return vlanTaggingSupported
     */
    public boolean isVlanTaggingSupported() {
        return vlanTaggingSupported;
    }


    /**
     * Sets the vlanTaggingSupported value for this HostCapability.
     * 
     * @param vlanTaggingSupported
     */
    public void setVlanTaggingSupported(boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }


    /**
     * Gets the nicTeamingSupported value for this HostCapability.
     * 
     * @return nicTeamingSupported
     */
    public boolean isNicTeamingSupported() {
        return nicTeamingSupported;
    }


    /**
     * Sets the nicTeamingSupported value for this HostCapability.
     * 
     * @param nicTeamingSupported
     */
    public void setNicTeamingSupported(boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }


    /**
     * Gets the highGuestMemSupported value for this HostCapability.
     * 
     * @return highGuestMemSupported
     */
    public boolean isHighGuestMemSupported() {
        return highGuestMemSupported;
    }


    /**
     * Sets the highGuestMemSupported value for this HostCapability.
     * 
     * @param highGuestMemSupported
     */
    public void setHighGuestMemSupported(boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }


    /**
     * Gets the maintenanceModeSupported value for this HostCapability.
     * 
     * @return maintenanceModeSupported
     */
    public boolean isMaintenanceModeSupported() {
        return maintenanceModeSupported;
    }


    /**
     * Sets the maintenanceModeSupported value for this HostCapability.
     * 
     * @param maintenanceModeSupported
     */
    public void setMaintenanceModeSupported(boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }


    /**
     * Gets the suspendedRelocateSupported value for this HostCapability.
     * 
     * @return suspendedRelocateSupported
     */
    public boolean isSuspendedRelocateSupported() {
        return suspendedRelocateSupported;
    }


    /**
     * Sets the suspendedRelocateSupported value for this HostCapability.
     * 
     * @param suspendedRelocateSupported
     */
    public void setSuspendedRelocateSupported(boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }


    /**
     * Gets the restrictedSnapshotRelocateSupported value for this HostCapability.
     * 
     * @return restrictedSnapshotRelocateSupported
     */
    public boolean isRestrictedSnapshotRelocateSupported() {
        return restrictedSnapshotRelocateSupported;
    }


    /**
     * Sets the restrictedSnapshotRelocateSupported value for this HostCapability.
     * 
     * @param restrictedSnapshotRelocateSupported
     */
    public void setRestrictedSnapshotRelocateSupported(boolean restrictedSnapshotRelocateSupported) {
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
    }


    /**
     * Gets the perVmSwapFiles value for this HostCapability.
     * 
     * @return perVmSwapFiles
     */
    public boolean isPerVmSwapFiles() {
        return perVmSwapFiles;
    }


    /**
     * Sets the perVmSwapFiles value for this HostCapability.
     * 
     * @param perVmSwapFiles
     */
    public void setPerVmSwapFiles(boolean perVmSwapFiles) {
        this.perVmSwapFiles = perVmSwapFiles;
    }


    /**
     * Gets the localSwapDatastoreSupported value for this HostCapability.
     * 
     * @return localSwapDatastoreSupported
     */
    public boolean isLocalSwapDatastoreSupported() {
        return localSwapDatastoreSupported;
    }


    /**
     * Sets the localSwapDatastoreSupported value for this HostCapability.
     * 
     * @param localSwapDatastoreSupported
     */
    public void setLocalSwapDatastoreSupported(boolean localSwapDatastoreSupported) {
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
    }


    /**
     * Gets the unsharedSwapVMotionSupported value for this HostCapability.
     * 
     * @return unsharedSwapVMotionSupported
     */
    public boolean isUnsharedSwapVMotionSupported() {
        return unsharedSwapVMotionSupported;
    }


    /**
     * Sets the unsharedSwapVMotionSupported value for this HostCapability.
     * 
     * @param unsharedSwapVMotionSupported
     */
    public void setUnsharedSwapVMotionSupported(boolean unsharedSwapVMotionSupported) {
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
    }


    /**
     * Gets the backgroundSnapshotsSupported value for this HostCapability.
     * 
     * @return backgroundSnapshotsSupported
     */
    public boolean isBackgroundSnapshotsSupported() {
        return backgroundSnapshotsSupported;
    }


    /**
     * Sets the backgroundSnapshotsSupported value for this HostCapability.
     * 
     * @param backgroundSnapshotsSupported
     */
    public void setBackgroundSnapshotsSupported(boolean backgroundSnapshotsSupported) {
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
    }


    /**
     * Gets the preAssignedPCIUnitNumbersSupported value for this HostCapability.
     * 
     * @return preAssignedPCIUnitNumbersSupported
     */
    public boolean isPreAssignedPCIUnitNumbersSupported() {
        return preAssignedPCIUnitNumbersSupported;
    }


    /**
     * Sets the preAssignedPCIUnitNumbersSupported value for this HostCapability.
     * 
     * @param preAssignedPCIUnitNumbersSupported
     */
    public void setPreAssignedPCIUnitNumbersSupported(boolean preAssignedPCIUnitNumbersSupported) {
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
    }


    /**
     * Gets the screenshotSupported value for this HostCapability.
     * 
     * @return screenshotSupported
     */
    public boolean isScreenshotSupported() {
        return screenshotSupported;
    }


    /**
     * Sets the screenshotSupported value for this HostCapability.
     * 
     * @param screenshotSupported
     */
    public void setScreenshotSupported(boolean screenshotSupported) {
        this.screenshotSupported = screenshotSupported;
    }


    /**
     * Gets the scaledScreenshotSupported value for this HostCapability.
     * 
     * @return scaledScreenshotSupported
     */
    public boolean isScaledScreenshotSupported() {
        return scaledScreenshotSupported;
    }


    /**
     * Sets the scaledScreenshotSupported value for this HostCapability.
     * 
     * @param scaledScreenshotSupported
     */
    public void setScaledScreenshotSupported(boolean scaledScreenshotSupported) {
        this.scaledScreenshotSupported = scaledScreenshotSupported;
    }


    /**
     * Gets the storageVMotionSupported value for this HostCapability.
     * 
     * @return storageVMotionSupported
     */
    public java.lang.Boolean getStorageVMotionSupported() {
        return storageVMotionSupported;
    }


    /**
     * Sets the storageVMotionSupported value for this HostCapability.
     * 
     * @param storageVMotionSupported
     */
    public void setStorageVMotionSupported(java.lang.Boolean storageVMotionSupported) {
        this.storageVMotionSupported = storageVMotionSupported;
    }


    /**
     * Gets the vmotionWithStorageVMotionSupported value for this HostCapability.
     * 
     * @return vmotionWithStorageVMotionSupported
     */
    public java.lang.Boolean getVmotionWithStorageVMotionSupported() {
        return vmotionWithStorageVMotionSupported;
    }


    /**
     * Sets the vmotionWithStorageVMotionSupported value for this HostCapability.
     * 
     * @param vmotionWithStorageVMotionSupported
     */
    public void setVmotionWithStorageVMotionSupported(java.lang.Boolean vmotionWithStorageVMotionSupported) {
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
    }


    /**
     * Gets the vmotionAcrossNetworkSupported value for this HostCapability.
     * 
     * @return vmotionAcrossNetworkSupported
     */
    public java.lang.Boolean getVmotionAcrossNetworkSupported() {
        return vmotionAcrossNetworkSupported;
    }


    /**
     * Sets the vmotionAcrossNetworkSupported value for this HostCapability.
     * 
     * @param vmotionAcrossNetworkSupported
     */
    public void setVmotionAcrossNetworkSupported(java.lang.Boolean vmotionAcrossNetworkSupported) {
        this.vmotionAcrossNetworkSupported = vmotionAcrossNetworkSupported;
    }


    /**
     * Gets the maxNumDisksSVMotion value for this HostCapability.
     * 
     * @return maxNumDisksSVMotion
     */
    public java.lang.Integer getMaxNumDisksSVMotion() {
        return maxNumDisksSVMotion;
    }


    /**
     * Sets the maxNumDisksSVMotion value for this HostCapability.
     * 
     * @param maxNumDisksSVMotion
     */
    public void setMaxNumDisksSVMotion(java.lang.Integer maxNumDisksSVMotion) {
        this.maxNumDisksSVMotion = maxNumDisksSVMotion;
    }


    /**
     * Gets the hbrNicSelectionSupported value for this HostCapability.
     * 
     * @return hbrNicSelectionSupported
     */
    public java.lang.Boolean getHbrNicSelectionSupported() {
        return hbrNicSelectionSupported;
    }


    /**
     * Sets the hbrNicSelectionSupported value for this HostCapability.
     * 
     * @param hbrNicSelectionSupported
     */
    public void setHbrNicSelectionSupported(java.lang.Boolean hbrNicSelectionSupported) {
        this.hbrNicSelectionSupported = hbrNicSelectionSupported;
    }


    /**
     * Gets the vrNfcNicSelectionSupported value for this HostCapability.
     * 
     * @return vrNfcNicSelectionSupported
     */
    public java.lang.Boolean getVrNfcNicSelectionSupported() {
        return vrNfcNicSelectionSupported;
    }


    /**
     * Sets the vrNfcNicSelectionSupported value for this HostCapability.
     * 
     * @param vrNfcNicSelectionSupported
     */
    public void setVrNfcNicSelectionSupported(java.lang.Boolean vrNfcNicSelectionSupported) {
        this.vrNfcNicSelectionSupported = vrNfcNicSelectionSupported;
    }


    /**
     * Gets the recordReplaySupported value for this HostCapability.
     * 
     * @return recordReplaySupported
     */
    public java.lang.Boolean getRecordReplaySupported() {
        return recordReplaySupported;
    }


    /**
     * Sets the recordReplaySupported value for this HostCapability.
     * 
     * @param recordReplaySupported
     */
    public void setRecordReplaySupported(java.lang.Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }


    /**
     * Gets the ftSupported value for this HostCapability.
     * 
     * @return ftSupported
     */
    public java.lang.Boolean getFtSupported() {
        return ftSupported;
    }


    /**
     * Sets the ftSupported value for this HostCapability.
     * 
     * @param ftSupported
     */
    public void setFtSupported(java.lang.Boolean ftSupported) {
        this.ftSupported = ftSupported;
    }


    /**
     * Gets the replayUnsupportedReason value for this HostCapability.
     * 
     * @return replayUnsupportedReason
     */
    public java.lang.String getReplayUnsupportedReason() {
        return replayUnsupportedReason;
    }


    /**
     * Sets the replayUnsupportedReason value for this HostCapability.
     * 
     * @param replayUnsupportedReason
     */
    public void setReplayUnsupportedReason(java.lang.String replayUnsupportedReason) {
        this.replayUnsupportedReason = replayUnsupportedReason;
    }


    /**
     * Gets the replayCompatibilityIssues value for this HostCapability.
     * 
     * @return replayCompatibilityIssues
     */
    public java.lang.String[] getReplayCompatibilityIssues() {
        return replayCompatibilityIssues;
    }


    /**
     * Sets the replayCompatibilityIssues value for this HostCapability.
     * 
     * @param replayCompatibilityIssues
     */
    public void setReplayCompatibilityIssues(java.lang.String[] replayCompatibilityIssues) {
        this.replayCompatibilityIssues = replayCompatibilityIssues;
    }

    public java.lang.String getReplayCompatibilityIssues(int i) {
        return this.replayCompatibilityIssues[i];
    }

    public void setReplayCompatibilityIssues(int i, java.lang.String _value) {
        this.replayCompatibilityIssues[i] = _value;
    }


    /**
     * Gets the smpFtSupported value for this HostCapability.
     * 
     * @return smpFtSupported
     */
    public java.lang.Boolean getSmpFtSupported() {
        return smpFtSupported;
    }


    /**
     * Sets the smpFtSupported value for this HostCapability.
     * 
     * @param smpFtSupported
     */
    public void setSmpFtSupported(java.lang.Boolean smpFtSupported) {
        this.smpFtSupported = smpFtSupported;
    }


    /**
     * Gets the ftCompatibilityIssues value for this HostCapability.
     * 
     * @return ftCompatibilityIssues
     */
    public java.lang.String[] getFtCompatibilityIssues() {
        return ftCompatibilityIssues;
    }


    /**
     * Sets the ftCompatibilityIssues value for this HostCapability.
     * 
     * @param ftCompatibilityIssues
     */
    public void setFtCompatibilityIssues(java.lang.String[] ftCompatibilityIssues) {
        this.ftCompatibilityIssues = ftCompatibilityIssues;
    }

    public java.lang.String getFtCompatibilityIssues(int i) {
        return this.ftCompatibilityIssues[i];
    }

    public void setFtCompatibilityIssues(int i, java.lang.String _value) {
        this.ftCompatibilityIssues[i] = _value;
    }


    /**
     * Gets the smpFtCompatibilityIssues value for this HostCapability.
     * 
     * @return smpFtCompatibilityIssues
     */
    public java.lang.String[] getSmpFtCompatibilityIssues() {
        return smpFtCompatibilityIssues;
    }


    /**
     * Sets the smpFtCompatibilityIssues value for this HostCapability.
     * 
     * @param smpFtCompatibilityIssues
     */
    public void setSmpFtCompatibilityIssues(java.lang.String[] smpFtCompatibilityIssues) {
        this.smpFtCompatibilityIssues = smpFtCompatibilityIssues;
    }

    public java.lang.String getSmpFtCompatibilityIssues(int i) {
        return this.smpFtCompatibilityIssues[i];
    }

    public void setSmpFtCompatibilityIssues(int i, java.lang.String _value) {
        this.smpFtCompatibilityIssues[i] = _value;
    }


    /**
     * Gets the maxVcpusPerFtVm value for this HostCapability.
     * 
     * @return maxVcpusPerFtVm
     */
    public java.lang.Integer getMaxVcpusPerFtVm() {
        return maxVcpusPerFtVm;
    }


    /**
     * Sets the maxVcpusPerFtVm value for this HostCapability.
     * 
     * @param maxVcpusPerFtVm
     */
    public void setMaxVcpusPerFtVm(java.lang.Integer maxVcpusPerFtVm) {
        this.maxVcpusPerFtVm = maxVcpusPerFtVm;
    }


    /**
     * Gets the loginBySSLThumbprintSupported value for this HostCapability.
     * 
     * @return loginBySSLThumbprintSupported
     */
    public java.lang.Boolean getLoginBySSLThumbprintSupported() {
        return loginBySSLThumbprintSupported;
    }


    /**
     * Sets the loginBySSLThumbprintSupported value for this HostCapability.
     * 
     * @param loginBySSLThumbprintSupported
     */
    public void setLoginBySSLThumbprintSupported(java.lang.Boolean loginBySSLThumbprintSupported) {
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
    }


    /**
     * Gets the cloneFromSnapshotSupported value for this HostCapability.
     * 
     * @return cloneFromSnapshotSupported
     */
    public java.lang.Boolean getCloneFromSnapshotSupported() {
        return cloneFromSnapshotSupported;
    }


    /**
     * Sets the cloneFromSnapshotSupported value for this HostCapability.
     * 
     * @param cloneFromSnapshotSupported
     */
    public void setCloneFromSnapshotSupported(java.lang.Boolean cloneFromSnapshotSupported) {
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
    }


    /**
     * Gets the deltaDiskBackingsSupported value for this HostCapability.
     * 
     * @return deltaDiskBackingsSupported
     */
    public java.lang.Boolean getDeltaDiskBackingsSupported() {
        return deltaDiskBackingsSupported;
    }


    /**
     * Sets the deltaDiskBackingsSupported value for this HostCapability.
     * 
     * @param deltaDiskBackingsSupported
     */
    public void setDeltaDiskBackingsSupported(java.lang.Boolean deltaDiskBackingsSupported) {
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
    }


    /**
     * Gets the perVMNetworkTrafficShapingSupported value for this HostCapability.
     * 
     * @return perVMNetworkTrafficShapingSupported
     */
    public java.lang.Boolean getPerVMNetworkTrafficShapingSupported() {
        return perVMNetworkTrafficShapingSupported;
    }


    /**
     * Sets the perVMNetworkTrafficShapingSupported value for this HostCapability.
     * 
     * @param perVMNetworkTrafficShapingSupported
     */
    public void setPerVMNetworkTrafficShapingSupported(java.lang.Boolean perVMNetworkTrafficShapingSupported) {
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
    }


    /**
     * Gets the tpmSupported value for this HostCapability.
     * 
     * @return tpmSupported
     */
    public java.lang.Boolean getTpmSupported() {
        return tpmSupported;
    }


    /**
     * Sets the tpmSupported value for this HostCapability.
     * 
     * @param tpmSupported
     */
    public void setTpmSupported(java.lang.Boolean tpmSupported) {
        this.tpmSupported = tpmSupported;
    }


    /**
     * Gets the supportedCpuFeature value for this HostCapability.
     * 
     * @return supportedCpuFeature
     */
    public com.vmware.converter.HostCpuIdInfo[] getSupportedCpuFeature() {
        return supportedCpuFeature;
    }


    /**
     * Sets the supportedCpuFeature value for this HostCapability.
     * 
     * @param supportedCpuFeature
     */
    public void setSupportedCpuFeature(com.vmware.converter.HostCpuIdInfo[] supportedCpuFeature) {
        this.supportedCpuFeature = supportedCpuFeature;
    }

    public com.vmware.converter.HostCpuIdInfo getSupportedCpuFeature(int i) {
        return this.supportedCpuFeature[i];
    }

    public void setSupportedCpuFeature(int i, com.vmware.converter.HostCpuIdInfo _value) {
        this.supportedCpuFeature[i] = _value;
    }


    /**
     * Gets the virtualExecUsageSupported value for this HostCapability.
     * 
     * @return virtualExecUsageSupported
     */
    public java.lang.Boolean getVirtualExecUsageSupported() {
        return virtualExecUsageSupported;
    }


    /**
     * Sets the virtualExecUsageSupported value for this HostCapability.
     * 
     * @param virtualExecUsageSupported
     */
    public void setVirtualExecUsageSupported(java.lang.Boolean virtualExecUsageSupported) {
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }


    /**
     * Gets the storageIORMSupported value for this HostCapability.
     * 
     * @return storageIORMSupported
     */
    public java.lang.Boolean getStorageIORMSupported() {
        return storageIORMSupported;
    }


    /**
     * Sets the storageIORMSupported value for this HostCapability.
     * 
     * @param storageIORMSupported
     */
    public void setStorageIORMSupported(java.lang.Boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }


    /**
     * Gets the vmDirectPathGen2Supported value for this HostCapability.
     * 
     * @return vmDirectPathGen2Supported
     */
    public java.lang.Boolean getVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }


    /**
     * Sets the vmDirectPathGen2Supported value for this HostCapability.
     * 
     * @param vmDirectPathGen2Supported
     */
    public void setVmDirectPathGen2Supported(java.lang.Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }


    /**
     * Gets the vmDirectPathGen2UnsupportedReason value for this HostCapability.
     * 
     * @return vmDirectPathGen2UnsupportedReason
     */
    public java.lang.String[] getVmDirectPathGen2UnsupportedReason() {
        return vmDirectPathGen2UnsupportedReason;
    }


    /**
     * Sets the vmDirectPathGen2UnsupportedReason value for this HostCapability.
     * 
     * @param vmDirectPathGen2UnsupportedReason
     */
    public void setVmDirectPathGen2UnsupportedReason(java.lang.String[] vmDirectPathGen2UnsupportedReason) {
        this.vmDirectPathGen2UnsupportedReason = vmDirectPathGen2UnsupportedReason;
    }

    public java.lang.String getVmDirectPathGen2UnsupportedReason(int i) {
        return this.vmDirectPathGen2UnsupportedReason[i];
    }

    public void setVmDirectPathGen2UnsupportedReason(int i, java.lang.String _value) {
        this.vmDirectPathGen2UnsupportedReason[i] = _value;
    }


    /**
     * Gets the vmDirectPathGen2UnsupportedReasonExtended value for this HostCapability.
     * 
     * @return vmDirectPathGen2UnsupportedReasonExtended
     */
    public java.lang.String getVmDirectPathGen2UnsupportedReasonExtended() {
        return vmDirectPathGen2UnsupportedReasonExtended;
    }


    /**
     * Sets the vmDirectPathGen2UnsupportedReasonExtended value for this HostCapability.
     * 
     * @param vmDirectPathGen2UnsupportedReasonExtended
     */
    public void setVmDirectPathGen2UnsupportedReasonExtended(java.lang.String vmDirectPathGen2UnsupportedReasonExtended) {
        this.vmDirectPathGen2UnsupportedReasonExtended = vmDirectPathGen2UnsupportedReasonExtended;
    }


    /**
     * Gets the supportedVmfsMajorVersion value for this HostCapability.
     * 
     * @return supportedVmfsMajorVersion
     */
    public int[] getSupportedVmfsMajorVersion() {
        return supportedVmfsMajorVersion;
    }


    /**
     * Sets the supportedVmfsMajorVersion value for this HostCapability.
     * 
     * @param supportedVmfsMajorVersion
     */
    public void setSupportedVmfsMajorVersion(int[] supportedVmfsMajorVersion) {
        this.supportedVmfsMajorVersion = supportedVmfsMajorVersion;
    }

    public int getSupportedVmfsMajorVersion(int i) {
        return this.supportedVmfsMajorVersion[i];
    }

    public void setSupportedVmfsMajorVersion(int i, int _value) {
        this.supportedVmfsMajorVersion[i] = _value;
    }


    /**
     * Gets the vStorageCapable value for this HostCapability.
     * 
     * @return vStorageCapable
     */
    public java.lang.Boolean getVStorageCapable() {
        return vStorageCapable;
    }


    /**
     * Sets the vStorageCapable value for this HostCapability.
     * 
     * @param vStorageCapable
     */
    public void setVStorageCapable(java.lang.Boolean vStorageCapable) {
        this.vStorageCapable = vStorageCapable;
    }


    /**
     * Gets the snapshotRelayoutSupported value for this HostCapability.
     * 
     * @return snapshotRelayoutSupported
     */
    public java.lang.Boolean getSnapshotRelayoutSupported() {
        return snapshotRelayoutSupported;
    }


    /**
     * Sets the snapshotRelayoutSupported value for this HostCapability.
     * 
     * @param snapshotRelayoutSupported
     */
    public void setSnapshotRelayoutSupported(java.lang.Boolean snapshotRelayoutSupported) {
        this.snapshotRelayoutSupported = snapshotRelayoutSupported;
    }


    /**
     * Gets the firewallIpRulesSupported value for this HostCapability.
     * 
     * @return firewallIpRulesSupported
     */
    public java.lang.Boolean getFirewallIpRulesSupported() {
        return firewallIpRulesSupported;
    }


    /**
     * Sets the firewallIpRulesSupported value for this HostCapability.
     * 
     * @param firewallIpRulesSupported
     */
    public void setFirewallIpRulesSupported(java.lang.Boolean firewallIpRulesSupported) {
        this.firewallIpRulesSupported = firewallIpRulesSupported;
    }


    /**
     * Gets the servicePackageInfoSupported value for this HostCapability.
     * 
     * @return servicePackageInfoSupported
     */
    public java.lang.Boolean getServicePackageInfoSupported() {
        return servicePackageInfoSupported;
    }


    /**
     * Sets the servicePackageInfoSupported value for this HostCapability.
     * 
     * @param servicePackageInfoSupported
     */
    public void setServicePackageInfoSupported(java.lang.Boolean servicePackageInfoSupported) {
        this.servicePackageInfoSupported = servicePackageInfoSupported;
    }


    /**
     * Gets the maxHostRunningVms value for this HostCapability.
     * 
     * @return maxHostRunningVms
     */
    public java.lang.Integer getMaxHostRunningVms() {
        return maxHostRunningVms;
    }


    /**
     * Sets the maxHostRunningVms value for this HostCapability.
     * 
     * @param maxHostRunningVms
     */
    public void setMaxHostRunningVms(java.lang.Integer maxHostRunningVms) {
        this.maxHostRunningVms = maxHostRunningVms;
    }


    /**
     * Gets the maxHostSupportedVcpus value for this HostCapability.
     * 
     * @return maxHostSupportedVcpus
     */
    public java.lang.Integer getMaxHostSupportedVcpus() {
        return maxHostSupportedVcpus;
    }


    /**
     * Sets the maxHostSupportedVcpus value for this HostCapability.
     * 
     * @param maxHostSupportedVcpus
     */
    public void setMaxHostSupportedVcpus(java.lang.Integer maxHostSupportedVcpus) {
        this.maxHostSupportedVcpus = maxHostSupportedVcpus;
    }


    /**
     * Gets the vmfsDatastoreMountCapable value for this HostCapability.
     * 
     * @return vmfsDatastoreMountCapable
     */
    public java.lang.Boolean getVmfsDatastoreMountCapable() {
        return vmfsDatastoreMountCapable;
    }


    /**
     * Sets the vmfsDatastoreMountCapable value for this HostCapability.
     * 
     * @param vmfsDatastoreMountCapable
     */
    public void setVmfsDatastoreMountCapable(java.lang.Boolean vmfsDatastoreMountCapable) {
        this.vmfsDatastoreMountCapable = vmfsDatastoreMountCapable;
    }


    /**
     * Gets the eightPlusHostVmfsSharedAccessSupported value for this HostCapability.
     * 
     * @return eightPlusHostVmfsSharedAccessSupported
     */
    public java.lang.Boolean getEightPlusHostVmfsSharedAccessSupported() {
        return eightPlusHostVmfsSharedAccessSupported;
    }


    /**
     * Sets the eightPlusHostVmfsSharedAccessSupported value for this HostCapability.
     * 
     * @param eightPlusHostVmfsSharedAccessSupported
     */
    public void setEightPlusHostVmfsSharedAccessSupported(java.lang.Boolean eightPlusHostVmfsSharedAccessSupported) {
        this.eightPlusHostVmfsSharedAccessSupported = eightPlusHostVmfsSharedAccessSupported;
    }


    /**
     * Gets the nestedHVSupported value for this HostCapability.
     * 
     * @return nestedHVSupported
     */
    public java.lang.Boolean getNestedHVSupported() {
        return nestedHVSupported;
    }


    /**
     * Sets the nestedHVSupported value for this HostCapability.
     * 
     * @param nestedHVSupported
     */
    public void setNestedHVSupported(java.lang.Boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }


    /**
     * Gets the vPMCSupported value for this HostCapability.
     * 
     * @return vPMCSupported
     */
    public java.lang.Boolean getVPMCSupported() {
        return vPMCSupported;
    }


    /**
     * Sets the vPMCSupported value for this HostCapability.
     * 
     * @param vPMCSupported
     */
    public void setVPMCSupported(java.lang.Boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }


    /**
     * Gets the interVMCommunicationThroughVMCISupported value for this HostCapability.
     * 
     * @return interVMCommunicationThroughVMCISupported
     */
    public java.lang.Boolean getInterVMCommunicationThroughVMCISupported() {
        return interVMCommunicationThroughVMCISupported;
    }


    /**
     * Sets the interVMCommunicationThroughVMCISupported value for this HostCapability.
     * 
     * @param interVMCommunicationThroughVMCISupported
     */
    public void setInterVMCommunicationThroughVMCISupported(java.lang.Boolean interVMCommunicationThroughVMCISupported) {
        this.interVMCommunicationThroughVMCISupported = interVMCommunicationThroughVMCISupported;
    }


    /**
     * Gets the scheduledHardwareUpgradeSupported value for this HostCapability.
     * 
     * @return scheduledHardwareUpgradeSupported
     */
    public java.lang.Boolean getScheduledHardwareUpgradeSupported() {
        return scheduledHardwareUpgradeSupported;
    }


    /**
     * Sets the scheduledHardwareUpgradeSupported value for this HostCapability.
     * 
     * @param scheduledHardwareUpgradeSupported
     */
    public void setScheduledHardwareUpgradeSupported(java.lang.Boolean scheduledHardwareUpgradeSupported) {
        this.scheduledHardwareUpgradeSupported = scheduledHardwareUpgradeSupported;
    }


    /**
     * Gets the featureCapabilitiesSupported value for this HostCapability.
     * 
     * @return featureCapabilitiesSupported
     */
    public java.lang.Boolean getFeatureCapabilitiesSupported() {
        return featureCapabilitiesSupported;
    }


    /**
     * Sets the featureCapabilitiesSupported value for this HostCapability.
     * 
     * @param featureCapabilitiesSupported
     */
    public void setFeatureCapabilitiesSupported(java.lang.Boolean featureCapabilitiesSupported) {
        this.featureCapabilitiesSupported = featureCapabilitiesSupported;
    }


    /**
     * Gets the latencySensitivitySupported value for this HostCapability.
     * 
     * @return latencySensitivitySupported
     */
    public java.lang.Boolean getLatencySensitivitySupported() {
        return latencySensitivitySupported;
    }


    /**
     * Sets the latencySensitivitySupported value for this HostCapability.
     * 
     * @param latencySensitivitySupported
     */
    public void setLatencySensitivitySupported(java.lang.Boolean latencySensitivitySupported) {
        this.latencySensitivitySupported = latencySensitivitySupported;
    }


    /**
     * Gets the storagePolicySupported value for this HostCapability.
     * 
     * @return storagePolicySupported
     */
    public java.lang.Boolean getStoragePolicySupported() {
        return storagePolicySupported;
    }


    /**
     * Sets the storagePolicySupported value for this HostCapability.
     * 
     * @param storagePolicySupported
     */
    public void setStoragePolicySupported(java.lang.Boolean storagePolicySupported) {
        this.storagePolicySupported = storagePolicySupported;
    }


    /**
     * Gets the accel3DSupported value for this HostCapability.
     * 
     * @return accel3DSupported
     */
    public java.lang.Boolean getAccel3DSupported() {
        return accel3DSupported;
    }


    /**
     * Sets the accel3DSupported value for this HostCapability.
     * 
     * @param accel3DSupported
     */
    public void setAccel3DSupported(java.lang.Boolean accel3DSupported) {
        this.accel3DSupported = accel3DSupported;
    }


    /**
     * Gets the reliableMemoryAware value for this HostCapability.
     * 
     * @return reliableMemoryAware
     */
    public java.lang.Boolean getReliableMemoryAware() {
        return reliableMemoryAware;
    }


    /**
     * Sets the reliableMemoryAware value for this HostCapability.
     * 
     * @param reliableMemoryAware
     */
    public void setReliableMemoryAware(java.lang.Boolean reliableMemoryAware) {
        this.reliableMemoryAware = reliableMemoryAware;
    }


    /**
     * Gets the multipleNetworkStackInstanceSupported value for this HostCapability.
     * 
     * @return multipleNetworkStackInstanceSupported
     */
    public java.lang.Boolean getMultipleNetworkStackInstanceSupported() {
        return multipleNetworkStackInstanceSupported;
    }


    /**
     * Sets the multipleNetworkStackInstanceSupported value for this HostCapability.
     * 
     * @param multipleNetworkStackInstanceSupported
     */
    public void setMultipleNetworkStackInstanceSupported(java.lang.Boolean multipleNetworkStackInstanceSupported) {
        this.multipleNetworkStackInstanceSupported = multipleNetworkStackInstanceSupported;
    }


    /**
     * Gets the messageBusProxySupported value for this HostCapability.
     * 
     * @return messageBusProxySupported
     */
    public java.lang.Boolean getMessageBusProxySupported() {
        return messageBusProxySupported;
    }


    /**
     * Sets the messageBusProxySupported value for this HostCapability.
     * 
     * @param messageBusProxySupported
     */
    public void setMessageBusProxySupported(java.lang.Boolean messageBusProxySupported) {
        this.messageBusProxySupported = messageBusProxySupported;
    }


    /**
     * Gets the vsanSupported value for this HostCapability.
     * 
     * @return vsanSupported
     */
    public java.lang.Boolean getVsanSupported() {
        return vsanSupported;
    }


    /**
     * Sets the vsanSupported value for this HostCapability.
     * 
     * @param vsanSupported
     */
    public void setVsanSupported(java.lang.Boolean vsanSupported) {
        this.vsanSupported = vsanSupported;
    }


    /**
     * Gets the vFlashSupported value for this HostCapability.
     * 
     * @return vFlashSupported
     */
    public java.lang.Boolean getVFlashSupported() {
        return vFlashSupported;
    }


    /**
     * Sets the vFlashSupported value for this HostCapability.
     * 
     * @param vFlashSupported
     */
    public void setVFlashSupported(java.lang.Boolean vFlashSupported) {
        this.vFlashSupported = vFlashSupported;
    }


    /**
     * Gets the hostAccessManagerSupported value for this HostCapability.
     * 
     * @return hostAccessManagerSupported
     */
    public java.lang.Boolean getHostAccessManagerSupported() {
        return hostAccessManagerSupported;
    }


    /**
     * Sets the hostAccessManagerSupported value for this HostCapability.
     * 
     * @param hostAccessManagerSupported
     */
    public void setHostAccessManagerSupported(java.lang.Boolean hostAccessManagerSupported) {
        this.hostAccessManagerSupported = hostAccessManagerSupported;
    }


    /**
     * Gets the provisioningNicSelectionSupported value for this HostCapability.
     * 
     * @return provisioningNicSelectionSupported
     */
    public java.lang.Boolean getProvisioningNicSelectionSupported() {
        return provisioningNicSelectionSupported;
    }


    /**
     * Sets the provisioningNicSelectionSupported value for this HostCapability.
     * 
     * @param provisioningNicSelectionSupported
     */
    public void setProvisioningNicSelectionSupported(java.lang.Boolean provisioningNicSelectionSupported) {
        this.provisioningNicSelectionSupported = provisioningNicSelectionSupported;
    }


    /**
     * Gets the nfs41Supported value for this HostCapability.
     * 
     * @return nfs41Supported
     */
    public java.lang.Boolean getNfs41Supported() {
        return nfs41Supported;
    }


    /**
     * Sets the nfs41Supported value for this HostCapability.
     * 
     * @param nfs41Supported
     */
    public void setNfs41Supported(java.lang.Boolean nfs41Supported) {
        this.nfs41Supported = nfs41Supported;
    }


    /**
     * Gets the turnDiskLocatorLedSupported value for this HostCapability.
     * 
     * @return turnDiskLocatorLedSupported
     */
    public java.lang.Boolean getTurnDiskLocatorLedSupported() {
        return turnDiskLocatorLedSupported;
    }


    /**
     * Sets the turnDiskLocatorLedSupported value for this HostCapability.
     * 
     * @param turnDiskLocatorLedSupported
     */
    public void setTurnDiskLocatorLedSupported(java.lang.Boolean turnDiskLocatorLedSupported) {
        this.turnDiskLocatorLedSupported = turnDiskLocatorLedSupported;
    }


    /**
     * Gets the virtualVolumeDatastoreSupported value for this HostCapability.
     * 
     * @return virtualVolumeDatastoreSupported
     */
    public java.lang.Boolean getVirtualVolumeDatastoreSupported() {
        return virtualVolumeDatastoreSupported;
    }


    /**
     * Sets the virtualVolumeDatastoreSupported value for this HostCapability.
     * 
     * @param virtualVolumeDatastoreSupported
     */
    public void setVirtualVolumeDatastoreSupported(java.lang.Boolean virtualVolumeDatastoreSupported) {
        this.virtualVolumeDatastoreSupported = virtualVolumeDatastoreSupported;
    }


    /**
     * Gets the markAsSsdSupported value for this HostCapability.
     * 
     * @return markAsSsdSupported
     */
    public java.lang.Boolean getMarkAsSsdSupported() {
        return markAsSsdSupported;
    }


    /**
     * Sets the markAsSsdSupported value for this HostCapability.
     * 
     * @param markAsSsdSupported
     */
    public void setMarkAsSsdSupported(java.lang.Boolean markAsSsdSupported) {
        this.markAsSsdSupported = markAsSsdSupported;
    }


    /**
     * Gets the markAsLocalSupported value for this HostCapability.
     * 
     * @return markAsLocalSupported
     */
    public java.lang.Boolean getMarkAsLocalSupported() {
        return markAsLocalSupported;
    }


    /**
     * Sets the markAsLocalSupported value for this HostCapability.
     * 
     * @param markAsLocalSupported
     */
    public void setMarkAsLocalSupported(java.lang.Boolean markAsLocalSupported) {
        this.markAsLocalSupported = markAsLocalSupported;
    }


    /**
     * Gets the smartCardAuthenticationSupported value for this HostCapability.
     * 
     * @return smartCardAuthenticationSupported
     */
    public java.lang.Boolean getSmartCardAuthenticationSupported() {
        return smartCardAuthenticationSupported;
    }


    /**
     * Sets the smartCardAuthenticationSupported value for this HostCapability.
     * 
     * @param smartCardAuthenticationSupported
     */
    public void setSmartCardAuthenticationSupported(java.lang.Boolean smartCardAuthenticationSupported) {
        this.smartCardAuthenticationSupported = smartCardAuthenticationSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostCapability)) return false;
        HostCapability other = (HostCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.recursiveResourcePoolsSupported == other.isRecursiveResourcePoolsSupported() &&
            this.cpuMemoryResourceConfigurationSupported == other.isCpuMemoryResourceConfigurationSupported() &&
            this.rebootSupported == other.isRebootSupported() &&
            this.shutdownSupported == other.isShutdownSupported() &&
            this.vmotionSupported == other.isVmotionSupported() &&
            this.standbySupported == other.isStandbySupported() &&
            ((this.ipmiSupported==null && other.getIpmiSupported()==null) || 
             (this.ipmiSupported!=null &&
              this.ipmiSupported.equals(other.getIpmiSupported()))) &&
            ((this.maxSupportedVMs==null && other.getMaxSupportedVMs()==null) || 
             (this.maxSupportedVMs!=null &&
              this.maxSupportedVMs.equals(other.getMaxSupportedVMs()))) &&
            ((this.maxRunningVMs==null && other.getMaxRunningVMs()==null) || 
             (this.maxRunningVMs!=null &&
              this.maxRunningVMs.equals(other.getMaxRunningVMs()))) &&
            ((this.maxSupportedVcpus==null && other.getMaxSupportedVcpus()==null) || 
             (this.maxSupportedVcpus!=null &&
              this.maxSupportedVcpus.equals(other.getMaxSupportedVcpus()))) &&
            ((this.maxRegisteredVMs==null && other.getMaxRegisteredVMs()==null) || 
             (this.maxRegisteredVMs!=null &&
              this.maxRegisteredVMs.equals(other.getMaxRegisteredVMs()))) &&
            this.datastorePrincipalSupported == other.isDatastorePrincipalSupported() &&
            this.sanSupported == other.isSanSupported() &&
            this.nfsSupported == other.isNfsSupported() &&
            this.iscsiSupported == other.isIscsiSupported() &&
            this.vlanTaggingSupported == other.isVlanTaggingSupported() &&
            this.nicTeamingSupported == other.isNicTeamingSupported() &&
            this.highGuestMemSupported == other.isHighGuestMemSupported() &&
            this.maintenanceModeSupported == other.isMaintenanceModeSupported() &&
            this.suspendedRelocateSupported == other.isSuspendedRelocateSupported() &&
            this.restrictedSnapshotRelocateSupported == other.isRestrictedSnapshotRelocateSupported() &&
            this.perVmSwapFiles == other.isPerVmSwapFiles() &&
            this.localSwapDatastoreSupported == other.isLocalSwapDatastoreSupported() &&
            this.unsharedSwapVMotionSupported == other.isUnsharedSwapVMotionSupported() &&
            this.backgroundSnapshotsSupported == other.isBackgroundSnapshotsSupported() &&
            this.preAssignedPCIUnitNumbersSupported == other.isPreAssignedPCIUnitNumbersSupported() &&
            this.screenshotSupported == other.isScreenshotSupported() &&
            this.scaledScreenshotSupported == other.isScaledScreenshotSupported() &&
            ((this.storageVMotionSupported==null && other.getStorageVMotionSupported()==null) || 
             (this.storageVMotionSupported!=null &&
              this.storageVMotionSupported.equals(other.getStorageVMotionSupported()))) &&
            ((this.vmotionWithStorageVMotionSupported==null && other.getVmotionWithStorageVMotionSupported()==null) || 
             (this.vmotionWithStorageVMotionSupported!=null &&
              this.vmotionWithStorageVMotionSupported.equals(other.getVmotionWithStorageVMotionSupported()))) &&
            ((this.vmotionAcrossNetworkSupported==null && other.getVmotionAcrossNetworkSupported()==null) || 
             (this.vmotionAcrossNetworkSupported!=null &&
              this.vmotionAcrossNetworkSupported.equals(other.getVmotionAcrossNetworkSupported()))) &&
            ((this.maxNumDisksSVMotion==null && other.getMaxNumDisksSVMotion()==null) || 
             (this.maxNumDisksSVMotion!=null &&
              this.maxNumDisksSVMotion.equals(other.getMaxNumDisksSVMotion()))) &&
            ((this.hbrNicSelectionSupported==null && other.getHbrNicSelectionSupported()==null) || 
             (this.hbrNicSelectionSupported!=null &&
              this.hbrNicSelectionSupported.equals(other.getHbrNicSelectionSupported()))) &&
            ((this.vrNfcNicSelectionSupported==null && other.getVrNfcNicSelectionSupported()==null) || 
             (this.vrNfcNicSelectionSupported!=null &&
              this.vrNfcNicSelectionSupported.equals(other.getVrNfcNicSelectionSupported()))) &&
            ((this.recordReplaySupported==null && other.getRecordReplaySupported()==null) || 
             (this.recordReplaySupported!=null &&
              this.recordReplaySupported.equals(other.getRecordReplaySupported()))) &&
            ((this.ftSupported==null && other.getFtSupported()==null) || 
             (this.ftSupported!=null &&
              this.ftSupported.equals(other.getFtSupported()))) &&
            ((this.replayUnsupportedReason==null && other.getReplayUnsupportedReason()==null) || 
             (this.replayUnsupportedReason!=null &&
              this.replayUnsupportedReason.equals(other.getReplayUnsupportedReason()))) &&
            ((this.replayCompatibilityIssues==null && other.getReplayCompatibilityIssues()==null) || 
             (this.replayCompatibilityIssues!=null &&
              java.util.Arrays.equals(this.replayCompatibilityIssues, other.getReplayCompatibilityIssues()))) &&
            ((this.smpFtSupported==null && other.getSmpFtSupported()==null) || 
             (this.smpFtSupported!=null &&
              this.smpFtSupported.equals(other.getSmpFtSupported()))) &&
            ((this.ftCompatibilityIssues==null && other.getFtCompatibilityIssues()==null) || 
             (this.ftCompatibilityIssues!=null &&
              java.util.Arrays.equals(this.ftCompatibilityIssues, other.getFtCompatibilityIssues()))) &&
            ((this.smpFtCompatibilityIssues==null && other.getSmpFtCompatibilityIssues()==null) || 
             (this.smpFtCompatibilityIssues!=null &&
              java.util.Arrays.equals(this.smpFtCompatibilityIssues, other.getSmpFtCompatibilityIssues()))) &&
            ((this.maxVcpusPerFtVm==null && other.getMaxVcpusPerFtVm()==null) || 
             (this.maxVcpusPerFtVm!=null &&
              this.maxVcpusPerFtVm.equals(other.getMaxVcpusPerFtVm()))) &&
            ((this.loginBySSLThumbprintSupported==null && other.getLoginBySSLThumbprintSupported()==null) || 
             (this.loginBySSLThumbprintSupported!=null &&
              this.loginBySSLThumbprintSupported.equals(other.getLoginBySSLThumbprintSupported()))) &&
            ((this.cloneFromSnapshotSupported==null && other.getCloneFromSnapshotSupported()==null) || 
             (this.cloneFromSnapshotSupported!=null &&
              this.cloneFromSnapshotSupported.equals(other.getCloneFromSnapshotSupported()))) &&
            ((this.deltaDiskBackingsSupported==null && other.getDeltaDiskBackingsSupported()==null) || 
             (this.deltaDiskBackingsSupported!=null &&
              this.deltaDiskBackingsSupported.equals(other.getDeltaDiskBackingsSupported()))) &&
            ((this.perVMNetworkTrafficShapingSupported==null && other.getPerVMNetworkTrafficShapingSupported()==null) || 
             (this.perVMNetworkTrafficShapingSupported!=null &&
              this.perVMNetworkTrafficShapingSupported.equals(other.getPerVMNetworkTrafficShapingSupported()))) &&
            ((this.tpmSupported==null && other.getTpmSupported()==null) || 
             (this.tpmSupported!=null &&
              this.tpmSupported.equals(other.getTpmSupported()))) &&
            ((this.supportedCpuFeature==null && other.getSupportedCpuFeature()==null) || 
             (this.supportedCpuFeature!=null &&
              java.util.Arrays.equals(this.supportedCpuFeature, other.getSupportedCpuFeature()))) &&
            ((this.virtualExecUsageSupported==null && other.getVirtualExecUsageSupported()==null) || 
             (this.virtualExecUsageSupported!=null &&
              this.virtualExecUsageSupported.equals(other.getVirtualExecUsageSupported()))) &&
            ((this.storageIORMSupported==null && other.getStorageIORMSupported()==null) || 
             (this.storageIORMSupported!=null &&
              this.storageIORMSupported.equals(other.getStorageIORMSupported()))) &&
            ((this.vmDirectPathGen2Supported==null && other.getVmDirectPathGen2Supported()==null) || 
             (this.vmDirectPathGen2Supported!=null &&
              this.vmDirectPathGen2Supported.equals(other.getVmDirectPathGen2Supported()))) &&
            ((this.vmDirectPathGen2UnsupportedReason==null && other.getVmDirectPathGen2UnsupportedReason()==null) || 
             (this.vmDirectPathGen2UnsupportedReason!=null &&
              java.util.Arrays.equals(this.vmDirectPathGen2UnsupportedReason, other.getVmDirectPathGen2UnsupportedReason()))) &&
            ((this.vmDirectPathGen2UnsupportedReasonExtended==null && other.getVmDirectPathGen2UnsupportedReasonExtended()==null) || 
             (this.vmDirectPathGen2UnsupportedReasonExtended!=null &&
              this.vmDirectPathGen2UnsupportedReasonExtended.equals(other.getVmDirectPathGen2UnsupportedReasonExtended()))) &&
            ((this.supportedVmfsMajorVersion==null && other.getSupportedVmfsMajorVersion()==null) || 
             (this.supportedVmfsMajorVersion!=null &&
              java.util.Arrays.equals(this.supportedVmfsMajorVersion, other.getSupportedVmfsMajorVersion()))) &&
            ((this.vStorageCapable==null && other.getVStorageCapable()==null) || 
             (this.vStorageCapable!=null &&
              this.vStorageCapable.equals(other.getVStorageCapable()))) &&
            ((this.snapshotRelayoutSupported==null && other.getSnapshotRelayoutSupported()==null) || 
             (this.snapshotRelayoutSupported!=null &&
              this.snapshotRelayoutSupported.equals(other.getSnapshotRelayoutSupported()))) &&
            ((this.firewallIpRulesSupported==null && other.getFirewallIpRulesSupported()==null) || 
             (this.firewallIpRulesSupported!=null &&
              this.firewallIpRulesSupported.equals(other.getFirewallIpRulesSupported()))) &&
            ((this.servicePackageInfoSupported==null && other.getServicePackageInfoSupported()==null) || 
             (this.servicePackageInfoSupported!=null &&
              this.servicePackageInfoSupported.equals(other.getServicePackageInfoSupported()))) &&
            ((this.maxHostRunningVms==null && other.getMaxHostRunningVms()==null) || 
             (this.maxHostRunningVms!=null &&
              this.maxHostRunningVms.equals(other.getMaxHostRunningVms()))) &&
            ((this.maxHostSupportedVcpus==null && other.getMaxHostSupportedVcpus()==null) || 
             (this.maxHostSupportedVcpus!=null &&
              this.maxHostSupportedVcpus.equals(other.getMaxHostSupportedVcpus()))) &&
            ((this.vmfsDatastoreMountCapable==null && other.getVmfsDatastoreMountCapable()==null) || 
             (this.vmfsDatastoreMountCapable!=null &&
              this.vmfsDatastoreMountCapable.equals(other.getVmfsDatastoreMountCapable()))) &&
            ((this.eightPlusHostVmfsSharedAccessSupported==null && other.getEightPlusHostVmfsSharedAccessSupported()==null) || 
             (this.eightPlusHostVmfsSharedAccessSupported!=null &&
              this.eightPlusHostVmfsSharedAccessSupported.equals(other.getEightPlusHostVmfsSharedAccessSupported()))) &&
            ((this.nestedHVSupported==null && other.getNestedHVSupported()==null) || 
             (this.nestedHVSupported!=null &&
              this.nestedHVSupported.equals(other.getNestedHVSupported()))) &&
            ((this.vPMCSupported==null && other.getVPMCSupported()==null) || 
             (this.vPMCSupported!=null &&
              this.vPMCSupported.equals(other.getVPMCSupported()))) &&
            ((this.interVMCommunicationThroughVMCISupported==null && other.getInterVMCommunicationThroughVMCISupported()==null) || 
             (this.interVMCommunicationThroughVMCISupported!=null &&
              this.interVMCommunicationThroughVMCISupported.equals(other.getInterVMCommunicationThroughVMCISupported()))) &&
            ((this.scheduledHardwareUpgradeSupported==null && other.getScheduledHardwareUpgradeSupported()==null) || 
             (this.scheduledHardwareUpgradeSupported!=null &&
              this.scheduledHardwareUpgradeSupported.equals(other.getScheduledHardwareUpgradeSupported()))) &&
            ((this.featureCapabilitiesSupported==null && other.getFeatureCapabilitiesSupported()==null) || 
             (this.featureCapabilitiesSupported!=null &&
              this.featureCapabilitiesSupported.equals(other.getFeatureCapabilitiesSupported()))) &&
            ((this.latencySensitivitySupported==null && other.getLatencySensitivitySupported()==null) || 
             (this.latencySensitivitySupported!=null &&
              this.latencySensitivitySupported.equals(other.getLatencySensitivitySupported()))) &&
            ((this.storagePolicySupported==null && other.getStoragePolicySupported()==null) || 
             (this.storagePolicySupported!=null &&
              this.storagePolicySupported.equals(other.getStoragePolicySupported()))) &&
            ((this.accel3DSupported==null && other.getAccel3DSupported()==null) || 
             (this.accel3DSupported!=null &&
              this.accel3DSupported.equals(other.getAccel3DSupported()))) &&
            ((this.reliableMemoryAware==null && other.getReliableMemoryAware()==null) || 
             (this.reliableMemoryAware!=null &&
              this.reliableMemoryAware.equals(other.getReliableMemoryAware()))) &&
            ((this.multipleNetworkStackInstanceSupported==null && other.getMultipleNetworkStackInstanceSupported()==null) || 
             (this.multipleNetworkStackInstanceSupported!=null &&
              this.multipleNetworkStackInstanceSupported.equals(other.getMultipleNetworkStackInstanceSupported()))) &&
            ((this.messageBusProxySupported==null && other.getMessageBusProxySupported()==null) || 
             (this.messageBusProxySupported!=null &&
              this.messageBusProxySupported.equals(other.getMessageBusProxySupported()))) &&
            ((this.vsanSupported==null && other.getVsanSupported()==null) || 
             (this.vsanSupported!=null &&
              this.vsanSupported.equals(other.getVsanSupported()))) &&
            ((this.vFlashSupported==null && other.getVFlashSupported()==null) || 
             (this.vFlashSupported!=null &&
              this.vFlashSupported.equals(other.getVFlashSupported()))) &&
            ((this.hostAccessManagerSupported==null && other.getHostAccessManagerSupported()==null) || 
             (this.hostAccessManagerSupported!=null &&
              this.hostAccessManagerSupported.equals(other.getHostAccessManagerSupported()))) &&
            ((this.provisioningNicSelectionSupported==null && other.getProvisioningNicSelectionSupported()==null) || 
             (this.provisioningNicSelectionSupported!=null &&
              this.provisioningNicSelectionSupported.equals(other.getProvisioningNicSelectionSupported()))) &&
            ((this.nfs41Supported==null && other.getNfs41Supported()==null) || 
             (this.nfs41Supported!=null &&
              this.nfs41Supported.equals(other.getNfs41Supported()))) &&
            ((this.turnDiskLocatorLedSupported==null && other.getTurnDiskLocatorLedSupported()==null) || 
             (this.turnDiskLocatorLedSupported!=null &&
              this.turnDiskLocatorLedSupported.equals(other.getTurnDiskLocatorLedSupported()))) &&
            ((this.virtualVolumeDatastoreSupported==null && other.getVirtualVolumeDatastoreSupported()==null) || 
             (this.virtualVolumeDatastoreSupported!=null &&
              this.virtualVolumeDatastoreSupported.equals(other.getVirtualVolumeDatastoreSupported()))) &&
            ((this.markAsSsdSupported==null && other.getMarkAsSsdSupported()==null) || 
             (this.markAsSsdSupported!=null &&
              this.markAsSsdSupported.equals(other.getMarkAsSsdSupported()))) &&
            ((this.markAsLocalSupported==null && other.getMarkAsLocalSupported()==null) || 
             (this.markAsLocalSupported!=null &&
              this.markAsLocalSupported.equals(other.getMarkAsLocalSupported()))) &&
            ((this.smartCardAuthenticationSupported==null && other.getSmartCardAuthenticationSupported()==null) || 
             (this.smartCardAuthenticationSupported!=null &&
              this.smartCardAuthenticationSupported.equals(other.getSmartCardAuthenticationSupported())));
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
        _hashCode += (isRecursiveResourcePoolsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCpuMemoryResourceConfigurationSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRebootSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShutdownSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVmotionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStandbySupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpmiSupported() != null) {
            _hashCode += getIpmiSupported().hashCode();
        }
        if (getMaxSupportedVMs() != null) {
            _hashCode += getMaxSupportedVMs().hashCode();
        }
        if (getMaxRunningVMs() != null) {
            _hashCode += getMaxRunningVMs().hashCode();
        }
        if (getMaxSupportedVcpus() != null) {
            _hashCode += getMaxSupportedVcpus().hashCode();
        }
        if (getMaxRegisteredVMs() != null) {
            _hashCode += getMaxRegisteredVMs().hashCode();
        }
        _hashCode += (isDatastorePrincipalSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSanSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNfsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIscsiSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVlanTaggingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNicTeamingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHighGuestMemSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMaintenanceModeSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSuspendedRelocateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRestrictedSnapshotRelocateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPerVmSwapFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLocalSwapDatastoreSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUnsharedSwapVMotionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBackgroundSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPreAssignedPCIUnitNumbersSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScreenshotSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScaledScreenshotSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStorageVMotionSupported() != null) {
            _hashCode += getStorageVMotionSupported().hashCode();
        }
        if (getVmotionWithStorageVMotionSupported() != null) {
            _hashCode += getVmotionWithStorageVMotionSupported().hashCode();
        }
        if (getVmotionAcrossNetworkSupported() != null) {
            _hashCode += getVmotionAcrossNetworkSupported().hashCode();
        }
        if (getMaxNumDisksSVMotion() != null) {
            _hashCode += getMaxNumDisksSVMotion().hashCode();
        }
        if (getHbrNicSelectionSupported() != null) {
            _hashCode += getHbrNicSelectionSupported().hashCode();
        }
        if (getVrNfcNicSelectionSupported() != null) {
            _hashCode += getVrNfcNicSelectionSupported().hashCode();
        }
        if (getRecordReplaySupported() != null) {
            _hashCode += getRecordReplaySupported().hashCode();
        }
        if (getFtSupported() != null) {
            _hashCode += getFtSupported().hashCode();
        }
        if (getReplayUnsupportedReason() != null) {
            _hashCode += getReplayUnsupportedReason().hashCode();
        }
        if (getReplayCompatibilityIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReplayCompatibilityIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReplayCompatibilityIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmpFtSupported() != null) {
            _hashCode += getSmpFtSupported().hashCode();
        }
        if (getFtCompatibilityIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFtCompatibilityIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFtCompatibilityIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmpFtCompatibilityIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmpFtCompatibilityIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmpFtCompatibilityIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxVcpusPerFtVm() != null) {
            _hashCode += getMaxVcpusPerFtVm().hashCode();
        }
        if (getLoginBySSLThumbprintSupported() != null) {
            _hashCode += getLoginBySSLThumbprintSupported().hashCode();
        }
        if (getCloneFromSnapshotSupported() != null) {
            _hashCode += getCloneFromSnapshotSupported().hashCode();
        }
        if (getDeltaDiskBackingsSupported() != null) {
            _hashCode += getDeltaDiskBackingsSupported().hashCode();
        }
        if (getPerVMNetworkTrafficShapingSupported() != null) {
            _hashCode += getPerVMNetworkTrafficShapingSupported().hashCode();
        }
        if (getTpmSupported() != null) {
            _hashCode += getTpmSupported().hashCode();
        }
        if (getSupportedCpuFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedCpuFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedCpuFeature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVirtualExecUsageSupported() != null) {
            _hashCode += getVirtualExecUsageSupported().hashCode();
        }
        if (getStorageIORMSupported() != null) {
            _hashCode += getStorageIORMSupported().hashCode();
        }
        if (getVmDirectPathGen2Supported() != null) {
            _hashCode += getVmDirectPathGen2Supported().hashCode();
        }
        if (getVmDirectPathGen2UnsupportedReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmDirectPathGen2UnsupportedReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmDirectPathGen2UnsupportedReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVmDirectPathGen2UnsupportedReasonExtended() != null) {
            _hashCode += getVmDirectPathGen2UnsupportedReasonExtended().hashCode();
        }
        if (getSupportedVmfsMajorVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedVmfsMajorVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedVmfsMajorVersion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVStorageCapable() != null) {
            _hashCode += getVStorageCapable().hashCode();
        }
        if (getSnapshotRelayoutSupported() != null) {
            _hashCode += getSnapshotRelayoutSupported().hashCode();
        }
        if (getFirewallIpRulesSupported() != null) {
            _hashCode += getFirewallIpRulesSupported().hashCode();
        }
        if (getServicePackageInfoSupported() != null) {
            _hashCode += getServicePackageInfoSupported().hashCode();
        }
        if (getMaxHostRunningVms() != null) {
            _hashCode += getMaxHostRunningVms().hashCode();
        }
        if (getMaxHostSupportedVcpus() != null) {
            _hashCode += getMaxHostSupportedVcpus().hashCode();
        }
        if (getVmfsDatastoreMountCapable() != null) {
            _hashCode += getVmfsDatastoreMountCapable().hashCode();
        }
        if (getEightPlusHostVmfsSharedAccessSupported() != null) {
            _hashCode += getEightPlusHostVmfsSharedAccessSupported().hashCode();
        }
        if (getNestedHVSupported() != null) {
            _hashCode += getNestedHVSupported().hashCode();
        }
        if (getVPMCSupported() != null) {
            _hashCode += getVPMCSupported().hashCode();
        }
        if (getInterVMCommunicationThroughVMCISupported() != null) {
            _hashCode += getInterVMCommunicationThroughVMCISupported().hashCode();
        }
        if (getScheduledHardwareUpgradeSupported() != null) {
            _hashCode += getScheduledHardwareUpgradeSupported().hashCode();
        }
        if (getFeatureCapabilitiesSupported() != null) {
            _hashCode += getFeatureCapabilitiesSupported().hashCode();
        }
        if (getLatencySensitivitySupported() != null) {
            _hashCode += getLatencySensitivitySupported().hashCode();
        }
        if (getStoragePolicySupported() != null) {
            _hashCode += getStoragePolicySupported().hashCode();
        }
        if (getAccel3DSupported() != null) {
            _hashCode += getAccel3DSupported().hashCode();
        }
        if (getReliableMemoryAware() != null) {
            _hashCode += getReliableMemoryAware().hashCode();
        }
        if (getMultipleNetworkStackInstanceSupported() != null) {
            _hashCode += getMultipleNetworkStackInstanceSupported().hashCode();
        }
        if (getMessageBusProxySupported() != null) {
            _hashCode += getMessageBusProxySupported().hashCode();
        }
        if (getVsanSupported() != null) {
            _hashCode += getVsanSupported().hashCode();
        }
        if (getVFlashSupported() != null) {
            _hashCode += getVFlashSupported().hashCode();
        }
        if (getHostAccessManagerSupported() != null) {
            _hashCode += getHostAccessManagerSupported().hashCode();
        }
        if (getProvisioningNicSelectionSupported() != null) {
            _hashCode += getProvisioningNicSelectionSupported().hashCode();
        }
        if (getNfs41Supported() != null) {
            _hashCode += getNfs41Supported().hashCode();
        }
        if (getTurnDiskLocatorLedSupported() != null) {
            _hashCode += getTurnDiskLocatorLedSupported().hashCode();
        }
        if (getVirtualVolumeDatastoreSupported() != null) {
            _hashCode += getVirtualVolumeDatastoreSupported().hashCode();
        }
        if (getMarkAsSsdSupported() != null) {
            _hashCode += getMarkAsSsdSupported().hashCode();
        }
        if (getMarkAsLocalSupported() != null) {
            _hashCode += getMarkAsLocalSupported().hashCode();
        }
        if (getSmartCardAuthenticationSupported() != null) {
            _hashCode += getSmartCardAuthenticationSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursiveResourcePoolsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recursiveResourcePoolsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuMemoryResourceConfigurationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuMemoryResourceConfigurationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebootSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rebootSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shutdownSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standbySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "standbySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipmiSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipmiSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRunningVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxRunningVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedVcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRegisteredVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxRegisteredVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePrincipalSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastorePrincipalSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sanSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nfsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscsiSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iscsiSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanTaggingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanTaggingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTeamingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicTeamingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highGuestMemSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "highGuestMemSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceModeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maintenanceModeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedRelocateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "suspendedRelocateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedSnapshotRelocateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "restrictedSnapshotRelocateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perVmSwapFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perVmSwapFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localSwapDatastoreSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localSwapDatastoreSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsharedSwapVMotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unsharedSwapVMotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backgroundSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preAssignedPCIUnitNumbersSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "preAssignedPCIUnitNumbersSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "screenshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scaledScreenshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scaledScreenshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageVMotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageVMotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionWithStorageVMotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionWithStorageVMotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionAcrossNetworkSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionAcrossNetworkSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumDisksSVMotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxNumDisksSVMotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hbrNicSelectionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hbrNicSelectionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrNfcNicSelectionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vrNfcNicSelectionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordReplaySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recordReplaySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replayUnsupportedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "replayUnsupportedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replayCompatibilityIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "replayCompatibilityIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smpFtSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smpFtSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftCompatibilityIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftCompatibilityIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smpFtCompatibilityIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smpFtCompatibilityIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVcpusPerFtVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxVcpusPerFtVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginBySSLThumbprintSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "loginBySSLThumbprintSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneFromSnapshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cloneFromSnapshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskBackingsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskBackingsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perVMNetworkTrafficShapingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perVMNetworkTrafficShapingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedCpuFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedCpuFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualExecUsageSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualExecUsageSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageIORMSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageIORMSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2Supported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2UnsupportedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2UnsupportedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2UnsupportedReasonExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2UnsupportedReasonExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedVmfsMajorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedVmfsMajorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VStorageCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vStorageCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotRelayoutSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotRelayoutSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallIpRulesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "firewallIpRulesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackageInfoSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "servicePackageInfoSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxHostRunningVms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxHostRunningVms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxHostSupportedVcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxHostSupportedVcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfsDatastoreMountCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfsDatastoreMountCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eightPlusHostVmfsSharedAccessSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eightPlusHostVmfsSharedAccessSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedHVSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nestedHVSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VPMCSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vPMCSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interVMCommunicationThroughVMCISupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "interVMCommunicationThroughVMCISupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledHardwareUpgradeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scheduledHardwareUpgradeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureCapabilitiesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureCapabilitiesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latencySensitivitySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "latencySensitivitySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagePolicySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storagePolicySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accel3DSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accel3dSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reliableMemoryAware");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reliableMemoryAware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleNetworkStackInstanceSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multipleNetworkStackInstanceSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageBusProxySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "messageBusProxySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAccessManagerSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostAccessManagerSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningNicSelectionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "provisioningNicSelectionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfs41Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nfs41Supported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turnDiskLocatorLedSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "turnDiskLocatorLedSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualVolumeDatastoreSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualVolumeDatastoreSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markAsSsdSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "markAsSsdSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markAsLocalSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "markAsLocalSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCardAuthenticationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smartCardAuthenticationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
