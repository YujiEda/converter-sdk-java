/**
 * ArrayOfVirtualDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualDisk  implements java.io.Serializable {
    private com.vmware.converter.VirtualDisk[] virtualDisk;

    public ArrayOfVirtualDisk() {
    }

    public ArrayOfVirtualDisk(
           com.vmware.converter.VirtualDisk[] virtualDisk) {
           this.virtualDisk = virtualDisk;
    }


    /**
     * Gets the virtualDisk value for this ArrayOfVirtualDisk.
     * 
     * @return virtualDisk
     */
    public com.vmware.converter.VirtualDisk[] getVirtualDisk() {
        return virtualDisk;
    }


    /**
     * Sets the virtualDisk value for this ArrayOfVirtualDisk.
     * 
     * @param virtualDisk
     */
    public void setVirtualDisk(com.vmware.converter.VirtualDisk[] virtualDisk) {
        this.virtualDisk = virtualDisk;
    }

    public com.vmware.converter.VirtualDisk getVirtualDisk(int i) {
        return this.virtualDisk[i];
    }

    public void setVirtualDisk(int i, com.vmware.converter.VirtualDisk _value) {
        this.virtualDisk[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDisk)) return false;
        ArrayOfVirtualDisk other = (ArrayOfVirtualDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDisk==null && other.getVirtualDisk()==null) || 
             (this.virtualDisk!=null &&
              java.util.Arrays.equals(this.virtualDisk, other.getVirtualDisk())));
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
        if (getVirtualDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDisk(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDisk"));
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
