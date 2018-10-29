/**
 * ConverterCloningCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCloningCapabilities  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int[] numCPUValues;

    private long minMemoryMB;

    private long maxMemoryMB;

    private long defaultMemoryMB;

    private int supportedMaxCPUs;

    private java.lang.Integer numSupportedPhysicalSockets;

    private java.lang.Integer numSupportedCoresPerSocket;

    private long supportedMinMemMB;

    private long supportedMaxMemMB;

    private long recommendedMemMB;

    private int maxNumberOfNICs;

    private int defaultNumberOfNICs;

    private java.lang.String[] supportedCloningMode;

    private java.lang.String[] supportedDiskCreateType;

    private java.lang.String defaultDiskCreateType;

    private java.lang.String[] supportedDiskControllerType;

    private java.lang.String defaultScsiControllerType;

    private java.lang.String defaultCdromControllerType;

    private boolean canSynchronize;

    private java.lang.Boolean canScheduleSynchronization;

    private boolean canPowerOnTargetMachine;

    private boolean canPowerOffSourceMachine;

    private boolean canStopServices;

    private boolean canSkipUnwantedFiles;

    private java.lang.Boolean canCreateOptimizedPartitionAlignment;

    public ConverterCloningCapabilities() {
    }

    public ConverterCloningCapabilities(
           int[] numCPUValues,
           long minMemoryMB,
           long maxMemoryMB,
           long defaultMemoryMB,
           int supportedMaxCPUs,
           java.lang.Integer numSupportedPhysicalSockets,
           java.lang.Integer numSupportedCoresPerSocket,
           long supportedMinMemMB,
           long supportedMaxMemMB,
           long recommendedMemMB,
           int maxNumberOfNICs,
           int defaultNumberOfNICs,
           java.lang.String[] supportedCloningMode,
           java.lang.String[] supportedDiskCreateType,
           java.lang.String defaultDiskCreateType,
           java.lang.String[] supportedDiskControllerType,
           java.lang.String defaultScsiControllerType,
           java.lang.String defaultCdromControllerType,
           boolean canSynchronize,
           java.lang.Boolean canScheduleSynchronization,
           boolean canPowerOnTargetMachine,
           boolean canPowerOffSourceMachine,
           boolean canStopServices,
           boolean canSkipUnwantedFiles,
           java.lang.Boolean canCreateOptimizedPartitionAlignment) {
        this.numCPUValues = numCPUValues;
        this.minMemoryMB = minMemoryMB;
        this.maxMemoryMB = maxMemoryMB;
        this.defaultMemoryMB = defaultMemoryMB;
        this.supportedMaxCPUs = supportedMaxCPUs;
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
        this.supportedMinMemMB = supportedMinMemMB;
        this.supportedMaxMemMB = supportedMaxMemMB;
        this.recommendedMemMB = recommendedMemMB;
        this.maxNumberOfNICs = maxNumberOfNICs;
        this.defaultNumberOfNICs = defaultNumberOfNICs;
        this.supportedCloningMode = supportedCloningMode;
        this.supportedDiskCreateType = supportedDiskCreateType;
        this.defaultDiskCreateType = defaultDiskCreateType;
        this.supportedDiskControllerType = supportedDiskControllerType;
        this.defaultScsiControllerType = defaultScsiControllerType;
        this.defaultCdromControllerType = defaultCdromControllerType;
        this.canSynchronize = canSynchronize;
        this.canScheduleSynchronization = canScheduleSynchronization;
        this.canPowerOnTargetMachine = canPowerOnTargetMachine;
        this.canPowerOffSourceMachine = canPowerOffSourceMachine;
        this.canStopServices = canStopServices;
        this.canSkipUnwantedFiles = canSkipUnwantedFiles;
        this.canCreateOptimizedPartitionAlignment = canCreateOptimizedPartitionAlignment;
    }


    /**
     * Gets the numCPUValues value for this ConverterCloningCapabilities.
     * 
     * @return numCPUValues
     */
    public int[] getNumCPUValues() {
        return numCPUValues;
    }


    /**
     * Sets the numCPUValues value for this ConverterCloningCapabilities.
     * 
     * @param numCPUValues
     */
    public void setNumCPUValues(int[] numCPUValues) {
        this.numCPUValues = numCPUValues;
    }

    public int getNumCPUValues(int i) {
        return this.numCPUValues[i];
    }

    public void setNumCPUValues(int i, int _value) {
        this.numCPUValues[i] = _value;
    }


    /**
     * Gets the minMemoryMB value for this ConverterCloningCapabilities.
     * 
     * @return minMemoryMB
     */
    public long getMinMemoryMB() {
        return minMemoryMB;
    }


    /**
     * Sets the minMemoryMB value for this ConverterCloningCapabilities.
     * 
     * @param minMemoryMB
     */
    public void setMinMemoryMB(long minMemoryMB) {
        this.minMemoryMB = minMemoryMB;
    }


    /**
     * Gets the maxMemoryMB value for this ConverterCloningCapabilities.
     * 
     * @return maxMemoryMB
     */
    public long getMaxMemoryMB() {
        return maxMemoryMB;
    }


    /**
     * Sets the maxMemoryMB value for this ConverterCloningCapabilities.
     * 
     * @param maxMemoryMB
     */
    public void setMaxMemoryMB(long maxMemoryMB) {
        this.maxMemoryMB = maxMemoryMB;
    }


    /**
     * Gets the defaultMemoryMB value for this ConverterCloningCapabilities.
     * 
     * @return defaultMemoryMB
     */
    public long getDefaultMemoryMB() {
        return defaultMemoryMB;
    }


    /**
     * Sets the defaultMemoryMB value for this ConverterCloningCapabilities.
     * 
     * @param defaultMemoryMB
     */
    public void setDefaultMemoryMB(long defaultMemoryMB) {
        this.defaultMemoryMB = defaultMemoryMB;
    }


    /**
     * Gets the supportedMaxCPUs value for this ConverterCloningCapabilities.
     * 
     * @return supportedMaxCPUs
     */
    public int getSupportedMaxCPUs() {
        return supportedMaxCPUs;
    }


    /**
     * Sets the supportedMaxCPUs value for this ConverterCloningCapabilities.
     * 
     * @param supportedMaxCPUs
     */
    public void setSupportedMaxCPUs(int supportedMaxCPUs) {
        this.supportedMaxCPUs = supportedMaxCPUs;
    }


    /**
     * Gets the numSupportedPhysicalSockets value for this ConverterCloningCapabilities.
     * 
     * @return numSupportedPhysicalSockets
     */
    public java.lang.Integer getNumSupportedPhysicalSockets() {
        return numSupportedPhysicalSockets;
    }


    /**
     * Sets the numSupportedPhysicalSockets value for this ConverterCloningCapabilities.
     * 
     * @param numSupportedPhysicalSockets
     */
    public void setNumSupportedPhysicalSockets(java.lang.Integer numSupportedPhysicalSockets) {
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
    }


    /**
     * Gets the numSupportedCoresPerSocket value for this ConverterCloningCapabilities.
     * 
     * @return numSupportedCoresPerSocket
     */
    public java.lang.Integer getNumSupportedCoresPerSocket() {
        return numSupportedCoresPerSocket;
    }


    /**
     * Sets the numSupportedCoresPerSocket value for this ConverterCloningCapabilities.
     * 
     * @param numSupportedCoresPerSocket
     */
    public void setNumSupportedCoresPerSocket(java.lang.Integer numSupportedCoresPerSocket) {
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
    }


    /**
     * Gets the supportedMinMemMB value for this ConverterCloningCapabilities.
     * 
     * @return supportedMinMemMB
     */
    public long getSupportedMinMemMB() {
        return supportedMinMemMB;
    }


    /**
     * Sets the supportedMinMemMB value for this ConverterCloningCapabilities.
     * 
     * @param supportedMinMemMB
     */
    public void setSupportedMinMemMB(long supportedMinMemMB) {
        this.supportedMinMemMB = supportedMinMemMB;
    }


    /**
     * Gets the supportedMaxMemMB value for this ConverterCloningCapabilities.
     * 
     * @return supportedMaxMemMB
     */
    public long getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }


    /**
     * Sets the supportedMaxMemMB value for this ConverterCloningCapabilities.
     * 
     * @param supportedMaxMemMB
     */
    public void setSupportedMaxMemMB(long supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }


    /**
     * Gets the recommendedMemMB value for this ConverterCloningCapabilities.
     * 
     * @return recommendedMemMB
     */
    public long getRecommendedMemMB() {
        return recommendedMemMB;
    }


    /**
     * Sets the recommendedMemMB value for this ConverterCloningCapabilities.
     * 
     * @param recommendedMemMB
     */
    public void setRecommendedMemMB(long recommendedMemMB) {
        this.recommendedMemMB = recommendedMemMB;
    }


    /**
     * Gets the maxNumberOfNICs value for this ConverterCloningCapabilities.
     * 
     * @return maxNumberOfNICs
     */
    public int getMaxNumberOfNICs() {
        return maxNumberOfNICs;
    }


    /**
     * Sets the maxNumberOfNICs value for this ConverterCloningCapabilities.
     * 
     * @param maxNumberOfNICs
     */
    public void setMaxNumberOfNICs(int maxNumberOfNICs) {
        this.maxNumberOfNICs = maxNumberOfNICs;
    }


    /**
     * Gets the defaultNumberOfNICs value for this ConverterCloningCapabilities.
     * 
     * @return defaultNumberOfNICs
     */
    public int getDefaultNumberOfNICs() {
        return defaultNumberOfNICs;
    }


    /**
     * Sets the defaultNumberOfNICs value for this ConverterCloningCapabilities.
     * 
     * @param defaultNumberOfNICs
     */
    public void setDefaultNumberOfNICs(int defaultNumberOfNICs) {
        this.defaultNumberOfNICs = defaultNumberOfNICs;
    }


    /**
     * Gets the supportedCloningMode value for this ConverterCloningCapabilities.
     * 
     * @return supportedCloningMode
     */
    public java.lang.String[] getSupportedCloningMode() {
        return supportedCloningMode;
    }


    /**
     * Sets the supportedCloningMode value for this ConverterCloningCapabilities.
     * 
     * @param supportedCloningMode
     */
    public void setSupportedCloningMode(java.lang.String[] supportedCloningMode) {
        this.supportedCloningMode = supportedCloningMode;
    }

    public java.lang.String getSupportedCloningMode(int i) {
        return this.supportedCloningMode[i];
    }

    public void setSupportedCloningMode(int i, java.lang.String _value) {
        this.supportedCloningMode[i] = _value;
    }


    /**
     * Gets the supportedDiskCreateType value for this ConverterCloningCapabilities.
     * 
     * @return supportedDiskCreateType
     */
    public java.lang.String[] getSupportedDiskCreateType() {
        return supportedDiskCreateType;
    }


    /**
     * Sets the supportedDiskCreateType value for this ConverterCloningCapabilities.
     * 
     * @param supportedDiskCreateType
     */
    public void setSupportedDiskCreateType(java.lang.String[] supportedDiskCreateType) {
        this.supportedDiskCreateType = supportedDiskCreateType;
    }

    public java.lang.String getSupportedDiskCreateType(int i) {
        return this.supportedDiskCreateType[i];
    }

    public void setSupportedDiskCreateType(int i, java.lang.String _value) {
        this.supportedDiskCreateType[i] = _value;
    }


    /**
     * Gets the defaultDiskCreateType value for this ConverterCloningCapabilities.
     * 
     * @return defaultDiskCreateType
     */
    public java.lang.String getDefaultDiskCreateType() {
        return defaultDiskCreateType;
    }


    /**
     * Sets the defaultDiskCreateType value for this ConverterCloningCapabilities.
     * 
     * @param defaultDiskCreateType
     */
    public void setDefaultDiskCreateType(java.lang.String defaultDiskCreateType) {
        this.defaultDiskCreateType = defaultDiskCreateType;
    }


    /**
     * Gets the supportedDiskControllerType value for this ConverterCloningCapabilities.
     * 
     * @return supportedDiskControllerType
     */
    public java.lang.String[] getSupportedDiskControllerType() {
        return supportedDiskControllerType;
    }


    /**
     * Sets the supportedDiskControllerType value for this ConverterCloningCapabilities.
     * 
     * @param supportedDiskControllerType
     */
    public void setSupportedDiskControllerType(java.lang.String[] supportedDiskControllerType) {
        this.supportedDiskControllerType = supportedDiskControllerType;
    }

    public java.lang.String getSupportedDiskControllerType(int i) {
        return this.supportedDiskControllerType[i];
    }

    public void setSupportedDiskControllerType(int i, java.lang.String _value) {
        this.supportedDiskControllerType[i] = _value;
    }


    /**
     * Gets the defaultScsiControllerType value for this ConverterCloningCapabilities.
     * 
     * @return defaultScsiControllerType
     */
    public java.lang.String getDefaultScsiControllerType() {
        return defaultScsiControllerType;
    }


    /**
     * Sets the defaultScsiControllerType value for this ConverterCloningCapabilities.
     * 
     * @param defaultScsiControllerType
     */
    public void setDefaultScsiControllerType(java.lang.String defaultScsiControllerType) {
        this.defaultScsiControllerType = defaultScsiControllerType;
    }


    /**
     * Gets the defaultCdromControllerType value for this ConverterCloningCapabilities.
     * 
     * @return defaultCdromControllerType
     */
    public java.lang.String getDefaultCdromControllerType() {
        return defaultCdromControllerType;
    }


    /**
     * Sets the defaultCdromControllerType value for this ConverterCloningCapabilities.
     * 
     * @param defaultCdromControllerType
     */
    public void setDefaultCdromControllerType(java.lang.String defaultCdromControllerType) {
        this.defaultCdromControllerType = defaultCdromControllerType;
    }


    /**
     * Gets the canSynchronize value for this ConverterCloningCapabilities.
     * 
     * @return canSynchronize
     */
    public boolean isCanSynchronize() {
        return canSynchronize;
    }


    /**
     * Sets the canSynchronize value for this ConverterCloningCapabilities.
     * 
     * @param canSynchronize
     */
    public void setCanSynchronize(boolean canSynchronize) {
        this.canSynchronize = canSynchronize;
    }


    /**
     * Gets the canScheduleSynchronization value for this ConverterCloningCapabilities.
     * 
     * @return canScheduleSynchronization
     */
    public java.lang.Boolean getCanScheduleSynchronization() {
        return canScheduleSynchronization;
    }


    /**
     * Sets the canScheduleSynchronization value for this ConverterCloningCapabilities.
     * 
     * @param canScheduleSynchronization
     */
    public void setCanScheduleSynchronization(java.lang.Boolean canScheduleSynchronization) {
        this.canScheduleSynchronization = canScheduleSynchronization;
    }


    /**
     * Gets the canPowerOnTargetMachine value for this ConverterCloningCapabilities.
     * 
     * @return canPowerOnTargetMachine
     */
    public boolean isCanPowerOnTargetMachine() {
        return canPowerOnTargetMachine;
    }


    /**
     * Sets the canPowerOnTargetMachine value for this ConverterCloningCapabilities.
     * 
     * @param canPowerOnTargetMachine
     */
    public void setCanPowerOnTargetMachine(boolean canPowerOnTargetMachine) {
        this.canPowerOnTargetMachine = canPowerOnTargetMachine;
    }


    /**
     * Gets the canPowerOffSourceMachine value for this ConverterCloningCapabilities.
     * 
     * @return canPowerOffSourceMachine
     */
    public boolean isCanPowerOffSourceMachine() {
        return canPowerOffSourceMachine;
    }


    /**
     * Sets the canPowerOffSourceMachine value for this ConverterCloningCapabilities.
     * 
     * @param canPowerOffSourceMachine
     */
    public void setCanPowerOffSourceMachine(boolean canPowerOffSourceMachine) {
        this.canPowerOffSourceMachine = canPowerOffSourceMachine;
    }


    /**
     * Gets the canStopServices value for this ConverterCloningCapabilities.
     * 
     * @return canStopServices
     */
    public boolean isCanStopServices() {
        return canStopServices;
    }


    /**
     * Sets the canStopServices value for this ConverterCloningCapabilities.
     * 
     * @param canStopServices
     */
    public void setCanStopServices(boolean canStopServices) {
        this.canStopServices = canStopServices;
    }


    /**
     * Gets the canSkipUnwantedFiles value for this ConverterCloningCapabilities.
     * 
     * @return canSkipUnwantedFiles
     */
    public boolean isCanSkipUnwantedFiles() {
        return canSkipUnwantedFiles;
    }


    /**
     * Sets the canSkipUnwantedFiles value for this ConverterCloningCapabilities.
     * 
     * @param canSkipUnwantedFiles
     */
    public void setCanSkipUnwantedFiles(boolean canSkipUnwantedFiles) {
        this.canSkipUnwantedFiles = canSkipUnwantedFiles;
    }


    /**
     * Gets the canCreateOptimizedPartitionAlignment value for this ConverterCloningCapabilities.
     * 
     * @return canCreateOptimizedPartitionAlignment
     */
    public java.lang.Boolean getCanCreateOptimizedPartitionAlignment() {
        return canCreateOptimizedPartitionAlignment;
    }


    /**
     * Sets the canCreateOptimizedPartitionAlignment value for this ConverterCloningCapabilities.
     * 
     * @param canCreateOptimizedPartitionAlignment
     */
    public void setCanCreateOptimizedPartitionAlignment(java.lang.Boolean canCreateOptimizedPartitionAlignment) {
        this.canCreateOptimizedPartitionAlignment = canCreateOptimizedPartitionAlignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCloningCapabilities)) return false;
        ConverterCloningCapabilities other = (ConverterCloningCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numCPUValues==null && other.getNumCPUValues()==null) || 
             (this.numCPUValues!=null &&
              java.util.Arrays.equals(this.numCPUValues, other.getNumCPUValues()))) &&
            this.minMemoryMB == other.getMinMemoryMB() &&
            this.maxMemoryMB == other.getMaxMemoryMB() &&
            this.defaultMemoryMB == other.getDefaultMemoryMB() &&
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
            this.maxNumberOfNICs == other.getMaxNumberOfNICs() &&
            this.defaultNumberOfNICs == other.getDefaultNumberOfNICs() &&
            ((this.supportedCloningMode==null && other.getSupportedCloningMode()==null) || 
             (this.supportedCloningMode!=null &&
              java.util.Arrays.equals(this.supportedCloningMode, other.getSupportedCloningMode()))) &&
            ((this.supportedDiskCreateType==null && other.getSupportedDiskCreateType()==null) || 
             (this.supportedDiskCreateType!=null &&
              java.util.Arrays.equals(this.supportedDiskCreateType, other.getSupportedDiskCreateType()))) &&
            ((this.defaultDiskCreateType==null && other.getDefaultDiskCreateType()==null) || 
             (this.defaultDiskCreateType!=null &&
              this.defaultDiskCreateType.equals(other.getDefaultDiskCreateType()))) &&
            ((this.supportedDiskControllerType==null && other.getSupportedDiskControllerType()==null) || 
             (this.supportedDiskControllerType!=null &&
              java.util.Arrays.equals(this.supportedDiskControllerType, other.getSupportedDiskControllerType()))) &&
            ((this.defaultScsiControllerType==null && other.getDefaultScsiControllerType()==null) || 
             (this.defaultScsiControllerType!=null &&
              this.defaultScsiControllerType.equals(other.getDefaultScsiControllerType()))) &&
            ((this.defaultCdromControllerType==null && other.getDefaultCdromControllerType()==null) || 
             (this.defaultCdromControllerType!=null &&
              this.defaultCdromControllerType.equals(other.getDefaultCdromControllerType()))) &&
            this.canSynchronize == other.isCanSynchronize() &&
            ((this.canScheduleSynchronization==null && other.getCanScheduleSynchronization()==null) || 
             (this.canScheduleSynchronization!=null &&
              this.canScheduleSynchronization.equals(other.getCanScheduleSynchronization()))) &&
            this.canPowerOnTargetMachine == other.isCanPowerOnTargetMachine() &&
            this.canPowerOffSourceMachine == other.isCanPowerOffSourceMachine() &&
            this.canStopServices == other.isCanStopServices() &&
            this.canSkipUnwantedFiles == other.isCanSkipUnwantedFiles() &&
            ((this.canCreateOptimizedPartitionAlignment==null && other.getCanCreateOptimizedPartitionAlignment()==null) || 
             (this.canCreateOptimizedPartitionAlignment!=null &&
              this.canCreateOptimizedPartitionAlignment.equals(other.getCanCreateOptimizedPartitionAlignment())));
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
        if (getNumCPUValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumCPUValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumCPUValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getMinMemoryMB()).hashCode();
        _hashCode += new Long(getMaxMemoryMB()).hashCode();
        _hashCode += new Long(getDefaultMemoryMB()).hashCode();
        _hashCode += getSupportedMaxCPUs();
        if (getNumSupportedPhysicalSockets() != null) {
            _hashCode += getNumSupportedPhysicalSockets().hashCode();
        }
        if (getNumSupportedCoresPerSocket() != null) {
            _hashCode += getNumSupportedCoresPerSocket().hashCode();
        }
        _hashCode += new Long(getSupportedMinMemMB()).hashCode();
        _hashCode += new Long(getSupportedMaxMemMB()).hashCode();
        _hashCode += new Long(getRecommendedMemMB()).hashCode();
        _hashCode += getMaxNumberOfNICs();
        _hashCode += getDefaultNumberOfNICs();
        if (getSupportedCloningMode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedCloningMode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedCloningMode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportedDiskCreateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedDiskCreateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedDiskCreateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultDiskCreateType() != null) {
            _hashCode += getDefaultDiskCreateType().hashCode();
        }
        if (getSupportedDiskControllerType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedDiskControllerType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedDiskControllerType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultScsiControllerType() != null) {
            _hashCode += getDefaultScsiControllerType().hashCode();
        }
        if (getDefaultCdromControllerType() != null) {
            _hashCode += getDefaultCdromControllerType().hashCode();
        }
        _hashCode += (isCanSynchronize() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCanScheduleSynchronization() != null) {
            _hashCode += getCanScheduleSynchronization().hashCode();
        }
        _hashCode += (isCanPowerOnTargetMachine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanPowerOffSourceMachine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanStopServices() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSkipUnwantedFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCanCreateOptimizedPartitionAlignment() != null) {
            _hashCode += getCanCreateOptimizedPartitionAlignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCloningCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCloningCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCPUValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numCPUValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMemoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "minMemoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "maxMemoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultMemoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultMemoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMaxCPUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedMaxCPUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSupportedPhysicalSockets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numSupportedPhysicalSockets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSupportedCoresPerSocket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numSupportedCoresPerSocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMinMemMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedMinMemMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedMaxMemMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedMaxMemMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedMemMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "recommendedMemMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfNICs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "maxNumberOfNICs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultNumberOfNICs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultNumberOfNICs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedCloningMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedCloningMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedDiskCreateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedDiskCreateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultDiskCreateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultDiskCreateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedDiskControllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedDiskControllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultScsiControllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultScsiControllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCdromControllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultCdromControllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSynchronize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canSynchronize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canScheduleSynchronization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canScheduleSynchronization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canPowerOnTargetMachine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canPowerOnTargetMachine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canPowerOffSourceMachine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canPowerOffSourceMachine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canStopServices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canStopServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSkipUnwantedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canSkipUnwantedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCreateOptimizedPartitionAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canCreateOptimizedPartitionAlignment"));
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
