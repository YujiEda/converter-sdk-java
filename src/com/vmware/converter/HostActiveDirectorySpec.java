/**
 * HostActiveDirectorySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostActiveDirectorySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String domainName;

    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.String camServer;

    private java.lang.String thumbprint;

    private java.lang.Boolean smartCardAuthenticationEnabled;

    private java.lang.String[] smartCardTrustAnchors;

    public HostActiveDirectorySpec() {
    }

    public HostActiveDirectorySpec(
           java.lang.String domainName,
           java.lang.String userName,
           java.lang.String password,
           java.lang.String camServer,
           java.lang.String thumbprint,
           java.lang.Boolean smartCardAuthenticationEnabled,
           java.lang.String[] smartCardTrustAnchors) {
        this.domainName = domainName;
        this.userName = userName;
        this.password = password;
        this.camServer = camServer;
        this.thumbprint = thumbprint;
        this.smartCardAuthenticationEnabled = smartCardAuthenticationEnabled;
        this.smartCardTrustAnchors = smartCardTrustAnchors;
    }


    /**
     * Gets the domainName value for this HostActiveDirectorySpec.
     * 
     * @return domainName
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this HostActiveDirectorySpec.
     * 
     * @param domainName
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the userName value for this HostActiveDirectorySpec.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this HostActiveDirectorySpec.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this HostActiveDirectorySpec.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this HostActiveDirectorySpec.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the camServer value for this HostActiveDirectorySpec.
     * 
     * @return camServer
     */
    public java.lang.String getCamServer() {
        return camServer;
    }


    /**
     * Sets the camServer value for this HostActiveDirectorySpec.
     * 
     * @param camServer
     */
    public void setCamServer(java.lang.String camServer) {
        this.camServer = camServer;
    }


    /**
     * Gets the thumbprint value for this HostActiveDirectorySpec.
     * 
     * @return thumbprint
     */
    public java.lang.String getThumbprint() {
        return thumbprint;
    }


    /**
     * Sets the thumbprint value for this HostActiveDirectorySpec.
     * 
     * @param thumbprint
     */
    public void setThumbprint(java.lang.String thumbprint) {
        this.thumbprint = thumbprint;
    }


    /**
     * Gets the smartCardAuthenticationEnabled value for this HostActiveDirectorySpec.
     * 
     * @return smartCardAuthenticationEnabled
     */
    public java.lang.Boolean getSmartCardAuthenticationEnabled() {
        return smartCardAuthenticationEnabled;
    }


    /**
     * Sets the smartCardAuthenticationEnabled value for this HostActiveDirectorySpec.
     * 
     * @param smartCardAuthenticationEnabled
     */
    public void setSmartCardAuthenticationEnabled(java.lang.Boolean smartCardAuthenticationEnabled) {
        this.smartCardAuthenticationEnabled = smartCardAuthenticationEnabled;
    }


    /**
     * Gets the smartCardTrustAnchors value for this HostActiveDirectorySpec.
     * 
     * @return smartCardTrustAnchors
     */
    public java.lang.String[] getSmartCardTrustAnchors() {
        return smartCardTrustAnchors;
    }


    /**
     * Sets the smartCardTrustAnchors value for this HostActiveDirectorySpec.
     * 
     * @param smartCardTrustAnchors
     */
    public void setSmartCardTrustAnchors(java.lang.String[] smartCardTrustAnchors) {
        this.smartCardTrustAnchors = smartCardTrustAnchors;
    }

    public java.lang.String getSmartCardTrustAnchors(int i) {
        return this.smartCardTrustAnchors[i];
    }

    public void setSmartCardTrustAnchors(int i, java.lang.String _value) {
        this.smartCardTrustAnchors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostActiveDirectorySpec)) return false;
        HostActiveDirectorySpec other = (HostActiveDirectorySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.camServer==null && other.getCamServer()==null) || 
             (this.camServer!=null &&
              this.camServer.equals(other.getCamServer()))) &&
            ((this.thumbprint==null && other.getThumbprint()==null) || 
             (this.thumbprint!=null &&
              this.thumbprint.equals(other.getThumbprint()))) &&
            ((this.smartCardAuthenticationEnabled==null && other.getSmartCardAuthenticationEnabled()==null) || 
             (this.smartCardAuthenticationEnabled!=null &&
              this.smartCardAuthenticationEnabled.equals(other.getSmartCardAuthenticationEnabled()))) &&
            ((this.smartCardTrustAnchors==null && other.getSmartCardTrustAnchors()==null) || 
             (this.smartCardTrustAnchors!=null &&
              java.util.Arrays.equals(this.smartCardTrustAnchors, other.getSmartCardTrustAnchors())));
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
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCamServer() != null) {
            _hashCode += getCamServer().hashCode();
        }
        if (getThumbprint() != null) {
            _hashCode += getThumbprint().hashCode();
        }
        if (getSmartCardAuthenticationEnabled() != null) {
            _hashCode += getSmartCardAuthenticationEnabled().hashCode();
        }
        if (getSmartCardTrustAnchors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCardTrustAnchors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCardTrustAnchors(), i);
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
        new org.apache.axis.description.TypeDesc(HostActiveDirectorySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostActiveDirectorySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "camServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCardAuthenticationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smartCardAuthenticationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCardTrustAnchors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smartCardTrustAnchors"));
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
