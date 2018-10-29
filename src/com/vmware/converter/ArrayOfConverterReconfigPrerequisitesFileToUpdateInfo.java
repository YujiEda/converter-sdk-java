/**
 * ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] converterReconfigPrerequisitesFileToUpdateInfo;

    public ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo() {
    }

    public ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo(
           com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] converterReconfigPrerequisitesFileToUpdateInfo) {
           this.converterReconfigPrerequisitesFileToUpdateInfo = converterReconfigPrerequisitesFileToUpdateInfo;
    }


    /**
     * Gets the converterReconfigPrerequisitesFileToUpdateInfo value for this ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @return converterReconfigPrerequisitesFileToUpdateInfo
     */
    public com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] getConverterReconfigPrerequisitesFileToUpdateInfo() {
        return converterReconfigPrerequisitesFileToUpdateInfo;
    }


    /**
     * Sets the converterReconfigPrerequisitesFileToUpdateInfo value for this ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @param converterReconfigPrerequisitesFileToUpdateInfo
     */
    public void setConverterReconfigPrerequisitesFileToUpdateInfo(com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] converterReconfigPrerequisitesFileToUpdateInfo) {
        this.converterReconfigPrerequisitesFileToUpdateInfo = converterReconfigPrerequisitesFileToUpdateInfo;
    }

    public com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo getConverterReconfigPrerequisitesFileToUpdateInfo(int i) {
        return this.converterReconfigPrerequisitesFileToUpdateInfo[i];
    }

    public void setConverterReconfigPrerequisitesFileToUpdateInfo(int i, com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo _value) {
        this.converterReconfigPrerequisitesFileToUpdateInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo)) return false;
        ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo other = (ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterReconfigPrerequisitesFileToUpdateInfo==null && other.getConverterReconfigPrerequisitesFileToUpdateInfo()==null) || 
             (this.converterReconfigPrerequisitesFileToUpdateInfo!=null &&
              java.util.Arrays.equals(this.converterReconfigPrerequisitesFileToUpdateInfo, other.getConverterReconfigPrerequisitesFileToUpdateInfo())));
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
        if (getConverterReconfigPrerequisitesFileToUpdateInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterReconfigPrerequisitesFileToUpdateInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterReconfigPrerequisitesFileToUpdateInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterReconfigPrerequisitesFileToUpdateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterReconfigPrerequisitesFileToUpdateInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesFileToUpdateInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesFileToUpdateInfo"));
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
