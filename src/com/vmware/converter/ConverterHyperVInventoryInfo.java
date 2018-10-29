/**
 * ConverterHyperVInventoryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterHyperVInventoryInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem[] vmList;

    public ConverterHyperVInventoryInfo() {
    }

    public ConverterHyperVInventoryInfo(
           com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem[] vmList) {
        this.vmList = vmList;
    }


    /**
     * Gets the vmList value for this ConverterHyperVInventoryInfo.
     * 
     * @return vmList
     */
    public com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem[] getVmList() {
        return vmList;
    }


    /**
     * Sets the vmList value for this ConverterHyperVInventoryInfo.
     * 
     * @param vmList
     */
    public void setVmList(com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem[] vmList) {
        this.vmList = vmList;
    }

    public com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem getVmList(int i) {
        return this.vmList[i];
    }

    public void setVmList(int i, com.vmware.converter.ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem _value) {
        this.vmList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterHyperVInventoryInfo)) return false;
        ConverterHyperVInventoryInfo other = (ConverterHyperVInventoryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmList==null && other.getVmList()==null) || 
             (this.vmList!=null &&
              java.util.Arrays.equals(this.vmList, other.getVmList())));
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
        if (getVmList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmList(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterHyperVInventoryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHyperVInventoryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterHyperVInventoryInfoHyperVInventoryVirtualMachineItem"));
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
