/**
 * ArrayOfEnumDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfEnumDescription  implements java.io.Serializable {
    private com.vmware.converter.EnumDescription[] enumDescription;

    public ArrayOfEnumDescription() {
    }

    public ArrayOfEnumDescription(
           com.vmware.converter.EnumDescription[] enumDescription) {
           this.enumDescription = enumDescription;
    }


    /**
     * Gets the enumDescription value for this ArrayOfEnumDescription.
     * 
     * @return enumDescription
     */
    public com.vmware.converter.EnumDescription[] getEnumDescription() {
        return enumDescription;
    }


    /**
     * Sets the enumDescription value for this ArrayOfEnumDescription.
     * 
     * @param enumDescription
     */
    public void setEnumDescription(com.vmware.converter.EnumDescription[] enumDescription) {
        this.enumDescription = enumDescription;
    }

    public com.vmware.converter.EnumDescription getEnumDescription(int i) {
        return this.enumDescription[i];
    }

    public void setEnumDescription(int i, com.vmware.converter.EnumDescription _value) {
        this.enumDescription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEnumDescription)) return false;
        ArrayOfEnumDescription other = (ArrayOfEnumDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enumDescription==null && other.getEnumDescription()==null) || 
             (this.enumDescription!=null &&
              java.util.Arrays.equals(this.enumDescription, other.getEnumDescription())));
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
        if (getEnumDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumDescription(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEnumDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfEnumDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "EnumDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EnumDescription"));
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
