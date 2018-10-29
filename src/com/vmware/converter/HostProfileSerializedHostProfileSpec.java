/**
 * HostProfileSerializedHostProfileSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostProfileSerializedHostProfileSpec  extends com.vmware.converter.ProfileSerializedCreateSpec  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference validatorHost;

    private java.lang.Boolean validating;

    public HostProfileSerializedHostProfileSpec() {
    }

    public HostProfileSerializedHostProfileSpec(
           java.lang.String name,
           java.lang.String annotation,
           java.lang.Boolean enabled,
           java.lang.String profileConfigString,
           com.vmware.converter.ManagedObjectReference validatorHost,
           java.lang.Boolean validating) {
        super(
            name,
            annotation,
            enabled,
            profileConfigString);
        this.validatorHost = validatorHost;
        this.validating = validating;
    }


    /**
     * Gets the validatorHost value for this HostProfileSerializedHostProfileSpec.
     * 
     * @return validatorHost
     */
    public com.vmware.converter.ManagedObjectReference getValidatorHost() {
        return validatorHost;
    }


    /**
     * Sets the validatorHost value for this HostProfileSerializedHostProfileSpec.
     * 
     * @param validatorHost
     */
    public void setValidatorHost(com.vmware.converter.ManagedObjectReference validatorHost) {
        this.validatorHost = validatorHost;
    }


    /**
     * Gets the validating value for this HostProfileSerializedHostProfileSpec.
     * 
     * @return validating
     */
    public java.lang.Boolean getValidating() {
        return validating;
    }


    /**
     * Sets the validating value for this HostProfileSerializedHostProfileSpec.
     * 
     * @param validating
     */
    public void setValidating(java.lang.Boolean validating) {
        this.validating = validating;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostProfileSerializedHostProfileSpec)) return false;
        HostProfileSerializedHostProfileSpec other = (HostProfileSerializedHostProfileSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.validatorHost==null && other.getValidatorHost()==null) || 
             (this.validatorHost!=null &&
              this.validatorHost.equals(other.getValidatorHost()))) &&
            ((this.validating==null && other.getValidating()==null) || 
             (this.validating!=null &&
              this.validating.equals(other.getValidating())));
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
        if (getValidatorHost() != null) {
            _hashCode += getValidatorHost().hashCode();
        }
        if (getValidating() != null) {
            _hashCode += getValidating().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostProfileSerializedHostProfileSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProfileSerializedHostProfileSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatorHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "validatorHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validating");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "validating"));
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
