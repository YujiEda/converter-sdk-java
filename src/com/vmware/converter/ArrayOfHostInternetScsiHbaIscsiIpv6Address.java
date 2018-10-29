/**
 * ArrayOfHostInternetScsiHbaIscsiIpv6Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostInternetScsiHbaIscsiIpv6Address  implements java.io.Serializable {
    private com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] hostInternetScsiHbaIscsiIpv6Address;

    public ArrayOfHostInternetScsiHbaIscsiIpv6Address() {
    }

    public ArrayOfHostInternetScsiHbaIscsiIpv6Address(
           com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] hostInternetScsiHbaIscsiIpv6Address) {
           this.hostInternetScsiHbaIscsiIpv6Address = hostInternetScsiHbaIscsiIpv6Address;
    }


    /**
     * Gets the hostInternetScsiHbaIscsiIpv6Address value for this ArrayOfHostInternetScsiHbaIscsiIpv6Address.
     * 
     * @return hostInternetScsiHbaIscsiIpv6Address
     */
    public com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] getHostInternetScsiHbaIscsiIpv6Address() {
        return hostInternetScsiHbaIscsiIpv6Address;
    }


    /**
     * Sets the hostInternetScsiHbaIscsiIpv6Address value for this ArrayOfHostInternetScsiHbaIscsiIpv6Address.
     * 
     * @param hostInternetScsiHbaIscsiIpv6Address
     */
    public void setHostInternetScsiHbaIscsiIpv6Address(com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address[] hostInternetScsiHbaIscsiIpv6Address) {
        this.hostInternetScsiHbaIscsiIpv6Address = hostInternetScsiHbaIscsiIpv6Address;
    }

    public com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address getHostInternetScsiHbaIscsiIpv6Address(int i) {
        return this.hostInternetScsiHbaIscsiIpv6Address[i];
    }

    public void setHostInternetScsiHbaIscsiIpv6Address(int i, com.vmware.converter.HostInternetScsiHbaIscsiIpv6Address _value) {
        this.hostInternetScsiHbaIscsiIpv6Address[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostInternetScsiHbaIscsiIpv6Address)) return false;
        ArrayOfHostInternetScsiHbaIscsiIpv6Address other = (ArrayOfHostInternetScsiHbaIscsiIpv6Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostInternetScsiHbaIscsiIpv6Address==null && other.getHostInternetScsiHbaIscsiIpv6Address()==null) || 
             (this.hostInternetScsiHbaIscsiIpv6Address!=null &&
              java.util.Arrays.equals(this.hostInternetScsiHbaIscsiIpv6Address, other.getHostInternetScsiHbaIscsiIpv6Address())));
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
        if (getHostInternetScsiHbaIscsiIpv6Address() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostInternetScsiHbaIscsiIpv6Address());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostInternetScsiHbaIscsiIpv6Address(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostInternetScsiHbaIscsiIpv6Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostInternetScsiHbaIscsiIpv6Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostInternetScsiHbaIscsiIpv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIscsiIpv6Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIscsiIpv6Address"));
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
