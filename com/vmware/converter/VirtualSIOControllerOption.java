/**
 * VirtualSIOControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualSIOControllerOption  extends com.vmware.converter.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.converter.IntOption numFloppyDrives;

    private com.vmware.converter.IntOption numSerialPorts;

    private com.vmware.converter.IntOption numParallelPorts;

    public VirtualSIOControllerOption() {
    }

    public VirtualSIOControllerOption(
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
           com.vmware.converter.IntOption numFloppyDrives,
           com.vmware.converter.IntOption numSerialPorts,
           com.vmware.converter.IntOption numParallelPorts) {
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
        this.numFloppyDrives = numFloppyDrives;
        this.numSerialPorts = numSerialPorts;
        this.numParallelPorts = numParallelPorts;
    }


    /**
     * Gets the numFloppyDrives value for this VirtualSIOControllerOption.
     * 
     * @return numFloppyDrives
     */
    public com.vmware.converter.IntOption getNumFloppyDrives() {
        return numFloppyDrives;
    }


    /**
     * Sets the numFloppyDrives value for this VirtualSIOControllerOption.
     * 
     * @param numFloppyDrives
     */
    public void setNumFloppyDrives(com.vmware.converter.IntOption numFloppyDrives) {
        this.numFloppyDrives = numFloppyDrives;
    }


    /**
     * Gets the numSerialPorts value for this VirtualSIOControllerOption.
     * 
     * @return numSerialPorts
     */
    public com.vmware.converter.IntOption getNumSerialPorts() {
        return numSerialPorts;
    }


    /**
     * Sets the numSerialPorts value for this VirtualSIOControllerOption.
     * 
     * @param numSerialPorts
     */
    public void setNumSerialPorts(com.vmware.converter.IntOption numSerialPorts) {
        this.numSerialPorts = numSerialPorts;
    }


    /**
     * Gets the numParallelPorts value for this VirtualSIOControllerOption.
     * 
     * @return numParallelPorts
     */
    public com.vmware.converter.IntOption getNumParallelPorts() {
        return numParallelPorts;
    }


    /**
     * Sets the numParallelPorts value for this VirtualSIOControllerOption.
     * 
     * @param numParallelPorts
     */
    public void setNumParallelPorts(com.vmware.converter.IntOption numParallelPorts) {
        this.numParallelPorts = numParallelPorts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSIOControllerOption)) return false;
        VirtualSIOControllerOption other = (VirtualSIOControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numFloppyDrives==null && other.getNumFloppyDrives()==null) || 
             (this.numFloppyDrives!=null &&
              this.numFloppyDrives.equals(other.getNumFloppyDrives()))) &&
            ((this.numSerialPorts==null && other.getNumSerialPorts()==null) || 
             (this.numSerialPorts!=null &&
              this.numSerialPorts.equals(other.getNumSerialPorts()))) &&
            ((this.numParallelPorts==null && other.getNumParallelPorts()==null) || 
             (this.numParallelPorts!=null &&
              this.numParallelPorts.equals(other.getNumParallelPorts())));
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
        if (getNumFloppyDrives() != null) {
            _hashCode += getNumFloppyDrives().hashCode();
        }
        if (getNumSerialPorts() != null) {
            _hashCode += getNumSerialPorts().hashCode();
        }
        if (getNumParallelPorts() != null) {
            _hashCode += getNumParallelPorts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSIOControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSIOControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFloppyDrives");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numFloppyDrives"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSerialPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSerialPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParallelPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numParallelPorts"));
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
