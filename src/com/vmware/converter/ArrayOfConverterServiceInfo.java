/**
 * ArrayOfConverterServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterServiceInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterServiceInfo[] converterServiceInfo;

    public ArrayOfConverterServiceInfo() {
    }

    public ArrayOfConverterServiceInfo(
           com.vmware.converter.ConverterServiceInfo[] converterServiceInfo) {
           this.converterServiceInfo = converterServiceInfo;
    }


    /**
     * Gets the converterServiceInfo value for this ArrayOfConverterServiceInfo.
     * 
     * @return converterServiceInfo
     */
    public com.vmware.converter.ConverterServiceInfo[] getConverterServiceInfo() {
        return converterServiceInfo;
    }


    /**
     * Sets the converterServiceInfo value for this ArrayOfConverterServiceInfo.
     * 
     * @param converterServiceInfo
     */
    public void setConverterServiceInfo(com.vmware.converter.ConverterServiceInfo[] converterServiceInfo) {
        this.converterServiceInfo = converterServiceInfo;
    }

    public com.vmware.converter.ConverterServiceInfo getConverterServiceInfo(int i) {
        return this.converterServiceInfo[i];
    }

    public void setConverterServiceInfo(int i, com.vmware.converter.ConverterServiceInfo _value) {
        this.converterServiceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterServiceInfo)) return false;
        ArrayOfConverterServiceInfo other = (ArrayOfConverterServiceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterServiceInfo==null && other.getConverterServiceInfo()==null) || 
             (this.converterServiceInfo!=null &&
              java.util.Arrays.equals(this.converterServiceInfo, other.getConverterServiceInfo())));
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
        if (getConverterServiceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterServiceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterServiceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterServiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterServiceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterServiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterServiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceInfo"));
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
