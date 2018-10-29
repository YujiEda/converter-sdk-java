/**
 * ConfigTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConfigTarget  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int numCpus;

    private int numCpuCores;

    private int numNumaNodes;

    private java.lang.Boolean smcPresent;

    private com.vmware.converter.VirtualMachineDatastoreInfo[] datastore;

    private com.vmware.converter.VirtualMachineNetworkInfo[] network;

    private com.vmware.converter.OpaqueNetworkTargetInfo[] opaqueNetwork;

    private com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup;

    private com.vmware.converter.DistributedVirtualSwitchInfo[] distributedVirtualSwitch;

    private com.vmware.converter.VirtualMachineCdromInfo[] cdRom;

    private com.vmware.converter.VirtualMachineSerialInfo[] serial;

    private com.vmware.converter.VirtualMachineParallelInfo[] parallel;

    private com.vmware.converter.VirtualMachineSoundInfo[] sound;

    private com.vmware.converter.VirtualMachineUsbInfo[] usb;

    private com.vmware.converter.VirtualMachineFloppyInfo[] floppy;

    private com.vmware.converter.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo;

    private com.vmware.converter.VirtualMachineScsiPassthroughInfo[] scsiPassthrough;

    private com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] scsiDisk;

    private com.vmware.converter.VirtualMachineIdeDiskDeviceInfo[] ideDisk;

    private int maxMemMBOptimalPerf;

    private com.vmware.converter.ResourcePoolRuntimeInfo resourcePool;

    private java.lang.Boolean autoVmotion;

    private com.vmware.converter.VirtualMachinePciPassthroughInfo[] pciPassthrough;

    private com.vmware.converter.VirtualMachineSriovInfo[] sriov;

    private com.vmware.converter.VirtualMachineVFlashModuleInfo[] vFlashModule;

    private com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes;

    public ConfigTarget() {
    }

    public ConfigTarget(
           int numCpus,
           int numCpuCores,
           int numNumaNodes,
           java.lang.Boolean smcPresent,
           com.vmware.converter.VirtualMachineDatastoreInfo[] datastore,
           com.vmware.converter.VirtualMachineNetworkInfo[] network,
           com.vmware.converter.OpaqueNetworkTargetInfo[] opaqueNetwork,
           com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup,
           com.vmware.converter.DistributedVirtualSwitchInfo[] distributedVirtualSwitch,
           com.vmware.converter.VirtualMachineCdromInfo[] cdRom,
           com.vmware.converter.VirtualMachineSerialInfo[] serial,
           com.vmware.converter.VirtualMachineParallelInfo[] parallel,
           com.vmware.converter.VirtualMachineSoundInfo[] sound,
           com.vmware.converter.VirtualMachineUsbInfo[] usb,
           com.vmware.converter.VirtualMachineFloppyInfo[] floppy,
           com.vmware.converter.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo,
           com.vmware.converter.VirtualMachineScsiPassthroughInfo[] scsiPassthrough,
           com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] scsiDisk,
           com.vmware.converter.VirtualMachineIdeDiskDeviceInfo[] ideDisk,
           int maxMemMBOptimalPerf,
           com.vmware.converter.ResourcePoolRuntimeInfo resourcePool,
           java.lang.Boolean autoVmotion,
           com.vmware.converter.VirtualMachinePciPassthroughInfo[] pciPassthrough,
           com.vmware.converter.VirtualMachineSriovInfo[] sriov,
           com.vmware.converter.VirtualMachineVFlashModuleInfo[] vFlashModule,
           com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes) {
        this.numCpus = numCpus;
        this.numCpuCores = numCpuCores;
        this.numNumaNodes = numNumaNodes;
        this.smcPresent = smcPresent;
        this.datastore = datastore;
        this.network = network;
        this.opaqueNetwork = opaqueNetwork;
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
        this.distributedVirtualSwitch = distributedVirtualSwitch;
        this.cdRom = cdRom;
        this.serial = serial;
        this.parallel = parallel;
        this.sound = sound;
        this.usb = usb;
        this.floppy = floppy;
        this.legacyNetworkInfo = legacyNetworkInfo;
        this.scsiPassthrough = scsiPassthrough;
        this.scsiDisk = scsiDisk;
        this.ideDisk = ideDisk;
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
        this.resourcePool = resourcePool;
        this.autoVmotion = autoVmotion;
        this.pciPassthrough = pciPassthrough;
        this.sriov = sriov;
        this.vFlashModule = vFlashModule;
        this.sharedGpuPassthroughTypes = sharedGpuPassthroughTypes;
    }


    /**
     * Gets the numCpus value for this ConfigTarget.
     * 
     * @return numCpus
     */
    public int getNumCpus() {
        return numCpus;
    }


    /**
     * Sets the numCpus value for this ConfigTarget.
     * 
     * @param numCpus
     */
    public void setNumCpus(int numCpus) {
        this.numCpus = numCpus;
    }


    /**
     * Gets the numCpuCores value for this ConfigTarget.
     * 
     * @return numCpuCores
     */
    public int getNumCpuCores() {
        return numCpuCores;
    }


    /**
     * Sets the numCpuCores value for this ConfigTarget.
     * 
     * @param numCpuCores
     */
    public void setNumCpuCores(int numCpuCores) {
        this.numCpuCores = numCpuCores;
    }


    /**
     * Gets the numNumaNodes value for this ConfigTarget.
     * 
     * @return numNumaNodes
     */
    public int getNumNumaNodes() {
        return numNumaNodes;
    }


    /**
     * Sets the numNumaNodes value for this ConfigTarget.
     * 
     * @param numNumaNodes
     */
    public void setNumNumaNodes(int numNumaNodes) {
        this.numNumaNodes = numNumaNodes;
    }


    /**
     * Gets the smcPresent value for this ConfigTarget.
     * 
     * @return smcPresent
     */
    public java.lang.Boolean getSmcPresent() {
        return smcPresent;
    }


    /**
     * Sets the smcPresent value for this ConfigTarget.
     * 
     * @param smcPresent
     */
    public void setSmcPresent(java.lang.Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }


    /**
     * Gets the datastore value for this ConfigTarget.
     * 
     * @return datastore
     */
    public com.vmware.converter.VirtualMachineDatastoreInfo[] getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this ConfigTarget.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.VirtualMachineDatastoreInfo[] datastore) {
        this.datastore = datastore;
    }

    public com.vmware.converter.VirtualMachineDatastoreInfo getDatastore(int i) {
        return this.datastore[i];
    }

    public void setDatastore(int i, com.vmware.converter.VirtualMachineDatastoreInfo _value) {
        this.datastore[i] = _value;
    }


    /**
     * Gets the network value for this ConfigTarget.
     * 
     * @return network
     */
    public com.vmware.converter.VirtualMachineNetworkInfo[] getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this ConfigTarget.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.converter.VirtualMachineNetworkInfo[] network) {
        this.network = network;
    }

    public com.vmware.converter.VirtualMachineNetworkInfo getNetwork(int i) {
        return this.network[i];
    }

    public void setNetwork(int i, com.vmware.converter.VirtualMachineNetworkInfo _value) {
        this.network[i] = _value;
    }


    /**
     * Gets the opaqueNetwork value for this ConfigTarget.
     * 
     * @return opaqueNetwork
     */
    public com.vmware.converter.OpaqueNetworkTargetInfo[] getOpaqueNetwork() {
        return opaqueNetwork;
    }


    /**
     * Sets the opaqueNetwork value for this ConfigTarget.
     * 
     * @param opaqueNetwork
     */
    public void setOpaqueNetwork(com.vmware.converter.OpaqueNetworkTargetInfo[] opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public com.vmware.converter.OpaqueNetworkTargetInfo getOpaqueNetwork(int i) {
        return this.opaqueNetwork[i];
    }

    public void setOpaqueNetwork(int i, com.vmware.converter.OpaqueNetworkTargetInfo _value) {
        this.opaqueNetwork[i] = _value;
    }


    /**
     * Gets the distributedVirtualPortgroup value for this ConfigTarget.
     * 
     * @return distributedVirtualPortgroup
     */
    public com.vmware.converter.DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroup() {
        return distributedVirtualPortgroup;
    }


    /**
     * Sets the distributedVirtualPortgroup value for this ConfigTarget.
     * 
     * @param distributedVirtualPortgroup
     */
    public void setDistributedVirtualPortgroup(com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public com.vmware.converter.DistributedVirtualPortgroupInfo getDistributedVirtualPortgroup(int i) {
        return this.distributedVirtualPortgroup[i];
    }

    public void setDistributedVirtualPortgroup(int i, com.vmware.converter.DistributedVirtualPortgroupInfo _value) {
        this.distributedVirtualPortgroup[i] = _value;
    }


    /**
     * Gets the distributedVirtualSwitch value for this ConfigTarget.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.converter.DistributedVirtualSwitchInfo[] getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this ConfigTarget.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.converter.DistributedVirtualSwitchInfo[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public com.vmware.converter.DistributedVirtualSwitchInfo getDistributedVirtualSwitch(int i) {
        return this.distributedVirtualSwitch[i];
    }

    public void setDistributedVirtualSwitch(int i, com.vmware.converter.DistributedVirtualSwitchInfo _value) {
        this.distributedVirtualSwitch[i] = _value;
    }


    /**
     * Gets the cdRom value for this ConfigTarget.
     * 
     * @return cdRom
     */
    public com.vmware.converter.VirtualMachineCdromInfo[] getCdRom() {
        return cdRom;
    }


    /**
     * Sets the cdRom value for this ConfigTarget.
     * 
     * @param cdRom
     */
    public void setCdRom(com.vmware.converter.VirtualMachineCdromInfo[] cdRom) {
        this.cdRom = cdRom;
    }

    public com.vmware.converter.VirtualMachineCdromInfo getCdRom(int i) {
        return this.cdRom[i];
    }

    public void setCdRom(int i, com.vmware.converter.VirtualMachineCdromInfo _value) {
        this.cdRom[i] = _value;
    }


    /**
     * Gets the serial value for this ConfigTarget.
     * 
     * @return serial
     */
    public com.vmware.converter.VirtualMachineSerialInfo[] getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ConfigTarget.
     * 
     * @param serial
     */
    public void setSerial(com.vmware.converter.VirtualMachineSerialInfo[] serial) {
        this.serial = serial;
    }

    public com.vmware.converter.VirtualMachineSerialInfo getSerial(int i) {
        return this.serial[i];
    }

    public void setSerial(int i, com.vmware.converter.VirtualMachineSerialInfo _value) {
        this.serial[i] = _value;
    }


    /**
     * Gets the parallel value for this ConfigTarget.
     * 
     * @return parallel
     */
    public com.vmware.converter.VirtualMachineParallelInfo[] getParallel() {
        return parallel;
    }


    /**
     * Sets the parallel value for this ConfigTarget.
     * 
     * @param parallel
     */
    public void setParallel(com.vmware.converter.VirtualMachineParallelInfo[] parallel) {
        this.parallel = parallel;
    }

    public com.vmware.converter.VirtualMachineParallelInfo getParallel(int i) {
        return this.parallel[i];
    }

    public void setParallel(int i, com.vmware.converter.VirtualMachineParallelInfo _value) {
        this.parallel[i] = _value;
    }


    /**
     * Gets the sound value for this ConfigTarget.
     * 
     * @return sound
     */
    public com.vmware.converter.VirtualMachineSoundInfo[] getSound() {
        return sound;
    }


    /**
     * Sets the sound value for this ConfigTarget.
     * 
     * @param sound
     */
    public void setSound(com.vmware.converter.VirtualMachineSoundInfo[] sound) {
        this.sound = sound;
    }

    public com.vmware.converter.VirtualMachineSoundInfo getSound(int i) {
        return this.sound[i];
    }

    public void setSound(int i, com.vmware.converter.VirtualMachineSoundInfo _value) {
        this.sound[i] = _value;
    }


    /**
     * Gets the usb value for this ConfigTarget.
     * 
     * @return usb
     */
    public com.vmware.converter.VirtualMachineUsbInfo[] getUsb() {
        return usb;
    }


    /**
     * Sets the usb value for this ConfigTarget.
     * 
     * @param usb
     */
    public void setUsb(com.vmware.converter.VirtualMachineUsbInfo[] usb) {
        this.usb = usb;
    }

    public com.vmware.converter.VirtualMachineUsbInfo getUsb(int i) {
        return this.usb[i];
    }

    public void setUsb(int i, com.vmware.converter.VirtualMachineUsbInfo _value) {
        this.usb[i] = _value;
    }


    /**
     * Gets the floppy value for this ConfigTarget.
     * 
     * @return floppy
     */
    public com.vmware.converter.VirtualMachineFloppyInfo[] getFloppy() {
        return floppy;
    }


    /**
     * Sets the floppy value for this ConfigTarget.
     * 
     * @param floppy
     */
    public void setFloppy(com.vmware.converter.VirtualMachineFloppyInfo[] floppy) {
        this.floppy = floppy;
    }

    public com.vmware.converter.VirtualMachineFloppyInfo getFloppy(int i) {
        return this.floppy[i];
    }

    public void setFloppy(int i, com.vmware.converter.VirtualMachineFloppyInfo _value) {
        this.floppy[i] = _value;
    }


    /**
     * Gets the legacyNetworkInfo value for this ConfigTarget.
     * 
     * @return legacyNetworkInfo
     */
    public com.vmware.converter.VirtualMachineLegacyNetworkSwitchInfo[] getLegacyNetworkInfo() {
        return legacyNetworkInfo;
    }


    /**
     * Sets the legacyNetworkInfo value for this ConfigTarget.
     * 
     * @param legacyNetworkInfo
     */
    public void setLegacyNetworkInfo(com.vmware.converter.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo) {
        this.legacyNetworkInfo = legacyNetworkInfo;
    }

    public com.vmware.converter.VirtualMachineLegacyNetworkSwitchInfo getLegacyNetworkInfo(int i) {
        return this.legacyNetworkInfo[i];
    }

    public void setLegacyNetworkInfo(int i, com.vmware.converter.VirtualMachineLegacyNetworkSwitchInfo _value) {
        this.legacyNetworkInfo[i] = _value;
    }


    /**
     * Gets the scsiPassthrough value for this ConfigTarget.
     * 
     * @return scsiPassthrough
     */
    public com.vmware.converter.VirtualMachineScsiPassthroughInfo[] getScsiPassthrough() {
        return scsiPassthrough;
    }


    /**
     * Sets the scsiPassthrough value for this ConfigTarget.
     * 
     * @param scsiPassthrough
     */
    public void setScsiPassthrough(com.vmware.converter.VirtualMachineScsiPassthroughInfo[] scsiPassthrough) {
        this.scsiPassthrough = scsiPassthrough;
    }

    public com.vmware.converter.VirtualMachineScsiPassthroughInfo getScsiPassthrough(int i) {
        return this.scsiPassthrough[i];
    }

    public void setScsiPassthrough(int i, com.vmware.converter.VirtualMachineScsiPassthroughInfo _value) {
        this.scsiPassthrough[i] = _value;
    }


    /**
     * Gets the scsiDisk value for this ConfigTarget.
     * 
     * @return scsiDisk
     */
    public com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] getScsiDisk() {
        return scsiDisk;
    }


    /**
     * Sets the scsiDisk value for this ConfigTarget.
     * 
     * @param scsiDisk
     */
    public void setScsiDisk(com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] scsiDisk) {
        this.scsiDisk = scsiDisk;
    }

    public com.vmware.converter.VirtualMachineScsiDiskDeviceInfo getScsiDisk(int i) {
        return this.scsiDisk[i];
    }

    public void setScsiDisk(int i, com.vmware.converter.VirtualMachineScsiDiskDeviceInfo _value) {
        this.scsiDisk[i] = _value;
    }


    /**
     * Gets the ideDisk value for this ConfigTarget.
     * 
     * @return ideDisk
     */
    public com.vmware.converter.VirtualMachineIdeDiskDeviceInfo[] getIdeDisk() {
        return ideDisk;
    }


    /**
     * Sets the ideDisk value for this ConfigTarget.
     * 
     * @param ideDisk
     */
    public void setIdeDisk(com.vmware.converter.VirtualMachineIdeDiskDeviceInfo[] ideDisk) {
        this.ideDisk = ideDisk;
    }

    public com.vmware.converter.VirtualMachineIdeDiskDeviceInfo getIdeDisk(int i) {
        return this.ideDisk[i];
    }

    public void setIdeDisk(int i, com.vmware.converter.VirtualMachineIdeDiskDeviceInfo _value) {
        this.ideDisk[i] = _value;
    }


    /**
     * Gets the maxMemMBOptimalPerf value for this ConfigTarget.
     * 
     * @return maxMemMBOptimalPerf
     */
    public int getMaxMemMBOptimalPerf() {
        return maxMemMBOptimalPerf;
    }


    /**
     * Sets the maxMemMBOptimalPerf value for this ConfigTarget.
     * 
     * @param maxMemMBOptimalPerf
     */
    public void setMaxMemMBOptimalPerf(int maxMemMBOptimalPerf) {
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
    }


    /**
     * Gets the resourcePool value for this ConfigTarget.
     * 
     * @return resourcePool
     */
    public com.vmware.converter.ResourcePoolRuntimeInfo getResourcePool() {
        return resourcePool;
    }


    /**
     * Sets the resourcePool value for this ConfigTarget.
     * 
     * @param resourcePool
     */
    public void setResourcePool(com.vmware.converter.ResourcePoolRuntimeInfo resourcePool) {
        this.resourcePool = resourcePool;
    }


    /**
     * Gets the autoVmotion value for this ConfigTarget.
     * 
     * @return autoVmotion
     */
    public java.lang.Boolean getAutoVmotion() {
        return autoVmotion;
    }


    /**
     * Sets the autoVmotion value for this ConfigTarget.
     * 
     * @param autoVmotion
     */
    public void setAutoVmotion(java.lang.Boolean autoVmotion) {
        this.autoVmotion = autoVmotion;
    }


    /**
     * Gets the pciPassthrough value for this ConfigTarget.
     * 
     * @return pciPassthrough
     */
    public com.vmware.converter.VirtualMachinePciPassthroughInfo[] getPciPassthrough() {
        return pciPassthrough;
    }


    /**
     * Sets the pciPassthrough value for this ConfigTarget.
     * 
     * @param pciPassthrough
     */
    public void setPciPassthrough(com.vmware.converter.VirtualMachinePciPassthroughInfo[] pciPassthrough) {
        this.pciPassthrough = pciPassthrough;
    }

    public com.vmware.converter.VirtualMachinePciPassthroughInfo getPciPassthrough(int i) {
        return this.pciPassthrough[i];
    }

    public void setPciPassthrough(int i, com.vmware.converter.VirtualMachinePciPassthroughInfo _value) {
        this.pciPassthrough[i] = _value;
    }


    /**
     * Gets the sriov value for this ConfigTarget.
     * 
     * @return sriov
     */
    public com.vmware.converter.VirtualMachineSriovInfo[] getSriov() {
        return sriov;
    }


    /**
     * Sets the sriov value for this ConfigTarget.
     * 
     * @param sriov
     */
    public void setSriov(com.vmware.converter.VirtualMachineSriovInfo[] sriov) {
        this.sriov = sriov;
    }

    public com.vmware.converter.VirtualMachineSriovInfo getSriov(int i) {
        return this.sriov[i];
    }

    public void setSriov(int i, com.vmware.converter.VirtualMachineSriovInfo _value) {
        this.sriov[i] = _value;
    }


    /**
     * Gets the vFlashModule value for this ConfigTarget.
     * 
     * @return vFlashModule
     */
    public com.vmware.converter.VirtualMachineVFlashModuleInfo[] getVFlashModule() {
        return vFlashModule;
    }


    /**
     * Sets the vFlashModule value for this ConfigTarget.
     * 
     * @param vFlashModule
     */
    public void setVFlashModule(com.vmware.converter.VirtualMachineVFlashModuleInfo[] vFlashModule) {
        this.vFlashModule = vFlashModule;
    }

    public com.vmware.converter.VirtualMachineVFlashModuleInfo getVFlashModule(int i) {
        return this.vFlashModule[i];
    }

    public void setVFlashModule(int i, com.vmware.converter.VirtualMachineVFlashModuleInfo _value) {
        this.vFlashModule[i] = _value;
    }


    /**
     * Gets the sharedGpuPassthroughTypes value for this ConfigTarget.
     * 
     * @return sharedGpuPassthroughTypes
     */
    public com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] getSharedGpuPassthroughTypes() {
        return sharedGpuPassthroughTypes;
    }


    /**
     * Sets the sharedGpuPassthroughTypes value for this ConfigTarget.
     * 
     * @param sharedGpuPassthroughTypes
     */
    public void setSharedGpuPassthroughTypes(com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes) {
        this.sharedGpuPassthroughTypes = sharedGpuPassthroughTypes;
    }

    public com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo getSharedGpuPassthroughTypes(int i) {
        return this.sharedGpuPassthroughTypes[i];
    }

    public void setSharedGpuPassthroughTypes(int i, com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo _value) {
        this.sharedGpuPassthroughTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigTarget)) return false;
        ConfigTarget other = (ConfigTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numCpus == other.getNumCpus() &&
            this.numCpuCores == other.getNumCpuCores() &&
            this.numNumaNodes == other.getNumNumaNodes() &&
            ((this.smcPresent==null && other.getSmcPresent()==null) || 
             (this.smcPresent!=null &&
              this.smcPresent.equals(other.getSmcPresent()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              java.util.Arrays.equals(this.datastore, other.getDatastore()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              java.util.Arrays.equals(this.network, other.getNetwork()))) &&
            ((this.opaqueNetwork==null && other.getOpaqueNetwork()==null) || 
             (this.opaqueNetwork!=null &&
              java.util.Arrays.equals(this.opaqueNetwork, other.getOpaqueNetwork()))) &&
            ((this.distributedVirtualPortgroup==null && other.getDistributedVirtualPortgroup()==null) || 
             (this.distributedVirtualPortgroup!=null &&
              java.util.Arrays.equals(this.distributedVirtualPortgroup, other.getDistributedVirtualPortgroup()))) &&
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitch, other.getDistributedVirtualSwitch()))) &&
            ((this.cdRom==null && other.getCdRom()==null) || 
             (this.cdRom!=null &&
              java.util.Arrays.equals(this.cdRom, other.getCdRom()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              java.util.Arrays.equals(this.serial, other.getSerial()))) &&
            ((this.parallel==null && other.getParallel()==null) || 
             (this.parallel!=null &&
              java.util.Arrays.equals(this.parallel, other.getParallel()))) &&
            ((this.sound==null && other.getSound()==null) || 
             (this.sound!=null &&
              java.util.Arrays.equals(this.sound, other.getSound()))) &&
            ((this.usb==null && other.getUsb()==null) || 
             (this.usb!=null &&
              java.util.Arrays.equals(this.usb, other.getUsb()))) &&
            ((this.floppy==null && other.getFloppy()==null) || 
             (this.floppy!=null &&
              java.util.Arrays.equals(this.floppy, other.getFloppy()))) &&
            ((this.legacyNetworkInfo==null && other.getLegacyNetworkInfo()==null) || 
             (this.legacyNetworkInfo!=null &&
              java.util.Arrays.equals(this.legacyNetworkInfo, other.getLegacyNetworkInfo()))) &&
            ((this.scsiPassthrough==null && other.getScsiPassthrough()==null) || 
             (this.scsiPassthrough!=null &&
              java.util.Arrays.equals(this.scsiPassthrough, other.getScsiPassthrough()))) &&
            ((this.scsiDisk==null && other.getScsiDisk()==null) || 
             (this.scsiDisk!=null &&
              java.util.Arrays.equals(this.scsiDisk, other.getScsiDisk()))) &&
            ((this.ideDisk==null && other.getIdeDisk()==null) || 
             (this.ideDisk!=null &&
              java.util.Arrays.equals(this.ideDisk, other.getIdeDisk()))) &&
            this.maxMemMBOptimalPerf == other.getMaxMemMBOptimalPerf() &&
            ((this.resourcePool==null && other.getResourcePool()==null) || 
             (this.resourcePool!=null &&
              this.resourcePool.equals(other.getResourcePool()))) &&
            ((this.autoVmotion==null && other.getAutoVmotion()==null) || 
             (this.autoVmotion!=null &&
              this.autoVmotion.equals(other.getAutoVmotion()))) &&
            ((this.pciPassthrough==null && other.getPciPassthrough()==null) || 
             (this.pciPassthrough!=null &&
              java.util.Arrays.equals(this.pciPassthrough, other.getPciPassthrough()))) &&
            ((this.sriov==null && other.getSriov()==null) || 
             (this.sriov!=null &&
              java.util.Arrays.equals(this.sriov, other.getSriov()))) &&
            ((this.vFlashModule==null && other.getVFlashModule()==null) || 
             (this.vFlashModule!=null &&
              java.util.Arrays.equals(this.vFlashModule, other.getVFlashModule()))) &&
            ((this.sharedGpuPassthroughTypes==null && other.getSharedGpuPassthroughTypes()==null) || 
             (this.sharedGpuPassthroughTypes!=null &&
              java.util.Arrays.equals(this.sharedGpuPassthroughTypes, other.getSharedGpuPassthroughTypes())));
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
        _hashCode += getNumCpus();
        _hashCode += getNumCpuCores();
        _hashCode += getNumNumaNodes();
        if (getSmcPresent() != null) {
            _hashCode += getSmcPresent().hashCode();
        }
        if (getDatastore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpaqueNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpaqueNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpaqueNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributedVirtualPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributedVirtualSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCdRom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCdRom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCdRom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerial() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerial());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerial(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParallel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParallel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParallel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSound(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsb() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsb(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFloppy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFloppy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFloppy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegacyNetworkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegacyNetworkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegacyNetworkInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScsiPassthrough() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScsiPassthrough());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScsiPassthrough(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScsiDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScsiDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScsiDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdeDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdeDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdeDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMaxMemMBOptimalPerf();
        if (getResourcePool() != null) {
            _hashCode += getResourcePool().hashCode();
        }
        if (getAutoVmotion() != null) {
            _hashCode += getAutoVmotion().hashCode();
        }
        if (getPciPassthrough() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPciPassthrough());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPciPassthrough(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSriov() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSriov());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSriov(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVFlashModule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVFlashModule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVFlashModule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharedGpuPassthroughTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedGpuPassthroughTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedGpuPassthroughTypes(), i);
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
        new org.apache.axis.description.TypeDesc(ConfigTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ConfigTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpuCores");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCpuCores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numNumaNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numNumaNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smcPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smcPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDatastoreInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OpaqueNetworkTargetInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPortgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualPortgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPortgroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdRom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cdRom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCdromInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSerialInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parallel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parallel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineParallelInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sound");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSoundInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usb"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineUsbInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floppy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "floppy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFloppyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legacyNetworkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "legacyNetworkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineLegacyNetworkSwitchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiPassthrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiPassthrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineScsiPassthroughInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineScsiDiskDeviceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ideDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineIdeDiskDeviceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemMBOptimalPerf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMemMBOptimalPerf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourcePoolRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoVmotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoVmotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciPassthrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciPassthrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciPassthroughInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriov");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sriov"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSriovInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashModule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVFlashModuleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedGpuPassthroughTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sharedGpuPassthroughTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciSharedGpuPassthroughInfo"));
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
