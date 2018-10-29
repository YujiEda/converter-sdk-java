/**
 * ArrayOfHostFirewallRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostFirewallRule  implements java.io.Serializable {
    private com.vmware.converter.HostFirewallRule[] hostFirewallRule;

    public ArrayOfHostFirewallRule() {
    }

    public ArrayOfHostFirewallRule(
           com.vmware.converter.HostFirewallRule[] hostFirewallRule) {
           this.hostFirewallRule = hostFirewallRule;
    }


    /**
     * Gets the hostFirewallRule value for this ArrayOfHostFirewallRule.
     * 
     * @return hostFirewallRule
     */
    public com.vmware.converter.HostFirewallRule[] getHostFirewallRule() {
        return hostFirewallRule;
    }


    /**
     * Sets the hostFirewallRule value for this ArrayOfHostFirewallRule.
     * 
     * @param hostFirewallRule
     */
    public void setHostFirewallRule(com.vmware.converter.HostFirewallRule[] hostFirewallRule) {
        this.hostFirewallRule = hostFirewallRule;
    }

    public com.vmware.converter.HostFirewallRule getHostFirewallRule(int i) {
        return this.hostFirewallRule[i];
    }

    public void setHostFirewallRule(int i, com.vmware.converter.HostFirewallRule _value) {
        this.hostFirewallRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostFirewallRule)) return false;
        ArrayOfHostFirewallRule other = (ArrayOfHostFirewallRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostFirewallRule==null && other.getHostFirewallRule()==null) || 
             (this.hostFirewallRule!=null &&
              java.util.Arrays.equals(this.hostFirewallRule, other.getHostFirewallRule())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHostFirewallRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFirewallRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFirewallRule(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostFirewallRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostFirewallRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFirewallRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRule"));
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
