/**
 * VirtualMachineFileLayoutExDiskLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineFileLayoutExDiskLayout  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int key;

    private com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] chain;

    public VirtualMachineFileLayoutExDiskLayout() {
    }

    public VirtualMachineFileLayoutExDiskLayout(
           int key,
           com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] chain) {
        this.key = key;
        this.chain = chain;
    }


    /**
     * Gets the key value for this VirtualMachineFileLayoutExDiskLayout.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this VirtualMachineFileLayoutExDiskLayout.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the chain value for this VirtualMachineFileLayoutExDiskLayout.
     * 
     * @return chain
     */
    public com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] getChain() {
        return chain;
    }


    /**
     * Sets the chain value for this VirtualMachineFileLayoutExDiskLayout.
     * 
     * @param chain
     */
    public void setChain(com.vmware.converter.VirtualMachineFileLayoutExDiskUnit[] chain) {
        this.chain = chain;
    }

    public com.vmware.converter.VirtualMachineFileLayoutExDiskUnit getChain(int i) {
        return this.chain[i];
    }

    public void setChain(int i, com.vmware.converter.VirtualMachineFileLayoutExDiskUnit _value) {
        this.chain[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFileLayoutExDiskLayout)) return false;
        VirtualMachineFileLayoutExDiskLayout other = (VirtualMachineFileLayoutExDiskLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            ((this.chain==null && other.getChain()==null) || 
             (this.chain!=null &&
              java.util.Arrays.equals(this.chain, other.getChain())));
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
        _hashCode += getKey();
        if (getChain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChain(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineFileLayoutExDiskLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExDiskLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chain"));
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
