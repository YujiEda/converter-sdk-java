/**
 * ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalTargetStorageLayoutTargetDiskInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalDiskSizes dimensions;

    private java.lang.Integer sourceDiskDeviceNumber;

    private java.lang.String sourceDiskSpec;

    private java.lang.Integer signature;

    private java.lang.String diskGuid;

    private com.vmware.converter.ConverterAgentInternalDiskSpec destinationDisk;

    private com.vmware.converter.ConverterAgentInternalDiskAttachPoint attachPoint;

    private com.vmware.converter.ConverterAgentInternalDiskLayoutInfo sourceDiskLayout;

    private com.vmware.converter.ConverterAgentInternalDiskCreationOptions creationOptions;

    public ConverterAgentInternalTargetStorageLayoutTargetDiskInfo() {
    }

    public ConverterAgentInternalTargetStorageLayoutTargetDiskInfo(
           com.vmware.converter.ConverterAgentInternalDiskSizes dimensions,
           java.lang.Integer sourceDiskDeviceNumber,
           java.lang.String sourceDiskSpec,
           java.lang.Integer signature,
           java.lang.String diskGuid,
           com.vmware.converter.ConverterAgentInternalDiskSpec destinationDisk,
           com.vmware.converter.ConverterAgentInternalDiskAttachPoint attachPoint,
           com.vmware.converter.ConverterAgentInternalDiskLayoutInfo sourceDiskLayout,
           com.vmware.converter.ConverterAgentInternalDiskCreationOptions creationOptions) {
        this.dimensions = dimensions;
        this.sourceDiskDeviceNumber = sourceDiskDeviceNumber;
        this.sourceDiskSpec = sourceDiskSpec;
        this.signature = signature;
        this.diskGuid = diskGuid;
        this.destinationDisk = destinationDisk;
        this.attachPoint = attachPoint;
        this.sourceDiskLayout = sourceDiskLayout;
        this.creationOptions = creationOptions;
    }


    /**
     * Gets the dimensions value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return dimensions
     */
    public com.vmware.converter.ConverterAgentInternalDiskSizes getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param dimensions
     */
    public void setDimensions(com.vmware.converter.ConverterAgentInternalDiskSizes dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the sourceDiskDeviceNumber value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return sourceDiskDeviceNumber
     */
    public java.lang.Integer getSourceDiskDeviceNumber() {
        return sourceDiskDeviceNumber;
    }


    /**
     * Sets the sourceDiskDeviceNumber value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param sourceDiskDeviceNumber
     */
    public void setSourceDiskDeviceNumber(java.lang.Integer sourceDiskDeviceNumber) {
        this.sourceDiskDeviceNumber = sourceDiskDeviceNumber;
    }


    /**
     * Gets the sourceDiskSpec value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return sourceDiskSpec
     */
    public java.lang.String getSourceDiskSpec() {
        return sourceDiskSpec;
    }


    /**
     * Sets the sourceDiskSpec value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param sourceDiskSpec
     */
    public void setSourceDiskSpec(java.lang.String sourceDiskSpec) {
        this.sourceDiskSpec = sourceDiskSpec;
    }


    /**
     * Gets the signature value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return signature
     */
    public java.lang.Integer getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param signature
     */
    public void setSignature(java.lang.Integer signature) {
        this.signature = signature;
    }


    /**
     * Gets the diskGuid value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return diskGuid
     */
    public java.lang.String getDiskGuid() {
        return diskGuid;
    }


    /**
     * Sets the diskGuid value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param diskGuid
     */
    public void setDiskGuid(java.lang.String diskGuid) {
        this.diskGuid = diskGuid;
    }


    /**
     * Gets the destinationDisk value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return destinationDisk
     */
    public com.vmware.converter.ConverterAgentInternalDiskSpec getDestinationDisk() {
        return destinationDisk;
    }


    /**
     * Sets the destinationDisk value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param destinationDisk
     */
    public void setDestinationDisk(com.vmware.converter.ConverterAgentInternalDiskSpec destinationDisk) {
        this.destinationDisk = destinationDisk;
    }


    /**
     * Gets the attachPoint value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return attachPoint
     */
    public com.vmware.converter.ConverterAgentInternalDiskAttachPoint getAttachPoint() {
        return attachPoint;
    }


    /**
     * Sets the attachPoint value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param attachPoint
     */
    public void setAttachPoint(com.vmware.converter.ConverterAgentInternalDiskAttachPoint attachPoint) {
        this.attachPoint = attachPoint;
    }


    /**
     * Gets the sourceDiskLayout value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return sourceDiskLayout
     */
    public com.vmware.converter.ConverterAgentInternalDiskLayoutInfo getSourceDiskLayout() {
        return sourceDiskLayout;
    }


    /**
     * Sets the sourceDiskLayout value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param sourceDiskLayout
     */
    public void setSourceDiskLayout(com.vmware.converter.ConverterAgentInternalDiskLayoutInfo sourceDiskLayout) {
        this.sourceDiskLayout = sourceDiskLayout;
    }


    /**
     * Gets the creationOptions value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @return creationOptions
     */
    public com.vmware.converter.ConverterAgentInternalDiskCreationOptions getCreationOptions() {
        return creationOptions;
    }


    /**
     * Sets the creationOptions value for this ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.
     * 
     * @param creationOptions
     */
    public void setCreationOptions(com.vmware.converter.ConverterAgentInternalDiskCreationOptions creationOptions) {
        this.creationOptions = creationOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalTargetStorageLayoutTargetDiskInfo)) return false;
        ConverterAgentInternalTargetStorageLayoutTargetDiskInfo other = (ConverterAgentInternalTargetStorageLayoutTargetDiskInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.sourceDiskDeviceNumber==null && other.getSourceDiskDeviceNumber()==null) || 
             (this.sourceDiskDeviceNumber!=null &&
              this.sourceDiskDeviceNumber.equals(other.getSourceDiskDeviceNumber()))) &&
            ((this.sourceDiskSpec==null && other.getSourceDiskSpec()==null) || 
             (this.sourceDiskSpec!=null &&
              this.sourceDiskSpec.equals(other.getSourceDiskSpec()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.diskGuid==null && other.getDiskGuid()==null) || 
             (this.diskGuid!=null &&
              this.diskGuid.equals(other.getDiskGuid()))) &&
            ((this.destinationDisk==null && other.getDestinationDisk()==null) || 
             (this.destinationDisk!=null &&
              this.destinationDisk.equals(other.getDestinationDisk()))) &&
            ((this.attachPoint==null && other.getAttachPoint()==null) || 
             (this.attachPoint!=null &&
              this.attachPoint.equals(other.getAttachPoint()))) &&
            ((this.sourceDiskLayout==null && other.getSourceDiskLayout()==null) || 
             (this.sourceDiskLayout!=null &&
              this.sourceDiskLayout.equals(other.getSourceDiskLayout()))) &&
            ((this.creationOptions==null && other.getCreationOptions()==null) || 
             (this.creationOptions!=null &&
              this.creationOptions.equals(other.getCreationOptions())));
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
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getSourceDiskDeviceNumber() != null) {
            _hashCode += getSourceDiskDeviceNumber().hashCode();
        }
        if (getSourceDiskSpec() != null) {
            _hashCode += getSourceDiskSpec().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getDiskGuid() != null) {
            _hashCode += getDiskGuid().hashCode();
        }
        if (getDestinationDisk() != null) {
            _hashCode += getDestinationDisk().hashCode();
        }
        if (getAttachPoint() != null) {
            _hashCode += getAttachPoint().hashCode();
        }
        if (getSourceDiskLayout() != null) {
            _hashCode += getSourceDiskLayout().hashCode();
        }
        if (getCreationOptions() != null) {
            _hashCode += getCreationOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalTargetStorageLayoutTargetDiskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutTargetDiskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSizes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDiskDeviceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDiskDeviceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDiskSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDiskSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "signature"));
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
        elemField.setFieldName("destinationDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "destinationDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "attachPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskAttachPoint"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDiskLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDiskLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskLayoutInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "creationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskCreationOptions"));
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
