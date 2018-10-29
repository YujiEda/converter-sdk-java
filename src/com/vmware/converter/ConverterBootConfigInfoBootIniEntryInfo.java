/**
 * ConverterBootConfigInfoBootIniEntryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBootConfigInfoBootIniEntryInfo  extends com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo  implements java.io.Serializable {
    private java.lang.String arcname;

    private java.lang.String systemDirectory;

    public ConverterBootConfigInfoBootIniEntryInfo() {
    }

    public ConverterBootConfigInfoBootIniEntryInfo(
           int entryNumber,
           boolean defaultEntry,
           java.lang.String title,
           java.lang.String arcname,
           java.lang.String systemDirectory) {
        super(
            entryNumber,
            defaultEntry,
            title);
        this.arcname = arcname;
        this.systemDirectory = systemDirectory;
    }


    /**
     * Gets the arcname value for this ConverterBootConfigInfoBootIniEntryInfo.
     * 
     * @return arcname
     */
    public java.lang.String getArcname() {
        return arcname;
    }


    /**
     * Sets the arcname value for this ConverterBootConfigInfoBootIniEntryInfo.
     * 
     * @param arcname
     */
    public void setArcname(java.lang.String arcname) {
        this.arcname = arcname;
    }


    /**
     * Gets the systemDirectory value for this ConverterBootConfigInfoBootIniEntryInfo.
     * 
     * @return systemDirectory
     */
    public java.lang.String getSystemDirectory() {
        return systemDirectory;
    }


    /**
     * Sets the systemDirectory value for this ConverterBootConfigInfoBootIniEntryInfo.
     * 
     * @param systemDirectory
     */
    public void setSystemDirectory(java.lang.String systemDirectory) {
        this.systemDirectory = systemDirectory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBootConfigInfoBootIniEntryInfo)) return false;
        ConverterBootConfigInfoBootIniEntryInfo other = (ConverterBootConfigInfoBootIniEntryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arcname==null && other.getArcname()==null) || 
             (this.arcname!=null &&
              this.arcname.equals(other.getArcname()))) &&
            ((this.systemDirectory==null && other.getSystemDirectory()==null) || 
             (this.systemDirectory!=null &&
              this.systemDirectory.equals(other.getSystemDirectory())));
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
        if (getArcname() != null) {
            _hashCode += getArcname().hashCode();
        }
        if (getSystemDirectory() != null) {
            _hashCode += getSystemDirectory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterBootConfigInfoBootIniEntryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootIniEntryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "arcname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "systemDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
