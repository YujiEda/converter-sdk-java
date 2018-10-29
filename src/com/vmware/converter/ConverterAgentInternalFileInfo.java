/**
 * ConverterAgentInternalFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalFileInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private boolean directory;

    private boolean readOnly;

    private long length;

    private long createTime;

    public ConverterAgentInternalFileInfo() {
    }

    public ConverterAgentInternalFileInfo(
           java.lang.String name,
           boolean directory,
           boolean readOnly,
           long length,
           long createTime) {
        this.name = name;
        this.directory = directory;
        this.readOnly = readOnly;
        this.length = length;
        this.createTime = createTime;
    }


    /**
     * Gets the name value for this ConverterAgentInternalFileInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConverterAgentInternalFileInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the directory value for this ConverterAgentInternalFileInfo.
     * 
     * @return directory
     */
    public boolean isDirectory() {
        return directory;
    }


    /**
     * Sets the directory value for this ConverterAgentInternalFileInfo.
     * 
     * @param directory
     */
    public void setDirectory(boolean directory) {
        this.directory = directory;
    }


    /**
     * Gets the readOnly value for this ConverterAgentInternalFileInfo.
     * 
     * @return readOnly
     */
    public boolean isReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this ConverterAgentInternalFileInfo.
     * 
     * @param readOnly
     */
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Gets the length value for this ConverterAgentInternalFileInfo.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this ConverterAgentInternalFileInfo.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the createTime value for this ConverterAgentInternalFileInfo.
     * 
     * @return createTime
     */
    public long getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this ConverterAgentInternalFileInfo.
     * 
     * @param createTime
     */
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalFileInfo)) return false;
        ConverterAgentInternalFileInfo other = (ConverterAgentInternalFileInfo) obj;
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
            this.directory == other.isDirectory() &&
            this.readOnly == other.isReadOnly() &&
            this.length == other.getLength() &&
            this.createTime == other.getCreateTime();
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
        _hashCode += (isDirectory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReadOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getCreateTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "directory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "readOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "createTime"));
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
