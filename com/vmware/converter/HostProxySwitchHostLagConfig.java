/**
 * HostProxySwitchHostLagConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostProxySwitchHostLagConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String lagKey;

    private java.lang.String lagName;

    private com.vmware.converter.KeyValue[] uplinkPort;

    public HostProxySwitchHostLagConfig() {
    }

    public HostProxySwitchHostLagConfig(
           java.lang.String lagKey,
           java.lang.String lagName,
           com.vmware.converter.KeyValue[] uplinkPort) {
        this.lagKey = lagKey;
        this.lagName = lagName;
        this.uplinkPort = uplinkPort;
    }


    /**
     * Gets the lagKey value for this HostProxySwitchHostLagConfig.
     * 
     * @return lagKey
     */
    public java.lang.String getLagKey() {
        return lagKey;
    }


    /**
     * Sets the lagKey value for this HostProxySwitchHostLagConfig.
     * 
     * @param lagKey
     */
    public void setLagKey(java.lang.String lagKey) {
        this.lagKey = lagKey;
    }


    /**
     * Gets the lagName value for this HostProxySwitchHostLagConfig.
     * 
     * @return lagName
     */
    public java.lang.String getLagName() {
        return lagName;
    }


    /**
     * Sets the lagName value for this HostProxySwitchHostLagConfig.
     * 
     * @param lagName
     */
    public void setLagName(java.lang.String lagName) {
        this.lagName = lagName;
    }


    /**
     * Gets the uplinkPort value for this HostProxySwitchHostLagConfig.
     * 
     * @return uplinkPort
     */
    public com.vmware.converter.KeyValue[] getUplinkPort() {
        return uplinkPort;
    }


    /**
     * Sets the uplinkPort value for this HostProxySwitchHostLagConfig.
     * 
     * @param uplinkPort
     */
    public void setUplinkPort(com.vmware.converter.KeyValue[] uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

    public com.vmware.converter.KeyValue getUplinkPort(int i) {
        return this.uplinkPort[i];
    }

    public void setUplinkPort(int i, com.vmware.converter.KeyValue _value) {
        this.uplinkPort[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostProxySwitchHostLagConfig)) return false;
        HostProxySwitchHostLagConfig other = (HostProxySwitchHostLagConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lagKey==null && other.getLagKey()==null) || 
             (this.lagKey!=null &&
              this.lagKey.equals(other.getLagKey()))) &&
            ((this.lagName==null && other.getLagName()==null) || 
             (this.lagName!=null &&
              this.lagName.equals(other.getLagName()))) &&
            ((this.uplinkPort==null && other.getUplinkPort()==null) || 
             (this.uplinkPort!=null &&
              java.util.Arrays.equals(this.uplinkPort, other.getUplinkPort())));
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
        if (getLagKey() != null) {
            _hashCode += getLagKey().hashCode();
        }
        if (getLagName() != null) {
            _hashCode += getLagName().hashCode();
        }
        if (getUplinkPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPort(), i);
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
        new org.apache.axis.description.TypeDesc(HostProxySwitchHostLagConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProxySwitchHostLagConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lagKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lagName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPort"));
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
