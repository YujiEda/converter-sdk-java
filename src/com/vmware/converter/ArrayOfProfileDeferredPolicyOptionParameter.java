/**
 * ArrayOfProfileDeferredPolicyOptionParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfProfileDeferredPolicyOptionParameter  implements java.io.Serializable {
    private com.vmware.converter.ProfileDeferredPolicyOptionParameter[] profileDeferredPolicyOptionParameter;

    public ArrayOfProfileDeferredPolicyOptionParameter() {
    }

    public ArrayOfProfileDeferredPolicyOptionParameter(
           com.vmware.converter.ProfileDeferredPolicyOptionParameter[] profileDeferredPolicyOptionParameter) {
           this.profileDeferredPolicyOptionParameter = profileDeferredPolicyOptionParameter;
    }


    /**
     * Gets the profileDeferredPolicyOptionParameter value for this ArrayOfProfileDeferredPolicyOptionParameter.
     * 
     * @return profileDeferredPolicyOptionParameter
     */
    public com.vmware.converter.ProfileDeferredPolicyOptionParameter[] getProfileDeferredPolicyOptionParameter() {
        return profileDeferredPolicyOptionParameter;
    }


    /**
     * Sets the profileDeferredPolicyOptionParameter value for this ArrayOfProfileDeferredPolicyOptionParameter.
     * 
     * @param profileDeferredPolicyOptionParameter
     */
    public void setProfileDeferredPolicyOptionParameter(com.vmware.converter.ProfileDeferredPolicyOptionParameter[] profileDeferredPolicyOptionParameter) {
        this.profileDeferredPolicyOptionParameter = profileDeferredPolicyOptionParameter;
    }

    public com.vmware.converter.ProfileDeferredPolicyOptionParameter getProfileDeferredPolicyOptionParameter(int i) {
        return this.profileDeferredPolicyOptionParameter[i];
    }

    public void setProfileDeferredPolicyOptionParameter(int i, com.vmware.converter.ProfileDeferredPolicyOptionParameter _value) {
        this.profileDeferredPolicyOptionParameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProfileDeferredPolicyOptionParameter)) return false;
        ArrayOfProfileDeferredPolicyOptionParameter other = (ArrayOfProfileDeferredPolicyOptionParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileDeferredPolicyOptionParameter==null && other.getProfileDeferredPolicyOptionParameter()==null) || 
             (this.profileDeferredPolicyOptionParameter!=null &&
              java.util.Arrays.equals(this.profileDeferredPolicyOptionParameter, other.getProfileDeferredPolicyOptionParameter())));
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
        if (getProfileDeferredPolicyOptionParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileDeferredPolicyOptionParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileDeferredPolicyOptionParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProfileDeferredPolicyOptionParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfProfileDeferredPolicyOptionParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileDeferredPolicyOptionParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ProfileDeferredPolicyOptionParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileDeferredPolicyOptionParameter"));
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
