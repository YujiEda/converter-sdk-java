/**
 * ArrayOfConverterLicenseFeatureInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterLicenseFeatureInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterLicenseFeatureInfo[] converterLicenseFeatureInfo;

    public ArrayOfConverterLicenseFeatureInfo() {
    }

    public ArrayOfConverterLicenseFeatureInfo(
           com.vmware.converter.ConverterLicenseFeatureInfo[] converterLicenseFeatureInfo) {
           this.converterLicenseFeatureInfo = converterLicenseFeatureInfo;
    }


    /**
     * Gets the converterLicenseFeatureInfo value for this ArrayOfConverterLicenseFeatureInfo.
     * 
     * @return converterLicenseFeatureInfo
     */
    public com.vmware.converter.ConverterLicenseFeatureInfo[] getConverterLicenseFeatureInfo() {
        return converterLicenseFeatureInfo;
    }


    /**
     * Sets the converterLicenseFeatureInfo value for this ArrayOfConverterLicenseFeatureInfo.
     * 
     * @param converterLicenseFeatureInfo
     */
    public void setConverterLicenseFeatureInfo(com.vmware.converter.ConverterLicenseFeatureInfo[] converterLicenseFeatureInfo) {
        this.converterLicenseFeatureInfo = converterLicenseFeatureInfo;
    }

    public com.vmware.converter.ConverterLicenseFeatureInfo getConverterLicenseFeatureInfo(int i) {
        return this.converterLicenseFeatureInfo[i];
    }

    public void setConverterLicenseFeatureInfo(int i, com.vmware.converter.ConverterLicenseFeatureInfo _value) {
        this.converterLicenseFeatureInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterLicenseFeatureInfo)) return false;
        ArrayOfConverterLicenseFeatureInfo other = (ArrayOfConverterLicenseFeatureInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterLicenseFeatureInfo==null && other.getConverterLicenseFeatureInfo()==null) || 
             (this.converterLicenseFeatureInfo!=null &&
              java.util.Arrays.equals(this.converterLicenseFeatureInfo, other.getConverterLicenseFeatureInfo())));
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
        if (getConverterLicenseFeatureInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterLicenseFeatureInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterLicenseFeatureInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterLicenseFeatureInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterLicenseFeatureInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterLicenseFeatureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterLicenseFeatureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterLicenseFeatureInfo"));
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
