/**
 * IpRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IpRange  extends com.vmware.converter.IpAddress  implements java.io.Serializable {
    private java.lang.String addressPrefix;

    private java.lang.Integer prefixLength;

    public IpRange() {
    }

    public IpRange(
           java.lang.Boolean negate,
           java.lang.String addressPrefix,
           java.lang.Integer prefixLength) {
        super(
            negate);
        this.addressPrefix = addressPrefix;
        this.prefixLength = prefixLength;
    }


    /**
     * Gets the addressPrefix value for this IpRange.
     * 
     * @return addressPrefix
     */
    public java.lang.String getAddressPrefix() {
        return addressPrefix;
    }


    /**
     * Sets the addressPrefix value for this IpRange.
     * 
     * @param addressPrefix
     */
    public void setAddressPrefix(java.lang.String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }


    /**
     * Gets the prefixLength value for this IpRange.
     * 
     * @return prefixLength
     */
    public java.lang.Integer getPrefixLength() {
        return prefixLength;
    }


    /**
     * Sets the prefixLength value for this IpRange.
     * 
     * @param prefixLength
     */
    public void setPrefixLength(java.lang.Integer prefixLength) {
        this.prefixLength = prefixLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpRange)) return false;
        IpRange other = (IpRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressPrefix==null && other.getAddressPrefix()==null) || 
             (this.addressPrefix!=null &&
              this.addressPrefix.equals(other.getAddressPrefix()))) &&
            ((this.prefixLength==null && other.getPrefixLength()==null) || 
             (this.prefixLength!=null &&
              this.prefixLength.equals(other.getPrefixLength())));
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
        if (getAddressPrefix() != null) {
            _hashCode += getAddressPrefix().hashCode();
        }
        if (getPrefixLength() != null) {
            _hashCode += getPrefixLength().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addressPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
