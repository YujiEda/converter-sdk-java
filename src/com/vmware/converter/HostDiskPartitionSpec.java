/**
 * HostDiskPartitionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostDiskPartitionSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String partitionFormat;

    private com.vmware.converter.HostDiskDimensionsChs chs;

    private java.lang.Long totalSectors;

    private com.vmware.converter.HostDiskPartitionAttributes[] partition;

    public HostDiskPartitionSpec() {
    }

    public HostDiskPartitionSpec(
           java.lang.String partitionFormat,
           com.vmware.converter.HostDiskDimensionsChs chs,
           java.lang.Long totalSectors,
           com.vmware.converter.HostDiskPartitionAttributes[] partition) {
        this.partitionFormat = partitionFormat;
        this.chs = chs;
        this.totalSectors = totalSectors;
        this.partition = partition;
    }


    /**
     * Gets the partitionFormat value for this HostDiskPartitionSpec.
     * 
     * @return partitionFormat
     */
    public java.lang.String getPartitionFormat() {
        return partitionFormat;
    }


    /**
     * Sets the partitionFormat value for this HostDiskPartitionSpec.
     * 
     * @param partitionFormat
     */
    public void setPartitionFormat(java.lang.String partitionFormat) {
        this.partitionFormat = partitionFormat;
    }


    /**
     * Gets the chs value for this HostDiskPartitionSpec.
     * 
     * @return chs
     */
    public com.vmware.converter.HostDiskDimensionsChs getChs() {
        return chs;
    }


    /**
     * Sets the chs value for this HostDiskPartitionSpec.
     * 
     * @param chs
     */
    public void setChs(com.vmware.converter.HostDiskDimensionsChs chs) {
        this.chs = chs;
    }


    /**
     * Gets the totalSectors value for this HostDiskPartitionSpec.
     * 
     * @return totalSectors
     */
    public java.lang.Long getTotalSectors() {
        return totalSectors;
    }


    /**
     * Sets the totalSectors value for this HostDiskPartitionSpec.
     * 
     * @param totalSectors
     */
    public void setTotalSectors(java.lang.Long totalSectors) {
        this.totalSectors = totalSectors;
    }


    /**
     * Gets the partition value for this HostDiskPartitionSpec.
     * 
     * @return partition
     */
    public com.vmware.converter.HostDiskPartitionAttributes[] getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this HostDiskPartitionSpec.
     * 
     * @param partition
     */
    public void setPartition(com.vmware.converter.HostDiskPartitionAttributes[] partition) {
        this.partition = partition;
    }

    public com.vmware.converter.HostDiskPartitionAttributes getPartition(int i) {
        return this.partition[i];
    }

    public void setPartition(int i, com.vmware.converter.HostDiskPartitionAttributes _value) {
        this.partition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiskPartitionSpec)) return false;
        HostDiskPartitionSpec other = (HostDiskPartitionSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitionFormat==null && other.getPartitionFormat()==null) || 
             (this.partitionFormat!=null &&
              this.partitionFormat.equals(other.getPartitionFormat()))) &&
            ((this.chs==null && other.getChs()==null) || 
             (this.chs!=null &&
              this.chs.equals(other.getChs()))) &&
            ((this.totalSectors==null && other.getTotalSectors()==null) || 
             (this.totalSectors!=null &&
              this.totalSectors.equals(other.getTotalSectors()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              java.util.Arrays.equals(this.partition, other.getPartition())));
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
        if (getPartitionFormat() != null) {
            _hashCode += getPartitionFormat().hashCode();
        }
        if (getChs() != null) {
            _hashCode += getChs().hashCode();
        }
        if (getTotalSectors() != null) {
            _hashCode += getTotalSectors().hashCode();
        }
        if (getPartition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartition(), i);
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
        new org.apache.axis.description.TypeDesc(HostDiskPartitionSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partitionFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskDimensionsChs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSectors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalSectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionAttributes"));
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
