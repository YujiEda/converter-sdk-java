/**
 * GuestRegValueNameSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestRegValueNameSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.GuestRegKeyNameSpec keyName;

    private java.lang.String name;

    public GuestRegValueNameSpec() {
    }

    public GuestRegValueNameSpec(
           com.vmware.converter.GuestRegKeyNameSpec keyName,
           java.lang.String name) {
        this.keyName = keyName;
        this.name = name;
    }


    /**
     * Gets the keyName value for this GuestRegValueNameSpec.
     * 
     * @return keyName
     */
    public com.vmware.converter.GuestRegKeyNameSpec getKeyName() {
        return keyName;
    }


    /**
     * Sets the keyName value for this GuestRegValueNameSpec.
     * 
     * @param keyName
     */
    public void setKeyName(com.vmware.converter.GuestRegKeyNameSpec keyName) {
        this.keyName = keyName;
    }


    /**
     * Gets the name value for this GuestRegValueNameSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GuestRegValueNameSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestRegValueNameSpec)) return false;
        GuestRegValueNameSpec other = (GuestRegValueNameSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyName==null && other.getKeyName()==null) || 
             (this.keyName!=null &&
              this.keyName.equals(other.getKeyName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getKeyName() != null) {
            _hashCode += getKeyName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestRegValueNameSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegValueNameSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "keyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegKeyNameSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
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
