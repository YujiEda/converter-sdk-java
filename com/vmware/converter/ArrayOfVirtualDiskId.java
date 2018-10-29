/**
 * ArrayOfVirtualDiskId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualDiskId  implements java.io.Serializable {
    private com.vmware.converter.VirtualDiskId[] virtualDiskId;

    public ArrayOfVirtualDiskId() {
    }

    public ArrayOfVirtualDiskId(
           com.vmware.converter.VirtualDiskId[] virtualDiskId) {
           this.virtualDiskId = virtualDiskId;
    }


    /**
     * Gets the virtualDiskId value for this ArrayOfVirtualDiskId.
     * 
     * @return virtualDiskId
     */
    public com.vmware.converter.VirtualDiskId[] getVirtualDiskId() {
        return virtualDiskId;
    }


    /**
     * Sets the virtualDiskId value for this ArrayOfVirtualDiskId.
     * 
     * @param virtualDiskId
     */
    public void setVirtualDiskId(com.vmware.converter.VirtualDiskId[] virtualDiskId) {
        this.virtualDiskId = virtualDiskId;
    }

    public com.vmware.converter.VirtualDiskId getVirtualDiskId(int i) {
        return this.virtualDiskId[i];
    }

    public void setVirtualDiskId(int i, com.vmware.converter.VirtualDiskId _value) {
        this.virtualDiskId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDiskId)) return false;
        ArrayOfVirtualDiskId other = (ArrayOfVirtualDiskId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDiskId==null && other.getVirtualDiskId()==null) || 
             (this.virtualDiskId!=null &&
              java.util.Arrays.equals(this.virtualDiskId, other.getVirtualDiskId())));
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
        if (getVirtualDiskId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDiskId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDiskId(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDiskId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualDiskId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDiskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskId"));
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
