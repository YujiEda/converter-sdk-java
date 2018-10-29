/**
 * ConverterAgentInternalProxyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalProxyInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference proxy;

    private com.vmware.converter.ConverterAgentInternalObjectLocator actual;

    public ConverterAgentInternalProxyInfo() {
    }

    public ConverterAgentInternalProxyInfo(
           com.vmware.converter.ManagedObjectReference proxy,
           com.vmware.converter.ConverterAgentInternalObjectLocator actual) {
        this.proxy = proxy;
        this.actual = actual;
    }


    /**
     * Gets the proxy value for this ConverterAgentInternalProxyInfo.
     * 
     * @return proxy
     */
    public com.vmware.converter.ManagedObjectReference getProxy() {
        return proxy;
    }


    /**
     * Sets the proxy value for this ConverterAgentInternalProxyInfo.
     * 
     * @param proxy
     */
    public void setProxy(com.vmware.converter.ManagedObjectReference proxy) {
        this.proxy = proxy;
    }


    /**
     * Gets the actual value for this ConverterAgentInternalProxyInfo.
     * 
     * @return actual
     */
    public com.vmware.converter.ConverterAgentInternalObjectLocator getActual() {
        return actual;
    }


    /**
     * Sets the actual value for this ConverterAgentInternalProxyInfo.
     * 
     * @param actual
     */
    public void setActual(com.vmware.converter.ConverterAgentInternalObjectLocator actual) {
        this.actual = actual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalProxyInfo)) return false;
        ConverterAgentInternalProxyInfo other = (ConverterAgentInternalProxyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.proxy==null && other.getProxy()==null) || 
             (this.proxy!=null &&
              this.proxy.equals(other.getProxy()))) &&
            ((this.actual==null && other.getActual()==null) || 
             (this.actual!=null &&
              this.actual.equals(other.getActual())));
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
        if (getProxy() != null) {
            _hashCode += getProxy().hashCode();
        }
        if (getActual() != null) {
            _hashCode += getActual().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalProxyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalProxyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "proxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "actual"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalObjectLocator"));
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
