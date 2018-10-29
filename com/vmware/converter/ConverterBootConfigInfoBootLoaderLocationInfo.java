/**
 * ConverterBootConfigInfoBootLoaderLocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBootConfigInfoBootLoaderLocationInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String bootDiskId;

    private java.lang.String activeVolumeId;

    public ConverterBootConfigInfoBootLoaderLocationInfo() {
    }

    public ConverterBootConfigInfoBootLoaderLocationInfo(
           java.lang.String type,
           java.lang.String bootDiskId,
           java.lang.String activeVolumeId) {
        this.type = type;
        this.bootDiskId = bootDiskId;
        this.activeVolumeId = activeVolumeId;
    }


    /**
     * Gets the type value for this ConverterBootConfigInfoBootLoaderLocationInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ConverterBootConfigInfoBootLoaderLocationInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the bootDiskId value for this ConverterBootConfigInfoBootLoaderLocationInfo.
     * 
     * @return bootDiskId
     */
    public java.lang.String getBootDiskId() {
        return bootDiskId;
    }


    /**
     * Sets the bootDiskId value for this ConverterBootConfigInfoBootLoaderLocationInfo.
     * 
     * @param bootDiskId
     */
    public void setBootDiskId(java.lang.String bootDiskId) {
        this.bootDiskId = bootDiskId;
    }


    /**
     * Gets the activeVolumeId value for this ConverterBootConfigInfoBootLoaderLocationInfo.
     * 
     * @return activeVolumeId
     */
    public java.lang.String getActiveVolumeId() {
        return activeVolumeId;
    }


    /**
     * Sets the activeVolumeId value for this ConverterBootConfigInfoBootLoaderLocationInfo.
     * 
     * @param activeVolumeId
     */
    public void setActiveVolumeId(java.lang.String activeVolumeId) {
        this.activeVolumeId = activeVolumeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBootConfigInfoBootLoaderLocationInfo)) return false;
        ConverterBootConfigInfoBootLoaderLocationInfo other = (ConverterBootConfigInfoBootLoaderLocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.bootDiskId==null && other.getBootDiskId()==null) || 
             (this.bootDiskId!=null &&
              this.bootDiskId.equals(other.getBootDiskId()))) &&
            ((this.activeVolumeId==null && other.getActiveVolumeId()==null) || 
             (this.activeVolumeId!=null &&
              this.activeVolumeId.equals(other.getActiveVolumeId())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBootDiskId() != null) {
            _hashCode += getBootDiskId().hashCode();
        }
        if (getActiveVolumeId() != null) {
            _hashCode += getActiveVolumeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterBootConfigInfoBootLoaderLocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderLocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDiskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootDiskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeVolumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "activeVolumeId"));
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
