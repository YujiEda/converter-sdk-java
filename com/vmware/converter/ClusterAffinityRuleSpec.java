/**
 * ClusterAffinityRuleSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterAffinityRuleSpec  extends com.vmware.converter.ClusterRuleInfo  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference[] vm;

    public ClusterAffinityRuleSpec() {
    }

    public ClusterAffinityRuleSpec(
           java.lang.Integer key,
           com.vmware.converter.ManagedEntityStatus status,
           java.lang.Boolean enabled,
           java.lang.String name,
           java.lang.Boolean mandatory,
           java.lang.Boolean userCreated,
           java.lang.Boolean inCompliance,
           java.lang.String ruleUuid,
           com.vmware.converter.ManagedObjectReference[] vm) {
        super(
            key,
            status,
            enabled,
            name,
            mandatory,
            userCreated,
            inCompliance,
            ruleUuid);
        this.vm = vm;
    }


    /**
     * Gets the vm value for this ClusterAffinityRuleSpec.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference[] getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this ClusterAffinityRuleSpec.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference[] vm) {
        this.vm = vm;
    }

    public com.vmware.converter.ManagedObjectReference getVm(int i) {
        return this.vm[i];
    }

    public void setVm(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.vm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterAffinityRuleSpec)) return false;
        ClusterAffinityRuleSpec other = (ClusterAffinityRuleSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              java.util.Arrays.equals(this.vm, other.getVm())));
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
        if (getVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterAffinityRuleSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterAffinityRuleSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
