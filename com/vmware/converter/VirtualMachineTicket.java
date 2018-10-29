/**
 * VirtualMachineTicket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineTicket  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ticket;

    private java.lang.String cfgFile;

    private java.lang.String host;

    private java.lang.Integer port;

    private java.lang.String sslThumbprint;

    public VirtualMachineTicket() {
    }

    public VirtualMachineTicket(
           java.lang.String ticket,
           java.lang.String cfgFile,
           java.lang.String host,
           java.lang.Integer port,
           java.lang.String sslThumbprint) {
        this.ticket = ticket;
        this.cfgFile = cfgFile;
        this.host = host;
        this.port = port;
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the ticket value for this VirtualMachineTicket.
     * 
     * @return ticket
     */
    public java.lang.String getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this VirtualMachineTicket.
     * 
     * @param ticket
     */
    public void setTicket(java.lang.String ticket) {
        this.ticket = ticket;
    }


    /**
     * Gets the cfgFile value for this VirtualMachineTicket.
     * 
     * @return cfgFile
     */
    public java.lang.String getCfgFile() {
        return cfgFile;
    }


    /**
     * Sets the cfgFile value for this VirtualMachineTicket.
     * 
     * @param cfgFile
     */
    public void setCfgFile(java.lang.String cfgFile) {
        this.cfgFile = cfgFile;
    }


    /**
     * Gets the host value for this VirtualMachineTicket.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this VirtualMachineTicket.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the port value for this VirtualMachineTicket.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this VirtualMachineTicket.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the sslThumbprint value for this VirtualMachineTicket.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this VirtualMachineTicket.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineTicket)) return false;
        VirtualMachineTicket other = (VirtualMachineTicket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ticket==null && other.getTicket()==null) || 
             (this.ticket!=null &&
              this.ticket.equals(other.getTicket()))) &&
            ((this.cfgFile==null && other.getCfgFile()==null) || 
             (this.cfgFile!=null &&
              this.cfgFile.equals(other.getCfgFile()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.sslThumbprint==null && other.getSslThumbprint()==null) || 
             (this.sslThumbprint!=null &&
              this.sslThumbprint.equals(other.getSslThumbprint())));
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
        if (getTicket() != null) {
            _hashCode += getTicket().hashCode();
        }
        if (getCfgFile() != null) {
            _hashCode += getCfgFile().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getSslThumbprint() != null) {
            _hashCode += getSslThumbprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineTicket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineTicket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfgFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cfgFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprint"));
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
