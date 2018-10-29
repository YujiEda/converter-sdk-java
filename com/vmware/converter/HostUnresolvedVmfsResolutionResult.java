/**
 * HostUnresolvedVmfsResolutionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostUnresolvedVmfsResolutionResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostUnresolvedVmfsResolutionSpec spec;

    private com.vmware.converter.HostVmfsVolume vmfs;

    private com.vmware.converter.LocalizedMethodFault fault;

    public HostUnresolvedVmfsResolutionResult() {
    }

    public HostUnresolvedVmfsResolutionResult(
           com.vmware.converter.HostUnresolvedVmfsResolutionSpec spec,
           com.vmware.converter.HostVmfsVolume vmfs,
           com.vmware.converter.LocalizedMethodFault fault) {
        this.spec = spec;
        this.vmfs = vmfs;
        this.fault = fault;
    }


    /**
     * Gets the spec value for this HostUnresolvedVmfsResolutionResult.
     * 
     * @return spec
     */
    public com.vmware.converter.HostUnresolvedVmfsResolutionSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostUnresolvedVmfsResolutionResult.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.HostUnresolvedVmfsResolutionSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the vmfs value for this HostUnresolvedVmfsResolutionResult.
     * 
     * @return vmfs
     */
    public com.vmware.converter.HostVmfsVolume getVmfs() {
        return vmfs;
    }


    /**
     * Sets the vmfs value for this HostUnresolvedVmfsResolutionResult.
     * 
     * @param vmfs
     */
    public void setVmfs(com.vmware.converter.HostVmfsVolume vmfs) {
        this.vmfs = vmfs;
    }


    /**
     * Gets the fault value for this HostUnresolvedVmfsResolutionResult.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this HostUnresolvedVmfsResolutionResult.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostUnresolvedVmfsResolutionResult)) return false;
        HostUnresolvedVmfsResolutionResult other = (HostUnresolvedVmfsResolutionResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
            ((this.vmfs==null && other.getVmfs()==null) || 
             (this.vmfs!=null &&
              this.vmfs.equals(other.getVmfs()))) &&
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
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        if (getVmfs() != null) {
            _hashCode += getVmfs().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostUnresolvedVmfsResolutionResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsResolutionResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsResolutionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVmfsVolume"));
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
