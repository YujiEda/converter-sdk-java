/**
 * VsanHostVsanDiskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostVsanDiskInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vsanUuid;

    private int formatVersion;

    public VsanHostVsanDiskInfo() {
    }

    public VsanHostVsanDiskInfo(
           java.lang.String vsanUuid,
           int formatVersion) {
        this.vsanUuid = vsanUuid;
        this.formatVersion = formatVersion;
    }


    /**
     * Gets the vsanUuid value for this VsanHostVsanDiskInfo.
     * 
     * @return vsanUuid
     */
    public java.lang.String getVsanUuid() {
        return vsanUuid;
    }


    /**
     * Sets the vsanUuid value for this VsanHostVsanDiskInfo.
     * 
     * @param vsanUuid
     */
    public void setVsanUuid(java.lang.String vsanUuid) {
        this.vsanUuid = vsanUuid;
    }


    /**
     * Gets the formatVersion value for this VsanHostVsanDiskInfo.
     * 
     * @return formatVersion
     */
    public int getFormatVersion() {
        return formatVersion;
    }


    /**
     * Sets the formatVersion value for this VsanHostVsanDiskInfo.
     * 
     * @param formatVersion
     */
    public void setFormatVersion(int formatVersion) {
        this.formatVersion = formatVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostVsanDiskInfo)) return false;
        VsanHostVsanDiskInfo other = (VsanHostVsanDiskInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vsanUuid==null && other.getVsanUuid()==null) || 
             (this.vsanUuid!=null &&
              this.vsanUuid.equals(other.getVsanUuid()))) &&
            this.formatVersion == other.getFormatVersion();
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
        if (getVsanUuid() != null) {
            _hashCode += getVsanUuid().hashCode();
        }
        _hashCode += getFormatVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostVsanDiskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostVsanDiskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "formatVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
