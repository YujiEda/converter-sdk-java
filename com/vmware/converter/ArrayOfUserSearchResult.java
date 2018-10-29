/**
 * ArrayOfUserSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfUserSearchResult  implements java.io.Serializable {
    private com.vmware.converter.UserSearchResult[] userSearchResult;

    public ArrayOfUserSearchResult() {
    }

    public ArrayOfUserSearchResult(
           com.vmware.converter.UserSearchResult[] userSearchResult) {
           this.userSearchResult = userSearchResult;
    }


    /**
     * Gets the userSearchResult value for this ArrayOfUserSearchResult.
     * 
     * @return userSearchResult
     */
    public com.vmware.converter.UserSearchResult[] getUserSearchResult() {
        return userSearchResult;
    }


    /**
     * Sets the userSearchResult value for this ArrayOfUserSearchResult.
     * 
     * @param userSearchResult
     */
    public void setUserSearchResult(com.vmware.converter.UserSearchResult[] userSearchResult) {
        this.userSearchResult = userSearchResult;
    }

    public com.vmware.converter.UserSearchResult getUserSearchResult(int i) {
        return this.userSearchResult[i];
    }

    public void setUserSearchResult(int i, com.vmware.converter.UserSearchResult _value) {
        this.userSearchResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfUserSearchResult)) return false;
        ArrayOfUserSearchResult other = (ArrayOfUserSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userSearchResult==null && other.getUserSearchResult()==null) || 
             (this.userSearchResult!=null &&
              java.util.Arrays.equals(this.userSearchResult, other.getUserSearchResult())));
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
        if (getUserSearchResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserSearchResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserSearchResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfUserSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfUserSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSearchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "UserSearchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserSearchResult"));
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
