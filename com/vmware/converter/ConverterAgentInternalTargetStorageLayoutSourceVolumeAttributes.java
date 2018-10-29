/**
 * ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String volumeId;

    private java.lang.Integer diskSignature;

    private java.lang.String diskGuid;

    private java.lang.Long startingOffset;

    private long capacity;

    private long spaceUsed;

    private java.lang.Integer partitionType;

    private java.lang.String partitionGuid;

    private java.lang.String partitionUuid;

    private java.lang.Integer partitionNumber;

    private byte[] windowsUniqueId;

    private java.lang.Integer diskDeviceNumber;

    private java.lang.Boolean primary;

    private boolean active;

    private boolean filesystemUnderstood;

    public ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes() {
    }

    public ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes(
           java.lang.String volumeId,
           java.lang.Integer diskSignature,
           java.lang.String diskGuid,
           java.lang.Long startingOffset,
           long capacity,
           long spaceUsed,
           java.lang.Integer partitionType,
           java.lang.String partitionGuid,
           java.lang.String partitionUuid,
           java.lang.Integer partitionNumber,
           byte[] windowsUniqueId,
           java.lang.Integer diskDeviceNumber,
           java.lang.Boolean primary,
           boolean active,
           boolean filesystemUnderstood) {
        this.volumeId = volumeId;
        this.diskSignature = diskSignature;
        this.diskGuid = diskGuid;
        this.startingOffset = startingOffset;
        this.capacity = capacity;
        this.spaceUsed = spaceUsed;
        this.partitionType = partitionType;
        this.partitionGuid = partitionGuid;
        this.partitionUuid = partitionUuid;
        this.partitionNumber = partitionNumber;
        this.windowsUniqueId = windowsUniqueId;
        this.diskDeviceNumber = diskDeviceNumber;
        this.primary = primary;
        this.active = active;
        this.filesystemUnderstood = filesystemUnderstood;
    }


    /**
     * Gets the volumeId value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return volumeId
     */
    public java.lang.String getVolumeId() {
        return volumeId;
    }


    /**
     * Sets the volumeId value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param volumeId
     */
    public void setVolumeId(java.lang.String volumeId) {
        this.volumeId = volumeId;
    }


    /**
     * Gets the diskSignature value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return diskSignature
     */
    public java.lang.Integer getDiskSignature() {
        return diskSignature;
    }


    /**
     * Sets the diskSignature value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param diskSignature
     */
    public void setDiskSignature(java.lang.Integer diskSignature) {
        this.diskSignature = diskSignature;
    }


    /**
     * Gets the diskGuid value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return diskGuid
     */
    public java.lang.String getDiskGuid() {
        return diskGuid;
    }


    /**
     * Sets the diskGuid value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param diskGuid
     */
    public void setDiskGuid(java.lang.String diskGuid) {
        this.diskGuid = diskGuid;
    }


    /**
     * Gets the startingOffset value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return startingOffset
     */
    public java.lang.Long getStartingOffset() {
        return startingOffset;
    }


    /**
     * Sets the startingOffset value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param startingOffset
     */
    public void setStartingOffset(java.lang.Long startingOffset) {
        this.startingOffset = startingOffset;
    }


    /**
     * Gets the capacity value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return capacity
     */
    public long getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param capacity
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the spaceUsed value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return spaceUsed
     */
    public long getSpaceUsed() {
        return spaceUsed;
    }


    /**
     * Sets the spaceUsed value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param spaceUsed
     */
    public void setSpaceUsed(long spaceUsed) {
        this.spaceUsed = spaceUsed;
    }


    /**
     * Gets the partitionType value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return partitionType
     */
    public java.lang.Integer getPartitionType() {
        return partitionType;
    }


    /**
     * Sets the partitionType value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param partitionType
     */
    public void setPartitionType(java.lang.Integer partitionType) {
        this.partitionType = partitionType;
    }


    /**
     * Gets the partitionGuid value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return partitionGuid
     */
    public java.lang.String getPartitionGuid() {
        return partitionGuid;
    }


    /**
     * Sets the partitionGuid value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param partitionGuid
     */
    public void setPartitionGuid(java.lang.String partitionGuid) {
        this.partitionGuid = partitionGuid;
    }


    /**
     * Gets the partitionUuid value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return partitionUuid
     */
    public java.lang.String getPartitionUuid() {
        return partitionUuid;
    }


    /**
     * Sets the partitionUuid value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param partitionUuid
     */
    public void setPartitionUuid(java.lang.String partitionUuid) {
        this.partitionUuid = partitionUuid;
    }


    /**
     * Gets the partitionNumber value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return partitionNumber
     */
    public java.lang.Integer getPartitionNumber() {
        return partitionNumber;
    }


    /**
     * Sets the partitionNumber value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param partitionNumber
     */
    public void setPartitionNumber(java.lang.Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }


    /**
     * Gets the windowsUniqueId value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return windowsUniqueId
     */
    public byte[] getWindowsUniqueId() {
        return windowsUniqueId;
    }


    /**
     * Sets the windowsUniqueId value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param windowsUniqueId
     */
    public void setWindowsUniqueId(byte[] windowsUniqueId) {
        this.windowsUniqueId = windowsUniqueId;
    }

    public byte getWindowsUniqueId(int i) {
        return this.windowsUniqueId[i];
    }

    public void setWindowsUniqueId(int i, byte _value) {
        this.windowsUniqueId[i] = _value;
    }


    /**
     * Gets the diskDeviceNumber value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return diskDeviceNumber
     */
    public java.lang.Integer getDiskDeviceNumber() {
        return diskDeviceNumber;
    }


    /**
     * Sets the diskDeviceNumber value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param diskDeviceNumber
     */
    public void setDiskDeviceNumber(java.lang.Integer diskDeviceNumber) {
        this.diskDeviceNumber = diskDeviceNumber;
    }


    /**
     * Gets the primary value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return primary
     */
    public java.lang.Boolean getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param primary
     */
    public void setPrimary(java.lang.Boolean primary) {
        this.primary = primary;
    }


    /**
     * Gets the active value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the filesystemUnderstood value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @return filesystemUnderstood
     */
    public boolean isFilesystemUnderstood() {
        return filesystemUnderstood;
    }


    /**
     * Sets the filesystemUnderstood value for this ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.
     * 
     * @param filesystemUnderstood
     */
    public void setFilesystemUnderstood(boolean filesystemUnderstood) {
        this.filesystemUnderstood = filesystemUnderstood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes)) return false;
        ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes other = (ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes) obj;
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
            ((this.diskSignature==null && other.getDiskSignature()==null) || 
             (this.diskSignature!=null &&
              this.diskSignature.equals(other.getDiskSignature()))) &&
            ((this.diskGuid==null && other.getDiskGuid()==null) || 
             (this.diskGuid!=null &&
              this.diskGuid.equals(other.getDiskGuid()))) &&
            ((this.startingOffset==null && other.getStartingOffset()==null) || 
             (this.startingOffset!=null &&
              this.startingOffset.equals(other.getStartingOffset()))) &&
            this.capacity == other.getCapacity() &&
            this.spaceUsed == other.getSpaceUsed() &&
            ((this.partitionType==null && other.getPartitionType()==null) || 
             (this.partitionType!=null &&
              this.partitionType.equals(other.getPartitionType()))) &&
            ((this.partitionGuid==null && other.getPartitionGuid()==null) || 
             (this.partitionGuid!=null &&
              this.partitionGuid.equals(other.getPartitionGuid()))) &&
            ((this.partitionUuid==null && other.getPartitionUuid()==null) || 
             (this.partitionUuid!=null &&
              this.partitionUuid.equals(other.getPartitionUuid()))) &&
            ((this.partitionNumber==null && other.getPartitionNumber()==null) || 
             (this.partitionNumber!=null &&
              this.partitionNumber.equals(other.getPartitionNumber()))) &&
            ((this.windowsUniqueId==null && other.getWindowsUniqueId()==null) || 
             (this.windowsUniqueId!=null &&
              java.util.Arrays.equals(this.windowsUniqueId, other.getWindowsUniqueId()))) &&
            ((this.diskDeviceNumber==null && other.getDiskDeviceNumber()==null) || 
             (this.diskDeviceNumber!=null &&
              this.diskDeviceNumber.equals(other.getDiskDeviceNumber()))) &&
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary()))) &&
            this.active == other.isActive() &&
            this.filesystemUnderstood == other.isFilesystemUnderstood();
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
        if (getDiskSignature() != null) {
            _hashCode += getDiskSignature().hashCode();
        }
        if (getDiskGuid() != null) {
            _hashCode += getDiskGuid().hashCode();
        }
        if (getStartingOffset() != null) {
            _hashCode += getStartingOffset().hashCode();
        }
        _hashCode += new Long(getCapacity()).hashCode();
        _hashCode += new Long(getSpaceUsed()).hashCode();
        if (getPartitionType() != null) {
            _hashCode += getPartitionType().hashCode();
        }
        if (getPartitionGuid() != null) {
            _hashCode += getPartitionGuid().hashCode();
        }
        if (getPartitionUuid() != null) {
            _hashCode += getPartitionUuid().hashCode();
        }
        if (getPartitionNumber() != null) {
            _hashCode += getPartitionNumber().hashCode();
        }
        if (getWindowsUniqueId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWindowsUniqueId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWindowsUniqueId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskDeviceNumber() != null) {
            _hashCode += getDiskDeviceNumber().hashCode();
        }
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFilesystemUnderstood() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutSourceVolumeAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "startingOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spaceUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("partitionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowsUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "windowsUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskDeviceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskDeviceNumber"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesystemUnderstood");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "filesystemUnderstood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
