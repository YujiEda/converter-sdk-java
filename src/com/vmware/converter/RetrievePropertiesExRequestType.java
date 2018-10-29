/**
 * RetrievePropertiesExRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RetrievePropertiesExRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.PropertyFilterSpec[] specSet;

    private com.vmware.converter.RetrieveOptions options;

    public RetrievePropertiesExRequestType() {
    }

    public RetrievePropertiesExRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.PropertyFilterSpec[] specSet,
           com.vmware.converter.RetrieveOptions options) {
           this._this = _this;
           this.specSet = specSet;
           this.options = options;
    }


    /**
     * Gets the _this value for this RetrievePropertiesExRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this RetrievePropertiesExRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the specSet value for this RetrievePropertiesExRequestType.
     * 
     * @return specSet
     */
    public com.vmware.converter.PropertyFilterSpec[] getSpecSet() {
        return specSet;
    }


    /**
     * Sets the specSet value for this RetrievePropertiesExRequestType.
     * 
     * @param specSet
     */
    public void setSpecSet(com.vmware.converter.PropertyFilterSpec[] specSet) {
        this.specSet = specSet;
    }

    public com.vmware.converter.PropertyFilterSpec getSpecSet(int i) {
        return this.specSet[i];
    }

    public void setSpecSet(int i, com.vmware.converter.PropertyFilterSpec _value) {
        this.specSet[i] = _value;
    }


    /**
     * Gets the options value for this RetrievePropertiesExRequestType.
     * 
     * @return options
     */
    public com.vmware.converter.RetrieveOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this RetrievePropertiesExRequestType.
     * 
     * @param options
     */
    public void setOptions(com.vmware.converter.RetrieveOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrievePropertiesExRequestType)) return false;
        RetrievePropertiesExRequestType other = (RetrievePropertiesExRequestType) obj;
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
            ((this.specSet==null && other.getSpecSet()==null) || 
             (this.specSet!=null &&
              java.util.Arrays.equals(this.specSet, other.getSpecSet()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getSpecSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrievePropertiesExRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RetrievePropertiesExRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "specSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PropertyFilterSpec"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RetrieveOptions"));
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
