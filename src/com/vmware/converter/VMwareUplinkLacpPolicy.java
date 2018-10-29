/**
 * VMwareUplinkLacpPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareUplinkLacpPolicy  extends com.vmware.converter.InheritablePolicy  implements java.io.Serializable {
    private com.vmware.converter.BoolPolicy enable;

    private com.vmware.converter.StringPolicy mode;

    public VMwareUplinkLacpPolicy() {
    }

    public VMwareUplinkLacpPolicy(
           boolean inherited,
           com.vmware.converter.BoolPolicy enable,
           com.vmware.converter.StringPolicy mode) {
        super(
            inherited);
        this.enable = enable;
        this.mode = mode;
    }


    /**
     * Gets the enable value for this VMwareUplinkLacpPolicy.
     * 
     * @return enable
     */
    public com.vmware.converter.BoolPolicy getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this VMwareUplinkLacpPolicy.
     * 
     * @param enable
     */
    public void setEnable(com.vmware.converter.BoolPolicy enable) {
        this.enable = enable;
    }


    /**
     * Gets the mode value for this VMwareUplinkLacpPolicy.
     * 
     * @return mode
     */
    public com.vmware.converter.StringPolicy getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this VMwareUplinkLacpPolicy.
     * 
     * @param mode
     */
    public void setMode(com.vmware.converter.StringPolicy mode) {
        this.mode = mode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareUplinkLacpPolicy)) return false;
        VMwareUplinkLacpPolicy other = (VMwareUplinkLacpPolicy) obj;
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
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode())));
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
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareUplinkLacpPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareUplinkLacpPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StringPolicy"));
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
