/**
 * HostSecuritySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostSecuritySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String adminPassword;

    private com.vmware.converter.Permission[] removePermission;

    private com.vmware.converter.Permission[] addPermission;

    public HostSecuritySpec() {
    }

    public HostSecuritySpec(
           java.lang.String adminPassword,
           com.vmware.converter.Permission[] removePermission,
           com.vmware.converter.Permission[] addPermission) {
        this.adminPassword = adminPassword;
        this.removePermission = removePermission;
        this.addPermission = addPermission;
    }


    /**
     * Gets the adminPassword value for this HostSecuritySpec.
     * 
     * @return adminPassword
     */
    public java.lang.String getAdminPassword() {
        return adminPassword;
    }


    /**
     * Sets the adminPassword value for this HostSecuritySpec.
     * 
     * @param adminPassword
     */
    public void setAdminPassword(java.lang.String adminPassword) {
        this.adminPassword = adminPassword;
    }


    /**
     * Gets the removePermission value for this HostSecuritySpec.
     * 
     * @return removePermission
     */
    public com.vmware.converter.Permission[] getRemovePermission() {
        return removePermission;
    }


    /**
     * Sets the removePermission value for this HostSecuritySpec.
     * 
     * @param removePermission
     */
    public void setRemovePermission(com.vmware.converter.Permission[] removePermission) {
        this.removePermission = removePermission;
    }

    public com.vmware.converter.Permission getRemovePermission(int i) {
        return this.removePermission[i];
    }

    public void setRemovePermission(int i, com.vmware.converter.Permission _value) {
        this.removePermission[i] = _value;
    }


    /**
     * Gets the addPermission value for this HostSecuritySpec.
     * 
     * @return addPermission
     */
    public com.vmware.converter.Permission[] getAddPermission() {
        return addPermission;
    }


    /**
     * Sets the addPermission value for this HostSecuritySpec.
     * 
     * @param addPermission
     */
    public void setAddPermission(com.vmware.converter.Permission[] addPermission) {
        this.addPermission = addPermission;
    }

    public com.vmware.converter.Permission getAddPermission(int i) {
        return this.addPermission[i];
    }

    public void setAddPermission(int i, com.vmware.converter.Permission _value) {
        this.addPermission[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostSecuritySpec)) return false;
        HostSecuritySpec other = (HostSecuritySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adminPassword==null && other.getAdminPassword()==null) || 
             (this.adminPassword!=null &&
              this.adminPassword.equals(other.getAdminPassword()))) &&
            ((this.removePermission==null && other.getRemovePermission()==null) || 
             (this.removePermission!=null &&
              java.util.Arrays.equals(this.removePermission, other.getRemovePermission()))) &&
            ((this.addPermission==null && other.getAddPermission()==null) || 
             (this.addPermission!=null &&
              java.util.Arrays.equals(this.addPermission, other.getAddPermission())));
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
        if (getAdminPassword() != null) {
            _hashCode += getAdminPassword().hashCode();
        }
        if (getRemovePermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovePermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovePermission(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddPermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddPermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddPermission(), i);
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
        new org.apache.axis.description.TypeDesc(HostSecuritySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSecuritySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "adminPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removePermission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "removePermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Permission"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPermission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addPermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Permission"));
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
