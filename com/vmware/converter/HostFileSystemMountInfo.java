/**
 * HostFileSystemMountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFileSystemMountInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostMountInfo mountInfo;

    private com.vmware.converter.HostFileSystemVolume volume;

    private java.lang.String vStorageSupport;

    public HostFileSystemMountInfo() {
    }

    public HostFileSystemMountInfo(
           com.vmware.converter.HostMountInfo mountInfo,
           com.vmware.converter.HostFileSystemVolume volume,
           java.lang.String vStorageSupport) {
        this.mountInfo = mountInfo;
        this.volume = volume;
        this.vStorageSupport = vStorageSupport;
    }


    /**
     * Gets the mountInfo value for this HostFileSystemMountInfo.
     * 
     * @return mountInfo
     */
    public com.vmware.converter.HostMountInfo getMountInfo() {
        return mountInfo;
    }


    /**
     * Sets the mountInfo value for this HostFileSystemMountInfo.
     * 
     * @param mountInfo
     */
    public void setMountInfo(com.vmware.converter.HostMountInfo mountInfo) {
        this.mountInfo = mountInfo;
    }


    /**
     * Gets the volume value for this HostFileSystemMountInfo.
     * 
     * @return volume
     */
    public com.vmware.converter.HostFileSystemVolume getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this HostFileSystemMountInfo.
     * 
     * @param volume
     */
    public void setVolume(com.vmware.converter.HostFileSystemVolume volume) {
        this.volume = volume;
    }


    /**
     * Gets the vStorageSupport value for this HostFileSystemMountInfo.
     * 
     * @return vStorageSupport
     */
    public java.lang.String getVStorageSupport() {
        return vStorageSupport;
    }


    /**
     * Sets the vStorageSupport value for this HostFileSystemMountInfo.
     * 
     * @param vStorageSupport
     */
    public void setVStorageSupport(java.lang.String vStorageSupport) {
        this.vStorageSupport = vStorageSupport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFileSystemMountInfo)) return false;
        HostFileSystemMountInfo other = (HostFileSystemMountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mountInfo==null && other.getMountInfo()==null) || 
             (this.mountInfo!=null &&
              this.mountInfo.equals(other.getMountInfo()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.vStorageSupport==null && other.getVStorageSupport()==null) || 
             (this.vStorageSupport!=null &&
              this.vStorageSupport.equals(other.getVStorageSupport())));
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
        if (getMountInfo() != null) {
            _hashCode += getMountInfo().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getVStorageSupport() != null) {
            _hashCode += getVStorageSupport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFileSystemMountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemMountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMountInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemVolume"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VStorageSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vStorageSupport"));
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
