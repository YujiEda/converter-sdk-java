/**
 * ArrayOfExtensionManagerIpAllocationUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfExtensionManagerIpAllocationUsage  implements java.io.Serializable {
    private com.vmware.converter.ExtensionManagerIpAllocationUsage[] extensionManagerIpAllocationUsage;

    public ArrayOfExtensionManagerIpAllocationUsage() {
    }

    public ArrayOfExtensionManagerIpAllocationUsage(
           com.vmware.converter.ExtensionManagerIpAllocationUsage[] extensionManagerIpAllocationUsage) {
           this.extensionManagerIpAllocationUsage = extensionManagerIpAllocationUsage;
    }


    /**
     * Gets the extensionManagerIpAllocationUsage value for this ArrayOfExtensionManagerIpAllocationUsage.
     * 
     * @return extensionManagerIpAllocationUsage
     */
    public com.vmware.converter.ExtensionManagerIpAllocationUsage[] getExtensionManagerIpAllocationUsage() {
        return extensionManagerIpAllocationUsage;
    }


    /**
     * Sets the extensionManagerIpAllocationUsage value for this ArrayOfExtensionManagerIpAllocationUsage.
     * 
     * @param extensionManagerIpAllocationUsage
     */
    public void setExtensionManagerIpAllocationUsage(com.vmware.converter.ExtensionManagerIpAllocationUsage[] extensionManagerIpAllocationUsage) {
        this.extensionManagerIpAllocationUsage = extensionManagerIpAllocationUsage;
    }

    public com.vmware.converter.ExtensionManagerIpAllocationUsage getExtensionManagerIpAllocationUsage(int i) {
        return this.extensionManagerIpAllocationUsage[i];
    }

    public void setExtensionManagerIpAllocationUsage(int i, com.vmware.converter.ExtensionManagerIpAllocationUsage _value) {
        this.extensionManagerIpAllocationUsage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExtensionManagerIpAllocationUsage)) return false;
        ArrayOfExtensionManagerIpAllocationUsage other = (ArrayOfExtensionManagerIpAllocationUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionManagerIpAllocationUsage==null && other.getExtensionManagerIpAllocationUsage()==null) || 
             (this.extensionManagerIpAllocationUsage!=null &&
              java.util.Arrays.equals(this.extensionManagerIpAllocationUsage, other.getExtensionManagerIpAllocationUsage())));
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
        if (getExtensionManagerIpAllocationUsage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensionManagerIpAllocationUsage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensionManagerIpAllocationUsage(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExtensionManagerIpAllocationUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfExtensionManagerIpAllocationUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionManagerIpAllocationUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ExtensionManagerIpAllocationUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionManagerIpAllocationUsage"));
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
