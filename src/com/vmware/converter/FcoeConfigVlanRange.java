/**
 * FcoeConfigVlanRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FcoeConfigVlanRange  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int vlanLow;

    private int vlanHigh;

    public FcoeConfigVlanRange() {
    }

    public FcoeConfigVlanRange(
           int vlanLow,
           int vlanHigh) {
        this.vlanLow = vlanLow;
        this.vlanHigh = vlanHigh;
    }


    /**
     * Gets the vlanLow value for this FcoeConfigVlanRange.
     * 
     * @return vlanLow
     */
    public int getVlanLow() {
        return vlanLow;
    }


    /**
     * Sets the vlanLow value for this FcoeConfigVlanRange.
     * 
     * @param vlanLow
     */
    public void setVlanLow(int vlanLow) {
        this.vlanLow = vlanLow;
    }


    /**
     * Gets the vlanHigh value for this FcoeConfigVlanRange.
     * 
     * @return vlanHigh
     */
    public int getVlanHigh() {
        return vlanHigh;
    }


    /**
     * Sets the vlanHigh value for this FcoeConfigVlanRange.
     * 
     * @param vlanHigh
     */
    public void setVlanHigh(int vlanHigh) {
        this.vlanHigh = vlanHigh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FcoeConfigVlanRange)) return false;
        FcoeConfigVlanRange other = (FcoeConfigVlanRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.vlanLow == other.getVlanLow() &&
            this.vlanHigh == other.getVlanHigh();
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
        _hashCode += getVlanLow();
        _hashCode += getVlanHigh();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FcoeConfigVlanRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigVlanRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
