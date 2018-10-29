/**
 * VirtualMachinePciSharedGpuPassthroughInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachinePciSharedGpuPassthroughInfo  extends com.vmware.converter.VirtualMachineTargetInfo  implements java.io.Serializable {
    private java.lang.String vgpu;

    public VirtualMachinePciSharedGpuPassthroughInfo() {
    }

    public VirtualMachinePciSharedGpuPassthroughInfo(
           java.lang.String name,
           java.lang.String[] configurationTag,
           java.lang.String vgpu) {
        super(
            name,
            configurationTag);
        this.vgpu = vgpu;
    }


    /**
     * Gets the vgpu value for this VirtualMachinePciSharedGpuPassthroughInfo.
     * 
     * @return vgpu
     */
    public java.lang.String getVgpu() {
        return vgpu;
    }


    /**
     * Sets the vgpu value for this VirtualMachinePciSharedGpuPassthroughInfo.
     * 
     * @param vgpu
     */
    public void setVgpu(java.lang.String vgpu) {
        this.vgpu = vgpu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachinePciSharedGpuPassthroughInfo)) return false;
        VirtualMachinePciSharedGpuPassthroughInfo other = (VirtualMachinePciSharedGpuPassthroughInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vgpu==null && other.getVgpu()==null) || 
             (this.vgpu!=null &&
              this.vgpu.equals(other.getVgpu())));
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
        if (getVgpu() != null) {
            _hashCode += getVgpu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachinePciSharedGpuPassthroughInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciSharedGpuPassthroughInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vgpu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vgpu"));
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
