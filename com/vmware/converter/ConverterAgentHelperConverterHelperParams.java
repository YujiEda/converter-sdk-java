/**
 * ConverterAgentHelperConverterHelperParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentHelperConverterHelperParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetDiskParams[] disk;

    private com.vmware.converter.ConverterComputerOsInfoOsVersion osVersion;

    private java.lang.String[] skippedSourceMountPoints;

    private java.lang.Boolean doReconfig;

    private java.lang.Boolean keepSparseFile;

    private java.lang.Boolean useSudo;

    private java.lang.Boolean optimizedPartitionAlignment;

    private java.lang.String currentEfiBootEntry;

    private com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo bootLoaderInfo;

    private java.lang.String dracut;

    private java.lang.Boolean callGrubInstall;

    private java.lang.Boolean usePredictableInterfaceNames;

    public ConverterAgentHelperConverterHelperParams() {
    }

    public ConverterAgentHelperConverterHelperParams(
           com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetDiskParams[] disk,
           com.vmware.converter.ConverterComputerOsInfoOsVersion osVersion,
           java.lang.String[] skippedSourceMountPoints,
           java.lang.Boolean doReconfig,
           java.lang.Boolean keepSparseFile,
           java.lang.Boolean useSudo,
           java.lang.Boolean optimizedPartitionAlignment,
           java.lang.String currentEfiBootEntry,
           com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo bootLoaderInfo,
           java.lang.String dracut,
           java.lang.Boolean callGrubInstall,
           java.lang.Boolean usePredictableInterfaceNames) {
        this.disk = disk;
        this.osVersion = osVersion;
        this.skippedSourceMountPoints = skippedSourceMountPoints;
        this.doReconfig = doReconfig;
        this.keepSparseFile = keepSparseFile;
        this.useSudo = useSudo;
        this.optimizedPartitionAlignment = optimizedPartitionAlignment;
        this.currentEfiBootEntry = currentEfiBootEntry;
        this.bootLoaderInfo = bootLoaderInfo;
        this.dracut = dracut;
        this.callGrubInstall = callGrubInstall;
        this.usePredictableInterfaceNames = usePredictableInterfaceNames;
    }


    /**
     * Gets the disk value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return disk
     */
    public com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetDiskParams[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetDiskParams[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetDiskParams getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetDiskParams _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the osVersion value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return osVersion
     */
    public com.vmware.converter.ConverterComputerOsInfoOsVersion getOsVersion() {
        return osVersion;
    }


    /**
     * Sets the osVersion value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param osVersion
     */
    public void setOsVersion(com.vmware.converter.ConverterComputerOsInfoOsVersion osVersion) {
        this.osVersion = osVersion;
    }


    /**
     * Gets the skippedSourceMountPoints value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return skippedSourceMountPoints
     */
    public java.lang.String[] getSkippedSourceMountPoints() {
        return skippedSourceMountPoints;
    }


    /**
     * Sets the skippedSourceMountPoints value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param skippedSourceMountPoints
     */
    public void setSkippedSourceMountPoints(java.lang.String[] skippedSourceMountPoints) {
        this.skippedSourceMountPoints = skippedSourceMountPoints;
    }

    public java.lang.String getSkippedSourceMountPoints(int i) {
        return this.skippedSourceMountPoints[i];
    }

    public void setSkippedSourceMountPoints(int i, java.lang.String _value) {
        this.skippedSourceMountPoints[i] = _value;
    }


    /**
     * Gets the doReconfig value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return doReconfig
     */
    public java.lang.Boolean getDoReconfig() {
        return doReconfig;
    }


    /**
     * Sets the doReconfig value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param doReconfig
     */
    public void setDoReconfig(java.lang.Boolean doReconfig) {
        this.doReconfig = doReconfig;
    }


    /**
     * Gets the keepSparseFile value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return keepSparseFile
     */
    public java.lang.Boolean getKeepSparseFile() {
        return keepSparseFile;
    }


    /**
     * Sets the keepSparseFile value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param keepSparseFile
     */
    public void setKeepSparseFile(java.lang.Boolean keepSparseFile) {
        this.keepSparseFile = keepSparseFile;
    }


    /**
     * Gets the useSudo value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return useSudo
     */
    public java.lang.Boolean getUseSudo() {
        return useSudo;
    }


    /**
     * Sets the useSudo value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param useSudo
     */
    public void setUseSudo(java.lang.Boolean useSudo) {
        this.useSudo = useSudo;
    }


    /**
     * Gets the optimizedPartitionAlignment value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return optimizedPartitionAlignment
     */
    public java.lang.Boolean getOptimizedPartitionAlignment() {
        return optimizedPartitionAlignment;
    }


    /**
     * Sets the optimizedPartitionAlignment value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param optimizedPartitionAlignment
     */
    public void setOptimizedPartitionAlignment(java.lang.Boolean optimizedPartitionAlignment) {
        this.optimizedPartitionAlignment = optimizedPartitionAlignment;
    }


    /**
     * Gets the currentEfiBootEntry value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return currentEfiBootEntry
     */
    public java.lang.String getCurrentEfiBootEntry() {
        return currentEfiBootEntry;
    }


    /**
     * Sets the currentEfiBootEntry value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param currentEfiBootEntry
     */
    public void setCurrentEfiBootEntry(java.lang.String currentEfiBootEntry) {
        this.currentEfiBootEntry = currentEfiBootEntry;
    }


    /**
     * Gets the bootLoaderInfo value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return bootLoaderInfo
     */
    public com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo getBootLoaderInfo() {
        return bootLoaderInfo;
    }


    /**
     * Sets the bootLoaderInfo value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param bootLoaderInfo
     */
    public void setBootLoaderInfo(com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo bootLoaderInfo) {
        this.bootLoaderInfo = bootLoaderInfo;
    }


    /**
     * Gets the dracut value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return dracut
     */
    public java.lang.String getDracut() {
        return dracut;
    }


    /**
     * Sets the dracut value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param dracut
     */
    public void setDracut(java.lang.String dracut) {
        this.dracut = dracut;
    }


    /**
     * Gets the callGrubInstall value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return callGrubInstall
     */
    public java.lang.Boolean getCallGrubInstall() {
        return callGrubInstall;
    }


    /**
     * Sets the callGrubInstall value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param callGrubInstall
     */
    public void setCallGrubInstall(java.lang.Boolean callGrubInstall) {
        this.callGrubInstall = callGrubInstall;
    }


    /**
     * Gets the usePredictableInterfaceNames value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @return usePredictableInterfaceNames
     */
    public java.lang.Boolean getUsePredictableInterfaceNames() {
        return usePredictableInterfaceNames;
    }


    /**
     * Sets the usePredictableInterfaceNames value for this ConverterAgentHelperConverterHelperParams.
     * 
     * @param usePredictableInterfaceNames
     */
    public void setUsePredictableInterfaceNames(java.lang.Boolean usePredictableInterfaceNames) {
        this.usePredictableInterfaceNames = usePredictableInterfaceNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentHelperConverterHelperParams)) return false;
        ConverterAgentHelperConverterHelperParams other = (ConverterAgentHelperConverterHelperParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.osVersion==null && other.getOsVersion()==null) || 
             (this.osVersion!=null &&
              this.osVersion.equals(other.getOsVersion()))) &&
            ((this.skippedSourceMountPoints==null && other.getSkippedSourceMountPoints()==null) || 
             (this.skippedSourceMountPoints!=null &&
              java.util.Arrays.equals(this.skippedSourceMountPoints, other.getSkippedSourceMountPoints()))) &&
            ((this.doReconfig==null && other.getDoReconfig()==null) || 
             (this.doReconfig!=null &&
              this.doReconfig.equals(other.getDoReconfig()))) &&
            ((this.keepSparseFile==null && other.getKeepSparseFile()==null) || 
             (this.keepSparseFile!=null &&
              this.keepSparseFile.equals(other.getKeepSparseFile()))) &&
            ((this.useSudo==null && other.getUseSudo()==null) || 
             (this.useSudo!=null &&
              this.useSudo.equals(other.getUseSudo()))) &&
            ((this.optimizedPartitionAlignment==null && other.getOptimizedPartitionAlignment()==null) || 
             (this.optimizedPartitionAlignment!=null &&
              this.optimizedPartitionAlignment.equals(other.getOptimizedPartitionAlignment()))) &&
            ((this.currentEfiBootEntry==null && other.getCurrentEfiBootEntry()==null) || 
             (this.currentEfiBootEntry!=null &&
              this.currentEfiBootEntry.equals(other.getCurrentEfiBootEntry()))) &&
            ((this.bootLoaderInfo==null && other.getBootLoaderInfo()==null) || 
             (this.bootLoaderInfo!=null &&
              this.bootLoaderInfo.equals(other.getBootLoaderInfo()))) &&
            ((this.dracut==null && other.getDracut()==null) || 
             (this.dracut!=null &&
              this.dracut.equals(other.getDracut()))) &&
            ((this.callGrubInstall==null && other.getCallGrubInstall()==null) || 
             (this.callGrubInstall!=null &&
              this.callGrubInstall.equals(other.getCallGrubInstall()))) &&
            ((this.usePredictableInterfaceNames==null && other.getUsePredictableInterfaceNames()==null) || 
             (this.usePredictableInterfaceNames!=null &&
              this.usePredictableInterfaceNames.equals(other.getUsePredictableInterfaceNames())));
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
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOsVersion() != null) {
            _hashCode += getOsVersion().hashCode();
        }
        if (getSkippedSourceMountPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSkippedSourceMountPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSkippedSourceMountPoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoReconfig() != null) {
            _hashCode += getDoReconfig().hashCode();
        }
        if (getKeepSparseFile() != null) {
            _hashCode += getKeepSparseFile().hashCode();
        }
        if (getUseSudo() != null) {
            _hashCode += getUseSudo().hashCode();
        }
        if (getOptimizedPartitionAlignment() != null) {
            _hashCode += getOptimizedPartitionAlignment().hashCode();
        }
        if (getCurrentEfiBootEntry() != null) {
            _hashCode += getCurrentEfiBootEntry().hashCode();
        }
        if (getBootLoaderInfo() != null) {
            _hashCode += getBootLoaderInfo().hashCode();
        }
        if (getDracut() != null) {
            _hashCode += getDracut().hashCode();
        }
        if (getCallGrubInstall() != null) {
            _hashCode += getCallGrubInstall().hashCode();
        }
        if (getUsePredictableInterfaceNames() != null) {
            _hashCode += getUsePredictableInterfaceNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentHelperConverterHelperParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParamsTargetDiskParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoOsVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skippedSourceMountPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skippedSourceMountPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doReconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepSparseFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "keepSparseFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSudo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useSudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("currentEfiBootEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "currentEfiBootEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootLoaderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootLoaderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoBootLoaderInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dracut");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dracut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callGrubInstall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "callGrubInstall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePredictableInterfaceNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "usePredictableInterfaceNames"));
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
