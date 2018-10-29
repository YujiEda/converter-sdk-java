/**
 * VirtualAppLinkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualAppLinkInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference key;

    private java.lang.Boolean destroyWithParent;

    public VirtualAppLinkInfo() {
    }

    public VirtualAppLinkInfo(
           com.vmware.converter.ManagedObjectReference key,
           java.lang.Boolean destroyWithParent) {
        this.key = key;
        this.destroyWithParent = destroyWithParent;
    }


    /**
     * Gets the key value for this VirtualAppLinkInfo.
     * 
     * @return key
     */
    public com.vmware.converter.ManagedObjectReference getKey() {
        return key;
    }


    /**
     * Sets the key value for this VirtualAppLinkInfo.
     * 
     * @param key
     */
    public void setKey(com.vmware.converter.ManagedObjectReference key) {
        this.key = key;
    }


    /**
     * Gets the destroyWithParent value for this VirtualAppLinkInfo.
     * 
     * @return destroyWithParent
     */
    public java.lang.Boolean getDestroyWithParent() {
        return destroyWithParent;
    }


    /**
     * Sets the destroyWithParent value for this VirtualAppLinkInfo.
     * 
     * @param destroyWithParent
     */
    public void setDestroyWithParent(java.lang.Boolean destroyWithParent) {
        this.destroyWithParent = destroyWithParent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualAppLinkInfo)) return false;
        VirtualAppLinkInfo other = (VirtualAppLinkInfo) obj;
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
            ((this.destroyWithParent==null && other.getDestroyWithParent()==null) || 
             (this.destroyWithParent!=null &&
              this.destroyWithParent.equals(other.getDestroyWithParent())));
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
        if (getDestroyWithParent() != null) {
            _hashCode += getDestroyWithParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualAppLinkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppLinkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destroyWithParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destroyWithParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
