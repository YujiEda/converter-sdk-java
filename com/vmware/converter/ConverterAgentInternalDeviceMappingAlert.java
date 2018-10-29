/**
 * ConverterAgentInternalDeviceMappingAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDeviceMappingAlert  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String alertMessage;

    private boolean needsForcing;

    private com.vmware.converter.VirtualDevice device;

    public ConverterAgentInternalDeviceMappingAlert() {
    }

    public ConverterAgentInternalDeviceMappingAlert(
           java.lang.String alertMessage,
           boolean needsForcing,
           com.vmware.converter.VirtualDevice device) {
        this.alertMessage = alertMessage;
        this.needsForcing = needsForcing;
        this.device = device;
    }


    /**
     * Gets the alertMessage value for this ConverterAgentInternalDeviceMappingAlert.
     * 
     * @return alertMessage
     */
    public java.lang.String getAlertMessage() {
        return alertMessage;
    }


    /**
     * Sets the alertMessage value for this ConverterAgentInternalDeviceMappingAlert.
     * 
     * @param alertMessage
     */
    public void setAlertMessage(java.lang.String alertMessage) {
        this.alertMessage = alertMessage;
    }


    /**
     * Gets the needsForcing value for this ConverterAgentInternalDeviceMappingAlert.
     * 
     * @return needsForcing
     */
    public boolean isNeedsForcing() {
        return needsForcing;
    }


    /**
     * Sets the needsForcing value for this ConverterAgentInternalDeviceMappingAlert.
     * 
     * @param needsForcing
     */
    public void setNeedsForcing(boolean needsForcing) {
        this.needsForcing = needsForcing;
    }


    /**
     * Gets the device value for this ConverterAgentInternalDeviceMappingAlert.
     * 
     * @return device
     */
    public com.vmware.converter.VirtualDevice getDevice() {
        return device;
    }


    /**
     * Sets the device value for this ConverterAgentInternalDeviceMappingAlert.
     * 
     * @param device
     */
    public void setDevice(com.vmware.converter.VirtualDevice device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDeviceMappingAlert)) return false;
        ConverterAgentInternalDeviceMappingAlert other = (ConverterAgentInternalDeviceMappingAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alertMessage==null && other.getAlertMessage()==null) || 
             (this.alertMessage!=null &&
              this.alertMessage.equals(other.getAlertMessage()))) &&
            this.needsForcing == other.isNeedsForcing() &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice())));
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
        if (getAlertMessage() != null) {
            _hashCode += getAlertMessage().hashCode();
        }
        _hashCode += (isNeedsForcing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDeviceMappingAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDeviceMappingAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "alertMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needsForcing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "needsForcing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDevice"));
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
