/**
 * ArrayOfDvsApplyOperationFaultFaultOnObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDvsApplyOperationFaultFaultOnObject  implements java.io.Serializable {
    private com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] dvsApplyOperationFaultFaultOnObject;

    public ArrayOfDvsApplyOperationFaultFaultOnObject() {
    }

    public ArrayOfDvsApplyOperationFaultFaultOnObject(
           com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] dvsApplyOperationFaultFaultOnObject) {
           this.dvsApplyOperationFaultFaultOnObject = dvsApplyOperationFaultFaultOnObject;
    }


    /**
     * Gets the dvsApplyOperationFaultFaultOnObject value for this ArrayOfDvsApplyOperationFaultFaultOnObject.
     * 
     * @return dvsApplyOperationFaultFaultOnObject
     */
    public com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] getDvsApplyOperationFaultFaultOnObject() {
        return dvsApplyOperationFaultFaultOnObject;
    }


    /**
     * Sets the dvsApplyOperationFaultFaultOnObject value for this ArrayOfDvsApplyOperationFaultFaultOnObject.
     * 
     * @param dvsApplyOperationFaultFaultOnObject
     */
    public void setDvsApplyOperationFaultFaultOnObject(com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] dvsApplyOperationFaultFaultOnObject) {
        this.dvsApplyOperationFaultFaultOnObject = dvsApplyOperationFaultFaultOnObject;
    }

    public com.vmware.converter.DvsApplyOperationFaultFaultOnObject getDvsApplyOperationFaultFaultOnObject(int i) {
        return this.dvsApplyOperationFaultFaultOnObject[i];
    }

    public void setDvsApplyOperationFaultFaultOnObject(int i, com.vmware.converter.DvsApplyOperationFaultFaultOnObject _value) {
        this.dvsApplyOperationFaultFaultOnObject[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsApplyOperationFaultFaultOnObject)) return false;
        ArrayOfDvsApplyOperationFaultFaultOnObject other = (ArrayOfDvsApplyOperationFaultFaultOnObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsApplyOperationFaultFaultOnObject==null && other.getDvsApplyOperationFaultFaultOnObject()==null) || 
             (this.dvsApplyOperationFaultFaultOnObject!=null &&
              java.util.Arrays.equals(this.dvsApplyOperationFaultFaultOnObject, other.getDvsApplyOperationFaultFaultOnObject())));
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
        if (getDvsApplyOperationFaultFaultOnObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsApplyOperationFaultFaultOnObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsApplyOperationFaultFaultOnObject(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsApplyOperationFaultFaultOnObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsApplyOperationFaultFaultOnObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsApplyOperationFaultFaultOnObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsApplyOperationFaultFaultOnObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsApplyOperationFaultFaultOnObject"));
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
