/**
 * ConverterAgentInternalVirtualDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVirtualDiskSpec  extends com.vmware.converter.ConverterAgentInternalDiskSpec  implements java.io.Serializable {
    private java.lang.Integer deviceKey;

    public ConverterAgentInternalVirtualDiskSpec() {
    }

    public ConverterAgentInternalVirtualDiskSpec(
           java.lang.String name,
           com.vmware.converter.ConverterAgentInternalDiskAttachPoint attachPoint,
           java.lang.Integer deviceKey) {
        super(
            name,
            attachPoint);
        this.deviceKey = deviceKey;
    }


    /**
     * Gets the deviceKey value for this ConverterAgentInternalVirtualDiskSpec.
     * 
     * @return deviceKey
     */
    public java.lang.Integer getDeviceKey() {
        return deviceKey;
    }


    /**
     * Sets the deviceKey value for this ConverterAgentInternalVirtualDiskSpec.
     * 
     * @param deviceKey
     */
    public void setDeviceKey(java.lang.Integer deviceKey) {
        this.deviceKey = deviceKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVirtualDiskSpec)) return false;
        ConverterAgentInternalVirtualDiskSpec other = (ConverterAgentInternalVirtualDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceKey==null && other.getDeviceKey()==null) || 
             (this.deviceKey!=null &&
              this.deviceKey.equals(other.getDeviceKey())));
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
        if (getDeviceKey() != null) {
            _hashCode += getDeviceKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVirtualDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVirtualDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "deviceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
