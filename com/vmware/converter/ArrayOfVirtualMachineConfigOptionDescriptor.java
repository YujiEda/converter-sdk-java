/**
 * ArrayOfVirtualMachineConfigOptionDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineConfigOptionDescriptor  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineConfigOptionDescriptor[] virtualMachineConfigOptionDescriptor;

    public ArrayOfVirtualMachineConfigOptionDescriptor() {
    }

    public ArrayOfVirtualMachineConfigOptionDescriptor(
           com.vmware.converter.VirtualMachineConfigOptionDescriptor[] virtualMachineConfigOptionDescriptor) {
           this.virtualMachineConfigOptionDescriptor = virtualMachineConfigOptionDescriptor;
    }


    /**
     * Gets the virtualMachineConfigOptionDescriptor value for this ArrayOfVirtualMachineConfigOptionDescriptor.
     * 
     * @return virtualMachineConfigOptionDescriptor
     */
    public com.vmware.converter.VirtualMachineConfigOptionDescriptor[] getVirtualMachineConfigOptionDescriptor() {
        return virtualMachineConfigOptionDescriptor;
    }


    /**
     * Sets the virtualMachineConfigOptionDescriptor value for this ArrayOfVirtualMachineConfigOptionDescriptor.
     * 
     * @param virtualMachineConfigOptionDescriptor
     */
    public void setVirtualMachineConfigOptionDescriptor(com.vmware.converter.VirtualMachineConfigOptionDescriptor[] virtualMachineConfigOptionDescriptor) {
        this.virtualMachineConfigOptionDescriptor = virtualMachineConfigOptionDescriptor;
    }

    public com.vmware.converter.VirtualMachineConfigOptionDescriptor getVirtualMachineConfigOptionDescriptor(int i) {
        return this.virtualMachineConfigOptionDescriptor[i];
    }

    public void setVirtualMachineConfigOptionDescriptor(int i, com.vmware.converter.VirtualMachineConfigOptionDescriptor _value) {
        this.virtualMachineConfigOptionDescriptor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineConfigOptionDescriptor)) return false;
        ArrayOfVirtualMachineConfigOptionDescriptor other = (ArrayOfVirtualMachineConfigOptionDescriptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineConfigOptionDescriptor==null && other.getVirtualMachineConfigOptionDescriptor()==null) || 
             (this.virtualMachineConfigOptionDescriptor!=null &&
              java.util.Arrays.equals(this.virtualMachineConfigOptionDescriptor, other.getVirtualMachineConfigOptionDescriptor())));
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
        if (getVirtualMachineConfigOptionDescriptor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineConfigOptionDescriptor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineConfigOptionDescriptor(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineConfigOptionDescriptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineConfigOptionDescriptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineConfigOptionDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigOptionDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigOptionDescriptor"));
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
