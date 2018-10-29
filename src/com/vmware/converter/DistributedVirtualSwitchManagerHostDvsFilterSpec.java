/**
 * DistributedVirtualSwitchManagerHostDvsFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchManagerHostDvsFilterSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean inclusive;

    public DistributedVirtualSwitchManagerHostDvsFilterSpec() {
    }

    public DistributedVirtualSwitchManagerHostDvsFilterSpec(
           boolean inclusive) {
        this.inclusive = inclusive;
    }


    /**
     * Gets the inclusive value for this DistributedVirtualSwitchManagerHostDvsFilterSpec.
     * 
     * @return inclusive
     */
    public boolean isInclusive() {
        return inclusive;
    }


    /**
     * Sets the inclusive value for this DistributedVirtualSwitchManagerHostDvsFilterSpec.
     * 
     * @param inclusive
     */
    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchManagerHostDvsFilterSpec)) return false;
        DistributedVirtualSwitchManagerHostDvsFilterSpec other = (DistributedVirtualSwitchManagerHostDvsFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.inclusive == other.isInclusive();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isInclusive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchManagerHostDvsFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostDvsFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
