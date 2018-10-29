/**
 * ConverterParamsStorageMappingDiskMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterParamsStorageMappingDiskMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String sourceDiskId;

    private java.lang.String targetDiskId;

    private java.lang.String diskCreateType;

    private java.lang.Boolean lvg;

    private java.lang.Boolean gpt;

    private java.lang.Integer diskSignature;

    private java.lang.String diskGuid;

    public ConverterParamsStorageMappingDiskMapping() {
    }

    public ConverterParamsStorageMappingDiskMapping(
           java.lang.String sourceDiskId,
           java.lang.String targetDiskId,
           java.lang.String diskCreateType,
           java.lang.Boolean lvg,
           java.lang.Boolean gpt,
           java.lang.Integer diskSignature,
           java.lang.String diskGuid) {
        this.sourceDiskId = sourceDiskId;
        this.targetDiskId = targetDiskId;
        this.diskCreateType = diskCreateType;
        this.lvg = lvg;
        this.gpt = gpt;
        this.diskSignature = diskSignature;
        this.diskGuid = diskGuid;
    }


    /**
     * Gets the sourceDiskId value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return sourceDiskId
     */
    public java.lang.String getSourceDiskId() {
        return sourceDiskId;
    }


    /**
     * Sets the sourceDiskId value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param sourceDiskId
     */
    public void setSourceDiskId(java.lang.String sourceDiskId) {
        this.sourceDiskId = sourceDiskId;
    }


    /**
     * Gets the targetDiskId value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return targetDiskId
     */
    public java.lang.String getTargetDiskId() {
        return targetDiskId;
    }


    /**
     * Sets the targetDiskId value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param targetDiskId
     */
    public void setTargetDiskId(java.lang.String targetDiskId) {
        this.targetDiskId = targetDiskId;
    }


    /**
     * Gets the diskCreateType value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return diskCreateType
     */
    public java.lang.String getDiskCreateType() {
        return diskCreateType;
    }


    /**
     * Sets the diskCreateType value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param diskCreateType
     */
    public void setDiskCreateType(java.lang.String diskCreateType) {
        this.diskCreateType = diskCreateType;
    }


    /**
     * Gets the lvg value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return lvg
     */
    public java.lang.Boolean getLvg() {
        return lvg;
    }


    /**
     * Sets the lvg value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param lvg
     */
    public void setLvg(java.lang.Boolean lvg) {
        this.lvg = lvg;
    }


    /**
     * Gets the gpt value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return gpt
     */
    public java.lang.Boolean getGpt() {
        return gpt;
    }


    /**
     * Sets the gpt value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param gpt
     */
    public void setGpt(java.lang.Boolean gpt) {
        this.gpt = gpt;
    }


    /**
     * Gets the diskSignature value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return diskSignature
     */
    public java.lang.Integer getDiskSignature() {
        return diskSignature;
    }


    /**
     * Sets the diskSignature value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param diskSignature
     */
    public void setDiskSignature(java.lang.Integer diskSignature) {
        this.diskSignature = diskSignature;
    }


    /**
     * Gets the diskGuid value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @return diskGuid
     */
    public java.lang.String getDiskGuid() {
        return diskGuid;
    }


    /**
     * Sets the diskGuid value for this ConverterParamsStorageMappingDiskMapping.
     * 
     * @param diskGuid
     */
    public void setDiskGuid(java.lang.String diskGuid) {
        this.diskGuid = diskGuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterParamsStorageMappingDiskMapping)) return false;
        ConverterParamsStorageMappingDiskMapping other = (ConverterParamsStorageMappingDiskMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceDiskId==null && other.getSourceDiskId()==null) || 
             (this.sourceDiskId!=null &&
              this.sourceDiskId.equals(other.getSourceDiskId()))) &&
            ((this.targetDiskId==null && other.getTargetDiskId()==null) || 
             (this.targetDiskId!=null &&
              this.targetDiskId.equals(other.getTargetDiskId()))) &&
            ((this.diskCreateType==null && other.getDiskCreateType()==null) || 
             (this.diskCreateType!=null &&
              this.diskCreateType.equals(other.getDiskCreateType()))) &&
            ((this.lvg==null && other.getLvg()==null) || 
             (this.lvg!=null &&
              this.lvg.equals(other.getLvg()))) &&
            ((this.gpt==null && other.getGpt()==null) || 
             (this.gpt!=null &&
              this.gpt.equals(other.getGpt()))) &&
            ((this.diskSignature==null && other.getDiskSignature()==null) || 
             (this.diskSignature!=null &&
              this.diskSignature.equals(other.getDiskSignature()))) &&
            ((this.diskGuid==null && other.getDiskGuid()==null) || 
             (this.diskGuid!=null &&
              this.diskGuid.equals(other.getDiskGuid())));
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
        if (getSourceDiskId() != null) {
            _hashCode += getSourceDiskId().hashCode();
        }
        if (getTargetDiskId() != null) {
            _hashCode += getTargetDiskId().hashCode();
        }
        if (getDiskCreateType() != null) {
            _hashCode += getDiskCreateType().hashCode();
        }
        if (getLvg() != null) {
            _hashCode += getLvg().hashCode();
        }
        if (getGpt() != null) {
            _hashCode += getGpt().hashCode();
        }
        if (getDiskSignature() != null) {
            _hashCode += getDiskSignature().hashCode();
        }
        if (getDiskGuid() != null) {
            _hashCode += getDiskGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterParamsStorageMappingDiskMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingDiskMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDiskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDiskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDiskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetDiskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskCreateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskCreateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lvg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lvg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "gpt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
