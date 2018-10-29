/**
 * ConverterCustomizationFailedOptionValueNotSupportedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCustomizationFailedOptionValueNotSupportedEvent  extends com.vmware.converter.ConverterCustomizationFailedEvent  implements java.io.Serializable {
    private java.lang.String option;

    private java.lang.String valueList;

    public ConverterCustomizationFailedOptionValueNotSupportedEvent() {
    }

    public ConverterCustomizationFailedOptionValueNotSupportedEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String option,
           java.lang.String valueList) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job);
        this.option = option;
        this.valueList = valueList;
    }


    /**
     * Gets the option value for this ConverterCustomizationFailedOptionValueNotSupportedEvent.
     * 
     * @return option
     */
    public java.lang.String getOption() {
        return option;
    }


    /**
     * Sets the option value for this ConverterCustomizationFailedOptionValueNotSupportedEvent.
     * 
     * @param option
     */
    public void setOption(java.lang.String option) {
        this.option = option;
    }


    /**
     * Gets the valueList value for this ConverterCustomizationFailedOptionValueNotSupportedEvent.
     * 
     * @return valueList
     */
    public java.lang.String getValueList() {
        return valueList;
    }


    /**
     * Sets the valueList value for this ConverterCustomizationFailedOptionValueNotSupportedEvent.
     * 
     * @param valueList
     */
    public void setValueList(java.lang.String valueList) {
        this.valueList = valueList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCustomizationFailedOptionValueNotSupportedEvent)) return false;
        ConverterCustomizationFailedOptionValueNotSupportedEvent other = (ConverterCustomizationFailedOptionValueNotSupportedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.valueList==null && other.getValueList()==null) || 
             (this.valueList!=null &&
              this.valueList.equals(other.getValueList())));
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
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getValueList() != null) {
            _hashCode += getValueList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCustomizationFailedOptionValueNotSupportedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCustomizationFailedOptionValueNotSupportedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "valueList"));
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
