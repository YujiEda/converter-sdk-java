/**
 * ArrayOfVirtualMachineCpuIdInfoSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineCpuIdInfoSpec  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineCpuIdInfoSpec[] virtualMachineCpuIdInfoSpec;

    public ArrayOfVirtualMachineCpuIdInfoSpec() {
    }

    public ArrayOfVirtualMachineCpuIdInfoSpec(
           com.vmware.converter.VirtualMachineCpuIdInfoSpec[] virtualMachineCpuIdInfoSpec) {
           this.virtualMachineCpuIdInfoSpec = virtualMachineCpuIdInfoSpec;
    }


    /**
     * Gets the virtualMachineCpuIdInfoSpec value for this ArrayOfVirtualMachineCpuIdInfoSpec.
     * 
     * @return virtualMachineCpuIdInfoSpec
     */
    public com.vmware.converter.VirtualMachineCpuIdInfoSpec[] getVirtualMachineCpuIdInfoSpec() {
        return virtualMachineCpuIdInfoSpec;
    }


    /**
     * Sets the virtualMachineCpuIdInfoSpec value for this ArrayOfVirtualMachineCpuIdInfoSpec.
     * 
     * @param virtualMachineCpuIdInfoSpec
     */
    public void setVirtualMachineCpuIdInfoSpec(com.vmware.converter.VirtualMachineCpuIdInfoSpec[] virtualMachineCpuIdInfoSpec) {
        this.virtualMachineCpuIdInfoSpec = virtualMachineCpuIdInfoSpec;
    }

    public com.vmware.converter.VirtualMachineCpuIdInfoSpec getVirtualMachineCpuIdInfoSpec(int i) {
        return this.virtualMachineCpuIdInfoSpec[i];
    }

    public void setVirtualMachineCpuIdInfoSpec(int i, com.vmware.converter.VirtualMachineCpuIdInfoSpec _value) {
        this.virtualMachineCpuIdInfoSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineCpuIdInfoSpec)) return false;
        ArrayOfVirtualMachineCpuIdInfoSpec other = (ArrayOfVirtualMachineCpuIdInfoSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineCpuIdInfoSpec==null && other.getVirtualMachineCpuIdInfoSpec()==null) || 
             (this.virtualMachineCpuIdInfoSpec!=null &&
              java.util.Arrays.equals(this.virtualMachineCpuIdInfoSpec, other.getVirtualMachineCpuIdInfoSpec())));
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
        if (getVirtualMachineCpuIdInfoSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineCpuIdInfoSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineCpuIdInfoSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineCpuIdInfoSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineCpuIdInfoSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineCpuIdInfoSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCpuIdInfoSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCpuIdInfoSpec"));
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
