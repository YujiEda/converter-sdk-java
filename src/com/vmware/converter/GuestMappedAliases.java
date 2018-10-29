/**
 * GuestMappedAliases.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestMappedAliases  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String base64Cert;

    private java.lang.String username;

    private com.vmware.converter.GuestAuthSubject[] subjects;

    public GuestMappedAliases() {
    }

    public GuestMappedAliases(
           java.lang.String base64Cert,
           java.lang.String username,
           com.vmware.converter.GuestAuthSubject[] subjects) {
        this.base64Cert = base64Cert;
        this.username = username;
        this.subjects = subjects;
    }


    /**
     * Gets the base64Cert value for this GuestMappedAliases.
     * 
     * @return base64Cert
     */
    public java.lang.String getBase64Cert() {
        return base64Cert;
    }


    /**
     * Sets the base64Cert value for this GuestMappedAliases.
     * 
     * @param base64Cert
     */
    public void setBase64Cert(java.lang.String base64Cert) {
        this.base64Cert = base64Cert;
    }


    /**
     * Gets the username value for this GuestMappedAliases.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this GuestMappedAliases.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the subjects value for this GuestMappedAliases.
     * 
     * @return subjects
     */
    public com.vmware.converter.GuestAuthSubject[] getSubjects() {
        return subjects;
    }


    /**
     * Sets the subjects value for this GuestMappedAliases.
     * 
     * @param subjects
     */
    public void setSubjects(com.vmware.converter.GuestAuthSubject[] subjects) {
        this.subjects = subjects;
    }

    public com.vmware.converter.GuestAuthSubject getSubjects(int i) {
        return this.subjects[i];
    }

    public void setSubjects(int i, com.vmware.converter.GuestAuthSubject _value) {
        this.subjects[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestMappedAliases)) return false;
        GuestMappedAliases other = (GuestMappedAliases) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.base64Cert==null && other.getBase64Cert()==null) || 
             (this.base64Cert!=null &&
              this.base64Cert.equals(other.getBase64Cert()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.subjects==null && other.getSubjects()==null) || 
             (this.subjects!=null &&
              java.util.Arrays.equals(this.subjects, other.getSubjects())));
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
        if (getBase64Cert() != null) {
            _hashCode += getBase64Cert().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getSubjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjects(), i);
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
        new org.apache.axis.description.TypeDesc(GuestMappedAliases.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestMappedAliases"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base64Cert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "base64Cert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAuthSubject"));
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
