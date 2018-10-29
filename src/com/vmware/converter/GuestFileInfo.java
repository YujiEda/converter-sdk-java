/**
 * GuestFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestFileInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String path;

    private java.lang.String type;

    private long size;

    private com.vmware.converter.GuestFileAttributes attributes;

    public GuestFileInfo() {
    }

    public GuestFileInfo(
           java.lang.String path,
           java.lang.String type,
           long size,
           com.vmware.converter.GuestFileAttributes attributes) {
        this.path = path;
        this.type = type;
        this.size = size;
        this.attributes = attributes;
    }


    /**
     * Gets the path value for this GuestFileInfo.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this GuestFileInfo.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the type value for this GuestFileInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this GuestFileInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the size value for this GuestFileInfo.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this GuestFileInfo.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the attributes value for this GuestFileInfo.
     * 
     * @return attributes
     */
    public com.vmware.converter.GuestFileAttributes getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this GuestFileInfo.
     * 
     * @param attributes
     */
    public void setAttributes(com.vmware.converter.GuestFileAttributes attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestFileInfo)) return false;
        GuestFileInfo other = (GuestFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.size == other.getSize() &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes())));
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
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
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestFileAttributes"));
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
