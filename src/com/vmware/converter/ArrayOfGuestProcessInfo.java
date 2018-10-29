/**
 * ArrayOfGuestProcessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfGuestProcessInfo  implements java.io.Serializable {
    private com.vmware.converter.GuestProcessInfo[] guestProcessInfo;

    public ArrayOfGuestProcessInfo() {
    }

    public ArrayOfGuestProcessInfo(
           com.vmware.converter.GuestProcessInfo[] guestProcessInfo) {
           this.guestProcessInfo = guestProcessInfo;
    }


    /**
     * Gets the guestProcessInfo value for this ArrayOfGuestProcessInfo.
     * 
     * @return guestProcessInfo
     */
    public com.vmware.converter.GuestProcessInfo[] getGuestProcessInfo() {
        return guestProcessInfo;
    }


    /**
     * Sets the guestProcessInfo value for this ArrayOfGuestProcessInfo.
     * 
     * @param guestProcessInfo
     */
    public void setGuestProcessInfo(com.vmware.converter.GuestProcessInfo[] guestProcessInfo) {
        this.guestProcessInfo = guestProcessInfo;
    }

    public com.vmware.converter.GuestProcessInfo getGuestProcessInfo(int i) {
        return this.guestProcessInfo[i];
    }

    public void setGuestProcessInfo(int i, com.vmware.converter.GuestProcessInfo _value) {
        this.guestProcessInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfGuestProcessInfo)) return false;
        ArrayOfGuestProcessInfo other = (ArrayOfGuestProcessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.guestProcessInfo==null && other.getGuestProcessInfo()==null) || 
             (this.guestProcessInfo!=null &&
              java.util.Arrays.equals(this.guestProcessInfo, other.getGuestProcessInfo())));
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
        if (getGuestProcessInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestProcessInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestProcessInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGuestProcessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfGuestProcessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestProcessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "GuestProcessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestProcessInfo"));
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
