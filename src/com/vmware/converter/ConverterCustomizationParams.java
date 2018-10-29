/**
 * ConverterCustomizationParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCustomizationParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.CustomizationSpec specification;

    private java.lang.String deployCabContentPath;

    public ConverterCustomizationParams() {
    }

    public ConverterCustomizationParams(
           com.vmware.converter.CustomizationSpec specification,
           java.lang.String deployCabContentPath) {
        this.specification = specification;
        this.deployCabContentPath = deployCabContentPath;
    }


    /**
     * Gets the specification value for this ConverterCustomizationParams.
     * 
     * @return specification
     */
    public com.vmware.converter.CustomizationSpec getSpecification() {
        return specification;
    }


    /**
     * Sets the specification value for this ConverterCustomizationParams.
     * 
     * @param specification
     */
    public void setSpecification(com.vmware.converter.CustomizationSpec specification) {
        this.specification = specification;
    }


    /**
     * Gets the deployCabContentPath value for this ConverterCustomizationParams.
     * 
     * @return deployCabContentPath
     */
    public java.lang.String getDeployCabContentPath() {
        return deployCabContentPath;
    }


    /**
     * Sets the deployCabContentPath value for this ConverterCustomizationParams.
     * 
     * @param deployCabContentPath
     */
    public void setDeployCabContentPath(java.lang.String deployCabContentPath) {
        this.deployCabContentPath = deployCabContentPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCustomizationParams)) return false;
        ConverterCustomizationParams other = (ConverterCustomizationParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.specification==null && other.getSpecification()==null) || 
             (this.specification!=null &&
              this.specification.equals(other.getSpecification()))) &&
            ((this.deployCabContentPath==null && other.getDeployCabContentPath()==null) || 
             (this.deployCabContentPath!=null &&
              this.deployCabContentPath.equals(other.getDeployCabContentPath())));
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
        if (getSpecification() != null) {
            _hashCode += getSpecification().hashCode();
        }
        if (getDeployCabContentPath() != null) {
            _hashCode += getDeployCabContentPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCustomizationParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCustomizationParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "specification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployCabContentPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "deployCabContentPath"));
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
