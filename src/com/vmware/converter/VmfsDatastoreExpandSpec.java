/**
 * VmfsDatastoreExpandSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmfsDatastoreExpandSpec  extends com.vmware.converter.VmfsDatastoreSpec  implements java.io.Serializable {
    private com.vmware.converter.HostDiskPartitionSpec partition;

    private com.vmware.converter.HostScsiDiskPartition extent;

    public VmfsDatastoreExpandSpec() {
    }

    public VmfsDatastoreExpandSpec(
           java.lang.String diskUuid,
           com.vmware.converter.HostDiskPartitionSpec partition,
           com.vmware.converter.HostScsiDiskPartition extent) {
        super(
            diskUuid);
        this.partition = partition;
        this.extent = extent;
    }


    /**
     * Gets the partition value for this VmfsDatastoreExpandSpec.
     * 
     * @return partition
     */
    public com.vmware.converter.HostDiskPartitionSpec getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this VmfsDatastoreExpandSpec.
     * 
     * @param partition
     */
    public void setPartition(com.vmware.converter.HostDiskPartitionSpec partition) {
        this.partition = partition;
    }


    /**
     * Gets the extent value for this VmfsDatastoreExpandSpec.
     * 
     * @return extent
     */
    public com.vmware.converter.HostScsiDiskPartition getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this VmfsDatastoreExpandSpec.
     * 
     * @param extent
     */
    public void setExtent(com.vmware.converter.HostScsiDiskPartition extent) {
        this.extent = extent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmfsDatastoreExpandSpec)) return false;
        VmfsDatastoreExpandSpec other = (VmfsDatastoreExpandSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              this.extent.equals(other.getExtent())));
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
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getExtent() != null) {
            _hashCode += getExtent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmfsDatastoreExpandSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreExpandSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDiskPartition"));
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
