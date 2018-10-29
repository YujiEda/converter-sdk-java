/**
 * GuestOsDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestOsDescriptor  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String family;

    private java.lang.String fullName;

    private int supportedMaxCPUs;

    private java.lang.Integer numSupportedPhysicalSockets;

    private java.lang.Integer numSupportedCoresPerSocket;

    private int supportedMinMemMB;

    private int supportedMaxMemMB;

    private int recommendedMemMB;

    private int recommendedColorDepth;

    private java.lang.String[] supportedDiskControllerList;

    private java.lang.String recommendedSCSIController;

    private java.lang.String recommendedDiskController;

    private int supportedNumDisks;

    private int recommendedDiskSizeMB;

    private java.lang.String recommendedCdromController;

    private java.lang.String[] supportedEthernetCard;

    private java.lang.String recommendedEthernetCard;

    private java.lang.Boolean supportsSlaveDisk;

    private com.vmware.converter.HostCpuIdInfo[] cpuFeatureMask;

    private java.lang.Boolean smcRequired;

    private boolean supportsWakeOnLan;

    private java.lang.Boolean supportsVMI;

    private java.lang.Boolean supportsMemoryHotAdd;

    private java.lang.Boolean supportsCpuHotAdd;

    private java.lang.Boolean supportsCpuHotRemove;

    private java.lang.String[] supportedFirmware;

    private java.lang.String recommendedFirmware;

    private java.lang.String[] supportedUSBControllerList;

    private java.lang.String recommendedUSBController;

    private java.lang.Boolean supports3D;

    private java.lang.Boolean recommended3D;

    private java.lang.Boolean smcRecommended;

    private java.lang.Boolean ich7MRecommended;

    private java.lang.Boolean usbRecommended;

    private java.lang.String supportLevel;

    private java.lang.Boolean supportedForCreate;

    private com.vmware.converter.IntOption vRAMSizeInKB;

    private java.lang.Integer numSupportedFloppyDevices;

    private java.lang.String[] wakeOnLanEthernetCard;

    private java.lang.Boolean supportsPvscsiControllerForBoot;

    private java.lang.Boolean diskUuidEnabled;

    private java.lang.Boolean supportsHotPlugPCI;

    public GuestOsDescriptor() {
    }

    public GuestOsDescriptor(
           java.lang.String id,
           java.lang.String family,
           java.lang.String fullName,
           int supportedMaxCPUs,
           java.lang.Integer numSupportedPhysicalSockets,
           java.lang.Integer numSupportedCoresPerSocket,
           int supportedMinMemMB,
           int supportedMaxMemMB,
           int recommendedMemMB,
           int recommendedColorDepth,
           java.lang.String[] supportedDiskControllerList,
           java.lang.String recommendedSCSIController,
           java.lang.String recommendedDiskController,
           int supportedNumDisks,
           int recommendedDiskSizeMB,
           java.lang.String recommendedCdromController,
           java.lang.String[] supportedEthernetCard,
           java.lang.String recommendedEthernetCard,
           java.lang.Boolean supportsSlaveDisk,
           com.vmware.converter.HostCpuIdInfo[] cpuFeatureMask,
           java.lang.Boolean smcRequired,
           boolean supportsWakeOnLan,
           java.lang.Boolean supportsVMI,
           java.lang.Boolean supportsMemoryHotAdd,
           java.lang.Boolean supportsCpuHotAdd,
           java.lang.Boolean supportsCpuHotRemove,
           java.lang.String[] supportedFirmware,
           java.lang.String recommendedFirmware,
           java.lang.String[] supportedUSBControllerList,
           java.lang.String recommendedUSBController,
           java.lang.Boolean supports3D,
           java.lang.Boolean recommended3D,
           java.lang.Boolean smcRecommended,
           java.lang.Boolean ich7MRecommended,
           java.lang.Boolean usbRecommended,
           java.lang.String supportLevel,
           java.lang.Boolean supportedForCreate,
           com.vmware.converter.IntOption vRAMSizeInKB,
           java.lang.Integer numSupportedFloppyDevices,
           java.lang.String[] wakeOnLanEthernetCard,
           java.lang.Boolean supportsPvscsiControllerForBoot,
           java.lang.Boolean diskUuidEnabled,
           java.lang.Boolean supportsHotPlugPCI) {
        this.id = id;
        this.family = family;
        this.fullName = fullName;
        this.supportedMaxCPUs = supportedMaxCPUs;
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
        this.supportedMinMemMB = supportedMinMemMB;
        this.supportedMaxMemMB = supportedMaxMemMB;
        this.recommendedMemMB = recommendedMemMB;
        this.recommendedColorDepth = recommendedColorDepth;
        this.supportedDiskControllerList = supportedDiskControllerList;
        this.recommendedSCSIController = recommendedSCSIController;
        this.recommendedDiskController = recommendedDiskController;
        this.supportedNumDisks = supportedNumDisks;
        this.recommendedDiskSizeMB = recommendedDiskSizeMB;
        this.recommendedCdromController = recommendedCdromController;
        this.supportedEthernetCard = supportedEthernetCard;
        this.recommendedEthernetCard = recommendedEthernetCard;
        this.supportsSlaveDisk = supportsSlaveDisk;
        this.cpuFeatureMask = cpuFeatureMask;
        this.smcRequired = smcRequired;
        this.supportsWakeOnLan = supportsWakeOnLan;
        this.supportsVMI = supportsVMI;
        this.supportsMemoryHotAdd = supportsMemoryHotAdd;
        this.supportsCpuHotAdd = supportsCpuHotAdd;
        this.supportsCpuHotRemove = supportsCpuHotRemove;
        this.supportedFirmware = supportedFirmware;
        this.recommendedFirmware = recommendedFirmware;
        this.supportedUSBControllerList = supportedUSBControllerList;
        this.recommendedUSBController = recommendedUSBController;
        this.supports3D = supports3D;
        this.recommended3D = recommended3D;
        this.smcRecommended = smcRecommended;
        this.ich7MRecommended = ich7MRecommended;
        this.usbRecommended = usbRecommended;
        this.supportLevel = supportLevel;
        this.supportedForCreate = supportedForCreate;
        this.vRAMSizeInKB = vRAMSizeInKB;
        this.numSupportedFloppyDevices = numSupportedFloppyDevices;
        this.wakeOnLanEthernetCard = wakeOnLanEthernetCard;
        this.supportsPvscsiControllerForBoot = supportsPvscsiControllerForBoot;
        this.diskUuidEnabled = diskUuidEnabled;
        this.supportsHotPlugPCI = supportsHotPlugPCI;
    }


    /**
     * Gets the id value for this GuestOsDescriptor.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this GuestOsDescriptor.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the family value for this GuestOsDescriptor.
     * 
     * @return family
     */
    public java.lang.String getFamily() {
        return family;
    }


    /**
     * Sets the family value for this GuestOsDescriptor.
     * 
     * @param family
     */
    public void setFamily(java.lang.String family) {
        this.family = family;
    }


    /**
     * Gets the fullName value for this GuestOsDescriptor.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this GuestOsDescriptor.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the supportedMaxCPUs value for this GuestOsDescriptor.
     * 
     * @return supportedMaxCPUs
     */
    public int getSupportedMaxCPUs() {
        return supportedMaxCPUs;
    }


    /**
     * Sets the supportedMaxCPUs value for this GuestOsDescriptor.
     * 
     * @param supportedMaxCPUs
     */
    public void setSupportedMaxCPUs(int supportedMaxCPUs) {
        this.supportedMaxCPUs = supportedMaxCPUs;
    }


    /**
     * Gets the numSupportedPhysicalSockets value for this GuestOsDescriptor.
     * 
     * @return numSupportedPhysicalSockets
     */
    public java.lang.Integer getNumSupportedPhysicalSockets() {
        return numSupportedPhysicalSockets;
    }


    /**
     * Sets the numSupportedPhysicalSockets value for this GuestOsDescriptor.
     * 
     * @param numSupportedPhysicalSockets
     */
    public void setNumSupportedPhysicalSockets(java.lang.Integer numSupportedPhysicalSockets) {
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
    }


    /**
     * Gets the numSupportedCoresPerSocket value for this GuestOsDescriptor.
     * 
     * @return numSupportedCoresPerSocket
     */
    public java.lang.Integer getNumSupportedCoresPerSocket() {
        return numSupportedCoresPerSocket;
    }


    /**
     * Sets the numSupportedCoresPerSocket value for this GuestOsDescriptor.
     * 
     * @param numSupportedCoresPerSocket
     */
    public void setNumSupportedCoresPerSocket(java.lang.Integer numSupportedCoresPerSocket) {
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
    }


    /**
     * Gets the supportedMinMemMB value for this GuestOsDescriptor.
     * 
     * @return supportedMinMemMB
     */
    public int getSupportedMinMemMB() {
        return supportedMinMemMB;
    }


    /**
     * Sets the supportedMinMemMB value for this GuestOsDescriptor.
     * 
     * @param supportedMinMemMB
     */
    public void setSupportedMinMemMB(int supportedMinMemMB) {
        this.supportedMinMemMB = supportedMinMemMB;
    }


    /**
     * Gets the supportedMaxMemMB value for this GuestOsDescriptor.
     * 
     * @return supportedMaxMemMB
     */
    public int getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }


    /**
     * Sets the supportedMaxMemMB value for this GuestOsDescriptor.
     * 
     * @param supportedMaxMemMB
     */
    public void setSupportedMaxMemMB(int supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }


    /**
     * Gets the recommendedMemMB value for this GuestOsDescriptor.
     * 
     * @return recommendedMemMB
     */
    public int getRecommendedMemMB() {
        return recommendedMemMB;
    }


    /**
     * Sets the recommendedMemMB value for this GuestOsDescriptor.
     * 
     * @param recommendedMemMB
     */
    public void setRecommendedMemMB(int recommendedMemMB) {
        this.recommendedMemMB = recommendedMemMB;
    }


    /**
     * Gets the recommendedColorDepth value for this GuestOsDescriptor.
     * 
     * @return recommendedColorDepth
     */
    public int getRecommendedColorDepth() {
        return recommendedColorDepth;
    }


    /**
     * Sets the recommendedColorDepth value for this GuestOsDescriptor.
     * 
     * @param recommendedColorDepth
     */
    public void setRecommendedColorDepth(int recommendedColorDepth) {
        this.recommendedColorDepth = recommendedColorDepth;
    }


    /**
     * Gets the supportedDiskControllerList value for this GuestOsDescriptor.
     * 
     * @return supportedDiskControllerList
     */
    public java.lang.String[] getSupportedDiskControllerList() {
        return supportedDiskControllerList;
    }


    /**
     * Sets the supportedDiskControllerList value for this GuestOsDescriptor.
     * 
     * @param supportedDiskControllerList
     */
    public void setSupportedDiskControllerList(java.lang.String[] supportedDiskControllerList) {
        this.supportedDiskControllerList = supportedDiskControllerList;
    }

    public java.lang.String getSupportedDiskControllerList(int i) {
        return this.supportedDiskControllerList[i];
    }

    public void setSupportedDiskControllerList(int i, java.lang.String _value) {
        this.supportedDiskControllerList[i] = _value;
    }


    /**
     * Gets the recommendedSCSIController value for this GuestOsDescriptor.
     * 
     * @return recommendedSCSIController
     */
    public java.lang.String getRecommendedSCSIController() {
        return recommendedSCSIController;
    }


    /**
     * Sets the recommendedSCSIController value for this GuestOsDescriptor.
     * 
     * @param recommendedSCSIController
     */
    public void setRecommendedSCSIController(java.lang.String recommendedSCSIController) {
        this.recommendedSCSIController = recommendedSCSIController;
    }


    /**
     * Gets the recommendedDiskController value for this GuestOsDescriptor.
     * 
     * @return recommendedDiskController
     */
    public java.lang.String getRecommendedDiskController() {
        return recommendedDiskController;
    }


    /**
     * Sets the recommendedDiskController value for this GuestOsDescriptor.
     * 
     * @param recommendedDiskController
     */
    public void setRecommendedDiskController(java.lang.String recommendedDiskController) {
        this.recommendedDiskController = recommendedDiskController;
    }


    /**
     * Gets the supportedNumDisks value for this GuestOsDescriptor.
     * 
     * @return supportedNumDisks
     */
    public int getSupportedNumDisks() {
        return supportedNumDisks;
    }


    /**
     * Sets the supportedNumDisks value for this GuestOsDescriptor.
     * 
     * @param supportedNumDisks
     */
    public void setSupportedNumDisks(int supportedNumDisks) {
        this.supportedNumDisks = supportedNumDisks;
    }


    /**
     * Gets the recommendedDiskSizeMB value for this GuestOsDescriptor.
     * 
     * @return recommendedDiskSizeMB
     */
    public int getRecommendedDiskSizeMB() {
        return recommendedDiskSizeMB;
    }


    /**
     * Sets the recommendedDiskSizeMB value for this GuestOsDescriptor.
     * 
     * @param recommendedDiskSizeMB
     */
    public void setRecommendedDiskSizeMB(int recommendedDiskSizeMB) {
        this.recommendedDiskSizeMB = recommendedDiskSizeMB;
    }


    /**
     * Gets the recommendedCdromController value for this GuestOsDescriptor.
     * 
     * @return recommendedCdromController
     */
    public java.lang.String getRecommendedCdromController() {
        return recommendedCdromController;
    }


    /**
     * Sets the recommendedCdromController value for this GuestOsDescriptor.
     * 
     * @param recommendedCdromController
     */
    public void setRecommendedCdromController(java.lang.String recommendedCdromController) {
        this.recommendedCdromController = recommendedCdromController;
    }


    /**
     * Gets the supportedEthernetCard value for this GuestOsDescriptor.
     * 
     * @return supportedEthernetCard
     */
    public java.lang.String[] getSupportedEthernetCard() {
        return supportedEthernetCard;
    }


    /**
     * Sets the supportedEthernetCard value for this GuestOsDescriptor.
     * 
     * @param supportedEthernetCard
     */
    public void setSupportedEthernetCard(java.lang.String[] supportedEthernetCard) {
        this.supportedEthernetCard = supportedEthernetCard;
    }

    public java.lang.String getSupportedEthernetCard(int i) {
        return this.supportedEthernetCard[i];
    }

    public void setSupportedEthernetCard(int i, java.lang.String _value) {
        this.supportedEthernetCard[i] = _value;
    }


    /**
     * Gets the recommendedEthernetCard value for this GuestOsDescriptor.
     * 
     * @return recommendedEthernetCard
     */
    public java.lang.String getRecommendedEthernetCard() {
        return recommendedEthernetCard;
    }


    /**
     * Sets the recommendedEthernetCard value for this GuestOsDescriptor.
     * 
     * @param recommendedEthernetCard
     */
    public void setRecommendedEthernetCard(java.lang.String recommendedEthernetCard) {
        this.recommendedEthernetCard = recommendedEthernetCard;
    }


    /**
     * Gets the supportsSlaveDisk value for this GuestOsDescriptor.
     * 
     * @return supportsSlaveDisk
     */
    public java.lang.Boolean getSupportsSlaveDisk() {
        return supportsSlaveDisk;
    }


    /**
     * Sets the supportsSlaveDisk value for this GuestOsDescriptor.
     * 
     * @param supportsSlaveDisk
     */
    public void setSupportsSlaveDisk(java.lang.Boolean supportsSlaveDisk) {
        this.supportsSlaveDisk = supportsSlaveDisk;
    }


    /**
     * Gets the cpuFeatureMask value for this GuestOsDescriptor.
     * 
     * @return cpuFeatureMask
     */
    public com.vmware.converter.HostCpuIdInfo[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }


    /**
     * Sets the cpuFeatureMask value for this GuestOsDescriptor.
     * 
     * @param cpuFeatureMask
     */
    public void setCpuFeatureMask(com.vmware.converter.HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public com.vmware.converter.HostCpuIdInfo getCpuFeatureMask(int i) {
        return this.cpuFeatureMask[i];
    }

    public void setCpuFeatureMask(int i, com.vmware.converter.HostCpuIdInfo _value) {
        this.cpuFeatureMask[i] = _value;
    }


    /**
     * Gets the smcRequired value for this GuestOsDescriptor.
     * 
     * @return smcRequired
     */
    public java.lang.Boolean getSmcRequired() {
        return smcRequired;
    }


    /**
     * Sets the smcRequired value for this GuestOsDescriptor.
     * 
     * @param smcRequired
     */
    public void setSmcRequired(java.lang.Boolean smcRequired) {
        this.smcRequired = smcRequired;
    }


    /**
     * Gets the supportsWakeOnLan value for this GuestOsDescriptor.
     * 
     * @return supportsWakeOnLan
     */
    public boolean isSupportsWakeOnLan() {
        return supportsWakeOnLan;
    }


    /**
     * Sets the supportsWakeOnLan value for this GuestOsDescriptor.
     * 
     * @param supportsWakeOnLan
     */
    public void setSupportsWakeOnLan(boolean supportsWakeOnLan) {
        this.supportsWakeOnLan = supportsWakeOnLan;
    }


    /**
     * Gets the supportsVMI value for this GuestOsDescriptor.
     * 
     * @return supportsVMI
     */
    public java.lang.Boolean getSupportsVMI() {
        return supportsVMI;
    }


    /**
     * Sets the supportsVMI value for this GuestOsDescriptor.
     * 
     * @param supportsVMI
     */
    public void setSupportsVMI(java.lang.Boolean supportsVMI) {
        this.supportsVMI = supportsVMI;
    }


    /**
     * Gets the supportsMemoryHotAdd value for this GuestOsDescriptor.
     * 
     * @return supportsMemoryHotAdd
     */
    public java.lang.Boolean getSupportsMemoryHotAdd() {
        return supportsMemoryHotAdd;
    }


    /**
     * Sets the supportsMemoryHotAdd value for this GuestOsDescriptor.
     * 
     * @param supportsMemoryHotAdd
     */
    public void setSupportsMemoryHotAdd(java.lang.Boolean supportsMemoryHotAdd) {
        this.supportsMemoryHotAdd = supportsMemoryHotAdd;
    }


    /**
     * Gets the supportsCpuHotAdd value for this GuestOsDescriptor.
     * 
     * @return supportsCpuHotAdd
     */
    public java.lang.Boolean getSupportsCpuHotAdd() {
        return supportsCpuHotAdd;
    }


    /**
     * Sets the supportsCpuHotAdd value for this GuestOsDescriptor.
     * 
     * @param supportsCpuHotAdd
     */
    public void setSupportsCpuHotAdd(java.lang.Boolean supportsCpuHotAdd) {
        this.supportsCpuHotAdd = supportsCpuHotAdd;
    }


    /**
     * Gets the supportsCpuHotRemove value for this GuestOsDescriptor.
     * 
     * @return supportsCpuHotRemove
     */
    public java.lang.Boolean getSupportsCpuHotRemove() {
        return supportsCpuHotRemove;
    }


    /**
     * Sets the supportsCpuHotRemove value for this GuestOsDescriptor.
     * 
     * @param supportsCpuHotRemove
     */
    public void setSupportsCpuHotRemove(java.lang.Boolean supportsCpuHotRemove) {
        this.supportsCpuHotRemove = supportsCpuHotRemove;
    }


    /**
     * Gets the supportedFirmware value for this GuestOsDescriptor.
     * 
     * @return supportedFirmware
     */
    public java.lang.String[] getSupportedFirmware() {
        return supportedFirmware;
    }


    /**
     * Sets the supportedFirmware value for this GuestOsDescriptor.
     * 
     * @param supportedFirmware
     */
    public void setSupportedFirmware(java.lang.String[] supportedFirmware) {
        this.supportedFirmware = supportedFirmware;
    }

    public java.lang.String getSupportedFirmware(int i) {
        return this.supportedFirmware[i];
    }

    public void setSupportedFirmware(int i, java.lang.String _value) {
        this.supportedFirmware[i] = _value;
    }


    /**
     * Gets the recommendedFirmware value for this GuestOsDescriptor.
     * 
     * @return recommendedFirmware
     */
    public java.lang.String getRecommendedFirmware() {
        return recommendedFirmware;
    }


    /**
     * Sets the recommendedFirmware value for this GuestOsDescriptor.
     * 
     * @param recommendedFirmware
     */
    public void setRecommendedFirmware(java.lang.String recommendedFirmware) {
        this.recommendedFirmware = recommendedFirmware;
    }


    /**
     * Gets the supportedUSBControllerList value for this GuestOsDescriptor.
     * 
     * @return supportedUSBControllerList
     */
    public java.lang.String[] getSupportedUSBControllerList() {
        return supportedUSBControllerList;
    }


    /**
     * Sets the supportedUSBControllerList value for this GuestOsDescriptor.
     * 
     * @param supportedUSBControllerList
     */
    public void setSupportedUSBControllerList(java.lang.String[] supportedUSBControllerList) {
        this.supportedUSBControllerList = supportedUSBControllerList;
    }

    public java.lang.String getSupportedUSBControllerList(int i) {
        return this.supportedUSBControllerList[i];
    }

    public void setSupportedUSBControllerList(int i, java.lang.String _value) {
        this.supportedUSBControllerList[i] = _value;
    }


    /**
     * Gets the recommendedUSBController value for this GuestOsDescriptor.
     * 
     * @return recommendedUSBController
     */
    public java.lang.String getRecommendedUSBController() {
        return recommendedUSBController;
    }


    /**
     * Sets the recommendedUSBController value for this GuestOsDescriptor.
     * 
     * @param recommendedUSBController
     */
    public void setRecommendedUSBController(java.lang.String recommendedUSBController) {
        this.recommendedUSBController = recommendedUSBController;
    }


    /**
     * Gets the supports3D value for this GuestOsDescriptor.
     * 
     * @return supports3D
     */
    public java.lang.Boolean getSupports3D() {
        return supports3D;
    }


    /**
     * Sets the supports3D value for this GuestOsDescriptor.
     * 
     * @param supports3D
     */
    public void setSupports3D(java.lang.Boolean supports3D) {
        this.supports3D = supports3D;
    }


    /**
     * Gets the recommended3D value for this GuestOsDescriptor.
     * 
     * @return recommended3D
     */
    public java.lang.Boolean getRecommended3D() {
        return recommended3D;
    }


    /**
     * Sets the recommended3D value for this GuestOsDescriptor.
     * 
     * @param recommended3D
     */
    public void setRecommended3D(java.lang.Boolean recommended3D) {
        this.recommended3D = recommended3D;
    }


    /**
     * Gets the smcRecommended value for this GuestOsDescriptor.
     * 
     * @return smcRecommended
     */
    public java.lang.Boolean getSmcRecommended() {
        return smcRecommended;
    }


    /**
     * Sets the smcRecommended value for this GuestOsDescriptor.
     * 
     * @param smcRecommended
     */
    public void setSmcRecommended(java.lang.Boolean smcRecommended) {
        this.smcRecommended = smcRecommended;
    }


    /**
     * Gets the ich7MRecommended value for this GuestOsDescriptor.
     * 
     * @return ich7MRecommended
     */
    public java.lang.Boolean getIch7MRecommended() {
        return ich7MRecommended;
    }


    /**
     * Sets the ich7MRecommended value for this GuestOsDescriptor.
     * 
     * @param ich7MRecommended
     */
    public void setIch7MRecommended(java.lang.Boolean ich7MRecommended) {
        this.ich7MRecommended = ich7MRecommended;
    }


    /**
     * Gets the usbRecommended value for this GuestOsDescriptor.
     * 
     * @return usbRecommended
     */
    public java.lang.Boolean getUsbRecommended() {
        return usbRecommended;
    }


    /**
     * Sets the usbRecommended value for this GuestOsDescriptor.
     * 
     * @param usbRecommended
     */
    public void setUsbRecommended(java.lang.Boolean usbRecommended) {
        this.usbRecommended = usbRecommended;
    }


    /**
     * Gets the supportLevel value for this GuestOsDescriptor.
     * 
     * @return supportLevel
     */
    public java.lang.String getSupportLevel() {
        return supportLevel;
    }


    /**
     * Sets the supportLevel value for this GuestOsDescriptor.
     * 
     * @param supportLevel
     */
    public void setSupportLevel(java.lang.String supportLevel) {
        this.supportLevel = supportLevel;
    }


    /**
     * Gets the supportedForCreate value for this GuestOsDescriptor.
     * 
     * @return supportedForCreate
     */
    public java.lang.Boolean getSupportedForCreate() {
        return supportedForCreate;
    }


    /**
     * Sets the supportedForCreate value for this GuestOsDescriptor.
     * 
     * @param supportedForCreate
     */
    public void setSupportedForCreate(java.lang.Boolean supportedForCreate) {
        this.supportedForCreate = supportedForCreate;
    }


    /**
     * Gets the vRAMSizeInKB value for this GuestOsDescriptor.
     * 
     * @return vRAMSizeInKB
     */
    public com.vmware.converter.IntOption getVRAMSizeInKB() {
        return vRAMSizeInKB;
    }


    /**
     * Sets the vRAMSizeInKB value for this GuestOsDescriptor.
     * 
     * @param vRAMSizeInKB
     */
    public void setVRAMSizeInKB(com.vmware.converter.IntOption vRAMSizeInKB) {
        this.vRAMSizeInKB = vRAMSizeInKB;
    }


    /**
     * Gets the numSupportedFloppyDevices value for this GuestOsDescriptor.
     * 
     * @return numSupportedFloppyDevices
     */
    public java.lang.Integer getNumSupportedFloppyDevices() {
        return numSupportedFloppyDevices;
    }


    /**
     * Sets the numSupportedFloppyDevices value for this GuestOsDescriptor.
     * 
     * @param numSupportedFloppyDevices
     */
    public void setNumSupportedFloppyDevices(java.lang.Integer numSupportedFloppyDevices) {
        this.numSupportedFloppyDevices = numSupportedFloppyDevices;
    }


    /**
     * Gets the wakeOnLanEthernetCard value for this GuestOsDescriptor.
     * 
     * @return wakeOnLanEthernetCard
     */
    public java.lang.String[] getWakeOnLanEthernetCard() {
        return wakeOnLanEthernetCard;
    }


    /**
     * Sets the wakeOnLanEthernetCard value for this GuestOsDescriptor.
     * 
     * @param wakeOnLanEthernetCard
     */
    public void setWakeOnLanEthernetCard(java.lang.String[] wakeOnLanEthernetCard) {
        this.wakeOnLanEthernetCard = wakeOnLanEthernetCard;
    }

    public java.lang.String getWakeOnLanEthernetCard(int i) {
        return this.wakeOnLanEthernetCard[i];
    }

    public void setWakeOnLanEthernetCard(int i, java.lang.String _value) {
        this.wakeOnLanEthernetCard[i] = _value;
    }


    /**
     * Gets the supportsPvscsiControllerForBoot value for this GuestOsDescriptor.
     * 
     * @return supportsPvscsiControllerForBoot
     */
    public java.lang.Boolean getSupportsPvscsiControllerForBoot() {
        return supportsPvscsiControllerForBoot;
    }


    /**
     * Sets the supportsPvscsiControllerForBoot value for this GuestOsDescriptor.
     * 
     * @param supportsPvscsiControllerForBoot
     */
    public void setSupportsPvscsiControllerForBoot(java.lang.Boolean supportsPvscsiControllerForBoot) {
        this.supportsPvscsiControllerForBoot = supportsPvscsiControllerForBoot;
    }


    /**
     * Gets the diskUuidEnabled value for this GuestOsDescriptor.
     * 
     * @return diskUuidEnabled
     */
    public java.lang.Boolean getDiskUuidEnabled() {
        return diskUuidEnabled;
    }


    /**
     * Sets the diskUuidEnabled value for this GuestOsDescriptor.
     * 
     * @param diskUuidEnabled
     */
    public void setDiskUuidEnabled(java.lang.Boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }


    /**
     * Gets the supportsHotPlugPCI value for this GuestOsDescriptor.
     * 
     * @return supportsHotPlugPCI
     */
    public java.lang.Boolean getSupportsHotPlugPCI() {
        return supportsHotPlugPCI;
    }


    /**
     * Sets the supportsHotPlugPCI value for this GuestOsDescriptor.
     * 
     * @param supportsHotPlugPCI
     */
    public void setSupportsHotPlugPCI(java.lang.Boolean supportsHotPlugPCI) {
        this.supportsHotPlugPCI = supportsHotPlugPCI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestOsDescriptor)) return false;
        GuestOsDescriptor other = (GuestOsDescriptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              this.family.equals(other.getFamily()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            this.supportedMaxCPUs == other.getSupportedMaxCPUs() &&
            ((this.numSupportedPhysicalSockets==null && other.getNumSupportedPhysicalSockets()==null) || 
             (this.numSupportedPhysicalSockets!=null &&
              this.numSupportedPhysicalSockets.equals(other.getNumSupportedPhysicalSockets()))) &&
            ((this.numSupportedCoresPerSocket==null && other.getNumSupportedCoresPerSocket()==null) || 
             (this.numSupportedCoresPerSocket!=null &&
              this.numSupportedCoresPerSocket.equals(other.getNumSupportedCoresPerSocket()))) &&
            this.supportedMinMemMB == other.getSupportedMinMemMB() &&
            this.supportedMaxMemMB == other.getSupportedMaxMemMB() &&
            this.recommendedMemMB == other.getRecommendedMemMB() &&
            this.recommendedColorDepth == other.getRecommendedColorDepth() &&
            ((this.supportedDiskControllerList==null && other.getSupportedDiskControllerList()==null) || 
             (this.supportedDiskControllerList!=null &&
              java.util.Arrays.equals(this.supportedDiskControllerList, other.getSupportedDiskControllerList()))) &&
            ((this.recommendedSCSIController==null && other.getRecommendedSCSIController()==null) || 
             (this.recommendedSCSIController!=null &&
              this.recommendedSCSIController.equals(other.getRecommendedSCSIController()))) &&
            ((this.recommendedDiskController==null && other.getRecommendedDiskController()==null) || 
             (this.recommendedDiskController!=null &&
              this.recommendedDiskController.equals(other.getRecommendedDiskController()))) &&
            this.supportedNumDisks == other.getSupportedNumDisks() &&
            this.recommendedDiskSizeMB == other.getRecommendedDiskSizeMB() &&
            ((this.recommendedCdromController==null && other.getRecommendedCdromController()==null) || 
             (this.recommendedCdromController!=null &&
              this.recommendedCdromController.equals(other.getRecommendedCdromController()))) &&
            ((this.supportedEthernetCard==null && other.getSupportedEthernetCard()==null) || 
             (this.supportedEthernetCard!=null &&
              java.util.Arrays.equals(this.supportedEthernetCard, other.getSupportedEthernetCard()))) &&
            ((this.recommendedEthernetCard==null && other.getRecommendedEthernetCard()==null) || 
             (this.recommendedEthernetCard!=null &&
              this.recommendedEthernetCard.equals(other.getRecommendedEthernetCard()))) &&
            ((this.supportsSlaveDisk==null && other.getSupportsSlaveDisk()==null) || 
             (this.supportsSlaveDisk!=null &&
              this.supportsSlaveDisk.equals(other.getSupportsSlaveDisk()))) &&
            ((this.cpuFeatureMask==null && other.getCpuFeatureMask()==null) || 
             (this.cpuFeatureMask!=null &&
              java.util.Arrays.equals(this.cpuFeatureMask, other.getCpuFeatureMask()))) &&
            ((this.smcRequired==null && other.getSmcRequired()==null) || 
             (this.smcRequired!=null &&
              this.smcRequired.equals(other.getSmcRequired()))) &&
            this.supportsWakeOnLan == other.isSupportsWakeOnLan() &&
            ((this.supportsVMI==null && other.getSupportsVMI()==null) || 
             (this.supportsVMI!=null &&
              this.supportsVMI.equals(other.getSupportsVMI()))) &&
            ((this.supportsMemoryHotAdd==null && other.getSupportsMemoryHotAdd()==null) || 
             (this.supportsMemoryHotAdd!=null &&
              this.supportsMemoryHotAdd.equals(other.getSupportsMemoryHotAdd()))) &&
            ((this.supportsCpuHotAdd==null && other.getSupportsCpuHotAdd()==null) || 
             (this.supportsCpuHotAdd!=null &&
              this.supportsCpuHotAdd.equals(other.getSupportsCpuHotAdd()))) &&
            ((this.supportsCpuHotRemove==null && other.getSupportsCpuHotRemove()==null) || 
             (this.supportsCpuHotRemove!=null &&
              this.supportsCpuHotRemove.equals(other.getSupportsCpuHotRemove()))) &&
            ((this.supportedFirmware==null && other.getSupportedFirmware()==null) || 
             (this.supportedFirmware!=null &&
              java.util.Arrays.equals(this.supportedFirmware, other.getSupportedFirmware()))) &&
            ((this.recommendedFirmware==null && other.getRecommendedFirmware()==null) || 
             (this.recommendedFirmware!=null &&
              this.recommendedFirmware.equals(other.getRecommendedFirmware()))) &&
            ((this.supportedUSBControllerList==null && other.getSupportedUSBControllerList()==null) || 
             (this.supportedUSBControllerList!=null &&
              java.util.Arrays.equals(this.supportedUSBControllerList, other.getSupportedUSBControllerList()))) &&
            ((this.recommendedUSBController==null && other.getRecommendedUSBController()==null) || 
             (this.recommendedUSBController!=null &&
              this.recommendedUSBController.equals(other.getRecommendedUSBController()))) &&
            ((this.supports3D==null && other.getSupports3D()==null) || 
             (this.supports3D!=null &&
              this.supports3D.equals(other.getSupports3D()))) &&
            ((this.recommended3D==null && other.getRecommended3D()==null) || 
             (this.recommended3D!=null &&
              this.recommended3D.equals(other.getRecommended3D()))) &&
            ((this.smcRecommended==null && other.getSmcRecommended()==null) || 
             (this.smcRecommended!=null &&
              this.smcRecommended.equals(other.getSmcRecommended()))) &&
            ((this.ich7MRecommended==null && other.getIch7MRecommended()==null) || 
             (this.ich7MRecommended!=null &&
              this.ich7MRecommended.equals(other.getIch7MRecommended()))) &&
            ((this.usbRecommended==null && other.getUsbRecommended()==null) || 
             (this.usbRecommended!=null &&
              this.usbRecommended.equals(other.getUsbRecommended()))) &&
            ((this.supportLevel==null && other.getSupportLevel()==null) || 
             (this.supportLevel!=null &&
              this.supportLevel.equals(other.getSupportLevel()))) &&
            ((this.supportedForCreate==null && other.getSupportedForCreate()==null) || 
             (this.supportedForCreate!=null &&
              this.supportedForCreate.equals(other.getSupportedForCreate()))) &&
            ((this.vRAMSizeInKB==null && other.getVRAMSizeInKB()==null) || 
             (this.vRAMSizeInKB!=null &&
              this.vRAMSizeInKB.equals(other.getVRAMSizeInKB()))) &&
            ((this.numSupportedFloppyDevices==null && other.getNumSupportedFloppyDevices()==null) || 
             (this.numSupportedFloppyDevices!=null &&
              this.numSupportedFloppyDevices.equals(other.getNumSupportedFloppyDevices()))) &&
            ((this.wakeOnLanEthernetCard==null && other.getWakeOnLanEthernetCard()==null) || 
             (this.wakeOnLanEthernetCard!=null &&
              java.util.Arrays.equals(this.wakeOnLanEthernetCard, other.getWakeOnLanEthernetCard()))) &&
            ((this.supportsPvscsiControllerForBoot==null && other.getSupportsPvscsiControllerForBoot()==null) || 
             (this.supportsPvscsiControllerForBoot!=null &&
              this.supportsPvscsiControllerForBoot.equals(other.getSupportsPvscsiControllerForBoot()))) &&
            ((this.diskUuidEnabled==null && other.getDiskUuidEnabled()==null) || 
             (this.diskUuidEnabled!=null &&
              this.diskUuidEnabled.equals(other.getDiskUuidEnabled()))) &&
            ((this.supportsHotPlugPCI==null && other.getSupportsHotPlugPCI()==null) || 
             (this.supportsHotPlugPCI!=null &&
              this.supportsHotPlugPCI.equals(other.getSupportsHotPlugPCI())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getFamily() != null) {
            _hashCode += getFamily().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        _hashCode += getSupportedMaxCPUs();
        if (getNumSupportedPhysicalSockets() != null) {
            _hashCode += getNumSupportedPhysicalSockets().hashCode();
        }
        if (getNumSupportedCoresPerSocket() != null) {
            _hashCode += getNumSupportedCoresPerSocket().hashCode();
        }
        _hashCode += getSupportedMinMemMB();
        _hashCode += getSupportedMaxMemMB();
        _hashCode += getRecommendedMemMB();
        _hashCode += getRecommendedColorDepth();
        if (getSupportedDiskControllerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedDiskControllerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedDiskControllerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecommendedSCSIController() != null) {
            _hashCode += getRecommendedSCSIController().hashCode();
        }
        if (getRecommendedDiskController() != null) {
            _hashCode += getRecommendedDiskController().hashCode();
        }
        _hashCode += getSupportedNumDisks();
        _hashCode += getRecommendedDiskSizeMB();
        if (getRecommendedCdromController() != null) {
            _hashCode += getRecommendedCdromController().hashCode();
        }
        if (getSupportedEthernetCard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedEthernetCard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedEthernetCard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecommendedEthernetCard() != null) {
            _hashCode += getRecommendedEthernetCard().hashCode();
        }
        if (getSupportsSlaveDisk() != null) {
            _hashCode += getSupportsSlaveDisk().hashCode();
        }
        if (getCpuFeatureMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpuFeatureMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpuFeatureMask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmcRequired() != null) {
            _hashCode += getSmcRequired().hashCode();
        }
        _hashCode += (isSupportsWakeOnLan() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSupportsVMI() != null) {
            _hashCode += getSupportsVMI().hashCode();
        }
        if (getSupportsMemoryHotAdd() != null) {
            _hashCode += getSupportsMemoryHotAdd().hashCode();
        }
        if (getSupportsCpuHotAdd() != null) {
            _hashCode += getSupportsCpuHotAdd().hashCode();
        }
        if (getSupportsCpuHotRemove() != null) {
            _hashCode += getSupportsCpuHotRemove().hashCode();
        }
        if (getSupportedFirmware() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedFirmware());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedFirmware(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecommendedFirmware() != null) {
            _hashCode += getRecommendedFirmware().hashCode();
        }
        if (getSupportedUSBControllerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedUSBControllerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedUSBControllerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecommendedUSBController() != null) {
            _hashCode += getRecommendedUSBController().hashCode();
        }
        if (getSupports3D() != null) {
            _hashCode += getSupports3D().hashCode();
        }
        if (getRecommended3D() != null) {
            _hashCode += getRecommended3D().hashCode();
        }
        if (getSmcRecommended() != null) {
            _hashCode += getSmcRecommended().hashCode();
        }
        if (getIch7MRecommended() != null) {
            _hashCode += getIch7MRecommended().hashCode();
        }
        if (getUsbRecommended() != null) {
            _hashCode += getUsbRecommended().hashCode();
        }
        if (getSupportLevel() != null) {
            _hashCode += getSupportLevel().hashCode();
        }
        if (getSupportedForCreate() != null) {
            _hashCode += getSupportedForCreate().hashCode();
        }
        if (getVRAMSizeInKB() != null) {
            _hashCode += getVRAMSizeInKB().hashCode();
        }
        if (getNumSupportedFloppyDevices() != null) {
            _hashCode += getNumSupportedFloppyDevices().hashCode();
        }
        if (getWakeOnLanEthernetCard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWakeOnLanEthernetCard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWakeOnLanEthernetCard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportsPvscsiControllerForBoot() != null) {
            _hashCode += getSupportsPvscsiControllerForBoot().hashCode();
        }
        if (getDiskUuidEnabled() != null) {
            _hashCode += getDiskUuidEnabled().hashCode();
        }
        if (getSupportsHotPlugPCI() != null) {
            _hashCode += getSupportsHotPlugPCI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestOsDescriptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestOsDescriptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMaxCPUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedMaxCPUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSupportedPhysicalSockets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSupportedPhysicalSockets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSupportedCoresPerSocket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSupportedCoresPerSocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMinMemMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedMinMemMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMaxMemMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedMaxMemMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedMemMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedMemMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedColorDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedColorDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedDiskControllerList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedDiskControllerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedSCSIController");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedSCSIController"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedDiskController");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedDiskController"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedNumDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedNumDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedDiskSizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedDiskSizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedCdromController");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedCdromController"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedEthernetCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedEthernetCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedEthernetCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedEthernetCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsSlaveDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsSlaveDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeatureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuFeatureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smcRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smcRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsWakeOnLan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsWakeOnLan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsVMI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsVMI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsMemoryHotAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsMemoryHotAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsCpuHotAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsCpuHotAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsCpuHotRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsCpuHotRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedFirmware");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedFirmware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedFirmware");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedFirmware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedUSBControllerList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedUSBControllerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedUSBController");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendedUSBController"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supports3D");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supports3D"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommended3D");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommended3D"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smcRecommended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smcRecommended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ich7MRecommended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ich7mRecommended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usbRecommended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usbRecommended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedForCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedForCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRAMSizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vRAMSizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSupportedFloppyDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSupportedFloppyDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wakeOnLanEthernetCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wakeOnLanEthernetCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsPvscsiControllerForBoot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsPvscsiControllerForBoot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskUuidEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskUuidEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsHotPlugPCI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsHotPlugPCI"));
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
