/**
 * HostNtpConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNtpConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] server;

    private java.lang.String[] configFile;

    public HostNtpConfig() {
    }

    public HostNtpConfig(
           java.lang.String[] server,
           java.lang.String[] configFile) {
        this.server = server;
        this.configFile = configFile;
    }


    /**
     * Gets the server value for this HostNtpConfig.
     * 
     * @return server
     */
    public java.lang.String[] getServer() {
        return server;
    }


    /**
     * Sets the server value for this HostNtpConfig.
     * 
     * @param server
     */
    public void setServer(java.lang.String[] server) {
        this.server = server;
    }

    public java.lang.String getServer(int i) {
        return this.server[i];
    }

    public void setServer(int i, java.lang.String _value) {
        this.server[i] = _value;
    }


    /**
     * Gets the configFile value for this HostNtpConfig.
     * 
     * @return configFile
     */
    public java.lang.String[] getConfigFile() {
        return configFile;
    }


    /**
     * Sets the configFile value for this HostNtpConfig.
     * 
     * @param configFile
     */
    public void setConfigFile(java.lang.String[] configFile) {
        this.configFile = configFile;
    }

    public java.lang.String getConfigFile(int i) {
        return this.configFile[i];
    }

    public void setConfigFile(int i, java.lang.String _value) {
        this.configFile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNtpConfig)) return false;
        HostNtpConfig other = (HostNtpConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              java.util.Arrays.equals(this.server, other.getServer()))) &&
            ((this.configFile==null && other.getConfigFile()==null) || 
             (this.configFile!=null &&
              java.util.Arrays.equals(this.configFile, other.getConfigFile())));
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
        if (getServer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigFile(), i);
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
        new org.apache.axis.description.TypeDesc(HostNtpConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNtpConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configFile"));
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
