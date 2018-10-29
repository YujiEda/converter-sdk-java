/**
 * ArrayOfSelectionSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfSelectionSet  implements java.io.Serializable {
    private com.vmware.converter.SelectionSet[] selectionSet;

    public ArrayOfSelectionSet() {
    }

    public ArrayOfSelectionSet(
           com.vmware.converter.SelectionSet[] selectionSet) {
           this.selectionSet = selectionSet;
    }


    /**
     * Gets the selectionSet value for this ArrayOfSelectionSet.
     * 
     * @return selectionSet
     */
    public com.vmware.converter.SelectionSet[] getSelectionSet() {
        return selectionSet;
    }


    /**
     * Sets the selectionSet value for this ArrayOfSelectionSet.
     * 
     * @param selectionSet
     */
    public void setSelectionSet(com.vmware.converter.SelectionSet[] selectionSet) {
        this.selectionSet = selectionSet;
    }

    public com.vmware.converter.SelectionSet getSelectionSet(int i) {
        return this.selectionSet[i];
    }

    public void setSelectionSet(int i, com.vmware.converter.SelectionSet _value) {
        this.selectionSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSelectionSet)) return false;
        ArrayOfSelectionSet other = (ArrayOfSelectionSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectionSet==null && other.getSelectionSet()==null) || 
             (this.selectionSet!=null &&
              java.util.Arrays.equals(this.selectionSet, other.getSelectionSet())));
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
        if (getSelectionSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectionSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelectionSet(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSelectionSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfSelectionSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "SelectionSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SelectionSet"));
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
