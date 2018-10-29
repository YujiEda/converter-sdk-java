/**
 * ConverterComputerOsInfoLogicalVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfoLogicalVolumeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String volumeId;

    private java.lang.String[] mountPoint;

    private com.vmware.converter.ConverterComputerOsInfoVolumeCloneFlags volumeCloneFlags;

    public ConverterComputerOsInfoLogicalVolumeInfo() {
    }

    public ConverterComputerOsInfoLogicalVolumeInfo(
           java.lang.String volumeId,
           java.lang.String[] mountPoint,
           com.vmware.converter.ConverterComputerOsInfoVolumeCloneFlags volumeCloneFlags) {
        this.volumeId = volumeId;
        this.mountPoint = mountPoint;
        this.volumeCloneFlags = volumeCloneFlags;
    }


    /**
     * Gets the volumeId value for this ConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @return volumeId
     */
    public java.lang.String getVolumeId() {
        return volumeId;
    }


    /**
     * Sets the volumeId value for this ConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @param volumeId
     */
    public void setVolumeId(java.lang.String volumeId) {
        this.volumeId = volumeId;
    }


    /**
     * Gets the mountPoint value for this ConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @return mountPoint
     */
    public java.lang.String[] getMountPoint() {
        return mountPoint;
    }


    /**
     * Sets the mountPoint value for this ConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @param mountPoint
     */
    public void setMountPoint(java.lang.String[] mountPoint) {
        this.mountPoint = mountPoint;
    }

    public java.lang.String getMountPoint(int i) {
        return this.mountPoint[i];
    }

    public void setMountPoint(int i, java.lang.String _value) {
        this.mountPoint[i] = _value;
    }


    /**
     * Gets the volumeCloneFlags value for this ConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @return volumeCloneFlags
     */
    public com.vmware.converter.ConverterComputerOsInfoVolumeCloneFlags getVolumeCloneFlags() {
        return volumeCloneFlags;
    }


    /**
     * Sets the volumeCloneFlags value for this ConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @param volumeCloneFlags
     */
    public void setVolumeCloneFlags(com.vmware.converter.ConverterComputerOsInfoVolumeCloneFlags volumeCloneFlags) {
        this.volumeCloneFlags = volumeCloneFlags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerOsInfoLogicalVolumeInfo)) return false;
        ConverterComputerOsInfoLogicalVolumeInfo other = (ConverterComputerOsInfoLogicalVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.volumeId==null && other.getVolumeId()==null) || 
             (this.volumeId!=null &&
              this.volumeId.equals(other.getVolumeId()))) &&
            ((this.mountPoint==null && other.getMountPoint()==null) || 
             (this.mountPoint!=null &&
              java.util.Arrays.equals(this.mountPoint, other.getMountPoint()))) &&
            ((this.volumeCloneFlags==null && other.getVolumeCloneFlags()==null) || 
             (this.volumeCloneFlags!=null &&
              this.volumeCloneFlags.equals(other.getVolumeCloneFlags())));
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
        if (getVolumeId() != null) {
            _hashCode += getVolumeId().hashCode();
        }
        if (getMountPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMountPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMountPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVolumeCloneFlags() != null) {
            _hashCode += getVolumeCloneFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfoLogicalVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoLogicalVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "mountPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeCloneFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumeCloneFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoVolumeCloneFlags"));
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
