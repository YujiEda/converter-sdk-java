/**
 * RetrieveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RetrieveResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String token;

    private com.vmware.converter.ObjectContent[] objects;

    public RetrieveResult() {
    }

    public RetrieveResult(
           java.lang.String token,
           com.vmware.converter.ObjectContent[] objects) {
        this.token = token;
        this.objects = objects;
    }


    /**
     * Gets the token value for this RetrieveResult.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this RetrieveResult.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the objects value for this RetrieveResult.
     * 
     * @return objects
     */
    public com.vmware.converter.ObjectContent[] getObjects() {
        return objects;
    }


    /**
     * Sets the objects value for this RetrieveResult.
     * 
     * @param objects
     */
    public void setObjects(com.vmware.converter.ObjectContent[] objects) {
        this.objects = objects;
    }

    public com.vmware.converter.ObjectContent getObjects(int i) {
        return this.objects[i];
    }

    public void setObjects(int i, com.vmware.converter.ObjectContent _value) {
        this.objects[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveResult)) return false;
        RetrieveResult other = (RetrieveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.objects==null && other.getObjects()==null) || 
             (this.objects!=null &&
              java.util.Arrays.equals(this.objects, other.getObjects())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjects(), i);
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
        new org.apache.axis.description.TypeDesc(RetrieveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RetrieveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ObjectContent"));
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
