/**
 * ConverterStorageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterStorageInfoDiskInfo[] disk;

    private com.vmware.converter.ConverterStorageInfoVolumeInfo[] volume;

    private com.vmware.converter.ConverterBootConfigInfo bootConfig;

    public ConverterStorageInfo() {
    }

    public ConverterStorageInfo(
           com.vmware.converter.ConverterStorageInfoDiskInfo[] disk,
           com.vmware.converter.ConverterStorageInfoVolumeInfo[] volume,
           com.vmware.converter.ConverterBootConfigInfo bootConfig) {
        this.disk = disk;
        this.volume = volume;
        this.bootConfig = bootConfig;
    }


    /**
     * Gets the disk value for this ConverterStorageInfo.
     * 
     * @return disk
     */
    public com.vmware.converter.ConverterStorageInfoDiskInfo[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this ConverterStorageInfo.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.ConverterStorageInfoDiskInfo[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.ConverterStorageInfoDiskInfo getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.ConverterStorageInfoDiskInfo _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the volume value for this ConverterStorageInfo.
     * 
     * @return volume
     */
    public com.vmware.converter.ConverterStorageInfoVolumeInfo[] getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this ConverterStorageInfo.
     * 
     * @param volume
     */
    public void setVolume(com.vmware.converter.ConverterStorageInfoVolumeInfo[] volume) {
        this.volume = volume;
    }

    public com.vmware.converter.ConverterStorageInfoVolumeInfo getVolume(int i) {
        return this.volume[i];
    }

    public void setVolume(int i, com.vmware.converter.ConverterStorageInfoVolumeInfo _value) {
        this.volume[i] = _value;
    }


    /**
     * Gets the bootConfig value for this ConverterStorageInfo.
     * 
     * @return bootConfig
     */
    public com.vmware.converter.ConverterBootConfigInfo getBootConfig() {
        return bootConfig;
    }


    /**
     * Sets the bootConfig value for this ConverterStorageInfo.
     * 
     * @param bootConfig
     */
    public void setBootConfig(com.vmware.converter.ConverterBootConfigInfo bootConfig) {
        this.bootConfig = bootConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageInfo)) return false;
        ConverterStorageInfo other = (ConverterStorageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              java.util.Arrays.equals(this.volume, other.getVolume()))) &&
            ((this.bootConfig==null && other.getBootConfig()==null) || 
             (this.bootConfig!=null &&
              this.bootConfig.equals(other.getBootConfig())));
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
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getBootConfig() != null) {
            _hashCode += getBootConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoDiskInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfo"));
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
