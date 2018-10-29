/**
 * ConverterDiagnosticManagerTaskLogBundleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDiagnosticManagerTaskLogBundleInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.util.Calendar timeCreated;

    private com.vmware.converter.ConverterDiagnosticManagerBundleFormat format;

    private com.vmware.converter.ConverterDiagnosticManagerBundleContent[] content;

    private long size;

    private int crc;

    public ConverterDiagnosticManagerTaskLogBundleInfo() {
    }

    public ConverterDiagnosticManagerTaskLogBundleInfo(
           java.lang.String key,
           java.util.Calendar timeCreated,
           com.vmware.converter.ConverterDiagnosticManagerBundleFormat format,
           com.vmware.converter.ConverterDiagnosticManagerBundleContent[] content,
           long size,
           int crc) {
        this.key = key;
        this.timeCreated = timeCreated;
        this.format = format;
        this.content = content;
        this.size = size;
        this.crc = crc;
    }


    /**
     * Gets the key value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the timeCreated value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @return timeCreated
     */
    public java.util.Calendar getTimeCreated() {
        return timeCreated;
    }


    /**
     * Sets the timeCreated value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @param timeCreated
     */
    public void setTimeCreated(java.util.Calendar timeCreated) {
        this.timeCreated = timeCreated;
    }


    /**
     * Gets the format value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @return format
     */
    public com.vmware.converter.ConverterDiagnosticManagerBundleFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @param format
     */
    public void setFormat(com.vmware.converter.ConverterDiagnosticManagerBundleFormat format) {
        this.format = format;
    }


    /**
     * Gets the content value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @return content
     */
    public com.vmware.converter.ConverterDiagnosticManagerBundleContent[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @param content
     */
    public void setContent(com.vmware.converter.ConverterDiagnosticManagerBundleContent[] content) {
        this.content = content;
    }

    public com.vmware.converter.ConverterDiagnosticManagerBundleContent getContent(int i) {
        return this.content[i];
    }

    public void setContent(int i, com.vmware.converter.ConverterDiagnosticManagerBundleContent _value) {
        this.content[i] = _value;
    }


    /**
     * Gets the size value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the crc value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @return crc
     */
    public int getCrc() {
        return crc;
    }


    /**
     * Sets the crc value for this ConverterDiagnosticManagerTaskLogBundleInfo.
     * 
     * @param crc
     */
    public void setCrc(int crc) {
        this.crc = crc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDiagnosticManagerTaskLogBundleInfo)) return false;
        ConverterDiagnosticManagerTaskLogBundleInfo other = (ConverterDiagnosticManagerTaskLogBundleInfo) obj;
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
            ((this.timeCreated==null && other.getTimeCreated()==null) || 
             (this.timeCreated!=null &&
              this.timeCreated.equals(other.getTimeCreated()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent()))) &&
            this.size == other.getSize() &&
            this.crc == other.getCrc();
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
        if (getTimeCreated() != null) {
            _hashCode += getTimeCreated().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getSize()).hashCode();
        _hashCode += getCrc();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDiagnosticManagerTaskLogBundleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerTaskLogBundleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "timeCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerBundleFormat"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerBundleContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "crc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
