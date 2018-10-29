/**
 * ArrayOfConverterAgentInternalDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterAgentInternalDiskSpec  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalDiskSpec[] converterAgentInternalDiskSpec;

    public ArrayOfConverterAgentInternalDiskSpec() {
    }

    public ArrayOfConverterAgentInternalDiskSpec(
           com.vmware.converter.ConverterAgentInternalDiskSpec[] converterAgentInternalDiskSpec) {
           this.converterAgentInternalDiskSpec = converterAgentInternalDiskSpec;
    }


    /**
     * Gets the converterAgentInternalDiskSpec value for this ArrayOfConverterAgentInternalDiskSpec.
     * 
     * @return converterAgentInternalDiskSpec
     */
    public com.vmware.converter.ConverterAgentInternalDiskSpec[] getConverterAgentInternalDiskSpec() {
        return converterAgentInternalDiskSpec;
    }


    /**
     * Sets the converterAgentInternalDiskSpec value for this ArrayOfConverterAgentInternalDiskSpec.
     * 
     * @param converterAgentInternalDiskSpec
     */
    public void setConverterAgentInternalDiskSpec(com.vmware.converter.ConverterAgentInternalDiskSpec[] converterAgentInternalDiskSpec) {
        this.converterAgentInternalDiskSpec = converterAgentInternalDiskSpec;
    }

    public com.vmware.converter.ConverterAgentInternalDiskSpec getConverterAgentInternalDiskSpec(int i) {
        return this.converterAgentInternalDiskSpec[i];
    }

    public void setConverterAgentInternalDiskSpec(int i, com.vmware.converter.ConverterAgentInternalDiskSpec _value) {
        this.converterAgentInternalDiskSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterAgentInternalDiskSpec)) return false;
        ArrayOfConverterAgentInternalDiskSpec other = (ArrayOfConverterAgentInternalDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterAgentInternalDiskSpec==null && other.getConverterAgentInternalDiskSpec()==null) || 
             (this.converterAgentInternalDiskSpec!=null &&
              java.util.Arrays.equals(this.converterAgentInternalDiskSpec, other.getConverterAgentInternalDiskSpec())));
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
        if (getConverterAgentInternalDiskSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterAgentInternalDiskSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterAgentInternalDiskSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterAgentInternalDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterAgentInternalDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterAgentInternalDiskSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSpec"));
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
