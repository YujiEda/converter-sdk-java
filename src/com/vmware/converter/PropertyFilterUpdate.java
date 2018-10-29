/**
 * PropertyFilterUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PropertyFilterUpdate  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference filter;

    private com.vmware.converter.ObjectUpdate[] objectSet;

    private com.vmware.converter.MissingObject[] missingSet;

    public PropertyFilterUpdate() {
    }

    public PropertyFilterUpdate(
           com.vmware.converter.ManagedObjectReference filter,
           com.vmware.converter.ObjectUpdate[] objectSet,
           com.vmware.converter.MissingObject[] missingSet) {
        this.filter = filter;
        this.objectSet = objectSet;
        this.missingSet = missingSet;
    }


    /**
     * Gets the filter value for this PropertyFilterUpdate.
     * 
     * @return filter
     */
    public com.vmware.converter.ManagedObjectReference getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this PropertyFilterUpdate.
     * 
     * @param filter
     */
    public void setFilter(com.vmware.converter.ManagedObjectReference filter) {
        this.filter = filter;
    }


    /**
     * Gets the objectSet value for this PropertyFilterUpdate.
     * 
     * @return objectSet
     */
    public com.vmware.converter.ObjectUpdate[] getObjectSet() {
        return objectSet;
    }


    /**
     * Sets the objectSet value for this PropertyFilterUpdate.
     * 
     * @param objectSet
     */
    public void setObjectSet(com.vmware.converter.ObjectUpdate[] objectSet) {
        this.objectSet = objectSet;
    }

    public com.vmware.converter.ObjectUpdate getObjectSet(int i) {
        return this.objectSet[i];
    }

    public void setObjectSet(int i, com.vmware.converter.ObjectUpdate _value) {
        this.objectSet[i] = _value;
    }


    /**
     * Gets the missingSet value for this PropertyFilterUpdate.
     * 
     * @return missingSet
     */
    public com.vmware.converter.MissingObject[] getMissingSet() {
        return missingSet;
    }


    /**
     * Sets the missingSet value for this PropertyFilterUpdate.
     * 
     * @param missingSet
     */
    public void setMissingSet(com.vmware.converter.MissingObject[] missingSet) {
        this.missingSet = missingSet;
    }

    public com.vmware.converter.MissingObject getMissingSet(int i) {
        return this.missingSet[i];
    }

    public void setMissingSet(int i, com.vmware.converter.MissingObject _value) {
        this.missingSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyFilterUpdate)) return false;
        PropertyFilterUpdate other = (PropertyFilterUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.objectSet==null && other.getObjectSet()==null) || 
             (this.objectSet!=null &&
              java.util.Arrays.equals(this.objectSet, other.getObjectSet()))) &&
            ((this.missingSet==null && other.getMissingSet()==null) || 
             (this.missingSet!=null &&
              java.util.Arrays.equals(this.missingSet, other.getMissingSet())));
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
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getObjectSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMissingSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingSet(), i);
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
        new org.apache.axis.description.TypeDesc(PropertyFilterUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PropertyFilterUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ObjectUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "missingSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MissingObject"));
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
