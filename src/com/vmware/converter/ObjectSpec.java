/**
 * ObjectSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ObjectSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference obj;

    private java.lang.Boolean skip;

    private com.vmware.converter.SelectionSpec[] selectSet;

    public ObjectSpec() {
    }

    public ObjectSpec(
           com.vmware.converter.ManagedObjectReference obj,
           java.lang.Boolean skip,
           com.vmware.converter.SelectionSpec[] selectSet) {
        this.obj = obj;
        this.skip = skip;
        this.selectSet = selectSet;
    }


    /**
     * Gets the obj value for this ObjectSpec.
     * 
     * @return obj
     */
    public com.vmware.converter.ManagedObjectReference getObj() {
        return obj;
    }


    /**
     * Sets the obj value for this ObjectSpec.
     * 
     * @param obj
     */
    public void setObj(com.vmware.converter.ManagedObjectReference obj) {
        this.obj = obj;
    }


    /**
     * Gets the skip value for this ObjectSpec.
     * 
     * @return skip
     */
    public java.lang.Boolean getSkip() {
        return skip;
    }


    /**
     * Sets the skip value for this ObjectSpec.
     * 
     * @param skip
     */
    public void setSkip(java.lang.Boolean skip) {
        this.skip = skip;
    }


    /**
     * Gets the selectSet value for this ObjectSpec.
     * 
     * @return selectSet
     */
    public com.vmware.converter.SelectionSpec[] getSelectSet() {
        return selectSet;
    }


    /**
     * Sets the selectSet value for this ObjectSpec.
     * 
     * @param selectSet
     */
    public void setSelectSet(com.vmware.converter.SelectionSpec[] selectSet) {
        this.selectSet = selectSet;
    }

    public com.vmware.converter.SelectionSpec getSelectSet(int i) {
        return this.selectSet[i];
    }

    public void setSelectSet(int i, com.vmware.converter.SelectionSpec _value) {
        this.selectSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectSpec)) return false;
        ObjectSpec other = (ObjectSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.obj==null && other.getObj()==null) || 
             (this.obj!=null &&
              this.obj.equals(other.getObj()))) &&
            ((this.skip==null && other.getSkip()==null) || 
             (this.skip!=null &&
              this.skip.equals(other.getSkip()))) &&
            ((this.selectSet==null && other.getSelectSet()==null) || 
             (this.selectSet!=null &&
              java.util.Arrays.equals(this.selectSet, other.getSelectSet())));
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
        if (getObj() != null) {
            _hashCode += getObj().hashCode();
        }
        if (getSkip() != null) {
            _hashCode += getSkip().hashCode();
        }
        if (getSelectSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelectSet(), i);
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
        new org.apache.axis.description.TypeDesc(ObjectSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ObjectSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "obj"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "skip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "selectSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SelectionSpec"));
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
