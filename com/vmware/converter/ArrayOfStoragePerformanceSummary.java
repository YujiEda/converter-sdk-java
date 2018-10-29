/**
 * ArrayOfStoragePerformanceSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfStoragePerformanceSummary  implements java.io.Serializable {
    private com.vmware.converter.StoragePerformanceSummary[] storagePerformanceSummary;

    public ArrayOfStoragePerformanceSummary() {
    }

    public ArrayOfStoragePerformanceSummary(
           com.vmware.converter.StoragePerformanceSummary[] storagePerformanceSummary) {
           this.storagePerformanceSummary = storagePerformanceSummary;
    }


    /**
     * Gets the storagePerformanceSummary value for this ArrayOfStoragePerformanceSummary.
     * 
     * @return storagePerformanceSummary
     */
    public com.vmware.converter.StoragePerformanceSummary[] getStoragePerformanceSummary() {
        return storagePerformanceSummary;
    }


    /**
     * Sets the storagePerformanceSummary value for this ArrayOfStoragePerformanceSummary.
     * 
     * @param storagePerformanceSummary
     */
    public void setStoragePerformanceSummary(com.vmware.converter.StoragePerformanceSummary[] storagePerformanceSummary) {
        this.storagePerformanceSummary = storagePerformanceSummary;
    }

    public com.vmware.converter.StoragePerformanceSummary getStoragePerformanceSummary(int i) {
        return this.storagePerformanceSummary[i];
    }

    public void setStoragePerformanceSummary(int i, com.vmware.converter.StoragePerformanceSummary _value) {
        this.storagePerformanceSummary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfStoragePerformanceSummary)) return false;
        ArrayOfStoragePerformanceSummary other = (ArrayOfStoragePerformanceSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storagePerformanceSummary==null && other.getStoragePerformanceSummary()==null) || 
             (this.storagePerformanceSummary!=null &&
              java.util.Arrays.equals(this.storagePerformanceSummary, other.getStoragePerformanceSummary())));
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
        if (getStoragePerformanceSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoragePerformanceSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoragePerformanceSummary(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfStoragePerformanceSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfStoragePerformanceSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagePerformanceSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "StoragePerformanceSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StoragePerformanceSummary"));
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
