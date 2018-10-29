/**
 * ConverterAgentInternalObjectLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalObjectLocator  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference obj;

    private com.vmware.converter.ConverterAgentInternalServerLocator server;

    public ConverterAgentInternalObjectLocator() {
    }

    public ConverterAgentInternalObjectLocator(
           com.vmware.converter.ManagedObjectReference obj,
           com.vmware.converter.ConverterAgentInternalServerLocator server) {
        this.obj = obj;
        this.server = server;
    }


    /**
     * Gets the obj value for this ConverterAgentInternalObjectLocator.
     * 
     * @return obj
     */
    public com.vmware.converter.ManagedObjectReference getObj() {
        return obj;
    }


    /**
     * Sets the obj value for this ConverterAgentInternalObjectLocator.
     * 
     * @param obj
     */
    public void setObj(com.vmware.converter.ManagedObjectReference obj) {
        this.obj = obj;
    }


    /**
     * Gets the server value for this ConverterAgentInternalObjectLocator.
     * 
     * @return server
     */
    public com.vmware.converter.ConverterAgentInternalServerLocator getServer() {
        return server;
    }


    /**
     * Sets the server value for this ConverterAgentInternalObjectLocator.
     * 
     * @param server
     */
    public void setServer(com.vmware.converter.ConverterAgentInternalServerLocator server) {
        this.server = server;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalObjectLocator)) return false;
        ConverterAgentInternalObjectLocator other = (ConverterAgentInternalObjectLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.obj==null && other.getObj()==null) || 
             (this.obj!=null &&
              this.obj.equals(other.getObj()))) &&
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer())));
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
        if (getObj() != null) {
            _hashCode += getObj().hashCode();
        }
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalObjectLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalObjectLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "obj"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalServerLocator"));
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
