/**
 * HostFirewallRulesetIpList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFirewallRulesetIpList  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] ipAddress;

    private com.vmware.converter.HostFirewallRulesetIpNetwork[] ipNetwork;

    private boolean allIp;

    public HostFirewallRulesetIpList() {
    }

    public HostFirewallRulesetIpList(
           java.lang.String[] ipAddress,
           com.vmware.converter.HostFirewallRulesetIpNetwork[] ipNetwork,
           boolean allIp) {
        this.ipAddress = ipAddress;
        this.ipNetwork = ipNetwork;
        this.allIp = allIp;
    }


    /**
     * Gets the ipAddress value for this HostFirewallRulesetIpList.
     * 
     * @return ipAddress
     */
    public java.lang.String[] getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this HostFirewallRulesetIpList.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public java.lang.String getIpAddress(int i) {
        return this.ipAddress[i];
    }

    public void setIpAddress(int i, java.lang.String _value) {
        this.ipAddress[i] = _value;
    }


    /**
     * Gets the ipNetwork value for this HostFirewallRulesetIpList.
     * 
     * @return ipNetwork
     */
    public com.vmware.converter.HostFirewallRulesetIpNetwork[] getIpNetwork() {
        return ipNetwork;
    }


    /**
     * Sets the ipNetwork value for this HostFirewallRulesetIpList.
     * 
     * @param ipNetwork
     */
    public void setIpNetwork(com.vmware.converter.HostFirewallRulesetIpNetwork[] ipNetwork) {
        this.ipNetwork = ipNetwork;
    }

    public com.vmware.converter.HostFirewallRulesetIpNetwork getIpNetwork(int i) {
        return this.ipNetwork[i];
    }

    public void setIpNetwork(int i, com.vmware.converter.HostFirewallRulesetIpNetwork _value) {
        this.ipNetwork[i] = _value;
    }


    /**
     * Gets the allIp value for this HostFirewallRulesetIpList.
     * 
     * @return allIp
     */
    public boolean isAllIp() {
        return allIp;
    }


    /**
     * Sets the allIp value for this HostFirewallRulesetIpList.
     * 
     * @param allIp
     */
    public void setAllIp(boolean allIp) {
        this.allIp = allIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallRulesetIpList)) return false;
        HostFirewallRulesetIpList other = (HostFirewallRulesetIpList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              java.util.Arrays.equals(this.ipAddress, other.getIpAddress()))) &&
            ((this.ipNetwork==null && other.getIpNetwork()==null) || 
             (this.ipNetwork!=null &&
              java.util.Arrays.equals(this.ipNetwork, other.getIpNetwork()))) &&
            this.allIp == other.isAllIp();
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
        if (getIpAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isAllIp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFirewallRulesetIpList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRulesetIpList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRulesetIpNetwork"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
