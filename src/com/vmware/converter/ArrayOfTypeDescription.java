/**
 * ArrayOfTypeDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfTypeDescription  implements java.io.Serializable {
    private com.vmware.converter.TypeDescription[] typeDescription;

    public ArrayOfTypeDescription() {
    }

    public ArrayOfTypeDescription(
           com.vmware.converter.TypeDescription[] typeDescription) {
           this.typeDescription = typeDescription;
    }


    /**
     * Gets the typeDescription value for this ArrayOfTypeDescription.
     * 
     * @return typeDescription
     */
    public com.vmware.converter.TypeDescription[] getTypeDescription() {
        return typeDescription;
    }


    /**
     * Sets the typeDescription value for this ArrayOfTypeDescription.
     * 
     * @param typeDescription
     */
    public void setTypeDescription(com.vmware.converter.TypeDescription[] typeDescription) {
        this.typeDescription = typeDescription;
    }

    public com.vmware.converter.TypeDescription getTypeDescription(int i) {
        return this.typeDescription[i];
    }

    public void setTypeDescription(int i, com.vmware.converter.TypeDescription _value) {
        this.typeDescription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfTypeDescription)) return false;
        ArrayOfTypeDescription other = (ArrayOfTypeDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeDescription==null && other.getTypeDescription()==null) || 
             (this.typeDescription!=null &&
              java.util.Arrays.equals(this.typeDescription, other.getTypeDescription())));
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
        if (getTypeDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeDescription(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfTypeDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfTypeDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "TypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TypeDescription"));
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
