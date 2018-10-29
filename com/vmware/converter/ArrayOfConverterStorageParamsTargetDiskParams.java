/**
 * ArrayOfConverterStorageParamsTargetDiskParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterStorageParamsTargetDiskParams  implements java.io.Serializable {
    private com.vmware.converter.ConverterStorageParamsTargetDiskParams[] converterStorageParamsTargetDiskParams;

    public ArrayOfConverterStorageParamsTargetDiskParams() {
    }

    public ArrayOfConverterStorageParamsTargetDiskParams(
           com.vmware.converter.ConverterStorageParamsTargetDiskParams[] converterStorageParamsTargetDiskParams) {
           this.converterStorageParamsTargetDiskParams = converterStorageParamsTargetDiskParams;
    }


    /**
     * Gets the converterStorageParamsTargetDiskParams value for this ArrayOfConverterStorageParamsTargetDiskParams.
     * 
     * @return converterStorageParamsTargetDiskParams
     */
    public com.vmware.converter.ConverterStorageParamsTargetDiskParams[] getConverterStorageParamsTargetDiskParams() {
        return converterStorageParamsTargetDiskParams;
    }


    /**
     * Sets the converterStorageParamsTargetDiskParams value for this ArrayOfConverterStorageParamsTargetDiskParams.
     * 
     * @param converterStorageParamsTargetDiskParams
     */
    public void setConverterStorageParamsTargetDiskParams(com.vmware.converter.ConverterStorageParamsTargetDiskParams[] converterStorageParamsTargetDiskParams) {
        this.converterStorageParamsTargetDiskParams = converterStorageParamsTargetDiskParams;
    }

    public com.vmware.converter.ConverterStorageParamsTargetDiskParams getConverterStorageParamsTargetDiskParams(int i) {
        return this.converterStorageParamsTargetDiskParams[i];
    }

    public void setConverterStorageParamsTargetDiskParams(int i, com.vmware.converter.ConverterStorageParamsTargetDiskParams _value) {
        this.converterStorageParamsTargetDiskParams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterStorageParamsTargetDiskParams)) return false;
        ArrayOfConverterStorageParamsTargetDiskParams other = (ArrayOfConverterStorageParamsTargetDiskParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterStorageParamsTargetDiskParams==null && other.getConverterStorageParamsTargetDiskParams()==null) || 
             (this.converterStorageParamsTargetDiskParams!=null &&
              java.util.Arrays.equals(this.converterStorageParamsTargetDiskParams, other.getConverterStorageParamsTargetDiskParams())));
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
        if (getConverterStorageParamsTargetDiskParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterStorageParamsTargetDiskParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterStorageParamsTargetDiskParams(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterStorageParamsTargetDiskParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterStorageParamsTargetDiskParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterStorageParamsTargetDiskParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsTargetDiskParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsTargetDiskParams"));
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
