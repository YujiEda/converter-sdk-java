/**
 * HostDiskConfigurationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostDiskConfigurationResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String devicePath;

    private java.lang.Boolean success;

    private com.vmware.converter.LocalizedMethodFault fault;

    public HostDiskConfigurationResult() {
    }

    public HostDiskConfigurationResult(
           java.lang.String devicePath,
           java.lang.Boolean success,
           com.vmware.converter.LocalizedMethodFault fault) {
        this.devicePath = devicePath;
        this.success = success;
        this.fault = fault;
    }


    /**
     * Gets the devicePath value for this HostDiskConfigurationResult.
     * 
     * @return devicePath
     */
    public java.lang.String getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this HostDiskConfigurationResult.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String devicePath) {
        this.devicePath = devicePath;
    }


    /**
     * Gets the success value for this HostDiskConfigurationResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this HostDiskConfigurationResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the fault value for this HostDiskConfigurationResult.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this HostDiskConfigurationResult.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiskConfigurationResult)) return false;
        HostDiskConfigurationResult other = (HostDiskConfigurationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              this.devicePath.equals(other.getDevicePath()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
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
        if (getDevicePath() != null) {
            _hashCode += getDevicePath().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiskConfigurationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskConfigurationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
