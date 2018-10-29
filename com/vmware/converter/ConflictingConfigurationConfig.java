/**
 * ConflictingConfigurationConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConflictingConfigurationConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference entity;

    private java.lang.String propertyPath;

    public ConflictingConfigurationConfig() {
    }

    public ConflictingConfigurationConfig(
           com.vmware.converter.ManagedObjectReference entity,
           java.lang.String propertyPath) {
        this.entity = entity;
        this.propertyPath = propertyPath;
    }


    /**
     * Gets the entity value for this ConflictingConfigurationConfig.
     * 
     * @return entity
     */
    public com.vmware.converter.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this ConflictingConfigurationConfig.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.converter.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the propertyPath value for this ConflictingConfigurationConfig.
     * 
     * @return propertyPath
     */
    public java.lang.String getPropertyPath() {
        return propertyPath;
    }


    /**
     * Sets the propertyPath value for this ConflictingConfigurationConfig.
     * 
     * @param propertyPath
     */
    public void setPropertyPath(java.lang.String propertyPath) {
        this.propertyPath = propertyPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConflictingConfigurationConfig)) return false;
        ConflictingConfigurationConfig other = (ConflictingConfigurationConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.propertyPath==null && other.getPropertyPath()==null) || 
             (this.propertyPath!=null &&
              this.propertyPath.equals(other.getPropertyPath())));
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getPropertyPath() != null) {
            _hashCode += getPropertyPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConflictingConfigurationConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ConflictingConfigurationConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertyPath"));
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
