/**
 * FileTooLarge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FileTooLarge  extends com.vmware.converter.FileFault  implements java.io.Serializable {
    private java.lang.String datastore;

    private long fileSize;

    private java.lang.Long maxFileSize;

    public FileTooLarge() {
    }

    public FileTooLarge(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String file,
           java.lang.String datastore,
           long fileSize,
           java.lang.Long maxFileSize) {
        super(
            faultCause,
            faultMessage,
            file);
        this.datastore = datastore;
        this.fileSize = fileSize;
        this.maxFileSize = maxFileSize;
    }


    /**
     * Gets the datastore value for this FileTooLarge.
     * 
     * @return datastore
     */
    public java.lang.String getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this FileTooLarge.
     * 
     * @param datastore
     */
    public void setDatastore(java.lang.String datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the fileSize value for this FileTooLarge.
     * 
     * @return fileSize
     */
    public long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this FileTooLarge.
     * 
     * @param fileSize
     */
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the maxFileSize value for this FileTooLarge.
     * 
     * @return maxFileSize
     */
    public java.lang.Long getMaxFileSize() {
        return maxFileSize;
    }


    /**
     * Sets the maxFileSize value for this FileTooLarge.
     * 
     * @param maxFileSize
     */
    public void setMaxFileSize(java.lang.Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileTooLarge)) return false;
        FileTooLarge other = (FileTooLarge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.maxFileSize==null && other.getMaxFileSize()==null) || 
             (this.maxFileSize!=null &&
              this.maxFileSize.equals(other.getMaxFileSize())));
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
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        _hashCode += new Long(getFileSize()).hashCode();
        if (getMaxFileSize() != null) {
            _hashCode += getMaxFileSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileTooLarge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FileTooLarge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxFileSize"));
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
