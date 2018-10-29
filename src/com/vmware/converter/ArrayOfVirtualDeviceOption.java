/**
 * ArrayOfVirtualDeviceOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualDeviceOption  implements java.io.Serializable {
    private com.vmware.converter.VirtualDeviceOption[] virtualDeviceOption;

    public ArrayOfVirtualDeviceOption() {
    }

    public ArrayOfVirtualDeviceOption(
           com.vmware.converter.VirtualDeviceOption[] virtualDeviceOption) {
           this.virtualDeviceOption = virtualDeviceOption;
    }


    /**
     * Gets the virtualDeviceOption value for this ArrayOfVirtualDeviceOption.
     * 
     * @return virtualDeviceOption
     */
    public com.vmware.converter.VirtualDeviceOption[] getVirtualDeviceOption() {
        return virtualDeviceOption;
    }


    /**
     * Sets the virtualDeviceOption value for this ArrayOfVirtualDeviceOption.
     * 
     * @param virtualDeviceOption
     */
    public void setVirtualDeviceOption(com.vmware.converter.VirtualDeviceOption[] virtualDeviceOption) {
        this.virtualDeviceOption = virtualDeviceOption;
    }

    public com.vmware.converter.VirtualDeviceOption getVirtualDeviceOption(int i) {
        return this.virtualDeviceOption[i];
    }

    public void setVirtualDeviceOption(int i, com.vmware.converter.VirtualDeviceOption _value) {
        this.virtualDeviceOption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDeviceOption)) return false;
        ArrayOfVirtualDeviceOption other = (ArrayOfVirtualDeviceOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDeviceOption==null && other.getVirtualDeviceOption()==null) || 
             (this.virtualDeviceOption!=null &&
              java.util.Arrays.equals(this.virtualDeviceOption, other.getVirtualDeviceOption())));
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
        if (getVirtualDeviceOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDeviceOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDeviceOption(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDeviceOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualDeviceOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDeviceOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceOption"));
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
