/**
 * ArrayOfVirtualMachineFileLayoutSnapshotLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualMachineFileLayoutSnapshotLayout  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineFileLayoutSnapshotLayout[] virtualMachineFileLayoutSnapshotLayout;

    public ArrayOfVirtualMachineFileLayoutSnapshotLayout() {
    }

    public ArrayOfVirtualMachineFileLayoutSnapshotLayout(
           com.vmware.converter.VirtualMachineFileLayoutSnapshotLayout[] virtualMachineFileLayoutSnapshotLayout) {
           this.virtualMachineFileLayoutSnapshotLayout = virtualMachineFileLayoutSnapshotLayout;
    }


    /**
     * Gets the virtualMachineFileLayoutSnapshotLayout value for this ArrayOfVirtualMachineFileLayoutSnapshotLayout.
     * 
     * @return virtualMachineFileLayoutSnapshotLayout
     */
    public com.vmware.converter.VirtualMachineFileLayoutSnapshotLayout[] getVirtualMachineFileLayoutSnapshotLayout() {
        return virtualMachineFileLayoutSnapshotLayout;
    }


    /**
     * Sets the virtualMachineFileLayoutSnapshotLayout value for this ArrayOfVirtualMachineFileLayoutSnapshotLayout.
     * 
     * @param virtualMachineFileLayoutSnapshotLayout
     */
    public void setVirtualMachineFileLayoutSnapshotLayout(com.vmware.converter.VirtualMachineFileLayoutSnapshotLayout[] virtualMachineFileLayoutSnapshotLayout) {
        this.virtualMachineFileLayoutSnapshotLayout = virtualMachineFileLayoutSnapshotLayout;
    }

    public com.vmware.converter.VirtualMachineFileLayoutSnapshotLayout getVirtualMachineFileLayoutSnapshotLayout(int i) {
        return this.virtualMachineFileLayoutSnapshotLayout[i];
    }

    public void setVirtualMachineFileLayoutSnapshotLayout(int i, com.vmware.converter.VirtualMachineFileLayoutSnapshotLayout _value) {
        this.virtualMachineFileLayoutSnapshotLayout[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineFileLayoutSnapshotLayout)) return false;
        ArrayOfVirtualMachineFileLayoutSnapshotLayout other = (ArrayOfVirtualMachineFileLayoutSnapshotLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineFileLayoutSnapshotLayout==null && other.getVirtualMachineFileLayoutSnapshotLayout()==null) || 
             (this.virtualMachineFileLayoutSnapshotLayout!=null &&
              java.util.Arrays.equals(this.virtualMachineFileLayoutSnapshotLayout, other.getVirtualMachineFileLayoutSnapshotLayout())));
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
        if (getVirtualMachineFileLayoutSnapshotLayout() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineFileLayoutSnapshotLayout());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineFileLayoutSnapshotLayout(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineFileLayoutSnapshotLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineFileLayoutSnapshotLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineFileLayoutSnapshotLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutSnapshotLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutSnapshotLayout"));
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
