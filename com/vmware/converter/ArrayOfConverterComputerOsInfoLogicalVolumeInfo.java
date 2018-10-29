/**
 * ArrayOfConverterComputerOsInfoLogicalVolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterComputerOsInfoLogicalVolumeInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] converterComputerOsInfoLogicalVolumeInfo;

    public ArrayOfConverterComputerOsInfoLogicalVolumeInfo() {
    }

    public ArrayOfConverterComputerOsInfoLogicalVolumeInfo(
           com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] converterComputerOsInfoLogicalVolumeInfo) {
           this.converterComputerOsInfoLogicalVolumeInfo = converterComputerOsInfoLogicalVolumeInfo;
    }


    /**
     * Gets the converterComputerOsInfoLogicalVolumeInfo value for this ArrayOfConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @return converterComputerOsInfoLogicalVolumeInfo
     */
    public com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] getConverterComputerOsInfoLogicalVolumeInfo() {
        return converterComputerOsInfoLogicalVolumeInfo;
    }


    /**
     * Sets the converterComputerOsInfoLogicalVolumeInfo value for this ArrayOfConverterComputerOsInfoLogicalVolumeInfo.
     * 
     * @param converterComputerOsInfoLogicalVolumeInfo
     */
    public void setConverterComputerOsInfoLogicalVolumeInfo(com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] converterComputerOsInfoLogicalVolumeInfo) {
        this.converterComputerOsInfoLogicalVolumeInfo = converterComputerOsInfoLogicalVolumeInfo;
    }

    public com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo getConverterComputerOsInfoLogicalVolumeInfo(int i) {
        return this.converterComputerOsInfoLogicalVolumeInfo[i];
    }

    public void setConverterComputerOsInfoLogicalVolumeInfo(int i, com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo _value) {
        this.converterComputerOsInfoLogicalVolumeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterComputerOsInfoLogicalVolumeInfo)) return false;
        ArrayOfConverterComputerOsInfoLogicalVolumeInfo other = (ArrayOfConverterComputerOsInfoLogicalVolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterComputerOsInfoLogicalVolumeInfo==null && other.getConverterComputerOsInfoLogicalVolumeInfo()==null) || 
             (this.converterComputerOsInfoLogicalVolumeInfo!=null &&
              java.util.Arrays.equals(this.converterComputerOsInfoLogicalVolumeInfo, other.getConverterComputerOsInfoLogicalVolumeInfo())));
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
        if (getConverterComputerOsInfoLogicalVolumeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterComputerOsInfoLogicalVolumeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterComputerOsInfoLogicalVolumeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterComputerOsInfoLogicalVolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterComputerOsInfoLogicalVolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterComputerOsInfoLogicalVolumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoLogicalVolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoLogicalVolumeInfo"));
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
