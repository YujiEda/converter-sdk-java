/**
 * ConverterServerConversionManagerGetJobExtraInfoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerConversionManagerGetJobExtraInfoRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ManagedObjectReference conversionJob;

    public ConverterServerConversionManagerGetJobExtraInfoRequestType() {
    }

    public ConverterServerConversionManagerGetJobExtraInfoRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ManagedObjectReference conversionJob) {
           this._this = _this;
           this.conversionJob = conversionJob;
    }


    /**
     * Gets the _this value for this ConverterServerConversionManagerGetJobExtraInfoRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterServerConversionManagerGetJobExtraInfoRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the conversionJob value for this ConverterServerConversionManagerGetJobExtraInfoRequestType.
     * 
     * @return conversionJob
     */
    public com.vmware.converter.ManagedObjectReference getConversionJob() {
        return conversionJob;
    }


    /**
     * Sets the conversionJob value for this ConverterServerConversionManagerGetJobExtraInfoRequestType.
     * 
     * @param conversionJob
     */
    public void setConversionJob(com.vmware.converter.ManagedObjectReference conversionJob) {
        this.conversionJob = conversionJob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerConversionManagerGetJobExtraInfoRequestType)) return false;
        ConverterServerConversionManagerGetJobExtraInfoRequestType other = (ConverterServerConversionManagerGetJobExtraInfoRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.conversionJob==null && other.getConversionJob()==null) || 
             (this.conversionJob!=null &&
              this.conversionJob.equals(other.getConversionJob())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getConversionJob() != null) {
            _hashCode += getConversionJob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerConversionManagerGetJobExtraInfoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionManagerGetJobExtraInfoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "conversionJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
