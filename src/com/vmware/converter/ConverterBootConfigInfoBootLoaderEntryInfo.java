/**
 * ConverterBootConfigInfoBootLoaderEntryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBootConfigInfoBootLoaderEntryInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int entryNumber;

    private boolean defaultEntry;

    private java.lang.String title;

    public ConverterBootConfigInfoBootLoaderEntryInfo() {
    }

    public ConverterBootConfigInfoBootLoaderEntryInfo(
           int entryNumber,
           boolean defaultEntry,
           java.lang.String title) {
        this.entryNumber = entryNumber;
        this.defaultEntry = defaultEntry;
        this.title = title;
    }


    /**
     * Gets the entryNumber value for this ConverterBootConfigInfoBootLoaderEntryInfo.
     * 
     * @return entryNumber
     */
    public int getEntryNumber() {
        return entryNumber;
    }


    /**
     * Sets the entryNumber value for this ConverterBootConfigInfoBootLoaderEntryInfo.
     * 
     * @param entryNumber
     */
    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }


    /**
     * Gets the defaultEntry value for this ConverterBootConfigInfoBootLoaderEntryInfo.
     * 
     * @return defaultEntry
     */
    public boolean isDefaultEntry() {
        return defaultEntry;
    }


    /**
     * Sets the defaultEntry value for this ConverterBootConfigInfoBootLoaderEntryInfo.
     * 
     * @param defaultEntry
     */
    public void setDefaultEntry(boolean defaultEntry) {
        this.defaultEntry = defaultEntry;
    }


    /**
     * Gets the title value for this ConverterBootConfigInfoBootLoaderEntryInfo.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ConverterBootConfigInfoBootLoaderEntryInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBootConfigInfoBootLoaderEntryInfo)) return false;
        ConverterBootConfigInfoBootLoaderEntryInfo other = (ConverterBootConfigInfoBootLoaderEntryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.entryNumber == other.getEntryNumber() &&
            this.defaultEntry == other.isDefaultEntry() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        _hashCode += getEntryNumber();
        _hashCode += (isDefaultEntry() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterBootConfigInfoBootLoaderEntryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoBootLoaderEntryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "entryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "title"));
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
