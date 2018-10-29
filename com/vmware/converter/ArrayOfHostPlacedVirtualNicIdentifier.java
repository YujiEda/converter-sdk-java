/**
 * ArrayOfHostPlacedVirtualNicIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostPlacedVirtualNicIdentifier  implements java.io.Serializable {
    private com.vmware.converter.HostPlacedVirtualNicIdentifier[] hostPlacedVirtualNicIdentifier;

    public ArrayOfHostPlacedVirtualNicIdentifier() {
    }

    public ArrayOfHostPlacedVirtualNicIdentifier(
           com.vmware.converter.HostPlacedVirtualNicIdentifier[] hostPlacedVirtualNicIdentifier) {
           this.hostPlacedVirtualNicIdentifier = hostPlacedVirtualNicIdentifier;
    }


    /**
     * Gets the hostPlacedVirtualNicIdentifier value for this ArrayOfHostPlacedVirtualNicIdentifier.
     * 
     * @return hostPlacedVirtualNicIdentifier
     */
    public com.vmware.converter.HostPlacedVirtualNicIdentifier[] getHostPlacedVirtualNicIdentifier() {
        return hostPlacedVirtualNicIdentifier;
    }


    /**
     * Sets the hostPlacedVirtualNicIdentifier value for this ArrayOfHostPlacedVirtualNicIdentifier.
     * 
     * @param hostPlacedVirtualNicIdentifier
     */
    public void setHostPlacedVirtualNicIdentifier(com.vmware.converter.HostPlacedVirtualNicIdentifier[] hostPlacedVirtualNicIdentifier) {
        this.hostPlacedVirtualNicIdentifier = hostPlacedVirtualNicIdentifier;
    }

    public com.vmware.converter.HostPlacedVirtualNicIdentifier getHostPlacedVirtualNicIdentifier(int i) {
        return this.hostPlacedVirtualNicIdentifier[i];
    }

    public void setHostPlacedVirtualNicIdentifier(int i, com.vmware.converter.HostPlacedVirtualNicIdentifier _value) {
        this.hostPlacedVirtualNicIdentifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPlacedVirtualNicIdentifier)) return false;
        ArrayOfHostPlacedVirtualNicIdentifier other = (ArrayOfHostPlacedVirtualNicIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPlacedVirtualNicIdentifier==null && other.getHostPlacedVirtualNicIdentifier()==null) || 
             (this.hostPlacedVirtualNicIdentifier!=null &&
              java.util.Arrays.equals(this.hostPlacedVirtualNicIdentifier, other.getHostPlacedVirtualNicIdentifier())));
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
        if (getHostPlacedVirtualNicIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPlacedVirtualNicIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPlacedVirtualNicIdentifier(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPlacedVirtualNicIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPlacedVirtualNicIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPlacedVirtualNicIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPlacedVirtualNicIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPlacedVirtualNicIdentifier"));
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
