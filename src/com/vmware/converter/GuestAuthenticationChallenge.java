/**
 * GuestAuthenticationChallenge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestAuthenticationChallenge  extends com.vmware.converter.GuestOperationsFault  implements java.io.Serializable {
    private com.vmware.converter.GuestAuthentication serverChallenge;

    private long sessionID;

    public GuestAuthenticationChallenge() {
    }

    public GuestAuthenticationChallenge(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.GuestAuthentication serverChallenge,
           long sessionID) {
        super(
            faultCause,
            faultMessage);
        this.serverChallenge = serverChallenge;
        this.sessionID = sessionID;
    }


    /**
     * Gets the serverChallenge value for this GuestAuthenticationChallenge.
     * 
     * @return serverChallenge
     */
    public com.vmware.converter.GuestAuthentication getServerChallenge() {
        return serverChallenge;
    }


    /**
     * Sets the serverChallenge value for this GuestAuthenticationChallenge.
     * 
     * @param serverChallenge
     */
    public void setServerChallenge(com.vmware.converter.GuestAuthentication serverChallenge) {
        this.serverChallenge = serverChallenge;
    }


    /**
     * Gets the sessionID value for this GuestAuthenticationChallenge.
     * 
     * @return sessionID
     */
    public long getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GuestAuthenticationChallenge.
     * 
     * @param sessionID
     */
    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestAuthenticationChallenge)) return false;
        GuestAuthenticationChallenge other = (GuestAuthenticationChallenge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serverChallenge==null && other.getServerChallenge()==null) || 
             (this.serverChallenge!=null &&
              this.serverChallenge.equals(other.getServerChallenge()))) &&
            this.sessionID == other.getSessionID();
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
        if (getServerChallenge() != null) {
            _hashCode += getServerChallenge().hashCode();
        }
        _hashCode += new Long(getSessionID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestAuthenticationChallenge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAuthenticationChallenge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serverChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAuthentication"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
