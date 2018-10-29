/**
 * HostFirewallRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFirewallRule  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int port;

    private java.lang.Integer endPort;

    private com.vmware.converter.HostFirewallRuleDirection direction;

    private com.vmware.converter.HostFirewallRulePortType portType;

    private java.lang.String protocol;

    public HostFirewallRule() {
    }

    public HostFirewallRule(
           int port,
           java.lang.Integer endPort,
           com.vmware.converter.HostFirewallRuleDirection direction,
           com.vmware.converter.HostFirewallRulePortType portType,
           java.lang.String protocol) {
        this.port = port;
        this.endPort = endPort;
        this.direction = direction;
        this.portType = portType;
        this.protocol = protocol;
    }


    /**
     * Gets the port value for this HostFirewallRule.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this HostFirewallRule.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the endPort value for this HostFirewallRule.
     * 
     * @return endPort
     */
    public java.lang.Integer getEndPort() {
        return endPort;
    }


    /**
     * Sets the endPort value for this HostFirewallRule.
     * 
     * @param endPort
     */
    public void setEndPort(java.lang.Integer endPort) {
        this.endPort = endPort;
    }


    /**
     * Gets the direction value for this HostFirewallRule.
     * 
     * @return direction
     */
    public com.vmware.converter.HostFirewallRuleDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this HostFirewallRule.
     * 
     * @param direction
     */
    public void setDirection(com.vmware.converter.HostFirewallRuleDirection direction) {
        this.direction = direction;
    }


    /**
     * Gets the portType value for this HostFirewallRule.
     * 
     * @return portType
     */
    public com.vmware.converter.HostFirewallRulePortType getPortType() {
        return portType;
    }


    /**
     * Sets the portType value for this HostFirewallRule.
     * 
     * @param portType
     */
    public void setPortType(com.vmware.converter.HostFirewallRulePortType portType) {
        this.portType = portType;
    }


    /**
     * Gets the protocol value for this HostFirewallRule.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this HostFirewallRule.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallRule)) return false;
        HostFirewallRule other = (HostFirewallRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.port == other.getPort() &&
            ((this.endPort==null && other.getEndPort()==null) || 
             (this.endPort!=null &&
              this.endPort.equals(other.getEndPort()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.portType==null && other.getPortType()==null) || 
             (this.portType!=null &&
              this.portType.equals(other.getPortType()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol())));
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
        _hashCode += getPort();
        if (getEndPort() != null) {
            _hashCode += getEndPort().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getPortType() != null) {
            _hashCode += getPortType().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFirewallRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "endPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRuleDirection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallRulePortType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
