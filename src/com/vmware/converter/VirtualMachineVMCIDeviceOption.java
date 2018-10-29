/**
 * VirtualMachineVMCIDeviceOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVMCIDeviceOption  extends com.vmware.converter.VirtualDeviceOption  implements java.io.Serializable {
    private com.vmware.converter.BoolOption allowUnrestrictedCommunication;

    private com.vmware.converter.VirtualMachineVMCIDeviceOptionFilterSpecOption filterSpecOption;

    private com.vmware.converter.BoolOption filterSupported;

    public VirtualMachineVMCIDeviceOption() {
    }

    public VirtualMachineVMCIDeviceOption(
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
           com.vmware.converter.BoolOption allowUnrestrictedCommunication,
           com.vmware.converter.VirtualMachineVMCIDeviceOptionFilterSpecOption filterSpecOption,
           com.vmware.converter.BoolOption filterSupported) {
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
            hotRemoveSupported);
        this.allowUnrestrictedCommunication = allowUnrestrictedCommunication;
        this.filterSpecOption = filterSpecOption;
        this.filterSupported = filterSupported;
    }


    /**
     * Gets the allowUnrestrictedCommunication value for this VirtualMachineVMCIDeviceOption.
     * 
     * @return allowUnrestrictedCommunication
     */
    public com.vmware.converter.BoolOption getAllowUnrestrictedCommunication() {
        return allowUnrestrictedCommunication;
    }


    /**
     * Sets the allowUnrestrictedCommunication value for this VirtualMachineVMCIDeviceOption.
     * 
     * @param allowUnrestrictedCommunication
     */
    public void setAllowUnrestrictedCommunication(com.vmware.converter.BoolOption allowUnrestrictedCommunication) {
        this.allowUnrestrictedCommunication = allowUnrestrictedCommunication;
    }


    /**
     * Gets the filterSpecOption value for this VirtualMachineVMCIDeviceOption.
     * 
     * @return filterSpecOption
     */
    public com.vmware.converter.VirtualMachineVMCIDeviceOptionFilterSpecOption getFilterSpecOption() {
        return filterSpecOption;
    }


    /**
     * Sets the filterSpecOption value for this VirtualMachineVMCIDeviceOption.
     * 
     * @param filterSpecOption
     */
    public void setFilterSpecOption(com.vmware.converter.VirtualMachineVMCIDeviceOptionFilterSpecOption filterSpecOption) {
        this.filterSpecOption = filterSpecOption;
    }


    /**
     * Gets the filterSupported value for this VirtualMachineVMCIDeviceOption.
     * 
     * @return filterSupported
     */
    public com.vmware.converter.BoolOption getFilterSupported() {
        return filterSupported;
    }


    /**
     * Sets the filterSupported value for this VirtualMachineVMCIDeviceOption.
     * 
     * @param filterSupported
     */
    public void setFilterSupported(com.vmware.converter.BoolOption filterSupported) {
        this.filterSupported = filterSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVMCIDeviceOption)) return false;
        VirtualMachineVMCIDeviceOption other = (VirtualMachineVMCIDeviceOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowUnrestrictedCommunication==null && other.getAllowUnrestrictedCommunication()==null) || 
             (this.allowUnrestrictedCommunication!=null &&
              this.allowUnrestrictedCommunication.equals(other.getAllowUnrestrictedCommunication()))) &&
            ((this.filterSpecOption==null && other.getFilterSpecOption()==null) || 
             (this.filterSpecOption!=null &&
              this.filterSpecOption.equals(other.getFilterSpecOption()))) &&
            ((this.filterSupported==null && other.getFilterSupported()==null) || 
             (this.filterSupported!=null &&
              this.filterSupported.equals(other.getFilterSupported())));
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
        if (getAllowUnrestrictedCommunication() != null) {
            _hashCode += getAllowUnrestrictedCommunication().hashCode();
        }
        if (getFilterSpecOption() != null) {
            _hashCode += getFilterSpecOption().hashCode();
        }
        if (getFilterSupported() != null) {
            _hashCode += getFilterSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDeviceOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUnrestrictedCommunication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowUnrestrictedCommunication"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterSpecOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filterSpecOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceOptionFilterSpecOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filterSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
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
