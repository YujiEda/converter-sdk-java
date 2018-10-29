/**
 * StoragePlacementAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StoragePlacementAction  extends com.vmware.converter.ClusterAction  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.VirtualMachineRelocateSpec relocateSpec;

    private com.vmware.converter.ManagedObjectReference destination;

    private java.lang.Float spaceUtilBefore;

    private java.lang.Float spaceDemandBefore;

    private java.lang.Float spaceUtilAfter;

    private java.lang.Float spaceDemandAfter;

    private java.lang.Float ioLatencyBefore;

    public StoragePlacementAction() {
    }

    public StoragePlacementAction(
           java.lang.String type,
           com.vmware.converter.ManagedObjectReference target,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.VirtualMachineRelocateSpec relocateSpec,
           com.vmware.converter.ManagedObjectReference destination,
           java.lang.Float spaceUtilBefore,
           java.lang.Float spaceDemandBefore,
           java.lang.Float spaceUtilAfter,
           java.lang.Float spaceDemandAfter,
           java.lang.Float ioLatencyBefore) {
        super(
            type,
            target);
        this.vm = vm;
        this.relocateSpec = relocateSpec;
        this.destination = destination;
        this.spaceUtilBefore = spaceUtilBefore;
        this.spaceDemandBefore = spaceDemandBefore;
        this.spaceUtilAfter = spaceUtilAfter;
        this.spaceDemandAfter = spaceDemandAfter;
        this.ioLatencyBefore = ioLatencyBefore;
    }


    /**
     * Gets the vm value for this StoragePlacementAction.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this StoragePlacementAction.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the relocateSpec value for this StoragePlacementAction.
     * 
     * @return relocateSpec
     */
    public com.vmware.converter.VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }


    /**
     * Sets the relocateSpec value for this StoragePlacementAction.
     * 
     * @param relocateSpec
     */
    public void setRelocateSpec(com.vmware.converter.VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }


    /**
     * Gets the destination value for this StoragePlacementAction.
     * 
     * @return destination
     */
    public com.vmware.converter.ManagedObjectReference getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this StoragePlacementAction.
     * 
     * @param destination
     */
    public void setDestination(com.vmware.converter.ManagedObjectReference destination) {
        this.destination = destination;
    }


    /**
     * Gets the spaceUtilBefore value for this StoragePlacementAction.
     * 
     * @return spaceUtilBefore
     */
    public java.lang.Float getSpaceUtilBefore() {
        return spaceUtilBefore;
    }


    /**
     * Sets the spaceUtilBefore value for this StoragePlacementAction.
     * 
     * @param spaceUtilBefore
     */
    public void setSpaceUtilBefore(java.lang.Float spaceUtilBefore) {
        this.spaceUtilBefore = spaceUtilBefore;
    }


    /**
     * Gets the spaceDemandBefore value for this StoragePlacementAction.
     * 
     * @return spaceDemandBefore
     */
    public java.lang.Float getSpaceDemandBefore() {
        return spaceDemandBefore;
    }


    /**
     * Sets the spaceDemandBefore value for this StoragePlacementAction.
     * 
     * @param spaceDemandBefore
     */
    public void setSpaceDemandBefore(java.lang.Float spaceDemandBefore) {
        this.spaceDemandBefore = spaceDemandBefore;
    }


    /**
     * Gets the spaceUtilAfter value for this StoragePlacementAction.
     * 
     * @return spaceUtilAfter
     */
    public java.lang.Float getSpaceUtilAfter() {
        return spaceUtilAfter;
    }


    /**
     * Sets the spaceUtilAfter value for this StoragePlacementAction.
     * 
     * @param spaceUtilAfter
     */
    public void setSpaceUtilAfter(java.lang.Float spaceUtilAfter) {
        this.spaceUtilAfter = spaceUtilAfter;
    }


    /**
     * Gets the spaceDemandAfter value for this StoragePlacementAction.
     * 
     * @return spaceDemandAfter
     */
    public java.lang.Float getSpaceDemandAfter() {
        return spaceDemandAfter;
    }


    /**
     * Sets the spaceDemandAfter value for this StoragePlacementAction.
     * 
     * @param spaceDemandAfter
     */
    public void setSpaceDemandAfter(java.lang.Float spaceDemandAfter) {
        this.spaceDemandAfter = spaceDemandAfter;
    }


    /**
     * Gets the ioLatencyBefore value for this StoragePlacementAction.
     * 
     * @return ioLatencyBefore
     */
    public java.lang.Float getIoLatencyBefore() {
        return ioLatencyBefore;
    }


    /**
     * Sets the ioLatencyBefore value for this StoragePlacementAction.
     * 
     * @param ioLatencyBefore
     */
    public void setIoLatencyBefore(java.lang.Float ioLatencyBefore) {
        this.ioLatencyBefore = ioLatencyBefore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoragePlacementAction)) return false;
        StoragePlacementAction other = (StoragePlacementAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.relocateSpec==null && other.getRelocateSpec()==null) || 
             (this.relocateSpec!=null &&
              this.relocateSpec.equals(other.getRelocateSpec()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.spaceUtilBefore==null && other.getSpaceUtilBefore()==null) || 
             (this.spaceUtilBefore!=null &&
              this.spaceUtilBefore.equals(other.getSpaceUtilBefore()))) &&
            ((this.spaceDemandBefore==null && other.getSpaceDemandBefore()==null) || 
             (this.spaceDemandBefore!=null &&
              this.spaceDemandBefore.equals(other.getSpaceDemandBefore()))) &&
            ((this.spaceUtilAfter==null && other.getSpaceUtilAfter()==null) || 
             (this.spaceUtilAfter!=null &&
              this.spaceUtilAfter.equals(other.getSpaceUtilAfter()))) &&
            ((this.spaceDemandAfter==null && other.getSpaceDemandAfter()==null) || 
             (this.spaceDemandAfter!=null &&
              this.spaceDemandAfter.equals(other.getSpaceDemandAfter()))) &&
            ((this.ioLatencyBefore==null && other.getIoLatencyBefore()==null) || 
             (this.ioLatencyBefore!=null &&
              this.ioLatencyBefore.equals(other.getIoLatencyBefore())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getRelocateSpec() != null) {
            _hashCode += getRelocateSpec().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getSpaceUtilBefore() != null) {
            _hashCode += getSpaceUtilBefore().hashCode();
        }
        if (getSpaceDemandBefore() != null) {
            _hashCode += getSpaceDemandBefore().hashCode();
        }
        if (getSpaceUtilAfter() != null) {
            _hashCode += getSpaceUtilAfter().hashCode();
        }
        if (getSpaceDemandAfter() != null) {
            _hashCode += getSpaceDemandAfter().hashCode();
        }
        if (getIoLatencyBefore() != null) {
            _hashCode += getIoLatencyBefore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoragePlacementAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StoragePlacementAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relocateSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "relocateSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceDemandBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceDemandBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceDemandAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceDemandAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLatencyBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLatencyBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
