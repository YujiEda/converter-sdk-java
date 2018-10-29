/**
 * VirtualMachineMetadataManagerVmMetadataInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineMetadataManagerVmMetadataInput  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String operation;

    private com.vmware.converter.VirtualMachineMetadataManagerVmMetadata vmMetadata;

    public VirtualMachineMetadataManagerVmMetadataInput() {
    }

    public VirtualMachineMetadataManagerVmMetadataInput(
           java.lang.String operation,
           com.vmware.converter.VirtualMachineMetadataManagerVmMetadata vmMetadata) {
        this.operation = operation;
        this.vmMetadata = vmMetadata;
    }


    /**
     * Gets the operation value for this VirtualMachineMetadataManagerVmMetadataInput.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this VirtualMachineMetadataManagerVmMetadataInput.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the vmMetadata value for this VirtualMachineMetadataManagerVmMetadataInput.
     * 
     * @return vmMetadata
     */
    public com.vmware.converter.VirtualMachineMetadataManagerVmMetadata getVmMetadata() {
        return vmMetadata;
    }


    /**
     * Sets the vmMetadata value for this VirtualMachineMetadataManagerVmMetadataInput.
     * 
     * @param vmMetadata
     */
    public void setVmMetadata(com.vmware.converter.VirtualMachineMetadataManagerVmMetadata vmMetadata) {
        this.vmMetadata = vmMetadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineMetadataManagerVmMetadataInput)) return false;
        VirtualMachineMetadataManagerVmMetadataInput other = (VirtualMachineMetadataManagerVmMetadataInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.vmMetadata==null && other.getVmMetadata()==null) || 
             (this.vmMetadata!=null &&
              this.vmMetadata.equals(other.getVmMetadata())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getVmMetadata() != null) {
            _hashCode += getVmMetadata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineMetadataManagerVmMetadataInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMetadataManagerVmMetadataInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMetadataManagerVmMetadata"));
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
