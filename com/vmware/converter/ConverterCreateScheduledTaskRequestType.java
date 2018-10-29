/**
 * ConverterCreateScheduledTaskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCreateScheduledTaskRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ManagedObjectReference obj;

    private com.vmware.converter.ConverterScheduledTaskSpec spec;

    public ConverterCreateScheduledTaskRequestType() {
    }

    public ConverterCreateScheduledTaskRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ManagedObjectReference obj,
           com.vmware.converter.ConverterScheduledTaskSpec spec) {
           this._this = _this;
           this.obj = obj;
           this.spec = spec;
    }


    /**
     * Gets the _this value for this ConverterCreateScheduledTaskRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterCreateScheduledTaskRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the obj value for this ConverterCreateScheduledTaskRequestType.
     * 
     * @return obj
     */
    public com.vmware.converter.ManagedObjectReference getObj() {
        return obj;
    }


    /**
     * Sets the obj value for this ConverterCreateScheduledTaskRequestType.
     * 
     * @param obj
     */
    public void setObj(com.vmware.converter.ManagedObjectReference obj) {
        this.obj = obj;
    }


    /**
     * Gets the spec value for this ConverterCreateScheduledTaskRequestType.
     * 
     * @return spec
     */
    public com.vmware.converter.ConverterScheduledTaskSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this ConverterCreateScheduledTaskRequestType.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.ConverterScheduledTaskSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCreateScheduledTaskRequestType)) return false;
        ConverterCreateScheduledTaskRequestType other = (ConverterCreateScheduledTaskRequestType) obj;
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
            ((this.obj==null && other.getObj()==null) || 
             (this.obj!=null &&
              this.obj.equals(other.getObj()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getObj() != null) {
            _hashCode += getObj().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCreateScheduledTaskRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCreateScheduledTaskRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "obj"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterScheduledTaskSpec"));
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
