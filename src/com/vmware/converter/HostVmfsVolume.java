/**
 * HostVmfsVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVmfsVolume  extends com.vmware.converter.HostFileSystemVolume  implements java.io.Serializable {
    private int blockSizeMb;

    private int maxBlocks;

    private int majorVersion;

    private java.lang.String version;

    private java.lang.String uuid;

    private com.vmware.converter.HostScsiDiskPartition[] extent;

    private boolean vmfsUpgradable;

    private com.vmware.converter.HostForceMountedInfo forceMountedInfo;

    private java.lang.Boolean ssd;

    private java.lang.Boolean local;

    public HostVmfsVolume() {
    }

    public HostVmfsVolume(
           java.lang.String type,
           java.lang.String name,
           long capacity,
           int blockSizeMb,
           int maxBlocks,
           int majorVersion,
           java.lang.String version,
           java.lang.String uuid,
           com.vmware.converter.HostScsiDiskPartition[] extent,
           boolean vmfsUpgradable,
           com.vmware.converter.HostForceMountedInfo forceMountedInfo,
           java.lang.Boolean ssd,
           java.lang.Boolean local) {
        super(
            type,
            name,
            capacity);
        this.blockSizeMb = blockSizeMb;
        this.maxBlocks = maxBlocks;
        this.majorVersion = majorVersion;
        this.version = version;
        this.uuid = uuid;
        this.extent = extent;
        this.vmfsUpgradable = vmfsUpgradable;
        this.forceMountedInfo = forceMountedInfo;
        this.ssd = ssd;
        this.local = local;
    }


    /**
     * Gets the blockSizeMb value for this HostVmfsVolume.
     * 
     * @return blockSizeMb
     */
    public int getBlockSizeMb() {
        return blockSizeMb;
    }


    /**
     * Sets the blockSizeMb value for this HostVmfsVolume.
     * 
     * @param blockSizeMb
     */
    public void setBlockSizeMb(int blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
    }


    /**
     * Gets the maxBlocks value for this HostVmfsVolume.
     * 
     * @return maxBlocks
     */
    public int getMaxBlocks() {
        return maxBlocks;
    }


    /**
     * Sets the maxBlocks value for this HostVmfsVolume.
     * 
     * @param maxBlocks
     */
    public void setMaxBlocks(int maxBlocks) {
        this.maxBlocks = maxBlocks;
    }


    /**
     * Gets the majorVersion value for this HostVmfsVolume.
     * 
     * @return majorVersion
     */
    public int getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this HostVmfsVolume.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the version value for this HostVmfsVolume.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this HostVmfsVolume.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the uuid value for this HostVmfsVolume.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this HostVmfsVolume.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the extent value for this HostVmfsVolume.
     * 
     * @return extent
     */
    public com.vmware.converter.HostScsiDiskPartition[] getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this HostVmfsVolume.
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


    /**
     * Gets the vmfsUpgradable value for this HostVmfsVolume.
     * 
     * @return vmfsUpgradable
     */
    public boolean isVmfsUpgradable() {
        return vmfsUpgradable;
    }


    /**
     * Sets the vmfsUpgradable value for this HostVmfsVolume.
     * 
     * @param vmfsUpgradable
     */
    public void setVmfsUpgradable(boolean vmfsUpgradable) {
        this.vmfsUpgradable = vmfsUpgradable;
    }


    /**
     * Gets the forceMountedInfo value for this HostVmfsVolume.
     * 
     * @return forceMountedInfo
     */
    public com.vmware.converter.HostForceMountedInfo getForceMountedInfo() {
        return forceMountedInfo;
    }


    /**
     * Sets the forceMountedInfo value for this HostVmfsVolume.
     * 
     * @param forceMountedInfo
     */
    public void setForceMountedInfo(com.vmware.converter.HostForceMountedInfo forceMountedInfo) {
        this.forceMountedInfo = forceMountedInfo;
    }


    /**
     * Gets the ssd value for this HostVmfsVolume.
     * 
     * @return ssd
     */
    public java.lang.Boolean getSsd() {
        return ssd;
    }


    /**
     * Sets the ssd value for this HostVmfsVolume.
     * 
     * @param ssd
     */
    public void setSsd(java.lang.Boolean ssd) {
        this.ssd = ssd;
    }


    /**
     * Gets the local value for this HostVmfsVolume.
     * 
     * @return local
     */
    public java.lang.Boolean getLocal() {
        return local;
    }


    /**
     * Sets the local value for this HostVmfsVolume.
     * 
     * @param local
     */
    public void setLocal(java.lang.Boolean local) {
        this.local = local;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVmfsVolume)) return false;
        HostVmfsVolume other = (HostVmfsVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.blockSizeMb == other.getBlockSizeMb() &&
            this.maxBlocks == other.getMaxBlocks() &&
            this.majorVersion == other.getMajorVersion() &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              java.util.Arrays.equals(this.extent, other.getExtent()))) &&
            this.vmfsUpgradable == other.isVmfsUpgradable() &&
            ((this.forceMountedInfo==null && other.getForceMountedInfo()==null) || 
             (this.forceMountedInfo!=null &&
              this.forceMountedInfo.equals(other.getForceMountedInfo()))) &&
            ((this.ssd==null && other.getSsd()==null) || 
             (this.ssd!=null &&
              this.ssd.equals(other.getSsd()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal())));
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
        _hashCode += getBlockSizeMb();
        _hashCode += getMaxBlocks();
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
        _hashCode += (isVmfsUpgradable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getForceMountedInfo() != null) {
            _hashCode += getForceMountedInfo().hashCode();
        }
        if (getSsd() != null) {
            _hashCode += getSsd().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVmfsVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVmfsVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSizeMb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockSizeMb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfsUpgradable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfsUpgradable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceMountedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "forceMountedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostForceMountedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ssd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "local"));
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
