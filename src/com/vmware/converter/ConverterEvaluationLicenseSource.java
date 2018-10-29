/**
 * ConverterEvaluationLicenseSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEvaluationLicenseSource  extends com.vmware.converter.ConverterLicenseSource  implements java.io.Serializable {
    private java.lang.Long remainingHours;

    public ConverterEvaluationLicenseSource() {
    }

    public ConverterEvaluationLicenseSource(
           java.lang.Long remainingHours) {
        this.remainingHours = remainingHours;
    }


    /**
     * Gets the remainingHours value for this ConverterEvaluationLicenseSource.
     * 
     * @return remainingHours
     */
    public java.lang.Long getRemainingHours() {
        return remainingHours;
    }


    /**
     * Sets the remainingHours value for this ConverterEvaluationLicenseSource.
     * 
     * @param remainingHours
     */
    public void setRemainingHours(java.lang.Long remainingHours) {
        this.remainingHours = remainingHours;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEvaluationLicenseSource)) return false;
        ConverterEvaluationLicenseSource other = (ConverterEvaluationLicenseSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.remainingHours==null && other.getRemainingHours()==null) || 
             (this.remainingHours!=null &&
              this.remainingHours.equals(other.getRemainingHours())));
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
        if (getRemainingHours() != null) {
            _hashCode += getRemainingHours().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterEvaluationLicenseSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEvaluationLicenseSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "remainingHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
