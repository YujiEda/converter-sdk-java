/**
 * ThirdPartyLicenseAssignmentFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ThirdPartyLicenseAssignmentFailed  extends com.vmware.converter.RuntimeFault  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String module;

    private java.lang.String reason;

    public ThirdPartyLicenseAssignmentFailed() {
    }

    public ThirdPartyLicenseAssignmentFailed(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String module,
           java.lang.String reason) {
        super(
            faultCause,
            faultMessage);
        this.host = host;
        this.module = module;
        this.reason = reason;
    }


    /**
     * Gets the host value for this ThirdPartyLicenseAssignmentFailed.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ThirdPartyLicenseAssignmentFailed.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the module value for this ThirdPartyLicenseAssignmentFailed.
     * 
     * @return module
     */
    public java.lang.String getModule() {
        return module;
    }


    /**
     * Sets the module value for this ThirdPartyLicenseAssignmentFailed.
     * 
     * @param module
     */
    public void setModule(java.lang.String module) {
        this.module = module;
    }


    /**
     * Gets the reason value for this ThirdPartyLicenseAssignmentFailed.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ThirdPartyLicenseAssignmentFailed.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyLicenseAssignmentFailed)) return false;
        ThirdPartyLicenseAssignmentFailed other = (ThirdPartyLicenseAssignmentFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyLicenseAssignmentFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ThirdPartyLicenseAssignmentFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
