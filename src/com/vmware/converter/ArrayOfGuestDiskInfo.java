/**
 * ArrayOfGuestDiskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfGuestDiskInfo  implements java.io.Serializable {
    private com.vmware.converter.GuestDiskInfo[] guestDiskInfo;

    public ArrayOfGuestDiskInfo() {
    }

    public ArrayOfGuestDiskInfo(
           com.vmware.converter.GuestDiskInfo[] guestDiskInfo) {
           this.guestDiskInfo = guestDiskInfo;
    }


    /**
     * Gets the guestDiskInfo value for this ArrayOfGuestDiskInfo.
     * 
     * @return guestDiskInfo
     */
    public com.vmware.converter.GuestDiskInfo[] getGuestDiskInfo() {
        return guestDiskInfo;
    }


    /**
     * Sets the guestDiskInfo value for this ArrayOfGuestDiskInfo.
     * 
     * @param guestDiskInfo
     */
    public void setGuestDiskInfo(com.vmware.converter.GuestDiskInfo[] guestDiskInfo) {
        this.guestDiskInfo = guestDiskInfo;
    }

    public com.vmware.converter.GuestDiskInfo getGuestDiskInfo(int i) {
        return this.guestDiskInfo[i];
    }

    public void setGuestDiskInfo(int i, com.vmware.converter.GuestDiskInfo _value) {
        this.guestDiskInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfGuestDiskInfo)) return false;
        ArrayOfGuestDiskInfo other = (ArrayOfGuestDiskInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.guestDiskInfo==null && other.getGuestDiskInfo()==null) || 
             (this.guestDiskInfo!=null &&
              java.util.Arrays.equals(this.guestDiskInfo, other.getGuestDiskInfo())));
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
        if (getGuestDiskInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestDiskInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestDiskInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGuestDiskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfGuestDiskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestDiskInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "GuestDiskInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestDiskInfo"));
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
