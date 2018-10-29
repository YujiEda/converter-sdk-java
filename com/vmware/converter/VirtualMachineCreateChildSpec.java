/**
 * VirtualMachineCreateChildSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineCreateChildSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineRelocateSpec location;

    private boolean persistent;

    private com.vmware.converter.OptionValue[] configParams;

    public VirtualMachineCreateChildSpec() {
    }

    public VirtualMachineCreateChildSpec(
           com.vmware.converter.VirtualMachineRelocateSpec location,
           boolean persistent,
           com.vmware.converter.OptionValue[] configParams) {
        this.location = location;
        this.persistent = persistent;
        this.configParams = configParams;
    }


    /**
     * Gets the location value for this VirtualMachineCreateChildSpec.
     * 
     * @return location
     */
    public com.vmware.converter.VirtualMachineRelocateSpec getLocation() {
        return location;
    }


    /**
     * Sets the location value for this VirtualMachineCreateChildSpec.
     * 
     * @param location
     */
    public void setLocation(com.vmware.converter.VirtualMachineRelocateSpec location) {
        this.location = location;
    }


    /**
     * Gets the persistent value for this VirtualMachineCreateChildSpec.
     * 
     * @return persistent
     */
    public boolean isPersistent() {
        return persistent;
    }


    /**
     * Sets the persistent value for this VirtualMachineCreateChildSpec.
     * 
     * @param persistent
     */
    public void setPersistent(boolean persistent) {
        this.persistent = persistent;
    }


    /**
     * Gets the configParams value for this VirtualMachineCreateChildSpec.
     * 
     * @return configParams
     */
    public com.vmware.converter.OptionValue[] getConfigParams() {
        return configParams;
    }


    /**
     * Sets the configParams value for this VirtualMachineCreateChildSpec.
     * 
     * @param configParams
     */
    public void setConfigParams(com.vmware.converter.OptionValue[] configParams) {
        this.configParams = configParams;
    }

    public com.vmware.converter.OptionValue getConfigParams(int i) {
        return this.configParams[i];
    }

    public void setConfigParams(int i, com.vmware.converter.OptionValue _value) {
        this.configParams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineCreateChildSpec)) return false;
        VirtualMachineCreateChildSpec other = (VirtualMachineCreateChildSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            this.persistent == other.isPersistent() &&
            ((this.configParams==null && other.getConfigParams()==null) || 
             (this.configParams!=null &&
              java.util.Arrays.equals(this.configParams, other.getConfigParams())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        _hashCode += (isPersistent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConfigParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigParams(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineCreateChildSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCreateChildSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "persistent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionValue"));
        elemField.setMinOccurs(0);
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
