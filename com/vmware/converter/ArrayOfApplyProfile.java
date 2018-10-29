/**
 * ArrayOfApplyProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfApplyProfile  implements java.io.Serializable {
    private com.vmware.converter.ApplyProfile[] applyProfile;

    public ArrayOfApplyProfile() {
    }

    public ArrayOfApplyProfile(
           com.vmware.converter.ApplyProfile[] applyProfile) {
           this.applyProfile = applyProfile;
    }


    /**
     * Gets the applyProfile value for this ArrayOfApplyProfile.
     * 
     * @return applyProfile
     */
    public com.vmware.converter.ApplyProfile[] getApplyProfile() {
        return applyProfile;
    }


    /**
     * Sets the applyProfile value for this ArrayOfApplyProfile.
     * 
     * @param applyProfile
     */
    public void setApplyProfile(com.vmware.converter.ApplyProfile[] applyProfile) {
        this.applyProfile = applyProfile;
    }

    public com.vmware.converter.ApplyProfile getApplyProfile(int i) {
        return this.applyProfile[i];
    }

    public void setApplyProfile(int i, com.vmware.converter.ApplyProfile _value) {
        this.applyProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfApplyProfile)) return false;
        ArrayOfApplyProfile other = (ArrayOfApplyProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applyProfile==null && other.getApplyProfile()==null) || 
             (this.applyProfile!=null &&
              java.util.Arrays.equals(this.applyProfile, other.getApplyProfile())));
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
        if (getApplyProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfApplyProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfApplyProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ApplyProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ApplyProfile"));
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
