/**
 * VirtualMachineImportSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineImportSpec  extends com.vmware.converter.ImportSpec  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineConfigSpec configSpec;

    private com.vmware.converter.ManagedObjectReference resPoolEntity;

    public VirtualMachineImportSpec() {
    }

    public VirtualMachineImportSpec(
           com.vmware.converter.VAppEntityConfigInfo entityConfig,
           com.vmware.converter.OvfConsumerOstNode instantiationOst,
           com.vmware.converter.VirtualMachineConfigSpec configSpec,
           com.vmware.converter.ManagedObjectReference resPoolEntity) {
        super(
            entityConfig,
            instantiationOst);
        this.configSpec = configSpec;
        this.resPoolEntity = resPoolEntity;
    }


    /**
     * Gets the configSpec value for this VirtualMachineImportSpec.
     * 
     * @return configSpec
     */
    public com.vmware.converter.VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }


    /**
     * Sets the configSpec value for this VirtualMachineImportSpec.
     * 
     * @param configSpec
     */
    public void setConfigSpec(com.vmware.converter.VirtualMachineConfigSpec configSpec) {
        this.configSpec = configSpec;
    }


    /**
     * Gets the resPoolEntity value for this VirtualMachineImportSpec.
     * 
     * @return resPoolEntity
     */
    public com.vmware.converter.ManagedObjectReference getResPoolEntity() {
        return resPoolEntity;
    }


    /**
     * Sets the resPoolEntity value for this VirtualMachineImportSpec.
     * 
     * @param resPoolEntity
     */
    public void setResPoolEntity(com.vmware.converter.ManagedObjectReference resPoolEntity) {
        this.resPoolEntity = resPoolEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineImportSpec)) return false;
        VirtualMachineImportSpec other = (VirtualMachineImportSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configSpec==null && other.getConfigSpec()==null) || 
             (this.configSpec!=null &&
              this.configSpec.equals(other.getConfigSpec()))) &&
            ((this.resPoolEntity==null && other.getResPoolEntity()==null) || 
             (this.resPoolEntity!=null &&
              this.resPoolEntity.equals(other.getResPoolEntity())));
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
        if (getConfigSpec() != null) {
            _hashCode += getConfigSpec().hashCode();
        }
        if (getResPoolEntity() != null) {
            _hashCode += getResPoolEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineImportSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineImportSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resPoolEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resPoolEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
