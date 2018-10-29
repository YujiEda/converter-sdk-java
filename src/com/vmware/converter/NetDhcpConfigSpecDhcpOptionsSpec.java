/**
 * NetDhcpConfigSpecDhcpOptionsSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetDhcpConfigSpecDhcpOptionsSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enable;

    private com.vmware.converter.KeyValue[] config;

    private java.lang.String operation;

    public NetDhcpConfigSpecDhcpOptionsSpec() {
    }

    public NetDhcpConfigSpecDhcpOptionsSpec(
           java.lang.Boolean enable,
           com.vmware.converter.KeyValue[] config,
           java.lang.String operation) {
        this.enable = enable;
        this.config = config;
        this.operation = operation;
    }


    /**
     * Gets the enable value for this NetDhcpConfigSpecDhcpOptionsSpec.
     * 
     * @return enable
     */
    public java.lang.Boolean getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this NetDhcpConfigSpecDhcpOptionsSpec.
     * 
     * @param enable
     */
    public void setEnable(java.lang.Boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the config value for this NetDhcpConfigSpecDhcpOptionsSpec.
     * 
     * @return config
     */
    public com.vmware.converter.KeyValue[] getConfig() {
        return config;
    }


    /**
     * Sets the config value for this NetDhcpConfigSpecDhcpOptionsSpec.
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


    /**
     * Gets the operation value for this NetDhcpConfigSpecDhcpOptionsSpec.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this NetDhcpConfigSpecDhcpOptionsSpec.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetDhcpConfigSpecDhcpOptionsSpec)) return false;
        NetDhcpConfigSpecDhcpOptionsSpec other = (NetDhcpConfigSpecDhcpOptionsSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enable==null && other.getEnable()==null) || 
             (this.enable!=null &&
              this.enable.equals(other.getEnable()))) &&
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              java.util.Arrays.equals(this.config, other.getConfig()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getEnable() != null) {
            _hashCode += getEnable().hashCode();
        }
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetDhcpConfigSpecDhcpOptionsSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetDhcpConfigSpecDhcpOptionsSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
