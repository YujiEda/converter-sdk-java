/**
 * CustomizationAdapterMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class CustomizationAdapterMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String macAddress;

    private com.vmware.converter.CustomizationIPSettings adapter;

    public CustomizationAdapterMapping() {
    }

    public CustomizationAdapterMapping(
           java.lang.String macAddress,
           com.vmware.converter.CustomizationIPSettings adapter) {
        this.macAddress = macAddress;
        this.adapter = adapter;
    }


    /**
     * Gets the macAddress value for this CustomizationAdapterMapping.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this CustomizationAdapterMapping.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the adapter value for this CustomizationAdapterMapping.
     * 
     * @return adapter
     */
    public com.vmware.converter.CustomizationIPSettings getAdapter() {
        return adapter;
    }


    /**
     * Sets the adapter value for this CustomizationAdapterMapping.
     * 
     * @param adapter
     */
    public void setAdapter(com.vmware.converter.CustomizationIPSettings adapter) {
        this.adapter = adapter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationAdapterMapping)) return false;
        CustomizationAdapterMapping other = (CustomizationAdapterMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.adapter==null && other.getAdapter()==null) || 
             (this.adapter!=null &&
              this.adapter.equals(other.getAdapter())));
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
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getAdapter() != null) {
            _hashCode += getAdapter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizationAdapterMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationAdapterMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "adapter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIPSettings"));
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
