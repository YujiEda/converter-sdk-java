/**
 * ArrayOfNetIpRouteConfigSpecIpRouteSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfNetIpRouteConfigSpecIpRouteSpec  implements java.io.Serializable {
    private com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] netIpRouteConfigSpecIpRouteSpec;

    public ArrayOfNetIpRouteConfigSpecIpRouteSpec() {
    }

    public ArrayOfNetIpRouteConfigSpecIpRouteSpec(
           com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] netIpRouteConfigSpecIpRouteSpec) {
           this.netIpRouteConfigSpecIpRouteSpec = netIpRouteConfigSpecIpRouteSpec;
    }


    /**
     * Gets the netIpRouteConfigSpecIpRouteSpec value for this ArrayOfNetIpRouteConfigSpecIpRouteSpec.
     * 
     * @return netIpRouteConfigSpecIpRouteSpec
     */
    public com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] getNetIpRouteConfigSpecIpRouteSpec() {
        return netIpRouteConfigSpecIpRouteSpec;
    }


    /**
     * Sets the netIpRouteConfigSpecIpRouteSpec value for this ArrayOfNetIpRouteConfigSpecIpRouteSpec.
     * 
     * @param netIpRouteConfigSpecIpRouteSpec
     */
    public void setNetIpRouteConfigSpecIpRouteSpec(com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec[] netIpRouteConfigSpecIpRouteSpec) {
        this.netIpRouteConfigSpecIpRouteSpec = netIpRouteConfigSpecIpRouteSpec;
    }

    public com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec getNetIpRouteConfigSpecIpRouteSpec(int i) {
        return this.netIpRouteConfigSpecIpRouteSpec[i];
    }

    public void setNetIpRouteConfigSpecIpRouteSpec(int i, com.vmware.converter.NetIpRouteConfigSpecIpRouteSpec _value) {
        this.netIpRouteConfigSpecIpRouteSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfNetIpRouteConfigSpecIpRouteSpec)) return false;
        ArrayOfNetIpRouteConfigSpecIpRouteSpec other = (ArrayOfNetIpRouteConfigSpecIpRouteSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.netIpRouteConfigSpecIpRouteSpec==null && other.getNetIpRouteConfigSpecIpRouteSpec()==null) || 
             (this.netIpRouteConfigSpecIpRouteSpec!=null &&
              java.util.Arrays.equals(this.netIpRouteConfigSpecIpRouteSpec, other.getNetIpRouteConfigSpecIpRouteSpec())));
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
        if (getNetIpRouteConfigSpecIpRouteSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetIpRouteConfigSpecIpRouteSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetIpRouteConfigSpecIpRouteSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNetIpRouteConfigSpecIpRouteSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfNetIpRouteConfigSpecIpRouteSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netIpRouteConfigSpecIpRouteSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigSpecIpRouteSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpRouteConfigSpecIpRouteSpec"));
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
