/**
 * NotSupportedDeviceForFT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NotSupportedDeviceForFT  extends com.vmware.converter.VmFaultToleranceIssue  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String hostName;

    private com.vmware.converter.ManagedObjectReference vm;

    private java.lang.String vmName;

    private java.lang.String deviceType;

    private java.lang.String deviceLabel;

    public NotSupportedDeviceForFT() {
    }

    public NotSupportedDeviceForFT(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String hostName,
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.String vmName,
           java.lang.String deviceType,
           java.lang.String deviceLabel) {
        super(
            faultCause,
            faultMessage);
        this.host = host;
        this.hostName = hostName;
        this.vm = vm;
        this.vmName = vmName;
        this.deviceType = deviceType;
        this.deviceLabel = deviceLabel;
    }


    /**
     * Gets the host value for this NotSupportedDeviceForFT.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this NotSupportedDeviceForFT.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the hostName value for this NotSupportedDeviceForFT.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this NotSupportedDeviceForFT.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the vm value for this NotSupportedDeviceForFT.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this NotSupportedDeviceForFT.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the vmName value for this NotSupportedDeviceForFT.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this NotSupportedDeviceForFT.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the deviceType value for this NotSupportedDeviceForFT.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this NotSupportedDeviceForFT.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the deviceLabel value for this NotSupportedDeviceForFT.
     * 
     * @return deviceLabel
     */
    public java.lang.String getDeviceLabel() {
        return deviceLabel;
    }


    /**
     * Sets the deviceLabel value for this NotSupportedDeviceForFT.
     * 
     * @param deviceLabel
     */
    public void setDeviceLabel(java.lang.String deviceLabel) {
        this.deviceLabel = deviceLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotSupportedDeviceForFT)) return false;
        NotSupportedDeviceForFT other = (NotSupportedDeviceForFT) obj;
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
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.deviceLabel==null && other.getDeviceLabel()==null) || 
             (this.deviceLabel!=null &&
              this.deviceLabel.equals(other.getDeviceLabel())));
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getDeviceLabel() != null) {
            _hashCode += getDeviceLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotSupportedDeviceForFT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NotSupportedDeviceForFT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceLabel"));
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

}
