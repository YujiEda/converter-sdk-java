/**
 * CannotAccessVmDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class CannotAccessVmDevice  extends com.vmware.converter.CannotAccessVmComponent  implements java.io.Serializable {
    private java.lang.String device;

    private java.lang.String backing;

    private boolean connected;

    public CannotAccessVmDevice() {
    }

    public CannotAccessVmDevice(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String device,
           java.lang.String backing,
           boolean connected) {
        super(
            faultCause,
            faultMessage);
        this.device = device;
        this.backing = backing;
        this.connected = connected;
    }


    /**
     * Gets the device value for this CannotAccessVmDevice.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this CannotAccessVmDevice.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the backing value for this CannotAccessVmDevice.
     * 
     * @return backing
     */
    public java.lang.String getBacking() {
        return backing;
    }


    /**
     * Sets the backing value for this CannotAccessVmDevice.
     * 
     * @param backing
     */
    public void setBacking(java.lang.String backing) {
        this.backing = backing;
    }


    /**
     * Gets the connected value for this CannotAccessVmDevice.
     * 
     * @return connected
     */
    public boolean isConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this CannotAccessVmDevice.
     * 
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CannotAccessVmDevice)) return false;
        CannotAccessVmDevice other = (CannotAccessVmDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.backing==null && other.getBacking()==null) || 
             (this.backing!=null &&
              this.backing.equals(other.getBacking()))) &&
            this.connected == other.isConnected();
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getBacking() != null) {
            _hashCode += getBacking().hashCode();
        }
        _hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CannotAccessVmDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CannotAccessVmDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
