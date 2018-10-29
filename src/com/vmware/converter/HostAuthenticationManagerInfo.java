/**
 * HostAuthenticationManagerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostAuthenticationManagerInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostAuthenticationStoreInfo[] authConfig;

    public HostAuthenticationManagerInfo() {
    }

    public HostAuthenticationManagerInfo(
           com.vmware.converter.HostAuthenticationStoreInfo[] authConfig) {
        this.authConfig = authConfig;
    }


    /**
     * Gets the authConfig value for this HostAuthenticationManagerInfo.
     * 
     * @return authConfig
     */
    public com.vmware.converter.HostAuthenticationStoreInfo[] getAuthConfig() {
        return authConfig;
    }


    /**
     * Sets the authConfig value for this HostAuthenticationManagerInfo.
     * 
     * @param authConfig
     */
    public void setAuthConfig(com.vmware.converter.HostAuthenticationStoreInfo[] authConfig) {
        this.authConfig = authConfig;
    }

    public com.vmware.converter.HostAuthenticationStoreInfo getAuthConfig(int i) {
        return this.authConfig[i];
    }

    public void setAuthConfig(int i, com.vmware.converter.HostAuthenticationStoreInfo _value) {
        this.authConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostAuthenticationManagerInfo)) return false;
        HostAuthenticationManagerInfo other = (HostAuthenticationManagerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authConfig==null && other.getAuthConfig()==null) || 
             (this.authConfig!=null &&
              java.util.Arrays.equals(this.authConfig, other.getAuthConfig())));
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
        if (getAuthConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthConfig(), i);
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
        new org.apache.axis.description.TypeDesc(HostAuthenticationManagerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAuthenticationManagerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "authConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAuthenticationStoreInfo"));
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
