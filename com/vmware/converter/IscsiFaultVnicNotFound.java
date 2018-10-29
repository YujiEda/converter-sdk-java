/**
 * IscsiFaultVnicNotFound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IscsiFaultVnicNotFound  extends com.vmware.converter.IscsiFault  implements java.io.Serializable {
    private java.lang.String vnicDevice;

    public IscsiFaultVnicNotFound() {
    }

    public IscsiFaultVnicNotFound(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String vnicDevice) {
        super(
            faultCause,
            faultMessage);
        this.vnicDevice = vnicDevice;
    }


    /**
     * Gets the vnicDevice value for this IscsiFaultVnicNotFound.
     * 
     * @return vnicDevice
     */
    public java.lang.String getVnicDevice() {
        return vnicDevice;
    }


    /**
     * Sets the vnicDevice value for this IscsiFaultVnicNotFound.
     * 
     * @param vnicDevice
     */
    public void setVnicDevice(java.lang.String vnicDevice) {
        this.vnicDevice = vnicDevice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IscsiFaultVnicNotFound)) return false;
        IscsiFaultVnicNotFound other = (IscsiFaultVnicNotFound) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vnicDevice==null && other.getVnicDevice()==null) || 
             (this.vnicDevice!=null &&
              this.vnicDevice.equals(other.getVnicDevice())));
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
        if (getVnicDevice() != null) {
            _hashCode += getVnicDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IscsiFaultVnicNotFound.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiFaultVnicNotFound"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnicDevice"));
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
