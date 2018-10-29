/**
 * RollbackFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RollbackFailure  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private java.lang.String entityName;

    private java.lang.String entityType;

    public RollbackFailure() {
    }

    public RollbackFailure(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String entityName,
           java.lang.String entityType) {
        super(
            faultCause,
            faultMessage);
        this.entityName = entityName;
        this.entityType = entityType;
    }


    /**
     * Gets the entityName value for this RollbackFailure.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this RollbackFailure.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the entityType value for this RollbackFailure.
     * 
     * @return entityType
     */
    public java.lang.String getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this RollbackFailure.
     * 
     * @param entityType
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RollbackFailure)) return false;
        RollbackFailure other = (RollbackFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType())));
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
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RollbackFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RollbackFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityType"));
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
