/**
 * ArrayOfVirtualMachineScsiDiskDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineScsiDiskDeviceInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] virtualMachineScsiDiskDeviceInfo;

    public ArrayOfVirtualMachineScsiDiskDeviceInfo() {
    }

    public ArrayOfVirtualMachineScsiDiskDeviceInfo(
           com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] virtualMachineScsiDiskDeviceInfo) {
           this.virtualMachineScsiDiskDeviceInfo = virtualMachineScsiDiskDeviceInfo;
    }


    /**
     * Gets the virtualMachineScsiDiskDeviceInfo value for this ArrayOfVirtualMachineScsiDiskDeviceInfo.
     * 
     * @return virtualMachineScsiDiskDeviceInfo
     */
    public com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] getVirtualMachineScsiDiskDeviceInfo() {
        return virtualMachineScsiDiskDeviceInfo;
    }


    /**
     * Sets the virtualMachineScsiDiskDeviceInfo value for this ArrayOfVirtualMachineScsiDiskDeviceInfo.
     * 
     * @param virtualMachineScsiDiskDeviceInfo
     */
    public void setVirtualMachineScsiDiskDeviceInfo(com.vmware.converter.VirtualMachineScsiDiskDeviceInfo[] virtualMachineScsiDiskDeviceInfo) {
        this.virtualMachineScsiDiskDeviceInfo = virtualMachineScsiDiskDeviceInfo;
    }

    public com.vmware.converter.VirtualMachineScsiDiskDeviceInfo getVirtualMachineScsiDiskDeviceInfo(int i) {
        return this.virtualMachineScsiDiskDeviceInfo[i];
    }

    public void setVirtualMachineScsiDiskDeviceInfo(int i, com.vmware.converter.VirtualMachineScsiDiskDeviceInfo _value) {
        this.virtualMachineScsiDiskDeviceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineScsiDiskDeviceInfo)) return false;
        ArrayOfVirtualMachineScsiDiskDeviceInfo other = (ArrayOfVirtualMachineScsiDiskDeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineScsiDiskDeviceInfo==null && other.getVirtualMachineScsiDiskDeviceInfo()==null) || 
             (this.virtualMachineScsiDiskDeviceInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineScsiDiskDeviceInfo, other.getVirtualMachineScsiDiskDeviceInfo())));
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
        if (getVirtualMachineScsiDiskDeviceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineScsiDiskDeviceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineScsiDiskDeviceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineScsiDiskDeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineScsiDiskDeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineScsiDiskDeviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineScsiDiskDeviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineScsiDiskDeviceInfo"));
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
