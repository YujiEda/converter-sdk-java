/**
 * ArrayOfVAppCloneSpecNetworkMappingPair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVAppCloneSpecNetworkMappingPair  implements java.io.Serializable {
    private com.vmware.converter.VAppCloneSpecNetworkMappingPair[] VAppCloneSpecNetworkMappingPair;

    public ArrayOfVAppCloneSpecNetworkMappingPair() {
    }

    public ArrayOfVAppCloneSpecNetworkMappingPair(
           com.vmware.converter.VAppCloneSpecNetworkMappingPair[] VAppCloneSpecNetworkMappingPair) {
           this.VAppCloneSpecNetworkMappingPair = VAppCloneSpecNetworkMappingPair;
    }


    /**
     * Gets the VAppCloneSpecNetworkMappingPair value for this ArrayOfVAppCloneSpecNetworkMappingPair.
     * 
     * @return VAppCloneSpecNetworkMappingPair
     */
    public com.vmware.converter.VAppCloneSpecNetworkMappingPair[] getVAppCloneSpecNetworkMappingPair() {
        return VAppCloneSpecNetworkMappingPair;
    }


    /**
     * Sets the VAppCloneSpecNetworkMappingPair value for this ArrayOfVAppCloneSpecNetworkMappingPair.
     * 
     * @param VAppCloneSpecNetworkMappingPair
     */
    public void setVAppCloneSpecNetworkMappingPair(com.vmware.converter.VAppCloneSpecNetworkMappingPair[] VAppCloneSpecNetworkMappingPair) {
        this.VAppCloneSpecNetworkMappingPair = VAppCloneSpecNetworkMappingPair;
    }

    public com.vmware.converter.VAppCloneSpecNetworkMappingPair getVAppCloneSpecNetworkMappingPair(int i) {
        return this.VAppCloneSpecNetworkMappingPair[i];
    }

    public void setVAppCloneSpecNetworkMappingPair(int i, com.vmware.converter.VAppCloneSpecNetworkMappingPair _value) {
        this.VAppCloneSpecNetworkMappingPair[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVAppCloneSpecNetworkMappingPair)) return false;
        ArrayOfVAppCloneSpecNetworkMappingPair other = (ArrayOfVAppCloneSpecNetworkMappingPair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VAppCloneSpecNetworkMappingPair==null && other.getVAppCloneSpecNetworkMappingPair()==null) || 
             (this.VAppCloneSpecNetworkMappingPair!=null &&
              java.util.Arrays.equals(this.VAppCloneSpecNetworkMappingPair, other.getVAppCloneSpecNetworkMappingPair())));
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
        if (getVAppCloneSpecNetworkMappingPair() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVAppCloneSpecNetworkMappingPair());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVAppCloneSpecNetworkMappingPair(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVAppCloneSpecNetworkMappingPair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVAppCloneSpecNetworkMappingPair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppCloneSpecNetworkMappingPair");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpecNetworkMappingPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpecNetworkMappingPair"));
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
