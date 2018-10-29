/**
 * EnvironmentBrowserConfigOptionQuerySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EnvironmentBrowserConfigOptionQuerySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String[] guestId;

    public EnvironmentBrowserConfigOptionQuerySpec() {
    }

    public EnvironmentBrowserConfigOptionQuerySpec(
           java.lang.String key,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String[] guestId) {
        this.key = key;
        this.host = host;
        this.guestId = guestId;
    }


    /**
     * Gets the key value for this EnvironmentBrowserConfigOptionQuerySpec.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this EnvironmentBrowserConfigOptionQuerySpec.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the host value for this EnvironmentBrowserConfigOptionQuerySpec.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this EnvironmentBrowserConfigOptionQuerySpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the guestId value for this EnvironmentBrowserConfigOptionQuerySpec.
     * 
     * @return guestId
     */
    public java.lang.String[] getGuestId() {
        return guestId;
    }


    /**
     * Sets the guestId value for this EnvironmentBrowserConfigOptionQuerySpec.
     * 
     * @param guestId
     */
    public void setGuestId(java.lang.String[] guestId) {
        this.guestId = guestId;
    }

    public java.lang.String getGuestId(int i) {
        return this.guestId[i];
    }

    public void setGuestId(int i, java.lang.String _value) {
        this.guestId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvironmentBrowserConfigOptionQuerySpec)) return false;
        EnvironmentBrowserConfigOptionQuerySpec other = (EnvironmentBrowserConfigOptionQuerySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.guestId==null && other.getGuestId()==null) || 
             (this.guestId!=null &&
              java.util.Arrays.equals(this.guestId, other.getGuestId())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getGuestId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestId(), i);
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
        new org.apache.axis.description.TypeDesc(EnvironmentBrowserConfigOptionQuerySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EnvironmentBrowserConfigOptionQuerySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestId"));
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
