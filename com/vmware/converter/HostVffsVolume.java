/**
 * HostVffsVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVffsVolume  extends com.vmware.converter.HostFileSystemVolume  implements java.io.Serializable {
    private int majorVersion;

    private java.lang.String version;

    private java.lang.String uuid;

    private com.vmware.converter.HostScsiDiskPartition[] extent;

    public HostVffsVolume() {
    }

    public HostVffsVolume(
           java.lang.String type,
           java.lang.String name,
           long capacity,
           int majorVersion,
           java.lang.String version,
           java.lang.String uuid,
           com.vmware.converter.HostScsiDiskPartition[] extent) {
        super(
            type,
            name,
            capacity);
        this.majorVersion = majorVersion;
        this.version = version;
        this.uuid = uuid;
        this.extent = extent;
    }


    /**
     * Gets the majorVersion value for this HostVffsVolume.
     * 
     * @return majorVersion
     */
    public int getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this HostVffsVolume.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the version value for this HostVffsVolume.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this HostVffsVolume.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the uuid value for this HostVffsVolume.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this HostVffsVolume.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the extent value for this HostVffsVolume.
     * 
     * @return extent
     */
    public com.vmware.converter.HostScsiDiskPartition[] getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this HostVffsVolume.
     * 
     * @param extent
     */
    public void setExtent(com.vmware.converter.HostScsiDiskPartition[] extent) {
        this.extent = extent;
    }

    public com.vmware.converter.HostScsiDiskPartition getExtent(int i) {
        return this.extent[i];
    }

    public void setExtent(int i, com.vmware.converter.HostScsiDiskPartition _value) {
        this.extent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVffsVolume)) return false;
        HostVffsVolume other = (HostVffsVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.majorVersion == other.getMajorVersion() &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              java.util.Arrays.equals(this.extent, other.getExtent())));
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
        _hashCode += getMajorVersion();
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getExtent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtent(), i);
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
        new org.apache.axis.description.TypeDesc(HostVffsVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVffsVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDiskPartition"));
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
