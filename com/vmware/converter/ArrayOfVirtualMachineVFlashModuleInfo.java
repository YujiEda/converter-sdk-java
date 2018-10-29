/**
 * ArrayOfVirtualMachineVFlashModuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineVFlashModuleInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineVFlashModuleInfo[] virtualMachineVFlashModuleInfo;

    public ArrayOfVirtualMachineVFlashModuleInfo() {
    }

    public ArrayOfVirtualMachineVFlashModuleInfo(
           com.vmware.converter.VirtualMachineVFlashModuleInfo[] virtualMachineVFlashModuleInfo) {
           this.virtualMachineVFlashModuleInfo = virtualMachineVFlashModuleInfo;
    }


    /**
     * Gets the virtualMachineVFlashModuleInfo value for this ArrayOfVirtualMachineVFlashModuleInfo.
     * 
     * @return virtualMachineVFlashModuleInfo
     */
    public com.vmware.converter.VirtualMachineVFlashModuleInfo[] getVirtualMachineVFlashModuleInfo() {
        return virtualMachineVFlashModuleInfo;
    }


    /**
     * Sets the virtualMachineVFlashModuleInfo value for this ArrayOfVirtualMachineVFlashModuleInfo.
     * 
     * @param virtualMachineVFlashModuleInfo
     */
    public void setVirtualMachineVFlashModuleInfo(com.vmware.converter.VirtualMachineVFlashModuleInfo[] virtualMachineVFlashModuleInfo) {
        this.virtualMachineVFlashModuleInfo = virtualMachineVFlashModuleInfo;
    }

    public com.vmware.converter.VirtualMachineVFlashModuleInfo getVirtualMachineVFlashModuleInfo(int i) {
        return this.virtualMachineVFlashModuleInfo[i];
    }

    public void setVirtualMachineVFlashModuleInfo(int i, com.vmware.converter.VirtualMachineVFlashModuleInfo _value) {
        this.virtualMachineVFlashModuleInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineVFlashModuleInfo)) return false;
        ArrayOfVirtualMachineVFlashModuleInfo other = (ArrayOfVirtualMachineVFlashModuleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineVFlashModuleInfo==null && other.getVirtualMachineVFlashModuleInfo()==null) || 
             (this.virtualMachineVFlashModuleInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineVFlashModuleInfo, other.getVirtualMachineVFlashModuleInfo())));
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
        if (getVirtualMachineVFlashModuleInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineVFlashModuleInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineVFlashModuleInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineVFlashModuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineVFlashModuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineVFlashModuleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVFlashModuleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVFlashModuleInfo"));
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
