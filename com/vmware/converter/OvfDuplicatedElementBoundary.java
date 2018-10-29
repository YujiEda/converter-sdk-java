/**
 * OvfDuplicatedElementBoundary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfDuplicatedElementBoundary  extends com.vmware.converter.OvfElement  implements java.io.Serializable {
    private java.lang.String boundary;

    public OvfDuplicatedElementBoundary() {
    }

    public OvfDuplicatedElementBoundary(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int lineNumber,
           java.lang.String name,
           java.lang.String boundary) {
        super(
            faultCause,
            faultMessage,
            lineNumber,
            name);
        this.boundary = boundary;
    }


    /**
     * Gets the boundary value for this OvfDuplicatedElementBoundary.
     * 
     * @return boundary
     */
    public java.lang.String getBoundary() {
        return boundary;
    }


    /**
     * Sets the boundary value for this OvfDuplicatedElementBoundary.
     * 
     * @param boundary
     */
    public void setBoundary(java.lang.String boundary) {
        this.boundary = boundary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfDuplicatedElementBoundary)) return false;
        OvfDuplicatedElementBoundary other = (OvfDuplicatedElementBoundary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.boundary==null && other.getBoundary()==null) || 
             (this.boundary!=null &&
              this.boundary.equals(other.getBoundary())));
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
        if (getBoundary() != null) {
            _hashCode += getBoundary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfDuplicatedElementBoundary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfDuplicatedElementBoundary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "boundary"));
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
