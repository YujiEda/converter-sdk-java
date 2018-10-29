/**
 * ConverterSysinfoQueryBadThumbprintFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterSysinfoQueryBadThumbprintFault  extends com.vmware.converter.ConverterSysinfoQueryFault  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.String thumbprint;

    public ConverterSysinfoQueryBadThumbprintFault() {
    }

    public ConverterSysinfoQueryBadThumbprintFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String description,
           java.lang.String hostname,
           java.lang.String thumbprint) {
        super(
            faultCause,
            faultMessage,
            description);
        this.hostname = hostname;
        this.thumbprint = thumbprint;
    }


    /**
     * Gets the hostname value for this ConverterSysinfoQueryBadThumbprintFault.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterSysinfoQueryBadThumbprintFault.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the thumbprint value for this ConverterSysinfoQueryBadThumbprintFault.
     * 
     * @return thumbprint
     */
    public java.lang.String getThumbprint() {
        return thumbprint;
    }


    /**
     * Sets the thumbprint value for this ConverterSysinfoQueryBadThumbprintFault.
     * 
     * @param thumbprint
     */
    public void setThumbprint(java.lang.String thumbprint) {
        this.thumbprint = thumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterSysinfoQueryBadThumbprintFault)) return false;
        ConverterSysinfoQueryBadThumbprintFault other = (ConverterSysinfoQueryBadThumbprintFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.thumbprint==null && other.getThumbprint()==null) || 
             (this.thumbprint!=null &&
              this.thumbprint.equals(other.getThumbprint())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getThumbprint() != null) {
            _hashCode += getThumbprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterSysinfoQueryBadThumbprintFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSysinfoQueryBadThumbprintFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "thumbprint"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
