/**
 * ArrayOfHostNetStackInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostNetStackInstance  implements java.io.Serializable {
    private com.vmware.converter.HostNetStackInstance[] hostNetStackInstance;

    public ArrayOfHostNetStackInstance() {
    }

    public ArrayOfHostNetStackInstance(
           com.vmware.converter.HostNetStackInstance[] hostNetStackInstance) {
           this.hostNetStackInstance = hostNetStackInstance;
    }


    /**
     * Gets the hostNetStackInstance value for this ArrayOfHostNetStackInstance.
     * 
     * @return hostNetStackInstance
     */
    public com.vmware.converter.HostNetStackInstance[] getHostNetStackInstance() {
        return hostNetStackInstance;
    }


    /**
     * Sets the hostNetStackInstance value for this ArrayOfHostNetStackInstance.
     * 
     * @param hostNetStackInstance
     */
    public void setHostNetStackInstance(com.vmware.converter.HostNetStackInstance[] hostNetStackInstance) {
        this.hostNetStackInstance = hostNetStackInstance;
    }

    public com.vmware.converter.HostNetStackInstance getHostNetStackInstance(int i) {
        return this.hostNetStackInstance[i];
    }

    public void setHostNetStackInstance(int i, com.vmware.converter.HostNetStackInstance _value) {
        this.hostNetStackInstance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostNetStackInstance)) return false;
        ArrayOfHostNetStackInstance other = (ArrayOfHostNetStackInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostNetStackInstance==null && other.getHostNetStackInstance()==null) || 
             (this.hostNetStackInstance!=null &&
              java.util.Arrays.equals(this.hostNetStackInstance, other.getHostNetStackInstance())));
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
        if (getHostNetStackInstance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostNetStackInstance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostNetStackInstance(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostNetStackInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostNetStackInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNetStackInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostNetStackInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetStackInstance"));
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
