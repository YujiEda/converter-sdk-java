/**
 * ConverterAgentHelperConverterHelperParamsTargetDiskParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentHelperConverterHelperParamsTargetDiskParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterDiskAttachPoint attachPoint;

    private java.lang.Integer sourceBiosNumber;

    private java.lang.Boolean lvg;

    private java.lang.String lvgName;

    private java.lang.Boolean gpt;

    private java.lang.Integer diskSignature;

    private java.lang.String diskGuid;

    private com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParams[] volume;

    public ConverterAgentHelperConverterHelperParamsTargetDiskParams() {
    }

    public ConverterAgentHelperConverterHelperParamsTargetDiskParams(
           com.vmware.converter.ConverterDiskAttachPoint attachPoint,
           java.lang.Integer sourceBiosNumber,
           java.lang.Boolean lvg,
           java.lang.String lvgName,
           java.lang.Boolean gpt,
           java.lang.Integer diskSignature,
           java.lang.String diskGuid,
           com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParams[] volume) {
        this.attachPoint = attachPoint;
        this.sourceBiosNumber = sourceBiosNumber;
        this.lvg = lvg;
        this.lvgName = lvgName;
        this.gpt = gpt;
        this.diskSignature = diskSignature;
        this.diskGuid = diskGuid;
        this.volume = volume;
    }


    /**
     * Gets the attachPoint value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return attachPoint
     */
    public com.vmware.converter.ConverterDiskAttachPoint getAttachPoint() {
        return attachPoint;
    }


    /**
     * Sets the attachPoint value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param attachPoint
     */
    public void setAttachPoint(com.vmware.converter.ConverterDiskAttachPoint attachPoint) {
        this.attachPoint = attachPoint;
    }


    /**
     * Gets the sourceBiosNumber value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return sourceBiosNumber
     */
    public java.lang.Integer getSourceBiosNumber() {
        return sourceBiosNumber;
    }


    /**
     * Sets the sourceBiosNumber value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param sourceBiosNumber
     */
    public void setSourceBiosNumber(java.lang.Integer sourceBiosNumber) {
        this.sourceBiosNumber = sourceBiosNumber;
    }


    /**
     * Gets the lvg value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return lvg
     */
    public java.lang.Boolean getLvg() {
        return lvg;
    }


    /**
     * Sets the lvg value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param lvg
     */
    public void setLvg(java.lang.Boolean lvg) {
        this.lvg = lvg;
    }


    /**
     * Gets the lvgName value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return lvgName
     */
    public java.lang.String getLvgName() {
        return lvgName;
    }


    /**
     * Sets the lvgName value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param lvgName
     */
    public void setLvgName(java.lang.String lvgName) {
        this.lvgName = lvgName;
    }


    /**
     * Gets the gpt value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return gpt
     */
    public java.lang.Boolean getGpt() {
        return gpt;
    }


    /**
     * Sets the gpt value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param gpt
     */
    public void setGpt(java.lang.Boolean gpt) {
        this.gpt = gpt;
    }


    /**
     * Gets the diskSignature value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return diskSignature
     */
    public java.lang.Integer getDiskSignature() {
        return diskSignature;
    }


    /**
     * Sets the diskSignature value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param diskSignature
     */
    public void setDiskSignature(java.lang.Integer diskSignature) {
        this.diskSignature = diskSignature;
    }


    /**
     * Gets the diskGuid value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return diskGuid
     */
    public java.lang.String getDiskGuid() {
        return diskGuid;
    }


    /**
     * Sets the diskGuid value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param diskGuid
     */
    public void setDiskGuid(java.lang.String diskGuid) {
        this.diskGuid = diskGuid;
    }


    /**
     * Gets the volume value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @return volume
     */
    public com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParams[] getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this ConverterAgentHelperConverterHelperParamsTargetDiskParams.
     * 
     * @param volume
     */
    public void setVolume(com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParams[] volume) {
        this.volume = volume;
    }

    public com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParams getVolume(int i) {
        return this.volume[i];
    }

    public void setVolume(int i, com.vmware.converter.ConverterAgentHelperConverterHelperParamsTargetVolumeParams _value) {
        this.volume[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentHelperConverterHelperParamsTargetDiskParams)) return false;
        ConverterAgentHelperConverterHelperParamsTargetDiskParams other = (ConverterAgentHelperConverterHelperParamsTargetDiskParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachPoint==null && other.getAttachPoint()==null) || 
             (this.attachPoint!=null &&
              this.attachPoint.equals(other.getAttachPoint()))) &&
            ((this.sourceBiosNumber==null && other.getSourceBiosNumber()==null) || 
             (this.sourceBiosNumber!=null &&
              this.sourceBiosNumber.equals(other.getSourceBiosNumber()))) &&
            ((this.lvg==null && other.getLvg()==null) || 
             (this.lvg!=null &&
              this.lvg.equals(other.getLvg()))) &&
            ((this.lvgName==null && other.getLvgName()==null) || 
             (this.lvgName!=null &&
              this.lvgName.equals(other.getLvgName()))) &&
            ((this.gpt==null && other.getGpt()==null) || 
             (this.gpt!=null &&
              this.gpt.equals(other.getGpt()))) &&
            ((this.diskSignature==null && other.getDiskSignature()==null) || 
             (this.diskSignature!=null &&
              this.diskSignature.equals(other.getDiskSignature()))) &&
            ((this.diskGuid==null && other.getDiskGuid()==null) || 
             (this.diskGuid!=null &&
              this.diskGuid.equals(other.getDiskGuid()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              java.util.Arrays.equals(this.volume, other.getVolume())));
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
        if (getAttachPoint() != null) {
            _hashCode += getAttachPoint().hashCode();
        }
        if (getSourceBiosNumber() != null) {
            _hashCode += getSourceBiosNumber().hashCode();
        }
        if (getLvg() != null) {
            _hashCode += getLvg().hashCode();
        }
        if (getLvgName() != null) {
            _hashCode += getLvgName().hashCode();
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
        if (getVolume() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolume());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolume(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentHelperConverterHelperParamsTargetDiskParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParamsTargetDiskParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "attachPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskAttachPoint"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceBiosNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceBiosNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("lvgName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lvgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentHelperConverterHelperParamsTargetVolumeParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
