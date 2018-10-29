/**
 * ConverterStorageParamsTargetDiskParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageParamsTargetDiskParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String sourceDiskId;

    private com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] volumesToClone;

    private java.lang.String diskType;

    private java.lang.Boolean lvg;

    private java.lang.Boolean gpt;

    public ConverterStorageParamsTargetDiskParams() {
    }

    public ConverterStorageParamsTargetDiskParams(
           java.lang.String sourceDiskId,
           com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] volumesToClone,
           java.lang.String diskType,
           java.lang.Boolean lvg,
           java.lang.Boolean gpt) {
        this.sourceDiskId = sourceDiskId;
        this.volumesToClone = volumesToClone;
        this.diskType = diskType;
        this.lvg = lvg;
        this.gpt = gpt;
    }


    /**
     * Gets the sourceDiskId value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @return sourceDiskId
     */
    public java.lang.String getSourceDiskId() {
        return sourceDiskId;
    }


    /**
     * Sets the sourceDiskId value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @param sourceDiskId
     */
    public void setSourceDiskId(java.lang.String sourceDiskId) {
        this.sourceDiskId = sourceDiskId;
    }


    /**
     * Gets the volumesToClone value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @return volumesToClone
     */
    public com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] getVolumesToClone() {
        return volumesToClone;
    }


    /**
     * Sets the volumesToClone value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @param volumesToClone
     */
    public void setVolumesToClone(com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] volumesToClone) {
        this.volumesToClone = volumesToClone;
    }

    public com.vmware.converter.ConverterStorageParamsVolumeCloningParams getVolumesToClone(int i) {
        return this.volumesToClone[i];
    }

    public void setVolumesToClone(int i, com.vmware.converter.ConverterStorageParamsVolumeCloningParams _value) {
        this.volumesToClone[i] = _value;
    }


    /**
     * Gets the diskType value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @return diskType
     */
    public java.lang.String getDiskType() {
        return diskType;
    }


    /**
     * Sets the diskType value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @param diskType
     */
    public void setDiskType(java.lang.String diskType) {
        this.diskType = diskType;
    }


    /**
     * Gets the lvg value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @return lvg
     */
    public java.lang.Boolean getLvg() {
        return lvg;
    }


    /**
     * Sets the lvg value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @param lvg
     */
    public void setLvg(java.lang.Boolean lvg) {
        this.lvg = lvg;
    }


    /**
     * Gets the gpt value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @return gpt
     */
    public java.lang.Boolean getGpt() {
        return gpt;
    }


    /**
     * Sets the gpt value for this ConverterStorageParamsTargetDiskParams.
     * 
     * @param gpt
     */
    public void setGpt(java.lang.Boolean gpt) {
        this.gpt = gpt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageParamsTargetDiskParams)) return false;
        ConverterStorageParamsTargetDiskParams other = (ConverterStorageParamsTargetDiskParams) obj;
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
            ((this.volumesToClone==null && other.getVolumesToClone()==null) || 
             (this.volumesToClone!=null &&
              java.util.Arrays.equals(this.volumesToClone, other.getVolumesToClone()))) &&
            ((this.diskType==null && other.getDiskType()==null) || 
             (this.diskType!=null &&
              this.diskType.equals(other.getDiskType()))) &&
            ((this.lvg==null && other.getLvg()==null) || 
             (this.lvg!=null &&
              this.lvg.equals(other.getLvg()))) &&
            ((this.gpt==null && other.getGpt()==null) || 
             (this.gpt!=null &&
              this.gpt.equals(other.getGpt())));
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
        if (getVolumesToClone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolumesToClone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolumesToClone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskType() != null) {
            _hashCode += getDiskType().hashCode();
        }
        if (getLvg() != null) {
            _hashCode += getLvg().hashCode();
        }
        if (getGpt() != null) {
            _hashCode += getGpt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageParamsTargetDiskParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsTargetDiskParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDiskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceDiskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumesToClone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumesToClone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsVolumeCloningParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
