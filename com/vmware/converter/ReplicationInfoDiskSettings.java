/**
 * ReplicationInfoDiskSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationInfoDiskSettings  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int key;

    private java.lang.String diskReplicationId;

    public ReplicationInfoDiskSettings() {
    }

    public ReplicationInfoDiskSettings(
           int key,
           java.lang.String diskReplicationId) {
        this.key = key;
        this.diskReplicationId = diskReplicationId;
    }


    /**
     * Gets the key value for this ReplicationInfoDiskSettings.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this ReplicationInfoDiskSettings.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the diskReplicationId value for this ReplicationInfoDiskSettings.
     * 
     * @return diskReplicationId
     */
    public java.lang.String getDiskReplicationId() {
        return diskReplicationId;
    }


    /**
     * Sets the diskReplicationId value for this ReplicationInfoDiskSettings.
     * 
     * @param diskReplicationId
     */
    public void setDiskReplicationId(java.lang.String diskReplicationId) {
        this.diskReplicationId = diskReplicationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicationInfoDiskSettings)) return false;
        ReplicationInfoDiskSettings other = (ReplicationInfoDiskSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            ((this.diskReplicationId==null && other.getDiskReplicationId()==null) || 
             (this.diskReplicationId!=null &&
              this.diskReplicationId.equals(other.getDiskReplicationId())));
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
        _hashCode += getKey();
        if (getDiskReplicationId() != null) {
            _hashCode += getDiskReplicationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplicationInfoDiskSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationInfoDiskSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskReplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskReplicationId"));
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
