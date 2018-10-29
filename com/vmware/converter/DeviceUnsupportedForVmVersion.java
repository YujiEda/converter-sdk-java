/**
 * DeviceUnsupportedForVmVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DeviceUnsupportedForVmVersion  extends com.vmware.converter.InvalidDeviceSpec  implements java.io.Serializable {
    private java.lang.String currentVersion;

    private java.lang.String expectedVersion;

    public DeviceUnsupportedForVmVersion() {
    }

    public DeviceUnsupportedForVmVersion(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String property,
           int deviceIndex,
           java.lang.String currentVersion,
           java.lang.String expectedVersion) {
        super(
            faultCause,
            faultMessage,
            property,
            deviceIndex);
        this.currentVersion = currentVersion;
        this.expectedVersion = expectedVersion;
    }


    /**
     * Gets the currentVersion value for this DeviceUnsupportedForVmVersion.
     * 
     * @return currentVersion
     */
    public java.lang.String getCurrentVersion() {
        return currentVersion;
    }


    /**
     * Sets the currentVersion value for this DeviceUnsupportedForVmVersion.
     * 
     * @param currentVersion
     */
    public void setCurrentVersion(java.lang.String currentVersion) {
        this.currentVersion = currentVersion;
    }


    /**
     * Gets the expectedVersion value for this DeviceUnsupportedForVmVersion.
     * 
     * @return expectedVersion
     */
    public java.lang.String getExpectedVersion() {
        return expectedVersion;
    }


    /**
     * Sets the expectedVersion value for this DeviceUnsupportedForVmVersion.
     * 
     * @param expectedVersion
     */
    public void setExpectedVersion(java.lang.String expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceUnsupportedForVmVersion)) return false;
        DeviceUnsupportedForVmVersion other = (DeviceUnsupportedForVmVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currentVersion==null && other.getCurrentVersion()==null) || 
             (this.currentVersion!=null &&
              this.currentVersion.equals(other.getCurrentVersion()))) &&
            ((this.expectedVersion==null && other.getExpectedVersion()==null) || 
             (this.expectedVersion!=null &&
              this.expectedVersion.equals(other.getExpectedVersion())));
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
        if (getCurrentVersion() != null) {
            _hashCode += getCurrentVersion().hashCode();
        }
        if (getExpectedVersion() != null) {
            _hashCode += getExpectedVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceUnsupportedForVmVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DeviceUnsupportedForVmVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expectedVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
