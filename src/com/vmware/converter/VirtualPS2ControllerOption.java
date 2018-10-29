/**
 * VirtualPS2ControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualPS2ControllerOption  extends com.vmware.converter.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.converter.IntOption numKeyboards;

    private com.vmware.converter.IntOption numPointingDevices;

    public VirtualPS2ControllerOption() {
    }

    public VirtualPS2ControllerOption(
           java.lang.String type,
           com.vmware.converter.VirtualDeviceConnectOption connectOption,
           com.vmware.converter.VirtualDeviceBusSlotOption busSlotOption,
           java.lang.String controllerType,
           com.vmware.converter.BoolOption autoAssignController,
           com.vmware.converter.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           java.lang.Boolean hotRemoveSupported,
           com.vmware.converter.IntOption devices,
           java.lang.String[] supportedDevice,
           com.vmware.converter.IntOption numKeyboards,
           com.vmware.converter.IntOption numPointingDevices) {
        super(
            type,
            connectOption,
            busSlotOption,
            controllerType,
            autoAssignController,
            backingOption,
            defaultBackingOptionIndex,
            licensingLimit,
            deprecated,
            plugAndPlay,
            hotRemoveSupported,
            devices,
            supportedDevice);
        this.numKeyboards = numKeyboards;
        this.numPointingDevices = numPointingDevices;
    }


    /**
     * Gets the numKeyboards value for this VirtualPS2ControllerOption.
     * 
     * @return numKeyboards
     */
    public com.vmware.converter.IntOption getNumKeyboards() {
        return numKeyboards;
    }


    /**
     * Sets the numKeyboards value for this VirtualPS2ControllerOption.
     * 
     * @param numKeyboards
     */
    public void setNumKeyboards(com.vmware.converter.IntOption numKeyboards) {
        this.numKeyboards = numKeyboards;
    }


    /**
     * Gets the numPointingDevices value for this VirtualPS2ControllerOption.
     * 
     * @return numPointingDevices
     */
    public com.vmware.converter.IntOption getNumPointingDevices() {
        return numPointingDevices;
    }


    /**
     * Sets the numPointingDevices value for this VirtualPS2ControllerOption.
     * 
     * @param numPointingDevices
     */
    public void setNumPointingDevices(com.vmware.converter.IntOption numPointingDevices) {
        this.numPointingDevices = numPointingDevices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualPS2ControllerOption)) return false;
        VirtualPS2ControllerOption other = (VirtualPS2ControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numKeyboards==null && other.getNumKeyboards()==null) || 
             (this.numKeyboards!=null &&
              this.numKeyboards.equals(other.getNumKeyboards()))) &&
            ((this.numPointingDevices==null && other.getNumPointingDevices()==null) || 
             (this.numPointingDevices!=null &&
              this.numPointingDevices.equals(other.getNumPointingDevices())));
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
        if (getNumKeyboards() != null) {
            _hashCode += getNumKeyboards().hashCode();
        }
        if (getNumPointingDevices() != null) {
            _hashCode += getNumPointingDevices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualPS2ControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualPS2ControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numKeyboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numKeyboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPointingDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPointingDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
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
