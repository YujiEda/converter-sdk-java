/**
 * HostFirewallRulesetRulesetSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFirewallRulesetRulesetSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostFirewallRulesetIpList allowedHosts;

    public HostFirewallRulesetRulesetSpec() {
    }

    public HostFirewallRulesetRulesetSpec(
           com.vmware.converter.HostFirewallRulesetIpList allowedHosts) {
        this.allowedHosts = allowedHosts;
    }


    /**
     * Gets the allowedHosts value for this HostFirewallRulesetRulesetSpec.
     * 
     * @return allowedHosts
     */
    public com.vmware.converter.HostFirewallRulesetIpList getAllowedHosts() {
        return allowedHosts;
    }


    /**
     * Sets the allowedHosts value for this HostFirewallRulesetRulesetSpec.
     * 
     * @param allowedHosts
     */
    public void setAllowedHosts(com.vmware.converter.HostFirewallRulesetIpList allowedHosts) {
        this.allowedHosts = allowedHosts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallRulesetRulesetSpec)) return false;
        HostFirewallRulesetRulesetSpec other = (HostFirewallRulesetRulesetSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedHosts==null && other.getAllowedHosts()==null) || 
             (this.allowedHosts!=null &&
              this.allowedHosts.equals(other.getAllowedHosts())));
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
        if (getAllowedHosts() != null) {
            _hashCode += getAllowedHosts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFirewallRulesetRulesetSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRulesetRulesetSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowedHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRulesetIpList"));
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
