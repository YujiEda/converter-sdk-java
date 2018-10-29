/**
 * DatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DatastoreInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String url;

    private long freeSpace;

    private long maxFileSize;

    private java.lang.Long maxVirtualDiskCapacity;

    private java.lang.Long maxMemoryFileSize;

    private java.util.Calendar timestamp;

    private java.lang.String containerId;

    public DatastoreInfo() {
    }

    public DatastoreInfo(
           java.lang.String name,
           java.lang.String url,
           long freeSpace,
           long maxFileSize,
           java.lang.Long maxVirtualDiskCapacity,
           java.lang.Long maxMemoryFileSize,
           java.util.Calendar timestamp,
           java.lang.String containerId) {
        this.name = name;
        this.url = url;
        this.freeSpace = freeSpace;
        this.maxFileSize = maxFileSize;
        this.maxVirtualDiskCapacity = maxVirtualDiskCapacity;
        this.maxMemoryFileSize = maxMemoryFileSize;
        this.timestamp = timestamp;
        this.containerId = containerId;
    }


    /**
     * Gets the name value for this DatastoreInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatastoreInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this DatastoreInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DatastoreInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the freeSpace value for this DatastoreInfo.
     * 
     * @return freeSpace
     */
    public long getFreeSpace() {
        return freeSpace;
    }


    /**
     * Sets the freeSpace value for this DatastoreInfo.
     * 
     * @param freeSpace
     */
    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }


    /**
     * Gets the maxFileSize value for this DatastoreInfo.
     * 
     * @return maxFileSize
     */
    public long getMaxFileSize() {
        return maxFileSize;
    }


    /**
     * Sets the maxFileSize value for this DatastoreInfo.
     * 
     * @param maxFileSize
     */
    public void setMaxFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }


    /**
     * Gets the maxVirtualDiskCapacity value for this DatastoreInfo.
     * 
     * @return maxVirtualDiskCapacity
     */
    public java.lang.Long getMaxVirtualDiskCapacity() {
        return maxVirtualDiskCapacity;
    }


    /**
     * Sets the maxVirtualDiskCapacity value for this DatastoreInfo.
     * 
     * @param maxVirtualDiskCapacity
     */
    public void setMaxVirtualDiskCapacity(java.lang.Long maxVirtualDiskCapacity) {
        this.maxVirtualDiskCapacity = maxVirtualDiskCapacity;
    }


    /**
     * Gets the maxMemoryFileSize value for this DatastoreInfo.
     * 
     * @return maxMemoryFileSize
     */
    public java.lang.Long getMaxMemoryFileSize() {
        return maxMemoryFileSize;
    }


    /**
     * Sets the maxMemoryFileSize value for this DatastoreInfo.
     * 
     * @param maxMemoryFileSize
     */
    public void setMaxMemoryFileSize(java.lang.Long maxMemoryFileSize) {
        this.maxMemoryFileSize = maxMemoryFileSize;
    }


    /**
     * Gets the timestamp value for this DatastoreInfo.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this DatastoreInfo.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the containerId value for this DatastoreInfo.
     * 
     * @return containerId
     */
    public java.lang.String getContainerId() {
        return containerId;
    }


    /**
     * Sets the containerId value for this DatastoreInfo.
     * 
     * @param containerId
     */
    public void setContainerId(java.lang.String containerId) {
        this.containerId = containerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreInfo)) return false;
        DatastoreInfo other = (DatastoreInfo) obj;
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
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            this.freeSpace == other.getFreeSpace() &&
            this.maxFileSize == other.getMaxFileSize() &&
            ((this.maxVirtualDiskCapacity==null && other.getMaxVirtualDiskCapacity()==null) || 
             (this.maxVirtualDiskCapacity!=null &&
              this.maxVirtualDiskCapacity.equals(other.getMaxVirtualDiskCapacity()))) &&
            ((this.maxMemoryFileSize==null && other.getMaxMemoryFileSize()==null) || 
             (this.maxMemoryFileSize!=null &&
              this.maxMemoryFileSize.equals(other.getMaxMemoryFileSize()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.containerId==null && other.getContainerId()==null) || 
             (this.containerId!=null &&
              this.containerId.equals(other.getContainerId())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += new Long(getFreeSpace()).hashCode();
        _hashCode += new Long(getMaxFileSize()).hashCode();
        if (getMaxVirtualDiskCapacity() != null) {
            _hashCode += getMaxVirtualDiskCapacity().hashCode();
        }
        if (getMaxMemoryFileSize() != null) {
            _hashCode += getMaxMemoryFileSize().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getContainerId() != null) {
            _hashCode += getContainerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatastoreInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVirtualDiskCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxVirtualDiskCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemoryFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMemoryFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "containerId"));
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
