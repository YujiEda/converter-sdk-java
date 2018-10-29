/**
 * ArrayOfVAppCloneSpecResourceMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVAppCloneSpecResourceMap  implements java.io.Serializable {
    private com.vmware.converter.VAppCloneSpecResourceMap[] VAppCloneSpecResourceMap;

    public ArrayOfVAppCloneSpecResourceMap() {
    }

    public ArrayOfVAppCloneSpecResourceMap(
           com.vmware.converter.VAppCloneSpecResourceMap[] VAppCloneSpecResourceMap) {
           this.VAppCloneSpecResourceMap = VAppCloneSpecResourceMap;
    }


    /**
     * Gets the VAppCloneSpecResourceMap value for this ArrayOfVAppCloneSpecResourceMap.
     * 
     * @return VAppCloneSpecResourceMap
     */
    public com.vmware.converter.VAppCloneSpecResourceMap[] getVAppCloneSpecResourceMap() {
        return VAppCloneSpecResourceMap;
    }


    /**
     * Sets the VAppCloneSpecResourceMap value for this ArrayOfVAppCloneSpecResourceMap.
     * 
     * @param VAppCloneSpecResourceMap
     */
    public void setVAppCloneSpecResourceMap(com.vmware.converter.VAppCloneSpecResourceMap[] VAppCloneSpecResourceMap) {
        this.VAppCloneSpecResourceMap = VAppCloneSpecResourceMap;
    }

    public com.vmware.converter.VAppCloneSpecResourceMap getVAppCloneSpecResourceMap(int i) {
        return this.VAppCloneSpecResourceMap[i];
    }

    public void setVAppCloneSpecResourceMap(int i, com.vmware.converter.VAppCloneSpecResourceMap _value) {
        this.VAppCloneSpecResourceMap[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVAppCloneSpecResourceMap)) return false;
        ArrayOfVAppCloneSpecResourceMap other = (ArrayOfVAppCloneSpecResourceMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VAppCloneSpecResourceMap==null && other.getVAppCloneSpecResourceMap()==null) || 
             (this.VAppCloneSpecResourceMap!=null &&
              java.util.Arrays.equals(this.VAppCloneSpecResourceMap, other.getVAppCloneSpecResourceMap())));
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
        if (getVAppCloneSpecResourceMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVAppCloneSpecResourceMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVAppCloneSpecResourceMap(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVAppCloneSpecResourceMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVAppCloneSpecResourceMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppCloneSpecResourceMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpecResourceMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpecResourceMap"));
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
