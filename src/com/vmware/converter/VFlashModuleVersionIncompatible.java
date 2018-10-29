/**
 * VFlashModuleVersionIncompatible.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VFlashModuleVersionIncompatible  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private java.lang.String moduleName;

    private java.lang.String vmRequestModuleVersion;

    private java.lang.String hostMinSupportedVerson;

    private java.lang.String hostModuleVersion;

    public VFlashModuleVersionIncompatible() {
    }

    public VFlashModuleVersionIncompatible(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String moduleName,
           java.lang.String vmRequestModuleVersion,
           java.lang.String hostMinSupportedVerson,
           java.lang.String hostModuleVersion) {
        super(
            faultCause,
            faultMessage);
        this.moduleName = moduleName;
        this.vmRequestModuleVersion = vmRequestModuleVersion;
        this.hostMinSupportedVerson = hostMinSupportedVerson;
        this.hostModuleVersion = hostModuleVersion;
    }


    /**
     * Gets the moduleName value for this VFlashModuleVersionIncompatible.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this VFlashModuleVersionIncompatible.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the vmRequestModuleVersion value for this VFlashModuleVersionIncompatible.
     * 
     * @return vmRequestModuleVersion
     */
    public java.lang.String getVmRequestModuleVersion() {
        return vmRequestModuleVersion;
    }


    /**
     * Sets the vmRequestModuleVersion value for this VFlashModuleVersionIncompatible.
     * 
     * @param vmRequestModuleVersion
     */
    public void setVmRequestModuleVersion(java.lang.String vmRequestModuleVersion) {
        this.vmRequestModuleVersion = vmRequestModuleVersion;
    }


    /**
     * Gets the hostMinSupportedVerson value for this VFlashModuleVersionIncompatible.
     * 
     * @return hostMinSupportedVerson
     */
    public java.lang.String getHostMinSupportedVerson() {
        return hostMinSupportedVerson;
    }


    /**
     * Sets the hostMinSupportedVerson value for this VFlashModuleVersionIncompatible.
     * 
     * @param hostMinSupportedVerson
     */
    public void setHostMinSupportedVerson(java.lang.String hostMinSupportedVerson) {
        this.hostMinSupportedVerson = hostMinSupportedVerson;
    }


    /**
     * Gets the hostModuleVersion value for this VFlashModuleVersionIncompatible.
     * 
     * @return hostModuleVersion
     */
    public java.lang.String getHostModuleVersion() {
        return hostModuleVersion;
    }


    /**
     * Sets the hostModuleVersion value for this VFlashModuleVersionIncompatible.
     * 
     * @param hostModuleVersion
     */
    public void setHostModuleVersion(java.lang.String hostModuleVersion) {
        this.hostModuleVersion = hostModuleVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VFlashModuleVersionIncompatible)) return false;
        VFlashModuleVersionIncompatible other = (VFlashModuleVersionIncompatible) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.vmRequestModuleVersion==null && other.getVmRequestModuleVersion()==null) || 
             (this.vmRequestModuleVersion!=null &&
              this.vmRequestModuleVersion.equals(other.getVmRequestModuleVersion()))) &&
            ((this.hostMinSupportedVerson==null && other.getHostMinSupportedVerson()==null) || 
             (this.hostMinSupportedVerson!=null &&
              this.hostMinSupportedVerson.equals(other.getHostMinSupportedVerson()))) &&
            ((this.hostModuleVersion==null && other.getHostModuleVersion()==null) || 
             (this.hostModuleVersion!=null &&
              this.hostModuleVersion.equals(other.getHostModuleVersion())));
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
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getVmRequestModuleVersion() != null) {
            _hashCode += getVmRequestModuleVersion().hashCode();
        }
        if (getHostMinSupportedVerson() != null) {
            _hashCode += getHostMinSupportedVerson().hashCode();
        }
        if (getHostModuleVersion() != null) {
            _hashCode += getHostModuleVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VFlashModuleVersionIncompatible.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VFlashModuleVersionIncompatible"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmRequestModuleVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmRequestModuleVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMinSupportedVerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostMinSupportedVerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostModuleVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostModuleVersion"));
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
