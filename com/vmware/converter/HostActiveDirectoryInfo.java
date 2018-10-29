/**
 * HostActiveDirectoryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostActiveDirectoryInfo  extends com.vmware.converter.HostDirectoryStoreInfo  implements java.io.Serializable {
    private java.lang.String joinedDomain;

    private java.lang.String[] trustedDomain;

    private java.lang.String domainMembershipStatus;

    private java.lang.Boolean smartCardAuthenticationEnabled;

    public HostActiveDirectoryInfo() {
    }

    public HostActiveDirectoryInfo(
           boolean enabled,
           java.lang.String joinedDomain,
           java.lang.String[] trustedDomain,
           java.lang.String domainMembershipStatus,
           java.lang.Boolean smartCardAuthenticationEnabled) {
        super(
            enabled);
        this.joinedDomain = joinedDomain;
        this.trustedDomain = trustedDomain;
        this.domainMembershipStatus = domainMembershipStatus;
        this.smartCardAuthenticationEnabled = smartCardAuthenticationEnabled;
    }


    /**
     * Gets the joinedDomain value for this HostActiveDirectoryInfo.
     * 
     * @return joinedDomain
     */
    public java.lang.String getJoinedDomain() {
        return joinedDomain;
    }


    /**
     * Sets the joinedDomain value for this HostActiveDirectoryInfo.
     * 
     * @param joinedDomain
     */
    public void setJoinedDomain(java.lang.String joinedDomain) {
        this.joinedDomain = joinedDomain;
    }


    /**
     * Gets the trustedDomain value for this HostActiveDirectoryInfo.
     * 
     * @return trustedDomain
     */
    public java.lang.String[] getTrustedDomain() {
        return trustedDomain;
    }


    /**
     * Sets the trustedDomain value for this HostActiveDirectoryInfo.
     * 
     * @param trustedDomain
     */
    public void setTrustedDomain(java.lang.String[] trustedDomain) {
        this.trustedDomain = trustedDomain;
    }

    public java.lang.String getTrustedDomain(int i) {
        return this.trustedDomain[i];
    }

    public void setTrustedDomain(int i, java.lang.String _value) {
        this.trustedDomain[i] = _value;
    }


    /**
     * Gets the domainMembershipStatus value for this HostActiveDirectoryInfo.
     * 
     * @return domainMembershipStatus
     */
    public java.lang.String getDomainMembershipStatus() {
        return domainMembershipStatus;
    }


    /**
     * Sets the domainMembershipStatus value for this HostActiveDirectoryInfo.
     * 
     * @param domainMembershipStatus
     */
    public void setDomainMembershipStatus(java.lang.String domainMembershipStatus) {
        this.domainMembershipStatus = domainMembershipStatus;
    }


    /**
     * Gets the smartCardAuthenticationEnabled value for this HostActiveDirectoryInfo.
     * 
     * @return smartCardAuthenticationEnabled
     */
    public java.lang.Boolean getSmartCardAuthenticationEnabled() {
        return smartCardAuthenticationEnabled;
    }


    /**
     * Sets the smartCardAuthenticationEnabled value for this HostActiveDirectoryInfo.
     * 
     * @param smartCardAuthenticationEnabled
     */
    public void setSmartCardAuthenticationEnabled(java.lang.Boolean smartCardAuthenticationEnabled) {
        this.smartCardAuthenticationEnabled = smartCardAuthenticationEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostActiveDirectoryInfo)) return false;
        HostActiveDirectoryInfo other = (HostActiveDirectoryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.joinedDomain==null && other.getJoinedDomain()==null) || 
             (this.joinedDomain!=null &&
              this.joinedDomain.equals(other.getJoinedDomain()))) &&
            ((this.trustedDomain==null && other.getTrustedDomain()==null) || 
             (this.trustedDomain!=null &&
              java.util.Arrays.equals(this.trustedDomain, other.getTrustedDomain()))) &&
            ((this.domainMembershipStatus==null && other.getDomainMembershipStatus()==null) || 
             (this.domainMembershipStatus!=null &&
              this.domainMembershipStatus.equals(other.getDomainMembershipStatus()))) &&
            ((this.smartCardAuthenticationEnabled==null && other.getSmartCardAuthenticationEnabled()==null) || 
             (this.smartCardAuthenticationEnabled!=null &&
              this.smartCardAuthenticationEnabled.equals(other.getSmartCardAuthenticationEnabled())));
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
        if (getJoinedDomain() != null) {
            _hashCode += getJoinedDomain().hashCode();
        }
        if (getTrustedDomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedDomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedDomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomainMembershipStatus() != null) {
            _hashCode += getDomainMembershipStatus().hashCode();
        }
        if (getSmartCardAuthenticationEnabled() != null) {
            _hashCode += getSmartCardAuthenticationEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostActiveDirectoryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostActiveDirectoryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("joinedDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "joinedDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "trustedDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainMembershipStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "domainMembershipStatus"));
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
