/**
 * ConverterAgentInternalManagedVmSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalManagedVmSpec  extends com.vmware.converter.ConverterAgentInternalVmSpec  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalLoginCredentials login;

    private com.vmware.converter.ManagedObjectReference vm;

    public ConverterAgentInternalManagedVmSpec() {
    }

    public ConverterAgentInternalManagedVmSpec(
           java.lang.String snapshotId,
           com.vmware.converter.ConverterAgentInternalLoginCredentials login,
           com.vmware.converter.ManagedObjectReference vm) {
        super(
            snapshotId);
        this.login = login;
        this.vm = vm;
    }


    /**
     * Gets the login value for this ConverterAgentInternalManagedVmSpec.
     * 
     * @return login
     */
    public com.vmware.converter.ConverterAgentInternalLoginCredentials getLogin() {
        return login;
    }


    /**
     * Sets the login value for this ConverterAgentInternalManagedVmSpec.
     * 
     * @param login
     */
    public void setLogin(com.vmware.converter.ConverterAgentInternalLoginCredentials login) {
        this.login = login;
    }


    /**
     * Gets the vm value for this ConverterAgentInternalManagedVmSpec.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this ConverterAgentInternalManagedVmSpec.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalManagedVmSpec)) return false;
        ConverterAgentInternalManagedVmSpec other = (ConverterAgentInternalManagedVmSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm())));
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalManagedVmSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalManagedVmSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalLoginCredentials"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
