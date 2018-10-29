/**
 * VirtualMachineVMCIDeviceFilterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVMCIDeviceFilterInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineVMCIDeviceFilterSpec[] filters;

    public VirtualMachineVMCIDeviceFilterInfo() {
    }

    public VirtualMachineVMCIDeviceFilterInfo(
           com.vmware.converter.VirtualMachineVMCIDeviceFilterSpec[] filters) {
        this.filters = filters;
    }


    /**
     * Gets the filters value for this VirtualMachineVMCIDeviceFilterInfo.
     * 
     * @return filters
     */
    public com.vmware.converter.VirtualMachineVMCIDeviceFilterSpec[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this VirtualMachineVMCIDeviceFilterInfo.
     * 
     * @param filters
     */
    public void setFilters(com.vmware.converter.VirtualMachineVMCIDeviceFilterSpec[] filters) {
        this.filters = filters;
    }

    public com.vmware.converter.VirtualMachineVMCIDeviceFilterSpec getFilters(int i) {
        return this.filters[i];
    }

    public void setFilters(int i, com.vmware.converter.VirtualMachineVMCIDeviceFilterSpec _value) {
        this.filters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVMCIDeviceFilterInfo)) return false;
        VirtualMachineVMCIDeviceFilterInfo other = (VirtualMachineVMCIDeviceFilterInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters())));
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
        if (getFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilters(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDeviceFilterInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceFilterInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceFilterSpec"));
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
