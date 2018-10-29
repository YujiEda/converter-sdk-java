/**
 * ServiceContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ServiceContent  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference rootFolder;

    private com.vmware.converter.ManagedObjectReference propertyCollector;

    private com.vmware.converter.ManagedObjectReference viewManager;

    private com.vmware.converter.AboutInfo about;

    private com.vmware.converter.ManagedObjectReference setting;

    private com.vmware.converter.ManagedObjectReference userDirectory;

    private com.vmware.converter.ManagedObjectReference sessionManager;

    private com.vmware.converter.ManagedObjectReference authorizationManager;

    private com.vmware.converter.ManagedObjectReference serviceManager;

    private com.vmware.converter.ManagedObjectReference perfManager;

    private com.vmware.converter.ManagedObjectReference scheduledTaskManager;

    private com.vmware.converter.ManagedObjectReference alarmManager;

    private com.vmware.converter.ManagedObjectReference eventManager;

    private com.vmware.converter.ManagedObjectReference taskManager;

    private com.vmware.converter.ManagedObjectReference extensionManager;

    private com.vmware.converter.ManagedObjectReference customizationSpecManager;

    private com.vmware.converter.ManagedObjectReference customFieldsManager;

    private com.vmware.converter.ManagedObjectReference accountManager;

    private com.vmware.converter.ManagedObjectReference diagnosticManager;

    private com.vmware.converter.ManagedObjectReference licenseManager;

    private com.vmware.converter.ManagedObjectReference searchIndex;

    private com.vmware.converter.ManagedObjectReference fileManager;

    private com.vmware.converter.ManagedObjectReference datastoreNamespaceManager;

    private com.vmware.converter.ManagedObjectReference virtualDiskManager;

    private com.vmware.converter.ManagedObjectReference virtualizationManager;

    private com.vmware.converter.ManagedObjectReference snmpSystem;

    private com.vmware.converter.ManagedObjectReference vmProvisioningChecker;

    private com.vmware.converter.ManagedObjectReference vmCompatibilityChecker;

    private com.vmware.converter.ManagedObjectReference ovfManager;

    private com.vmware.converter.ManagedObjectReference ipPoolManager;

    private com.vmware.converter.ManagedObjectReference dvSwitchManager;

    private com.vmware.converter.ManagedObjectReference hostProfileManager;

    private com.vmware.converter.ManagedObjectReference clusterProfileManager;

    private com.vmware.converter.ManagedObjectReference complianceManager;

    private com.vmware.converter.ManagedObjectReference localizationManager;

    private com.vmware.converter.ManagedObjectReference storageResourceManager;

    private com.vmware.converter.ManagedObjectReference guestOperationsManager;

    private com.vmware.converter.ManagedObjectReference overheadMemoryManager;

    private com.vmware.converter.ManagedObjectReference certificateManager;

    private com.vmware.converter.ManagedObjectReference ioFilterManager;

    public ServiceContent() {
    }

    public ServiceContent(
           com.vmware.converter.ManagedObjectReference rootFolder,
           com.vmware.converter.ManagedObjectReference propertyCollector,
           com.vmware.converter.ManagedObjectReference viewManager,
           com.vmware.converter.AboutInfo about,
           com.vmware.converter.ManagedObjectReference setting,
           com.vmware.converter.ManagedObjectReference userDirectory,
           com.vmware.converter.ManagedObjectReference sessionManager,
           com.vmware.converter.ManagedObjectReference authorizationManager,
           com.vmware.converter.ManagedObjectReference serviceManager,
           com.vmware.converter.ManagedObjectReference perfManager,
           com.vmware.converter.ManagedObjectReference scheduledTaskManager,
           com.vmware.converter.ManagedObjectReference alarmManager,
           com.vmware.converter.ManagedObjectReference eventManager,
           com.vmware.converter.ManagedObjectReference taskManager,
           com.vmware.converter.ManagedObjectReference extensionManager,
           com.vmware.converter.ManagedObjectReference customizationSpecManager,
           com.vmware.converter.ManagedObjectReference customFieldsManager,
           com.vmware.converter.ManagedObjectReference accountManager,
           com.vmware.converter.ManagedObjectReference diagnosticManager,
           com.vmware.converter.ManagedObjectReference licenseManager,
           com.vmware.converter.ManagedObjectReference searchIndex,
           com.vmware.converter.ManagedObjectReference fileManager,
           com.vmware.converter.ManagedObjectReference datastoreNamespaceManager,
           com.vmware.converter.ManagedObjectReference virtualDiskManager,
           com.vmware.converter.ManagedObjectReference virtualizationManager,
           com.vmware.converter.ManagedObjectReference snmpSystem,
           com.vmware.converter.ManagedObjectReference vmProvisioningChecker,
           com.vmware.converter.ManagedObjectReference vmCompatibilityChecker,
           com.vmware.converter.ManagedObjectReference ovfManager,
           com.vmware.converter.ManagedObjectReference ipPoolManager,
           com.vmware.converter.ManagedObjectReference dvSwitchManager,
           com.vmware.converter.ManagedObjectReference hostProfileManager,
           com.vmware.converter.ManagedObjectReference clusterProfileManager,
           com.vmware.converter.ManagedObjectReference complianceManager,
           com.vmware.converter.ManagedObjectReference localizationManager,
           com.vmware.converter.ManagedObjectReference storageResourceManager,
           com.vmware.converter.ManagedObjectReference guestOperationsManager,
           com.vmware.converter.ManagedObjectReference overheadMemoryManager,
           com.vmware.converter.ManagedObjectReference certificateManager,
           com.vmware.converter.ManagedObjectReference ioFilterManager) {
        this.rootFolder = rootFolder;
        this.propertyCollector = propertyCollector;
        this.viewManager = viewManager;
        this.about = about;
        this.setting = setting;
        this.userDirectory = userDirectory;
        this.sessionManager = sessionManager;
        this.authorizationManager = authorizationManager;
        this.serviceManager = serviceManager;
        this.perfManager = perfManager;
        this.scheduledTaskManager = scheduledTaskManager;
        this.alarmManager = alarmManager;
        this.eventManager = eventManager;
        this.taskManager = taskManager;
        this.extensionManager = extensionManager;
        this.customizationSpecManager = customizationSpecManager;
        this.customFieldsManager = customFieldsManager;
        this.accountManager = accountManager;
        this.diagnosticManager = diagnosticManager;
        this.licenseManager = licenseManager;
        this.searchIndex = searchIndex;
        this.fileManager = fileManager;
        this.datastoreNamespaceManager = datastoreNamespaceManager;
        this.virtualDiskManager = virtualDiskManager;
        this.virtualizationManager = virtualizationManager;
        this.snmpSystem = snmpSystem;
        this.vmProvisioningChecker = vmProvisioningChecker;
        this.vmCompatibilityChecker = vmCompatibilityChecker;
        this.ovfManager = ovfManager;
        this.ipPoolManager = ipPoolManager;
        this.dvSwitchManager = dvSwitchManager;
        this.hostProfileManager = hostProfileManager;
        this.clusterProfileManager = clusterProfileManager;
        this.complianceManager = complianceManager;
        this.localizationManager = localizationManager;
        this.storageResourceManager = storageResourceManager;
        this.guestOperationsManager = guestOperationsManager;
        this.overheadMemoryManager = overheadMemoryManager;
        this.certificateManager = certificateManager;
        this.ioFilterManager = ioFilterManager;
    }


    /**
     * Gets the rootFolder value for this ServiceContent.
     * 
     * @return rootFolder
     */
    public com.vmware.converter.ManagedObjectReference getRootFolder() {
        return rootFolder;
    }


    /**
     * Sets the rootFolder value for this ServiceContent.
     * 
     * @param rootFolder
     */
    public void setRootFolder(com.vmware.converter.ManagedObjectReference rootFolder) {
        this.rootFolder = rootFolder;
    }


    /**
     * Gets the propertyCollector value for this ServiceContent.
     * 
     * @return propertyCollector
     */
    public com.vmware.converter.ManagedObjectReference getPropertyCollector() {
        return propertyCollector;
    }


    /**
     * Sets the propertyCollector value for this ServiceContent.
     * 
     * @param propertyCollector
     */
    public void setPropertyCollector(com.vmware.converter.ManagedObjectReference propertyCollector) {
        this.propertyCollector = propertyCollector;
    }


    /**
     * Gets the viewManager value for this ServiceContent.
     * 
     * @return viewManager
     */
    public com.vmware.converter.ManagedObjectReference getViewManager() {
        return viewManager;
    }


    /**
     * Sets the viewManager value for this ServiceContent.
     * 
     * @param viewManager
     */
    public void setViewManager(com.vmware.converter.ManagedObjectReference viewManager) {
        this.viewManager = viewManager;
    }


    /**
     * Gets the about value for this ServiceContent.
     * 
     * @return about
     */
    public com.vmware.converter.AboutInfo getAbout() {
        return about;
    }


    /**
     * Sets the about value for this ServiceContent.
     * 
     * @param about
     */
    public void setAbout(com.vmware.converter.AboutInfo about) {
        this.about = about;
    }


    /**
     * Gets the setting value for this ServiceContent.
     * 
     * @return setting
     */
    public com.vmware.converter.ManagedObjectReference getSetting() {
        return setting;
    }


    /**
     * Sets the setting value for this ServiceContent.
     * 
     * @param setting
     */
    public void setSetting(com.vmware.converter.ManagedObjectReference setting) {
        this.setting = setting;
    }


    /**
     * Gets the userDirectory value for this ServiceContent.
     * 
     * @return userDirectory
     */
    public com.vmware.converter.ManagedObjectReference getUserDirectory() {
        return userDirectory;
    }


    /**
     * Sets the userDirectory value for this ServiceContent.
     * 
     * @param userDirectory
     */
    public void setUserDirectory(com.vmware.converter.ManagedObjectReference userDirectory) {
        this.userDirectory = userDirectory;
    }


    /**
     * Gets the sessionManager value for this ServiceContent.
     * 
     * @return sessionManager
     */
    public com.vmware.converter.ManagedObjectReference getSessionManager() {
        return sessionManager;
    }


    /**
     * Sets the sessionManager value for this ServiceContent.
     * 
     * @param sessionManager
     */
    public void setSessionManager(com.vmware.converter.ManagedObjectReference sessionManager) {
        this.sessionManager = sessionManager;
    }


    /**
     * Gets the authorizationManager value for this ServiceContent.
     * 
     * @return authorizationManager
     */
    public com.vmware.converter.ManagedObjectReference getAuthorizationManager() {
        return authorizationManager;
    }


    /**
     * Sets the authorizationManager value for this ServiceContent.
     * 
     * @param authorizationManager
     */
    public void setAuthorizationManager(com.vmware.converter.ManagedObjectReference authorizationManager) {
        this.authorizationManager = authorizationManager;
    }


    /**
     * Gets the serviceManager value for this ServiceContent.
     * 
     * @return serviceManager
     */
    public com.vmware.converter.ManagedObjectReference getServiceManager() {
        return serviceManager;
    }


    /**
     * Sets the serviceManager value for this ServiceContent.
     * 
     * @param serviceManager
     */
    public void setServiceManager(com.vmware.converter.ManagedObjectReference serviceManager) {
        this.serviceManager = serviceManager;
    }


    /**
     * Gets the perfManager value for this ServiceContent.
     * 
     * @return perfManager
     */
    public com.vmware.converter.ManagedObjectReference getPerfManager() {
        return perfManager;
    }


    /**
     * Sets the perfManager value for this ServiceContent.
     * 
     * @param perfManager
     */
    public void setPerfManager(com.vmware.converter.ManagedObjectReference perfManager) {
        this.perfManager = perfManager;
    }


    /**
     * Gets the scheduledTaskManager value for this ServiceContent.
     * 
     * @return scheduledTaskManager
     */
    public com.vmware.converter.ManagedObjectReference getScheduledTaskManager() {
        return scheduledTaskManager;
    }


    /**
     * Sets the scheduledTaskManager value for this ServiceContent.
     * 
     * @param scheduledTaskManager
     */
    public void setScheduledTaskManager(com.vmware.converter.ManagedObjectReference scheduledTaskManager) {
        this.scheduledTaskManager = scheduledTaskManager;
    }


    /**
     * Gets the alarmManager value for this ServiceContent.
     * 
     * @return alarmManager
     */
    public com.vmware.converter.ManagedObjectReference getAlarmManager() {
        return alarmManager;
    }


    /**
     * Sets the alarmManager value for this ServiceContent.
     * 
     * @param alarmManager
     */
    public void setAlarmManager(com.vmware.converter.ManagedObjectReference alarmManager) {
        this.alarmManager = alarmManager;
    }


    /**
     * Gets the eventManager value for this ServiceContent.
     * 
     * @return eventManager
     */
    public com.vmware.converter.ManagedObjectReference getEventManager() {
        return eventManager;
    }


    /**
     * Sets the eventManager value for this ServiceContent.
     * 
     * @param eventManager
     */
    public void setEventManager(com.vmware.converter.ManagedObjectReference eventManager) {
        this.eventManager = eventManager;
    }


    /**
     * Gets the taskManager value for this ServiceContent.
     * 
     * @return taskManager
     */
    public com.vmware.converter.ManagedObjectReference getTaskManager() {
        return taskManager;
    }


    /**
     * Sets the taskManager value for this ServiceContent.
     * 
     * @param taskManager
     */
    public void setTaskManager(com.vmware.converter.ManagedObjectReference taskManager) {
        this.taskManager = taskManager;
    }


    /**
     * Gets the extensionManager value for this ServiceContent.
     * 
     * @return extensionManager
     */
    public com.vmware.converter.ManagedObjectReference getExtensionManager() {
        return extensionManager;
    }


    /**
     * Sets the extensionManager value for this ServiceContent.
     * 
     * @param extensionManager
     */
    public void setExtensionManager(com.vmware.converter.ManagedObjectReference extensionManager) {
        this.extensionManager = extensionManager;
    }


    /**
     * Gets the customizationSpecManager value for this ServiceContent.
     * 
     * @return customizationSpecManager
     */
    public com.vmware.converter.ManagedObjectReference getCustomizationSpecManager() {
        return customizationSpecManager;
    }


    /**
     * Sets the customizationSpecManager value for this ServiceContent.
     * 
     * @param customizationSpecManager
     */
    public void setCustomizationSpecManager(com.vmware.converter.ManagedObjectReference customizationSpecManager) {
        this.customizationSpecManager = customizationSpecManager;
    }


    /**
     * Gets the customFieldsManager value for this ServiceContent.
     * 
     * @return customFieldsManager
     */
    public com.vmware.converter.ManagedObjectReference getCustomFieldsManager() {
        return customFieldsManager;
    }


    /**
     * Sets the customFieldsManager value for this ServiceContent.
     * 
     * @param customFieldsManager
     */
    public void setCustomFieldsManager(com.vmware.converter.ManagedObjectReference customFieldsManager) {
        this.customFieldsManager = customFieldsManager;
    }


    /**
     * Gets the accountManager value for this ServiceContent.
     * 
     * @return accountManager
     */
    public com.vmware.converter.ManagedObjectReference getAccountManager() {
        return accountManager;
    }


    /**
     * Sets the accountManager value for this ServiceContent.
     * 
     * @param accountManager
     */
    public void setAccountManager(com.vmware.converter.ManagedObjectReference accountManager) {
        this.accountManager = accountManager;
    }


    /**
     * Gets the diagnosticManager value for this ServiceContent.
     * 
     * @return diagnosticManager
     */
    public com.vmware.converter.ManagedObjectReference getDiagnosticManager() {
        return diagnosticManager;
    }


    /**
     * Sets the diagnosticManager value for this ServiceContent.
     * 
     * @param diagnosticManager
     */
    public void setDiagnosticManager(com.vmware.converter.ManagedObjectReference diagnosticManager) {
        this.diagnosticManager = diagnosticManager;
    }


    /**
     * Gets the licenseManager value for this ServiceContent.
     * 
     * @return licenseManager
     */
    public com.vmware.converter.ManagedObjectReference getLicenseManager() {
        return licenseManager;
    }


    /**
     * Sets the licenseManager value for this ServiceContent.
     * 
     * @param licenseManager
     */
    public void setLicenseManager(com.vmware.converter.ManagedObjectReference licenseManager) {
        this.licenseManager = licenseManager;
    }


    /**
     * Gets the searchIndex value for this ServiceContent.
     * 
     * @return searchIndex
     */
    public com.vmware.converter.ManagedObjectReference getSearchIndex() {
        return searchIndex;
    }


    /**
     * Sets the searchIndex value for this ServiceContent.
     * 
     * @param searchIndex
     */
    public void setSearchIndex(com.vmware.converter.ManagedObjectReference searchIndex) {
        this.searchIndex = searchIndex;
    }


    /**
     * Gets the fileManager value for this ServiceContent.
     * 
     * @return fileManager
     */
    public com.vmware.converter.ManagedObjectReference getFileManager() {
        return fileManager;
    }


    /**
     * Sets the fileManager value for this ServiceContent.
     * 
     * @param fileManager
     */
    public void setFileManager(com.vmware.converter.ManagedObjectReference fileManager) {
        this.fileManager = fileManager;
    }


    /**
     * Gets the datastoreNamespaceManager value for this ServiceContent.
     * 
     * @return datastoreNamespaceManager
     */
    public com.vmware.converter.ManagedObjectReference getDatastoreNamespaceManager() {
        return datastoreNamespaceManager;
    }


    /**
     * Sets the datastoreNamespaceManager value for this ServiceContent.
     * 
     * @param datastoreNamespaceManager
     */
    public void setDatastoreNamespaceManager(com.vmware.converter.ManagedObjectReference datastoreNamespaceManager) {
        this.datastoreNamespaceManager = datastoreNamespaceManager;
    }


    /**
     * Gets the virtualDiskManager value for this ServiceContent.
     * 
     * @return virtualDiskManager
     */
    public com.vmware.converter.ManagedObjectReference getVirtualDiskManager() {
        return virtualDiskManager;
    }


    /**
     * Sets the virtualDiskManager value for this ServiceContent.
     * 
     * @param virtualDiskManager
     */
    public void setVirtualDiskManager(com.vmware.converter.ManagedObjectReference virtualDiskManager) {
        this.virtualDiskManager = virtualDiskManager;
    }


    /**
     * Gets the virtualizationManager value for this ServiceContent.
     * 
     * @return virtualizationManager
     */
    public com.vmware.converter.ManagedObjectReference getVirtualizationManager() {
        return virtualizationManager;
    }


    /**
     * Sets the virtualizationManager value for this ServiceContent.
     * 
     * @param virtualizationManager
     */
    public void setVirtualizationManager(com.vmware.converter.ManagedObjectReference virtualizationManager) {
        this.virtualizationManager = virtualizationManager;
    }


    /**
     * Gets the snmpSystem value for this ServiceContent.
     * 
     * @return snmpSystem
     */
    public com.vmware.converter.ManagedObjectReference getSnmpSystem() {
        return snmpSystem;
    }


    /**
     * Sets the snmpSystem value for this ServiceContent.
     * 
     * @param snmpSystem
     */
    public void setSnmpSystem(com.vmware.converter.ManagedObjectReference snmpSystem) {
        this.snmpSystem = snmpSystem;
    }


    /**
     * Gets the vmProvisioningChecker value for this ServiceContent.
     * 
     * @return vmProvisioningChecker
     */
    public com.vmware.converter.ManagedObjectReference getVmProvisioningChecker() {
        return vmProvisioningChecker;
    }


    /**
     * Sets the vmProvisioningChecker value for this ServiceContent.
     * 
     * @param vmProvisioningChecker
     */
    public void setVmProvisioningChecker(com.vmware.converter.ManagedObjectReference vmProvisioningChecker) {
        this.vmProvisioningChecker = vmProvisioningChecker;
    }


    /**
     * Gets the vmCompatibilityChecker value for this ServiceContent.
     * 
     * @return vmCompatibilityChecker
     */
    public com.vmware.converter.ManagedObjectReference getVmCompatibilityChecker() {
        return vmCompatibilityChecker;
    }


    /**
     * Sets the vmCompatibilityChecker value for this ServiceContent.
     * 
     * @param vmCompatibilityChecker
     */
    public void setVmCompatibilityChecker(com.vmware.converter.ManagedObjectReference vmCompatibilityChecker) {
        this.vmCompatibilityChecker = vmCompatibilityChecker;
    }


    /**
     * Gets the ovfManager value for this ServiceContent.
     * 
     * @return ovfManager
     */
    public com.vmware.converter.ManagedObjectReference getOvfManager() {
        return ovfManager;
    }


    /**
     * Sets the ovfManager value for this ServiceContent.
     * 
     * @param ovfManager
     */
    public void setOvfManager(com.vmware.converter.ManagedObjectReference ovfManager) {
        this.ovfManager = ovfManager;
    }


    /**
     * Gets the ipPoolManager value for this ServiceContent.
     * 
     * @return ipPoolManager
     */
    public com.vmware.converter.ManagedObjectReference getIpPoolManager() {
        return ipPoolManager;
    }


    /**
     * Sets the ipPoolManager value for this ServiceContent.
     * 
     * @param ipPoolManager
     */
    public void setIpPoolManager(com.vmware.converter.ManagedObjectReference ipPoolManager) {
        this.ipPoolManager = ipPoolManager;
    }


    /**
     * Gets the dvSwitchManager value for this ServiceContent.
     * 
     * @return dvSwitchManager
     */
    public com.vmware.converter.ManagedObjectReference getDvSwitchManager() {
        return dvSwitchManager;
    }


    /**
     * Sets the dvSwitchManager value for this ServiceContent.
     * 
     * @param dvSwitchManager
     */
    public void setDvSwitchManager(com.vmware.converter.ManagedObjectReference dvSwitchManager) {
        this.dvSwitchManager = dvSwitchManager;
    }


    /**
     * Gets the hostProfileManager value for this ServiceContent.
     * 
     * @return hostProfileManager
     */
    public com.vmware.converter.ManagedObjectReference getHostProfileManager() {
        return hostProfileManager;
    }


    /**
     * Sets the hostProfileManager value for this ServiceContent.
     * 
     * @param hostProfileManager
     */
    public void setHostProfileManager(com.vmware.converter.ManagedObjectReference hostProfileManager) {
        this.hostProfileManager = hostProfileManager;
    }


    /**
     * Gets the clusterProfileManager value for this ServiceContent.
     * 
     * @return clusterProfileManager
     */
    public com.vmware.converter.ManagedObjectReference getClusterProfileManager() {
        return clusterProfileManager;
    }


    /**
     * Sets the clusterProfileManager value for this ServiceContent.
     * 
     * @param clusterProfileManager
     */
    public void setClusterProfileManager(com.vmware.converter.ManagedObjectReference clusterProfileManager) {
        this.clusterProfileManager = clusterProfileManager;
    }


    /**
     * Gets the complianceManager value for this ServiceContent.
     * 
     * @return complianceManager
     */
    public com.vmware.converter.ManagedObjectReference getComplianceManager() {
        return complianceManager;
    }


    /**
     * Sets the complianceManager value for this ServiceContent.
     * 
     * @param complianceManager
     */
    public void setComplianceManager(com.vmware.converter.ManagedObjectReference complianceManager) {
        this.complianceManager = complianceManager;
    }


    /**
     * Gets the localizationManager value for this ServiceContent.
     * 
     * @return localizationManager
     */
    public com.vmware.converter.ManagedObjectReference getLocalizationManager() {
        return localizationManager;
    }


    /**
     * Sets the localizationManager value for this ServiceContent.
     * 
     * @param localizationManager
     */
    public void setLocalizationManager(com.vmware.converter.ManagedObjectReference localizationManager) {
        this.localizationManager = localizationManager;
    }


    /**
     * Gets the storageResourceManager value for this ServiceContent.
     * 
     * @return storageResourceManager
     */
    public com.vmware.converter.ManagedObjectReference getStorageResourceManager() {
        return storageResourceManager;
    }


    /**
     * Sets the storageResourceManager value for this ServiceContent.
     * 
     * @param storageResourceManager
     */
    public void setStorageResourceManager(com.vmware.converter.ManagedObjectReference storageResourceManager) {
        this.storageResourceManager = storageResourceManager;
    }


    /**
     * Gets the guestOperationsManager value for this ServiceContent.
     * 
     * @return guestOperationsManager
     */
    public com.vmware.converter.ManagedObjectReference getGuestOperationsManager() {
        return guestOperationsManager;
    }


    /**
     * Sets the guestOperationsManager value for this ServiceContent.
     * 
     * @param guestOperationsManager
     */
    public void setGuestOperationsManager(com.vmware.converter.ManagedObjectReference guestOperationsManager) {
        this.guestOperationsManager = guestOperationsManager;
    }


    /**
     * Gets the overheadMemoryManager value for this ServiceContent.
     * 
     * @return overheadMemoryManager
     */
    public com.vmware.converter.ManagedObjectReference getOverheadMemoryManager() {
        return overheadMemoryManager;
    }


    /**
     * Sets the overheadMemoryManager value for this ServiceContent.
     * 
     * @param overheadMemoryManager
     */
    public void setOverheadMemoryManager(com.vmware.converter.ManagedObjectReference overheadMemoryManager) {
        this.overheadMemoryManager = overheadMemoryManager;
    }


    /**
     * Gets the certificateManager value for this ServiceContent.
     * 
     * @return certificateManager
     */
    public com.vmware.converter.ManagedObjectReference getCertificateManager() {
        return certificateManager;
    }


    /**
     * Sets the certificateManager value for this ServiceContent.
     * 
     * @param certificateManager
     */
    public void setCertificateManager(com.vmware.converter.ManagedObjectReference certificateManager) {
        this.certificateManager = certificateManager;
    }


    /**
     * Gets the ioFilterManager value for this ServiceContent.
     * 
     * @return ioFilterManager
     */
    public com.vmware.converter.ManagedObjectReference getIoFilterManager() {
        return ioFilterManager;
    }


    /**
     * Sets the ioFilterManager value for this ServiceContent.
     * 
     * @param ioFilterManager
     */
    public void setIoFilterManager(com.vmware.converter.ManagedObjectReference ioFilterManager) {
        this.ioFilterManager = ioFilterManager;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceContent)) return false;
        ServiceContent other = (ServiceContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rootFolder==null && other.getRootFolder()==null) || 
             (this.rootFolder!=null &&
              this.rootFolder.equals(other.getRootFolder()))) &&
            ((this.propertyCollector==null && other.getPropertyCollector()==null) || 
             (this.propertyCollector!=null &&
              this.propertyCollector.equals(other.getPropertyCollector()))) &&
            ((this.viewManager==null && other.getViewManager()==null) || 
             (this.viewManager!=null &&
              this.viewManager.equals(other.getViewManager()))) &&
            ((this.about==null && other.getAbout()==null) || 
             (this.about!=null &&
              this.about.equals(other.getAbout()))) &&
            ((this.setting==null && other.getSetting()==null) || 
             (this.setting!=null &&
              this.setting.equals(other.getSetting()))) &&
            ((this.userDirectory==null && other.getUserDirectory()==null) || 
             (this.userDirectory!=null &&
              this.userDirectory.equals(other.getUserDirectory()))) &&
            ((this.sessionManager==null && other.getSessionManager()==null) || 
             (this.sessionManager!=null &&
              this.sessionManager.equals(other.getSessionManager()))) &&
            ((this.authorizationManager==null && other.getAuthorizationManager()==null) || 
             (this.authorizationManager!=null &&
              this.authorizationManager.equals(other.getAuthorizationManager()))) &&
            ((this.serviceManager==null && other.getServiceManager()==null) || 
             (this.serviceManager!=null &&
              this.serviceManager.equals(other.getServiceManager()))) &&
            ((this.perfManager==null && other.getPerfManager()==null) || 
             (this.perfManager!=null &&
              this.perfManager.equals(other.getPerfManager()))) &&
            ((this.scheduledTaskManager==null && other.getScheduledTaskManager()==null) || 
             (this.scheduledTaskManager!=null &&
              this.scheduledTaskManager.equals(other.getScheduledTaskManager()))) &&
            ((this.alarmManager==null && other.getAlarmManager()==null) || 
             (this.alarmManager!=null &&
              this.alarmManager.equals(other.getAlarmManager()))) &&
            ((this.eventManager==null && other.getEventManager()==null) || 
             (this.eventManager!=null &&
              this.eventManager.equals(other.getEventManager()))) &&
            ((this.taskManager==null && other.getTaskManager()==null) || 
             (this.taskManager!=null &&
              this.taskManager.equals(other.getTaskManager()))) &&
            ((this.extensionManager==null && other.getExtensionManager()==null) || 
             (this.extensionManager!=null &&
              this.extensionManager.equals(other.getExtensionManager()))) &&
            ((this.customizationSpecManager==null && other.getCustomizationSpecManager()==null) || 
             (this.customizationSpecManager!=null &&
              this.customizationSpecManager.equals(other.getCustomizationSpecManager()))) &&
            ((this.customFieldsManager==null && other.getCustomFieldsManager()==null) || 
             (this.customFieldsManager!=null &&
              this.customFieldsManager.equals(other.getCustomFieldsManager()))) &&
            ((this.accountManager==null && other.getAccountManager()==null) || 
             (this.accountManager!=null &&
              this.accountManager.equals(other.getAccountManager()))) &&
            ((this.diagnosticManager==null && other.getDiagnosticManager()==null) || 
             (this.diagnosticManager!=null &&
              this.diagnosticManager.equals(other.getDiagnosticManager()))) &&
            ((this.licenseManager==null && other.getLicenseManager()==null) || 
             (this.licenseManager!=null &&
              this.licenseManager.equals(other.getLicenseManager()))) &&
            ((this.searchIndex==null && other.getSearchIndex()==null) || 
             (this.searchIndex!=null &&
              this.searchIndex.equals(other.getSearchIndex()))) &&
            ((this.fileManager==null && other.getFileManager()==null) || 
             (this.fileManager!=null &&
              this.fileManager.equals(other.getFileManager()))) &&
            ((this.datastoreNamespaceManager==null && other.getDatastoreNamespaceManager()==null) || 
             (this.datastoreNamespaceManager!=null &&
              this.datastoreNamespaceManager.equals(other.getDatastoreNamespaceManager()))) &&
            ((this.virtualDiskManager==null && other.getVirtualDiskManager()==null) || 
             (this.virtualDiskManager!=null &&
              this.virtualDiskManager.equals(other.getVirtualDiskManager()))) &&
            ((this.virtualizationManager==null && other.getVirtualizationManager()==null) || 
             (this.virtualizationManager!=null &&
              this.virtualizationManager.equals(other.getVirtualizationManager()))) &&
            ((this.snmpSystem==null && other.getSnmpSystem()==null) || 
             (this.snmpSystem!=null &&
              this.snmpSystem.equals(other.getSnmpSystem()))) &&
            ((this.vmProvisioningChecker==null && other.getVmProvisioningChecker()==null) || 
             (this.vmProvisioningChecker!=null &&
              this.vmProvisioningChecker.equals(other.getVmProvisioningChecker()))) &&
            ((this.vmCompatibilityChecker==null && other.getVmCompatibilityChecker()==null) || 
             (this.vmCompatibilityChecker!=null &&
              this.vmCompatibilityChecker.equals(other.getVmCompatibilityChecker()))) &&
            ((this.ovfManager==null && other.getOvfManager()==null) || 
             (this.ovfManager!=null &&
              this.ovfManager.equals(other.getOvfManager()))) &&
            ((this.ipPoolManager==null && other.getIpPoolManager()==null) || 
             (this.ipPoolManager!=null &&
              this.ipPoolManager.equals(other.getIpPoolManager()))) &&
            ((this.dvSwitchManager==null && other.getDvSwitchManager()==null) || 
             (this.dvSwitchManager!=null &&
              this.dvSwitchManager.equals(other.getDvSwitchManager()))) &&
            ((this.hostProfileManager==null && other.getHostProfileManager()==null) || 
             (this.hostProfileManager!=null &&
              this.hostProfileManager.equals(other.getHostProfileManager()))) &&
            ((this.clusterProfileManager==null && other.getClusterProfileManager()==null) || 
             (this.clusterProfileManager!=null &&
              this.clusterProfileManager.equals(other.getClusterProfileManager()))) &&
            ((this.complianceManager==null && other.getComplianceManager()==null) || 
             (this.complianceManager!=null &&
              this.complianceManager.equals(other.getComplianceManager()))) &&
            ((this.localizationManager==null && other.getLocalizationManager()==null) || 
             (this.localizationManager!=null &&
              this.localizationManager.equals(other.getLocalizationManager()))) &&
            ((this.storageResourceManager==null && other.getStorageResourceManager()==null) || 
             (this.storageResourceManager!=null &&
              this.storageResourceManager.equals(other.getStorageResourceManager()))) &&
            ((this.guestOperationsManager==null && other.getGuestOperationsManager()==null) || 
             (this.guestOperationsManager!=null &&
              this.guestOperationsManager.equals(other.getGuestOperationsManager()))) &&
            ((this.overheadMemoryManager==null && other.getOverheadMemoryManager()==null) || 
             (this.overheadMemoryManager!=null &&
              this.overheadMemoryManager.equals(other.getOverheadMemoryManager()))) &&
            ((this.certificateManager==null && other.getCertificateManager()==null) || 
             (this.certificateManager!=null &&
              this.certificateManager.equals(other.getCertificateManager()))) &&
            ((this.ioFilterManager==null && other.getIoFilterManager()==null) || 
             (this.ioFilterManager!=null &&
              this.ioFilterManager.equals(other.getIoFilterManager())));
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
        if (getRootFolder() != null) {
            _hashCode += getRootFolder().hashCode();
        }
        if (getPropertyCollector() != null) {
            _hashCode += getPropertyCollector().hashCode();
        }
        if (getViewManager() != null) {
            _hashCode += getViewManager().hashCode();
        }
        if (getAbout() != null) {
            _hashCode += getAbout().hashCode();
        }
        if (getSetting() != null) {
            _hashCode += getSetting().hashCode();
        }
        if (getUserDirectory() != null) {
            _hashCode += getUserDirectory().hashCode();
        }
        if (getSessionManager() != null) {
            _hashCode += getSessionManager().hashCode();
        }
        if (getAuthorizationManager() != null) {
            _hashCode += getAuthorizationManager().hashCode();
        }
        if (getServiceManager() != null) {
            _hashCode += getServiceManager().hashCode();
        }
        if (getPerfManager() != null) {
            _hashCode += getPerfManager().hashCode();
        }
        if (getScheduledTaskManager() != null) {
            _hashCode += getScheduledTaskManager().hashCode();
        }
        if (getAlarmManager() != null) {
            _hashCode += getAlarmManager().hashCode();
        }
        if (getEventManager() != null) {
            _hashCode += getEventManager().hashCode();
        }
        if (getTaskManager() != null) {
            _hashCode += getTaskManager().hashCode();
        }
        if (getExtensionManager() != null) {
            _hashCode += getExtensionManager().hashCode();
        }
        if (getCustomizationSpecManager() != null) {
            _hashCode += getCustomizationSpecManager().hashCode();
        }
        if (getCustomFieldsManager() != null) {
            _hashCode += getCustomFieldsManager().hashCode();
        }
        if (getAccountManager() != null) {
            _hashCode += getAccountManager().hashCode();
        }
        if (getDiagnosticManager() != null) {
            _hashCode += getDiagnosticManager().hashCode();
        }
        if (getLicenseManager() != null) {
            _hashCode += getLicenseManager().hashCode();
        }
        if (getSearchIndex() != null) {
            _hashCode += getSearchIndex().hashCode();
        }
        if (getFileManager() != null) {
            _hashCode += getFileManager().hashCode();
        }
        if (getDatastoreNamespaceManager() != null) {
            _hashCode += getDatastoreNamespaceManager().hashCode();
        }
        if (getVirtualDiskManager() != null) {
            _hashCode += getVirtualDiskManager().hashCode();
        }
        if (getVirtualizationManager() != null) {
            _hashCode += getVirtualizationManager().hashCode();
        }
        if (getSnmpSystem() != null) {
            _hashCode += getSnmpSystem().hashCode();
        }
        if (getVmProvisioningChecker() != null) {
            _hashCode += getVmProvisioningChecker().hashCode();
        }
        if (getVmCompatibilityChecker() != null) {
            _hashCode += getVmCompatibilityChecker().hashCode();
        }
        if (getOvfManager() != null) {
            _hashCode += getOvfManager().hashCode();
        }
        if (getIpPoolManager() != null) {
            _hashCode += getIpPoolManager().hashCode();
        }
        if (getDvSwitchManager() != null) {
            _hashCode += getDvSwitchManager().hashCode();
        }
        if (getHostProfileManager() != null) {
            _hashCode += getHostProfileManager().hashCode();
        }
        if (getClusterProfileManager() != null) {
            _hashCode += getClusterProfileManager().hashCode();
        }
        if (getComplianceManager() != null) {
            _hashCode += getComplianceManager().hashCode();
        }
        if (getLocalizationManager() != null) {
            _hashCode += getLocalizationManager().hashCode();
        }
        if (getStorageResourceManager() != null) {
            _hashCode += getStorageResourceManager().hashCode();
        }
        if (getGuestOperationsManager() != null) {
            _hashCode += getGuestOperationsManager().hashCode();
        }
        if (getOverheadMemoryManager() != null) {
            _hashCode += getOverheadMemoryManager().hashCode();
        }
        if (getCertificateManager() != null) {
            _hashCode += getCertificateManager().hashCode();
        }
        if (getIoFilterManager() != null) {
            _hashCode += getIoFilterManager().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rootFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCollector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertyCollector"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "viewManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("about");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "about"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AboutInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "setting"));
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
        elemField.setFieldName("sessionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sessionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "authorizationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serviceManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perfManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTaskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scheduledTaskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alarmManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "taskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationSpecManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "customizationSpecManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldsManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "customFieldsManager"));
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
        elemField.setFieldName("diagnosticManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diagnosticManager"));
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
        elemField.setFieldName("searchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "searchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreNamespaceManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreNamespaceManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDiskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualDiskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualizationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualizationManager"));
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
        elemField.setFieldName("vmProvisioningChecker");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmProvisioningChecker"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmCompatibilityChecker");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmCompatibilityChecker"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipPoolManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipPoolManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvSwitchManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvSwitchManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostProfileManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostProfileManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterProfileManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterProfileManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complianceManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "complianceManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localizationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageResourceManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageResourceManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestOperationsManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestOperationsManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overheadMemoryManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overheadMemoryManager"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioFilterManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioFilterManager"));
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
