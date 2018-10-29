/**
 * ConverterAgentInternalExtendedOsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalExtendedOsInfo  extends com.vmware.converter.ConverterAgentInternalOsInfo  implements java.io.Serializable {
    private boolean multiProcessor;

    private boolean osIs64Bit;

    private java.lang.String osFolder;

    private int bootPartition;

    private java.lang.String partitionGuid;

    private java.lang.String partitionUuid;

    private java.lang.Integer bootDiskDeviceNumber;

    private java.lang.Integer bootDiskSignature;

    private java.lang.String bootDiskGuid;

    private java.lang.Boolean vmxnetPresent;

    private java.lang.Integer bootPartStartingSector;

    public ConverterAgentInternalExtendedOsInfo() {
    }

    public ConverterAgentInternalExtendedOsInfo(
           com.vmware.converter.ConverterAgentInternalOsInfoOsFamily family,
           java.lang.String displayName,
           java.lang.String guestOsId,
           java.lang.String vendor,
           java.lang.String edition,
           int majorVersion,
           int minorVersion,
           boolean multiProcessor,
           boolean osIs64Bit,
           java.lang.String osFolder,
           int bootPartition,
           java.lang.String partitionGuid,
           java.lang.String partitionUuid,
           java.lang.Integer bootDiskDeviceNumber,
           java.lang.Integer bootDiskSignature,
           java.lang.String bootDiskGuid,
           java.lang.Boolean vmxnetPresent,
           java.lang.Integer bootPartStartingSector) {
        super(
            family,
            displayName,
            guestOsId,
            vendor,
            edition,
            majorVersion,
            minorVersion);
        this.multiProcessor = multiProcessor;
        this.osIs64Bit = osIs64Bit;
        this.osFolder = osFolder;
        this.bootPartition = bootPartition;
        this.partitionGuid = partitionGuid;
        this.partitionUuid = partitionUuid;
        this.bootDiskDeviceNumber = bootDiskDeviceNumber;
        this.bootDiskSignature = bootDiskSignature;
        this.bootDiskGuid = bootDiskGuid;
        this.vmxnetPresent = vmxnetPresent;
        this.bootPartStartingSector = bootPartStartingSector;
    }


    /**
     * Gets the multiProcessor value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return multiProcessor
     */
    public boolean isMultiProcessor() {
        return multiProcessor;
    }


    /**
     * Sets the multiProcessor value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param multiProcessor
     */
    public void setMultiProcessor(boolean multiProcessor) {
        this.multiProcessor = multiProcessor;
    }


    /**
     * Gets the osIs64Bit value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return osIs64Bit
     */
    public boolean isOsIs64Bit() {
        return osIs64Bit;
    }


    /**
     * Sets the osIs64Bit value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param osIs64Bit
     */
    public void setOsIs64Bit(boolean osIs64Bit) {
        this.osIs64Bit = osIs64Bit;
    }


    /**
     * Gets the osFolder value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return osFolder
     */
    public java.lang.String getOsFolder() {
        return osFolder;
    }


    /**
     * Sets the osFolder value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param osFolder
     */
    public void setOsFolder(java.lang.String osFolder) {
        this.osFolder = osFolder;
    }


    /**
     * Gets the bootPartition value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return bootPartition
     */
    public int getBootPartition() {
        return bootPartition;
    }


    /**
     * Sets the bootPartition value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param bootPartition
     */
    public void setBootPartition(int bootPartition) {
        this.bootPartition = bootPartition;
    }


    /**
     * Gets the partitionGuid value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return partitionGuid
     */
    public java.lang.String getPartitionGuid() {
        return partitionGuid;
    }


    /**
     * Sets the partitionGuid value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param partitionGuid
     */
    public void setPartitionGuid(java.lang.String partitionGuid) {
        this.partitionGuid = partitionGuid;
    }


    /**
     * Gets the partitionUuid value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return partitionUuid
     */
    public java.lang.String getPartitionUuid() {
        return partitionUuid;
    }


    /**
     * Sets the partitionUuid value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param partitionUuid
     */
    public void setPartitionUuid(java.lang.String partitionUuid) {
        this.partitionUuid = partitionUuid;
    }


    /**
     * Gets the bootDiskDeviceNumber value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return bootDiskDeviceNumber
     */
    public java.lang.Integer getBootDiskDeviceNumber() {
        return bootDiskDeviceNumber;
    }


    /**
     * Sets the bootDiskDeviceNumber value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param bootDiskDeviceNumber
     */
    public void setBootDiskDeviceNumber(java.lang.Integer bootDiskDeviceNumber) {
        this.bootDiskDeviceNumber = bootDiskDeviceNumber;
    }


    /**
     * Gets the bootDiskSignature value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return bootDiskSignature
     */
    public java.lang.Integer getBootDiskSignature() {
        return bootDiskSignature;
    }


    /**
     * Sets the bootDiskSignature value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param bootDiskSignature
     */
    public void setBootDiskSignature(java.lang.Integer bootDiskSignature) {
        this.bootDiskSignature = bootDiskSignature;
    }


    /**
     * Gets the bootDiskGuid value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return bootDiskGuid
     */
    public java.lang.String getBootDiskGuid() {
        return bootDiskGuid;
    }


    /**
     * Sets the bootDiskGuid value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param bootDiskGuid
     */
    public void setBootDiskGuid(java.lang.String bootDiskGuid) {
        this.bootDiskGuid = bootDiskGuid;
    }


    /**
     * Gets the vmxnetPresent value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return vmxnetPresent
     */
    public java.lang.Boolean getVmxnetPresent() {
        return vmxnetPresent;
    }


    /**
     * Sets the vmxnetPresent value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param vmxnetPresent
     */
    public void setVmxnetPresent(java.lang.Boolean vmxnetPresent) {
        this.vmxnetPresent = vmxnetPresent;
    }


    /**
     * Gets the bootPartStartingSector value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @return bootPartStartingSector
     */
    public java.lang.Integer getBootPartStartingSector() {
        return bootPartStartingSector;
    }


    /**
     * Sets the bootPartStartingSector value for this ConverterAgentInternalExtendedOsInfo.
     * 
     * @param bootPartStartingSector
     */
    public void setBootPartStartingSector(java.lang.Integer bootPartStartingSector) {
        this.bootPartStartingSector = bootPartStartingSector;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalExtendedOsInfo)) return false;
        ConverterAgentInternalExtendedOsInfo other = (ConverterAgentInternalExtendedOsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.multiProcessor == other.isMultiProcessor() &&
            this.osIs64Bit == other.isOsIs64Bit() &&
            ((this.osFolder==null && other.getOsFolder()==null) || 
             (this.osFolder!=null &&
              this.osFolder.equals(other.getOsFolder()))) &&
            this.bootPartition == other.getBootPartition() &&
            ((this.partitionGuid==null && other.getPartitionGuid()==null) || 
             (this.partitionGuid!=null &&
              this.partitionGuid.equals(other.getPartitionGuid()))) &&
            ((this.partitionUuid==null && other.getPartitionUuid()==null) || 
             (this.partitionUuid!=null &&
              this.partitionUuid.equals(other.getPartitionUuid()))) &&
            ((this.bootDiskDeviceNumber==null && other.getBootDiskDeviceNumber()==null) || 
             (this.bootDiskDeviceNumber!=null &&
              this.bootDiskDeviceNumber.equals(other.getBootDiskDeviceNumber()))) &&
            ((this.bootDiskSignature==null && other.getBootDiskSignature()==null) || 
             (this.bootDiskSignature!=null &&
              this.bootDiskSignature.equals(other.getBootDiskSignature()))) &&
            ((this.bootDiskGuid==null && other.getBootDiskGuid()==null) || 
             (this.bootDiskGuid!=null &&
              this.bootDiskGuid.equals(other.getBootDiskGuid()))) &&
            ((this.vmxnetPresent==null && other.getVmxnetPresent()==null) || 
             (this.vmxnetPresent!=null &&
              this.vmxnetPresent.equals(other.getVmxnetPresent()))) &&
            ((this.bootPartStartingSector==null && other.getBootPartStartingSector()==null) || 
             (this.bootPartStartingSector!=null &&
              this.bootPartStartingSector.equals(other.getBootPartStartingSector())));
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
        _hashCode += (isMultiProcessor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOsIs64Bit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOsFolder() != null) {
            _hashCode += getOsFolder().hashCode();
        }
        _hashCode += getBootPartition();
        if (getPartitionGuid() != null) {
            _hashCode += getPartitionGuid().hashCode();
        }
        if (getPartitionUuid() != null) {
            _hashCode += getPartitionUuid().hashCode();
        }
        if (getBootDiskDeviceNumber() != null) {
            _hashCode += getBootDiskDeviceNumber().hashCode();
        }
        if (getBootDiskSignature() != null) {
            _hashCode += getBootDiskSignature().hashCode();
        }
        if (getBootDiskGuid() != null) {
            _hashCode += getBootDiskGuid().hashCode();
        }
        if (getVmxnetPresent() != null) {
            _hashCode += getVmxnetPresent().hashCode();
        }
        if (getBootPartStartingSector() != null) {
            _hashCode += getBootPartStartingSector().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalExtendedOsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalExtendedOsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "multiProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osIs64Bit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osIs64Bit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("bootDiskDeviceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootDiskDeviceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDiskSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootDiskSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDiskGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootDiskGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmxnetPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmxnetPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootPartStartingSector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootPartStartingSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
