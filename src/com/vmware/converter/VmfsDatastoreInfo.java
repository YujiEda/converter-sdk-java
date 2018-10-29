/**
 * VmfsDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmfsDatastoreInfo  extends com.vmware.converter.DatastoreInfo  implements java.io.Serializable {
    private java.lang.Long maxPhysicalRDMFileSize;

    private java.lang.Long maxVirtualRDMFileSize;

    private com.vmware.converter.HostVmfsVolume vmfs;

    public VmfsDatastoreInfo() {
    }

    public VmfsDatastoreInfo(
           java.lang.String name,
           java.lang.String url,
           long freeSpace,
           long maxFileSize,
           java.lang.Long maxVirtualDiskCapacity,
           java.lang.Long maxMemoryFileSize,
           java.util.Calendar timestamp,
           java.lang.String containerId,
           java.lang.Long maxPhysicalRDMFileSize,
           java.lang.Long maxVirtualRDMFileSize,
           com.vmware.converter.HostVmfsVolume vmfs) {
        super(
            name,
            url,
            freeSpace,
            maxFileSize,
            maxVirtualDiskCapacity,
            maxMemoryFileSize,
            timestamp,
            containerId);
        this.maxPhysicalRDMFileSize = maxPhysicalRDMFileSize;
        this.maxVirtualRDMFileSize = maxVirtualRDMFileSize;
        this.vmfs = vmfs;
    }


    /**
     * Gets the maxPhysicalRDMFileSize value for this VmfsDatastoreInfo.
     * 
     * @return maxPhysicalRDMFileSize
     */
    public java.lang.Long getMaxPhysicalRDMFileSize() {
        return maxPhysicalRDMFileSize;
    }


    /**
     * Sets the maxPhysicalRDMFileSize value for this VmfsDatastoreInfo.
     * 
     * @param maxPhysicalRDMFileSize
     */
    public void setMaxPhysicalRDMFileSize(java.lang.Long maxPhysicalRDMFileSize) {
        this.maxPhysicalRDMFileSize = maxPhysicalRDMFileSize;
    }


    /**
     * Gets the maxVirtualRDMFileSize value for this VmfsDatastoreInfo.
     * 
     * @return maxVirtualRDMFileSize
     */
    public java.lang.Long getMaxVirtualRDMFileSize() {
        return maxVirtualRDMFileSize;
    }


    /**
     * Sets the maxVirtualRDMFileSize value for this VmfsDatastoreInfo.
     * 
     * @param maxVirtualRDMFileSize
     */
    public void setMaxVirtualRDMFileSize(java.lang.Long maxVirtualRDMFileSize) {
        this.maxVirtualRDMFileSize = maxVirtualRDMFileSize;
    }


    /**
     * Gets the vmfs value for this VmfsDatastoreInfo.
     * 
     * @return vmfs
     */
    public com.vmware.converter.HostVmfsVolume getVmfs() {
        return vmfs;
    }


    /**
     * Sets the vmfs value for this VmfsDatastoreInfo.
     * 
     * @param vmfs
     */
    public void setVmfs(com.vmware.converter.HostVmfsVolume vmfs) {
        this.vmfs = vmfs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmfsDatastoreInfo)) return false;
        VmfsDatastoreInfo other = (VmfsDatastoreInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxPhysicalRDMFileSize==null && other.getMaxPhysicalRDMFileSize()==null) || 
             (this.maxPhysicalRDMFileSize!=null &&
              this.maxPhysicalRDMFileSize.equals(other.getMaxPhysicalRDMFileSize()))) &&
            ((this.maxVirtualRDMFileSize==null && other.getMaxVirtualRDMFileSize()==null) || 
             (this.maxVirtualRDMFileSize!=null &&
              this.maxVirtualRDMFileSize.equals(other.getMaxVirtualRDMFileSize()))) &&
            ((this.vmfs==null && other.getVmfs()==null) || 
             (this.vmfs!=null &&
              this.vmfs.equals(other.getVmfs())));
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
        if (getMaxPhysicalRDMFileSize() != null) {
            _hashCode += getMaxPhysicalRDMFileSize().hashCode();
        }
        if (getMaxVirtualRDMFileSize() != null) {
            _hashCode += getMaxVirtualRDMFileSize().hashCode();
        }
        if (getVmfs() != null) {
            _hashCode += getVmfs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmfsDatastoreInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPhysicalRDMFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxPhysicalRDMFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVirtualRDMFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxVirtualRDMFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVmfsVolume"));
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
