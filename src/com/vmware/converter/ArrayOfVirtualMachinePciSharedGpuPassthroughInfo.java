/**
 * ArrayOfVirtualMachinePciSharedGpuPassthroughInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachinePciSharedGpuPassthroughInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] virtualMachinePciSharedGpuPassthroughInfo;

    public ArrayOfVirtualMachinePciSharedGpuPassthroughInfo() {
    }

    public ArrayOfVirtualMachinePciSharedGpuPassthroughInfo(
           com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] virtualMachinePciSharedGpuPassthroughInfo) {
           this.virtualMachinePciSharedGpuPassthroughInfo = virtualMachinePciSharedGpuPassthroughInfo;
    }


    /**
     * Gets the virtualMachinePciSharedGpuPassthroughInfo value for this ArrayOfVirtualMachinePciSharedGpuPassthroughInfo.
     * 
     * @return virtualMachinePciSharedGpuPassthroughInfo
     */
    public com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] getVirtualMachinePciSharedGpuPassthroughInfo() {
        return virtualMachinePciSharedGpuPassthroughInfo;
    }


    /**
     * Sets the virtualMachinePciSharedGpuPassthroughInfo value for this ArrayOfVirtualMachinePciSharedGpuPassthroughInfo.
     * 
     * @param virtualMachinePciSharedGpuPassthroughInfo
     */
    public void setVirtualMachinePciSharedGpuPassthroughInfo(com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo[] virtualMachinePciSharedGpuPassthroughInfo) {
        this.virtualMachinePciSharedGpuPassthroughInfo = virtualMachinePciSharedGpuPassthroughInfo;
    }

    public com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo getVirtualMachinePciSharedGpuPassthroughInfo(int i) {
        return this.virtualMachinePciSharedGpuPassthroughInfo[i];
    }

    public void setVirtualMachinePciSharedGpuPassthroughInfo(int i, com.vmware.converter.VirtualMachinePciSharedGpuPassthroughInfo _value) {
        this.virtualMachinePciSharedGpuPassthroughInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachinePciSharedGpuPassthroughInfo)) return false;
        ArrayOfVirtualMachinePciSharedGpuPassthroughInfo other = (ArrayOfVirtualMachinePciSharedGpuPassthroughInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachinePciSharedGpuPassthroughInfo==null && other.getVirtualMachinePciSharedGpuPassthroughInfo()==null) || 
             (this.virtualMachinePciSharedGpuPassthroughInfo!=null &&
              java.util.Arrays.equals(this.virtualMachinePciSharedGpuPassthroughInfo, other.getVirtualMachinePciSharedGpuPassthroughInfo())));
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
        if (getVirtualMachinePciSharedGpuPassthroughInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachinePciSharedGpuPassthroughInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachinePciSharedGpuPassthroughInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachinePciSharedGpuPassthroughInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachinePciSharedGpuPassthroughInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachinePciSharedGpuPassthroughInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciSharedGpuPassthroughInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciSharedGpuPassthroughInfo"));
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
