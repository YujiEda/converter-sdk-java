/**
 * ArrayOfProfilePropertyPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfProfilePropertyPath  implements java.io.Serializable {
    private com.vmware.converter.ProfilePropertyPath[] profilePropertyPath;

    public ArrayOfProfilePropertyPath() {
    }

    public ArrayOfProfilePropertyPath(
           com.vmware.converter.ProfilePropertyPath[] profilePropertyPath) {
           this.profilePropertyPath = profilePropertyPath;
    }


    /**
     * Gets the profilePropertyPath value for this ArrayOfProfilePropertyPath.
     * 
     * @return profilePropertyPath
     */
    public com.vmware.converter.ProfilePropertyPath[] getProfilePropertyPath() {
        return profilePropertyPath;
    }


    /**
     * Sets the profilePropertyPath value for this ArrayOfProfilePropertyPath.
     * 
     * @param profilePropertyPath
     */
    public void setProfilePropertyPath(com.vmware.converter.ProfilePropertyPath[] profilePropertyPath) {
        this.profilePropertyPath = profilePropertyPath;
    }

    public com.vmware.converter.ProfilePropertyPath getProfilePropertyPath(int i) {
        return this.profilePropertyPath[i];
    }

    public void setProfilePropertyPath(int i, com.vmware.converter.ProfilePropertyPath _value) {
        this.profilePropertyPath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProfilePropertyPath)) return false;
        ArrayOfProfilePropertyPath other = (ArrayOfProfilePropertyPath) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profilePropertyPath==null && other.getProfilePropertyPath()==null) || 
             (this.profilePropertyPath!=null &&
              java.util.Arrays.equals(this.profilePropertyPath, other.getProfilePropertyPath())));
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
        if (getProfilePropertyPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfilePropertyPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfilePropertyPath(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProfilePropertyPath.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfProfilePropertyPath"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilePropertyPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ProfilePropertyPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePropertyPath"));
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
