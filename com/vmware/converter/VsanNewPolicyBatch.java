/**
 * VsanNewPolicyBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanNewPolicyBatch  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long[] size;

    private java.lang.String policy;

    public VsanNewPolicyBatch() {
    }

    public VsanNewPolicyBatch(
           long[] size,
           java.lang.String policy) {
        this.size = size;
        this.policy = policy;
    }


    /**
     * Gets the size value for this VsanNewPolicyBatch.
     * 
     * @return size
     */
    public long[] getSize() {
        return size;
    }


    /**
     * Sets the size value for this VsanNewPolicyBatch.
     * 
     * @param size
     */
    public void setSize(long[] size) {
        this.size = size;
    }

    public long getSize(int i) {
        return this.size[i];
    }

    public void setSize(int i, long _value) {
        this.size[i] = _value;
    }


    /**
     * Gets the policy value for this VsanNewPolicyBatch.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this VsanNewPolicyBatch.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanNewPolicyBatch)) return false;
        VsanNewPolicyBatch other = (VsanNewPolicyBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              java.util.Arrays.equals(this.size, other.getSize()))) &&
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
        if (getSize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSize(), i);
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
        new org.apache.axis.description.TypeDesc(VsanNewPolicyBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanNewPolicyBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
