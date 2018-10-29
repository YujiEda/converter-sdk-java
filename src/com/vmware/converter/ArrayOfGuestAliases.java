/**
 * ArrayOfGuestAliases.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfGuestAliases  implements java.io.Serializable {
    private com.vmware.converter.GuestAliases[] guestAliases;

    public ArrayOfGuestAliases() {
    }

    public ArrayOfGuestAliases(
           com.vmware.converter.GuestAliases[] guestAliases) {
           this.guestAliases = guestAliases;
    }


    /**
     * Gets the guestAliases value for this ArrayOfGuestAliases.
     * 
     * @return guestAliases
     */
    public com.vmware.converter.GuestAliases[] getGuestAliases() {
        return guestAliases;
    }


    /**
     * Sets the guestAliases value for this ArrayOfGuestAliases.
     * 
     * @param guestAliases
     */
    public void setGuestAliases(com.vmware.converter.GuestAliases[] guestAliases) {
        this.guestAliases = guestAliases;
    }

    public com.vmware.converter.GuestAliases getGuestAliases(int i) {
        return this.guestAliases[i];
    }

    public void setGuestAliases(int i, com.vmware.converter.GuestAliases _value) {
        this.guestAliases[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfGuestAliases)) return false;
        ArrayOfGuestAliases other = (ArrayOfGuestAliases) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.guestAliases==null && other.getGuestAliases()==null) || 
             (this.guestAliases!=null &&
              java.util.Arrays.equals(this.guestAliases, other.getGuestAliases())));
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
        if (getGuestAliases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestAliases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestAliases(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGuestAliases.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfGuestAliases"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestAliases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "GuestAliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAliases"));
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
