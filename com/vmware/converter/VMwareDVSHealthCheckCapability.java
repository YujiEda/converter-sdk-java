/**
 * VMwareDVSHealthCheckCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSHealthCheckCapability  extends com.vmware.converter.DVSHealthCheckCapability  implements java.io.Serializable {
    private boolean vlanMtuSupported;

    private boolean teamingSupported;

    public VMwareDVSHealthCheckCapability() {
    }

    public VMwareDVSHealthCheckCapability(
           boolean vlanMtuSupported,
           boolean teamingSupported) {
        this.vlanMtuSupported = vlanMtuSupported;
        this.teamingSupported = teamingSupported;
    }


    /**
     * Gets the vlanMtuSupported value for this VMwareDVSHealthCheckCapability.
     * 
     * @return vlanMtuSupported
     */
    public boolean isVlanMtuSupported() {
        return vlanMtuSupported;
    }


    /**
     * Sets the vlanMtuSupported value for this VMwareDVSHealthCheckCapability.
     * 
     * @param vlanMtuSupported
     */
    public void setVlanMtuSupported(boolean vlanMtuSupported) {
        this.vlanMtuSupported = vlanMtuSupported;
    }


    /**
     * Gets the teamingSupported value for this VMwareDVSHealthCheckCapability.
     * 
     * @return teamingSupported
     */
    public boolean isTeamingSupported() {
        return teamingSupported;
    }


    /**
     * Sets the teamingSupported value for this VMwareDVSHealthCheckCapability.
     * 
     * @param teamingSupported
     */
    public void setTeamingSupported(boolean teamingSupported) {
        this.teamingSupported = teamingSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSHealthCheckCapability)) return false;
        VMwareDVSHealthCheckCapability other = (VMwareDVSHealthCheckCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.vlanMtuSupported == other.isVlanMtuSupported() &&
            this.teamingSupported == other.isTeamingSupported();
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
        _hashCode += (isVlanMtuSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTeamingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDVSHealthCheckCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSHealthCheckCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanMtuSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanMtuSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "teamingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
