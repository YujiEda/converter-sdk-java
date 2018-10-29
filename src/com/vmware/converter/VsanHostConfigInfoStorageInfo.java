/**
 * VsanHostConfigInfoStorageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostConfigInfoStorageInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean autoClaimStorage;

    private com.vmware.converter.VsanHostDiskMapping[] diskMapping;

    private com.vmware.converter.VsanHostDiskMapInfo[] diskMapInfo;

    private java.lang.Boolean checksumEnabled;

    public VsanHostConfigInfoStorageInfo() {
    }

    public VsanHostConfigInfoStorageInfo(
           java.lang.Boolean autoClaimStorage,
           com.vmware.converter.VsanHostDiskMapping[] diskMapping,
           com.vmware.converter.VsanHostDiskMapInfo[] diskMapInfo,
           java.lang.Boolean checksumEnabled) {
        this.autoClaimStorage = autoClaimStorage;
        this.diskMapping = diskMapping;
        this.diskMapInfo = diskMapInfo;
        this.checksumEnabled = checksumEnabled;
    }


    /**
     * Gets the autoClaimStorage value for this VsanHostConfigInfoStorageInfo.
     * 
     * @return autoClaimStorage
     */
    public java.lang.Boolean getAutoClaimStorage() {
        return autoClaimStorage;
    }


    /**
     * Sets the autoClaimStorage value for this VsanHostConfigInfoStorageInfo.
     * 
     * @param autoClaimStorage
     */
    public void setAutoClaimStorage(java.lang.Boolean autoClaimStorage) {
        this.autoClaimStorage = autoClaimStorage;
    }


    /**
     * Gets the diskMapping value for this VsanHostConfigInfoStorageInfo.
     * 
     * @return diskMapping
     */
    public com.vmware.converter.VsanHostDiskMapping[] getDiskMapping() {
        return diskMapping;
    }


    /**
     * Sets the diskMapping value for this VsanHostConfigInfoStorageInfo.
     * 
     * @param diskMapping
     */
    public void setDiskMapping(com.vmware.converter.VsanHostDiskMapping[] diskMapping) {
        this.diskMapping = diskMapping;
    }

    public com.vmware.converter.VsanHostDiskMapping getDiskMapping(int i) {
        return this.diskMapping[i];
    }

    public void setDiskMapping(int i, com.vmware.converter.VsanHostDiskMapping _value) {
        this.diskMapping[i] = _value;
    }


    /**
     * Gets the diskMapInfo value for this VsanHostConfigInfoStorageInfo.
     * 
     * @return diskMapInfo
     */
    public com.vmware.converter.VsanHostDiskMapInfo[] getDiskMapInfo() {
        return diskMapInfo;
    }


    /**
     * Sets the diskMapInfo value for this VsanHostConfigInfoStorageInfo.
     * 
     * @param diskMapInfo
     */
    public void setDiskMapInfo(com.vmware.converter.VsanHostDiskMapInfo[] diskMapInfo) {
        this.diskMapInfo = diskMapInfo;
    }

    public com.vmware.converter.VsanHostDiskMapInfo getDiskMapInfo(int i) {
        return this.diskMapInfo[i];
    }

    public void setDiskMapInfo(int i, com.vmware.converter.VsanHostDiskMapInfo _value) {
        this.diskMapInfo[i] = _value;
    }


    /**
     * Gets the checksumEnabled value for this VsanHostConfigInfoStorageInfo.
     * 
     * @return checksumEnabled
     */
    public java.lang.Boolean getChecksumEnabled() {
        return checksumEnabled;
    }


    /**
     * Sets the checksumEnabled value for this VsanHostConfigInfoStorageInfo.
     * 
     * @param checksumEnabled
     */
    public void setChecksumEnabled(java.lang.Boolean checksumEnabled) {
        this.checksumEnabled = checksumEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostConfigInfoStorageInfo)) return false;
        VsanHostConfigInfoStorageInfo other = (VsanHostConfigInfoStorageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoClaimStorage==null && other.getAutoClaimStorage()==null) || 
             (this.autoClaimStorage!=null &&
              this.autoClaimStorage.equals(other.getAutoClaimStorage()))) &&
            ((this.diskMapping==null && other.getDiskMapping()==null) || 
             (this.diskMapping!=null &&
              java.util.Arrays.equals(this.diskMapping, other.getDiskMapping()))) &&
            ((this.diskMapInfo==null && other.getDiskMapInfo()==null) || 
             (this.diskMapInfo!=null &&
              java.util.Arrays.equals(this.diskMapInfo, other.getDiskMapInfo()))) &&
            ((this.checksumEnabled==null && other.getChecksumEnabled()==null) || 
             (this.checksumEnabled!=null &&
              this.checksumEnabled.equals(other.getChecksumEnabled())));
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
        if (getAutoClaimStorage() != null) {
            _hashCode += getAutoClaimStorage().hashCode();
        }
        if (getDiskMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskMapInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskMapInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskMapInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChecksumEnabled() != null) {
            _hashCode += getChecksumEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostConfigInfoStorageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfoStorageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoClaimStorage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoClaimStorage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMapInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMapInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksumEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checksumEnabled"));
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
