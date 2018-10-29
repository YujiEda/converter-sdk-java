/**
 * ReplicationVmProgressInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationVmProgressInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int progress;

    private long bytesTransferred;

    private long bytesToTransfer;

    private java.lang.Long checksumTotalBytes;

    private java.lang.Long checksumComparedBytes;

    public ReplicationVmProgressInfo() {
    }

    public ReplicationVmProgressInfo(
           int progress,
           long bytesTransferred,
           long bytesToTransfer,
           java.lang.Long checksumTotalBytes,
           java.lang.Long checksumComparedBytes) {
        this.progress = progress;
        this.bytesTransferred = bytesTransferred;
        this.bytesToTransfer = bytesToTransfer;
        this.checksumTotalBytes = checksumTotalBytes;
        this.checksumComparedBytes = checksumComparedBytes;
    }


    /**
     * Gets the progress value for this ReplicationVmProgressInfo.
     * 
     * @return progress
     */
    public int getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this ReplicationVmProgressInfo.
     * 
     * @param progress
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }


    /**
     * Gets the bytesTransferred value for this ReplicationVmProgressInfo.
     * 
     * @return bytesTransferred
     */
    public long getBytesTransferred() {
        return bytesTransferred;
    }


    /**
     * Sets the bytesTransferred value for this ReplicationVmProgressInfo.
     * 
     * @param bytesTransferred
     */
    public void setBytesTransferred(long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }


    /**
     * Gets the bytesToTransfer value for this ReplicationVmProgressInfo.
     * 
     * @return bytesToTransfer
     */
    public long getBytesToTransfer() {
        return bytesToTransfer;
    }


    /**
     * Sets the bytesToTransfer value for this ReplicationVmProgressInfo.
     * 
     * @param bytesToTransfer
     */
    public void setBytesToTransfer(long bytesToTransfer) {
        this.bytesToTransfer = bytesToTransfer;
    }


    /**
     * Gets the checksumTotalBytes value for this ReplicationVmProgressInfo.
     * 
     * @return checksumTotalBytes
     */
    public java.lang.Long getChecksumTotalBytes() {
        return checksumTotalBytes;
    }


    /**
     * Sets the checksumTotalBytes value for this ReplicationVmProgressInfo.
     * 
     * @param checksumTotalBytes
     */
    public void setChecksumTotalBytes(java.lang.Long checksumTotalBytes) {
        this.checksumTotalBytes = checksumTotalBytes;
    }


    /**
     * Gets the checksumComparedBytes value for this ReplicationVmProgressInfo.
     * 
     * @return checksumComparedBytes
     */
    public java.lang.Long getChecksumComparedBytes() {
        return checksumComparedBytes;
    }


    /**
     * Sets the checksumComparedBytes value for this ReplicationVmProgressInfo.
     * 
     * @param checksumComparedBytes
     */
    public void setChecksumComparedBytes(java.lang.Long checksumComparedBytes) {
        this.checksumComparedBytes = checksumComparedBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicationVmProgressInfo)) return false;
        ReplicationVmProgressInfo other = (ReplicationVmProgressInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.progress == other.getProgress() &&
            this.bytesTransferred == other.getBytesTransferred() &&
            this.bytesToTransfer == other.getBytesToTransfer() &&
            ((this.checksumTotalBytes==null && other.getChecksumTotalBytes()==null) || 
             (this.checksumTotalBytes!=null &&
              this.checksumTotalBytes.equals(other.getChecksumTotalBytes()))) &&
            ((this.checksumComparedBytes==null && other.getChecksumComparedBytes()==null) || 
             (this.checksumComparedBytes!=null &&
              this.checksumComparedBytes.equals(other.getChecksumComparedBytes())));
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
        _hashCode += getProgress();
        _hashCode += new Long(getBytesTransferred()).hashCode();
        _hashCode += new Long(getBytesToTransfer()).hashCode();
        if (getChecksumTotalBytes() != null) {
            _hashCode += getChecksumTotalBytes().hashCode();
        }
        if (getChecksumComparedBytes() != null) {
            _hashCode += getChecksumComparedBytes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplicationVmProgressInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmProgressInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesTransferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesTransferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesToTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesToTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksumTotalBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checksumTotalBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksumComparedBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checksumComparedBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
