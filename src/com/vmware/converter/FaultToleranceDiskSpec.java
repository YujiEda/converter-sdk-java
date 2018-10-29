/**
 * FaultToleranceDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FaultToleranceDiskSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualDevice disk;

    private com.vmware.converter.ManagedObjectReference datastore;

    public FaultToleranceDiskSpec() {
    }

    public FaultToleranceDiskSpec(
           com.vmware.converter.VirtualDevice disk,
           com.vmware.converter.ManagedObjectReference datastore) {
        this.disk = disk;
        this.datastore = datastore;
    }


    /**
     * Gets the disk value for this FaultToleranceDiskSpec.
     * 
     * @return disk
     */
    public com.vmware.converter.VirtualDevice getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this FaultToleranceDiskSpec.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.VirtualDevice disk) {
        this.disk = disk;
    }


    /**
     * Gets the datastore value for this FaultToleranceDiskSpec.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this FaultToleranceDiskSpec.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultToleranceDiskSpec)) return false;
        FaultToleranceDiskSpec other = (FaultToleranceDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              this.disk.equals(other.getDisk()))) &&
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
        if (getDisk() != null) {
            _hashCode += getDisk().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultToleranceDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDevice"));
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
