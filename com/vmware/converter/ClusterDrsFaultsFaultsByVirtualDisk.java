/**
 * ClusterDrsFaultsFaultsByVirtualDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDrsFaultsFaultsByVirtualDisk  extends com.vmware.converter.ClusterDrsFaultsFaultsByVm  implements java.io.Serializable {
    private com.vmware.converter.VirtualDiskId disk;

    public ClusterDrsFaultsFaultsByVirtualDisk() {
    }

    public ClusterDrsFaultsFaultsByVirtualDisk(
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.LocalizedMethodFault[] fault,
           com.vmware.converter.VirtualDiskId disk) {
        super(
            vm,
            fault);
        this.disk = disk;
    }


    /**
     * Gets the disk value for this ClusterDrsFaultsFaultsByVirtualDisk.
     * 
     * @return disk
     */
    public com.vmware.converter.VirtualDiskId getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this ClusterDrsFaultsFaultsByVirtualDisk.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.VirtualDiskId disk) {
        this.disk = disk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDrsFaultsFaultsByVirtualDisk)) return false;
        ClusterDrsFaultsFaultsByVirtualDisk other = (ClusterDrsFaultsFaultsByVirtualDisk) obj;
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
              this.disk.equals(other.getDisk())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDrsFaultsFaultsByVirtualDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaultsFaultsByVirtualDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskId"));
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
