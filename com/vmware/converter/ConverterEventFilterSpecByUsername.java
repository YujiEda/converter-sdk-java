/**
 * ConverterEventFilterSpecByUsername.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEventFilterSpecByUsername  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean systemUser;

    private java.lang.String[] userList;

    public ConverterEventFilterSpecByUsername() {
    }

    public ConverterEventFilterSpecByUsername(
           boolean systemUser,
           java.lang.String[] userList) {
        this.systemUser = systemUser;
        this.userList = userList;
    }


    /**
     * Gets the systemUser value for this ConverterEventFilterSpecByUsername.
     * 
     * @return systemUser
     */
    public boolean isSystemUser() {
        return systemUser;
    }


    /**
     * Sets the systemUser value for this ConverterEventFilterSpecByUsername.
     * 
     * @param systemUser
     */
    public void setSystemUser(boolean systemUser) {
        this.systemUser = systemUser;
    }


    /**
     * Gets the userList value for this ConverterEventFilterSpecByUsername.
     * 
     * @return userList
     */
    public java.lang.String[] getUserList() {
        return userList;
    }


    /**
     * Sets the userList value for this ConverterEventFilterSpecByUsername.
     * 
     * @param userList
     */
    public void setUserList(java.lang.String[] userList) {
        this.userList = userList;
    }

    public java.lang.String getUserList(int i) {
        return this.userList[i];
    }

    public void setUserList(int i, java.lang.String _value) {
        this.userList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEventFilterSpecByUsername)) return false;
        ConverterEventFilterSpecByUsername other = (ConverterEventFilterSpecByUsername) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.systemUser == other.isSystemUser() &&
            ((this.userList==null && other.getUserList()==null) || 
             (this.userList!=null &&
              java.util.Arrays.equals(this.userList, other.getUserList())));
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
        _hashCode += (isSystemUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUserList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserList(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterEventFilterSpecByUsername.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventFilterSpecByUsername"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "systemUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
