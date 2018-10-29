/**
 * ArrayOfConverterParamsStorageMappingVolumeMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterParamsStorageMappingVolumeMapping  implements java.io.Serializable {
    private com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] converterParamsStorageMappingVolumeMapping;

    public ArrayOfConverterParamsStorageMappingVolumeMapping() {
    }

    public ArrayOfConverterParamsStorageMappingVolumeMapping(
           com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] converterParamsStorageMappingVolumeMapping) {
           this.converterParamsStorageMappingVolumeMapping = converterParamsStorageMappingVolumeMapping;
    }


    /**
     * Gets the converterParamsStorageMappingVolumeMapping value for this ArrayOfConverterParamsStorageMappingVolumeMapping.
     * 
     * @return converterParamsStorageMappingVolumeMapping
     */
    public com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] getConverterParamsStorageMappingVolumeMapping() {
        return converterParamsStorageMappingVolumeMapping;
    }


    /**
     * Sets the converterParamsStorageMappingVolumeMapping value for this ArrayOfConverterParamsStorageMappingVolumeMapping.
     * 
     * @param converterParamsStorageMappingVolumeMapping
     */
    public void setConverterParamsStorageMappingVolumeMapping(com.vmware.converter.ConverterParamsStorageMappingVolumeMapping[] converterParamsStorageMappingVolumeMapping) {
        this.converterParamsStorageMappingVolumeMapping = converterParamsStorageMappingVolumeMapping;
    }

    public com.vmware.converter.ConverterParamsStorageMappingVolumeMapping getConverterParamsStorageMappingVolumeMapping(int i) {
        return this.converterParamsStorageMappingVolumeMapping[i];
    }

    public void setConverterParamsStorageMappingVolumeMapping(int i, com.vmware.converter.ConverterParamsStorageMappingVolumeMapping _value) {
        this.converterParamsStorageMappingVolumeMapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterParamsStorageMappingVolumeMapping)) return false;
        ArrayOfConverterParamsStorageMappingVolumeMapping other = (ArrayOfConverterParamsStorageMappingVolumeMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterParamsStorageMappingVolumeMapping==null && other.getConverterParamsStorageMappingVolumeMapping()==null) || 
             (this.converterParamsStorageMappingVolumeMapping!=null &&
              java.util.Arrays.equals(this.converterParamsStorageMappingVolumeMapping, other.getConverterParamsStorageMappingVolumeMapping())));
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
        if (getConverterParamsStorageMappingVolumeMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterParamsStorageMappingVolumeMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterParamsStorageMappingVolumeMapping(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterParamsStorageMappingVolumeMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterParamsStorageMappingVolumeMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterParamsStorageMappingVolumeMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingVolumeMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsStorageMappingVolumeMapping"));
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
