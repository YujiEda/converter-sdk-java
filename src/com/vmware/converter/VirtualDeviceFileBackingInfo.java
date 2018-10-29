/**
 * VirtualDeviceFileBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDeviceFileBackingInfo  extends com.vmware.converter.VirtualDeviceBackingInfo  implements java.io.Serializable {
    private java.lang.String fileName;

    private com.vmware.converter.ManagedObjectReference datastore;

    private java.lang.String backingObjectId;

    public VirtualDeviceFileBackingInfo() {
    }

    public VirtualDeviceFileBackingInfo(
           java.lang.String fileName,
           com.vmware.converter.ManagedObjectReference datastore,
           java.lang.String backingObjectId) {
        this.fileName = fileName;
        this.datastore = datastore;
        this.backingObjectId = backingObjectId;
    }


    /**
     * Gets the fileName value for this VirtualDeviceFileBackingInfo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this VirtualDeviceFileBackingInfo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the datastore value for this VirtualDeviceFileBackingInfo.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this VirtualDeviceFileBackingInfo.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the backingObjectId value for this VirtualDeviceFileBackingInfo.
     * 
     * @return backingObjectId
     */
    public java.lang.String getBackingObjectId() {
        return backingObjectId;
    }


    /**
     * Sets the backingObjectId value for this VirtualDeviceFileBackingInfo.
     * 
     * @param backingObjectId
     */
    public void setBackingObjectId(java.lang.String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDeviceFileBackingInfo)) return false;
        VirtualDeviceFileBackingInfo other = (VirtualDeviceFileBackingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.backingObjectId==null && other.getBackingObjectId()==null) || 
             (this.backingObjectId!=null &&
              this.backingObjectId.equals(other.getBackingObjectId())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getBackingObjectId() != null) {
            _hashCode += getBackingObjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDeviceFileBackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceFileBackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("backingObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backingObjectId"));
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
