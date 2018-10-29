/**
 * HbrManagerVmReplicationCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HbrManagerVmReplicationCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private java.lang.String supportedQuiesceMode;

    private boolean compressionSupported;

    private long maxSupportedSourceDiskCapacity;

    private java.lang.Long minRpo;

    private com.vmware.converter.LocalizedMethodFault fault;

    public HbrManagerVmReplicationCapability() {
    }

    public HbrManagerVmReplicationCapability(
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.String supportedQuiesceMode,
           boolean compressionSupported,
           long maxSupportedSourceDiskCapacity,
           java.lang.Long minRpo,
           com.vmware.converter.LocalizedMethodFault fault) {
        this.vm = vm;
        this.supportedQuiesceMode = supportedQuiesceMode;
        this.compressionSupported = compressionSupported;
        this.maxSupportedSourceDiskCapacity = maxSupportedSourceDiskCapacity;
        this.minRpo = minRpo;
        this.fault = fault;
    }


    /**
     * Gets the vm value for this HbrManagerVmReplicationCapability.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this HbrManagerVmReplicationCapability.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the supportedQuiesceMode value for this HbrManagerVmReplicationCapability.
     * 
     * @return supportedQuiesceMode
     */
    public java.lang.String getSupportedQuiesceMode() {
        return supportedQuiesceMode;
    }


    /**
     * Sets the supportedQuiesceMode value for this HbrManagerVmReplicationCapability.
     * 
     * @param supportedQuiesceMode
     */
    public void setSupportedQuiesceMode(java.lang.String supportedQuiesceMode) {
        this.supportedQuiesceMode = supportedQuiesceMode;
    }


    /**
     * Gets the compressionSupported value for this HbrManagerVmReplicationCapability.
     * 
     * @return compressionSupported
     */
    public boolean isCompressionSupported() {
        return compressionSupported;
    }


    /**
     * Sets the compressionSupported value for this HbrManagerVmReplicationCapability.
     * 
     * @param compressionSupported
     */
    public void setCompressionSupported(boolean compressionSupported) {
        this.compressionSupported = compressionSupported;
    }


    /**
     * Gets the maxSupportedSourceDiskCapacity value for this HbrManagerVmReplicationCapability.
     * 
     * @return maxSupportedSourceDiskCapacity
     */
    public long getMaxSupportedSourceDiskCapacity() {
        return maxSupportedSourceDiskCapacity;
    }


    /**
     * Sets the maxSupportedSourceDiskCapacity value for this HbrManagerVmReplicationCapability.
     * 
     * @param maxSupportedSourceDiskCapacity
     */
    public void setMaxSupportedSourceDiskCapacity(long maxSupportedSourceDiskCapacity) {
        this.maxSupportedSourceDiskCapacity = maxSupportedSourceDiskCapacity;
    }


    /**
     * Gets the minRpo value for this HbrManagerVmReplicationCapability.
     * 
     * @return minRpo
     */
    public java.lang.Long getMinRpo() {
        return minRpo;
    }


    /**
     * Sets the minRpo value for this HbrManagerVmReplicationCapability.
     * 
     * @param minRpo
     */
    public void setMinRpo(java.lang.Long minRpo) {
        this.minRpo = minRpo;
    }


    /**
     * Gets the fault value for this HbrManagerVmReplicationCapability.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this HbrManagerVmReplicationCapability.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HbrManagerVmReplicationCapability)) return false;
        HbrManagerVmReplicationCapability other = (HbrManagerVmReplicationCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.supportedQuiesceMode==null && other.getSupportedQuiesceMode()==null) || 
             (this.supportedQuiesceMode!=null &&
              this.supportedQuiesceMode.equals(other.getSupportedQuiesceMode()))) &&
            this.compressionSupported == other.isCompressionSupported() &&
            this.maxSupportedSourceDiskCapacity == other.getMaxSupportedSourceDiskCapacity() &&
            ((this.minRpo==null && other.getMinRpo()==null) || 
             (this.minRpo!=null &&
              this.minRpo.equals(other.getMinRpo()))) &&
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getSupportedQuiesceMode() != null) {
            _hashCode += getSupportedQuiesceMode().hashCode();
        }
        _hashCode += (isCompressionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getMaxSupportedSourceDiskCapacity()).hashCode();
        if (getMinRpo() != null) {
            _hashCode += getMinRpo().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HbrManagerVmReplicationCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HbrManagerVmReplicationCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedQuiesceMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedQuiesceMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "compressionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedSourceDiskCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedSourceDiskCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minRpo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "minRpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
