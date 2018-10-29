/**
 * ArrayOfNetIpConfigSpecIpAddressSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfNetIpConfigSpecIpAddressSpec  implements java.io.Serializable {
    private com.vmware.converter.NetIpConfigSpecIpAddressSpec[] netIpConfigSpecIpAddressSpec;

    public ArrayOfNetIpConfigSpecIpAddressSpec() {
    }

    public ArrayOfNetIpConfigSpecIpAddressSpec(
           com.vmware.converter.NetIpConfigSpecIpAddressSpec[] netIpConfigSpecIpAddressSpec) {
           this.netIpConfigSpecIpAddressSpec = netIpConfigSpecIpAddressSpec;
    }


    /**
     * Gets the netIpConfigSpecIpAddressSpec value for this ArrayOfNetIpConfigSpecIpAddressSpec.
     * 
     * @return netIpConfigSpecIpAddressSpec
     */
    public com.vmware.converter.NetIpConfigSpecIpAddressSpec[] getNetIpConfigSpecIpAddressSpec() {
        return netIpConfigSpecIpAddressSpec;
    }


    /**
     * Sets the netIpConfigSpecIpAddressSpec value for this ArrayOfNetIpConfigSpecIpAddressSpec.
     * 
     * @param netIpConfigSpecIpAddressSpec
     */
    public void setNetIpConfigSpecIpAddressSpec(com.vmware.converter.NetIpConfigSpecIpAddressSpec[] netIpConfigSpecIpAddressSpec) {
        this.netIpConfigSpecIpAddressSpec = netIpConfigSpecIpAddressSpec;
    }

    public com.vmware.converter.NetIpConfigSpecIpAddressSpec getNetIpConfigSpecIpAddressSpec(int i) {
        return this.netIpConfigSpecIpAddressSpec[i];
    }

    public void setNetIpConfigSpecIpAddressSpec(int i, com.vmware.converter.NetIpConfigSpecIpAddressSpec _value) {
        this.netIpConfigSpecIpAddressSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfNetIpConfigSpecIpAddressSpec)) return false;
        ArrayOfNetIpConfigSpecIpAddressSpec other = (ArrayOfNetIpConfigSpecIpAddressSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.netIpConfigSpecIpAddressSpec==null && other.getNetIpConfigSpecIpAddressSpec()==null) || 
             (this.netIpConfigSpecIpAddressSpec!=null &&
              java.util.Arrays.equals(this.netIpConfigSpecIpAddressSpec, other.getNetIpConfigSpecIpAddressSpec())));
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
        if (getNetIpConfigSpecIpAddressSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetIpConfigSpecIpAddressSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetIpConfigSpecIpAddressSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNetIpConfigSpecIpAddressSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfNetIpConfigSpecIpAddressSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netIpConfigSpecIpAddressSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "NetIpConfigSpecIpAddressSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpConfigSpecIpAddressSpec"));
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
