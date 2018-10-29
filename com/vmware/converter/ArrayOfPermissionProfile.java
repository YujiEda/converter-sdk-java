/**
 * ArrayOfPermissionProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfPermissionProfile  implements java.io.Serializable {
    private com.vmware.converter.PermissionProfile[] permissionProfile;

    public ArrayOfPermissionProfile() {
    }

    public ArrayOfPermissionProfile(
           com.vmware.converter.PermissionProfile[] permissionProfile) {
           this.permissionProfile = permissionProfile;
    }


    /**
     * Gets the permissionProfile value for this ArrayOfPermissionProfile.
     * 
     * @return permissionProfile
     */
    public com.vmware.converter.PermissionProfile[] getPermissionProfile() {
        return permissionProfile;
    }


    /**
     * Sets the permissionProfile value for this ArrayOfPermissionProfile.
     * 
     * @param permissionProfile
     */
    public void setPermissionProfile(com.vmware.converter.PermissionProfile[] permissionProfile) {
        this.permissionProfile = permissionProfile;
    }

    public com.vmware.converter.PermissionProfile getPermissionProfile(int i) {
        return this.permissionProfile[i];
    }

    public void setPermissionProfile(int i, com.vmware.converter.PermissionProfile _value) {
        this.permissionProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPermissionProfile)) return false;
        ArrayOfPermissionProfile other = (ArrayOfPermissionProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.permissionProfile==null && other.getPermissionProfile()==null) || 
             (this.permissionProfile!=null &&
              java.util.Arrays.equals(this.permissionProfile, other.getPermissionProfile())));
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
        if (getPermissionProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPermissionProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPermissionProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PermissionProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PermissionProfile"));
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
