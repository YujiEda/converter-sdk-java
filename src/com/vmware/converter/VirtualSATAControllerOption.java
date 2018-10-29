/**
 * VirtualSATAControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualSATAControllerOption  extends com.vmware.converter.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.converter.IntOption numSATADisks;

    private com.vmware.converter.IntOption numSATACdroms;

    public VirtualSATAControllerOption() {
    }

    public VirtualSATAControllerOption(
           java.lang.String type,
           com.vmware.converter.VirtualDeviceConnectOption connectOption,
           com.vmware.converter.VirtualDeviceBusSlotOption busSlotOption,
           java.lang.String controllerType,
           com.vmware.converter.BoolOption autoAssignController,
           com.vmware.converter.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           java.lang.Boolean hotRemoveSupported,
           com.vmware.converter.IntOption devices,
           java.lang.String[] supportedDevice,
           com.vmware.converter.IntOption numSATADisks,
           com.vmware.converter.IntOption numSATACdroms) {
        super(
            type,
            connectOption,
            busSlotOption,
            controllerType,
            autoAssignController,
            backingOption,
            defaultBackingOptionIndex,
            licensingLimit,
            deprecated,
            plugAndPlay,
            hotRemoveSupported,
            devices,
            supportedDevice);
        this.numSATADisks = numSATADisks;
        this.numSATACdroms = numSATACdroms;
    }


    /**
     * Gets the numSATADisks value for this VirtualSATAControllerOption.
     * 
     * @return numSATADisks
     */
    public com.vmware.converter.IntOption getNumSATADisks() {
        return numSATADisks;
    }


    /**
     * Sets the numSATADisks value for this VirtualSATAControllerOption.
     * 
     * @param numSATADisks
     */
    public void setNumSATADisks(com.vmware.converter.IntOption numSATADisks) {
        this.numSATADisks = numSATADisks;
    }


    /**
     * Gets the numSATACdroms value for this VirtualSATAControllerOption.
     * 
     * @return numSATACdroms
     */
    public com.vmware.converter.IntOption getNumSATACdroms() {
        return numSATACdroms;
    }


    /**
     * Sets the numSATACdroms value for this VirtualSATAControllerOption.
     * 
     * @param numSATACdroms
     */
    public void setNumSATACdroms(com.vmware.converter.IntOption numSATACdroms) {
        this.numSATACdroms = numSATACdroms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSATAControllerOption)) return false;
        VirtualSATAControllerOption other = (VirtualSATAControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numSATADisks==null && other.getNumSATADisks()==null) || 
             (this.numSATADisks!=null &&
              this.numSATADisks.equals(other.getNumSATADisks()))) &&
            ((this.numSATACdroms==null && other.getNumSATACdroms()==null) || 
             (this.numSATACdroms!=null &&
              this.numSATACdroms.equals(other.getNumSATACdroms())));
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
        if (getNumSATADisks() != null) {
            _hashCode += getNumSATADisks().hashCode();
        }
        if (getNumSATACdroms() != null) {
            _hashCode += getNumSATACdroms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSATAControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSATAControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSATADisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSATADisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSATACdroms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSATACdroms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
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
