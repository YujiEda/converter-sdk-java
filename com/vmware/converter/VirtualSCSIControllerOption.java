/**
 * VirtualSCSIControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualSCSIControllerOption  extends com.vmware.converter.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.converter.IntOption numSCSIDisks;

    private com.vmware.converter.IntOption numSCSICdroms;

    private com.vmware.converter.IntOption numSCSIPassthrough;

    private com.vmware.converter.VirtualSCSISharing[] sharing;

    private int defaultSharedIndex;

    private com.vmware.converter.BoolOption hotAddRemove;

    private int scsiCtlrUnitNumber;

    public VirtualSCSIControllerOption() {
    }

    public VirtualSCSIControllerOption(
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
           com.vmware.converter.IntOption numSCSIDisks,
           com.vmware.converter.IntOption numSCSICdroms,
           com.vmware.converter.IntOption numSCSIPassthrough,
           com.vmware.converter.VirtualSCSISharing[] sharing,
           int defaultSharedIndex,
           com.vmware.converter.BoolOption hotAddRemove,
           int scsiCtlrUnitNumber) {
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
        this.numSCSIDisks = numSCSIDisks;
        this.numSCSICdroms = numSCSICdroms;
        this.numSCSIPassthrough = numSCSIPassthrough;
        this.sharing = sharing;
        this.defaultSharedIndex = defaultSharedIndex;
        this.hotAddRemove = hotAddRemove;
        this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
    }


    /**
     * Gets the numSCSIDisks value for this VirtualSCSIControllerOption.
     * 
     * @return numSCSIDisks
     */
    public com.vmware.converter.IntOption getNumSCSIDisks() {
        return numSCSIDisks;
    }


    /**
     * Sets the numSCSIDisks value for this VirtualSCSIControllerOption.
     * 
     * @param numSCSIDisks
     */
    public void setNumSCSIDisks(com.vmware.converter.IntOption numSCSIDisks) {
        this.numSCSIDisks = numSCSIDisks;
    }


    /**
     * Gets the numSCSICdroms value for this VirtualSCSIControllerOption.
     * 
     * @return numSCSICdroms
     */
    public com.vmware.converter.IntOption getNumSCSICdroms() {
        return numSCSICdroms;
    }


    /**
     * Sets the numSCSICdroms value for this VirtualSCSIControllerOption.
     * 
     * @param numSCSICdroms
     */
    public void setNumSCSICdroms(com.vmware.converter.IntOption numSCSICdroms) {
        this.numSCSICdroms = numSCSICdroms;
    }


    /**
     * Gets the numSCSIPassthrough value for this VirtualSCSIControllerOption.
     * 
     * @return numSCSIPassthrough
     */
    public com.vmware.converter.IntOption getNumSCSIPassthrough() {
        return numSCSIPassthrough;
    }


    /**
     * Sets the numSCSIPassthrough value for this VirtualSCSIControllerOption.
     * 
     * @param numSCSIPassthrough
     */
    public void setNumSCSIPassthrough(com.vmware.converter.IntOption numSCSIPassthrough) {
        this.numSCSIPassthrough = numSCSIPassthrough;
    }


    /**
     * Gets the sharing value for this VirtualSCSIControllerOption.
     * 
     * @return sharing
     */
    public com.vmware.converter.VirtualSCSISharing[] getSharing() {
        return sharing;
    }


    /**
     * Sets the sharing value for this VirtualSCSIControllerOption.
     * 
     * @param sharing
     */
    public void setSharing(com.vmware.converter.VirtualSCSISharing[] sharing) {
        this.sharing = sharing;
    }

    public com.vmware.converter.VirtualSCSISharing getSharing(int i) {
        return this.sharing[i];
    }

    public void setSharing(int i, com.vmware.converter.VirtualSCSISharing _value) {
        this.sharing[i] = _value;
    }


    /**
     * Gets the defaultSharedIndex value for this VirtualSCSIControllerOption.
     * 
     * @return defaultSharedIndex
     */
    public int getDefaultSharedIndex() {
        return defaultSharedIndex;
    }


    /**
     * Sets the defaultSharedIndex value for this VirtualSCSIControllerOption.
     * 
     * @param defaultSharedIndex
     */
    public void setDefaultSharedIndex(int defaultSharedIndex) {
        this.defaultSharedIndex = defaultSharedIndex;
    }


    /**
     * Gets the hotAddRemove value for this VirtualSCSIControllerOption.
     * 
     * @return hotAddRemove
     */
    public com.vmware.converter.BoolOption getHotAddRemove() {
        return hotAddRemove;
    }


    /**
     * Sets the hotAddRemove value for this VirtualSCSIControllerOption.
     * 
     * @param hotAddRemove
     */
    public void setHotAddRemove(com.vmware.converter.BoolOption hotAddRemove) {
        this.hotAddRemove = hotAddRemove;
    }


    /**
     * Gets the scsiCtlrUnitNumber value for this VirtualSCSIControllerOption.
     * 
     * @return scsiCtlrUnitNumber
     */
    public int getScsiCtlrUnitNumber() {
        return scsiCtlrUnitNumber;
    }


    /**
     * Sets the scsiCtlrUnitNumber value for this VirtualSCSIControllerOption.
     * 
     * @param scsiCtlrUnitNumber
     */
    public void setScsiCtlrUnitNumber(int scsiCtlrUnitNumber) {
        this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSCSIControllerOption)) return false;
        VirtualSCSIControllerOption other = (VirtualSCSIControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numSCSIDisks==null && other.getNumSCSIDisks()==null) || 
             (this.numSCSIDisks!=null &&
              this.numSCSIDisks.equals(other.getNumSCSIDisks()))) &&
            ((this.numSCSICdroms==null && other.getNumSCSICdroms()==null) || 
             (this.numSCSICdroms!=null &&
              this.numSCSICdroms.equals(other.getNumSCSICdroms()))) &&
            ((this.numSCSIPassthrough==null && other.getNumSCSIPassthrough()==null) || 
             (this.numSCSIPassthrough!=null &&
              this.numSCSIPassthrough.equals(other.getNumSCSIPassthrough()))) &&
            ((this.sharing==null && other.getSharing()==null) || 
             (this.sharing!=null &&
              java.util.Arrays.equals(this.sharing, other.getSharing()))) &&
            this.defaultSharedIndex == other.getDefaultSharedIndex() &&
            ((this.hotAddRemove==null && other.getHotAddRemove()==null) || 
             (this.hotAddRemove!=null &&
              this.hotAddRemove.equals(other.getHotAddRemove()))) &&
            this.scsiCtlrUnitNumber == other.getScsiCtlrUnitNumber();
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
        if (getNumSCSIDisks() != null) {
            _hashCode += getNumSCSIDisks().hashCode();
        }
        if (getNumSCSICdroms() != null) {
            _hashCode += getNumSCSICdroms().hashCode();
        }
        if (getNumSCSIPassthrough() != null) {
            _hashCode += getNumSCSIPassthrough().hashCode();
        }
        if (getSharing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDefaultSharedIndex();
        if (getHotAddRemove() != null) {
            _hashCode += getHotAddRemove().hashCode();
        }
        _hashCode += getScsiCtlrUnitNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSCSIControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSCSIControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSCSIDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSCSIDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSCSICdroms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSCSICdroms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSCSIPassthrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSCSIPassthrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSCSISharing"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSharedIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultSharedIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotAddRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hotAddRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiCtlrUnitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiCtlrUnitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
