/**
 * HostVFlashManagerVFlashResourceConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVFlashManagerVFlashResourceConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostVffsVolume vffs;

    private long capacity;

    public HostVFlashManagerVFlashResourceConfigInfo() {
    }

    public HostVFlashManagerVFlashResourceConfigInfo(
           com.vmware.converter.HostVffsVolume vffs,
           long capacity) {
        this.vffs = vffs;
        this.capacity = capacity;
    }


    /**
     * Gets the vffs value for this HostVFlashManagerVFlashResourceConfigInfo.
     * 
     * @return vffs
     */
    public com.vmware.converter.HostVffsVolume getVffs() {
        return vffs;
    }


    /**
     * Sets the vffs value for this HostVFlashManagerVFlashResourceConfigInfo.
     * 
     * @param vffs
     */
    public void setVffs(com.vmware.converter.HostVffsVolume vffs) {
        this.vffs = vffs;
    }


    /**
     * Gets the capacity value for this HostVFlashManagerVFlashResourceConfigInfo.
     * 
     * @return capacity
     */
    public long getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this HostVFlashManagerVFlashResourceConfigInfo.
     * 
     * @param capacity
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVFlashManagerVFlashResourceConfigInfo)) return false;
        HostVFlashManagerVFlashResourceConfigInfo other = (HostVFlashManagerVFlashResourceConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vffs==null && other.getVffs()==null) || 
             (this.vffs!=null &&
              this.vffs.equals(other.getVffs()))) &&
            this.capacity == other.getCapacity();
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
        if (getVffs() != null) {
            _hashCode += getVffs().hashCode();
        }
        _hashCode += new Long(getCapacity()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVFlashManagerVFlashResourceConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashResourceConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vffs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vffs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVffsVolume"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
