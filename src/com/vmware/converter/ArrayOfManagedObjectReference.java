/**
 * ArrayOfManagedObjectReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfManagedObjectReference  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference[] managedObjectReference;

    public ArrayOfManagedObjectReference() {
    }

    public ArrayOfManagedObjectReference(
           com.vmware.converter.ManagedObjectReference[] managedObjectReference) {
           this.managedObjectReference = managedObjectReference;
    }


    /**
     * Gets the managedObjectReference value for this ArrayOfManagedObjectReference.
     * 
     * @return managedObjectReference
     */
    public com.vmware.converter.ManagedObjectReference[] getManagedObjectReference() {
        return managedObjectReference;
    }


    /**
     * Sets the managedObjectReference value for this ArrayOfManagedObjectReference.
     * 
     * @param managedObjectReference
     */
    public void setManagedObjectReference(com.vmware.converter.ManagedObjectReference[] managedObjectReference) {
        this.managedObjectReference = managedObjectReference;
    }

    public com.vmware.converter.ManagedObjectReference getManagedObjectReference(int i) {
        return this.managedObjectReference[i];
    }

    public void setManagedObjectReference(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.managedObjectReference[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfManagedObjectReference)) return false;
        ArrayOfManagedObjectReference other = (ArrayOfManagedObjectReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managedObjectReference==null && other.getManagedObjectReference()==null) || 
             (this.managedObjectReference!=null &&
              java.util.Arrays.equals(this.managedObjectReference, other.getManagedObjectReference())));
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
        if (getManagedObjectReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagedObjectReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagedObjectReference(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfManagedObjectReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfManagedObjectReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedObjectReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
