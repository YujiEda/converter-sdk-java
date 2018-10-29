/**
 * ArrayOfVirtualMachineDeviceRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineDeviceRuntimeInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] virtualMachineDeviceRuntimeInfo;

    public ArrayOfVirtualMachineDeviceRuntimeInfo() {
    }

    public ArrayOfVirtualMachineDeviceRuntimeInfo(
           com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] virtualMachineDeviceRuntimeInfo) {
           this.virtualMachineDeviceRuntimeInfo = virtualMachineDeviceRuntimeInfo;
    }


    /**
     * Gets the virtualMachineDeviceRuntimeInfo value for this ArrayOfVirtualMachineDeviceRuntimeInfo.
     * 
     * @return virtualMachineDeviceRuntimeInfo
     */
    public com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] getVirtualMachineDeviceRuntimeInfo() {
        return virtualMachineDeviceRuntimeInfo;
    }


    /**
     * Sets the virtualMachineDeviceRuntimeInfo value for this ArrayOfVirtualMachineDeviceRuntimeInfo.
     * 
     * @param virtualMachineDeviceRuntimeInfo
     */
    public void setVirtualMachineDeviceRuntimeInfo(com.vmware.converter.VirtualMachineDeviceRuntimeInfo[] virtualMachineDeviceRuntimeInfo) {
        this.virtualMachineDeviceRuntimeInfo = virtualMachineDeviceRuntimeInfo;
    }

    public com.vmware.converter.VirtualMachineDeviceRuntimeInfo getVirtualMachineDeviceRuntimeInfo(int i) {
        return this.virtualMachineDeviceRuntimeInfo[i];
    }

    public void setVirtualMachineDeviceRuntimeInfo(int i, com.vmware.converter.VirtualMachineDeviceRuntimeInfo _value) {
        this.virtualMachineDeviceRuntimeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineDeviceRuntimeInfo)) return false;
        ArrayOfVirtualMachineDeviceRuntimeInfo other = (ArrayOfVirtualMachineDeviceRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineDeviceRuntimeInfo==null && other.getVirtualMachineDeviceRuntimeInfo()==null) || 
             (this.virtualMachineDeviceRuntimeInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineDeviceRuntimeInfo, other.getVirtualMachineDeviceRuntimeInfo())));
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
        if (getVirtualMachineDeviceRuntimeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineDeviceRuntimeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineDeviceRuntimeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineDeviceRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineDeviceRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineDeviceRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDeviceRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDeviceRuntimeInfo"));
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
