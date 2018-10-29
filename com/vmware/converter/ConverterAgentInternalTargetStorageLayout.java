/**
 * ConverterAgentInternalTargetStorageLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalTargetStorageLayout  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean diskToDiskMigration;

    private com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetDiskInfo[] disks;

    private com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] volumes;

    private java.lang.String targetProductVersion;

    public ConverterAgentInternalTargetStorageLayout() {
    }

    public ConverterAgentInternalTargetStorageLayout(
           boolean diskToDiskMigration,
           com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetDiskInfo[] disks,
           com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] volumes,
           java.lang.String targetProductVersion) {
        this.diskToDiskMigration = diskToDiskMigration;
        this.disks = disks;
        this.volumes = volumes;
        this.targetProductVersion = targetProductVersion;
    }


    /**
     * Gets the diskToDiskMigration value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @return diskToDiskMigration
     */
    public boolean isDiskToDiskMigration() {
        return diskToDiskMigration;
    }


    /**
     * Sets the diskToDiskMigration value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @param diskToDiskMigration
     */
    public void setDiskToDiskMigration(boolean diskToDiskMigration) {
        this.diskToDiskMigration = diskToDiskMigration;
    }


    /**
     * Gets the disks value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @return disks
     */
    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetDiskInfo[] getDisks() {
        return disks;
    }


    /**
     * Sets the disks value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @param disks
     */
    public void setDisks(com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetDiskInfo[] disks) {
        this.disks = disks;
    }

    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetDiskInfo getDisks(int i) {
        return this.disks[i];
    }

    public void setDisks(int i, com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetDiskInfo _value) {
        this.disks[i] = _value;
    }


    /**
     * Gets the volumes value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @return volumes
     */
    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] getVolumes() {
        return volumes;
    }


    /**
     * Sets the volumes value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @param volumes
     */
    public void setVolumes(com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] volumes) {
        this.volumes = volumes;
    }

    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo getVolumes(int i) {
        return this.volumes[i];
    }

    public void setVolumes(int i, com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo _value) {
        this.volumes[i] = _value;
    }


    /**
     * Gets the targetProductVersion value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @return targetProductVersion
     */
    public java.lang.String getTargetProductVersion() {
        return targetProductVersion;
    }


    /**
     * Sets the targetProductVersion value for this ConverterAgentInternalTargetStorageLayout.
     * 
     * @param targetProductVersion
     */
    public void setTargetProductVersion(java.lang.String targetProductVersion) {
        this.targetProductVersion = targetProductVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalTargetStorageLayout)) return false;
        ConverterAgentInternalTargetStorageLayout other = (ConverterAgentInternalTargetStorageLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.diskToDiskMigration == other.isDiskToDiskMigration() &&
            ((this.disks==null && other.getDisks()==null) || 
             (this.disks!=null &&
              java.util.Arrays.equals(this.disks, other.getDisks()))) &&
            ((this.volumes==null && other.getVolumes()==null) || 
             (this.volumes!=null &&
              java.util.Arrays.equals(this.volumes, other.getVolumes()))) &&
            ((this.targetProductVersion==null && other.getTargetProductVersion()==null) || 
             (this.targetProductVersion!=null &&
              this.targetProductVersion.equals(other.getTargetProductVersion())));
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
        _hashCode += (isDiskToDiskMigration() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDisks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVolumes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolumes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolumes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetProductVersion() != null) {
            _hashCode += getTargetProductVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalTargetStorageLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskToDiskMigration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskToDiskMigration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "disks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutTargetDiskInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "volumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetProductVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
