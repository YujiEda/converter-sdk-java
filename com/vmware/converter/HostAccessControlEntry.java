/**
 * HostAccessControlEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostAccessControlEntry  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String principal;

    private boolean group;

    private com.vmware.converter.HostAccessMode accessMode;

    public HostAccessControlEntry() {
    }

    public HostAccessControlEntry(
           java.lang.String principal,
           boolean group,
           com.vmware.converter.HostAccessMode accessMode) {
        this.principal = principal;
        this.group = group;
        this.accessMode = accessMode;
    }


    /**
     * Gets the principal value for this HostAccessControlEntry.
     * 
     * @return principal
     */
    public java.lang.String getPrincipal() {
        return principal;
    }


    /**
     * Sets the principal value for this HostAccessControlEntry.
     * 
     * @param principal
     */
    public void setPrincipal(java.lang.String principal) {
        this.principal = principal;
    }


    /**
     * Gets the group value for this HostAccessControlEntry.
     * 
     * @return group
     */
    public boolean isGroup() {
        return group;
    }


    /**
     * Sets the group value for this HostAccessControlEntry.
     * 
     * @param group
     */
    public void setGroup(boolean group) {
        this.group = group;
    }


    /**
     * Gets the accessMode value for this HostAccessControlEntry.
     * 
     * @return accessMode
     */
    public com.vmware.converter.HostAccessMode getAccessMode() {
        return accessMode;
    }


    /**
     * Sets the accessMode value for this HostAccessControlEntry.
     * 
     * @param accessMode
     */
    public void setAccessMode(com.vmware.converter.HostAccessMode accessMode) {
        this.accessMode = accessMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostAccessControlEntry)) return false;
        HostAccessControlEntry other = (HostAccessControlEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.principal==null && other.getPrincipal()==null) || 
             (this.principal!=null &&
              this.principal.equals(other.getPrincipal()))) &&
            this.group == other.isGroup() &&
            ((this.accessMode==null && other.getAccessMode()==null) || 
             (this.accessMode!=null &&
              this.accessMode.equals(other.getAccessMode())));
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
        if (getPrincipal() != null) {
            _hashCode += getPrincipal().hashCode();
        }
        _hashCode += (isGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAccessMode() != null) {
            _hashCode += getAccessMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostAccessControlEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccessControlEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "principal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccessMode"));
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
