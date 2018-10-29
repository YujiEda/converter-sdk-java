/**
 * StoragePodSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StoragePodSummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private long capacity;

    private long freeSpace;

    public StoragePodSummary() {
    }

    public StoragePodSummary(
           java.lang.String name,
           long capacity,
           long freeSpace) {
        this.name = name;
        this.capacity = capacity;
        this.freeSpace = freeSpace;
    }


    /**
     * Gets the name value for this StoragePodSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this StoragePodSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the capacity value for this StoragePodSummary.
     * 
     * @return capacity
     */
    public long getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this StoragePodSummary.
     * 
     * @param capacity
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the freeSpace value for this StoragePodSummary.
     * 
     * @return freeSpace
     */
    public long getFreeSpace() {
        return freeSpace;
    }


    /**
     * Sets the freeSpace value for this StoragePodSummary.
     * 
     * @param freeSpace
     */
    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoragePodSummary)) return false;
        StoragePodSummary other = (StoragePodSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.capacity == other.getCapacity() &&
            this.freeSpace == other.getFreeSpace();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getCapacity()).hashCode();
        _hashCode += new Long(getFreeSpace()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoragePodSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StoragePodSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeSpace"));
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
