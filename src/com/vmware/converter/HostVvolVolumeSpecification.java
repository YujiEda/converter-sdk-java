/**
 * HostVvolVolumeSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVvolVolumeSpecification  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long maxSizeInMB;

    private java.lang.String volumeName;

    private com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo;

    private com.vmware.converter.VASAStorageArray[] storageArray;

    private java.lang.String uuid;

    public HostVvolVolumeSpecification() {
    }

    public HostVvolVolumeSpecification(
           long maxSizeInMB,
           java.lang.String volumeName,
           com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo,
           com.vmware.converter.VASAStorageArray[] storageArray,
           java.lang.String uuid) {
        this.maxSizeInMB = maxSizeInMB;
        this.volumeName = volumeName;
        this.vasaProviderInfo = vasaProviderInfo;
        this.storageArray = storageArray;
        this.uuid = uuid;
    }


    /**
     * Gets the maxSizeInMB value for this HostVvolVolumeSpecification.
     * 
     * @return maxSizeInMB
     */
    public long getMaxSizeInMB() {
        return maxSizeInMB;
    }


    /**
     * Sets the maxSizeInMB value for this HostVvolVolumeSpecification.
     * 
     * @param maxSizeInMB
     */
    public void setMaxSizeInMB(long maxSizeInMB) {
        this.maxSizeInMB = maxSizeInMB;
    }


    /**
     * Gets the volumeName value for this HostVvolVolumeSpecification.
     * 
     * @return volumeName
     */
    public java.lang.String getVolumeName() {
        return volumeName;
    }


    /**
     * Sets the volumeName value for this HostVvolVolumeSpecification.
     * 
     * @param volumeName
     */
    public void setVolumeName(java.lang.String volumeName) {
        this.volumeName = volumeName;
    }


    /**
     * Gets the vasaProviderInfo value for this HostVvolVolumeSpecification.
     * 
     * @return vasaProviderInfo
     */
    public com.vmware.converter.VimVasaProviderInfo[] getVasaProviderInfo() {
        return vasaProviderInfo;
    }


    /**
     * Sets the vasaProviderInfo value for this HostVvolVolumeSpecification.
     * 
     * @param vasaProviderInfo
     */
    public void setVasaProviderInfo(com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }

    public com.vmware.converter.VimVasaProviderInfo getVasaProviderInfo(int i) {
        return this.vasaProviderInfo[i];
    }

    public void setVasaProviderInfo(int i, com.vmware.converter.VimVasaProviderInfo _value) {
        this.vasaProviderInfo[i] = _value;
    }


    /**
     * Gets the storageArray value for this HostVvolVolumeSpecification.
     * 
     * @return storageArray
     */
    public com.vmware.converter.VASAStorageArray[] getStorageArray() {
        return storageArray;
    }


    /**
     * Sets the storageArray value for this HostVvolVolumeSpecification.
     * 
     * @param storageArray
     */
    public void setStorageArray(com.vmware.converter.VASAStorageArray[] storageArray) {
        this.storageArray = storageArray;
    }

    public com.vmware.converter.VASAStorageArray getStorageArray(int i) {
        return this.storageArray[i];
    }

    public void setStorageArray(int i, com.vmware.converter.VASAStorageArray _value) {
        this.storageArray[i] = _value;
    }


    /**
     * Gets the uuid value for this HostVvolVolumeSpecification.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this HostVvolVolumeSpecification.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVvolVolumeSpecification)) return false;
        HostVvolVolumeSpecification other = (HostVvolVolumeSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.maxSizeInMB == other.getMaxSizeInMB() &&
            ((this.volumeName==null && other.getVolumeName()==null) || 
             (this.volumeName!=null &&
              this.volumeName.equals(other.getVolumeName()))) &&
            ((this.vasaProviderInfo==null && other.getVasaProviderInfo()==null) || 
             (this.vasaProviderInfo!=null &&
              java.util.Arrays.equals(this.vasaProviderInfo, other.getVasaProviderInfo()))) &&
            ((this.storageArray==null && other.getStorageArray()==null) || 
             (this.storageArray!=null &&
              java.util.Arrays.equals(this.storageArray, other.getStorageArray()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        _hashCode += new Long(getMaxSizeInMB()).hashCode();
        if (getVolumeName() != null) {
            _hashCode += getVolumeName().hashCode();
        }
        if (getVasaProviderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVasaProviderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVasaProviderInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStorageArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorageArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorageArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVvolVolumeSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVvolVolumeSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSizeInMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSizeInMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "volumeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vasaProviderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vasaProviderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VASAStorageArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
