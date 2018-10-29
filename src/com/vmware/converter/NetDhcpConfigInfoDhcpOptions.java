/**
 * NetDhcpConfigInfoDhcpOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetDhcpConfigInfoDhcpOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean enable;

    private com.vmware.converter.KeyValue[] config;

    public NetDhcpConfigInfoDhcpOptions() {
    }

    public NetDhcpConfigInfoDhcpOptions(
           boolean enable,
           com.vmware.converter.KeyValue[] config) {
        this.enable = enable;
        this.config = config;
    }


    /**
     * Gets the enable value for this NetDhcpConfigInfoDhcpOptions.
     * 
     * @return enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this NetDhcpConfigInfoDhcpOptions.
     * 
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the config value for this NetDhcpConfigInfoDhcpOptions.
     * 
     * @return config
     */
    public com.vmware.converter.KeyValue[] getConfig() {
        return config;
    }


    /**
     * Sets the config value for this NetDhcpConfigInfoDhcpOptions.
     * 
     * @param config
     */
    public void setConfig(com.vmware.converter.KeyValue[] config) {
        this.config = config;
    }

    public com.vmware.converter.KeyValue getConfig(int i) {
        return this.config[i];
    }

    public void setConfig(int i, com.vmware.converter.KeyValue _value) {
        this.config[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetDhcpConfigInfoDhcpOptions)) return false;
        NetDhcpConfigInfoDhcpOptions other = (NetDhcpConfigInfoDhcpOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.enable == other.isEnable() &&
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              java.util.Arrays.equals(this.config, other.getConfig())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfig(), i);
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
        new org.apache.axis.description.TypeDesc(NetDhcpConfigInfoDhcpOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigInfoDhcpOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
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
