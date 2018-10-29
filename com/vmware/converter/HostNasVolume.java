/**
 * HostNasVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNasVolume  extends com.vmware.converter.HostFileSystemVolume  implements java.io.Serializable {
    private java.lang.String remoteHost;

    private java.lang.String remotePath;

    private java.lang.String userName;

    private java.lang.String[] remoteHostNames;

    private java.lang.String securityType;

    private java.lang.Boolean protocolEndpoint;

    public HostNasVolume() {
    }

    public HostNasVolume(
           java.lang.String type,
           java.lang.String name,
           long capacity,
           java.lang.String remoteHost,
           java.lang.String remotePath,
           java.lang.String userName,
           java.lang.String[] remoteHostNames,
           java.lang.String securityType,
           java.lang.Boolean protocolEndpoint) {
        super(
            type,
            name,
            capacity);
        this.remoteHost = remoteHost;
        this.remotePath = remotePath;
        this.userName = userName;
        this.remoteHostNames = remoteHostNames;
        this.securityType = securityType;
        this.protocolEndpoint = protocolEndpoint;
    }


    /**
     * Gets the remoteHost value for this HostNasVolume.
     * 
     * @return remoteHost
     */
    public java.lang.String getRemoteHost() {
        return remoteHost;
    }


    /**
     * Sets the remoteHost value for this HostNasVolume.
     * 
     * @param remoteHost
     */
    public void setRemoteHost(java.lang.String remoteHost) {
        this.remoteHost = remoteHost;
    }


    /**
     * Gets the remotePath value for this HostNasVolume.
     * 
     * @return remotePath
     */
    public java.lang.String getRemotePath() {
        return remotePath;
    }


    /**
     * Sets the remotePath value for this HostNasVolume.
     * 
     * @param remotePath
     */
    public void setRemotePath(java.lang.String remotePath) {
        this.remotePath = remotePath;
    }


    /**
     * Gets the userName value for this HostNasVolume.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this HostNasVolume.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the remoteHostNames value for this HostNasVolume.
     * 
     * @return remoteHostNames
     */
    public java.lang.String[] getRemoteHostNames() {
        return remoteHostNames;
    }


    /**
     * Sets the remoteHostNames value for this HostNasVolume.
     * 
     * @param remoteHostNames
     */
    public void setRemoteHostNames(java.lang.String[] remoteHostNames) {
        this.remoteHostNames = remoteHostNames;
    }

    public java.lang.String getRemoteHostNames(int i) {
        return this.remoteHostNames[i];
    }

    public void setRemoteHostNames(int i, java.lang.String _value) {
        this.remoteHostNames[i] = _value;
    }


    /**
     * Gets the securityType value for this HostNasVolume.
     * 
     * @return securityType
     */
    public java.lang.String getSecurityType() {
        return securityType;
    }


    /**
     * Sets the securityType value for this HostNasVolume.
     * 
     * @param securityType
     */
    public void setSecurityType(java.lang.String securityType) {
        this.securityType = securityType;
    }


    /**
     * Gets the protocolEndpoint value for this HostNasVolume.
     * 
     * @return protocolEndpoint
     */
    public java.lang.Boolean getProtocolEndpoint() {
        return protocolEndpoint;
    }


    /**
     * Sets the protocolEndpoint value for this HostNasVolume.
     * 
     * @param protocolEndpoint
     */
    public void setProtocolEndpoint(java.lang.Boolean protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNasVolume)) return false;
        HostNasVolume other = (HostNasVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.remoteHost==null && other.getRemoteHost()==null) || 
             (this.remoteHost!=null &&
              this.remoteHost.equals(other.getRemoteHost()))) &&
            ((this.remotePath==null && other.getRemotePath()==null) || 
             (this.remotePath!=null &&
              this.remotePath.equals(other.getRemotePath()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.remoteHostNames==null && other.getRemoteHostNames()==null) || 
             (this.remoteHostNames!=null &&
              java.util.Arrays.equals(this.remoteHostNames, other.getRemoteHostNames()))) &&
            ((this.securityType==null && other.getSecurityType()==null) || 
             (this.securityType!=null &&
              this.securityType.equals(other.getSecurityType()))) &&
            ((this.protocolEndpoint==null && other.getProtocolEndpoint()==null) || 
             (this.protocolEndpoint!=null &&
              this.protocolEndpoint.equals(other.getProtocolEndpoint())));
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
        if (getRemoteHost() != null) {
            _hashCode += getRemoteHost().hashCode();
        }
        if (getRemotePath() != null) {
            _hashCode += getRemotePath().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getRemoteHostNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoteHostNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoteHostNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurityType() != null) {
            _hashCode += getSecurityType().hashCode();
        }
        if (getProtocolEndpoint() != null) {
            _hashCode += getProtocolEndpoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNasVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNasVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "remoteHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remotePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "remotePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteHostNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "remoteHostNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "securityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocolEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
