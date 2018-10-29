/**
 * ArrayOfVirtualMachineParallelInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineParallelInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineParallelInfo[] virtualMachineParallelInfo;

    public ArrayOfVirtualMachineParallelInfo() {
    }

    public ArrayOfVirtualMachineParallelInfo(
           com.vmware.converter.VirtualMachineParallelInfo[] virtualMachineParallelInfo) {
           this.virtualMachineParallelInfo = virtualMachineParallelInfo;
    }


    /**
     * Gets the virtualMachineParallelInfo value for this ArrayOfVirtualMachineParallelInfo.
     * 
     * @return virtualMachineParallelInfo
     */
    public com.vmware.converter.VirtualMachineParallelInfo[] getVirtualMachineParallelInfo() {
        return virtualMachineParallelInfo;
    }


    /**
     * Sets the virtualMachineParallelInfo value for this ArrayOfVirtualMachineParallelInfo.
     * 
     * @param virtualMachineParallelInfo
     */
    public void setVirtualMachineParallelInfo(com.vmware.converter.VirtualMachineParallelInfo[] virtualMachineParallelInfo) {
        this.virtualMachineParallelInfo = virtualMachineParallelInfo;
    }

    public com.vmware.converter.VirtualMachineParallelInfo getVirtualMachineParallelInfo(int i) {
        return this.virtualMachineParallelInfo[i];
    }

    public void setVirtualMachineParallelInfo(int i, com.vmware.converter.VirtualMachineParallelInfo _value) {
        this.virtualMachineParallelInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineParallelInfo)) return false;
        ArrayOfVirtualMachineParallelInfo other = (ArrayOfVirtualMachineParallelInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineParallelInfo==null && other.getVirtualMachineParallelInfo()==null) || 
             (this.virtualMachineParallelInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineParallelInfo, other.getVirtualMachineParallelInfo())));
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
        if (getVirtualMachineParallelInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineParallelInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineParallelInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineParallelInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineParallelInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineParallelInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineParallelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineParallelInfo"));
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
