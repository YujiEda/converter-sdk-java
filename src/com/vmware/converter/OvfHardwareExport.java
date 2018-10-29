/**
 * OvfHardwareExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfHardwareExport  extends com.vmware.converter.OvfExport  implements java.io.Serializable {
    private com.vmware.converter.VirtualDevice device;

    private java.lang.String vmPath;

    public OvfHardwareExport() {
    }

    public OvfHardwareExport(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.VirtualDevice device,
           java.lang.String vmPath) {
        super(
            faultCause,
            faultMessage);
        this.device = device;
        this.vmPath = vmPath;
    }


    /**
     * Gets the device value for this OvfHardwareExport.
     * 
     * @return device
     */
    public com.vmware.converter.VirtualDevice getDevice() {
        return device;
    }


    /**
     * Sets the device value for this OvfHardwareExport.
     * 
     * @param device
     */
    public void setDevice(com.vmware.converter.VirtualDevice device) {
        this.device = device;
    }


    /**
     * Gets the vmPath value for this OvfHardwareExport.
     * 
     * @return vmPath
     */
    public java.lang.String getVmPath() {
        return vmPath;
    }


    /**
     * Sets the vmPath value for this OvfHardwareExport.
     * 
     * @param vmPath
     */
    public void setVmPath(java.lang.String vmPath) {
        this.vmPath = vmPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfHardwareExport)) return false;
        OvfHardwareExport other = (OvfHardwareExport) obj;
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
            ((this.vmPath==null && other.getVmPath()==null) || 
             (this.vmPath!=null &&
              this.vmPath.equals(other.getVmPath())));
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
        if (getVmPath() != null) {
            _hashCode += getVmPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfHardwareExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfHardwareExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmPath"));
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
