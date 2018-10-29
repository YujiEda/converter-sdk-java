/**
 * HostScsiDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostScsiDisk  extends com.vmware.converter.ScsiLun  implements java.io.Serializable {
    private com.vmware.converter.HostDiskDimensionsLba capacity;

    private java.lang.String devicePath;

    private java.lang.Boolean ssd;

    private java.lang.Boolean localDisk;

    private java.lang.String[] physicalLocation;

    private java.lang.Boolean emulatedDIXDIFEnabled;

    private com.vmware.converter.VsanHostVsanDiskInfo vsanDiskInfo;

    public HostScsiDisk() {
    }

    public HostScsiDisk(
           java.lang.String deviceName,
           java.lang.String deviceType,
           java.lang.String key,
           java.lang.String uuid,
           com.vmware.converter.ScsiLunDescriptor[] descriptor,
           java.lang.String canonicalName,
           java.lang.String displayName,
           java.lang.String lunType,
           java.lang.String vendor,
           java.lang.String model,
           java.lang.String revision,
           java.lang.Integer scsiLevel,
           java.lang.String serialNumber,
           com.vmware.converter.ScsiLunDurableName durableName,
           com.vmware.converter.ScsiLunDurableName[] alternateName,
           byte[] standardInquiry,
           java.lang.Integer queueDepth,
           java.lang.String[] operationalState,
           com.vmware.converter.ScsiLunCapabilities capabilities,
           java.lang.String vStorageSupport,
           java.lang.Boolean protocolEndpoint,
           com.vmware.converter.HostDiskDimensionsLba capacity,
           java.lang.String devicePath,
           java.lang.Boolean ssd,
           java.lang.Boolean localDisk,
           java.lang.String[] physicalLocation,
           java.lang.Boolean emulatedDIXDIFEnabled,
           com.vmware.converter.VsanHostVsanDiskInfo vsanDiskInfo) {
        super(
            deviceName,
            deviceType,
            key,
            uuid,
            descriptor,
            canonicalName,
            displayName,
            lunType,
            vendor,
            model,
            revision,
            scsiLevel,
            serialNumber,
            durableName,
            alternateName,
            standardInquiry,
            queueDepth,
            operationalState,
            capabilities,
            vStorageSupport,
            protocolEndpoint);
        this.capacity = capacity;
        this.devicePath = devicePath;
        this.ssd = ssd;
        this.localDisk = localDisk;
        this.physicalLocation = physicalLocation;
        this.emulatedDIXDIFEnabled = emulatedDIXDIFEnabled;
        this.vsanDiskInfo = vsanDiskInfo;
    }


    /**
     * Gets the capacity value for this HostScsiDisk.
     * 
     * @return capacity
     */
    public com.vmware.converter.HostDiskDimensionsLba getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this HostScsiDisk.
     * 
     * @param capacity
     */
    public void setCapacity(com.vmware.converter.HostDiskDimensionsLba capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the devicePath value for this HostScsiDisk.
     * 
     * @return devicePath
     */
    public java.lang.String getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this HostScsiDisk.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String devicePath) {
        this.devicePath = devicePath;
    }


    /**
     * Gets the ssd value for this HostScsiDisk.
     * 
     * @return ssd
     */
    public java.lang.Boolean getSsd() {
        return ssd;
    }


    /**
     * Sets the ssd value for this HostScsiDisk.
     * 
     * @param ssd
     */
    public void setSsd(java.lang.Boolean ssd) {
        this.ssd = ssd;
    }


    /**
     * Gets the localDisk value for this HostScsiDisk.
     * 
     * @return localDisk
     */
    public java.lang.Boolean getLocalDisk() {
        return localDisk;
    }


    /**
     * Sets the localDisk value for this HostScsiDisk.
     * 
     * @param localDisk
     */
    public void setLocalDisk(java.lang.Boolean localDisk) {
        this.localDisk = localDisk;
    }


    /**
     * Gets the physicalLocation value for this HostScsiDisk.
     * 
     * @return physicalLocation
     */
    public java.lang.String[] getPhysicalLocation() {
        return physicalLocation;
    }


    /**
     * Sets the physicalLocation value for this HostScsiDisk.
     * 
     * @param physicalLocation
     */
    public void setPhysicalLocation(java.lang.String[] physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public java.lang.String getPhysicalLocation(int i) {
        return this.physicalLocation[i];
    }

    public void setPhysicalLocation(int i, java.lang.String _value) {
        this.physicalLocation[i] = _value;
    }


    /**
     * Gets the emulatedDIXDIFEnabled value for this HostScsiDisk.
     * 
     * @return emulatedDIXDIFEnabled
     */
    public java.lang.Boolean getEmulatedDIXDIFEnabled() {
        return emulatedDIXDIFEnabled;
    }


    /**
     * Sets the emulatedDIXDIFEnabled value for this HostScsiDisk.
     * 
     * @param emulatedDIXDIFEnabled
     */
    public void setEmulatedDIXDIFEnabled(java.lang.Boolean emulatedDIXDIFEnabled) {
        this.emulatedDIXDIFEnabled = emulatedDIXDIFEnabled;
    }


    /**
     * Gets the vsanDiskInfo value for this HostScsiDisk.
     * 
     * @return vsanDiskInfo
     */
    public com.vmware.converter.VsanHostVsanDiskInfo getVsanDiskInfo() {
        return vsanDiskInfo;
    }


    /**
     * Sets the vsanDiskInfo value for this HostScsiDisk.
     * 
     * @param vsanDiskInfo
     */
    public void setVsanDiskInfo(com.vmware.converter.VsanHostVsanDiskInfo vsanDiskInfo) {
        this.vsanDiskInfo = vsanDiskInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostScsiDisk)) return false;
        HostScsiDisk other = (HostScsiDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              this.devicePath.equals(other.getDevicePath()))) &&
            ((this.ssd==null && other.getSsd()==null) || 
             (this.ssd!=null &&
              this.ssd.equals(other.getSsd()))) &&
            ((this.localDisk==null && other.getLocalDisk()==null) || 
             (this.localDisk!=null &&
              this.localDisk.equals(other.getLocalDisk()))) &&
            ((this.physicalLocation==null && other.getPhysicalLocation()==null) || 
             (this.physicalLocation!=null &&
              java.util.Arrays.equals(this.physicalLocation, other.getPhysicalLocation()))) &&
            ((this.emulatedDIXDIFEnabled==null && other.getEmulatedDIXDIFEnabled()==null) || 
             (this.emulatedDIXDIFEnabled!=null &&
              this.emulatedDIXDIFEnabled.equals(other.getEmulatedDIXDIFEnabled()))) &&
            ((this.vsanDiskInfo==null && other.getVsanDiskInfo()==null) || 
             (this.vsanDiskInfo!=null &&
              this.vsanDiskInfo.equals(other.getVsanDiskInfo())));
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
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getDevicePath() != null) {
            _hashCode += getDevicePath().hashCode();
        }
        if (getSsd() != null) {
            _hashCode += getSsd().hashCode();
        }
        if (getLocalDisk() != null) {
            _hashCode += getLocalDisk().hashCode();
        }
        if (getPhysicalLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmulatedDIXDIFEnabled() != null) {
            _hashCode += getEmulatedDIXDIFEnabled().hashCode();
        }
        if (getVsanDiskInfo() != null) {
            _hashCode += getVsanDiskInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostScsiDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskDimensionsLba"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("localDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "physicalLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emulatedDIXDIFEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "emulatedDIXDIFEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanDiskInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanDiskInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostVsanDiskInfo"));
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
