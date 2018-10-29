/**
 * ConverterEstimationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEstimationResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Float percentComplete;

    private java.lang.Integer estimatedTimeRemainingInSec;

    public ConverterEstimationResult() {
    }

    public ConverterEstimationResult(
           java.lang.Float percentComplete,
           java.lang.Integer estimatedTimeRemainingInSec) {
        this.percentComplete = percentComplete;
        this.estimatedTimeRemainingInSec = estimatedTimeRemainingInSec;
    }


    /**
     * Gets the percentComplete value for this ConverterEstimationResult.
     * 
     * @return percentComplete
     */
    public java.lang.Float getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this ConverterEstimationResult.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Float percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the estimatedTimeRemainingInSec value for this ConverterEstimationResult.
     * 
     * @return estimatedTimeRemainingInSec
     */
    public java.lang.Integer getEstimatedTimeRemainingInSec() {
        return estimatedTimeRemainingInSec;
    }


    /**
     * Sets the estimatedTimeRemainingInSec value for this ConverterEstimationResult.
     * 
     * @param estimatedTimeRemainingInSec
     */
    public void setEstimatedTimeRemainingInSec(java.lang.Integer estimatedTimeRemainingInSec) {
        this.estimatedTimeRemainingInSec = estimatedTimeRemainingInSec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEstimationResult)) return false;
        ConverterEstimationResult other = (ConverterEstimationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.estimatedTimeRemainingInSec==null && other.getEstimatedTimeRemainingInSec()==null) || 
             (this.estimatedTimeRemainingInSec!=null &&
              this.estimatedTimeRemainingInSec.equals(other.getEstimatedTimeRemainingInSec())));
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
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (getEstimatedTimeRemainingInSec() != null) {
            _hashCode += getEstimatedTimeRemainingInSec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterEstimationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEstimationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeRemainingInSec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "estimatedTimeRemainingInSec"));
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
