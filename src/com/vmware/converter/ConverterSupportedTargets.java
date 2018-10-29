/**
 * ConverterSupportedTargets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterSupportedTargets  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] supportedTargets;

    private java.lang.String[] supportedHostedTargets;

    public ConverterSupportedTargets() {
    }

    public ConverterSupportedTargets(
           java.lang.String[] supportedTargets,
           java.lang.String[] supportedHostedTargets) {
        this.supportedTargets = supportedTargets;
        this.supportedHostedTargets = supportedHostedTargets;
    }


    /**
     * Gets the supportedTargets value for this ConverterSupportedTargets.
     * 
     * @return supportedTargets
     */
    public java.lang.String[] getSupportedTargets() {
        return supportedTargets;
    }


    /**
     * Sets the supportedTargets value for this ConverterSupportedTargets.
     * 
     * @param supportedTargets
     */
    public void setSupportedTargets(java.lang.String[] supportedTargets) {
        this.supportedTargets = supportedTargets;
    }

    public java.lang.String getSupportedTargets(int i) {
        return this.supportedTargets[i];
    }

    public void setSupportedTargets(int i, java.lang.String _value) {
        this.supportedTargets[i] = _value;
    }


    /**
     * Gets the supportedHostedTargets value for this ConverterSupportedTargets.
     * 
     * @return supportedHostedTargets
     */
    public java.lang.String[] getSupportedHostedTargets() {
        return supportedHostedTargets;
    }


    /**
     * Sets the supportedHostedTargets value for this ConverterSupportedTargets.
     * 
     * @param supportedHostedTargets
     */
    public void setSupportedHostedTargets(java.lang.String[] supportedHostedTargets) {
        this.supportedHostedTargets = supportedHostedTargets;
    }

    public java.lang.String getSupportedHostedTargets(int i) {
        return this.supportedHostedTargets[i];
    }

    public void setSupportedHostedTargets(int i, java.lang.String _value) {
        this.supportedHostedTargets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterSupportedTargets)) return false;
        ConverterSupportedTargets other = (ConverterSupportedTargets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.supportedTargets==null && other.getSupportedTargets()==null) || 
             (this.supportedTargets!=null &&
              java.util.Arrays.equals(this.supportedTargets, other.getSupportedTargets()))) &&
            ((this.supportedHostedTargets==null && other.getSupportedHostedTargets()==null) || 
             (this.supportedHostedTargets!=null &&
              java.util.Arrays.equals(this.supportedHostedTargets, other.getSupportedHostedTargets())));
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
        if (getSupportedTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedTargets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportedHostedTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedHostedTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedHostedTargets(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterSupportedTargets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSupportedTargets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedHostedTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedHostedTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
