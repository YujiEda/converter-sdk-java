/**
 * VirtualMachineVFlashModuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVFlashModuleInfo  extends com.vmware.converter.VirtualMachineTargetInfo  implements java.io.Serializable {
    private com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption vFlashModule;

    public VirtualMachineVFlashModuleInfo() {
    }

    public VirtualMachineVFlashModuleInfo(
           java.lang.String name,
           java.lang.String[] configurationTag,
           com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption vFlashModule) {
        super(
            name,
            configurationTag);
        this.vFlashModule = vFlashModule;
    }


    /**
     * Gets the vFlashModule value for this VirtualMachineVFlashModuleInfo.
     * 
     * @return vFlashModule
     */
    public com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption getVFlashModule() {
        return vFlashModule;
    }


    /**
     * Sets the vFlashModule value for this VirtualMachineVFlashModuleInfo.
     * 
     * @param vFlashModule
     */
    public void setVFlashModule(com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption vFlashModule) {
        this.vFlashModule = vFlashModule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVFlashModuleInfo)) return false;
        VirtualMachineVFlashModuleInfo other = (VirtualMachineVFlashModuleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vFlashModule==null && other.getVFlashModule()==null) || 
             (this.vFlashModule!=null &&
              this.vFlashModule.equals(other.getVFlashModule())));
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
        if (getVFlashModule() != null) {
            _hashCode += getVFlashModule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineVFlashModuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVFlashModuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashModule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption"));
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
