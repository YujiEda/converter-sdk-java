/**
 * ConverterStorageParamsManagedTargetDiskParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageParamsManagedTargetDiskParams  extends com.vmware.converter.ConverterStorageParamsTargetDiskParams  implements java.io.Serializable {
    private java.lang.String datastoreName;

    public ConverterStorageParamsManagedTargetDiskParams() {
    }

    public ConverterStorageParamsManagedTargetDiskParams(
           java.lang.String sourceDiskId,
           com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] volumesToClone,
           java.lang.String diskType,
           java.lang.Boolean lvg,
           java.lang.Boolean gpt,
           java.lang.String datastoreName) {
        super(
            sourceDiskId,
            volumesToClone,
            diskType,
            lvg,
            gpt);
        this.datastoreName = datastoreName;
    }


    /**
     * Gets the datastoreName value for this ConverterStorageParamsManagedTargetDiskParams.
     * 
     * @return datastoreName
     */
    public java.lang.String getDatastoreName() {
        return datastoreName;
    }


    /**
     * Sets the datastoreName value for this ConverterStorageParamsManagedTargetDiskParams.
     * 
     * @param datastoreName
     */
    public void setDatastoreName(java.lang.String datastoreName) {
        this.datastoreName = datastoreName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageParamsManagedTargetDiskParams)) return false;
        ConverterStorageParamsManagedTargetDiskParams other = (ConverterStorageParamsManagedTargetDiskParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastoreName==null && other.getDatastoreName()==null) || 
             (this.datastoreName!=null &&
              this.datastoreName.equals(other.getDatastoreName())));
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
        if (getDatastoreName() != null) {
            _hashCode += getDatastoreName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageParamsManagedTargetDiskParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsManagedTargetDiskParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "datastoreName"));
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
