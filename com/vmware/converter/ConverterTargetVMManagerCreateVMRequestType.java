/**
 * ConverterTargetVMManagerCreateVMRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTargetVMManagerCreateVMRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterComputerSpec source;

    private com.vmware.converter.ConverterConversionParams params;

    public ConverterTargetVMManagerCreateVMRequestType() {
    }

    public ConverterTargetVMManagerCreateVMRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterComputerSpec source,
           com.vmware.converter.ConverterConversionParams params) {
           this._this = _this;
           this.source = source;
           this.params = params;
    }


    /**
     * Gets the _this value for this ConverterTargetVMManagerCreateVMRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterTargetVMManagerCreateVMRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the source value for this ConverterTargetVMManagerCreateVMRequestType.
     * 
     * @return source
     */
    public com.vmware.converter.ConverterComputerSpec getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterTargetVMManagerCreateVMRequestType.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ConverterComputerSpec source) {
        this.source = source;
    }


    /**
     * Gets the params value for this ConverterTargetVMManagerCreateVMRequestType.
     * 
     * @return params
     */
    public com.vmware.converter.ConverterConversionParams getParams() {
        return params;
    }


    /**
     * Sets the params value for this ConverterTargetVMManagerCreateVMRequestType.
     * 
     * @param params
     */
    public void setParams(com.vmware.converter.ConverterConversionParams params) {
        this.params = params;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterTargetVMManagerCreateVMRequestType)) return false;
        ConverterTargetVMManagerCreateVMRequestType other = (ConverterTargetVMManagerCreateVMRequestType) obj;
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
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              this.params.equals(other.getParams())));
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
        if (getParams() != null) {
            _hashCode += getParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterTargetVMManagerCreateVMRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVMManagerCreateVMRequestType"));
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
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "params"));
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
