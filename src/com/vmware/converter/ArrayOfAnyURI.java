/**
 * ArrayOfAnyURI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfAnyURI  implements java.io.Serializable {
    private org.apache.axis.types.URI[] anyURI;

    public ArrayOfAnyURI() {
    }

    public ArrayOfAnyURI(
           org.apache.axis.types.URI[] anyURI) {
           this.anyURI = anyURI;
    }


    /**
     * Gets the anyURI value for this ArrayOfAnyURI.
     * 
     * @return anyURI
     */
    public org.apache.axis.types.URI[] getAnyURI() {
        return anyURI;
    }


    /**
     * Sets the anyURI value for this ArrayOfAnyURI.
     * 
     * @param anyURI
     */
    public void setAnyURI(org.apache.axis.types.URI[] anyURI) {
        this.anyURI = anyURI;
    }

    public org.apache.axis.types.URI getAnyURI(int i) {
        return this.anyURI[i];
    }

    public void setAnyURI(int i, org.apache.axis.types.URI _value) {
        this.anyURI[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAnyURI)) return false;
        ArrayOfAnyURI other = (ArrayOfAnyURI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anyURI==null && other.getAnyURI()==null) || 
             (this.anyURI!=null &&
              java.util.Arrays.equals(this.anyURI, other.getAnyURI())));
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
        if (getAnyURI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnyURI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnyURI(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAnyURI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfAnyURI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyURI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "anyURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
