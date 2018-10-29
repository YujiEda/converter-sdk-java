/**
 * VirtualMachineVMCIDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVMCIDevice  extends com.vmware.converter.VirtualDevice  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Boolean allowUnrestrictedCommunication;

    private java.lang.Boolean filterEnable;

    private com.vmware.converter.VirtualMachineVMCIDeviceFilterInfo filterInfo;

    public VirtualMachineVMCIDevice() {
    }

    public VirtualMachineVMCIDevice(
           int key,
           com.vmware.converter.Description deviceInfo,
           com.vmware.converter.VirtualDeviceBackingInfo backing,
           com.vmware.converter.VirtualDeviceConnectInfo connectable,
           com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           java.lang.Long id,
           java.lang.Boolean allowUnrestrictedCommunication,
           java.lang.Boolean filterEnable,
           com.vmware.converter.VirtualMachineVMCIDeviceFilterInfo filterInfo) {
        super(
            key,
            deviceInfo,
            backing,
            connectable,
            slotInfo,
            controllerKey,
            unitNumber);
        this.id = id;
        this.allowUnrestrictedCommunication = allowUnrestrictedCommunication;
        this.filterEnable = filterEnable;
        this.filterInfo = filterInfo;
    }


    /**
     * Gets the id value for this VirtualMachineVMCIDevice.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this VirtualMachineVMCIDevice.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the allowUnrestrictedCommunication value for this VirtualMachineVMCIDevice.
     * 
     * @return allowUnrestrictedCommunication
     */
    public java.lang.Boolean getAllowUnrestrictedCommunication() {
        return allowUnrestrictedCommunication;
    }


    /**
     * Sets the allowUnrestrictedCommunication value for this VirtualMachineVMCIDevice.
     * 
     * @param allowUnrestrictedCommunication
     */
    public void setAllowUnrestrictedCommunication(java.lang.Boolean allowUnrestrictedCommunication) {
        this.allowUnrestrictedCommunication = allowUnrestrictedCommunication;
    }


    /**
     * Gets the filterEnable value for this VirtualMachineVMCIDevice.
     * 
     * @return filterEnable
     */
    public java.lang.Boolean getFilterEnable() {
        return filterEnable;
    }


    /**
     * Sets the filterEnable value for this VirtualMachineVMCIDevice.
     * 
     * @param filterEnable
     */
    public void setFilterEnable(java.lang.Boolean filterEnable) {
        this.filterEnable = filterEnable;
    }


    /**
     * Gets the filterInfo value for this VirtualMachineVMCIDevice.
     * 
     * @return filterInfo
     */
    public com.vmware.converter.VirtualMachineVMCIDeviceFilterInfo getFilterInfo() {
        return filterInfo;
    }


    /**
     * Sets the filterInfo value for this VirtualMachineVMCIDevice.
     * 
     * @param filterInfo
     */
    public void setFilterInfo(com.vmware.converter.VirtualMachineVMCIDeviceFilterInfo filterInfo) {
        this.filterInfo = filterInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVMCIDevice)) return false;
        VirtualMachineVMCIDevice other = (VirtualMachineVMCIDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.allowUnrestrictedCommunication==null && other.getAllowUnrestrictedCommunication()==null) || 
             (this.allowUnrestrictedCommunication!=null &&
              this.allowUnrestrictedCommunication.equals(other.getAllowUnrestrictedCommunication()))) &&
            ((this.filterEnable==null && other.getFilterEnable()==null) || 
             (this.filterEnable!=null &&
              this.filterEnable.equals(other.getFilterEnable()))) &&
            ((this.filterInfo==null && other.getFilterInfo()==null) || 
             (this.filterInfo!=null &&
              this.filterInfo.equals(other.getFilterInfo())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAllowUnrestrictedCommunication() != null) {
            _hashCode += getAllowUnrestrictedCommunication().hashCode();
        }
        if (getFilterEnable() != null) {
            _hashCode += getFilterEnable().hashCode();
        }
        if (getFilterInfo() != null) {
            _hashCode += getFilterInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUnrestrictedCommunication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowUnrestrictedCommunication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filterEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filterInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceFilterInfo"));
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
