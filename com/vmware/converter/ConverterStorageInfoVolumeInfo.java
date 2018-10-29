/**
 * ConverterStorageInfoVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageInfoVolumeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String volumeId;

    private java.lang.String[] diskId;

    private java.lang.Integer partitionNumber;

    private java.lang.Boolean primary;

    private java.lang.Boolean active;

    private java.lang.Byte partitionType;

    private java.lang.String partitionGuid;

    private java.lang.String partitionUuid;

    private java.lang.String fileSystem;

    private java.lang.Long clusterSizeInBytes;

    private java.lang.Long firstClusterOffsetInBytes;

    private java.lang.String label;

    private long capacityInBytes;

    private long spaceUsedInBytes;

    private com.vmware.converter.ConverterStorageInfoVolumeInfoExtfsFeatures extfsFeatures;

    private com.vmware.converter.ConverterStorageInfoVolumeInfoXfsFeatures xfsFeatures;

    private java.lang.String lvName;

    public ConverterStorageInfoVolumeInfo() {
    }

    public ConverterStorageInfoVolumeInfo(
           java.lang.String volumeId,
           java.lang.String[] diskId,
           java.lang.Integer partitionNumber,
           java.lang.Boolean primary,
           java.lang.Boolean active,
           java.lang.Byte partitionType,
           java.lang.String partitionGuid,
           java.lang.String partitionUuid,
           java.lang.String fileSystem,
           java.lang.Long clusterSizeInBytes,
           java.lang.Long firstClusterOffsetInBytes,
           java.lang.String label,
           long capacityInBytes,
           long spaceUsedInBytes,
           com.vmware.converter.ConverterStorageInfoVolumeInfoExtfsFeatures extfsFeatures,
           com.vmware.converter.ConverterStorageInfoVolumeInfoXfsFeatures xfsFeatures,
           java.lang.String lvName) {
        this.volumeId = volumeId;
        this.diskId = diskId;
        this.partitionNumber = partitionNumber;
        this.primary = primary;
        this.active = active;
        this.partitionType = partitionType;
        this.partitionGuid = partitionGuid;
        this.partitionUuid = partitionUuid;
        this.fileSystem = fileSystem;
        this.clusterSizeInBytes = clusterSizeInBytes;
        this.firstClusterOffsetInBytes = firstClusterOffsetInBytes;
        this.label = label;
        this.capacityInBytes = capacityInBytes;
        this.spaceUsedInBytes = spaceUsedInBytes;
        this.extfsFeatures = extfsFeatures;
        this.xfsFeatures = xfsFeatures;
        this.lvName = lvName;
    }


    /**
     * Gets the volumeId value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return volumeId
     */
    public java.lang.String getVolumeId() {
        return volumeId;
    }


    /**
     * Sets the volumeId value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param volumeId
     */
    public void setVolumeId(java.lang.String volumeId) {
        this.volumeId = volumeId;
    }


    /**
     * Gets the diskId value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return diskId
     */
    public java.lang.String[] getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param diskId
     */
    public void setDiskId(java.lang.String[] diskId) {
        this.diskId = diskId;
    }

    public java.lang.String getDiskId(int i) {
        return this.diskId[i];
    }

    public void setDiskId(int i, java.lang.String _value) {
        this.diskId[i] = _value;
    }


    /**
     * Gets the partitionNumber value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return partitionNumber
     */
    public java.lang.Integer getPartitionNumber() {
        return partitionNumber;
    }


    /**
     * Sets the partitionNumber value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param partitionNumber
     */
    public void setPartitionNumber(java.lang.Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }


    /**
     * Gets the primary value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return primary
     */
    public java.lang.Boolean getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param primary
     */
    public void setPrimary(java.lang.Boolean primary) {
        this.primary = primary;
    }


    /**
     * Gets the active value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the partitionType value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return partitionType
     */
    public java.lang.Byte getPartitionType() {
        return partitionType;
    }


    /**
     * Sets the partitionType value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param partitionType
     */
    public void setPartitionType(java.lang.Byte partitionType) {
        this.partitionType = partitionType;
    }


    /**
     * Gets the partitionGuid value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return partitionGuid
     */
    public java.lang.String getPartitionGuid() {
        return partitionGuid;
    }


    /**
     * Sets the partitionGuid value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param partitionGuid
     */
    public void setPartitionGuid(java.lang.String partitionGuid) {
        this.partitionGuid = partitionGuid;
    }


    /**
     * Gets the partitionUuid value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return partitionUuid
     */
    public java.lang.String getPartitionUuid() {
        return partitionUuid;
    }


    /**
     * Sets the partitionUuid value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param partitionUuid
     */
    public void setPartitionUuid(java.lang.String partitionUuid) {
        this.partitionUuid = partitionUuid;
    }


    /**
     * Gets the fileSystem value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return fileSystem
     */
    public java.lang.String getFileSystem() {
        return fileSystem;
    }


    /**
     * Sets the fileSystem value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param fileSystem
     */
    public void setFileSystem(java.lang.String fileSystem) {
        this.fileSystem = fileSystem;
    }


    /**
     * Gets the clusterSizeInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return clusterSizeInBytes
     */
    public java.lang.Long getClusterSizeInBytes() {
        return clusterSizeInBytes;
    }


    /**
     * Sets the clusterSizeInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param clusterSizeInBytes
     */
    public void setClusterSizeInBytes(java.lang.Long clusterSizeInBytes) {
        this.clusterSizeInBytes = clusterSizeInBytes;
    }


    /**
     * Gets the firstClusterOffsetInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return firstClusterOffsetInBytes
     */
    public java.lang.Long getFirstClusterOffsetInBytes() {
        return firstClusterOffsetInBytes;
    }


    /**
     * Sets the firstClusterOffsetInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param firstClusterOffsetInBytes
     */
    public void setFirstClusterOffsetInBytes(java.lang.Long firstClusterOffsetInBytes) {
        this.firstClusterOffsetInBytes = firstClusterOffsetInBytes;
    }


    /**
     * Gets the label value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the capacityInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return capacityInBytes
     */
    public long getCapacityInBytes() {
        return capacityInBytes;
    }


    /**
     * Sets the capacityInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param capacityInBytes
     */
    public void setCapacityInBytes(long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }


    /**
     * Gets the spaceUsedInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return spaceUsedInBytes
     */
    public long getSpaceUsedInBytes() {
        return spaceUsedInBytes;
    }


    /**
     * Sets the spaceUsedInBytes value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param spaceUsedInBytes
     */
    public void setSpaceUsedInBytes(long spaceUsedInBytes) {
        this.spaceUsedInBytes = spaceUsedInBytes;
    }


    /**
     * Gets the extfsFeatures value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return extfsFeatures
     */
    public com.vmware.converter.ConverterStorageInfoVolumeInfoExtfsFeatures getExtfsFeatures() {
        return extfsFeatures;
    }


    /**
     * Sets the extfsFeatures value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param extfsFeatures
     */
    public void setExtfsFeatures(com.vmware.converter.ConverterStorageInfoVolumeInfoExtfsFeatures extfsFeatures) {
        this.extfsFeatures = extfsFeatures;
    }


    /**
     * Gets the xfsFeatures value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return xfsFeatures
     */
    public com.vmware.converter.ConverterStorageInfoVolumeInfoXfsFeatures getXfsFeatures() {
        return xfsFeatures;
    }


    /**
     * Sets the xfsFeatures value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param xfsFeatures
     */
    public void setXfsFeatures(com.vmware.converter.ConverterStorageInfoVolumeInfoXfsFeatures xfsFeatures) {
        this.xfsFeatures = xfsFeatures;
    }


    /**
     * Gets the lvName value for this ConverterStorageInfoVolumeInfo.
     * 
     * @return lvName
     */
    public java.lang.String getLvName() {
        return lvName;
    }


    /**
     * Sets the lvName value for this ConverterStorageInfoVolumeInfo.
     * 
     * @param lvName
     */
    public void setLvName(java.lang.String lvName) {
        this.lvName = lvName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageInfoVolumeInfo)) return false;
        ConverterStorageInfoVolumeInfo other = (ConverterStorageInfoVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.volumeId==null && other.getVolumeId()==null) || 
             (this.volumeId!=null &&
              this.volumeId.equals(other.getVolumeId()))) &&
            ((this.diskId==null && other.getDiskId()==null) || 
             (this.diskId!=null &&
              java.util.Arrays.equals(this.diskId, other.getDiskId()))) &&
            ((this.partitionNumber==null && other.getPartitionNumber()==null) || 
             (this.partitionNumber!=null &&
              this.partitionNumber.equals(other.getPartitionNumber()))) &&
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.partitionType==null && other.getPartitionType()==null) || 
             (this.partitionType!=null &&
              this.partitionType.equals(other.getPartitionType()))) &&
            ((this.partitionGuid==null && other.getPartitionGuid()==null) || 
             (this.partitionGuid!=null &&
              this.partitionGuid.equals(other.getPartitionGuid()))) &&
            ((this.partitionUuid==null && other.getPartitionUuid()==null) || 
             (this.partitionUuid!=null &&
              this.partitionUuid.equals(other.getPartitionUuid()))) &&
            ((this.fileSystem==null && other.getFileSystem()==null) || 
             (this.fileSystem!=null &&
              this.fileSystem.equals(other.getFileSystem()))) &&
            ((this.clusterSizeInBytes==null && other.getClusterSizeInBytes()==null) || 
             (this.clusterSizeInBytes!=null &&
              this.clusterSizeInBytes.equals(other.getClusterSizeInBytes()))) &&
            ((this.firstClusterOffsetInBytes==null && other.getFirstClusterOffsetInBytes()==null) || 
             (this.firstClusterOffsetInBytes!=null &&
              this.firstClusterOffsetInBytes.equals(other.getFirstClusterOffsetInBytes()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            this.capacityInBytes == other.getCapacityInBytes() &&
            this.spaceUsedInBytes == other.getSpaceUsedInBytes() &&
            ((this.extfsFeatures==null && other.getExtfsFeatures()==null) || 
             (this.extfsFeatures!=null &&
              this.extfsFeatures.equals(other.getExtfsFeatures()))) &&
            ((this.xfsFeatures==null && other.getXfsFeatures()==null) || 
             (this.xfsFeatures!=null &&
              this.xfsFeatures.equals(other.getXfsFeatures()))) &&
            ((this.lvName==null && other.getLvName()==null) || 
             (this.lvName!=null &&
              this.lvName.equals(other.getLvName())));
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
        if (getVolumeId() != null) {
            _hashCode += getVolumeId().hashCode();
        }
        if (getDiskId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartitionNumber() != null) {
            _hashCode += getPartitionNumber().hashCode();
        }
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getPartitionType() != null) {
            _hashCode += getPartitionType().hashCode();
        }
        if (getPartitionGuid() != null) {
            _hashCode += getPartitionGuid().hashCode();
        }
        if (getPartitionUuid() != null) {
            _hashCode += getPartitionUuid().hashCode();
        }
        if (getFileSystem() != null) {
            _hashCode += getFileSystem().hashCode();
        }
        if (getClusterSizeInBytes() != null) {
            _hashCode += getClusterSizeInBytes().hashCode();
        }
        if (getFirstClusterOffsetInBytes() != null) {
            _hashCode += getFirstClusterOffsetInBytes().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        _hashCode += new Long(getCapacityInBytes()).hashCode();
        _hashCode += new Long(getSpaceUsedInBytes()).hashCode();
        if (getExtfsFeatures() != null) {
            _hashCode += getExtfsFeatures().hashCode();
        }
        if (getXfsFeatures() != null) {
            _hashCode += getXfsFeatures().hashCode();
        }
        if (getLvName() != null) {
            _hashCode += getLvName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageInfoVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "fileSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSizeInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "clusterSizeInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstClusterOffsetInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "firstClusterOffsetInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "capacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUsedInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spaceUsedInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extfsFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "extfsFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfoExtfsFeatures"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xfsFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "xfsFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfoXfsFeatures"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lvName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lvName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
