/**
 * ConverterInvalidTargetProductVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterInvalidTargetProductVersion  extends com.vmware.converter.ConverterConverterFault  implements java.io.Serializable {
    private java.lang.String targetProductVersion;

    public ConverterInvalidTargetProductVersion() {
    }

    public ConverterInvalidTargetProductVersion(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String targetProductVersion) {
        super(
            faultCause,
            faultMessage);
        this.targetProductVersion = targetProductVersion;
    }


    /**
     * Gets the targetProductVersion value for this ConverterInvalidTargetProductVersion.
     * 
     * @return targetProductVersion
     */
    public java.lang.String getTargetProductVersion() {
        return targetProductVersion;
    }


    /**
     * Sets the targetProductVersion value for this ConverterInvalidTargetProductVersion.
     * 
     * @param targetProductVersion
     */
    public void setTargetProductVersion(java.lang.String targetProductVersion) {
        this.targetProductVersion = targetProductVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterInvalidTargetProductVersion)) return false;
        ConverterInvalidTargetProductVersion other = (ConverterInvalidTargetProductVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetProductVersion==null && other.getTargetProductVersion()==null) || 
             (this.targetProductVersion!=null &&
              this.targetProductVersion.equals(other.getTargetProductVersion())));
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
        if (getTargetProductVersion() != null) {
            _hashCode += getTargetProductVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterInvalidTargetProductVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterInvalidTargetProductVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetProductVersion"));
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
