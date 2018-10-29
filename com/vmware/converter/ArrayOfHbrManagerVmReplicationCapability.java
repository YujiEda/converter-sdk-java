/**
 * ArrayOfHbrManagerVmReplicationCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHbrManagerVmReplicationCapability  implements java.io.Serializable {
    private com.vmware.converter.HbrManagerVmReplicationCapability[] hbrManagerVmReplicationCapability;

    public ArrayOfHbrManagerVmReplicationCapability() {
    }

    public ArrayOfHbrManagerVmReplicationCapability(
           com.vmware.converter.HbrManagerVmReplicationCapability[] hbrManagerVmReplicationCapability) {
           this.hbrManagerVmReplicationCapability = hbrManagerVmReplicationCapability;
    }


    /**
     * Gets the hbrManagerVmReplicationCapability value for this ArrayOfHbrManagerVmReplicationCapability.
     * 
     * @return hbrManagerVmReplicationCapability
     */
    public com.vmware.converter.HbrManagerVmReplicationCapability[] getHbrManagerVmReplicationCapability() {
        return hbrManagerVmReplicationCapability;
    }


    /**
     * Sets the hbrManagerVmReplicationCapability value for this ArrayOfHbrManagerVmReplicationCapability.
     * 
     * @param hbrManagerVmReplicationCapability
     */
    public void setHbrManagerVmReplicationCapability(com.vmware.converter.HbrManagerVmReplicationCapability[] hbrManagerVmReplicationCapability) {
        this.hbrManagerVmReplicationCapability = hbrManagerVmReplicationCapability;
    }

    public com.vmware.converter.HbrManagerVmReplicationCapability getHbrManagerVmReplicationCapability(int i) {
        return this.hbrManagerVmReplicationCapability[i];
    }

    public void setHbrManagerVmReplicationCapability(int i, com.vmware.converter.HbrManagerVmReplicationCapability _value) {
        this.hbrManagerVmReplicationCapability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHbrManagerVmReplicationCapability)) return false;
        ArrayOfHbrManagerVmReplicationCapability other = (ArrayOfHbrManagerVmReplicationCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hbrManagerVmReplicationCapability==null && other.getHbrManagerVmReplicationCapability()==null) || 
             (this.hbrManagerVmReplicationCapability!=null &&
              java.util.Arrays.equals(this.hbrManagerVmReplicationCapability, other.getHbrManagerVmReplicationCapability())));
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
        if (getHbrManagerVmReplicationCapability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHbrManagerVmReplicationCapability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHbrManagerVmReplicationCapability(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHbrManagerVmReplicationCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHbrManagerVmReplicationCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hbrManagerVmReplicationCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HbrManagerVmReplicationCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HbrManagerVmReplicationCapability"));
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
