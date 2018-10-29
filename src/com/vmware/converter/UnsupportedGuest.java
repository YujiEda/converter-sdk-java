/**
 * UnsupportedGuest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class UnsupportedGuest  extends com.vmware.converter.InvalidVmConfig  implements java.io.Serializable {
    private java.lang.String unsupportedGuestOS;

    public UnsupportedGuest() {
    }

    public UnsupportedGuest(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String property,
           java.lang.String unsupportedGuestOS) {
        super(
            faultCause,
            faultMessage,
            property);
        this.unsupportedGuestOS = unsupportedGuestOS;
    }


    /**
     * Gets the unsupportedGuestOS value for this UnsupportedGuest.
     * 
     * @return unsupportedGuestOS
     */
    public java.lang.String getUnsupportedGuestOS() {
        return unsupportedGuestOS;
    }


    /**
     * Sets the unsupportedGuestOS value for this UnsupportedGuest.
     * 
     * @param unsupportedGuestOS
     */
    public void setUnsupportedGuestOS(java.lang.String unsupportedGuestOS) {
        this.unsupportedGuestOS = unsupportedGuestOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnsupportedGuest)) return false;
        UnsupportedGuest other = (UnsupportedGuest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unsupportedGuestOS==null && other.getUnsupportedGuestOS()==null) || 
             (this.unsupportedGuestOS!=null &&
              this.unsupportedGuestOS.equals(other.getUnsupportedGuestOS())));
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
        if (getUnsupportedGuestOS() != null) {
            _hashCode += getUnsupportedGuestOS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnsupportedGuest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UnsupportedGuest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsupportedGuestOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unsupportedGuestOS"));
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
