/**
 * ProfileProfileStructureProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfileProfileStructureProperty  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String propertyName;

    private boolean array;

    private com.vmware.converter.ProfileProfileStructure element;

    public ProfileProfileStructureProperty() {
    }

    public ProfileProfileStructureProperty(
           java.lang.String propertyName,
           boolean array,
           com.vmware.converter.ProfileProfileStructure element) {
        this.propertyName = propertyName;
        this.array = array;
        this.element = element;
    }


    /**
     * Gets the propertyName value for this ProfileProfileStructureProperty.
     * 
     * @return propertyName
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this ProfileProfileStructureProperty.
     * 
     * @param propertyName
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the array value for this ProfileProfileStructureProperty.
     * 
     * @return array
     */
    public boolean isArray() {
        return array;
    }


    /**
     * Sets the array value for this ProfileProfileStructureProperty.
     * 
     * @param array
     */
    public void setArray(boolean array) {
        this.array = array;
    }


    /**
     * Gets the element value for this ProfileProfileStructureProperty.
     * 
     * @return element
     */
    public com.vmware.converter.ProfileProfileStructure getElement() {
        return element;
    }


    /**
     * Sets the element value for this ProfileProfileStructureProperty.
     * 
     * @param element
     */
    public void setElement(com.vmware.converter.ProfileProfileStructure element) {
        this.element = element;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileProfileStructureProperty)) return false;
        ProfileProfileStructureProperty other = (ProfileProfileStructureProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            this.array == other.isArray() &&
            ((this.element==null && other.getElement()==null) || 
             (this.element!=null &&
              this.element.equals(other.getElement())));
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
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        _hashCode += (isArray() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getElement() != null) {
            _hashCode += getElement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileProfileStructureProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileProfileStructureProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("array");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "array"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "element"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileProfileStructure"));
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
