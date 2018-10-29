/**
 * ArrayOfHostNetworkConfigNetStackSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostNetworkConfigNetStackSpec  implements java.io.Serializable {
    private com.vmware.converter.HostNetworkConfigNetStackSpec[] hostNetworkConfigNetStackSpec;

    public ArrayOfHostNetworkConfigNetStackSpec() {
    }

    public ArrayOfHostNetworkConfigNetStackSpec(
           com.vmware.converter.HostNetworkConfigNetStackSpec[] hostNetworkConfigNetStackSpec) {
           this.hostNetworkConfigNetStackSpec = hostNetworkConfigNetStackSpec;
    }


    /**
     * Gets the hostNetworkConfigNetStackSpec value for this ArrayOfHostNetworkConfigNetStackSpec.
     * 
     * @return hostNetworkConfigNetStackSpec
     */
    public com.vmware.converter.HostNetworkConfigNetStackSpec[] getHostNetworkConfigNetStackSpec() {
        return hostNetworkConfigNetStackSpec;
    }


    /**
     * Sets the hostNetworkConfigNetStackSpec value for this ArrayOfHostNetworkConfigNetStackSpec.
     * 
     * @param hostNetworkConfigNetStackSpec
     */
    public void setHostNetworkConfigNetStackSpec(com.vmware.converter.HostNetworkConfigNetStackSpec[] hostNetworkConfigNetStackSpec) {
        this.hostNetworkConfigNetStackSpec = hostNetworkConfigNetStackSpec;
    }

    public com.vmware.converter.HostNetworkConfigNetStackSpec getHostNetworkConfigNetStackSpec(int i) {
        return this.hostNetworkConfigNetStackSpec[i];
    }

    public void setHostNetworkConfigNetStackSpec(int i, com.vmware.converter.HostNetworkConfigNetStackSpec _value) {
        this.hostNetworkConfigNetStackSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostNetworkConfigNetStackSpec)) return false;
        ArrayOfHostNetworkConfigNetStackSpec other = (ArrayOfHostNetworkConfigNetStackSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostNetworkConfigNetStackSpec==null && other.getHostNetworkConfigNetStackSpec()==null) || 
             (this.hostNetworkConfigNetStackSpec!=null &&
              java.util.Arrays.equals(this.hostNetworkConfigNetStackSpec, other.getHostNetworkConfigNetStackSpec())));
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
        if (getHostNetworkConfigNetStackSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostNetworkConfigNetStackSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostNetworkConfigNetStackSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostNetworkConfigNetStackSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostNetworkConfigNetStackSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNetworkConfigNetStackSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostNetworkConfigNetStackSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkConfigNetStackSpec"));
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
