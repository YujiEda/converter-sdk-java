/**
 * SSPIAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class SSPIAuthentication  extends com.vmware.converter.GuestAuthentication  implements java.io.Serializable {
    private java.lang.String sspiToken;

    public SSPIAuthentication() {
    }

    public SSPIAuthentication(
           boolean interactiveSession,
           java.lang.String sspiToken) {
        super(
            interactiveSession);
        this.sspiToken = sspiToken;
    }


    /**
     * Gets the sspiToken value for this SSPIAuthentication.
     * 
     * @return sspiToken
     */
    public java.lang.String getSspiToken() {
        return sspiToken;
    }


    /**
     * Sets the sspiToken value for this SSPIAuthentication.
     * 
     * @param sspiToken
     */
    public void setSspiToken(java.lang.String sspiToken) {
        this.sspiToken = sspiToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SSPIAuthentication)) return false;
        SSPIAuthentication other = (SSPIAuthentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sspiToken==null && other.getSspiToken()==null) || 
             (this.sspiToken!=null &&
              this.sspiToken.equals(other.getSspiToken())));
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
        if (getSspiToken() != null) {
            _hashCode += getSspiToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SSPIAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SSPIAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sspiToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sspiToken"));
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
