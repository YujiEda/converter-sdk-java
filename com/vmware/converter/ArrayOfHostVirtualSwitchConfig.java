/**
 * ArrayOfHostVirtualSwitchConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostVirtualSwitchConfig  implements java.io.Serializable {
    private com.vmware.converter.HostVirtualSwitchConfig[] hostVirtualSwitchConfig;

    public ArrayOfHostVirtualSwitchConfig() {
    }

    public ArrayOfHostVirtualSwitchConfig(
           com.vmware.converter.HostVirtualSwitchConfig[] hostVirtualSwitchConfig) {
           this.hostVirtualSwitchConfig = hostVirtualSwitchConfig;
    }


    /**
     * Gets the hostVirtualSwitchConfig value for this ArrayOfHostVirtualSwitchConfig.
     * 
     * @return hostVirtualSwitchConfig
     */
    public com.vmware.converter.HostVirtualSwitchConfig[] getHostVirtualSwitchConfig() {
        return hostVirtualSwitchConfig;
    }


    /**
     * Sets the hostVirtualSwitchConfig value for this ArrayOfHostVirtualSwitchConfig.
     * 
     * @param hostVirtualSwitchConfig
     */
    public void setHostVirtualSwitchConfig(com.vmware.converter.HostVirtualSwitchConfig[] hostVirtualSwitchConfig) {
        this.hostVirtualSwitchConfig = hostVirtualSwitchConfig;
    }

    public com.vmware.converter.HostVirtualSwitchConfig getHostVirtualSwitchConfig(int i) {
        return this.hostVirtualSwitchConfig[i];
    }

    public void setHostVirtualSwitchConfig(int i, com.vmware.converter.HostVirtualSwitchConfig _value) {
        this.hostVirtualSwitchConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostVirtualSwitchConfig)) return false;
        ArrayOfHostVirtualSwitchConfig other = (ArrayOfHostVirtualSwitchConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostVirtualSwitchConfig==null && other.getHostVirtualSwitchConfig()==null) || 
             (this.hostVirtualSwitchConfig!=null &&
              java.util.Arrays.equals(this.hostVirtualSwitchConfig, other.getHostVirtualSwitchConfig())));
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
        if (getHostVirtualSwitchConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostVirtualSwitchConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostVirtualSwitchConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostVirtualSwitchConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostVirtualSwitchConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostVirtualSwitchConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchConfig"));
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
