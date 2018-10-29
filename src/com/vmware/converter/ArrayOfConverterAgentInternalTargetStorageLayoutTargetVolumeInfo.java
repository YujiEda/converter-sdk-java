/**
 * ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] converterAgentInternalTargetStorageLayoutTargetVolumeInfo;

    public ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo() {
    }

    public ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo(
           com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] converterAgentInternalTargetStorageLayoutTargetVolumeInfo) {
           this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo = converterAgentInternalTargetStorageLayoutTargetVolumeInfo;
    }


    /**
     * Gets the converterAgentInternalTargetStorageLayoutTargetVolumeInfo value for this ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @return converterAgentInternalTargetStorageLayoutTargetVolumeInfo
     */
    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo() {
        return converterAgentInternalTargetStorageLayoutTargetVolumeInfo;
    }


    /**
     * Sets the converterAgentInternalTargetStorageLayoutTargetVolumeInfo value for this ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.
     * 
     * @param converterAgentInternalTargetStorageLayoutTargetVolumeInfo
     */
    public void setConverterAgentInternalTargetStorageLayoutTargetVolumeInfo(com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo[] converterAgentInternalTargetStorageLayoutTargetVolumeInfo) {
        this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo = converterAgentInternalTargetStorageLayoutTargetVolumeInfo;
    }

    public com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo(int i) {
        return this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo[i];
    }

    public void setConverterAgentInternalTargetStorageLayoutTargetVolumeInfo(int i, com.vmware.converter.ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo _value) {
        this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo)) return false;
        ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo other = (ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo==null && other.getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo()==null) || 
             (this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo!=null &&
              java.util.Arrays.equals(this.converterAgentInternalTargetStorageLayoutTargetVolumeInfo, other.getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo())));
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
        if (getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterAgentInternalTargetStorageLayoutTargetVolumeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterAgentInternalTargetStorageLayoutTargetVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterAgentInternalTargetStorageLayoutTargetVolumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayoutTargetVolumeInfo"));
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
