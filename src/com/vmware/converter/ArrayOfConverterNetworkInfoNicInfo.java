/**
 * ArrayOfConverterNetworkInfoNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterNetworkInfoNicInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterNetworkInfoNicInfo[] converterNetworkInfoNicInfo;

    public ArrayOfConverterNetworkInfoNicInfo() {
    }

    public ArrayOfConverterNetworkInfoNicInfo(
           com.vmware.converter.ConverterNetworkInfoNicInfo[] converterNetworkInfoNicInfo) {
           this.converterNetworkInfoNicInfo = converterNetworkInfoNicInfo;
    }


    /**
     * Gets the converterNetworkInfoNicInfo value for this ArrayOfConverterNetworkInfoNicInfo.
     * 
     * @return converterNetworkInfoNicInfo
     */
    public com.vmware.converter.ConverterNetworkInfoNicInfo[] getConverterNetworkInfoNicInfo() {
        return converterNetworkInfoNicInfo;
    }


    /**
     * Sets the converterNetworkInfoNicInfo value for this ArrayOfConverterNetworkInfoNicInfo.
     * 
     * @param converterNetworkInfoNicInfo
     */
    public void setConverterNetworkInfoNicInfo(com.vmware.converter.ConverterNetworkInfoNicInfo[] converterNetworkInfoNicInfo) {
        this.converterNetworkInfoNicInfo = converterNetworkInfoNicInfo;
    }

    public com.vmware.converter.ConverterNetworkInfoNicInfo getConverterNetworkInfoNicInfo(int i) {
        return this.converterNetworkInfoNicInfo[i];
    }

    public void setConverterNetworkInfoNicInfo(int i, com.vmware.converter.ConverterNetworkInfoNicInfo _value) {
        this.converterNetworkInfoNicInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterNetworkInfoNicInfo)) return false;
        ArrayOfConverterNetworkInfoNicInfo other = (ArrayOfConverterNetworkInfoNicInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterNetworkInfoNicInfo==null && other.getConverterNetworkInfoNicInfo()==null) || 
             (this.converterNetworkInfoNicInfo!=null &&
              java.util.Arrays.equals(this.converterNetworkInfoNicInfo, other.getConverterNetworkInfoNicInfo())));
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
        if (getConverterNetworkInfoNicInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterNetworkInfoNicInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterNetworkInfoNicInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterNetworkInfoNicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterNetworkInfoNicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterNetworkInfoNicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoNicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoNicInfo"));
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
