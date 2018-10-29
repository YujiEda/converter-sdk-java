/**
 * DistributedVirtualSwitchManagerDvsProductSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchManagerDvsProductSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualSwitchProductSpec newSwitchProductSpec;

    private com.vmware.converter.ManagedObjectReference distributedVirtualSwitch;

    public DistributedVirtualSwitchManagerDvsProductSpec() {
    }

    public DistributedVirtualSwitchManagerDvsProductSpec(
           com.vmware.converter.DistributedVirtualSwitchProductSpec newSwitchProductSpec,
           com.vmware.converter.ManagedObjectReference distributedVirtualSwitch) {
        this.newSwitchProductSpec = newSwitchProductSpec;
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }


    /**
     * Gets the newSwitchProductSpec value for this DistributedVirtualSwitchManagerDvsProductSpec.
     * 
     * @return newSwitchProductSpec
     */
    public com.vmware.converter.DistributedVirtualSwitchProductSpec getNewSwitchProductSpec() {
        return newSwitchProductSpec;
    }


    /**
     * Sets the newSwitchProductSpec value for this DistributedVirtualSwitchManagerDvsProductSpec.
     * 
     * @param newSwitchProductSpec
     */
    public void setNewSwitchProductSpec(com.vmware.converter.DistributedVirtualSwitchProductSpec newSwitchProductSpec) {
        this.newSwitchProductSpec = newSwitchProductSpec;
    }


    /**
     * Gets the distributedVirtualSwitch value for this DistributedVirtualSwitchManagerDvsProductSpec.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.converter.ManagedObjectReference getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this DistributedVirtualSwitchManagerDvsProductSpec.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.converter.ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchManagerDvsProductSpec)) return false;
        DistributedVirtualSwitchManagerDvsProductSpec other = (DistributedVirtualSwitchManagerDvsProductSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newSwitchProductSpec==null && other.getNewSwitchProductSpec()==null) || 
             (this.newSwitchProductSpec!=null &&
              this.newSwitchProductSpec.equals(other.getNewSwitchProductSpec()))) &&
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              this.distributedVirtualSwitch.equals(other.getDistributedVirtualSwitch())));
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
        if (getNewSwitchProductSpec() != null) {
            _hashCode += getNewSwitchProductSpec().hashCode();
        }
        if (getDistributedVirtualSwitch() != null) {
            _hashCode += getDistributedVirtualSwitch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchManagerDvsProductSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerDvsProductSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSwitchProductSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newSwitchProductSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
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
