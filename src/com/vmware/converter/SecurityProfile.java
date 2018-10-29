/**
 * SecurityProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class SecurityProfile  extends com.vmware.converter.ApplyProfile  implements java.io.Serializable {
    private com.vmware.converter.PermissionProfile[] permission;

    public SecurityProfile() {
    }

    public SecurityProfile(
           boolean enabled,
           com.vmware.converter.ProfilePolicy[] policy,
           java.lang.String profileTypeName,
           java.lang.String profileVersion,
           com.vmware.converter.ProfileApplyProfileProperty[] property,
           com.vmware.converter.PermissionProfile[] permission) {
        super(
            enabled,
            policy,
            profileTypeName,
            profileVersion,
            property);
        this.permission = permission;
    }


    /**
     * Gets the permission value for this SecurityProfile.
     * 
     * @return permission
     */
    public com.vmware.converter.PermissionProfile[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this SecurityProfile.
     * 
     * @param permission
     */
    public void setPermission(com.vmware.converter.PermissionProfile[] permission) {
        this.permission = permission;
    }

    public com.vmware.converter.PermissionProfile getPermission(int i) {
        return this.permission[i];
    }

    public void setPermission(int i, com.vmware.converter.PermissionProfile _value) {
        this.permission[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityProfile)) return false;
        SecurityProfile other = (SecurityProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              java.util.Arrays.equals(this.permission, other.getPermission())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermission(), i);
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
        new org.apache.axis.description.TypeDesc(SecurityProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SecurityProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "permission"));
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
