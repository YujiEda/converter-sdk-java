/**
 * HostSystemSwapConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostSystemSwapConfiguration  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] option;

    public HostSystemSwapConfiguration() {
    }

    public HostSystemSwapConfiguration(
           com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] option) {
        this.option = option;
    }


    /**
     * Gets the option value for this HostSystemSwapConfiguration.
     * 
     * @return option
     */
    public com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this HostSystemSwapConfiguration.
     * 
     * @param option
     */
    public void setOption(com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption[] option) {
        this.option = option;
    }

    public com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.vmware.converter.HostSystemSwapConfigurationSystemSwapOption _value) {
        this.option[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostSystemSwapConfiguration)) return false;
        HostSystemSwapConfiguration other = (HostSystemSwapConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption())));
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
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
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
        new org.apache.axis.description.TypeDesc(HostSystemSwapConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemSwapConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemSwapConfigurationSystemSwapOption"));
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
