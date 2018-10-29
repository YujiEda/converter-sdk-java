/**
 * VirtualDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDisk  extends com.vmware.converter.VirtualDevice  implements java.io.Serializable {
    private long capacityInKB;

    private java.lang.Long capacityInBytes;

    private com.vmware.converter.SharesInfo shares;

    private com.vmware.converter.StorageIOAllocationInfo storageIOAllocation;

    private java.lang.String diskObjectId;

    private com.vmware.converter.VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;

    private java.lang.String[] iofilter;

    public VirtualDisk() {
    }

    public VirtualDisk(
           int key,
           com.vmware.converter.Description deviceInfo,
           com.vmware.converter.VirtualDeviceBackingInfo backing,
           com.vmware.converter.VirtualDeviceConnectInfo connectable,
           com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           long capacityInKB,
           java.lang.Long capacityInBytes,
           com.vmware.converter.SharesInfo shares,
           com.vmware.converter.StorageIOAllocationInfo storageIOAllocation,
           java.lang.String diskObjectId,
           com.vmware.converter.VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo,
           java.lang.String[] iofilter) {
        super(
            key,
            deviceInfo,
            backing,
            connectable,
            slotInfo,
            controllerKey,
            unitNumber);
        this.capacityInKB = capacityInKB;
        this.capacityInBytes = capacityInBytes;
        this.shares = shares;
        this.storageIOAllocation = storageIOAllocation;
        this.diskObjectId = diskObjectId;
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
        this.iofilter = iofilter;
    }


    /**
     * Gets the capacityInKB value for this VirtualDisk.
     * 
     * @return capacityInKB
     */
    public long getCapacityInKB() {
        return capacityInKB;
    }


    /**
     * Sets the capacityInKB value for this VirtualDisk.
     * 
     * @param capacityInKB
     */
    public void setCapacityInKB(long capacityInKB) {
        this.capacityInKB = capacityInKB;
    }


    /**
     * Gets the capacityInBytes value for this VirtualDisk.
     * 
     * @return capacityInBytes
     */
    public java.lang.Long getCapacityInBytes() {
        return capacityInBytes;
    }


    /**
     * Sets the capacityInBytes value for this VirtualDisk.
     * 
     * @param capacityInBytes
     */
    public void setCapacityInBytes(java.lang.Long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }


    /**
     * Gets the shares value for this VirtualDisk.
     * 
     * @return shares
     */
    public com.vmware.converter.SharesInfo getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this VirtualDisk.
     * 
     * @param shares
     */
    public void setShares(com.vmware.converter.SharesInfo shares) {
        this.shares = shares;
    }


    /**
     * Gets the storageIOAllocation value for this VirtualDisk.
     * 
     * @return storageIOAllocation
     */
    public com.vmware.converter.StorageIOAllocationInfo getStorageIOAllocation() {
        return storageIOAllocation;
    }


    /**
     * Sets the storageIOAllocation value for this VirtualDisk.
     * 
     * @param storageIOAllocation
     */
    public void setStorageIOAllocation(com.vmware.converter.StorageIOAllocationInfo storageIOAllocation) {
        this.storageIOAllocation = storageIOAllocation;
    }


    /**
     * Gets the diskObjectId value for this VirtualDisk.
     * 
     * @return diskObjectId
     */
    public java.lang.String getDiskObjectId() {
        return diskObjectId;
    }


    /**
     * Sets the diskObjectId value for this VirtualDisk.
     * 
     * @param diskObjectId
     */
    public void setDiskObjectId(java.lang.String diskObjectId) {
        this.diskObjectId = diskObjectId;
    }


    /**
     * Gets the vFlashCacheConfigInfo value for this VirtualDisk.
     * 
     * @return vFlashCacheConfigInfo
     */
    public com.vmware.converter.VirtualDiskVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }


    /**
     * Sets the vFlashCacheConfigInfo value for this VirtualDisk.
     * 
     * @param vFlashCacheConfigInfo
     */
    public void setVFlashCacheConfigInfo(com.vmware.converter.VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }


    /**
     * Gets the iofilter value for this VirtualDisk.
     * 
     * @return iofilter
     */
    public java.lang.String[] getIofilter() {
        return iofilter;
    }


    /**
     * Sets the iofilter value for this VirtualDisk.
     * 
     * @param iofilter
     */
    public void setIofilter(java.lang.String[] iofilter) {
        this.iofilter = iofilter;
    }

    public java.lang.String getIofilter(int i) {
        return this.iofilter[i];
    }

    public void setIofilter(int i, java.lang.String _value) {
        this.iofilter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDisk)) return false;
        VirtualDisk other = (VirtualDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.capacityInKB == other.getCapacityInKB() &&
            ((this.capacityInBytes==null && other.getCapacityInBytes()==null) || 
             (this.capacityInBytes!=null &&
              this.capacityInBytes.equals(other.getCapacityInBytes()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.storageIOAllocation==null && other.getStorageIOAllocation()==null) || 
             (this.storageIOAllocation!=null &&
              this.storageIOAllocation.equals(other.getStorageIOAllocation()))) &&
            ((this.diskObjectId==null && other.getDiskObjectId()==null) || 
             (this.diskObjectId!=null &&
              this.diskObjectId.equals(other.getDiskObjectId()))) &&
            ((this.vFlashCacheConfigInfo==null && other.getVFlashCacheConfigInfo()==null) || 
             (this.vFlashCacheConfigInfo!=null &&
              this.vFlashCacheConfigInfo.equals(other.getVFlashCacheConfigInfo()))) &&
            ((this.iofilter==null && other.getIofilter()==null) || 
             (this.iofilter!=null &&
              java.util.Arrays.equals(this.iofilter, other.getIofilter())));
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
        _hashCode += new Long(getCapacityInKB()).hashCode();
        if (getCapacityInBytes() != null) {
            _hashCode += getCapacityInBytes().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getStorageIOAllocation() != null) {
            _hashCode += getStorageIOAllocation().hashCode();
        }
        if (getDiskObjectId() != null) {
            _hashCode += getDiskObjectId().hashCode();
        }
        if (getVFlashCacheConfigInfo() != null) {
            _hashCode += getVFlashCacheConfigInfo().hashCode();
        }
        if (getIofilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIofilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIofilter(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityInBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageIOAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageIOAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageIOAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashCacheConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashCacheConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskVFlashCacheConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iofilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iofilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
