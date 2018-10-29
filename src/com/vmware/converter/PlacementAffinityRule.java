/**
 * PlacementAffinityRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementAffinityRule  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ruleType;

    private java.lang.String ruleScope;

    private com.vmware.converter.ManagedObjectReference[] vms;

    private java.lang.String[] keys;

    public PlacementAffinityRule() {
    }

    public PlacementAffinityRule(
           java.lang.String ruleType,
           java.lang.String ruleScope,
           com.vmware.converter.ManagedObjectReference[] vms,
           java.lang.String[] keys) {
        this.ruleType = ruleType;
        this.ruleScope = ruleScope;
        this.vms = vms;
        this.keys = keys;
    }


    /**
     * Gets the ruleType value for this PlacementAffinityRule.
     * 
     * @return ruleType
     */
    public java.lang.String getRuleType() {
        return ruleType;
    }


    /**
     * Sets the ruleType value for this PlacementAffinityRule.
     * 
     * @param ruleType
     */
    public void setRuleType(java.lang.String ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * Gets the ruleScope value for this PlacementAffinityRule.
     * 
     * @return ruleScope
     */
    public java.lang.String getRuleScope() {
        return ruleScope;
    }


    /**
     * Sets the ruleScope value for this PlacementAffinityRule.
     * 
     * @param ruleScope
     */
    public void setRuleScope(java.lang.String ruleScope) {
        this.ruleScope = ruleScope;
    }


    /**
     * Gets the vms value for this PlacementAffinityRule.
     * 
     * @return vms
     */
    public com.vmware.converter.ManagedObjectReference[] getVms() {
        return vms;
    }


    /**
     * Sets the vms value for this PlacementAffinityRule.
     * 
     * @param vms
     */
    public void setVms(com.vmware.converter.ManagedObjectReference[] vms) {
        this.vms = vms;
    }

    public com.vmware.converter.ManagedObjectReference getVms(int i) {
        return this.vms[i];
    }

    public void setVms(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.vms[i] = _value;
    }


    /**
     * Gets the keys value for this PlacementAffinityRule.
     * 
     * @return keys
     */
    public java.lang.String[] getKeys() {
        return keys;
    }


    /**
     * Sets the keys value for this PlacementAffinityRule.
     * 
     * @param keys
     */
    public void setKeys(java.lang.String[] keys) {
        this.keys = keys;
    }

    public java.lang.String getKeys(int i) {
        return this.keys[i];
    }

    public void setKeys(int i, java.lang.String _value) {
        this.keys[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementAffinityRule)) return false;
        PlacementAffinityRule other = (PlacementAffinityRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ruleType==null && other.getRuleType()==null) || 
             (this.ruleType!=null &&
              this.ruleType.equals(other.getRuleType()))) &&
            ((this.ruleScope==null && other.getRuleScope()==null) || 
             (this.ruleScope!=null &&
              this.ruleScope.equals(other.getRuleScope()))) &&
            ((this.vms==null && other.getVms()==null) || 
             (this.vms!=null &&
              java.util.Arrays.equals(this.vms, other.getVms()))) &&
            ((this.keys==null && other.getKeys()==null) || 
             (this.keys!=null &&
              java.util.Arrays.equals(this.keys, other.getKeys())));
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
        if (getRuleType() != null) {
            _hashCode += getRuleType().hashCode();
        }
        if (getRuleScope() != null) {
            _hashCode += getRuleScope().hashCode();
        }
        if (getVms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeys(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementAffinityRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementAffinityRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ruleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ruleScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "keys"));
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
