/**
 * ArrayOfUserProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfUserProfile  implements java.io.Serializable {
    private com.vmware.converter.UserProfile[] userProfile;

    public ArrayOfUserProfile() {
    }

    public ArrayOfUserProfile(
           com.vmware.converter.UserProfile[] userProfile) {
           this.userProfile = userProfile;
    }


    /**
     * Gets the userProfile value for this ArrayOfUserProfile.
     * 
     * @return userProfile
     */
    public com.vmware.converter.UserProfile[] getUserProfile() {
        return userProfile;
    }


    /**
     * Sets the userProfile value for this ArrayOfUserProfile.
     * 
     * @param userProfile
     */
    public void setUserProfile(com.vmware.converter.UserProfile[] userProfile) {
        this.userProfile = userProfile;
    }

    public com.vmware.converter.UserProfile getUserProfile(int i) {
        return this.userProfile[i];
    }

    public void setUserProfile(int i, com.vmware.converter.UserProfile _value) {
        this.userProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfUserProfile)) return false;
        ArrayOfUserProfile other = (ArrayOfUserProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userProfile==null && other.getUserProfile()==null) || 
             (this.userProfile!=null &&
              java.util.Arrays.equals(this.userProfile, other.getUserProfile())));
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
        if (getUserProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfUserProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfUserProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "UserProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserProfile"));
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
