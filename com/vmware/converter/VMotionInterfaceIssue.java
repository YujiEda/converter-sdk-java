/**
 * VMotionInterfaceIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMotionInterfaceIssue  extends com.vmware.converter.MigrationFault  implements java.io.Serializable {
    private boolean atSourceHost;

    private java.lang.String failedHost;

    private com.vmware.converter.ManagedObjectReference failedHostEntity;

    public VMotionInterfaceIssue() {
    }

    public VMotionInterfaceIssue(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           boolean atSourceHost,
           java.lang.String failedHost,
           com.vmware.converter.ManagedObjectReference failedHostEntity) {
        super(
            faultCause,
            faultMessage);
        this.atSourceHost = atSourceHost;
        this.failedHost = failedHost;
        this.failedHostEntity = failedHostEntity;
    }


    /**
     * Gets the atSourceHost value for this VMotionInterfaceIssue.
     * 
     * @return atSourceHost
     */
    public boolean isAtSourceHost() {
        return atSourceHost;
    }


    /**
     * Sets the atSourceHost value for this VMotionInterfaceIssue.
     * 
     * @param atSourceHost
     */
    public void setAtSourceHost(boolean atSourceHost) {
        this.atSourceHost = atSourceHost;
    }


    /**
     * Gets the failedHost value for this VMotionInterfaceIssue.
     * 
     * @return failedHost
     */
    public java.lang.String getFailedHost() {
        return failedHost;
    }


    /**
     * Sets the failedHost value for this VMotionInterfaceIssue.
     * 
     * @param failedHost
     */
    public void setFailedHost(java.lang.String failedHost) {
        this.failedHost = failedHost;
    }


    /**
     * Gets the failedHostEntity value for this VMotionInterfaceIssue.
     * 
     * @return failedHostEntity
     */
    public com.vmware.converter.ManagedObjectReference getFailedHostEntity() {
        return failedHostEntity;
    }


    /**
     * Sets the failedHostEntity value for this VMotionInterfaceIssue.
     * 
     * @param failedHostEntity
     */
    public void setFailedHostEntity(com.vmware.converter.ManagedObjectReference failedHostEntity) {
        this.failedHostEntity = failedHostEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMotionInterfaceIssue)) return false;
        VMotionInterfaceIssue other = (VMotionInterfaceIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.atSourceHost == other.isAtSourceHost() &&
            ((this.failedHost==null && other.getFailedHost()==null) || 
             (this.failedHost!=null &&
              this.failedHost.equals(other.getFailedHost()))) &&
            ((this.failedHostEntity==null && other.getFailedHostEntity()==null) || 
             (this.failedHostEntity!=null &&
              this.failedHostEntity.equals(other.getFailedHostEntity())));
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
        if (getFailedHost() != null) {
            _hashCode += getFailedHost().hashCode();
        }
        if (getFailedHostEntity() != null) {
            _hashCode += getFailedHostEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMotionInterfaceIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMotionInterfaceIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atSourceHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "atSourceHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failedHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedHostEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failedHostEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
