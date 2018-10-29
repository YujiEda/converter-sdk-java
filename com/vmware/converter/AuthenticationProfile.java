/**
 * AuthenticationProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AuthenticationProfile  extends com.vmware.converter.ApplyProfile  implements java.io.Serializable {
    private com.vmware.converter.ActiveDirectoryProfile activeDirectory;

    public AuthenticationProfile() {
    }

    public AuthenticationProfile(
           boolean enabled,
           com.vmware.converter.ProfilePolicy[] policy,
           java.lang.String profileTypeName,
           java.lang.String profileVersion,
           com.vmware.converter.ProfileApplyProfileProperty[] property,
           com.vmware.converter.ActiveDirectoryProfile activeDirectory) {
        super(
            enabled,
            policy,
            profileTypeName,
            profileVersion,
            property);
        this.activeDirectory = activeDirectory;
    }


    /**
     * Gets the activeDirectory value for this AuthenticationProfile.
     * 
     * @return activeDirectory
     */
    public com.vmware.converter.ActiveDirectoryProfile getActiveDirectory() {
        return activeDirectory;
    }


    /**
     * Sets the activeDirectory value for this AuthenticationProfile.
     * 
     * @param activeDirectory
     */
    public void setActiveDirectory(com.vmware.converter.ActiveDirectoryProfile activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationProfile)) return false;
        AuthenticationProfile other = (AuthenticationProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeDirectory==null && other.getActiveDirectory()==null) || 
             (this.activeDirectory!=null &&
              this.activeDirectory.equals(other.getActiveDirectory())));
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
        if (getActiveDirectory() != null) {
            _hashCode += getActiveDirectory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AuthenticationProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ActiveDirectoryProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
