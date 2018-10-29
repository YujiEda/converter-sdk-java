/**
 * ArrayOfDVSHealthCheckConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDVSHealthCheckConfig  implements java.io.Serializable {
    private com.vmware.converter.DVSHealthCheckConfig[] DVSHealthCheckConfig;

    public ArrayOfDVSHealthCheckConfig() {
    }

    public ArrayOfDVSHealthCheckConfig(
           com.vmware.converter.DVSHealthCheckConfig[] DVSHealthCheckConfig) {
           this.DVSHealthCheckConfig = DVSHealthCheckConfig;
    }


    /**
     * Gets the DVSHealthCheckConfig value for this ArrayOfDVSHealthCheckConfig.
     * 
     * @return DVSHealthCheckConfig
     */
    public com.vmware.converter.DVSHealthCheckConfig[] getDVSHealthCheckConfig() {
        return DVSHealthCheckConfig;
    }


    /**
     * Sets the DVSHealthCheckConfig value for this ArrayOfDVSHealthCheckConfig.
     * 
     * @param DVSHealthCheckConfig
     */
    public void setDVSHealthCheckConfig(com.vmware.converter.DVSHealthCheckConfig[] DVSHealthCheckConfig) {
        this.DVSHealthCheckConfig = DVSHealthCheckConfig;
    }

    public com.vmware.converter.DVSHealthCheckConfig getDVSHealthCheckConfig(int i) {
        return this.DVSHealthCheckConfig[i];
    }

    public void setDVSHealthCheckConfig(int i, com.vmware.converter.DVSHealthCheckConfig _value) {
        this.DVSHealthCheckConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDVSHealthCheckConfig)) return false;
        ArrayOfDVSHealthCheckConfig other = (ArrayOfDVSHealthCheckConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DVSHealthCheckConfig==null && other.getDVSHealthCheckConfig()==null) || 
             (this.DVSHealthCheckConfig!=null &&
              java.util.Arrays.equals(this.DVSHealthCheckConfig, other.getDVSHealthCheckConfig())));
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
        if (getDVSHealthCheckConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDVSHealthCheckConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDVSHealthCheckConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDVSHealthCheckConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDVSHealthCheckConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DVSHealthCheckConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DVSHealthCheckConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSHealthCheckConfig"));
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
