/**
 * HostCertificateManagerCertificateInfoCertificateStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostCertificateManagerCertificateInfoCertificateStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostCertificateManagerCertificateInfoCertificateStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _unknown = "unknown";
    public static final java.lang.String _expired = "expired";
    public static final java.lang.String _expiring = "expiring";
    public static final java.lang.String _expiringShortly = "expiringShortly";
    public static final java.lang.String _expirationImminent = "expirationImminent";
    public static final java.lang.String _good = "good";
    public static final HostCertificateManagerCertificateInfoCertificateStatus unknown = new HostCertificateManagerCertificateInfoCertificateStatus(_unknown);
    public static final HostCertificateManagerCertificateInfoCertificateStatus expired = new HostCertificateManagerCertificateInfoCertificateStatus(_expired);
    public static final HostCertificateManagerCertificateInfoCertificateStatus expiring = new HostCertificateManagerCertificateInfoCertificateStatus(_expiring);
    public static final HostCertificateManagerCertificateInfoCertificateStatus expiringShortly = new HostCertificateManagerCertificateInfoCertificateStatus(_expiringShortly);
    public static final HostCertificateManagerCertificateInfoCertificateStatus expirationImminent = new HostCertificateManagerCertificateInfoCertificateStatus(_expirationImminent);
    public static final HostCertificateManagerCertificateInfoCertificateStatus good = new HostCertificateManagerCertificateInfoCertificateStatus(_good);
    public java.lang.String getValue() { return _value_;}
    public static HostCertificateManagerCertificateInfoCertificateStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostCertificateManagerCertificateInfoCertificateStatus enumeration = (HostCertificateManagerCertificateInfoCertificateStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostCertificateManagerCertificateInfoCertificateStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCertificateManagerCertificateInfoCertificateStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCertificateManagerCertificateInfoCertificateStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
