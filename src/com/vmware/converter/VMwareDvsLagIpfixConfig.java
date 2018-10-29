/**
 * VMwareDvsLagIpfixConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDvsLagIpfixConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean ipfixEnabled;

    public VMwareDvsLagIpfixConfig() {
    }

    public VMwareDvsLagIpfixConfig(
           java.lang.Boolean ipfixEnabled) {
        this.ipfixEnabled = ipfixEnabled;
    }


    /**
     * Gets the ipfixEnabled value for this VMwareDvsLagIpfixConfig.
     * 
     * @return ipfixEnabled
     */
    public java.lang.Boolean getIpfixEnabled() {
        return ipfixEnabled;
    }


    /**
     * Sets the ipfixEnabled value for this VMwareDvsLagIpfixConfig.
     * 
     * @param ipfixEnabled
     */
    public void setIpfixEnabled(java.lang.Boolean ipfixEnabled) {
        this.ipfixEnabled = ipfixEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDvsLagIpfixConfig)) return false;
        VMwareDvsLagIpfixConfig other = (VMwareDvsLagIpfixConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipfixEnabled==null && other.getIpfixEnabled()==null) || 
             (this.ipfixEnabled!=null &&
              this.ipfixEnabled.equals(other.getIpfixEnabled())));
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
        if (getIpfixEnabled() != null) {
            _hashCode += getIpfixEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDvsLagIpfixConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLagIpfixConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfixEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfixEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
