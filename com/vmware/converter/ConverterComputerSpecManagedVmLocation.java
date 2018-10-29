/**
 * ConverterComputerSpecManagedVmLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerSpecManagedVmLocation  extends com.vmware.converter.ConverterComputerSpecVmLocation  implements java.io.Serializable {
    private com.vmware.converter.ConverterVimConnectionSpec vimConnect;

    private com.vmware.converter.ManagedObjectReference vm;

    private java.lang.String uuid;

    private java.lang.String vmName;

    public ConverterComputerSpecManagedVmLocation() {
    }

    public ConverterComputerSpecManagedVmLocation(
           com.vmware.converter.ConverterVimConnectionSpec vimConnect,
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.String uuid,
           java.lang.String vmName) {
        this.vimConnect = vimConnect;
        this.vm = vm;
        this.uuid = uuid;
        this.vmName = vmName;
    }


    /**
     * Gets the vimConnect value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @return vimConnect
     */
    public com.vmware.converter.ConverterVimConnectionSpec getVimConnect() {
        return vimConnect;
    }


    /**
     * Sets the vimConnect value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @param vimConnect
     */
    public void setVimConnect(com.vmware.converter.ConverterVimConnectionSpec vimConnect) {
        this.vimConnect = vimConnect;
    }


    /**
     * Gets the vm value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the uuid value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the vmName value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this ConverterComputerSpecManagedVmLocation.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerSpecManagedVmLocation)) return false;
        ConverterComputerSpecManagedVmLocation other = (ConverterComputerSpecManagedVmLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vimConnect==null && other.getVimConnect()==null) || 
             (this.vimConnect!=null &&
              this.vimConnect.equals(other.getVimConnect()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName())));
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
        if (getVimConnect() != null) {
            _hashCode += getVimConnect().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerSpecManagedVmLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpecManagedVmLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimConnect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vimConnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVimConnectionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
