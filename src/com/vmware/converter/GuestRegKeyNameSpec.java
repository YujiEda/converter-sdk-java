/**
 * GuestRegKeyNameSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestRegKeyNameSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String registryPath;

    private java.lang.String wowBitness;

    public GuestRegKeyNameSpec() {
    }

    public GuestRegKeyNameSpec(
           java.lang.String registryPath,
           java.lang.String wowBitness) {
        this.registryPath = registryPath;
        this.wowBitness = wowBitness;
    }


    /**
     * Gets the registryPath value for this GuestRegKeyNameSpec.
     * 
     * @return registryPath
     */
    public java.lang.String getRegistryPath() {
        return registryPath;
    }


    /**
     * Sets the registryPath value for this GuestRegKeyNameSpec.
     * 
     * @param registryPath
     */
    public void setRegistryPath(java.lang.String registryPath) {
        this.registryPath = registryPath;
    }


    /**
     * Gets the wowBitness value for this GuestRegKeyNameSpec.
     * 
     * @return wowBitness
     */
    public java.lang.String getWowBitness() {
        return wowBitness;
    }


    /**
     * Sets the wowBitness value for this GuestRegKeyNameSpec.
     * 
     * @param wowBitness
     */
    public void setWowBitness(java.lang.String wowBitness) {
        this.wowBitness = wowBitness;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestRegKeyNameSpec)) return false;
        GuestRegKeyNameSpec other = (GuestRegKeyNameSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registryPath==null && other.getRegistryPath()==null) || 
             (this.registryPath!=null &&
              this.registryPath.equals(other.getRegistryPath()))) &&
            ((this.wowBitness==null && other.getWowBitness()==null) || 
             (this.wowBitness!=null &&
              this.wowBitness.equals(other.getWowBitness())));
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
        if (getRegistryPath() != null) {
            _hashCode += getRegistryPath().hashCode();
        }
        if (getWowBitness() != null) {
            _hashCode += getWowBitness().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestRegKeyNameSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegKeyNameSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "registryPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wowBitness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wowBitness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
