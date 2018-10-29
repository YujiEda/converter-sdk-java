/**
 * VirtualUSBXHCIController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualUSBXHCIController  extends com.vmware.converter.VirtualController  implements java.io.Serializable {
    private java.lang.Boolean autoConnectDevices;

    public VirtualUSBXHCIController() {
    }

    public VirtualUSBXHCIController(
           int key,
           com.vmware.converter.Description deviceInfo,
           com.vmware.converter.VirtualDeviceBackingInfo backing,
           com.vmware.converter.VirtualDeviceConnectInfo connectable,
           com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           int busNumber,
           int[] device,
           java.lang.Boolean autoConnectDevices) {
        super(
            key,
            deviceInfo,
            backing,
            connectable,
            slotInfo,
            controllerKey,
            unitNumber,
            busNumber,
            device);
        this.autoConnectDevices = autoConnectDevices;
    }


    /**
     * Gets the autoConnectDevices value for this VirtualUSBXHCIController.
     * 
     * @return autoConnectDevices
     */
    public java.lang.Boolean getAutoConnectDevices() {
        return autoConnectDevices;
    }


    /**
     * Sets the autoConnectDevices value for this VirtualUSBXHCIController.
     * 
     * @param autoConnectDevices
     */
    public void setAutoConnectDevices(java.lang.Boolean autoConnectDevices) {
        this.autoConnectDevices = autoConnectDevices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualUSBXHCIController)) return false;
        VirtualUSBXHCIController other = (VirtualUSBXHCIController) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoConnectDevices==null && other.getAutoConnectDevices()==null) || 
             (this.autoConnectDevices!=null &&
              this.autoConnectDevices.equals(other.getAutoConnectDevices())));
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
        if (getAutoConnectDevices() != null) {
            _hashCode += getAutoConnectDevices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualUSBXHCIController.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualUSBXHCIController"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoConnectDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoConnectDevices"));
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
