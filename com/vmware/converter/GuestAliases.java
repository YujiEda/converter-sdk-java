/**
 * GuestAliases.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestAliases  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String base64Cert;

    private com.vmware.converter.GuestAuthAliasInfo[] aliases;

    public GuestAliases() {
    }

    public GuestAliases(
           java.lang.String base64Cert,
           com.vmware.converter.GuestAuthAliasInfo[] aliases) {
        this.base64Cert = base64Cert;
        this.aliases = aliases;
    }


    /**
     * Gets the base64Cert value for this GuestAliases.
     * 
     * @return base64Cert
     */
    public java.lang.String getBase64Cert() {
        return base64Cert;
    }


    /**
     * Sets the base64Cert value for this GuestAliases.
     * 
     * @param base64Cert
     */
    public void setBase64Cert(java.lang.String base64Cert) {
        this.base64Cert = base64Cert;
    }


    /**
     * Gets the aliases value for this GuestAliases.
     * 
     * @return aliases
     */
    public com.vmware.converter.GuestAuthAliasInfo[] getAliases() {
        return aliases;
    }


    /**
     * Sets the aliases value for this GuestAliases.
     * 
     * @param aliases
     */
    public void setAliases(com.vmware.converter.GuestAuthAliasInfo[] aliases) {
        this.aliases = aliases;
    }

    public com.vmware.converter.GuestAuthAliasInfo getAliases(int i) {
        return this.aliases[i];
    }

    public void setAliases(int i, com.vmware.converter.GuestAuthAliasInfo _value) {
        this.aliases[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestAliases)) return false;
        GuestAliases other = (GuestAliases) obj;
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
            ((this.aliases==null && other.getAliases()==null) || 
             (this.aliases!=null &&
              java.util.Arrays.equals(this.aliases, other.getAliases())));
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
        if (getAliases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAliases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAliases(), i);
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
        new org.apache.axis.description.TypeDesc(GuestAliases.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAliases"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base64Cert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "base64Cert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "aliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAuthAliasInfo"));
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
