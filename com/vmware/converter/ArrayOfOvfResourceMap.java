/**
 * ArrayOfOvfResourceMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfOvfResourceMap  implements java.io.Serializable {
    private com.vmware.converter.OvfResourceMap[] ovfResourceMap;

    public ArrayOfOvfResourceMap() {
    }

    public ArrayOfOvfResourceMap(
           com.vmware.converter.OvfResourceMap[] ovfResourceMap) {
           this.ovfResourceMap = ovfResourceMap;
    }


    /**
     * Gets the ovfResourceMap value for this ArrayOfOvfResourceMap.
     * 
     * @return ovfResourceMap
     */
    public com.vmware.converter.OvfResourceMap[] getOvfResourceMap() {
        return ovfResourceMap;
    }


    /**
     * Sets the ovfResourceMap value for this ArrayOfOvfResourceMap.
     * 
     * @param ovfResourceMap
     */
    public void setOvfResourceMap(com.vmware.converter.OvfResourceMap[] ovfResourceMap) {
        this.ovfResourceMap = ovfResourceMap;
    }

    public com.vmware.converter.OvfResourceMap getOvfResourceMap(int i) {
        return this.ovfResourceMap[i];
    }

    public void setOvfResourceMap(int i, com.vmware.converter.OvfResourceMap _value) {
        this.ovfResourceMap[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOvfResourceMap)) return false;
        ArrayOfOvfResourceMap other = (ArrayOfOvfResourceMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ovfResourceMap==null && other.getOvfResourceMap()==null) || 
             (this.ovfResourceMap!=null &&
              java.util.Arrays.equals(this.ovfResourceMap, other.getOvfResourceMap())));
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
        if (getOvfResourceMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfResourceMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfResourceMap(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOvfResourceMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfOvfResourceMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfResourceMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "OvfResourceMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfResourceMap"));
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
