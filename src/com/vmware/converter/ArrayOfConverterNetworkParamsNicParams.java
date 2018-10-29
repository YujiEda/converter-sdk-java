/**
 * ArrayOfConverterNetworkParamsNicParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterNetworkParamsNicParams  implements java.io.Serializable {
    private com.vmware.converter.ConverterNetworkParamsNicParams[] converterNetworkParamsNicParams;

    public ArrayOfConverterNetworkParamsNicParams() {
    }

    public ArrayOfConverterNetworkParamsNicParams(
           com.vmware.converter.ConverterNetworkParamsNicParams[] converterNetworkParamsNicParams) {
           this.converterNetworkParamsNicParams = converterNetworkParamsNicParams;
    }


    /**
     * Gets the converterNetworkParamsNicParams value for this ArrayOfConverterNetworkParamsNicParams.
     * 
     * @return converterNetworkParamsNicParams
     */
    public com.vmware.converter.ConverterNetworkParamsNicParams[] getConverterNetworkParamsNicParams() {
        return converterNetworkParamsNicParams;
    }


    /**
     * Sets the converterNetworkParamsNicParams value for this ArrayOfConverterNetworkParamsNicParams.
     * 
     * @param converterNetworkParamsNicParams
     */
    public void setConverterNetworkParamsNicParams(com.vmware.converter.ConverterNetworkParamsNicParams[] converterNetworkParamsNicParams) {
        this.converterNetworkParamsNicParams = converterNetworkParamsNicParams;
    }

    public com.vmware.converter.ConverterNetworkParamsNicParams getConverterNetworkParamsNicParams(int i) {
        return this.converterNetworkParamsNicParams[i];
    }

    public void setConverterNetworkParamsNicParams(int i, com.vmware.converter.ConverterNetworkParamsNicParams _value) {
        this.converterNetworkParamsNicParams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterNetworkParamsNicParams)) return false;
        ArrayOfConverterNetworkParamsNicParams other = (ArrayOfConverterNetworkParamsNicParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterNetworkParamsNicParams==null && other.getConverterNetworkParamsNicParams()==null) || 
             (this.converterNetworkParamsNicParams!=null &&
              java.util.Arrays.equals(this.converterNetworkParamsNicParams, other.getConverterNetworkParamsNicParams())));
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
        if (getConverterNetworkParamsNicParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterNetworkParamsNicParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterNetworkParamsNicParams(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterNetworkParamsNicParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterNetworkParamsNicParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterNetworkParamsNicParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParamsNicParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParamsNicParams"));
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
