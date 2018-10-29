/**
 * DeviceControllerNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DeviceControllerNotSupported  extends com.vmware.converter.DeviceNotSupported  implements java.io.Serializable {
    private java.lang.String controller;

    public DeviceControllerNotSupported() {
    }

    public DeviceControllerNotSupported(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String device,
           java.lang.String reason,
           java.lang.String controller) {
        super(
            faultCause,
            faultMessage,
            device,
            reason);
        this.controller = controller;
    }


    /**
     * Gets the controller value for this DeviceControllerNotSupported.
     * 
     * @return controller
     */
    public java.lang.String getController() {
        return controller;
    }


    /**
     * Sets the controller value for this DeviceControllerNotSupported.
     * 
     * @param controller
     */
    public void setController(java.lang.String controller) {
        this.controller = controller;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceControllerNotSupported)) return false;
        DeviceControllerNotSupported other = (DeviceControllerNotSupported) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.controller==null && other.getController()==null) || 
             (this.controller!=null &&
              this.controller.equals(other.getController())));
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
        if (getController() != null) {
            _hashCode += getController().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceControllerNotSupported.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DeviceControllerNotSupported"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controller");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "controller"));
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
