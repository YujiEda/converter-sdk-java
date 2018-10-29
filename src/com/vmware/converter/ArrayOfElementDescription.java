/**
 * ArrayOfElementDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfElementDescription  implements java.io.Serializable {
    private com.vmware.converter.ElementDescription[] elementDescription;

    public ArrayOfElementDescription() {
    }

    public ArrayOfElementDescription(
           com.vmware.converter.ElementDescription[] elementDescription) {
           this.elementDescription = elementDescription;
    }


    /**
     * Gets the elementDescription value for this ArrayOfElementDescription.
     * 
     * @return elementDescription
     */
    public com.vmware.converter.ElementDescription[] getElementDescription() {
        return elementDescription;
    }


    /**
     * Sets the elementDescription value for this ArrayOfElementDescription.
     * 
     * @param elementDescription
     */
    public void setElementDescription(com.vmware.converter.ElementDescription[] elementDescription) {
        this.elementDescription = elementDescription;
    }

    public com.vmware.converter.ElementDescription getElementDescription(int i) {
        return this.elementDescription[i];
    }

    public void setElementDescription(int i, com.vmware.converter.ElementDescription _value) {
        this.elementDescription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfElementDescription)) return false;
        ArrayOfElementDescription other = (ArrayOfElementDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementDescription==null && other.getElementDescription()==null) || 
             (this.elementDescription!=null &&
              java.util.Arrays.equals(this.elementDescription, other.getElementDescription())));
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
        if (getElementDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementDescription(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfElementDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfElementDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
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
