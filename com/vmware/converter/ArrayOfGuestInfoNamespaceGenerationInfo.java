/**
 * ArrayOfGuestInfoNamespaceGenerationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfGuestInfoNamespaceGenerationInfo  implements java.io.Serializable {
    private com.vmware.converter.GuestInfoNamespaceGenerationInfo[] guestInfoNamespaceGenerationInfo;

    public ArrayOfGuestInfoNamespaceGenerationInfo() {
    }

    public ArrayOfGuestInfoNamespaceGenerationInfo(
           com.vmware.converter.GuestInfoNamespaceGenerationInfo[] guestInfoNamespaceGenerationInfo) {
           this.guestInfoNamespaceGenerationInfo = guestInfoNamespaceGenerationInfo;
    }


    /**
     * Gets the guestInfoNamespaceGenerationInfo value for this ArrayOfGuestInfoNamespaceGenerationInfo.
     * 
     * @return guestInfoNamespaceGenerationInfo
     */
    public com.vmware.converter.GuestInfoNamespaceGenerationInfo[] getGuestInfoNamespaceGenerationInfo() {
        return guestInfoNamespaceGenerationInfo;
    }


    /**
     * Sets the guestInfoNamespaceGenerationInfo value for this ArrayOfGuestInfoNamespaceGenerationInfo.
     * 
     * @param guestInfoNamespaceGenerationInfo
     */
    public void setGuestInfoNamespaceGenerationInfo(com.vmware.converter.GuestInfoNamespaceGenerationInfo[] guestInfoNamespaceGenerationInfo) {
        this.guestInfoNamespaceGenerationInfo = guestInfoNamespaceGenerationInfo;
    }

    public com.vmware.converter.GuestInfoNamespaceGenerationInfo getGuestInfoNamespaceGenerationInfo(int i) {
        return this.guestInfoNamespaceGenerationInfo[i];
    }

    public void setGuestInfoNamespaceGenerationInfo(int i, com.vmware.converter.GuestInfoNamespaceGenerationInfo _value) {
        this.guestInfoNamespaceGenerationInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfGuestInfoNamespaceGenerationInfo)) return false;
        ArrayOfGuestInfoNamespaceGenerationInfo other = (ArrayOfGuestInfoNamespaceGenerationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.guestInfoNamespaceGenerationInfo==null && other.getGuestInfoNamespaceGenerationInfo()==null) || 
             (this.guestInfoNamespaceGenerationInfo!=null &&
              java.util.Arrays.equals(this.guestInfoNamespaceGenerationInfo, other.getGuestInfoNamespaceGenerationInfo())));
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
        if (getGuestInfoNamespaceGenerationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestInfoNamespaceGenerationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestInfoNamespaceGenerationInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfGuestInfoNamespaceGenerationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfGuestInfoNamespaceGenerationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestInfoNamespaceGenerationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "GuestInfoNamespaceGenerationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestInfoNamespaceGenerationInfo"));
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
