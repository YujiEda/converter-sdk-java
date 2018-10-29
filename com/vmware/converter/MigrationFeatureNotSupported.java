/**
 * MigrationFeatureNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class MigrationFeatureNotSupported  extends com.vmware.converter.MigrationFault  implements java.io.Serializable {
    private boolean atSourceHost;

    private java.lang.String failedHostName;

    private com.vmware.converter.ManagedObjectReference failedHost;

    public MigrationFeatureNotSupported() {
    }

    public MigrationFeatureNotSupported(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           boolean atSourceHost,
           java.lang.String failedHostName,
           com.vmware.converter.ManagedObjectReference failedHost) {
        super(
            faultCause,
            faultMessage);
        this.atSourceHost = atSourceHost;
        this.failedHostName = failedHostName;
        this.failedHost = failedHost;
    }


    /**
     * Gets the atSourceHost value for this MigrationFeatureNotSupported.
     * 
     * @return atSourceHost
     */
    public boolean isAtSourceHost() {
        return atSourceHost;
    }


    /**
     * Sets the atSourceHost value for this MigrationFeatureNotSupported.
     * 
     * @param atSourceHost
     */
    public void setAtSourceHost(boolean atSourceHost) {
        this.atSourceHost = atSourceHost;
    }


    /**
     * Gets the failedHostName value for this MigrationFeatureNotSupported.
     * 
     * @return failedHostName
     */
    public java.lang.String getFailedHostName() {
        return failedHostName;
    }


    /**
     * Sets the failedHostName value for this MigrationFeatureNotSupported.
     * 
     * @param failedHostName
     */
    public void setFailedHostName(java.lang.String failedHostName) {
        this.failedHostName = failedHostName;
    }


    /**
     * Gets the failedHost value for this MigrationFeatureNotSupported.
     * 
     * @return failedHost
     */
    public com.vmware.converter.ManagedObjectReference getFailedHost() {
        return failedHost;
    }


    /**
     * Sets the failedHost value for this MigrationFeatureNotSupported.
     * 
     * @param failedHost
     */
    public void setFailedHost(com.vmware.converter.ManagedObjectReference failedHost) {
        this.failedHost = failedHost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MigrationFeatureNotSupported)) return false;
        MigrationFeatureNotSupported other = (MigrationFeatureNotSupported) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.atSourceHost == other.isAtSourceHost() &&
            ((this.failedHostName==null && other.getFailedHostName()==null) || 
             (this.failedHostName!=null &&
              this.failedHostName.equals(other.getFailedHostName()))) &&
            ((this.failedHost==null && other.getFailedHost()==null) || 
             (this.failedHost!=null &&
              this.failedHost.equals(other.getFailedHost())));
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
        _hashCode += (isAtSourceHost() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFailedHostName() != null) {
            _hashCode += getFailedHostName().hashCode();
        }
        if (getFailedHost() != null) {
            _hashCode += getFailedHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MigrationFeatureNotSupported.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MigrationFeatureNotSupported"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atSourceHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "atSourceHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failedHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failedHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
