/**
 * HostVffsSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVffsSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String devicePath;

    private com.vmware.converter.HostDiskPartitionSpec partition;

    private int majorVersion;

    private java.lang.String volumeName;

    public HostVffsSpec() {
    }

    public HostVffsSpec(
           java.lang.String devicePath,
           com.vmware.converter.HostDiskPartitionSpec partition,
           int majorVersion,
           java.lang.String volumeName) {
        this.devicePath = devicePath;
        this.partition = partition;
        this.majorVersion = majorVersion;
        this.volumeName = volumeName;
    }


    /**
     * Gets the devicePath value for this HostVffsSpec.
     * 
     * @return devicePath
     */
    public java.lang.String getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this HostVffsSpec.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String devicePath) {
        this.devicePath = devicePath;
    }


    /**
     * Gets the partition value for this HostVffsSpec.
     * 
     * @return partition
     */
    public com.vmware.converter.HostDiskPartitionSpec getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this HostVffsSpec.
     * 
     * @param partition
     */
    public void setPartition(com.vmware.converter.HostDiskPartitionSpec partition) {
        this.partition = partition;
    }


    /**
     * Gets the majorVersion value for this HostVffsSpec.
     * 
     * @return majorVersion
     */
    public int getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this HostVffsSpec.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the volumeName value for this HostVffsSpec.
     * 
     * @return volumeName
     */
    public java.lang.String getVolumeName() {
        return volumeName;
    }


    /**
     * Sets the volumeName value for this HostVffsSpec.
     * 
     * @param volumeName
     */
    public void setVolumeName(java.lang.String volumeName) {
        this.volumeName = volumeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVffsSpec)) return false;
        HostVffsSpec other = (HostVffsSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              this.devicePath.equals(other.getDevicePath()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            this.majorVersion == other.getMajorVersion() &&
            ((this.volumeName==null && other.getVolumeName()==null) || 
             (this.volumeName!=null &&
              this.volumeName.equals(other.getVolumeName())));
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
        if (getDevicePath() != null) {
            _hashCode += getDevicePath().hashCode();
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        _hashCode += getMajorVersion();
        if (getVolumeName() != null) {
            _hashCode += getVolumeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVffsSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVffsSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "volumeName"));
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
