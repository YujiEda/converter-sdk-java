/**
 * ArrayOfConverterAgentInternalDeviceMappingAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterAgentInternalDeviceMappingAlert  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] converterAgentInternalDeviceMappingAlert;

    public ArrayOfConverterAgentInternalDeviceMappingAlert() {
    }

    public ArrayOfConverterAgentInternalDeviceMappingAlert(
           com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] converterAgentInternalDeviceMappingAlert) {
           this.converterAgentInternalDeviceMappingAlert = converterAgentInternalDeviceMappingAlert;
    }


    /**
     * Gets the converterAgentInternalDeviceMappingAlert value for this ArrayOfConverterAgentInternalDeviceMappingAlert.
     * 
     * @return converterAgentInternalDeviceMappingAlert
     */
    public com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] getConverterAgentInternalDeviceMappingAlert() {
        return converterAgentInternalDeviceMappingAlert;
    }


    /**
     * Sets the converterAgentInternalDeviceMappingAlert value for this ArrayOfConverterAgentInternalDeviceMappingAlert.
     * 
     * @param converterAgentInternalDeviceMappingAlert
     */
    public void setConverterAgentInternalDeviceMappingAlert(com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] converterAgentInternalDeviceMappingAlert) {
        this.converterAgentInternalDeviceMappingAlert = converterAgentInternalDeviceMappingAlert;
    }

    public com.vmware.converter.ConverterAgentInternalDeviceMappingAlert getConverterAgentInternalDeviceMappingAlert(int i) {
        return this.converterAgentInternalDeviceMappingAlert[i];
    }

    public void setConverterAgentInternalDeviceMappingAlert(int i, com.vmware.converter.ConverterAgentInternalDeviceMappingAlert _value) {
        this.converterAgentInternalDeviceMappingAlert[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterAgentInternalDeviceMappingAlert)) return false;
        ArrayOfConverterAgentInternalDeviceMappingAlert other = (ArrayOfConverterAgentInternalDeviceMappingAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterAgentInternalDeviceMappingAlert==null && other.getConverterAgentInternalDeviceMappingAlert()==null) || 
             (this.converterAgentInternalDeviceMappingAlert!=null &&
              java.util.Arrays.equals(this.converterAgentInternalDeviceMappingAlert, other.getConverterAgentInternalDeviceMappingAlert())));
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
        if (getConverterAgentInternalDeviceMappingAlert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterAgentInternalDeviceMappingAlert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterAgentInternalDeviceMappingAlert(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterAgentInternalDeviceMappingAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterAgentInternalDeviceMappingAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterAgentInternalDeviceMappingAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDeviceMappingAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDeviceMappingAlert"));
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
