/**
 * ConverterCustomizationFailedErrorDownloadingFileEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCustomizationFailedErrorDownloadingFileEvent  extends com.vmware.converter.ConverterCustomizationFailedEvent  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String sysprepLocation;

    public ConverterCustomizationFailedErrorDownloadingFileEvent() {
    }

    public ConverterCustomizationFailedErrorDownloadingFileEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String fileName,
           java.lang.String sysprepLocation) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job);
        this.fileName = fileName;
        this.sysprepLocation = sysprepLocation;
    }


    /**
     * Gets the fileName value for this ConverterCustomizationFailedErrorDownloadingFileEvent.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this ConverterCustomizationFailedErrorDownloadingFileEvent.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the sysprepLocation value for this ConverterCustomizationFailedErrorDownloadingFileEvent.
     * 
     * @return sysprepLocation
     */
    public java.lang.String getSysprepLocation() {
        return sysprepLocation;
    }


    /**
     * Sets the sysprepLocation value for this ConverterCustomizationFailedErrorDownloadingFileEvent.
     * 
     * @param sysprepLocation
     */
    public void setSysprepLocation(java.lang.String sysprepLocation) {
        this.sysprepLocation = sysprepLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCustomizationFailedErrorDownloadingFileEvent)) return false;
        ConverterCustomizationFailedErrorDownloadingFileEvent other = (ConverterCustomizationFailedErrorDownloadingFileEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.sysprepLocation==null && other.getSysprepLocation()==null) || 
             (this.sysprepLocation!=null &&
              this.sysprepLocation.equals(other.getSysprepLocation())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getSysprepLocation() != null) {
            _hashCode += getSysprepLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCustomizationFailedErrorDownloadingFileEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCustomizationFailedErrorDownloadingFileEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysprepLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sysprepLocation"));
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
