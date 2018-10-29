/**
 * ArrayOfConverterDiagnosticManagerBundleContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterDiagnosticManagerBundleContent  implements java.io.Serializable {
    private com.vmware.converter.ConverterDiagnosticManagerBundleContent[] converterDiagnosticManagerBundleContent;

    public ArrayOfConverterDiagnosticManagerBundleContent() {
    }

    public ArrayOfConverterDiagnosticManagerBundleContent(
           com.vmware.converter.ConverterDiagnosticManagerBundleContent[] converterDiagnosticManagerBundleContent) {
           this.converterDiagnosticManagerBundleContent = converterDiagnosticManagerBundleContent;
    }


    /**
     * Gets the converterDiagnosticManagerBundleContent value for this ArrayOfConverterDiagnosticManagerBundleContent.
     * 
     * @return converterDiagnosticManagerBundleContent
     */
    public com.vmware.converter.ConverterDiagnosticManagerBundleContent[] getConverterDiagnosticManagerBundleContent() {
        return converterDiagnosticManagerBundleContent;
    }


    /**
     * Sets the converterDiagnosticManagerBundleContent value for this ArrayOfConverterDiagnosticManagerBundleContent.
     * 
     * @param converterDiagnosticManagerBundleContent
     */
    public void setConverterDiagnosticManagerBundleContent(com.vmware.converter.ConverterDiagnosticManagerBundleContent[] converterDiagnosticManagerBundleContent) {
        this.converterDiagnosticManagerBundleContent = converterDiagnosticManagerBundleContent;
    }

    public com.vmware.converter.ConverterDiagnosticManagerBundleContent getConverterDiagnosticManagerBundleContent(int i) {
        return this.converterDiagnosticManagerBundleContent[i];
    }

    public void setConverterDiagnosticManagerBundleContent(int i, com.vmware.converter.ConverterDiagnosticManagerBundleContent _value) {
        this.converterDiagnosticManagerBundleContent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterDiagnosticManagerBundleContent)) return false;
        ArrayOfConverterDiagnosticManagerBundleContent other = (ArrayOfConverterDiagnosticManagerBundleContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterDiagnosticManagerBundleContent==null && other.getConverterDiagnosticManagerBundleContent()==null) || 
             (this.converterDiagnosticManagerBundleContent!=null &&
              java.util.Arrays.equals(this.converterDiagnosticManagerBundleContent, other.getConverterDiagnosticManagerBundleContent())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConverterDiagnosticManagerBundleContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterDiagnosticManagerBundleContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterDiagnosticManagerBundleContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfConverterDiagnosticManagerBundleContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterDiagnosticManagerBundleContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterDiagnosticManagerBundleContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerBundleContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerBundleContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
