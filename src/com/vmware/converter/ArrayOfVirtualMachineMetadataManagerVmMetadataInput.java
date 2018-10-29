/**
 * ArrayOfVirtualMachineMetadataManagerVmMetadataInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineMetadataManagerVmMetadataInput  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineMetadataManagerVmMetadataInput[] virtualMachineMetadataManagerVmMetadataInput;

    public ArrayOfVirtualMachineMetadataManagerVmMetadataInput() {
    }

    public ArrayOfVirtualMachineMetadataManagerVmMetadataInput(
           com.vmware.converter.VirtualMachineMetadataManagerVmMetadataInput[] virtualMachineMetadataManagerVmMetadataInput) {
           this.virtualMachineMetadataManagerVmMetadataInput = virtualMachineMetadataManagerVmMetadataInput;
    }


    /**
     * Gets the virtualMachineMetadataManagerVmMetadataInput value for this ArrayOfVirtualMachineMetadataManagerVmMetadataInput.
     * 
     * @return virtualMachineMetadataManagerVmMetadataInput
     */
    public com.vmware.converter.VirtualMachineMetadataManagerVmMetadataInput[] getVirtualMachineMetadataManagerVmMetadataInput() {
        return virtualMachineMetadataManagerVmMetadataInput;
    }


    /**
     * Sets the virtualMachineMetadataManagerVmMetadataInput value for this ArrayOfVirtualMachineMetadataManagerVmMetadataInput.
     * 
     * @param virtualMachineMetadataManagerVmMetadataInput
     */
    public void setVirtualMachineMetadataManagerVmMetadataInput(com.vmware.converter.VirtualMachineMetadataManagerVmMetadataInput[] virtualMachineMetadataManagerVmMetadataInput) {
        this.virtualMachineMetadataManagerVmMetadataInput = virtualMachineMetadataManagerVmMetadataInput;
    }

    public com.vmware.converter.VirtualMachineMetadataManagerVmMetadataInput getVirtualMachineMetadataManagerVmMetadataInput(int i) {
        return this.virtualMachineMetadataManagerVmMetadataInput[i];
    }

    public void setVirtualMachineMetadataManagerVmMetadataInput(int i, com.vmware.converter.VirtualMachineMetadataManagerVmMetadataInput _value) {
        this.virtualMachineMetadataManagerVmMetadataInput[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineMetadataManagerVmMetadataInput)) return false;
        ArrayOfVirtualMachineMetadataManagerVmMetadataInput other = (ArrayOfVirtualMachineMetadataManagerVmMetadataInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineMetadataManagerVmMetadataInput==null && other.getVirtualMachineMetadataManagerVmMetadataInput()==null) || 
             (this.virtualMachineMetadataManagerVmMetadataInput!=null &&
              java.util.Arrays.equals(this.virtualMachineMetadataManagerVmMetadataInput, other.getVirtualMachineMetadataManagerVmMetadataInput())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVirtualMachineMetadataManagerVmMetadataInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineMetadataManagerVmMetadataInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineMetadataManagerVmMetadataInput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineMetadataManagerVmMetadataInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineMetadataManagerVmMetadataInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineMetadataManagerVmMetadataInput");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMetadataManagerVmMetadataInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMetadataManagerVmMetadataInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
