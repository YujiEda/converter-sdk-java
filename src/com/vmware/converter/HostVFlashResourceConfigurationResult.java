/**
 * HostVFlashResourceConfigurationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVFlashResourceConfigurationResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] devicePath;

    private com.vmware.converter.HostVffsVolume vffs;

    private com.vmware.converter.HostDiskConfigurationResult[] diskConfigurationResult;

    public HostVFlashResourceConfigurationResult() {
    }

    public HostVFlashResourceConfigurationResult(
           java.lang.String[] devicePath,
           com.vmware.converter.HostVffsVolume vffs,
           com.vmware.converter.HostDiskConfigurationResult[] diskConfigurationResult) {
        this.devicePath = devicePath;
        this.vffs = vffs;
        this.diskConfigurationResult = diskConfigurationResult;
    }


    /**
     * Gets the devicePath value for this HostVFlashResourceConfigurationResult.
     * 
     * @return devicePath
     */
    public java.lang.String[] getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this HostVFlashResourceConfigurationResult.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String[] devicePath) {
        this.devicePath = devicePath;
    }

    public java.lang.String getDevicePath(int i) {
        return this.devicePath[i];
    }

    public void setDevicePath(int i, java.lang.String _value) {
        this.devicePath[i] = _value;
    }


    /**
     * Gets the vffs value for this HostVFlashResourceConfigurationResult.
     * 
     * @return vffs
     */
    public com.vmware.converter.HostVffsVolume getVffs() {
        return vffs;
    }


    /**
     * Sets the vffs value for this HostVFlashResourceConfigurationResult.
     * 
     * @param vffs
     */
    public void setVffs(com.vmware.converter.HostVffsVolume vffs) {
        this.vffs = vffs;
    }


    /**
     * Gets the diskConfigurationResult value for this HostVFlashResourceConfigurationResult.
     * 
     * @return diskConfigurationResult
     */
    public com.vmware.converter.HostDiskConfigurationResult[] getDiskConfigurationResult() {
        return diskConfigurationResult;
    }


    /**
     * Sets the diskConfigurationResult value for this HostVFlashResourceConfigurationResult.
     * 
     * @param diskConfigurationResult
     */
    public void setDiskConfigurationResult(com.vmware.converter.HostDiskConfigurationResult[] diskConfigurationResult) {
        this.diskConfigurationResult = diskConfigurationResult;
    }

    public com.vmware.converter.HostDiskConfigurationResult getDiskConfigurationResult(int i) {
        return this.diskConfigurationResult[i];
    }

    public void setDiskConfigurationResult(int i, com.vmware.converter.HostDiskConfigurationResult _value) {
        this.diskConfigurationResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVFlashResourceConfigurationResult)) return false;
        HostVFlashResourceConfigurationResult other = (HostVFlashResourceConfigurationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              java.util.Arrays.equals(this.devicePath, other.getDevicePath()))) &&
            ((this.vffs==null && other.getVffs()==null) || 
             (this.vffs!=null &&
              this.vffs.equals(other.getVffs()))) &&
            ((this.diskConfigurationResult==null && other.getDiskConfigurationResult()==null) || 
             (this.diskConfigurationResult!=null &&
              java.util.Arrays.equals(this.diskConfigurationResult, other.getDiskConfigurationResult())));
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
        if (getDevicePath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevicePath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevicePath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVffs() != null) {
            _hashCode += getVffs().hashCode();
        }
        if (getDiskConfigurationResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskConfigurationResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskConfigurationResult(), i);
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
        new org.apache.axis.description.TypeDesc(HostVFlashResourceConfigurationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashResourceConfigurationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vffs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vffs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVffsVolume"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskConfigurationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskConfigurationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskConfigurationResult"));
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
