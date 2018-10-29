/**
 * ArrayOfConverterSnapshotInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterSnapshotInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterSnapshotInfo[] converterSnapshotInfo;

    public ArrayOfConverterSnapshotInfo() {
    }

    public ArrayOfConverterSnapshotInfo(
           com.vmware.converter.ConverterSnapshotInfo[] converterSnapshotInfo) {
           this.converterSnapshotInfo = converterSnapshotInfo;
    }


    /**
     * Gets the converterSnapshotInfo value for this ArrayOfConverterSnapshotInfo.
     * 
     * @return converterSnapshotInfo
     */
    public com.vmware.converter.ConverterSnapshotInfo[] getConverterSnapshotInfo() {
        return converterSnapshotInfo;
    }


    /**
     * Sets the converterSnapshotInfo value for this ArrayOfConverterSnapshotInfo.
     * 
     * @param converterSnapshotInfo
     */
    public void setConverterSnapshotInfo(com.vmware.converter.ConverterSnapshotInfo[] converterSnapshotInfo) {
        this.converterSnapshotInfo = converterSnapshotInfo;
    }

    public com.vmware.converter.ConverterSnapshotInfo getConverterSnapshotInfo(int i) {
        return this.converterSnapshotInfo[i];
    }

    public void setConverterSnapshotInfo(int i, com.vmware.converter.ConverterSnapshotInfo _value) {
        this.converterSnapshotInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterSnapshotInfo)) return false;
        ArrayOfConverterSnapshotInfo other = (ArrayOfConverterSnapshotInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterSnapshotInfo==null && other.getConverterSnapshotInfo()==null) || 
             (this.converterSnapshotInfo!=null &&
              java.util.Arrays.equals(this.converterSnapshotInfo, other.getConverterSnapshotInfo())));
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
        if (getConverterSnapshotInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterSnapshotInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterSnapshotInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterSnapshotInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterSnapshotInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterSnapshotInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterSnapshotInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSnapshotInfo"));
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
