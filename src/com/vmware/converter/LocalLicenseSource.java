/**
 * LocalLicenseSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class LocalLicenseSource  extends com.vmware.converter.LicenseSource  implements java.io.Serializable {
    private java.lang.String licenseKeys;

    public LocalLicenseSource() {
    }

    public LocalLicenseSource(
           java.lang.String licenseKeys) {
        this.licenseKeys = licenseKeys;
    }


    /**
     * Gets the licenseKeys value for this LocalLicenseSource.
     * 
     * @return licenseKeys
     */
    public java.lang.String getLicenseKeys() {
        return licenseKeys;
    }


    /**
     * Sets the licenseKeys value for this LocalLicenseSource.
     * 
     * @param licenseKeys
     */
    public void setLicenseKeys(java.lang.String licenseKeys) {
        this.licenseKeys = licenseKeys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLicenseSource)) return false;
        LocalLicenseSource other = (LocalLicenseSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.licenseKeys==null && other.getLicenseKeys()==null) || 
             (this.licenseKeys!=null &&
              this.licenseKeys.equals(other.getLicenseKeys())));
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
        if (getLicenseKeys() != null) {
            _hashCode += getLicenseKeys().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLicenseSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalLicenseSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "licenseKeys"));
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
