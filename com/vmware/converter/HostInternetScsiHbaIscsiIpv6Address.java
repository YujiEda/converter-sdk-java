/**
 * HostInternetScsiHbaIscsiIpv6Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostInternetScsiHbaIscsiIpv6Address  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String address;

    private int prefixLength;

    private java.lang.String origin;

    private java.lang.String operation;

    public HostInternetScsiHbaIscsiIpv6Address() {
    }

    public HostInternetScsiHbaIscsiIpv6Address(
           java.lang.String address,
           int prefixLength,
           java.lang.String origin,
           java.lang.String operation) {
        this.address = address;
        this.prefixLength = prefixLength;
        this.origin = origin;
        this.operation = operation;
    }


    /**
     * Gets the address value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the prefixLength value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @return prefixLength
     */
    public int getPrefixLength() {
        return prefixLength;
    }


    /**
     * Sets the prefixLength value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @param prefixLength
     */
    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }


    /**
     * Gets the origin value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the operation value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this HostInternetScsiHbaIscsiIpv6Address.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaIscsiIpv6Address)) return false;
        HostInternetScsiHbaIscsiIpv6Address other = (HostInternetScsiHbaIscsiIpv6Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.prefixLength == other.getPrefixLength() &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += getPrefixLength();
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaIscsiIpv6Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIscsiIpv6Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
