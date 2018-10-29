/**
 * ArrayOfVirtualMachineIdeDiskDevicePartitionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineIdeDiskDevicePartitionInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineIdeDiskDevicePartitionInfo[] virtualMachineIdeDiskDevicePartitionInfo;

    public ArrayOfVirtualMachineIdeDiskDevicePartitionInfo() {
    }

    public ArrayOfVirtualMachineIdeDiskDevicePartitionInfo(
           com.vmware.converter.VirtualMachineIdeDiskDevicePartitionInfo[] virtualMachineIdeDiskDevicePartitionInfo) {
           this.virtualMachineIdeDiskDevicePartitionInfo = virtualMachineIdeDiskDevicePartitionInfo;
    }


    /**
     * Gets the virtualMachineIdeDiskDevicePartitionInfo value for this ArrayOfVirtualMachineIdeDiskDevicePartitionInfo.
     * 
     * @return virtualMachineIdeDiskDevicePartitionInfo
     */
    public com.vmware.converter.VirtualMachineIdeDiskDevicePartitionInfo[] getVirtualMachineIdeDiskDevicePartitionInfo() {
        return virtualMachineIdeDiskDevicePartitionInfo;
    }


    /**
     * Sets the virtualMachineIdeDiskDevicePartitionInfo value for this ArrayOfVirtualMachineIdeDiskDevicePartitionInfo.
     * 
     * @param virtualMachineIdeDiskDevicePartitionInfo
     */
    public void setVirtualMachineIdeDiskDevicePartitionInfo(com.vmware.converter.VirtualMachineIdeDiskDevicePartitionInfo[] virtualMachineIdeDiskDevicePartitionInfo) {
        this.virtualMachineIdeDiskDevicePartitionInfo = virtualMachineIdeDiskDevicePartitionInfo;
    }

    public com.vmware.converter.VirtualMachineIdeDiskDevicePartitionInfo getVirtualMachineIdeDiskDevicePartitionInfo(int i) {
        return this.virtualMachineIdeDiskDevicePartitionInfo[i];
    }

    public void setVirtualMachineIdeDiskDevicePartitionInfo(int i, com.vmware.converter.VirtualMachineIdeDiskDevicePartitionInfo _value) {
        this.virtualMachineIdeDiskDevicePartitionInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineIdeDiskDevicePartitionInfo)) return false;
        ArrayOfVirtualMachineIdeDiskDevicePartitionInfo other = (ArrayOfVirtualMachineIdeDiskDevicePartitionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineIdeDiskDevicePartitionInfo==null && other.getVirtualMachineIdeDiskDevicePartitionInfo()==null) || 
             (this.virtualMachineIdeDiskDevicePartitionInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineIdeDiskDevicePartitionInfo, other.getVirtualMachineIdeDiskDevicePartitionInfo())));
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
        if (getVirtualMachineIdeDiskDevicePartitionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineIdeDiskDevicePartitionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineIdeDiskDevicePartitionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineIdeDiskDevicePartitionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineIdeDiskDevicePartitionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineIdeDiskDevicePartitionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineIdeDiskDevicePartitionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineIdeDiskDevicePartitionInfo"));
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
