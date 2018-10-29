/**
 * HttpNfcLeaseManifestEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HttpNfcLeaseManifestEntry  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String sha1;

    private long size;

    private boolean disk;

    private java.lang.Long capacity;

    private java.lang.Long populatedSize;

    public HttpNfcLeaseManifestEntry() {
    }

    public HttpNfcLeaseManifestEntry(
           java.lang.String key,
           java.lang.String sha1,
           long size,
           boolean disk,
           java.lang.Long capacity,
           java.lang.Long populatedSize) {
        this.key = key;
        this.sha1 = sha1;
        this.size = size;
        this.disk = disk;
        this.capacity = capacity;
        this.populatedSize = populatedSize;
    }


    /**
     * Gets the key value for this HttpNfcLeaseManifestEntry.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HttpNfcLeaseManifestEntry.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the sha1 value for this HttpNfcLeaseManifestEntry.
     * 
     * @return sha1
     */
    public java.lang.String getSha1() {
        return sha1;
    }


    /**
     * Sets the sha1 value for this HttpNfcLeaseManifestEntry.
     * 
     * @param sha1
     */
    public void setSha1(java.lang.String sha1) {
        this.sha1 = sha1;
    }


    /**
     * Gets the size value for this HttpNfcLeaseManifestEntry.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this HttpNfcLeaseManifestEntry.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the disk value for this HttpNfcLeaseManifestEntry.
     * 
     * @return disk
     */
    public boolean isDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this HttpNfcLeaseManifestEntry.
     * 
     * @param disk
     */
    public void setDisk(boolean disk) {
        this.disk = disk;
    }


    /**
     * Gets the capacity value for this HttpNfcLeaseManifestEntry.
     * 
     * @return capacity
     */
    public java.lang.Long getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this HttpNfcLeaseManifestEntry.
     * 
     * @param capacity
     */
    public void setCapacity(java.lang.Long capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the populatedSize value for this HttpNfcLeaseManifestEntry.
     * 
     * @return populatedSize
     */
    public java.lang.Long getPopulatedSize() {
        return populatedSize;
    }


    /**
     * Sets the populatedSize value for this HttpNfcLeaseManifestEntry.
     * 
     * @param populatedSize
     */
    public void setPopulatedSize(java.lang.Long populatedSize) {
        this.populatedSize = populatedSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HttpNfcLeaseManifestEntry)) return false;
        HttpNfcLeaseManifestEntry other = (HttpNfcLeaseManifestEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.sha1==null && other.getSha1()==null) || 
             (this.sha1!=null &&
              this.sha1.equals(other.getSha1()))) &&
            this.size == other.getSize() &&
            this.disk == other.isDisk() &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.populatedSize==null && other.getPopulatedSize()==null) || 
             (this.populatedSize!=null &&
              this.populatedSize.equals(other.getPopulatedSize())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getSha1() != null) {
            _hashCode += getSha1().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        _hashCode += (isDisk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getPopulatedSize() != null) {
            _hashCode += getPopulatedSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HttpNfcLeaseManifestEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseManifestEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sha1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sha1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("populatedSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "populatedSize"));
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
