/**
 * ArrayOfDvsFilterConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDvsFilterConfig  implements java.io.Serializable {
    private com.vmware.converter.DvsFilterConfig[] dvsFilterConfig;

    public ArrayOfDvsFilterConfig() {
    }

    public ArrayOfDvsFilterConfig(
           com.vmware.converter.DvsFilterConfig[] dvsFilterConfig) {
           this.dvsFilterConfig = dvsFilterConfig;
    }


    /**
     * Gets the dvsFilterConfig value for this ArrayOfDvsFilterConfig.
     * 
     * @return dvsFilterConfig
     */
    public com.vmware.converter.DvsFilterConfig[] getDvsFilterConfig() {
        return dvsFilterConfig;
    }


    /**
     * Sets the dvsFilterConfig value for this ArrayOfDvsFilterConfig.
     * 
     * @param dvsFilterConfig
     */
    public void setDvsFilterConfig(com.vmware.converter.DvsFilterConfig[] dvsFilterConfig) {
        this.dvsFilterConfig = dvsFilterConfig;
    }

    public com.vmware.converter.DvsFilterConfig getDvsFilterConfig(int i) {
        return this.dvsFilterConfig[i];
    }

    public void setDvsFilterConfig(int i, com.vmware.converter.DvsFilterConfig _value) {
        this.dvsFilterConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsFilterConfig)) return false;
        ArrayOfDvsFilterConfig other = (ArrayOfDvsFilterConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsFilterConfig==null && other.getDvsFilterConfig()==null) || 
             (this.dvsFilterConfig!=null &&
              java.util.Arrays.equals(this.dvsFilterConfig, other.getDvsFilterConfig())));
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
        if (getDvsFilterConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsFilterConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsFilterConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsFilterConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsFilterConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsFilterConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsFilterConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsFilterConfig"));
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
