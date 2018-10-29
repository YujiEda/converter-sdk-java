/**
 * DatastoreCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DatastoreCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean directoryHierarchySupported;

    private boolean rawDiskMappingsSupported;

    private boolean perFileThinProvisioningSupported;

    private java.lang.Boolean storageIORMSupported;

    private java.lang.Boolean nativeSnapshotSupported;

    private java.lang.Boolean topLevelDirectoryCreateSupported;

    private java.lang.Boolean seSparseSupported;

    public DatastoreCapability() {
    }

    public DatastoreCapability(
           boolean directoryHierarchySupported,
           boolean rawDiskMappingsSupported,
           boolean perFileThinProvisioningSupported,
           java.lang.Boolean storageIORMSupported,
           java.lang.Boolean nativeSnapshotSupported,
           java.lang.Boolean topLevelDirectoryCreateSupported,
           java.lang.Boolean seSparseSupported) {
        this.directoryHierarchySupported = directoryHierarchySupported;
        this.rawDiskMappingsSupported = rawDiskMappingsSupported;
        this.perFileThinProvisioningSupported = perFileThinProvisioningSupported;
        this.storageIORMSupported = storageIORMSupported;
        this.nativeSnapshotSupported = nativeSnapshotSupported;
        this.topLevelDirectoryCreateSupported = topLevelDirectoryCreateSupported;
        this.seSparseSupported = seSparseSupported;
    }


    /**
     * Gets the directoryHierarchySupported value for this DatastoreCapability.
     * 
     * @return directoryHierarchySupported
     */
    public boolean isDirectoryHierarchySupported() {
        return directoryHierarchySupported;
    }


    /**
     * Sets the directoryHierarchySupported value for this DatastoreCapability.
     * 
     * @param directoryHierarchySupported
     */
    public void setDirectoryHierarchySupported(boolean directoryHierarchySupported) {
        this.directoryHierarchySupported = directoryHierarchySupported;
    }


    /**
     * Gets the rawDiskMappingsSupported value for this DatastoreCapability.
     * 
     * @return rawDiskMappingsSupported
     */
    public boolean isRawDiskMappingsSupported() {
        return rawDiskMappingsSupported;
    }


    /**
     * Sets the rawDiskMappingsSupported value for this DatastoreCapability.
     * 
     * @param rawDiskMappingsSupported
     */
    public void setRawDiskMappingsSupported(boolean rawDiskMappingsSupported) {
        this.rawDiskMappingsSupported = rawDiskMappingsSupported;
    }


    /**
     * Gets the perFileThinProvisioningSupported value for this DatastoreCapability.
     * 
     * @return perFileThinProvisioningSupported
     */
    public boolean isPerFileThinProvisioningSupported() {
        return perFileThinProvisioningSupported;
    }


    /**
     * Sets the perFileThinProvisioningSupported value for this DatastoreCapability.
     * 
     * @param perFileThinProvisioningSupported
     */
    public void setPerFileThinProvisioningSupported(boolean perFileThinProvisioningSupported) {
        this.perFileThinProvisioningSupported = perFileThinProvisioningSupported;
    }


    /**
     * Gets the storageIORMSupported value for this DatastoreCapability.
     * 
     * @return storageIORMSupported
     */
    public java.lang.Boolean getStorageIORMSupported() {
        return storageIORMSupported;
    }


    /**
     * Sets the storageIORMSupported value for this DatastoreCapability.
     * 
     * @param storageIORMSupported
     */
    public void setStorageIORMSupported(java.lang.Boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }


    /**
     * Gets the nativeSnapshotSupported value for this DatastoreCapability.
     * 
     * @return nativeSnapshotSupported
     */
    public java.lang.Boolean getNativeSnapshotSupported() {
        return nativeSnapshotSupported;
    }


    /**
     * Sets the nativeSnapshotSupported value for this DatastoreCapability.
     * 
     * @param nativeSnapshotSupported
     */
    public void setNativeSnapshotSupported(java.lang.Boolean nativeSnapshotSupported) {
        this.nativeSnapshotSupported = nativeSnapshotSupported;
    }


    /**
     * Gets the topLevelDirectoryCreateSupported value for this DatastoreCapability.
     * 
     * @return topLevelDirectoryCreateSupported
     */
    public java.lang.Boolean getTopLevelDirectoryCreateSupported() {
        return topLevelDirectoryCreateSupported;
    }


    /**
     * Sets the topLevelDirectoryCreateSupported value for this DatastoreCapability.
     * 
     * @param topLevelDirectoryCreateSupported
     */
    public void setTopLevelDirectoryCreateSupported(java.lang.Boolean topLevelDirectoryCreateSupported) {
        this.topLevelDirectoryCreateSupported = topLevelDirectoryCreateSupported;
    }


    /**
     * Gets the seSparseSupported value for this DatastoreCapability.
     * 
     * @return seSparseSupported
     */
    public java.lang.Boolean getSeSparseSupported() {
        return seSparseSupported;
    }


    /**
     * Sets the seSparseSupported value for this DatastoreCapability.
     * 
     * @param seSparseSupported
     */
    public void setSeSparseSupported(java.lang.Boolean seSparseSupported) {
        this.seSparseSupported = seSparseSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreCapability)) return false;
        DatastoreCapability other = (DatastoreCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.directoryHierarchySupported == other.isDirectoryHierarchySupported() &&
            this.rawDiskMappingsSupported == other.isRawDiskMappingsSupported() &&
            this.perFileThinProvisioningSupported == other.isPerFileThinProvisioningSupported() &&
            ((this.storageIORMSupported==null && other.getStorageIORMSupported()==null) || 
             (this.storageIORMSupported!=null &&
              this.storageIORMSupported.equals(other.getStorageIORMSupported()))) &&
            ((this.nativeSnapshotSupported==null && other.getNativeSnapshotSupported()==null) || 
             (this.nativeSnapshotSupported!=null &&
              this.nativeSnapshotSupported.equals(other.getNativeSnapshotSupported()))) &&
            ((this.topLevelDirectoryCreateSupported==null && other.getTopLevelDirectoryCreateSupported()==null) || 
             (this.topLevelDirectoryCreateSupported!=null &&
              this.topLevelDirectoryCreateSupported.equals(other.getTopLevelDirectoryCreateSupported()))) &&
            ((this.seSparseSupported==null && other.getSeSparseSupported()==null) || 
             (this.seSparseSupported!=null &&
              this.seSparseSupported.equals(other.getSeSparseSupported())));
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
        _hashCode += (isDirectoryHierarchySupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRawDiskMappingsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPerFileThinProvisioningSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStorageIORMSupported() != null) {
            _hashCode += getStorageIORMSupported().hashCode();
        }
        if (getNativeSnapshotSupported() != null) {
            _hashCode += getNativeSnapshotSupported().hashCode();
        }
        if (getTopLevelDirectoryCreateSupported() != null) {
            _hashCode += getTopLevelDirectoryCreateSupported().hashCode();
        }
        if (getSeSparseSupported() != null) {
            _hashCode += getSeSparseSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatastoreCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryHierarchySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "directoryHierarchySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawDiskMappingsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rawDiskMappingsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perFileThinProvisioningSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perFileThinProvisioningSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageIORMSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageIORMSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeSnapshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nativeSnapshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topLevelDirectoryCreateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "topLevelDirectoryCreateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seSparseSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "seSparseSupported"));
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
