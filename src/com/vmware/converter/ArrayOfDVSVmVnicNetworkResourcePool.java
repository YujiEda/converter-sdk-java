/**
 * ArrayOfDVSVmVnicNetworkResourcePool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDVSVmVnicNetworkResourcePool  implements java.io.Serializable {
    private com.vmware.converter.DVSVmVnicNetworkResourcePool[] DVSVmVnicNetworkResourcePool;

    public ArrayOfDVSVmVnicNetworkResourcePool() {
    }

    public ArrayOfDVSVmVnicNetworkResourcePool(
           com.vmware.converter.DVSVmVnicNetworkResourcePool[] DVSVmVnicNetworkResourcePool) {
           this.DVSVmVnicNetworkResourcePool = DVSVmVnicNetworkResourcePool;
    }


    /**
     * Gets the DVSVmVnicNetworkResourcePool value for this ArrayOfDVSVmVnicNetworkResourcePool.
     * 
     * @return DVSVmVnicNetworkResourcePool
     */
    public com.vmware.converter.DVSVmVnicNetworkResourcePool[] getDVSVmVnicNetworkResourcePool() {
        return DVSVmVnicNetworkResourcePool;
    }


    /**
     * Sets the DVSVmVnicNetworkResourcePool value for this ArrayOfDVSVmVnicNetworkResourcePool.
     * 
     * @param DVSVmVnicNetworkResourcePool
     */
    public void setDVSVmVnicNetworkResourcePool(com.vmware.converter.DVSVmVnicNetworkResourcePool[] DVSVmVnicNetworkResourcePool) {
        this.DVSVmVnicNetworkResourcePool = DVSVmVnicNetworkResourcePool;
    }

    public com.vmware.converter.DVSVmVnicNetworkResourcePool getDVSVmVnicNetworkResourcePool(int i) {
        return this.DVSVmVnicNetworkResourcePool[i];
    }

    public void setDVSVmVnicNetworkResourcePool(int i, com.vmware.converter.DVSVmVnicNetworkResourcePool _value) {
        this.DVSVmVnicNetworkResourcePool[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDVSVmVnicNetworkResourcePool)) return false;
        ArrayOfDVSVmVnicNetworkResourcePool other = (ArrayOfDVSVmVnicNetworkResourcePool) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DVSVmVnicNetworkResourcePool==null && other.getDVSVmVnicNetworkResourcePool()==null) || 
             (this.DVSVmVnicNetworkResourcePool!=null &&
              java.util.Arrays.equals(this.DVSVmVnicNetworkResourcePool, other.getDVSVmVnicNetworkResourcePool())));
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
        if (getDVSVmVnicNetworkResourcePool() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDVSVmVnicNetworkResourcePool());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDVSVmVnicNetworkResourcePool(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDVSVmVnicNetworkResourcePool.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDVSVmVnicNetworkResourcePool"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DVSVmVnicNetworkResourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DVSVmVnicNetworkResourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSVmVnicNetworkResourcePool"));
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
