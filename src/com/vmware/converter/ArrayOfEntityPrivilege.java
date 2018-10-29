/**
 * ArrayOfEntityPrivilege.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfEntityPrivilege  implements java.io.Serializable {
    private com.vmware.converter.EntityPrivilege[] entityPrivilege;

    public ArrayOfEntityPrivilege() {
    }

    public ArrayOfEntityPrivilege(
           com.vmware.converter.EntityPrivilege[] entityPrivilege) {
           this.entityPrivilege = entityPrivilege;
    }


    /**
     * Gets the entityPrivilege value for this ArrayOfEntityPrivilege.
     * 
     * @return entityPrivilege
     */
    public com.vmware.converter.EntityPrivilege[] getEntityPrivilege() {
        return entityPrivilege;
    }


    /**
     * Sets the entityPrivilege value for this ArrayOfEntityPrivilege.
     * 
     * @param entityPrivilege
     */
    public void setEntityPrivilege(com.vmware.converter.EntityPrivilege[] entityPrivilege) {
        this.entityPrivilege = entityPrivilege;
    }

    public com.vmware.converter.EntityPrivilege getEntityPrivilege(int i) {
        return this.entityPrivilege[i];
    }

    public void setEntityPrivilege(int i, com.vmware.converter.EntityPrivilege _value) {
        this.entityPrivilege[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEntityPrivilege)) return false;
        ArrayOfEntityPrivilege other = (ArrayOfEntityPrivilege) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityPrivilege==null && other.getEntityPrivilege()==null) || 
             (this.entityPrivilege!=null &&
              java.util.Arrays.equals(this.entityPrivilege, other.getEntityPrivilege())));
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
        if (getEntityPrivilege() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityPrivilege());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityPrivilege(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfEntityPrivilege.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfEntityPrivilege"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivilege");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "EntityPrivilege"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EntityPrivilege"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
