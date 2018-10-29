/**
 * FirewallProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FirewallProfile  extends com.vmware.converter.ApplyProfile  implements java.io.Serializable {
    private com.vmware.converter.FirewallProfileRulesetProfile[] ruleset;

    public FirewallProfile() {
    }

    public FirewallProfile(
           boolean enabled,
           com.vmware.converter.ProfilePolicy[] policy,
           java.lang.String profileTypeName,
           java.lang.String profileVersion,
           com.vmware.converter.ProfileApplyProfileProperty[] property,
           com.vmware.converter.FirewallProfileRulesetProfile[] ruleset) {
        super(
            enabled,
            policy,
            profileTypeName,
            profileVersion,
            property);
        this.ruleset = ruleset;
    }


    /**
     * Gets the ruleset value for this FirewallProfile.
     * 
     * @return ruleset
     */
    public com.vmware.converter.FirewallProfileRulesetProfile[] getRuleset() {
        return ruleset;
    }


    /**
     * Sets the ruleset value for this FirewallProfile.
     * 
     * @param ruleset
     */
    public void setRuleset(com.vmware.converter.FirewallProfileRulesetProfile[] ruleset) {
        this.ruleset = ruleset;
    }

    public com.vmware.converter.FirewallProfileRulesetProfile getRuleset(int i) {
        return this.ruleset[i];
    }

    public void setRuleset(int i, com.vmware.converter.FirewallProfileRulesetProfile _value) {
        this.ruleset[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirewallProfile)) return false;
        FirewallProfile other = (FirewallProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ruleset==null && other.getRuleset()==null) || 
             (this.ruleset!=null &&
              java.util.Arrays.equals(this.ruleset, other.getRuleset())));
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
        if (getRuleset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleset(), i);
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
        new org.apache.axis.description.TypeDesc(FirewallProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FirewallProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ruleset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FirewallProfileRulesetProfile"));
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
