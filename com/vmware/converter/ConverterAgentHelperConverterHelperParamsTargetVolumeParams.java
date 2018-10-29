/**
 * ConverterAgentHelperConverterHelperParamsTargetVolumeParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentHelperConverterHelperParamsTargetVolumeParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer partitionNumber;

    private boolean primary;

    private boolean active;

    private java.lang.String fileSystem;

    private long volumeCapacityInBytes;

    private java.lang.String sourceMountPoint;

    private long spaceUsedInBytes;

    private java.lang.String label;

    private java.lang.String lvName;

    private com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsExtfsFeatures extfsFeatures;

    private com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsXfsFeatures xfsFeatures;

    public ConverterAgentHelperConverterHelperParamsTargetVolumeParams() {
    }

    public ConverterAgentHelperConverterHelperParamsTargetVolumeParams(
           java.lang.Integer partitionNumber,
           boolean primary,
           boolean active,
           java.lang.String fileSystem,
           long volumeCapacityInBytes,
           java.lang.String sourceMountPoint,
           long spaceUsedInBytes,
           java.lang.String label,
           java.lang.String lvName,
           com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsExtfsFeatures extfsFeatures,
           com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsXfsFeatures xfsFeatures) {
        this.partitionNumber = partitionNumber;
        this.primary = primary;
        this.active = active;
        this.fileSystem = fileSystem;
        this.volumeCapacityInBytes = volumeCapacityInBytes;
        this.sourceMountPoint = sourceMountPoint;
        this.spaceUsedInBytes = spaceUsedInBytes;
        this.label = label;
        this.lvName = lvName;
        this.extfsFeatures = extfsFeatures;
        this.xfsFeatures = xfsFeatures;
    }


    /**
     * Gets the partitionNumber value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return partitionNumber
     */
    public java.lang.Integer getPartitionNumber() {
        return partitionNumber;
    }


    /**
     * Sets the partitionNumber value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param partitionNumber
     */
    public void setPartitionNumber(java.lang.Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }


    /**
     * Gets the primary value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return primary
     */
    public boolean isPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param primary
     */
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }


    /**
     * Gets the active value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the fileSystem value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return fileSystem
     */
    public java.lang.String getFileSystem() {
        return fileSystem;
    }


    /**
     * Sets the fileSystem value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param fileSystem
     */
    public void setFileSystem(java.lang.String fileSystem) {
        this.fileSystem = fileSystem;
    }


    /**
     * Gets the volumeCapacityInBytes value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return volumeCapacityInBytes
     */
    public long getVolumeCapacityInBytes() {
        return volumeCapacityInBytes;
    }


    /**
     * Sets the volumeCapacityInBytes value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param volumeCapacityInBytes
     */
    public void setVolumeCapacityInBytes(long volumeCapacityInBytes) {
        this.volumeCapacityInBytes = volumeCapacityInBytes;
    }


    /**
     * Gets the sourceMountPoint value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return sourceMountPoint
     */
    public java.lang.String getSourceMountPoint() {
        return sourceMountPoint;
    }


    /**
     * Sets the sourceMountPoint value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param sourceMountPoint
     */
    public void setSourceMountPoint(java.lang.String sourceMountPoint) {
        this.sourceMountPoint = sourceMountPoint;
    }


    /**
     * Gets the spaceUsedInBytes value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return spaceUsedInBytes
     */
    public long getSpaceUsedInBytes() {
        return spaceUsedInBytes;
    }


    /**
     * Sets the spaceUsedInBytes value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param spaceUsedInBytes
     */
    public void setSpaceUsedInBytes(long spaceUsedInBytes) {
        this.spaceUsedInBytes = spaceUsedInBytes;
    }


    /**
     * Gets the label value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lvName value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return lvName
     */
    public java.lang.String getLvName() {
        return lvName;
    }


    /**
     * Sets the lvName value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param lvName
     */
    public void setLvName(java.lang.String lvName) {
        this.lvName = lvName;
    }


    /**
     * Gets the extfsFeatures value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return extfsFeatures
     */
    public com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsExtfsFeatures getExtfsFeatures() {
        return extfsFeatures;
    }


    /**
     * Sets the extfsFeatures value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param extfsFeatures
     */
    public void setExtfsFeatures(com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsExtfsFeatures extfsFeatures) {
        this.extfsFeatures = extfsFeatures;
    }


    /**
     * Gets the xfsFeatures value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @return xfsFeatures
     */
    public com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsXfsFeatures getXfsFeatures() {
        return xfsFeatures;
    }


    /**
     * Sets the xfsFeatures value for this ConverterAgentHelperConverterHelperParamsTargetVolumeParams.
     * 
     * @param xfsFeatures
     */
    public void setXfsFeatures(com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParamsXfsFeatures xfsFeatures) {
        this.xfsFeatures = xfsFeatures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentHelperConverterHelperParamsTargetVolumeParams)) return false;
        ConverterAgentHelperConverterHelperParamsTargetVolumeParams other = (ConverterAgentHelperConverterHelperParamsTargetVolumeParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitionNumber==null && other.getPartitionNumber()==null) || 
             (this.partitionNumber!=null &&
              this.partitionNumber.equals(other.getPartitionNumber()))) &&
            this.primary == other.isPrimary() &&
            this.active == other.isActive() &&
            ((this.fileSystem==null && other.getFileSystem()==null) || 
             (this.fileSystem!=null &&
              this.fileSystem.equals(other.getFileSystem()))) &&
            this.volumeCapacityInBytes == other.getVolumeCapacityInBytes() &&
            ((this.sourceMountPoint==null && other.getSourceMountPoint()==null) || 
             (this.sourceMountPoint!=null &&
              this.sourceMountPoint.equals(other.getSourceMountPoint()))) &&
            this.spaceUsedInBytes == other.getSpaceUsedInBytes() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.lvName==null && other.getLvName()==null) || 
             (this.lvName!=null &&
              this.lvName.equals(other.getLvName()))) &&
            ((this.extfsFeatures==null && other.getExtfsFeatures()==null) || 
             (this.extfsFeatures!=null &&
              this.extfsFeatures.equals(other.getExtfsFeatures()))) &&
            ((this.xfsFeatures==null && other.getXfsFeatures()==null) || 
             (this.xfsFeatures!=null &&
              this.xfsFeatures.equals(other.getXfsFeatures())));
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
        if (getPartitionNumber() != null) {
            _hashCode += getPartitionNumber().hashCode();
        }
        _hashCode += (isPrimary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFileSystem() != null) {
            _hashCode += getFileSystem().hashCode();
        }
        _hashCode += new Long(getVolumeCapacityInBytes()).hashCode();
        if (getSourceMountPoint() != null) {
            _hashCode += getSourceMountPoint().hashCode();
        }
        _hashCode += new Long(getSpaceUsedInBytes()).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLvName() != null) {
            _hashCode += getLvName().hashCode();
        }
        if (getExtfsFeatures() != null) {
            _hashCode += getExtfsFeatures().hashCode();
        }
        if (getXfsFeatures() != null) {
            _hashCode += getXfsFeatures().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentHelperConverterHelperParamsTargetVolumeParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParamsTargetVolumeParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "fileSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeCapacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumeCapacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMountPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceMountPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUsedInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spaceUsedInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("lvName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lvName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extfsFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "extfsFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParamsTargetVolumeParamsExtfsFeatures"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xfsFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "xfsFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParamsTargetVolumeParamsXfsFeatures"));
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
