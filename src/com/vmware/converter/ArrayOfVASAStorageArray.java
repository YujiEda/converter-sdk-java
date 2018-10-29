/**
 * ArrayOfVASAStorageArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVASAStorageArray  implements java.io.Serializable {
    private com.vmware.converter.VASAStorageArray[] VASAStorageArray;

    public ArrayOfVASAStorageArray() {
    }

    public ArrayOfVASAStorageArray(
           com.vmware.converter.VASAStorageArray[] VASAStorageArray) {
           this.VASAStorageArray = VASAStorageArray;
    }


    /**
     * Gets the VASAStorageArray value for this ArrayOfVASAStorageArray.
     * 
     * @return VASAStorageArray
     */
    public com.vmware.converter.VASAStorageArray[] getVASAStorageArray() {
        return VASAStorageArray;
    }


    /**
     * Sets the VASAStorageArray value for this ArrayOfVASAStorageArray.
     * 
     * @param VASAStorageArray
     */
    public void setVASAStorageArray(com.vmware.converter.VASAStorageArray[] VASAStorageArray) {
        this.VASAStorageArray = VASAStorageArray;
    }

    public com.vmware.converter.VASAStorageArray getVASAStorageArray(int i) {
        return this.VASAStorageArray[i];
    }

    public void setVASAStorageArray(int i, com.vmware.converter.VASAStorageArray _value) {
        this.VASAStorageArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVASAStorageArray)) return false;
        ArrayOfVASAStorageArray other = (ArrayOfVASAStorageArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VASAStorageArray==null && other.getVASAStorageArray()==null) || 
             (this.VASAStorageArray!=null &&
              java.util.Arrays.equals(this.VASAStorageArray, other.getVASAStorageArray())));
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
        if (getVASAStorageArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVASAStorageArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVASAStorageArray(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVASAStorageArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVASAStorageArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VASAStorageArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VASAStorageArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VASAStorageArray"));
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
