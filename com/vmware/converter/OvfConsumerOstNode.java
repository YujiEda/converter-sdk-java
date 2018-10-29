/**
 * OvfConsumerOstNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfConsumerOstNode  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String type;

    private com.vmware.converter.OvfConsumerOvfSection[] section;

    private com.vmware.converter.OvfConsumerOstNode[] child;

    private com.vmware.converter.ManagedObjectReference entity;

    public OvfConsumerOstNode() {
    }

    public OvfConsumerOstNode(
           java.lang.String id,
           java.lang.String type,
           com.vmware.converter.OvfConsumerOvfSection[] section,
           com.vmware.converter.OvfConsumerOstNode[] child,
           com.vmware.converter.ManagedObjectReference entity) {
        this.id = id;
        this.type = type;
        this.section = section;
        this.child = child;
        this.entity = entity;
    }


    /**
     * Gets the id value for this OvfConsumerOstNode.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OvfConsumerOstNode.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the type value for this OvfConsumerOstNode.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OvfConsumerOstNode.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the section value for this OvfConsumerOstNode.
     * 
     * @return section
     */
    public com.vmware.converter.OvfConsumerOvfSection[] getSection() {
        return section;
    }


    /**
     * Sets the section value for this OvfConsumerOstNode.
     * 
     * @param section
     */
    public void setSection(com.vmware.converter.OvfConsumerOvfSection[] section) {
        this.section = section;
    }

    public com.vmware.converter.OvfConsumerOvfSection getSection(int i) {
        return this.section[i];
    }

    public void setSection(int i, com.vmware.converter.OvfConsumerOvfSection _value) {
        this.section[i] = _value;
    }


    /**
     * Gets the child value for this OvfConsumerOstNode.
     * 
     * @return child
     */
    public com.vmware.converter.OvfConsumerOstNode[] getChild() {
        return child;
    }


    /**
     * Sets the child value for this OvfConsumerOstNode.
     * 
     * @param child
     */
    public void setChild(com.vmware.converter.OvfConsumerOstNode[] child) {
        this.child = child;
    }

    public com.vmware.converter.OvfConsumerOstNode getChild(int i) {
        return this.child[i];
    }

    public void setChild(int i, com.vmware.converter.OvfConsumerOstNode _value) {
        this.child[i] = _value;
    }


    /**
     * Gets the entity value for this OvfConsumerOstNode.
     * 
     * @return entity
     */
    public com.vmware.converter.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this OvfConsumerOstNode.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.converter.ManagedObjectReference entity) {
        this.entity = entity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfConsumerOstNode)) return false;
        OvfConsumerOstNode other = (OvfConsumerOstNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              java.util.Arrays.equals(this.section, other.getSection()))) &&
            ((this.child==null && other.getChild()==null) || 
             (this.child!=null &&
              java.util.Arrays.equals(this.child, other.getChild()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChild() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChild());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChild(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfConsumerOstNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerOstNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "section"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerOvfSection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "child"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerOstNode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
