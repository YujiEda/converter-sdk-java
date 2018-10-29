/**
 * ArrayOfPrivilegeAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfPrivilegeAvailability  implements java.io.Serializable {
    private com.vmware.converter.PrivilegeAvailability[] privilegeAvailability;

    public ArrayOfPrivilegeAvailability() {
    }

    public ArrayOfPrivilegeAvailability(
           com.vmware.converter.PrivilegeAvailability[] privilegeAvailability) {
           this.privilegeAvailability = privilegeAvailability;
    }


    /**
     * Gets the privilegeAvailability value for this ArrayOfPrivilegeAvailability.
     * 
     * @return privilegeAvailability
     */
    public com.vmware.converter.PrivilegeAvailability[] getPrivilegeAvailability() {
        return privilegeAvailability;
    }


    /**
     * Sets the privilegeAvailability value for this ArrayOfPrivilegeAvailability.
     * 
     * @param privilegeAvailability
     */
    public void setPrivilegeAvailability(com.vmware.converter.PrivilegeAvailability[] privilegeAvailability) {
        this.privilegeAvailability = privilegeAvailability;
    }

    public com.vmware.converter.PrivilegeAvailability getPrivilegeAvailability(int i) {
        return this.privilegeAvailability[i];
    }

    public void setPrivilegeAvailability(int i, com.vmware.converter.PrivilegeAvailability _value) {
        this.privilegeAvailability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPrivilegeAvailability)) return false;
        ArrayOfPrivilegeAvailability other = (ArrayOfPrivilegeAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.privilegeAvailability==null && other.getPrivilegeAvailability()==null) || 
             (this.privilegeAvailability!=null &&
              java.util.Arrays.equals(this.privilegeAvailability, other.getPrivilegeAvailability())));
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
        if (getPrivilegeAvailability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivilegeAvailability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivilegeAvailability(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPrivilegeAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPrivilegeAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PrivilegeAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PrivilegeAvailability"));
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
