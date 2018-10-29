/**
 * VvolDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VvolDatastoreInfo  extends com.vmware.converter.DatastoreInfo  implements java.io.Serializable {
    private com.vmware.converter.HostVvolVolume vvolDS;

    public VvolDatastoreInfo() {
    }

    public VvolDatastoreInfo(
           java.lang.String name,
           java.lang.String url,
           long freeSpace,
           long maxFileSize,
           java.lang.Long maxVirtualDiskCapacity,
           java.lang.Long maxMemoryFileSize,
           java.util.Calendar timestamp,
           java.lang.String containerId,
           com.vmware.converter.HostVvolVolume vvolDS) {
        super(
            name,
            url,
            freeSpace,
            maxFileSize,
            maxVirtualDiskCapacity,
            maxMemoryFileSize,
            timestamp,
            containerId);
        this.vvolDS = vvolDS;
    }


    /**
     * Gets the vvolDS value for this VvolDatastoreInfo.
     * 
     * @return vvolDS
     */
    public com.vmware.converter.HostVvolVolume getVvolDS() {
        return vvolDS;
    }


    /**
     * Sets the vvolDS value for this VvolDatastoreInfo.
     * 
     * @param vvolDS
     */
    public void setVvolDS(com.vmware.converter.HostVvolVolume vvolDS) {
        this.vvolDS = vvolDS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VvolDatastoreInfo)) return false;
        VvolDatastoreInfo other = (VvolDatastoreInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vvolDS==null && other.getVvolDS()==null) || 
             (this.vvolDS!=null &&
              this.vvolDS.equals(other.getVvolDS())));
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
        if (getVvolDS() != null) {
            _hashCode += getVvolDS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VvolDatastoreInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VvolDatastoreInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vvolDS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vvolDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVvolVolume"));
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
