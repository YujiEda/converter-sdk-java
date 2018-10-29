/**
 * ArrayOfDatastoreMountPathDatastorePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDatastoreMountPathDatastorePair  implements java.io.Serializable {
    private com.vmware.converter.DatastoreMountPathDatastorePair[] datastoreMountPathDatastorePair;

    public ArrayOfDatastoreMountPathDatastorePair() {
    }

    public ArrayOfDatastoreMountPathDatastorePair(
           com.vmware.converter.DatastoreMountPathDatastorePair[] datastoreMountPathDatastorePair) {
           this.datastoreMountPathDatastorePair = datastoreMountPathDatastorePair;
    }


    /**
     * Gets the datastoreMountPathDatastorePair value for this ArrayOfDatastoreMountPathDatastorePair.
     * 
     * @return datastoreMountPathDatastorePair
     */
    public com.vmware.converter.DatastoreMountPathDatastorePair[] getDatastoreMountPathDatastorePair() {
        return datastoreMountPathDatastorePair;
    }


    /**
     * Sets the datastoreMountPathDatastorePair value for this ArrayOfDatastoreMountPathDatastorePair.
     * 
     * @param datastoreMountPathDatastorePair
     */
    public void setDatastoreMountPathDatastorePair(com.vmware.converter.DatastoreMountPathDatastorePair[] datastoreMountPathDatastorePair) {
        this.datastoreMountPathDatastorePair = datastoreMountPathDatastorePair;
    }

    public com.vmware.converter.DatastoreMountPathDatastorePair getDatastoreMountPathDatastorePair(int i) {
        return this.datastoreMountPathDatastorePair[i];
    }

    public void setDatastoreMountPathDatastorePair(int i, com.vmware.converter.DatastoreMountPathDatastorePair _value) {
        this.datastoreMountPathDatastorePair[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDatastoreMountPathDatastorePair)) return false;
        ArrayOfDatastoreMountPathDatastorePair other = (ArrayOfDatastoreMountPathDatastorePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datastoreMountPathDatastorePair==null && other.getDatastoreMountPathDatastorePair()==null) || 
             (this.datastoreMountPathDatastorePair!=null &&
              java.util.Arrays.equals(this.datastoreMountPathDatastorePair, other.getDatastoreMountPathDatastorePair())));
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
        if (getDatastoreMountPathDatastorePair() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreMountPathDatastorePair());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreMountPathDatastorePair(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDatastoreMountPathDatastorePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDatastoreMountPathDatastorePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreMountPathDatastorePair");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DatastoreMountPathDatastorePair"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreMountPathDatastorePair"));
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
