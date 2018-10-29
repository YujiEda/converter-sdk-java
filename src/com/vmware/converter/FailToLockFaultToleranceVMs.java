/**
 * FailToLockFaultToleranceVMs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FailToLockFaultToleranceVMs  extends com.vmware.converter.RuntimeFault  implements java.io.Serializable {
    private java.lang.String vmName;

    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.ManagedObjectReference alreadyLockedVm;

    public FailToLockFaultToleranceVMs() {
    }

    public FailToLockFaultToleranceVMs(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String vmName,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.ManagedObjectReference alreadyLockedVm) {
        super(
            faultCause,
            faultMessage);
        this.vmName = vmName;
        this.vm = vm;
        this.alreadyLockedVm = alreadyLockedVm;
    }


    /**
     * Gets the vmName value for this FailToLockFaultToleranceVMs.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this FailToLockFaultToleranceVMs.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the vm value for this FailToLockFaultToleranceVMs.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this FailToLockFaultToleranceVMs.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the alreadyLockedVm value for this FailToLockFaultToleranceVMs.
     * 
     * @return alreadyLockedVm
     */
    public com.vmware.converter.ManagedObjectReference getAlreadyLockedVm() {
        return alreadyLockedVm;
    }


    /**
     * Sets the alreadyLockedVm value for this FailToLockFaultToleranceVMs.
     * 
     * @param alreadyLockedVm
     */
    public void setAlreadyLockedVm(com.vmware.converter.ManagedObjectReference alreadyLockedVm) {
        this.alreadyLockedVm = alreadyLockedVm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailToLockFaultToleranceVMs)) return false;
        FailToLockFaultToleranceVMs other = (FailToLockFaultToleranceVMs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.alreadyLockedVm==null && other.getAlreadyLockedVm()==null) || 
             (this.alreadyLockedVm!=null &&
              this.alreadyLockedVm.equals(other.getAlreadyLockedVm())));
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
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getAlreadyLockedVm() != null) {
            _hashCode += getAlreadyLockedVm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailToLockFaultToleranceVMs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FailToLockFaultToleranceVMs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alreadyLockedVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alreadyLockedVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
