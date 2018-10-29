/**
 * ArrayOfConverterStorageParamsVolumeCloningParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterStorageParamsVolumeCloningParams  implements java.io.Serializable {
    private com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] converterStorageParamsVolumeCloningParams;

    public ArrayOfConverterStorageParamsVolumeCloningParams() {
    }

    public ArrayOfConverterStorageParamsVolumeCloningParams(
           com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] converterStorageParamsVolumeCloningParams) {
           this.converterStorageParamsVolumeCloningParams = converterStorageParamsVolumeCloningParams;
    }


    /**
     * Gets the converterStorageParamsVolumeCloningParams value for this ArrayOfConverterStorageParamsVolumeCloningParams.
     * 
     * @return converterStorageParamsVolumeCloningParams
     */
    public com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] getConverterStorageParamsVolumeCloningParams() {
        return converterStorageParamsVolumeCloningParams;
    }


    /**
     * Sets the converterStorageParamsVolumeCloningParams value for this ArrayOfConverterStorageParamsVolumeCloningParams.
     * 
     * @param converterStorageParamsVolumeCloningParams
     */
    public void setConverterStorageParamsVolumeCloningParams(com.vmware.converter.ConverterStorageParamsVolumeCloningParams[] converterStorageParamsVolumeCloningParams) {
        this.converterStorageParamsVolumeCloningParams = converterStorageParamsVolumeCloningParams;
    }

    public com.vmware.converter.ConverterStorageParamsVolumeCloningParams getConverterStorageParamsVolumeCloningParams(int i) {
        return this.converterStorageParamsVolumeCloningParams[i];
    }

    public void setConverterStorageParamsVolumeCloningParams(int i, com.vmware.converter.ConverterStorageParamsVolumeCloningParams _value) {
        this.converterStorageParamsVolumeCloningParams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterStorageParamsVolumeCloningParams)) return false;
        ArrayOfConverterStorageParamsVolumeCloningParams other = (ArrayOfConverterStorageParamsVolumeCloningParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterStorageParamsVolumeCloningParams==null && other.getConverterStorageParamsVolumeCloningParams()==null) || 
             (this.converterStorageParamsVolumeCloningParams!=null &&
              java.util.Arrays.equals(this.converterStorageParamsVolumeCloningParams, other.getConverterStorageParamsVolumeCloningParams())));
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
        if (getConverterStorageParamsVolumeCloningParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterStorageParamsVolumeCloningParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterStorageParamsVolumeCloningParams(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterStorageParamsVolumeCloningParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterStorageParamsVolumeCloningParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterStorageParamsVolumeCloningParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsVolumeCloningParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsVolumeCloningParams"));
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
