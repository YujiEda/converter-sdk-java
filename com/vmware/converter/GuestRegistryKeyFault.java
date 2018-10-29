/**
 * GuestRegistryKeyFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestRegistryKeyFault  extends com.vmware.converter.GuestRegistryFault  implements java.io.Serializable {
    private java.lang.String keyName;

    public GuestRegistryKeyFault() {
    }

    public GuestRegistryKeyFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           long windowsSystemErrorCode,
           java.lang.String keyName) {
        super(
            faultCause,
            faultMessage,
            windowsSystemErrorCode);
        this.keyName = keyName;
    }


    /**
     * Gets the keyName value for this GuestRegistryKeyFault.
     * 
     * @return keyName
     */
    public java.lang.String getKeyName() {
        return keyName;
    }


    /**
     * Sets the keyName value for this GuestRegistryKeyFault.
     * 
     * @param keyName
     */
    public void setKeyName(java.lang.String keyName) {
        this.keyName = keyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestRegistryKeyFault)) return false;
        GuestRegistryKeyFault other = (GuestRegistryKeyFault) obj;
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
              this.keyName.equals(other.getKeyName())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestRegistryKeyFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegistryKeyFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "keyName"));
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
