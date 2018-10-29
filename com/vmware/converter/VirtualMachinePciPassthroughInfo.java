/**
 * VirtualMachinePciPassthroughInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachinePciPassthroughInfo  extends com.vmware.converter.VirtualMachineTargetInfo  implements java.io.Serializable {
    private com.vmware.converter.HostPciDevice pciDevice;

    private java.lang.String systemId;

    public VirtualMachinePciPassthroughInfo() {
    }

    public VirtualMachinePciPassthroughInfo(
           java.lang.String name,
           java.lang.String[] configurationTag,
           com.vmware.converter.HostPciDevice pciDevice,
           java.lang.String systemId) {
        super(
            name,
            configurationTag);
        this.pciDevice = pciDevice;
        this.systemId = systemId;
    }


    /**
     * Gets the pciDevice value for this VirtualMachinePciPassthroughInfo.
     * 
     * @return pciDevice
     */
    public com.vmware.converter.HostPciDevice getPciDevice() {
        return pciDevice;
    }


    /**
     * Sets the pciDevice value for this VirtualMachinePciPassthroughInfo.
     * 
     * @param pciDevice
     */
    public void setPciDevice(com.vmware.converter.HostPciDevice pciDevice) {
        this.pciDevice = pciDevice;
    }


    /**
     * Gets the systemId value for this VirtualMachinePciPassthroughInfo.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this VirtualMachinePciPassthroughInfo.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachinePciPassthroughInfo)) return false;
        VirtualMachinePciPassthroughInfo other = (VirtualMachinePciPassthroughInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pciDevice==null && other.getPciDevice()==null) || 
             (this.pciDevice!=null &&
              this.pciDevice.equals(other.getPciDevice()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId())));
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
        if (getPciDevice() != null) {
            _hashCode += getPciDevice().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachinePciPassthroughInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciPassthroughInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPciDevice"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemId"));
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
