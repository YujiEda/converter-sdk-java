/**
 * HostFileSystemVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFileSystemVolumeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] volumeTypeList;

    private com.vmware.converter.HostFileSystemMountInfo[] mountInfo;

    public HostFileSystemVolumeInfo() {
    }

    public HostFileSystemVolumeInfo(
           java.lang.String[] volumeTypeList,
           com.vmware.converter.HostFileSystemMountInfo[] mountInfo) {
        this.volumeTypeList = volumeTypeList;
        this.mountInfo = mountInfo;
    }


    /**
     * Gets the volumeTypeList value for this HostFileSystemVolumeInfo.
     * 
     * @return volumeTypeList
     */
    public java.lang.String[] getVolumeTypeList() {
        return volumeTypeList;
    }


    /**
     * Sets the volumeTypeList value for this HostFileSystemVolumeInfo.
     * 
     * @param volumeTypeList
     */
    public void setVolumeTypeList(java.lang.String[] volumeTypeList) {
        this.volumeTypeList = volumeTypeList;
    }

    public java.lang.String getVolumeTypeList(int i) {
        return this.volumeTypeList[i];
    }

    public void setVolumeTypeList(int i, java.lang.String _value) {
        this.volumeTypeList[i] = _value;
    }


    /**
     * Gets the mountInfo value for this HostFileSystemVolumeInfo.
     * 
     * @return mountInfo
     */
    public com.vmware.converter.HostFileSystemMountInfo[] getMountInfo() {
        return mountInfo;
    }


    /**
     * Sets the mountInfo value for this HostFileSystemVolumeInfo.
     * 
     * @param mountInfo
     */
    public void setMountInfo(com.vmware.converter.HostFileSystemMountInfo[] mountInfo) {
        this.mountInfo = mountInfo;
    }

    public com.vmware.converter.HostFileSystemMountInfo getMountInfo(int i) {
        return this.mountInfo[i];
    }

    public void setMountInfo(int i, com.vmware.converter.HostFileSystemMountInfo _value) {
        this.mountInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFileSystemVolumeInfo)) return false;
        HostFileSystemVolumeInfo other = (HostFileSystemVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.volumeTypeList==null && other.getVolumeTypeList()==null) || 
             (this.volumeTypeList!=null &&
              java.util.Arrays.equals(this.volumeTypeList, other.getVolumeTypeList()))) &&
            ((this.mountInfo==null && other.getMountInfo()==null) || 
             (this.mountInfo!=null &&
              java.util.Arrays.equals(this.mountInfo, other.getMountInfo())));
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
        if (getVolumeTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolumeTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolumeTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMountInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMountInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMountInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostFileSystemVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "volumeTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemMountInfo"));
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
