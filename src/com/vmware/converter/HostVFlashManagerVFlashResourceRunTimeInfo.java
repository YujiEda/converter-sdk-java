/**
 * HostVFlashManagerVFlashResourceRunTimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVFlashManagerVFlashResourceRunTimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long usage;

    private long capacity;

    private boolean accessible;

    private long capacityForVmCache;

    private long freeForVmCache;

    public HostVFlashManagerVFlashResourceRunTimeInfo() {
    }

    public HostVFlashManagerVFlashResourceRunTimeInfo(
           long usage,
           long capacity,
           boolean accessible,
           long capacityForVmCache,
           long freeForVmCache) {
        this.usage = usage;
        this.capacity = capacity;
        this.accessible = accessible;
        this.capacityForVmCache = capacityForVmCache;
        this.freeForVmCache = freeForVmCache;
    }


    /**
     * Gets the usage value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @return usage
     */
    public long getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @param usage
     */
    public void setUsage(long usage) {
        this.usage = usage;
    }


    /**
     * Gets the capacity value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @return capacity
     */
    public long getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @param capacity
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the accessible value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @return accessible
     */
    public boolean isAccessible() {
        return accessible;
    }


    /**
     * Sets the accessible value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @param accessible
     */
    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }


    /**
     * Gets the capacityForVmCache value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @return capacityForVmCache
     */
    public long getCapacityForVmCache() {
        return capacityForVmCache;
    }


    /**
     * Sets the capacityForVmCache value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @param capacityForVmCache
     */
    public void setCapacityForVmCache(long capacityForVmCache) {
        this.capacityForVmCache = capacityForVmCache;
    }


    /**
     * Gets the freeForVmCache value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @return freeForVmCache
     */
    public long getFreeForVmCache() {
        return freeForVmCache;
    }


    /**
     * Sets the freeForVmCache value for this HostVFlashManagerVFlashResourceRunTimeInfo.
     * 
     * @param freeForVmCache
     */
    public void setFreeForVmCache(long freeForVmCache) {
        this.freeForVmCache = freeForVmCache;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVFlashManagerVFlashResourceRunTimeInfo)) return false;
        HostVFlashManagerVFlashResourceRunTimeInfo other = (HostVFlashManagerVFlashResourceRunTimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.usage == other.getUsage() &&
            this.capacity == other.getCapacity() &&
            this.accessible == other.isAccessible() &&
            this.capacityForVmCache == other.getCapacityForVmCache() &&
            this.freeForVmCache == other.getFreeForVmCache();
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
        _hashCode += new Long(getUsage()).hashCode();
        _hashCode += new Long(getCapacity()).hashCode();
        _hashCode += (isAccessible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCapacityForVmCache()).hashCode();
        _hashCode += new Long(getFreeForVmCache()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVFlashManagerVFlashResourceRunTimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashResourceRunTimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityForVmCache");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityForVmCache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeForVmCache");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeForVmCache"));
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
