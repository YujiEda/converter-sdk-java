/**
 * ConverterStorageInfoDiskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageInfoDiskInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String diskId;

    private long capacityInBytes;

    private java.lang.Long diskUsageInBytes;

    private java.lang.Integer biosNumber;

    private java.lang.Boolean lvg;

    private java.lang.String lvgName;

    private java.lang.Boolean gpt;

    private java.lang.Integer signature;

    private java.lang.String diskGuid;

    public ConverterStorageInfoDiskInfo() {
    }

    public ConverterStorageInfoDiskInfo(
           java.lang.String diskId,
           long capacityInBytes,
           java.lang.Long diskUsageInBytes,
           java.lang.Integer biosNumber,
           java.lang.Boolean lvg,
           java.lang.String lvgName,
           java.lang.Boolean gpt,
           java.lang.Integer signature,
           java.lang.String diskGuid) {
        this.diskId = diskId;
        this.capacityInBytes = capacityInBytes;
        this.diskUsageInBytes = diskUsageInBytes;
        this.biosNumber = biosNumber;
        this.lvg = lvg;
        this.lvgName = lvgName;
        this.gpt = gpt;
        this.signature = signature;
        this.diskGuid = diskGuid;
    }


    /**
     * Gets the diskId value for this ConverterStorageInfoDiskInfo.
     * 
     * @return diskId
     */
    public java.lang.String getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this ConverterStorageInfoDiskInfo.
     * 
     * @param diskId
     */
    public void setDiskId(java.lang.String diskId) {
        this.diskId = diskId;
    }


    /**
     * Gets the capacityInBytes value for this ConverterStorageInfoDiskInfo.
     * 
     * @return capacityInBytes
     */
    public long getCapacityInBytes() {
        return capacityInBytes;
    }


    /**
     * Sets the capacityInBytes value for this ConverterStorageInfoDiskInfo.
     * 
     * @param capacityInBytes
     */
    public void setCapacityInBytes(long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }


    /**
     * Gets the diskUsageInBytes value for this ConverterStorageInfoDiskInfo.
     * 
     * @return diskUsageInBytes
     */
    public java.lang.Long getDiskUsageInBytes() {
        return diskUsageInBytes;
    }


    /**
     * Sets the diskUsageInBytes value for this ConverterStorageInfoDiskInfo.
     * 
     * @param diskUsageInBytes
     */
    public void setDiskUsageInBytes(java.lang.Long diskUsageInBytes) {
        this.diskUsageInBytes = diskUsageInBytes;
    }


    /**
     * Gets the biosNumber value for this ConverterStorageInfoDiskInfo.
     * 
     * @return biosNumber
     */
    public java.lang.Integer getBiosNumber() {
        return biosNumber;
    }


    /**
     * Sets the biosNumber value for this ConverterStorageInfoDiskInfo.
     * 
     * @param biosNumber
     */
    public void setBiosNumber(java.lang.Integer biosNumber) {
        this.biosNumber = biosNumber;
    }


    /**
     * Gets the lvg value for this ConverterStorageInfoDiskInfo.
     * 
     * @return lvg
     */
    public java.lang.Boolean getLvg() {
        return lvg;
    }


    /**
     * Sets the lvg value for this ConverterStorageInfoDiskInfo.
     * 
     * @param lvg
     */
    public void setLvg(java.lang.Boolean lvg) {
        this.lvg = lvg;
    }


    /**
     * Gets the lvgName value for this ConverterStorageInfoDiskInfo.
     * 
     * @return lvgName
     */
    public java.lang.String getLvgName() {
        return lvgName;
    }


    /**
     * Sets the lvgName value for this ConverterStorageInfoDiskInfo.
     * 
     * @param lvgName
     */
    public void setLvgName(java.lang.String lvgName) {
        this.lvgName = lvgName;
    }


    /**
     * Gets the gpt value for this ConverterStorageInfoDiskInfo.
     * 
     * @return gpt
     */
    public java.lang.Boolean getGpt() {
        return gpt;
    }


    /**
     * Sets the gpt value for this ConverterStorageInfoDiskInfo.
     * 
     * @param gpt
     */
    public void setGpt(java.lang.Boolean gpt) {
        this.gpt = gpt;
    }


    /**
     * Gets the signature value for this ConverterStorageInfoDiskInfo.
     * 
     * @return signature
     */
    public java.lang.Integer getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ConverterStorageInfoDiskInfo.
     * 
     * @param signature
     */
    public void setSignature(java.lang.Integer signature) {
        this.signature = signature;
    }


    /**
     * Gets the diskGuid value for this ConverterStorageInfoDiskInfo.
     * 
     * @return diskGuid
     */
    public java.lang.String getDiskGuid() {
        return diskGuid;
    }


    /**
     * Sets the diskGuid value for this ConverterStorageInfoDiskInfo.
     * 
     * @param diskGuid
     */
    public void setDiskGuid(java.lang.String diskGuid) {
        this.diskGuid = diskGuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageInfoDiskInfo)) return false;
        ConverterStorageInfoDiskInfo other = (ConverterStorageInfoDiskInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskId==null && other.getDiskId()==null) || 
             (this.diskId!=null &&
              this.diskId.equals(other.getDiskId()))) &&
            this.capacityInBytes == other.getCapacityInBytes() &&
            ((this.diskUsageInBytes==null && other.getDiskUsageInBytes()==null) || 
             (this.diskUsageInBytes!=null &&
              this.diskUsageInBytes.equals(other.getDiskUsageInBytes()))) &&
            ((this.biosNumber==null && other.getBiosNumber()==null) || 
             (this.biosNumber!=null &&
              this.biosNumber.equals(other.getBiosNumber()))) &&
            ((this.lvg==null && other.getLvg()==null) || 
             (this.lvg!=null &&
              this.lvg.equals(other.getLvg()))) &&
            ((this.lvgName==null && other.getLvgName()==null) || 
             (this.lvgName!=null &&
              this.lvgName.equals(other.getLvgName()))) &&
            ((this.gpt==null && other.getGpt()==null) || 
             (this.gpt!=null &&
              this.gpt.equals(other.getGpt()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
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
        if (getDiskId() != null) {
            _hashCode += getDiskId().hashCode();
        }
        _hashCode += new Long(getCapacityInBytes()).hashCode();
        if (getDiskUsageInBytes() != null) {
            _hashCode += getDiskUsageInBytes().hashCode();
        }
        if (getBiosNumber() != null) {
            _hashCode += getBiosNumber().hashCode();
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
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getDiskGuid() != null) {
            _hashCode += getDiskGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageInfoDiskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoDiskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "capacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskUsageInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskUsageInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biosNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "biosNumber"));
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
