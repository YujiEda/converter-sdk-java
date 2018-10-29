/**
 * VirtualMachineRelocateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineRelocateSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ServiceLocator service;

    private com.vmware.converter.ManagedObjectReference folder;

    private com.vmware.converter.ManagedObjectReference datastore;

    private java.lang.String diskMoveType;

    private com.vmware.converter.ManagedObjectReference pool;

    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.VirtualMachineRelocateSpecDiskLocator[] disk;

    private com.vmware.converter.VirtualMachineRelocateTransformation transform;

    private com.vmware.converter.VirtualDeviceConfigSpec[] deviceChange;

    private com.vmware.converter.VirtualMachineProfileSpec[] profile;

    public VirtualMachineRelocateSpec() {
    }

    public VirtualMachineRelocateSpec(
           com.vmware.converter.ServiceLocator service,
           com.vmware.converter.ManagedObjectReference folder,
           com.vmware.converter.ManagedObjectReference datastore,
           java.lang.String diskMoveType,
           com.vmware.converter.ManagedObjectReference pool,
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.VirtualMachineRelocateSpecDiskLocator[] disk,
           com.vmware.converter.VirtualMachineRelocateTransformation transform,
           com.vmware.converter.VirtualDeviceConfigSpec[] deviceChange,
           com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.service = service;
        this.folder = folder;
        this.datastore = datastore;
        this.diskMoveType = diskMoveType;
        this.pool = pool;
        this.host = host;
        this.disk = disk;
        this.transform = transform;
        this.deviceChange = deviceChange;
        this.profile = profile;
    }


    /**
     * Gets the service value for this VirtualMachineRelocateSpec.
     * 
     * @return service
     */
    public com.vmware.converter.ServiceLocator getService() {
        return service;
    }


    /**
     * Sets the service value for this VirtualMachineRelocateSpec.
     * 
     * @param service
     */
    public void setService(com.vmware.converter.ServiceLocator service) {
        this.service = service;
    }


    /**
     * Gets the folder value for this VirtualMachineRelocateSpec.
     * 
     * @return folder
     */
    public com.vmware.converter.ManagedObjectReference getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this VirtualMachineRelocateSpec.
     * 
     * @param folder
     */
    public void setFolder(com.vmware.converter.ManagedObjectReference folder) {
        this.folder = folder;
    }


    /**
     * Gets the datastore value for this VirtualMachineRelocateSpec.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this VirtualMachineRelocateSpec.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the diskMoveType value for this VirtualMachineRelocateSpec.
     * 
     * @return diskMoveType
     */
    public java.lang.String getDiskMoveType() {
        return diskMoveType;
    }


    /**
     * Sets the diskMoveType value for this VirtualMachineRelocateSpec.
     * 
     * @param diskMoveType
     */
    public void setDiskMoveType(java.lang.String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }


    /**
     * Gets the pool value for this VirtualMachineRelocateSpec.
     * 
     * @return pool
     */
    public com.vmware.converter.ManagedObjectReference getPool() {
        return pool;
    }


    /**
     * Sets the pool value for this VirtualMachineRelocateSpec.
     * 
     * @param pool
     */
    public void setPool(com.vmware.converter.ManagedObjectReference pool) {
        this.pool = pool;
    }


    /**
     * Gets the host value for this VirtualMachineRelocateSpec.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this VirtualMachineRelocateSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the disk value for this VirtualMachineRelocateSpec.
     * 
     * @return disk
     */
    public com.vmware.converter.VirtualMachineRelocateSpecDiskLocator[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VirtualMachineRelocateSpec.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.VirtualMachineRelocateSpecDiskLocator[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.VirtualMachineRelocateSpecDiskLocator getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.VirtualMachineRelocateSpecDiskLocator _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the transform value for this VirtualMachineRelocateSpec.
     * 
     * @return transform
     */
    public com.vmware.converter.VirtualMachineRelocateTransformation getTransform() {
        return transform;
    }


    /**
     * Sets the transform value for this VirtualMachineRelocateSpec.
     * 
     * @param transform
     */
    public void setTransform(com.vmware.converter.VirtualMachineRelocateTransformation transform) {
        this.transform = transform;
    }


    /**
     * Gets the deviceChange value for this VirtualMachineRelocateSpec.
     * 
     * @return deviceChange
     */
    public com.vmware.converter.VirtualDeviceConfigSpec[] getDeviceChange() {
        return deviceChange;
    }


    /**
     * Sets the deviceChange value for this VirtualMachineRelocateSpec.
     * 
     * @param deviceChange
     */
    public void setDeviceChange(com.vmware.converter.VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public com.vmware.converter.VirtualDeviceConfigSpec getDeviceChange(int i) {
        return this.deviceChange[i];
    }

    public void setDeviceChange(int i, com.vmware.converter.VirtualDeviceConfigSpec _value) {
        this.deviceChange[i] = _value;
    }


    /**
     * Gets the profile value for this VirtualMachineRelocateSpec.
     * 
     * @return profile
     */
    public com.vmware.converter.VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this VirtualMachineRelocateSpec.
     * 
     * @param profile
     */
    public void setProfile(com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public com.vmware.converter.VirtualMachineProfileSpec getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, com.vmware.converter.VirtualMachineProfileSpec _value) {
        this.profile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineRelocateSpec)) return false;
        VirtualMachineRelocateSpec other = (VirtualMachineRelocateSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.diskMoveType==null && other.getDiskMoveType()==null) || 
             (this.diskMoveType!=null &&
              this.diskMoveType.equals(other.getDiskMoveType()))) &&
            ((this.pool==null && other.getPool()==null) || 
             (this.pool!=null &&
              this.pool.equals(other.getPool()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.transform==null && other.getTransform()==null) || 
             (this.transform!=null &&
              this.transform.equals(other.getTransform()))) &&
            ((this.deviceChange==null && other.getDeviceChange()==null) || 
             (this.deviceChange!=null &&
              java.util.Arrays.equals(this.deviceChange, other.getDeviceChange()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile())));
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
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getDiskMoveType() != null) {
            _hashCode += getDiskMoveType().hashCode();
        }
        if (getPool() != null) {
            _hashCode += getPool().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransform() != null) {
            _hashCode += getTransform().hashCode();
        }
        if (getDeviceChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineRelocateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceLocator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMoveType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMoveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpecDiskLocator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transform");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "transform"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateTransformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineProfileSpec"));
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
