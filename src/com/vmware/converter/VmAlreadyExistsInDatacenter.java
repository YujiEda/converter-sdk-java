/**
 * VmAlreadyExistsInDatacenter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmAlreadyExistsInDatacenter  extends com.vmware.converter.InvalidFolder  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private java.lang.String hostname;

    private com.vmware.converter.ManagedObjectReference[] vm;

    public VmAlreadyExistsInDatacenter() {
    }

    public VmAlreadyExistsInDatacenter(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference target,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String hostname,
           com.vmware.converter.ManagedObjectReference[] vm) {
        super(
            faultCause,
            faultMessage,
            target);
        this.host = host;
        this.hostname = hostname;
        this.vm = vm;
    }


    /**
     * Gets the host value for this VmAlreadyExistsInDatacenter.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this VmAlreadyExistsInDatacenter.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the hostname value for this VmAlreadyExistsInDatacenter.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this VmAlreadyExistsInDatacenter.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the vm value for this VmAlreadyExistsInDatacenter.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference[] getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this VmAlreadyExistsInDatacenter.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference[] vm) {
        this.vm = vm;
    }

    public com.vmware.converter.ManagedObjectReference getVm(int i) {
        return this.vm[i];
    }

    public void setVm(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.vm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmAlreadyExistsInDatacenter)) return false;
        VmAlreadyExistsInDatacenter other = (VmAlreadyExistsInDatacenter) obj;
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
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              java.util.Arrays.equals(this.vm, other.getVm())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmAlreadyExistsInDatacenter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmAlreadyExistsInDatacenter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
