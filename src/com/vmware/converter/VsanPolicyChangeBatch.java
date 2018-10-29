/**
 * VsanPolicyChangeBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanPolicyChangeBatch  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] uuid;

    private java.lang.String policy;

    public VsanPolicyChangeBatch() {
    }

    public VsanPolicyChangeBatch(
           java.lang.String[] uuid,
           java.lang.String policy) {
        this.uuid = uuid;
        this.policy = policy;
    }


    /**
     * Gets the uuid value for this VsanPolicyChangeBatch.
     * 
     * @return uuid
     */
    public java.lang.String[] getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VsanPolicyChangeBatch.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String[] uuid) {
        this.uuid = uuid;
    }

    public java.lang.String getUuid(int i) {
        return this.uuid[i];
    }

    public void setUuid(int i, java.lang.String _value) {
        this.uuid[i] = _value;
    }


    /**
     * Gets the policy value for this VsanPolicyChangeBatch.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this VsanPolicyChangeBatch.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanPolicyChangeBatch)) return false;
        VsanPolicyChangeBatch other = (VsanPolicyChangeBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              java.util.Arrays.equals(this.uuid, other.getUuid()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy())));
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
        if (getUuid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUuid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUuid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanPolicyChangeBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanPolicyChangeBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
