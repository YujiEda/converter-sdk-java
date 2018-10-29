/**
 * ConverterParamsAgentCloningParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterParamsAgentCloningParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerSpec source;

    private com.vmware.converter.ConverterComputerHardwareInfo targetHardwareInfo;

    private com.vmware.converter.ConverterParamsStorageMapping storageMapping;

    private java.lang.String[] prevBitmapIds;

    private java.lang.String nextBitmapId;

    private java.lang.Boolean snapshotSource;

    private java.lang.Boolean doPersistNextBitmapId;

    private java.lang.String cloningMode;

    private java.lang.String[] servicesToSuspend;

    private com.vmware.converter.ConverterThrottlingParams throttlingParams;

    private java.lang.Boolean skipCopyingRestoreCheckpointData;

    private java.lang.Boolean skipUnwantedFiles;

    private java.lang.Boolean doReconfig;

    private com.vmware.converter.ConverterHelperVmNetworkParams helperVmNetworkParams;

    private java.lang.Boolean optimizedPartitionAlignment;

    private java.lang.Boolean useProxyMode;

    public ConverterParamsAgentCloningParams() {
    }

    public ConverterParamsAgentCloningParams(
           com.vmware.converter.ConverterComputerSpec source,
           com.vmware.converter.ConverterComputerHardwareInfo targetHardwareInfo,
           com.vmware.converter.ConverterParamsStorageMapping storageMapping,
           java.lang.String[] prevBitmapIds,
           java.lang.String nextBitmapId,
           java.lang.Boolean snapshotSource,
           java.lang.Boolean doPersistNextBitmapId,
           java.lang.String cloningMode,
           java.lang.String[] servicesToSuspend,
           com.vmware.converter.ConverterThrottlingParams throttlingParams,
           java.lang.Boolean skipCopyingRestoreCheckpointData,
           java.lang.Boolean skipUnwantedFiles,
           java.lang.Boolean doReconfig,
           com.vmware.converter.ConverterHelperVmNetworkParams helperVmNetworkParams,
           java.lang.Boolean optimizedPartitionAlignment,
           java.lang.Boolean useProxyMode) {
        this.source = source;
        this.targetHardwareInfo = targetHardwareInfo;
        this.storageMapping = storageMapping;
        this.prevBitmapIds = prevBitmapIds;
        this.nextBitmapId = nextBitmapId;
        this.snapshotSource = snapshotSource;
        this.doPersistNextBitmapId = doPersistNextBitmapId;
        this.cloningMode = cloningMode;
        this.servicesToSuspend = servicesToSuspend;
        this.throttlingParams = throttlingParams;
        this.skipCopyingRestoreCheckpointData = skipCopyingRestoreCheckpointData;
        this.skipUnwantedFiles = skipUnwantedFiles;
        this.doReconfig = doReconfig;
        this.helperVmNetworkParams = helperVmNetworkParams;
        this.optimizedPartitionAlignment = optimizedPartitionAlignment;
        this.useProxyMode = useProxyMode;
    }


    /**
     * Gets the source value for this ConverterParamsAgentCloningParams.
     * 
     * @return source
     */
    public com.vmware.converter.ConverterComputerSpec getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterParamsAgentCloningParams.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ConverterComputerSpec source) {
        this.source = source;
    }


    /**
     * Gets the targetHardwareInfo value for this ConverterParamsAgentCloningParams.
     * 
     * @return targetHardwareInfo
     */
    public com.vmware.converter.ConverterComputerHardwareInfo getTargetHardwareInfo() {
        return targetHardwareInfo;
    }


    /**
     * Sets the targetHardwareInfo value for this ConverterParamsAgentCloningParams.
     * 
     * @param targetHardwareInfo
     */
    public void setTargetHardwareInfo(com.vmware.converter.ConverterComputerHardwareInfo targetHardwareInfo) {
        this.targetHardwareInfo = targetHardwareInfo;
    }


    /**
     * Gets the storageMapping value for this ConverterParamsAgentCloningParams.
     * 
     * @return storageMapping
     */
    public com.vmware.converter.ConverterParamsStorageMapping getStorageMapping() {
        return storageMapping;
    }


    /**
     * Sets the storageMapping value for this ConverterParamsAgentCloningParams.
     * 
     * @param storageMapping
     */
    public void setStorageMapping(com.vmware.converter.ConverterParamsStorageMapping storageMapping) {
        this.storageMapping = storageMapping;
    }


    /**
     * Gets the prevBitmapIds value for this ConverterParamsAgentCloningParams.
     * 
     * @return prevBitmapIds
     */
    public java.lang.String[] getPrevBitmapIds() {
        return prevBitmapIds;
    }


    /**
     * Sets the prevBitmapIds value for this ConverterParamsAgentCloningParams.
     * 
     * @param prevBitmapIds
     */
    public void setPrevBitmapIds(java.lang.String[] prevBitmapIds) {
        this.prevBitmapIds = prevBitmapIds;
    }

    public java.lang.String getPrevBitmapIds(int i) {
        return this.prevBitmapIds[i];
    }

    public void setPrevBitmapIds(int i, java.lang.String _value) {
        this.prevBitmapIds[i] = _value;
    }


    /**
     * Gets the nextBitmapId value for this ConverterParamsAgentCloningParams.
     * 
     * @return nextBitmapId
     */
    public java.lang.String getNextBitmapId() {
        return nextBitmapId;
    }


    /**
     * Sets the nextBitmapId value for this ConverterParamsAgentCloningParams.
     * 
     * @param nextBitmapId
     */
    public void setNextBitmapId(java.lang.String nextBitmapId) {
        this.nextBitmapId = nextBitmapId;
    }


    /**
     * Gets the snapshotSource value for this ConverterParamsAgentCloningParams.
     * 
     * @return snapshotSource
     */
    public java.lang.Boolean getSnapshotSource() {
        return snapshotSource;
    }


    /**
     * Sets the snapshotSource value for this ConverterParamsAgentCloningParams.
     * 
     * @param snapshotSource
     */
    public void setSnapshotSource(java.lang.Boolean snapshotSource) {
        this.snapshotSource = snapshotSource;
    }


    /**
     * Gets the doPersistNextBitmapId value for this ConverterParamsAgentCloningParams.
     * 
     * @return doPersistNextBitmapId
     */
    public java.lang.Boolean getDoPersistNextBitmapId() {
        return doPersistNextBitmapId;
    }


    /**
     * Sets the doPersistNextBitmapId value for this ConverterParamsAgentCloningParams.
     * 
     * @param doPersistNextBitmapId
     */
    public void setDoPersistNextBitmapId(java.lang.Boolean doPersistNextBitmapId) {
        this.doPersistNextBitmapId = doPersistNextBitmapId;
    }


    /**
     * Gets the cloningMode value for this ConverterParamsAgentCloningParams.
     * 
     * @return cloningMode
     */
    public java.lang.String getCloningMode() {
        return cloningMode;
    }


    /**
     * Sets the cloningMode value for this ConverterParamsAgentCloningParams.
     * 
     * @param cloningMode
     */
    public void setCloningMode(java.lang.String cloningMode) {
        this.cloningMode = cloningMode;
    }


    /**
     * Gets the servicesToSuspend value for this ConverterParamsAgentCloningParams.
     * 
     * @return servicesToSuspend
     */
    public java.lang.String[] getServicesToSuspend() {
        return servicesToSuspend;
    }


    /**
     * Sets the servicesToSuspend value for this ConverterParamsAgentCloningParams.
     * 
     * @param servicesToSuspend
     */
    public void setServicesToSuspend(java.lang.String[] servicesToSuspend) {
        this.servicesToSuspend = servicesToSuspend;
    }

    public java.lang.String getServicesToSuspend(int i) {
        return this.servicesToSuspend[i];
    }

    public void setServicesToSuspend(int i, java.lang.String _value) {
        this.servicesToSuspend[i] = _value;
    }


    /**
     * Gets the throttlingParams value for this ConverterParamsAgentCloningParams.
     * 
     * @return throttlingParams
     */
    public com.vmware.converter.ConverterThrottlingParams getThrottlingParams() {
        return throttlingParams;
    }


    /**
     * Sets the throttlingParams value for this ConverterParamsAgentCloningParams.
     * 
     * @param throttlingParams
     */
    public void setThrottlingParams(com.vmware.converter.ConverterThrottlingParams throttlingParams) {
        this.throttlingParams = throttlingParams;
    }


    /**
     * Gets the skipCopyingRestoreCheckpointData value for this ConverterParamsAgentCloningParams.
     * 
     * @return skipCopyingRestoreCheckpointData
     */
    public java.lang.Boolean getSkipCopyingRestoreCheckpointData() {
        return skipCopyingRestoreCheckpointData;
    }


    /**
     * Sets the skipCopyingRestoreCheckpointData value for this ConverterParamsAgentCloningParams.
     * 
     * @param skipCopyingRestoreCheckpointData
     */
    public void setSkipCopyingRestoreCheckpointData(java.lang.Boolean skipCopyingRestoreCheckpointData) {
        this.skipCopyingRestoreCheckpointData = skipCopyingRestoreCheckpointData;
    }


    /**
     * Gets the skipUnwantedFiles value for this ConverterParamsAgentCloningParams.
     * 
     * @return skipUnwantedFiles
     */
    public java.lang.Boolean getSkipUnwantedFiles() {
        return skipUnwantedFiles;
    }


    /**
     * Sets the skipUnwantedFiles value for this ConverterParamsAgentCloningParams.
     * 
     * @param skipUnwantedFiles
     */
    public void setSkipUnwantedFiles(java.lang.Boolean skipUnwantedFiles) {
        this.skipUnwantedFiles = skipUnwantedFiles;
    }


    /**
     * Gets the doReconfig value for this ConverterParamsAgentCloningParams.
     * 
     * @return doReconfig
     */
    public java.lang.Boolean getDoReconfig() {
        return doReconfig;
    }


    /**
     * Sets the doReconfig value for this ConverterParamsAgentCloningParams.
     * 
     * @param doReconfig
     */
    public void setDoReconfig(java.lang.Boolean doReconfig) {
        this.doReconfig = doReconfig;
    }


    /**
     * Gets the helperVmNetworkParams value for this ConverterParamsAgentCloningParams.
     * 
     * @return helperVmNetworkParams
     */
    public com.vmware.converter.ConverterHelperVmNetworkParams getHelperVmNetworkParams() {
        return helperVmNetworkParams;
    }


    /**
     * Sets the helperVmNetworkParams value for this ConverterParamsAgentCloningParams.
     * 
     * @param helperVmNetworkParams
     */
    public void setHelperVmNetworkParams(com.vmware.converter.ConverterHelperVmNetworkParams helperVmNetworkParams) {
        this.helperVmNetworkParams = helperVmNetworkParams;
    }


    /**
     * Gets the optimizedPartitionAlignment value for this ConverterParamsAgentCloningParams.
     * 
     * @return optimizedPartitionAlignment
     */
    public java.lang.Boolean getOptimizedPartitionAlignment() {
        return optimizedPartitionAlignment;
    }


    /**
     * Sets the optimizedPartitionAlignment value for this ConverterParamsAgentCloningParams.
     * 
     * @param optimizedPartitionAlignment
     */
    public void setOptimizedPartitionAlignment(java.lang.Boolean optimizedPartitionAlignment) {
        this.optimizedPartitionAlignment = optimizedPartitionAlignment;
    }


    /**
     * Gets the useProxyMode value for this ConverterParamsAgentCloningParams.
     * 
     * @return useProxyMode
     */
    public java.lang.Boolean getUseProxyMode() {
        return useProxyMode;
    }


    /**
     * Sets the useProxyMode value for this ConverterParamsAgentCloningParams.
     * 
     * @param useProxyMode
     */
    public void setUseProxyMode(java.lang.Boolean useProxyMode) {
        this.useProxyMode = useProxyMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterParamsAgentCloningParams)) return false;
        ConverterParamsAgentCloningParams other = (ConverterParamsAgentCloningParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.targetHardwareInfo==null && other.getTargetHardwareInfo()==null) || 
             (this.targetHardwareInfo!=null &&
              this.targetHardwareInfo.equals(other.getTargetHardwareInfo()))) &&
            ((this.storageMapping==null && other.getStorageMapping()==null) || 
             (this.storageMapping!=null &&
              this.storageMapping.equals(other.getStorageMapping()))) &&
            ((this.prevBitmapIds==null && other.getPrevBitmapIds()==null) || 
             (this.prevBitmapIds!=null &&
              java.util.Arrays.equals(this.prevBitmapIds, other.getPrevBitmapIds()))) &&
            ((this.nextBitmapId==null && other.getNextBitmapId()==null) || 
             (this.nextBitmapId!=null &&
              this.nextBitmapId.equals(other.getNextBitmapId()))) &&
            ((this.snapshotSource==null && other.getSnapshotSource()==null) || 
             (this.snapshotSource!=null &&
              this.snapshotSource.equals(other.getSnapshotSource()))) &&
            ((this.doPersistNextBitmapId==null && other.getDoPersistNextBitmapId()==null) || 
             (this.doPersistNextBitmapId!=null &&
              this.doPersistNextBitmapId.equals(other.getDoPersistNextBitmapId()))) &&
            ((this.cloningMode==null && other.getCloningMode()==null) || 
             (this.cloningMode!=null &&
              this.cloningMode.equals(other.getCloningMode()))) &&
            ((this.servicesToSuspend==null && other.getServicesToSuspend()==null) || 
             (this.servicesToSuspend!=null &&
              java.util.Arrays.equals(this.servicesToSuspend, other.getServicesToSuspend()))) &&
            ((this.throttlingParams==null && other.getThrottlingParams()==null) || 
             (this.throttlingParams!=null &&
              this.throttlingParams.equals(other.getThrottlingParams()))) &&
            ((this.skipCopyingRestoreCheckpointData==null && other.getSkipCopyingRestoreCheckpointData()==null) || 
             (this.skipCopyingRestoreCheckpointData!=null &&
              this.skipCopyingRestoreCheckpointData.equals(other.getSkipCopyingRestoreCheckpointData()))) &&
            ((this.skipUnwantedFiles==null && other.getSkipUnwantedFiles()==null) || 
             (this.skipUnwantedFiles!=null &&
              this.skipUnwantedFiles.equals(other.getSkipUnwantedFiles()))) &&
            ((this.doReconfig==null && other.getDoReconfig()==null) || 
             (this.doReconfig!=null &&
              this.doReconfig.equals(other.getDoReconfig()))) &&
            ((this.helperVmNetworkParams==null && other.getHelperVmNetworkParams()==null) || 
             (this.helperVmNetworkParams!=null &&
              this.helperVmNetworkParams.equals(other.getHelperVmNetworkParams()))) &&
            ((this.optimizedPartitionAlignment==null && other.getOptimizedPartitionAlignment()==null) || 
             (this.optimizedPartitionAlignment!=null &&
              this.optimizedPartitionAlignment.equals(other.getOptimizedPartitionAlignment()))) &&
            ((this.useProxyMode==null && other.getUseProxyMode()==null) || 
             (this.useProxyMode!=null &&
              this.useProxyMode.equals(other.getUseProxyMode())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTargetHardwareInfo() != null) {
            _hashCode += getTargetHardwareInfo().hashCode();
        }
        if (getStorageMapping() != null) {
            _hashCode += getStorageMapping().hashCode();
        }
        if (getPrevBitmapIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevBitmapIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevBitmapIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextBitmapId() != null) {
            _hashCode += getNextBitmapId().hashCode();
        }
        if (getSnapshotSource() != null) {
            _hashCode += getSnapshotSource().hashCode();
        }
        if (getDoPersistNextBitmapId() != null) {
            _hashCode += getDoPersistNextBitmapId().hashCode();
        }
        if (getCloningMode() != null) {
            _hashCode += getCloningMode().hashCode();
        }
        if (getServicesToSuspend() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicesToSuspend());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicesToSuspend(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThrottlingParams() != null) {
            _hashCode += getThrottlingParams().hashCode();
        }
        if (getSkipCopyingRestoreCheckpointData() != null) {
            _hashCode += getSkipCopyingRestoreCheckpointData().hashCode();
        }
        if (getSkipUnwantedFiles() != null) {
            _hashCode += getSkipUnwantedFiles().hashCode();
        }
        if (getDoReconfig() != null) {
            _hashCode += getDoReconfig().hashCode();
        }
        if (getHelperVmNetworkParams() != null) {
            _hashCode += getHelperVmNetworkParams().hashCode();
        }
        if (getOptimizedPartitionAlignment() != null) {
            _hashCode += getOptimizedPartitionAlignment().hashCode();
        }
        if (getUseProxyMode() != null) {
            _hashCode += getUseProxyMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterParamsAgentCloningParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsAgentCloningParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetHardwareInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetHardwareInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerHardwareInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "storageMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMapping"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevBitmapIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "prevBitmapIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBitmapId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nextBitmapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "snapshotSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doPersistNextBitmapId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doPersistNextBitmapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesToSuspend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "servicesToSuspend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttlingParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "throttlingParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterThrottlingParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipCopyingRestoreCheckpointData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipCopyingRestoreCheckpointData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipUnwantedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipUnwantedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doReconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helperVmNetworkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "helperVmNetworkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHelperVmNetworkParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizedPartitionAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "optimizedPartitionAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useProxyMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useProxyMode"));
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
