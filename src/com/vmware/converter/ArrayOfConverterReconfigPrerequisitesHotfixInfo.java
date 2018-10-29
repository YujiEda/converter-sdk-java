/**
 * ArrayOfConverterReconfigPrerequisitesHotfixInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterReconfigPrerequisitesHotfixInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] converterReconfigPrerequisitesHotfixInfo;

    public ArrayOfConverterReconfigPrerequisitesHotfixInfo() {
    }

    public ArrayOfConverterReconfigPrerequisitesHotfixInfo(
           com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] converterReconfigPrerequisitesHotfixInfo) {
           this.converterReconfigPrerequisitesHotfixInfo = converterReconfigPrerequisitesHotfixInfo;
    }


    /**
     * Gets the converterReconfigPrerequisitesHotfixInfo value for this ArrayOfConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @return converterReconfigPrerequisitesHotfixInfo
     */
    public com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] getConverterReconfigPrerequisitesHotfixInfo() {
        return converterReconfigPrerequisitesHotfixInfo;
    }


    /**
     * Sets the converterReconfigPrerequisitesHotfixInfo value for this ArrayOfConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @param converterReconfigPrerequisitesHotfixInfo
     */
    public void setConverterReconfigPrerequisitesHotfixInfo(com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] converterReconfigPrerequisitesHotfixInfo) {
        this.converterReconfigPrerequisitesHotfixInfo = converterReconfigPrerequisitesHotfixInfo;
    }

    public com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo getConverterReconfigPrerequisitesHotfixInfo(int i) {
        return this.converterReconfigPrerequisitesHotfixInfo[i];
    }

    public void setConverterReconfigPrerequisitesHotfixInfo(int i, com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo _value) {
        this.converterReconfigPrerequisitesHotfixInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterReconfigPrerequisitesHotfixInfo)) return false;
        ArrayOfConverterReconfigPrerequisitesHotfixInfo other = (ArrayOfConverterReconfigPrerequisitesHotfixInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterReconfigPrerequisitesHotfixInfo==null && other.getConverterReconfigPrerequisitesHotfixInfo()==null) || 
             (this.converterReconfigPrerequisitesHotfixInfo!=null &&
              java.util.Arrays.equals(this.converterReconfigPrerequisitesHotfixInfo, other.getConverterReconfigPrerequisitesHotfixInfo())));
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
        if (getConverterReconfigPrerequisitesHotfixInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterReconfigPrerequisitesHotfixInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterReconfigPrerequisitesHotfixInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterReconfigPrerequisitesHotfixInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterReconfigPrerequisitesHotfixInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterReconfigPrerequisitesHotfixInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesHotfixInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesHotfixInfo"));
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
