/**
 * ArrayOfVirtualMachineFileLayoutExDiskUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineFileLayoutExDiskUnit  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] virtualMachineFileLayoutExDiskUnit;

    public ArrayOfVirtualMachineFileLayoutExDiskUnit() {
    }

    public ArrayOfVirtualMachineFileLayoutExDiskUnit(
           com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] virtualMachineFileLayoutExDiskUnit) {
           this.virtualMachineFileLayoutExDiskUnit = virtualMachineFileLayoutExDiskUnit;
    }


    /**
     * Gets the virtualMachineFileLayoutExDiskUnit value for this ArrayOfVirtualMachineFileLayoutExDiskUnit.
     * 
     * @return virtualMachineFileLayoutExDiskUnit
     */
    public com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] getVirtualMachineFileLayoutExDiskUnit() {
        return virtualMachineFileLayoutExDiskUnit;
    }


    /**
     * Sets the virtualMachineFileLayoutExDiskUnit value for this ArrayOfVirtualMachineFileLayoutExDiskUnit.
     * 
     * @param virtualMachineFileLayoutExDiskUnit
     */
    public void setVirtualMachineFileLayoutExDiskUnit(com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] virtualMachineFileLayoutExDiskUnit) {
        this.virtualMachineFileLayoutExDiskUnit = virtualMachineFileLayoutExDiskUnit;
    }

    public com.vmware.converter.VirtualMachineFileLayoutExDiskUnit getVirtualMachineFileLayoutExDiskUnit(int i) {
        return this.virtualMachineFileLayoutExDiskUnit[i];
    }

    public void setVirtualMachineFileLayoutExDiskUnit(int i, com.vmware.converter.VirtualMachineFileLayoutExDiskUnit _value) {
        this.virtualMachineFileLayoutExDiskUnit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineFileLayoutExDiskUnit)) return false;
        ArrayOfVirtualMachineFileLayoutExDiskUnit other = (ArrayOfVirtualMachineFileLayoutExDiskUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineFileLayoutExDiskUnit==null && other.getVirtualMachineFileLayoutExDiskUnit()==null) || 
             (this.virtualMachineFileLayoutExDiskUnit!=null &&
              java.util.Arrays.equals(this.virtualMachineFileLayoutExDiskUnit, other.getVirtualMachineFileLayoutExDiskUnit())));
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
        if (getVirtualMachineFileLayoutExDiskUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineFileLayoutExDiskUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineFileLayoutExDiskUnit(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineFileLayoutExDiskUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineFileLayoutExDiskUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineFileLayoutExDiskUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExDiskUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExDiskUnit"));
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
