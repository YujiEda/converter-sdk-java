/**
 * EntityPrivilege.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EntityPrivilege  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference entity;

    private com.vmware.converter.PrivilegeAvailability[] privAvailability;

    public EntityPrivilege() {
    }

    public EntityPrivilege(
           com.vmware.converter.ManagedObjectReference entity,
           com.vmware.converter.PrivilegeAvailability[] privAvailability) {
        this.entity = entity;
        this.privAvailability = privAvailability;
    }


    /**
     * Gets the entity value for this EntityPrivilege.
     * 
     * @return entity
     */
    public com.vmware.converter.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this EntityPrivilege.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.converter.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the privAvailability value for this EntityPrivilege.
     * 
     * @return privAvailability
     */
    public com.vmware.converter.PrivilegeAvailability[] getPrivAvailability() {
        return privAvailability;
    }


    /**
     * Sets the privAvailability value for this EntityPrivilege.
     * 
     * @param privAvailability
     */
    public void setPrivAvailability(com.vmware.converter.PrivilegeAvailability[] privAvailability) {
        this.privAvailability = privAvailability;
    }

    public com.vmware.converter.PrivilegeAvailability getPrivAvailability(int i) {
        return this.privAvailability[i];
    }

    public void setPrivAvailability(int i, com.vmware.converter.PrivilegeAvailability _value) {
        this.privAvailability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityPrivilege)) return false;
        EntityPrivilege other = (EntityPrivilege) obj;
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
            ((this.privAvailability==null && other.getPrivAvailability()==null) || 
             (this.privAvailability!=null &&
              java.util.Arrays.equals(this.privAvailability, other.getPrivAvailability())));
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
        if (getPrivAvailability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivAvailability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivAvailability(), i);
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
        new org.apache.axis.description.TypeDesc(EntityPrivilege.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EntityPrivilege"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PrivilegeAvailability"));
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
