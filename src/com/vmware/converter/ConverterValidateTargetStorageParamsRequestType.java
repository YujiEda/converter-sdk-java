/**
 * ConverterValidateTargetStorageParamsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterValidateTargetStorageParamsRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterComputerSpec source;

    private com.vmware.converter.ConverterComputerHardwareInfo sourceHardwareInfo;

    private com.vmware.converter.ConverterConversionParams conversionParams;

    public ConverterValidateTargetStorageParamsRequestType() {
    }

    public ConverterValidateTargetStorageParamsRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterComputerSpec source,
           com.vmware.converter.ConverterComputerHardwareInfo sourceHardwareInfo,
           com.vmware.converter.ConverterConversionParams conversionParams) {
           this._this = _this;
           this.source = source;
           this.sourceHardwareInfo = sourceHardwareInfo;
           this.conversionParams = conversionParams;
    }


    /**
     * Gets the _this value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the source value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @return source
     */
    public com.vmware.converter.ConverterComputerSpec getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ConverterComputerSpec source) {
        this.source = source;
    }


    /**
     * Gets the sourceHardwareInfo value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @return sourceHardwareInfo
     */
    public com.vmware.converter.ConverterComputerHardwareInfo getSourceHardwareInfo() {
        return sourceHardwareInfo;
    }


    /**
     * Sets the sourceHardwareInfo value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @param sourceHardwareInfo
     */
    public void setSourceHardwareInfo(com.vmware.converter.ConverterComputerHardwareInfo sourceHardwareInfo) {
        this.sourceHardwareInfo = sourceHardwareInfo;
    }


    /**
     * Gets the conversionParams value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @return conversionParams
     */
    public com.vmware.converter.ConverterConversionParams getConversionParams() {
        return conversionParams;
    }


    /**
     * Sets the conversionParams value for this ConverterValidateTargetStorageParamsRequestType.
     * 
     * @param conversionParams
     */
    public void setConversionParams(com.vmware.converter.ConverterConversionParams conversionParams) {
        this.conversionParams = conversionParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterValidateTargetStorageParamsRequestType)) return false;
        ConverterValidateTargetStorageParamsRequestType other = (ConverterValidateTargetStorageParamsRequestType) obj;
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
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.sourceHardwareInfo==null && other.getSourceHardwareInfo()==null) || 
             (this.sourceHardwareInfo!=null &&
              this.sourceHardwareInfo.equals(other.getSourceHardwareInfo()))) &&
            ((this.conversionParams==null && other.getConversionParams()==null) || 
             (this.conversionParams!=null &&
              this.conversionParams.equals(other.getConversionParams())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getSourceHardwareInfo() != null) {
            _hashCode += getSourceHardwareInfo().hashCode();
        }
        if (getConversionParams() != null) {
            _hashCode += getConversionParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterValidateTargetStorageParamsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterValidateTargetStorageParamsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceHardwareInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceHardwareInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerHardwareInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "conversionParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConversionParams"));
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
