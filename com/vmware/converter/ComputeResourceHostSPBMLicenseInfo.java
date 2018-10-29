/**
 * ComputeResourceHostSPBMLicenseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ComputeResourceHostSPBMLicenseInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState licenseState;

    public ComputeResourceHostSPBMLicenseInfo() {
    }

    public ComputeResourceHostSPBMLicenseInfo(
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState licenseState) {
        this.host = host;
        this.licenseState = licenseState;
    }


    /**
     * Gets the host value for this ComputeResourceHostSPBMLicenseInfo.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ComputeResourceHostSPBMLicenseInfo.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the licenseState value for this ComputeResourceHostSPBMLicenseInfo.
     * 
     * @return licenseState
     */
    public com.vmware.converter.ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState getLicenseState() {
        return licenseState;
    }


    /**
     * Sets the licenseState value for this ComputeResourceHostSPBMLicenseInfo.
     * 
     * @param licenseState
     */
    public void setLicenseState(com.vmware.converter.ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState licenseState) {
        this.licenseState = licenseState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComputeResourceHostSPBMLicenseInfo)) return false;
        ComputeResourceHostSPBMLicenseInfo other = (ComputeResourceHostSPBMLicenseInfo) obj;
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
            ((this.licenseState==null && other.getLicenseState()==null) || 
             (this.licenseState!=null &&
              this.licenseState.equals(other.getLicenseState())));
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
        if (getLicenseState() != null) {
            _hashCode += getLicenseState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComputeResourceHostSPBMLicenseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeResourceHostSPBMLicenseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "licenseState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState"));
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
