/**
 * ArrayOfConverterServerConversionConversionJobInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterServerConversionConversionJobInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterServerConversionConversionJobInfo[] converterServerConversionConversionJobInfo;

    public ArrayOfConverterServerConversionConversionJobInfo() {
    }

    public ArrayOfConverterServerConversionConversionJobInfo(
           com.vmware.converter.ConverterServerConversionConversionJobInfo[] converterServerConversionConversionJobInfo) {
           this.converterServerConversionConversionJobInfo = converterServerConversionConversionJobInfo;
    }


    /**
     * Gets the converterServerConversionConversionJobInfo value for this ArrayOfConverterServerConversionConversionJobInfo.
     * 
     * @return converterServerConversionConversionJobInfo
     */
    public com.vmware.converter.ConverterServerConversionConversionJobInfo[] getConverterServerConversionConversionJobInfo() {
        return converterServerConversionConversionJobInfo;
    }


    /**
     * Sets the converterServerConversionConversionJobInfo value for this ArrayOfConverterServerConversionConversionJobInfo.
     * 
     * @param converterServerConversionConversionJobInfo
     */
    public void setConverterServerConversionConversionJobInfo(com.vmware.converter.ConverterServerConversionConversionJobInfo[] converterServerConversionConversionJobInfo) {
        this.converterServerConversionConversionJobInfo = converterServerConversionConversionJobInfo;
    }

    public com.vmware.converter.ConverterServerConversionConversionJobInfo getConverterServerConversionConversionJobInfo(int i) {
        return this.converterServerConversionConversionJobInfo[i];
    }

    public void setConverterServerConversionConversionJobInfo(int i, com.vmware.converter.ConverterServerConversionConversionJobInfo _value) {
        this.converterServerConversionConversionJobInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterServerConversionConversionJobInfo)) return false;
        ArrayOfConverterServerConversionConversionJobInfo other = (ArrayOfConverterServerConversionConversionJobInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterServerConversionConversionJobInfo==null && other.getConverterServerConversionConversionJobInfo()==null) || 
             (this.converterServerConversionConversionJobInfo!=null &&
              java.util.Arrays.equals(this.converterServerConversionConversionJobInfo, other.getConverterServerConversionConversionJobInfo())));
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
        if (getConverterServerConversionConversionJobInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterServerConversionConversionJobInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterServerConversionConversionJobInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterServerConversionConversionJobInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterServerConversionConversionJobInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterServerConversionConversionJobInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionConversionJobInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionConversionJobInfo"));
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
