/**
 * VirtualMachineDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineDatastoreInfo  extends com.vmware.converter.VirtualMachineTargetInfo  implements java.io.Serializable {
    private com.vmware.converter.DatastoreSummary datastore;

    private com.vmware.converter.DatastoreCapability capability;

    private long maxFileSize;

    private java.lang.Long maxVirtualDiskCapacity;

    private java.lang.Long maxPhysicalRDMFileSize;

    private java.lang.Long maxVirtualRDMFileSize;

    private java.lang.String mode;

    private java.lang.String vStorageSupport;

    public VirtualMachineDatastoreInfo() {
    }

    public VirtualMachineDatastoreInfo(
           java.lang.String name,
           java.lang.String[] configurationTag,
           com.vmware.converter.DatastoreSummary datastore,
           com.vmware.converter.DatastoreCapability capability,
           long maxFileSize,
           java.lang.Long maxVirtualDiskCapacity,
           java.lang.Long maxPhysicalRDMFileSize,
           java.lang.Long maxVirtualRDMFileSize,
           java.lang.String mode,
           java.lang.String vStorageSupport) {
        super(
            name,
            configurationTag);
        this.datastore = datastore;
        this.capability = capability;
        this.maxFileSize = maxFileSize;
        this.maxVirtualDiskCapacity = maxVirtualDiskCapacity;
        this.maxPhysicalRDMFileSize = maxPhysicalRDMFileSize;
        this.maxVirtualRDMFileSize = maxVirtualRDMFileSize;
        this.mode = mode;
        this.vStorageSupport = vStorageSupport;
    }


    /**
     * Gets the datastore value for this VirtualMachineDatastoreInfo.
     * 
     * @return datastore
     */
    public com.vmware.converter.DatastoreSummary getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this VirtualMachineDatastoreInfo.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.DatastoreSummary datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the capability value for this VirtualMachineDatastoreInfo.
     * 
     * @return capability
     */
    public com.vmware.converter.DatastoreCapability getCapability() {
        return capability;
    }


    /**
     * Sets the capability value for this VirtualMachineDatastoreInfo.
     * 
     * @param capability
     */
    public void setCapability(com.vmware.converter.DatastoreCapability capability) {
        this.capability = capability;
    }


    /**
     * Gets the maxFileSize value for this VirtualMachineDatastoreInfo.
     * 
     * @return maxFileSize
     */
    public long getMaxFileSize() {
        return maxFileSize;
    }


    /**
     * Sets the maxFileSize value for this VirtualMachineDatastoreInfo.
     * 
     * @param maxFileSize
     */
    public void setMaxFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }


    /**
     * Gets the maxVirtualDiskCapacity value for this VirtualMachineDatastoreInfo.
     * 
     * @return maxVirtualDiskCapacity
     */
    public java.lang.Long getMaxVirtualDiskCapacity() {
        return maxVirtualDiskCapacity;
    }


    /**
     * Sets the maxVirtualDiskCapacity value for this VirtualMachineDatastoreInfo.
     * 
     * @param maxVirtualDiskCapacity
     */
    public void setMaxVirtualDiskCapacity(java.lang.Long maxVirtualDiskCapacity) {
        this.maxVirtualDiskCapacity = maxVirtualDiskCapacity;
    }


    /**
     * Gets the maxPhysicalRDMFileSize value for this VirtualMachineDatastoreInfo.
     * 
     * @return maxPhysicalRDMFileSize
     */
    public java.lang.Long getMaxPhysicalRDMFileSize() {
        return maxPhysicalRDMFileSize;
    }


    /**
     * Sets the maxPhysicalRDMFileSize value for this VirtualMachineDatastoreInfo.
     * 
     * @param maxPhysicalRDMFileSize
     */
    public void setMaxPhysicalRDMFileSize(java.lang.Long maxPhysicalRDMFileSize) {
        this.maxPhysicalRDMFileSize = maxPhysicalRDMFileSize;
    }


    /**
     * Gets the maxVirtualRDMFileSize value for this VirtualMachineDatastoreInfo.
     * 
     * @return maxVirtualRDMFileSize
     */
    public java.lang.Long getMaxVirtualRDMFileSize() {
        return maxVirtualRDMFileSize;
    }


    /**
     * Sets the maxVirtualRDMFileSize value for this VirtualMachineDatastoreInfo.
     * 
     * @param maxVirtualRDMFileSize
     */
    public void setMaxVirtualRDMFileSize(java.lang.Long maxVirtualRDMFileSize) {
        this.maxVirtualRDMFileSize = maxVirtualRDMFileSize;
    }


    /**
     * Gets the mode value for this VirtualMachineDatastoreInfo.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this VirtualMachineDatastoreInfo.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the vStorageSupport value for this VirtualMachineDatastoreInfo.
     * 
     * @return vStorageSupport
     */
    public java.lang.String getVStorageSupport() {
        return vStorageSupport;
    }


    /**
     * Sets the vStorageSupport value for this VirtualMachineDatastoreInfo.
     * 
     * @param vStorageSupport
     */
    public void setVStorageSupport(java.lang.String vStorageSupport) {
        this.vStorageSupport = vStorageSupport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineDatastoreInfo)) return false;
        VirtualMachineDatastoreInfo other = (VirtualMachineDatastoreInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.capability==null && other.getCapability()==null) || 
             (this.capability!=null &&
              this.capability.equals(other.getCapability()))) &&
            this.maxFileSize == other.getMaxFileSize() &&
            ((this.maxVirtualDiskCapacity==null && other.getMaxVirtualDiskCapacity()==null) || 
             (this.maxVirtualDiskCapacity!=null &&
              this.maxVirtualDiskCapacity.equals(other.getMaxVirtualDiskCapacity()))) &&
            ((this.maxPhysicalRDMFileSize==null && other.getMaxPhysicalRDMFileSize()==null) || 
             (this.maxPhysicalRDMFileSize!=null &&
              this.maxPhysicalRDMFileSize.equals(other.getMaxPhysicalRDMFileSize()))) &&
            ((this.maxVirtualRDMFileSize==null && other.getMaxVirtualRDMFileSize()==null) || 
             (this.maxVirtualRDMFileSize!=null &&
              this.maxVirtualRDMFileSize.equals(other.getMaxVirtualRDMFileSize()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
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
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getCapability() != null) {
            _hashCode += getCapability().hashCode();
        }
        _hashCode += new Long(getMaxFileSize()).hashCode();
        if (getMaxVirtualDiskCapacity() != null) {
            _hashCode += getMaxVirtualDiskCapacity().hashCode();
        }
        if (getMaxPhysicalRDMFileSize() != null) {
            _hashCode += getMaxPhysicalRDMFileSize().hashCode();
        }
        if (getMaxVirtualRDMFileSize() != null) {
            _hashCode += getMaxVirtualRDMFileSize().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getVStorageSupport() != null) {
            _hashCode += getVStorageSupport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineDatastoreInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDatastoreInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreSummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreCapability"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVirtualDiskCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxVirtualDiskCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
