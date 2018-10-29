/**
 * DvsIpNetworkRuleQualifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsIpNetworkRuleQualifier  extends com.vmware.converter.DvsNetworkRuleQualifier  implements java.io.Serializable {
    private com.vmware.converter.IpAddress sourceAddress;

    private com.vmware.converter.IpAddress destinationAddress;

    private com.vmware.converter.IntExpression protocol;

    private com.vmware.converter.DvsIpPort sourceIpPort;

    private com.vmware.converter.DvsIpPort destinationIpPort;

    private com.vmware.converter.IntExpression tcpFlags;

    public DvsIpNetworkRuleQualifier() {
    }

    public DvsIpNetworkRuleQualifier(
           java.lang.String key,
           com.vmware.converter.IpAddress sourceAddress,
           com.vmware.converter.IpAddress destinationAddress,
           com.vmware.converter.IntExpression protocol,
           com.vmware.converter.DvsIpPort sourceIpPort,
           com.vmware.converter.DvsIpPort destinationIpPort,
           com.vmware.converter.IntExpression tcpFlags) {
        super(
            key);
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.protocol = protocol;
        this.sourceIpPort = sourceIpPort;
        this.destinationIpPort = destinationIpPort;
        this.tcpFlags = tcpFlags;
    }


    /**
     * Gets the sourceAddress value for this DvsIpNetworkRuleQualifier.
     * 
     * @return sourceAddress
     */
    public com.vmware.converter.IpAddress getSourceAddress() {
        return sourceAddress;
    }


    /**
     * Sets the sourceAddress value for this DvsIpNetworkRuleQualifier.
     * 
     * @param sourceAddress
     */
    public void setSourceAddress(com.vmware.converter.IpAddress sourceAddress) {
        this.sourceAddress = sourceAddress;
    }


    /**
     * Gets the destinationAddress value for this DvsIpNetworkRuleQualifier.
     * 
     * @return destinationAddress
     */
    public com.vmware.converter.IpAddress getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this DvsIpNetworkRuleQualifier.
     * 
     * @param destinationAddress
     */
    public void setDestinationAddress(com.vmware.converter.IpAddress destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the protocol value for this DvsIpNetworkRuleQualifier.
     * 
     * @return protocol
     */
    public com.vmware.converter.IntExpression getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this DvsIpNetworkRuleQualifier.
     * 
     * @param protocol
     */
    public void setProtocol(com.vmware.converter.IntExpression protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the sourceIpPort value for this DvsIpNetworkRuleQualifier.
     * 
     * @return sourceIpPort
     */
    public com.vmware.converter.DvsIpPort getSourceIpPort() {
        return sourceIpPort;
    }


    /**
     * Sets the sourceIpPort value for this DvsIpNetworkRuleQualifier.
     * 
     * @param sourceIpPort
     */
    public void setSourceIpPort(com.vmware.converter.DvsIpPort sourceIpPort) {
        this.sourceIpPort = sourceIpPort;
    }


    /**
     * Gets the destinationIpPort value for this DvsIpNetworkRuleQualifier.
     * 
     * @return destinationIpPort
     */
    public com.vmware.converter.DvsIpPort getDestinationIpPort() {
        return destinationIpPort;
    }


    /**
     * Sets the destinationIpPort value for this DvsIpNetworkRuleQualifier.
     * 
     * @param destinationIpPort
     */
    public void setDestinationIpPort(com.vmware.converter.DvsIpPort destinationIpPort) {
        this.destinationIpPort = destinationIpPort;
    }


    /**
     * Gets the tcpFlags value for this DvsIpNetworkRuleQualifier.
     * 
     * @return tcpFlags
     */
    public com.vmware.converter.IntExpression getTcpFlags() {
        return tcpFlags;
    }


    /**
     * Sets the tcpFlags value for this DvsIpNetworkRuleQualifier.
     * 
     * @param tcpFlags
     */
    public void setTcpFlags(com.vmware.converter.IntExpression tcpFlags) {
        this.tcpFlags = tcpFlags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsIpNetworkRuleQualifier)) return false;
        DvsIpNetworkRuleQualifier other = (DvsIpNetworkRuleQualifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceAddress==null && other.getSourceAddress()==null) || 
             (this.sourceAddress!=null &&
              this.sourceAddress.equals(other.getSourceAddress()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) || 
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.sourceIpPort==null && other.getSourceIpPort()==null) || 
             (this.sourceIpPort!=null &&
              this.sourceIpPort.equals(other.getSourceIpPort()))) &&
            ((this.destinationIpPort==null && other.getDestinationIpPort()==null) || 
             (this.destinationIpPort!=null &&
              this.destinationIpPort.equals(other.getDestinationIpPort()))) &&
            ((this.tcpFlags==null && other.getTcpFlags()==null) || 
             (this.tcpFlags!=null &&
              this.tcpFlags.equals(other.getTcpFlags())));
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
        if (getSourceAddress() != null) {
            _hashCode += getSourceAddress().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getSourceIpPort() != null) {
            _hashCode += getSourceIpPort().hashCode();
        }
        if (getDestinationIpPort() != null) {
            _hashCode += getDestinationIpPort().hashCode();
        }
        if (getTcpFlags() != null) {
            _hashCode += getTcpFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsIpNetworkRuleQualifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsIpNetworkRuleQualifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIpPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceIpPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsIpPort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIpPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destinationIpPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsIpPort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tcpFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntExpression"));
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
