/**
 * ConverterUpdateBootSectorsDiskInfoFailedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterUpdateBootSectorsDiskInfoFailedEvent  extends com.vmware.converter.ConverterEvent  implements java.io.Serializable {
    private java.lang.String diskDeviceNumber;

    private java.lang.String partitionNumber;

    public ConverterUpdateBootSectorsDiskInfoFailedEvent() {
    }

    public ConverterUpdateBootSectorsDiskInfoFailedEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String diskDeviceNumber,
           java.lang.String partitionNumber) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job);
        this.diskDeviceNumber = diskDeviceNumber;
        this.partitionNumber = partitionNumber;
    }


    /**
     * Gets the diskDeviceNumber value for this ConverterUpdateBootSectorsDiskInfoFailedEvent.
     * 
     * @return diskDeviceNumber
     */
    public java.lang.String getDiskDeviceNumber() {
        return diskDeviceNumber;
    }


    /**
     * Sets the diskDeviceNumber value for this ConverterUpdateBootSectorsDiskInfoFailedEvent.
     * 
     * @param diskDeviceNumber
     */
    public void setDiskDeviceNumber(java.lang.String diskDeviceNumber) {
        this.diskDeviceNumber = diskDeviceNumber;
    }


    /**
     * Gets the partitionNumber value for this ConverterUpdateBootSectorsDiskInfoFailedEvent.
     * 
     * @return partitionNumber
     */
    public java.lang.String getPartitionNumber() {
        return partitionNumber;
    }


    /**
     * Sets the partitionNumber value for this ConverterUpdateBootSectorsDiskInfoFailedEvent.
     * 
     * @param partitionNumber
     */
    public void setPartitionNumber(java.lang.String partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterUpdateBootSectorsDiskInfoFailedEvent)) return false;
        ConverterUpdateBootSectorsDiskInfoFailedEvent other = (ConverterUpdateBootSectorsDiskInfoFailedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskDeviceNumber==null && other.getDiskDeviceNumber()==null) || 
             (this.diskDeviceNumber!=null &&
              this.diskDeviceNumber.equals(other.getDiskDeviceNumber()))) &&
            ((this.partitionNumber==null && other.getPartitionNumber()==null) || 
             (this.partitionNumber!=null &&
              this.partitionNumber.equals(other.getPartitionNumber())));
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
        if (getDiskDeviceNumber() != null) {
            _hashCode += getDiskDeviceNumber().hashCode();
        }
        if (getPartitionNumber() != null) {
            _hashCode += getPartitionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterUpdateBootSectorsDiskInfoFailedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterUpdateBootSectorsDiskInfoFailedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskDeviceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskDeviceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "partitionNumber"));
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
