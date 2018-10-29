/**
 * OvfConsumerUndeclaredSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfConsumerUndeclaredSection  extends com.vmware.converter.OvfConsumerCallbackFault  implements java.io.Serializable {
    private java.lang.String qualifiedSectionType;

    public OvfConsumerUndeclaredSection() {
    }

    public OvfConsumerUndeclaredSection(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String extensionKey,
           java.lang.String extensionName,
           java.lang.String qualifiedSectionType) {
        super(
            faultCause,
            faultMessage,
            extensionKey,
            extensionName);
        this.qualifiedSectionType = qualifiedSectionType;
    }


    /**
     * Gets the qualifiedSectionType value for this OvfConsumerUndeclaredSection.
     * 
     * @return qualifiedSectionType
     */
    public java.lang.String getQualifiedSectionType() {
        return qualifiedSectionType;
    }


    /**
     * Sets the qualifiedSectionType value for this OvfConsumerUndeclaredSection.
     * 
     * @param qualifiedSectionType
     */
    public void setQualifiedSectionType(java.lang.String qualifiedSectionType) {
        this.qualifiedSectionType = qualifiedSectionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfConsumerUndeclaredSection)) return false;
        OvfConsumerUndeclaredSection other = (OvfConsumerUndeclaredSection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.qualifiedSectionType==null && other.getQualifiedSectionType()==null) || 
             (this.qualifiedSectionType!=null &&
              this.qualifiedSectionType.equals(other.getQualifiedSectionType())));
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
        if (getQualifiedSectionType() != null) {
            _hashCode += getQualifiedSectionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfConsumerUndeclaredSection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerUndeclaredSection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedSectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "qualifiedSectionType"));
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
