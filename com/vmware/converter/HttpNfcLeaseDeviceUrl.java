/**
 * HttpNfcLeaseDeviceUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HttpNfcLeaseDeviceUrl  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String importKey;

    private java.lang.String url;

    private java.lang.String sslThumbprint;

    private java.lang.Boolean disk;

    private java.lang.String targetId;

    private java.lang.String datastoreKey;

    private java.lang.Long fileSize;

    public HttpNfcLeaseDeviceUrl() {
    }

    public HttpNfcLeaseDeviceUrl(
           java.lang.String key,
           java.lang.String importKey,
           java.lang.String url,
           java.lang.String sslThumbprint,
           java.lang.Boolean disk,
           java.lang.String targetId,
           java.lang.String datastoreKey,
           java.lang.Long fileSize) {
        this.key = key;
        this.importKey = importKey;
        this.url = url;
        this.sslThumbprint = sslThumbprint;
        this.disk = disk;
        this.targetId = targetId;
        this.datastoreKey = datastoreKey;
        this.fileSize = fileSize;
    }


    /**
     * Gets the key value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the importKey value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return importKey
     */
    public java.lang.String getImportKey() {
        return importKey;
    }


    /**
     * Sets the importKey value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param importKey
     */
    public void setImportKey(java.lang.String importKey) {
        this.importKey = importKey;
    }


    /**
     * Gets the url value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the sslThumbprint value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the disk value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return disk
     */
    public java.lang.Boolean getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param disk
     */
    public void setDisk(java.lang.Boolean disk) {
        this.disk = disk;
    }


    /**
     * Gets the targetId value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return targetId
     */
    public java.lang.String getTargetId() {
        return targetId;
    }


    /**
     * Sets the targetId value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param targetId
     */
    public void setTargetId(java.lang.String targetId) {
        this.targetId = targetId;
    }


    /**
     * Gets the datastoreKey value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return datastoreKey
     */
    public java.lang.String getDatastoreKey() {
        return datastoreKey;
    }


    /**
     * Sets the datastoreKey value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param datastoreKey
     */
    public void setDatastoreKey(java.lang.String datastoreKey) {
        this.datastoreKey = datastoreKey;
    }


    /**
     * Gets the fileSize value for this HttpNfcLeaseDeviceUrl.
     * 
     * @return fileSize
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this HttpNfcLeaseDeviceUrl.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HttpNfcLeaseDeviceUrl)) return false;
        HttpNfcLeaseDeviceUrl other = (HttpNfcLeaseDeviceUrl) obj;
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
            ((this.importKey==null && other.getImportKey()==null) || 
             (this.importKey!=null &&
              this.importKey.equals(other.getImportKey()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.sslThumbprint==null && other.getSslThumbprint()==null) || 
             (this.sslThumbprint!=null &&
              this.sslThumbprint.equals(other.getSslThumbprint()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              this.disk.equals(other.getDisk()))) &&
            ((this.targetId==null && other.getTargetId()==null) || 
             (this.targetId!=null &&
              this.targetId.equals(other.getTargetId()))) &&
            ((this.datastoreKey==null && other.getDatastoreKey()==null) || 
             (this.datastoreKey!=null &&
              this.datastoreKey.equals(other.getDatastoreKey()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize())));
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
        if (getImportKey() != null) {
            _hashCode += getImportKey().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getSslThumbprint() != null) {
            _hashCode += getSslThumbprint().hashCode();
        }
        if (getDisk() != null) {
            _hashCode += getDisk().hashCode();
        }
        if (getTargetId() != null) {
            _hashCode += getTargetId().hashCode();
        }
        if (getDatastoreKey() != null) {
            _hashCode += getDatastoreKey().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HttpNfcLeaseDeviceUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HttpNfcLeaseDeviceUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "importKey"));
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
        elemField.setFieldName("sslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileSize"));
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
