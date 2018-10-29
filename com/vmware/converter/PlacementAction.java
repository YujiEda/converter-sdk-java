/**
 * PlacementAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementAction  extends com.vmware.converter.ClusterAction  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.ManagedObjectReference targetHost;

    private com.vmware.converter.VirtualMachineRelocateSpec relocateSpec;

    public PlacementAction() {
    }

    public PlacementAction(
           java.lang.String type,
           com.vmware.converter.ManagedObjectReference target,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.ManagedObjectReference targetHost,
           com.vmware.converter.VirtualMachineRelocateSpec relocateSpec) {
        super(
            type,
            target);
        this.vm = vm;
        this.targetHost = targetHost;
        this.relocateSpec = relocateSpec;
    }


    /**
     * Gets the vm value for this PlacementAction.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this PlacementAction.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the targetHost value for this PlacementAction.
     * 
     * @return targetHost
     */
    public com.vmware.converter.ManagedObjectReference getTargetHost() {
        return targetHost;
    }


    /**
     * Sets the targetHost value for this PlacementAction.
     * 
     * @param targetHost
     */
    public void setTargetHost(com.vmware.converter.ManagedObjectReference targetHost) {
        this.targetHost = targetHost;
    }


    /**
     * Gets the relocateSpec value for this PlacementAction.
     * 
     * @return relocateSpec
     */
    public com.vmware.converter.VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }


    /**
     * Sets the relocateSpec value for this PlacementAction.
     * 
     * @param relocateSpec
     */
    public void setRelocateSpec(com.vmware.converter.VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementAction)) return false;
        PlacementAction other = (PlacementAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.targetHost==null && other.getTargetHost()==null) || 
             (this.targetHost!=null &&
              this.targetHost.equals(other.getTargetHost()))) &&
            ((this.relocateSpec==null && other.getRelocateSpec()==null) || 
             (this.relocateSpec!=null &&
              this.relocateSpec.equals(other.getRelocateSpec())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getTargetHost() != null) {
            _hashCode += getTargetHost().hashCode();
        }
        if (getRelocateSpec() != null) {
            _hashCode += getRelocateSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relocateSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "relocateSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpec"));
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
