/**
 * ArrayOfConverterAgentInternalLegacyPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterAgentInternalLegacyPartition  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalLegacyPartition[] converterAgentInternalLegacyPartition;

    public ArrayOfConverterAgentInternalLegacyPartition() {
    }

    public ArrayOfConverterAgentInternalLegacyPartition(
           com.vmware.converter.ConverterAgentInternalLegacyPartition[] converterAgentInternalLegacyPartition) {
           this.converterAgentInternalLegacyPartition = converterAgentInternalLegacyPartition;
    }


    /**
     * Gets the converterAgentInternalLegacyPartition value for this ArrayOfConverterAgentInternalLegacyPartition.
     * 
     * @return converterAgentInternalLegacyPartition
     */
    public com.vmware.converter.ConverterAgentInternalLegacyPartition[] getConverterAgentInternalLegacyPartition() {
        return converterAgentInternalLegacyPartition;
    }


    /**
     * Sets the converterAgentInternalLegacyPartition value for this ArrayOfConverterAgentInternalLegacyPartition.
     * 
     * @param converterAgentInternalLegacyPartition
     */
    public void setConverterAgentInternalLegacyPartition(com.vmware.converter.ConverterAgentInternalLegacyPartition[] converterAgentInternalLegacyPartition) {
        this.converterAgentInternalLegacyPartition = converterAgentInternalLegacyPartition;
    }

    public com.vmware.converter.ConverterAgentInternalLegacyPartition getConverterAgentInternalLegacyPartition(int i) {
        return this.converterAgentInternalLegacyPartition[i];
    }

    public void setConverterAgentInternalLegacyPartition(int i, com.vmware.converter.ConverterAgentInternalLegacyPartition _value) {
        this.converterAgentInternalLegacyPartition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterAgentInternalLegacyPartition)) return false;
        ArrayOfConverterAgentInternalLegacyPartition other = (ArrayOfConverterAgentInternalLegacyPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterAgentInternalLegacyPartition==null && other.getConverterAgentInternalLegacyPartition()==null) || 
             (this.converterAgentInternalLegacyPartition!=null &&
              java.util.Arrays.equals(this.converterAgentInternalLegacyPartition, other.getConverterAgentInternalLegacyPartition())));
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
        if (getConverterAgentInternalLegacyPartition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterAgentInternalLegacyPartition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterAgentInternalLegacyPartition(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterAgentInternalLegacyPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterAgentInternalLegacyPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterAgentInternalLegacyPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLegacyPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLegacyPartition"));
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
