/**
 * ConverterServerConversionManagerCreateJobRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerConversionManagerCreateJobRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterServerConversionConversionJobSpec spec;

    private java.lang.Object extraInfo;

    public ConverterServerConversionManagerCreateJobRequestType() {
    }

    public ConverterServerConversionManagerCreateJobRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterServerConversionConversionJobSpec spec,
           java.lang.Object extraInfo) {
           this._this = _this;
           this.spec = spec;
           this.extraInfo = extraInfo;
    }


    /**
     * Gets the _this value for this ConverterServerConversionManagerCreateJobRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterServerConversionManagerCreateJobRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the spec value for this ConverterServerConversionManagerCreateJobRequestType.
     * 
     * @return spec
     */
    public com.vmware.converter.ConverterServerConversionConversionJobSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this ConverterServerConversionManagerCreateJobRequestType.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.ConverterServerConversionConversionJobSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the extraInfo value for this ConverterServerConversionManagerCreateJobRequestType.
     * 
     * @return extraInfo
     */
    public java.lang.Object getExtraInfo() {
        return extraInfo;
    }


    /**
     * Sets the extraInfo value for this ConverterServerConversionManagerCreateJobRequestType.
     * 
     * @param extraInfo
     */
    public void setExtraInfo(java.lang.Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerConversionManagerCreateJobRequestType)) return false;
        ConverterServerConversionManagerCreateJobRequestType other = (ConverterServerConversionManagerCreateJobRequestType) obj;
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
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
            ((this.extraInfo==null && other.getExtraInfo()==null) || 
             (this.extraInfo!=null &&
              this.extraInfo.equals(other.getExtraInfo())));
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
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        if (getExtraInfo() != null) {
            _hashCode += getExtraInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerConversionManagerCreateJobRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionManagerCreateJobRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionConversionJobSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "extraInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
