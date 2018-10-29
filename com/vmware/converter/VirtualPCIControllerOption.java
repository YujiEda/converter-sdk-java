/**
 * VirtualPCIControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualPCIControllerOption  extends com.vmware.converter.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.converter.IntOption numSCSIControllers;

    private com.vmware.converter.IntOption numEthernetCards;

    private com.vmware.converter.IntOption numVideoCards;

    private com.vmware.converter.IntOption numSoundCards;

    private com.vmware.converter.IntOption numVmiRoms;

    private com.vmware.converter.IntOption numVmciDevices;

    private com.vmware.converter.IntOption numPCIPassthroughDevices;

    private com.vmware.converter.IntOption numSasSCSIControllers;

    private com.vmware.converter.IntOption numVmxnet3EthernetCards;

    private com.vmware.converter.IntOption numParaVirtualSCSIControllers;

    private com.vmware.converter.IntOption numSATAControllers;

    public VirtualPCIControllerOption() {
    }

    public VirtualPCIControllerOption(
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
           com.vmware.converter.IntOption numSCSIControllers,
           com.vmware.converter.IntOption numEthernetCards,
           com.vmware.converter.IntOption numVideoCards,
           com.vmware.converter.IntOption numSoundCards,
           com.vmware.converter.IntOption numVmiRoms,
           com.vmware.converter.IntOption numVmciDevices,
           com.vmware.converter.IntOption numPCIPassthroughDevices,
           com.vmware.converter.IntOption numSasSCSIControllers,
           com.vmware.converter.IntOption numVmxnet3EthernetCards,
           com.vmware.converter.IntOption numParaVirtualSCSIControllers,
           com.vmware.converter.IntOption numSATAControllers) {
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
        this.numSCSIControllers = numSCSIControllers;
        this.numEthernetCards = numEthernetCards;
        this.numVideoCards = numVideoCards;
        this.numSoundCards = numSoundCards;
        this.numVmiRoms = numVmiRoms;
        this.numVmciDevices = numVmciDevices;
        this.numPCIPassthroughDevices = numPCIPassthroughDevices;
        this.numSasSCSIControllers = numSasSCSIControllers;
        this.numVmxnet3EthernetCards = numVmxnet3EthernetCards;
        this.numParaVirtualSCSIControllers = numParaVirtualSCSIControllers;
        this.numSATAControllers = numSATAControllers;
    }


    /**
     * Gets the numSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @return numSCSIControllers
     */
    public com.vmware.converter.IntOption getNumSCSIControllers() {
        return numSCSIControllers;
    }


    /**
     * Sets the numSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @param numSCSIControllers
     */
    public void setNumSCSIControllers(com.vmware.converter.IntOption numSCSIControllers) {
        this.numSCSIControllers = numSCSIControllers;
    }


    /**
     * Gets the numEthernetCards value for this VirtualPCIControllerOption.
     * 
     * @return numEthernetCards
     */
    public com.vmware.converter.IntOption getNumEthernetCards() {
        return numEthernetCards;
    }


    /**
     * Sets the numEthernetCards value for this VirtualPCIControllerOption.
     * 
     * @param numEthernetCards
     */
    public void setNumEthernetCards(com.vmware.converter.IntOption numEthernetCards) {
        this.numEthernetCards = numEthernetCards;
    }


    /**
     * Gets the numVideoCards value for this VirtualPCIControllerOption.
     * 
     * @return numVideoCards
     */
    public com.vmware.converter.IntOption getNumVideoCards() {
        return numVideoCards;
    }


    /**
     * Sets the numVideoCards value for this VirtualPCIControllerOption.
     * 
     * @param numVideoCards
     */
    public void setNumVideoCards(com.vmware.converter.IntOption numVideoCards) {
        this.numVideoCards = numVideoCards;
    }


    /**
     * Gets the numSoundCards value for this VirtualPCIControllerOption.
     * 
     * @return numSoundCards
     */
    public com.vmware.converter.IntOption getNumSoundCards() {
        return numSoundCards;
    }


    /**
     * Sets the numSoundCards value for this VirtualPCIControllerOption.
     * 
     * @param numSoundCards
     */
    public void setNumSoundCards(com.vmware.converter.IntOption numSoundCards) {
        this.numSoundCards = numSoundCards;
    }


    /**
     * Gets the numVmiRoms value for this VirtualPCIControllerOption.
     * 
     * @return numVmiRoms
     */
    public com.vmware.converter.IntOption getNumVmiRoms() {
        return numVmiRoms;
    }


    /**
     * Sets the numVmiRoms value for this VirtualPCIControllerOption.
     * 
     * @param numVmiRoms
     */
    public void setNumVmiRoms(com.vmware.converter.IntOption numVmiRoms) {
        this.numVmiRoms = numVmiRoms;
    }


    /**
     * Gets the numVmciDevices value for this VirtualPCIControllerOption.
     * 
     * @return numVmciDevices
     */
    public com.vmware.converter.IntOption getNumVmciDevices() {
        return numVmciDevices;
    }


    /**
     * Sets the numVmciDevices value for this VirtualPCIControllerOption.
     * 
     * @param numVmciDevices
     */
    public void setNumVmciDevices(com.vmware.converter.IntOption numVmciDevices) {
        this.numVmciDevices = numVmciDevices;
    }


    /**
     * Gets the numPCIPassthroughDevices value for this VirtualPCIControllerOption.
     * 
     * @return numPCIPassthroughDevices
     */
    public com.vmware.converter.IntOption getNumPCIPassthroughDevices() {
        return numPCIPassthroughDevices;
    }


    /**
     * Sets the numPCIPassthroughDevices value for this VirtualPCIControllerOption.
     * 
     * @param numPCIPassthroughDevices
     */
    public void setNumPCIPassthroughDevices(com.vmware.converter.IntOption numPCIPassthroughDevices) {
        this.numPCIPassthroughDevices = numPCIPassthroughDevices;
    }


    /**
     * Gets the numSasSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @return numSasSCSIControllers
     */
    public com.vmware.converter.IntOption getNumSasSCSIControllers() {
        return numSasSCSIControllers;
    }


    /**
     * Sets the numSasSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @param numSasSCSIControllers
     */
    public void setNumSasSCSIControllers(com.vmware.converter.IntOption numSasSCSIControllers) {
        this.numSasSCSIControllers = numSasSCSIControllers;
    }


    /**
     * Gets the numVmxnet3EthernetCards value for this VirtualPCIControllerOption.
     * 
     * @return numVmxnet3EthernetCards
     */
    public com.vmware.converter.IntOption getNumVmxnet3EthernetCards() {
        return numVmxnet3EthernetCards;
    }


    /**
     * Sets the numVmxnet3EthernetCards value for this VirtualPCIControllerOption.
     * 
     * @param numVmxnet3EthernetCards
     */
    public void setNumVmxnet3EthernetCards(com.vmware.converter.IntOption numVmxnet3EthernetCards) {
        this.numVmxnet3EthernetCards = numVmxnet3EthernetCards;
    }


    /**
     * Gets the numParaVirtualSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @return numParaVirtualSCSIControllers
     */
    public com.vmware.converter.IntOption getNumParaVirtualSCSIControllers() {
        return numParaVirtualSCSIControllers;
    }


    /**
     * Sets the numParaVirtualSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @param numParaVirtualSCSIControllers
     */
    public void setNumParaVirtualSCSIControllers(com.vmware.converter.IntOption numParaVirtualSCSIControllers) {
        this.numParaVirtualSCSIControllers = numParaVirtualSCSIControllers;
    }


    /**
     * Gets the numSATAControllers value for this VirtualPCIControllerOption.
     * 
     * @return numSATAControllers
     */
    public com.vmware.converter.IntOption getNumSATAControllers() {
        return numSATAControllers;
    }


    /**
     * Sets the numSATAControllers value for this VirtualPCIControllerOption.
     * 
     * @param numSATAControllers
     */
    public void setNumSATAControllers(com.vmware.converter.IntOption numSATAControllers) {
        this.numSATAControllers = numSATAControllers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualPCIControllerOption)) return false;
        VirtualPCIControllerOption other = (VirtualPCIControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numSCSIControllers==null && other.getNumSCSIControllers()==null) || 
             (this.numSCSIControllers!=null &&
              this.numSCSIControllers.equals(other.getNumSCSIControllers()))) &&
            ((this.numEthernetCards==null && other.getNumEthernetCards()==null) || 
             (this.numEthernetCards!=null &&
              this.numEthernetCards.equals(other.getNumEthernetCards()))) &&
            ((this.numVideoCards==null && other.getNumVideoCards()==null) || 
             (this.numVideoCards!=null &&
              this.numVideoCards.equals(other.getNumVideoCards()))) &&
            ((this.numSoundCards==null && other.getNumSoundCards()==null) || 
             (this.numSoundCards!=null &&
              this.numSoundCards.equals(other.getNumSoundCards()))) &&
            ((this.numVmiRoms==null && other.getNumVmiRoms()==null) || 
             (this.numVmiRoms!=null &&
              this.numVmiRoms.equals(other.getNumVmiRoms()))) &&
            ((this.numVmciDevices==null && other.getNumVmciDevices()==null) || 
             (this.numVmciDevices!=null &&
              this.numVmciDevices.equals(other.getNumVmciDevices()))) &&
            ((this.numPCIPassthroughDevices==null && other.getNumPCIPassthroughDevices()==null) || 
             (this.numPCIPassthroughDevices!=null &&
              this.numPCIPassthroughDevices.equals(other.getNumPCIPassthroughDevices()))) &&
            ((this.numSasSCSIControllers==null && other.getNumSasSCSIControllers()==null) || 
             (this.numSasSCSIControllers!=null &&
              this.numSasSCSIControllers.equals(other.getNumSasSCSIControllers()))) &&
            ((this.numVmxnet3EthernetCards==null && other.getNumVmxnet3EthernetCards()==null) || 
             (this.numVmxnet3EthernetCards!=null &&
              this.numVmxnet3EthernetCards.equals(other.getNumVmxnet3EthernetCards()))) &&
            ((this.numParaVirtualSCSIControllers==null && other.getNumParaVirtualSCSIControllers()==null) || 
             (this.numParaVirtualSCSIControllers!=null &&
              this.numParaVirtualSCSIControllers.equals(other.getNumParaVirtualSCSIControllers()))) &&
            ((this.numSATAControllers==null && other.getNumSATAControllers()==null) || 
             (this.numSATAControllers!=null &&
              this.numSATAControllers.equals(other.getNumSATAControllers())));
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
        if (getNumSCSIControllers() != null) {
            _hashCode += getNumSCSIControllers().hashCode();
        }
        if (getNumEthernetCards() != null) {
            _hashCode += getNumEthernetCards().hashCode();
        }
        if (getNumVideoCards() != null) {
            _hashCode += getNumVideoCards().hashCode();
        }
        if (getNumSoundCards() != null) {
            _hashCode += getNumSoundCards().hashCode();
        }
        if (getNumVmiRoms() != null) {
            _hashCode += getNumVmiRoms().hashCode();
        }
        if (getNumVmciDevices() != null) {
            _hashCode += getNumVmciDevices().hashCode();
        }
        if (getNumPCIPassthroughDevices() != null) {
            _hashCode += getNumPCIPassthroughDevices().hashCode();
        }
        if (getNumSasSCSIControllers() != null) {
            _hashCode += getNumSasSCSIControllers().hashCode();
        }
        if (getNumVmxnet3EthernetCards() != null) {
            _hashCode += getNumVmxnet3EthernetCards().hashCode();
        }
        if (getNumParaVirtualSCSIControllers() != null) {
            _hashCode += getNumParaVirtualSCSIControllers().hashCode();
        }
        if (getNumSATAControllers() != null) {
            _hashCode += getNumSATAControllers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualPCIControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualPCIControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSCSIControllers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSCSIControllers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEthernetCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numEthernetCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVideoCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVideoCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSoundCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSoundCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVmiRoms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVmiRoms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVmciDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVmciDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPCIPassthroughDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPCIPassthroughDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSasSCSIControllers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSasSCSIControllers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVmxnet3EthernetCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVmxnet3EthernetCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParaVirtualSCSIControllers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numParaVirtualSCSIControllers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSATAControllers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numSATAControllers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
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
