/**
 * DVSHealthCheckConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSHealthCheckConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enable;

    private java.lang.Integer interval;

    public DVSHealthCheckConfig() {
    }

    public DVSHealthCheckConfig(
           java.lang.Boolean enable,
           java.lang.Integer interval) {
        this.enable = enable;
        this.interval = interval;
    }


    /**
     * Gets the enable value for this DVSHealthCheckConfig.
     * 
     * @return enable
     */
    public java.lang.Boolean getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this DVSHealthCheckConfig.
     * 
     * @param enable
     */
    public void setEnable(java.lang.Boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the interval value for this DVSHealthCheckConfig.
     * 
     * @return interval
     */
    public java.lang.Integer getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this DVSHealthCheckConfig.
     * 
     * @param interval
     */
    public void setInterval(java.lang.Integer interval) {
        this.interval = interval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSHealthCheckConfig)) return false;
        DVSHealthCheckConfig other = (DVSHealthCheckConfig) obj;
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
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval())));
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
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSHealthCheckConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSHealthCheckConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "interval"));
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
