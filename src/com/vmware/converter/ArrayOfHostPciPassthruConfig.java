/**
 * ArrayOfHostPciPassthruConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostPciPassthruConfig  implements java.io.Serializable {
    private com.vmware.converter.HostPciPassthruConfig[] hostPciPassthruConfig;

    public ArrayOfHostPciPassthruConfig() {
    }

    public ArrayOfHostPciPassthruConfig(
           com.vmware.converter.HostPciPassthruConfig[] hostPciPassthruConfig) {
           this.hostPciPassthruConfig = hostPciPassthruConfig;
    }


    /**
     * Gets the hostPciPassthruConfig value for this ArrayOfHostPciPassthruConfig.
     * 
     * @return hostPciPassthruConfig
     */
    public com.vmware.converter.HostPciPassthruConfig[] getHostPciPassthruConfig() {
        return hostPciPassthruConfig;
    }


    /**
     * Sets the hostPciPassthruConfig value for this ArrayOfHostPciPassthruConfig.
     * 
     * @param hostPciPassthruConfig
     */
    public void setHostPciPassthruConfig(com.vmware.converter.HostPciPassthruConfig[] hostPciPassthruConfig) {
        this.hostPciPassthruConfig = hostPciPassthruConfig;
    }

    public com.vmware.converter.HostPciPassthruConfig getHostPciPassthruConfig(int i) {
        return this.hostPciPassthruConfig[i];
    }

    public void setHostPciPassthruConfig(int i, com.vmware.converter.HostPciPassthruConfig _value) {
        this.hostPciPassthruConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPciPassthruConfig)) return false;
        ArrayOfHostPciPassthruConfig other = (ArrayOfHostPciPassthruConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPciPassthruConfig==null && other.getHostPciPassthruConfig()==null) || 
             (this.hostPciPassthruConfig!=null &&
              java.util.Arrays.equals(this.hostPciPassthruConfig, other.getHostPciPassthruConfig())));
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
        if (getHostPciPassthruConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPciPassthruConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPciPassthruConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPciPassthruConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPciPassthruConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPciPassthruConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPciPassthruConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPciPassthruConfig"));
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
