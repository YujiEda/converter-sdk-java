/**
 * VirtualMachineRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] device;

    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.VirtualMachineConnectionState connectionState;

    private com.vmware.converter.VirtualMachinePowerState powerState;

    private com.vmware.converter.VirtualMachineFaultToleranceState faultToleranceState;

    private com.vmware.converter.VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;

    private boolean toolsInstallerMounted;

    private java.util.Calendar suspendTime;

    private java.util.Calendar bootTime;

    private java.lang.Long suspendInterval;

    private com.vmware.converter.VirtualMachineQuestionInfo question;

    private java.lang.Long memoryOverhead;

    private java.lang.Integer maxCpuUsage;

    private java.lang.Integer maxMemoryUsage;

    private int numMksConnections;

    private com.vmware.converter.VirtualMachineRecordReplayState recordReplayState;

    private java.lang.Boolean cleanPowerOff;

    private java.lang.String needSecondaryReason;

    private java.lang.Boolean onlineStandby;

    private java.lang.String minRequiredEVCModeKey;

    private java.lang.Boolean consolidationNeeded;

    private com.vmware.converter.VirtualMachineFeatureRequirement[] offlineFeatureRequirement;

    private com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement;

    private com.vmware.converter.HostFeatureMask[] featureMask;

    private java.lang.Long vFlashCacheAllocation;

    private java.lang.Boolean paused;

    private java.lang.Boolean snapshotInBackground;

    private java.lang.Boolean quiescedForkParent;

    public VirtualMachineRuntimeInfo() {
    }

    public VirtualMachineRuntimeInfo(
           com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] device,
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.VirtualMachineConnectionState connectionState,
           com.vmware.converter.VirtualMachinePowerState powerState,
           com.vmware.converter.VirtualMachineFaultToleranceState faultToleranceState,
           com.vmware.converter.VirtualMachineRuntimeInfoDasProtectionState dasVmProtection,
           boolean toolsInstallerMounted,
           java.util.Calendar suspendTime,
           java.util.Calendar bootTime,
           java.lang.Long suspendInterval,
           com.vmware.converter.VirtualMachineQuestionInfo question,
           java.lang.Long memoryOverhead,
           java.lang.Integer maxCpuUsage,
           java.lang.Integer maxMemoryUsage,
           int numMksConnections,
           com.vmware.converter.VirtualMachineRecordReplayState recordReplayState,
           java.lang.Boolean cleanPowerOff,
           java.lang.String needSecondaryReason,
           java.lang.Boolean onlineStandby,
           java.lang.String minRequiredEVCModeKey,
           java.lang.Boolean consolidationNeeded,
           com.vmware.converter.VirtualMachineFeatureRequirement[] offlineFeatureRequirement,
           com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement,
           com.vmware.converter.HostFeatureMask[] featureMask,
           java.lang.Long vFlashCacheAllocation,
           java.lang.Boolean paused,
           java.lang.Boolean snapshotInBackground,
           java.lang.Boolean quiescedForkParent) {
        this.device = device;
        this.host = host;
        this.connectionState = connectionState;
        this.powerState = powerState;
        this.faultToleranceState = faultToleranceState;
        this.dasVmProtection = dasVmProtection;
        this.toolsInstallerMounted = toolsInstallerMounted;
        this.suspendTime = suspendTime;
        this.bootTime = bootTime;
        this.suspendInterval = suspendInterval;
        this.question = question;
        this.memoryOverhead = memoryOverhead;
        this.maxCpuUsage = maxCpuUsage;
        this.maxMemoryUsage = maxMemoryUsage;
        this.numMksConnections = numMksConnections;
        this.recordReplayState = recordReplayState;
        this.cleanPowerOff = cleanPowerOff;
        this.needSecondaryReason = needSecondaryReason;
        this.onlineStandby = onlineStandby;
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
        this.consolidationNeeded = consolidationNeeded;
        this.offlineFeatureRequirement = offlineFeatureRequirement;
        this.featureRequirement = featureRequirement;
        this.featureMask = featureMask;
        this.vFlashCacheAllocation = vFlashCacheAllocation;
        this.paused = paused;
        this.snapshotInBackground = snapshotInBackground;
        this.quiescedForkParent = quiescedForkParent;
    }


    /**
     * Gets the device value for this VirtualMachineRuntimeInfo.
     * 
     * @return device
     */
    public com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] getDevice() {
        return device;
    }


    /**
     * Sets the device value for this VirtualMachineRuntimeInfo.
     * 
     * @param device
     */
    public void setDevice(com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] device) {
        this.device = device;
    }

    public com.vmware.converter.VirtualMachineDeviceRuntimeInfo getDevice(int i) {
        return this.device[i];
    }

    public void setDevice(int i, com.vmware.converter.VirtualMachineDeviceRuntimeInfo _value) {
        this.device[i] = _value;
    }


    /**
     * Gets the host value for this VirtualMachineRuntimeInfo.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this VirtualMachineRuntimeInfo.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the connectionState value for this VirtualMachineRuntimeInfo.
     * 
     * @return connectionState
     */
    public com.vmware.converter.VirtualMachineConnectionState getConnectionState() {
        return connectionState;
    }


    /**
     * Sets the connectionState value for this VirtualMachineRuntimeInfo.
     * 
     * @param connectionState
     */
    public void setConnectionState(com.vmware.converter.VirtualMachineConnectionState connectionState) {
        this.connectionState = connectionState;
    }


    /**
     * Gets the powerState value for this VirtualMachineRuntimeInfo.
     * 
     * @return powerState
     */
    public com.vmware.converter.VirtualMachinePowerState getPowerState() {
        return powerState;
    }


    /**
     * Sets the powerState value for this VirtualMachineRuntimeInfo.
     * 
     * @param powerState
     */
    public void setPowerState(com.vmware.converter.VirtualMachinePowerState powerState) {
        this.powerState = powerState;
    }


    /**
     * Gets the faultToleranceState value for this VirtualMachineRuntimeInfo.
     * 
     * @return faultToleranceState
     */
    public com.vmware.converter.VirtualMachineFaultToleranceState getFaultToleranceState() {
        return faultToleranceState;
    }


    /**
     * Sets the faultToleranceState value for this VirtualMachineRuntimeInfo.
     * 
     * @param faultToleranceState
     */
    public void setFaultToleranceState(com.vmware.converter.VirtualMachineFaultToleranceState faultToleranceState) {
        this.faultToleranceState = faultToleranceState;
    }


    /**
     * Gets the dasVmProtection value for this VirtualMachineRuntimeInfo.
     * 
     * @return dasVmProtection
     */
    public com.vmware.converter.VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return dasVmProtection;
    }


    /**
     * Sets the dasVmProtection value for this VirtualMachineRuntimeInfo.
     * 
     * @param dasVmProtection
     */
    public void setDasVmProtection(com.vmware.converter.VirtualMachineRuntimeInfoDasProtectionState dasVmProtection) {
        this.dasVmProtection = dasVmProtection;
    }


    /**
     * Gets the toolsInstallerMounted value for this VirtualMachineRuntimeInfo.
     * 
     * @return toolsInstallerMounted
     */
    public boolean isToolsInstallerMounted() {
        return toolsInstallerMounted;
    }


    /**
     * Sets the toolsInstallerMounted value for this VirtualMachineRuntimeInfo.
     * 
     * @param toolsInstallerMounted
     */
    public void setToolsInstallerMounted(boolean toolsInstallerMounted) {
        this.toolsInstallerMounted = toolsInstallerMounted;
    }


    /**
     * Gets the suspendTime value for this VirtualMachineRuntimeInfo.
     * 
     * @return suspendTime
     */
    public java.util.Calendar getSuspendTime() {
        return suspendTime;
    }


    /**
     * Sets the suspendTime value for this VirtualMachineRuntimeInfo.
     * 
     * @param suspendTime
     */
    public void setSuspendTime(java.util.Calendar suspendTime) {
        this.suspendTime = suspendTime;
    }


    /**
     * Gets the bootTime value for this VirtualMachineRuntimeInfo.
     * 
     * @return bootTime
     */
    public java.util.Calendar getBootTime() {
        return bootTime;
    }


    /**
     * Sets the bootTime value for this VirtualMachineRuntimeInfo.
     * 
     * @param bootTime
     */
    public void setBootTime(java.util.Calendar bootTime) {
        this.bootTime = bootTime;
    }


    /**
     * Gets the suspendInterval value for this VirtualMachineRuntimeInfo.
     * 
     * @return suspendInterval
     */
    public java.lang.Long getSuspendInterval() {
        return suspendInterval;
    }


    /**
     * Sets the suspendInterval value for this VirtualMachineRuntimeInfo.
     * 
     * @param suspendInterval
     */
    public void setSuspendInterval(java.lang.Long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }


    /**
     * Gets the question value for this VirtualMachineRuntimeInfo.
     * 
     * @return question
     */
    public com.vmware.converter.VirtualMachineQuestionInfo getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this VirtualMachineRuntimeInfo.
     * 
     * @param question
     */
    public void setQuestion(com.vmware.converter.VirtualMachineQuestionInfo question) {
        this.question = question;
    }


    /**
     * Gets the memoryOverhead value for this VirtualMachineRuntimeInfo.
     * 
     * @return memoryOverhead
     */
    public java.lang.Long getMemoryOverhead() {
        return memoryOverhead;
    }


    /**
     * Sets the memoryOverhead value for this VirtualMachineRuntimeInfo.
     * 
     * @param memoryOverhead
     */
    public void setMemoryOverhead(java.lang.Long memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
    }


    /**
     * Gets the maxCpuUsage value for this VirtualMachineRuntimeInfo.
     * 
     * @return maxCpuUsage
     */
    public java.lang.Integer getMaxCpuUsage() {
        return maxCpuUsage;
    }


    /**
     * Sets the maxCpuUsage value for this VirtualMachineRuntimeInfo.
     * 
     * @param maxCpuUsage
     */
    public void setMaxCpuUsage(java.lang.Integer maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }


    /**
     * Gets the maxMemoryUsage value for this VirtualMachineRuntimeInfo.
     * 
     * @return maxMemoryUsage
     */
    public java.lang.Integer getMaxMemoryUsage() {
        return maxMemoryUsage;
    }


    /**
     * Sets the maxMemoryUsage value for this VirtualMachineRuntimeInfo.
     * 
     * @param maxMemoryUsage
     */
    public void setMaxMemoryUsage(java.lang.Integer maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }


    /**
     * Gets the numMksConnections value for this VirtualMachineRuntimeInfo.
     * 
     * @return numMksConnections
     */
    public int getNumMksConnections() {
        return numMksConnections;
    }


    /**
     * Sets the numMksConnections value for this VirtualMachineRuntimeInfo.
     * 
     * @param numMksConnections
     */
    public void setNumMksConnections(int numMksConnections) {
        this.numMksConnections = numMksConnections;
    }


    /**
     * Gets the recordReplayState value for this VirtualMachineRuntimeInfo.
     * 
     * @return recordReplayState
     */
    public com.vmware.converter.VirtualMachineRecordReplayState getRecordReplayState() {
        return recordReplayState;
    }


    /**
     * Sets the recordReplayState value for this VirtualMachineRuntimeInfo.
     * 
     * @param recordReplayState
     */
    public void setRecordReplayState(com.vmware.converter.VirtualMachineRecordReplayState recordReplayState) {
        this.recordReplayState = recordReplayState;
    }


    /**
     * Gets the cleanPowerOff value for this VirtualMachineRuntimeInfo.
     * 
     * @return cleanPowerOff
     */
    public java.lang.Boolean getCleanPowerOff() {
        return cleanPowerOff;
    }


    /**
     * Sets the cleanPowerOff value for this VirtualMachineRuntimeInfo.
     * 
     * @param cleanPowerOff
     */
    public void setCleanPowerOff(java.lang.Boolean cleanPowerOff) {
        this.cleanPowerOff = cleanPowerOff;
    }


    /**
     * Gets the needSecondaryReason value for this VirtualMachineRuntimeInfo.
     * 
     * @return needSecondaryReason
     */
    public java.lang.String getNeedSecondaryReason() {
        return needSecondaryReason;
    }


    /**
     * Sets the needSecondaryReason value for this VirtualMachineRuntimeInfo.
     * 
     * @param needSecondaryReason
     */
    public void setNeedSecondaryReason(java.lang.String needSecondaryReason) {
        this.needSecondaryReason = needSecondaryReason;
    }


    /**
     * Gets the onlineStandby value for this VirtualMachineRuntimeInfo.
     * 
     * @return onlineStandby
     */
    public java.lang.Boolean getOnlineStandby() {
        return onlineStandby;
    }


    /**
     * Sets the onlineStandby value for this VirtualMachineRuntimeInfo.
     * 
     * @param onlineStandby
     */
    public void setOnlineStandby(java.lang.Boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }


    /**
     * Gets the minRequiredEVCModeKey value for this VirtualMachineRuntimeInfo.
     * 
     * @return minRequiredEVCModeKey
     */
    public java.lang.String getMinRequiredEVCModeKey() {
        return minRequiredEVCModeKey;
    }


    /**
     * Sets the minRequiredEVCModeKey value for this VirtualMachineRuntimeInfo.
     * 
     * @param minRequiredEVCModeKey
     */
    public void setMinRequiredEVCModeKey(java.lang.String minRequiredEVCModeKey) {
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
    }


    /**
     * Gets the consolidationNeeded value for this VirtualMachineRuntimeInfo.
     * 
     * @return consolidationNeeded
     */
    public java.lang.Boolean getConsolidationNeeded() {
        return consolidationNeeded;
    }


    /**
     * Sets the consolidationNeeded value for this VirtualMachineRuntimeInfo.
     * 
     * @param consolidationNeeded
     */
    public void setConsolidationNeeded(java.lang.Boolean consolidationNeeded) {
        this.consolidationNeeded = consolidationNeeded;
    }


    /**
     * Gets the offlineFeatureRequirement value for this VirtualMachineRuntimeInfo.
     * 
     * @return offlineFeatureRequirement
     */
    public com.vmware.converter.VirtualMachineFeatureRequirement[] getOfflineFeatureRequirement() {
        return offlineFeatureRequirement;
    }


    /**
     * Sets the offlineFeatureRequirement value for this VirtualMachineRuntimeInfo.
     * 
     * @param offlineFeatureRequirement
     */
    public void setOfflineFeatureRequirement(com.vmware.converter.VirtualMachineFeatureRequirement[] offlineFeatureRequirement) {
        this.offlineFeatureRequirement = offlineFeatureRequirement;
    }

    public com.vmware.converter.VirtualMachineFeatureRequirement getOfflineFeatureRequirement(int i) {
        return this.offlineFeatureRequirement[i];
    }

    public void setOfflineFeatureRequirement(int i, com.vmware.converter.VirtualMachineFeatureRequirement _value) {
        this.offlineFeatureRequirement[i] = _value;
    }


    /**
     * Gets the featureRequirement value for this VirtualMachineRuntimeInfo.
     * 
     * @return featureRequirement
     */
    public com.vmware.converter.VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return featureRequirement;
    }


    /**
     * Sets the featureRequirement value for this VirtualMachineRuntimeInfo.
     * 
     * @param featureRequirement
     */
    public void setFeatureRequirement(com.vmware.converter.VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public com.vmware.converter.VirtualMachineFeatureRequirement getFeatureRequirement(int i) {
        return this.featureRequirement[i];
    }

    public void setFeatureRequirement(int i, com.vmware.converter.VirtualMachineFeatureRequirement _value) {
        this.featureRequirement[i] = _value;
    }


    /**
     * Gets the featureMask value for this VirtualMachineRuntimeInfo.
     * 
     * @return featureMask
     */
    public com.vmware.converter.HostFeatureMask[] getFeatureMask() {
        return featureMask;
    }


    /**
     * Sets the featureMask value for this VirtualMachineRuntimeInfo.
     * 
     * @param featureMask
     */
    public void setFeatureMask(com.vmware.converter.HostFeatureMask[] featureMask) {
        this.featureMask = featureMask;
    }

    public com.vmware.converter.HostFeatureMask getFeatureMask(int i) {
        return this.featureMask[i];
    }

    public void setFeatureMask(int i, com.vmware.converter.HostFeatureMask _value) {
        this.featureMask[i] = _value;
    }


    /**
     * Gets the vFlashCacheAllocation value for this VirtualMachineRuntimeInfo.
     * 
     * @return vFlashCacheAllocation
     */
    public java.lang.Long getVFlashCacheAllocation() {
        return vFlashCacheAllocation;
    }


    /**
     * Sets the vFlashCacheAllocation value for this VirtualMachineRuntimeInfo.
     * 
     * @param vFlashCacheAllocation
     */
    public void setVFlashCacheAllocation(java.lang.Long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }


    /**
     * Gets the paused value for this VirtualMachineRuntimeInfo.
     * 
     * @return paused
     */
    public java.lang.Boolean getPaused() {
        return paused;
    }


    /**
     * Sets the paused value for this VirtualMachineRuntimeInfo.
     * 
     * @param paused
     */
    public void setPaused(java.lang.Boolean paused) {
        this.paused = paused;
    }


    /**
     * Gets the snapshotInBackground value for this VirtualMachineRuntimeInfo.
     * 
     * @return snapshotInBackground
     */
    public java.lang.Boolean getSnapshotInBackground() {
        return snapshotInBackground;
    }


    /**
     * Sets the snapshotInBackground value for this VirtualMachineRuntimeInfo.
     * 
     * @param snapshotInBackground
     */
    public void setSnapshotInBackground(java.lang.Boolean snapshotInBackground) {
        this.snapshotInBackground = snapshotInBackground;
    }


    /**
     * Gets the quiescedForkParent value for this VirtualMachineRuntimeInfo.
     * 
     * @return quiescedForkParent
     */
    public java.lang.Boolean getQuiescedForkParent() {
        return quiescedForkParent;
    }


    /**
     * Sets the quiescedForkParent value for this VirtualMachineRuntimeInfo.
     * 
     * @param quiescedForkParent
     */
    public void setQuiescedForkParent(java.lang.Boolean quiescedForkParent) {
        this.quiescedForkParent = quiescedForkParent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineRuntimeInfo)) return false;
        VirtualMachineRuntimeInfo other = (VirtualMachineRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              java.util.Arrays.equals(this.device, other.getDevice()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.connectionState==null && other.getConnectionState()==null) || 
             (this.connectionState!=null &&
              this.connectionState.equals(other.getConnectionState()))) &&
            ((this.powerState==null && other.getPowerState()==null) || 
             (this.powerState!=null &&
              this.powerState.equals(other.getPowerState()))) &&
            ((this.faultToleranceState==null && other.getFaultToleranceState()==null) || 
             (this.faultToleranceState!=null &&
              this.faultToleranceState.equals(other.getFaultToleranceState()))) &&
            ((this.dasVmProtection==null && other.getDasVmProtection()==null) || 
             (this.dasVmProtection!=null &&
              this.dasVmProtection.equals(other.getDasVmProtection()))) &&
            this.toolsInstallerMounted == other.isToolsInstallerMounted() &&
            ((this.suspendTime==null && other.getSuspendTime()==null) || 
             (this.suspendTime!=null &&
              this.suspendTime.equals(other.getSuspendTime()))) &&
            ((this.bootTime==null && other.getBootTime()==null) || 
             (this.bootTime!=null &&
              this.bootTime.equals(other.getBootTime()))) &&
            ((this.suspendInterval==null && other.getSuspendInterval()==null) || 
             (this.suspendInterval!=null &&
              this.suspendInterval.equals(other.getSuspendInterval()))) &&
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.memoryOverhead==null && other.getMemoryOverhead()==null) || 
             (this.memoryOverhead!=null &&
              this.memoryOverhead.equals(other.getMemoryOverhead()))) &&
            ((this.maxCpuUsage==null && other.getMaxCpuUsage()==null) || 
             (this.maxCpuUsage!=null &&
              this.maxCpuUsage.equals(other.getMaxCpuUsage()))) &&
            ((this.maxMemoryUsage==null && other.getMaxMemoryUsage()==null) || 
             (this.maxMemoryUsage!=null &&
              this.maxMemoryUsage.equals(other.getMaxMemoryUsage()))) &&
            this.numMksConnections == other.getNumMksConnections() &&
            ((this.recordReplayState==null && other.getRecordReplayState()==null) || 
             (this.recordReplayState!=null &&
              this.recordReplayState.equals(other.getRecordReplayState()))) &&
            ((this.cleanPowerOff==null && other.getCleanPowerOff()==null) || 
             (this.cleanPowerOff!=null &&
              this.cleanPowerOff.equals(other.getCleanPowerOff()))) &&
            ((this.needSecondaryReason==null && other.getNeedSecondaryReason()==null) || 
             (this.needSecondaryReason!=null &&
              this.needSecondaryReason.equals(other.getNeedSecondaryReason()))) &&
            ((this.onlineStandby==null && other.getOnlineStandby()==null) || 
             (this.onlineStandby!=null &&
              this.onlineStandby.equals(other.getOnlineStandby()))) &&
            ((this.minRequiredEVCModeKey==null && other.getMinRequiredEVCModeKey()==null) || 
             (this.minRequiredEVCModeKey!=null &&
              this.minRequiredEVCModeKey.equals(other.getMinRequiredEVCModeKey()))) &&
            ((this.consolidationNeeded==null && other.getConsolidationNeeded()==null) || 
             (this.consolidationNeeded!=null &&
              this.consolidationNeeded.equals(other.getConsolidationNeeded()))) &&
            ((this.offlineFeatureRequirement==null && other.getOfflineFeatureRequirement()==null) || 
             (this.offlineFeatureRequirement!=null &&
              java.util.Arrays.equals(this.offlineFeatureRequirement, other.getOfflineFeatureRequirement()))) &&
            ((this.featureRequirement==null && other.getFeatureRequirement()==null) || 
             (this.featureRequirement!=null &&
              java.util.Arrays.equals(this.featureRequirement, other.getFeatureRequirement()))) &&
            ((this.featureMask==null && other.getFeatureMask()==null) || 
             (this.featureMask!=null &&
              java.util.Arrays.equals(this.featureMask, other.getFeatureMask()))) &&
            ((this.vFlashCacheAllocation==null && other.getVFlashCacheAllocation()==null) || 
             (this.vFlashCacheAllocation!=null &&
              this.vFlashCacheAllocation.equals(other.getVFlashCacheAllocation()))) &&
            ((this.paused==null && other.getPaused()==null) || 
             (this.paused!=null &&
              this.paused.equals(other.getPaused()))) &&
            ((this.snapshotInBackground==null && other.getSnapshotInBackground()==null) || 
             (this.snapshotInBackground!=null &&
              this.snapshotInBackground.equals(other.getSnapshotInBackground()))) &&
            ((this.quiescedForkParent==null && other.getQuiescedForkParent()==null) || 
             (this.quiescedForkParent!=null &&
              this.quiescedForkParent.equals(other.getQuiescedForkParent())));
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
        if (getDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getConnectionState() != null) {
            _hashCode += getConnectionState().hashCode();
        }
        if (getPowerState() != null) {
            _hashCode += getPowerState().hashCode();
        }
        if (getFaultToleranceState() != null) {
            _hashCode += getFaultToleranceState().hashCode();
        }
        if (getDasVmProtection() != null) {
            _hashCode += getDasVmProtection().hashCode();
        }
        _hashCode += (isToolsInstallerMounted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSuspendTime() != null) {
            _hashCode += getSuspendTime().hashCode();
        }
        if (getBootTime() != null) {
            _hashCode += getBootTime().hashCode();
        }
        if (getSuspendInterval() != null) {
            _hashCode += getSuspendInterval().hashCode();
        }
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getMemoryOverhead() != null) {
            _hashCode += getMemoryOverhead().hashCode();
        }
        if (getMaxCpuUsage() != null) {
            _hashCode += getMaxCpuUsage().hashCode();
        }
        if (getMaxMemoryUsage() != null) {
            _hashCode += getMaxMemoryUsage().hashCode();
        }
        _hashCode += getNumMksConnections();
        if (getRecordReplayState() != null) {
            _hashCode += getRecordReplayState().hashCode();
        }
        if (getCleanPowerOff() != null) {
            _hashCode += getCleanPowerOff().hashCode();
        }
        if (getNeedSecondaryReason() != null) {
            _hashCode += getNeedSecondaryReason().hashCode();
        }
        if (getOnlineStandby() != null) {
            _hashCode += getOnlineStandby().hashCode();
        }
        if (getMinRequiredEVCModeKey() != null) {
            _hashCode += getMinRequiredEVCModeKey().hashCode();
        }
        if (getConsolidationNeeded() != null) {
            _hashCode += getConsolidationNeeded().hashCode();
        }
        if (getOfflineFeatureRequirement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfflineFeatureRequirement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfflineFeatureRequirement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatureRequirement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureRequirement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureRequirement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatureMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureMask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVFlashCacheAllocation() != null) {
            _hashCode += getVFlashCacheAllocation().hashCode();
        }
        if (getPaused() != null) {
            _hashCode += getPaused().hashCode();
        }
        if (getSnapshotInBackground() != null) {
            _hashCode += getSnapshotInBackground().hashCode();
        }
        if (getQuiescedForkParent() != null) {
            _hashCode += getQuiescedForkParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDeviceRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConnectionState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePowerState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultToleranceState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultToleranceState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFaultToleranceState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasVmProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasVmProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRuntimeInfoDasProtectionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsInstallerMounted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsInstallerMounted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "suspendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "suspendInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "question"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineQuestionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryOverhead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryOverhead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpuUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxCpuUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemoryUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMemoryUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numMksConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numMksConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordReplayState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recordReplayState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRecordReplayState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleanPowerOff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cleanPowerOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needSecondaryReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "needSecondaryReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineStandby");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "onlineStandby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minRequiredEVCModeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "minRequiredEVCModeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consolidationNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineFeatureRequirement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "offlineFeatureRequirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFeatureRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureRequirement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureRequirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFeatureRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureMask"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashCacheAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashCacheAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paused");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "paused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotInBackground");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotInBackground"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quiescedForkParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "quiescedForkParent"));
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
