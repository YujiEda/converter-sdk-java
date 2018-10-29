/**
 * DatastoreMountPathDatastorePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DatastoreMountPathDatastorePair  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String oldMountPath;

    private com.vmware.converter.ManagedObjectReference datastore;

    public DatastoreMountPathDatastorePair() {
    }

    public DatastoreMountPathDatastorePair(
           java.lang.String oldMountPath,
           com.vmware.converter.ManagedObjectReference datastore) {
        this.oldMountPath = oldMountPath;
        this.datastore = datastore;
    }


    /**
     * Gets the oldMountPath value for this DatastoreMountPathDatastorePair.
     * 
     * @return oldMountPath
     */
    public java.lang.String getOldMountPath() {
        return oldMountPath;
    }


    /**
     * Sets the oldMountPath value for this DatastoreMountPathDatastorePair.
     * 
     * @param oldMountPath
     */
    public void setOldMountPath(java.lang.String oldMountPath) {
        this.oldMountPath = oldMountPath;
    }


    /**
     * Gets the datastore value for this DatastoreMountPathDatastorePair.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this DatastoreMountPathDatastorePair.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreMountPathDatastorePair)) return false;
        DatastoreMountPathDatastorePair other = (DatastoreMountPathDatastorePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldMountPath==null && other.getOldMountPath()==null) || 
             (this.oldMountPath!=null &&
              this.oldMountPath.equals(other.getOldMountPath()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore())));
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
        if (getOldMountPath() != null) {
            _hashCode += getOldMountPath().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatastoreMountPathDatastorePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreMountPathDatastorePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMountPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldMountPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
