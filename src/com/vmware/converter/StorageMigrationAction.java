/**
 * StorageMigrationAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageMigrationAction  extends com.vmware.converter.ClusterAction  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.VirtualMachineRelocateSpec relocateSpec;

    private com.vmware.converter.ManagedObjectReference source;

    private com.vmware.converter.ManagedObjectReference destination;

    private long sizeTransferred;

    private java.lang.Float spaceUtilSrcBefore;

    private java.lang.Float spaceUtilDstBefore;

    private java.lang.Float spaceUtilSrcAfter;

    private java.lang.Float spaceUtilDstAfter;

    private java.lang.Float ioLatencySrcBefore;

    private java.lang.Float ioLatencyDstBefore;

    public StorageMigrationAction() {
    }

    public StorageMigrationAction(
           java.lang.String type,
           com.vmware.converter.ManagedObjectReference target,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.VirtualMachineRelocateSpec relocateSpec,
           com.vmware.converter.ManagedObjectReference source,
           com.vmware.converter.ManagedObjectReference destination,
           long sizeTransferred,
           java.lang.Float spaceUtilSrcBefore,
           java.lang.Float spaceUtilDstBefore,
           java.lang.Float spaceUtilSrcAfter,
           java.lang.Float spaceUtilDstAfter,
           java.lang.Float ioLatencySrcBefore,
           java.lang.Float ioLatencyDstBefore) {
        super(
            type,
            target);
        this.vm = vm;
        this.relocateSpec = relocateSpec;
        this.source = source;
        this.destination = destination;
        this.sizeTransferred = sizeTransferred;
        this.spaceUtilSrcBefore = spaceUtilSrcBefore;
        this.spaceUtilDstBefore = spaceUtilDstBefore;
        this.spaceUtilSrcAfter = spaceUtilSrcAfter;
        this.spaceUtilDstAfter = spaceUtilDstAfter;
        this.ioLatencySrcBefore = ioLatencySrcBefore;
        this.ioLatencyDstBefore = ioLatencyDstBefore;
    }


    /**
     * Gets the vm value for this StorageMigrationAction.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this StorageMigrationAction.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the relocateSpec value for this StorageMigrationAction.
     * 
     * @return relocateSpec
     */
    public com.vmware.converter.VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }


    /**
     * Sets the relocateSpec value for this StorageMigrationAction.
     * 
     * @param relocateSpec
     */
    public void setRelocateSpec(com.vmware.converter.VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }


    /**
     * Gets the source value for this StorageMigrationAction.
     * 
     * @return source
     */
    public com.vmware.converter.ManagedObjectReference getSource() {
        return source;
    }


    /**
     * Sets the source value for this StorageMigrationAction.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ManagedObjectReference source) {
        this.source = source;
    }


    /**
     * Gets the destination value for this StorageMigrationAction.
     * 
     * @return destination
     */
    public com.vmware.converter.ManagedObjectReference getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this StorageMigrationAction.
     * 
     * @param destination
     */
    public void setDestination(com.vmware.converter.ManagedObjectReference destination) {
        this.destination = destination;
    }


    /**
     * Gets the sizeTransferred value for this StorageMigrationAction.
     * 
     * @return sizeTransferred
     */
    public long getSizeTransferred() {
        return sizeTransferred;
    }


    /**
     * Sets the sizeTransferred value for this StorageMigrationAction.
     * 
     * @param sizeTransferred
     */
    public void setSizeTransferred(long sizeTransferred) {
        this.sizeTransferred = sizeTransferred;
    }


    /**
     * Gets the spaceUtilSrcBefore value for this StorageMigrationAction.
     * 
     * @return spaceUtilSrcBefore
     */
    public java.lang.Float getSpaceUtilSrcBefore() {
        return spaceUtilSrcBefore;
    }


    /**
     * Sets the spaceUtilSrcBefore value for this StorageMigrationAction.
     * 
     * @param spaceUtilSrcBefore
     */
    public void setSpaceUtilSrcBefore(java.lang.Float spaceUtilSrcBefore) {
        this.spaceUtilSrcBefore = spaceUtilSrcBefore;
    }


    /**
     * Gets the spaceUtilDstBefore value for this StorageMigrationAction.
     * 
     * @return spaceUtilDstBefore
     */
    public java.lang.Float getSpaceUtilDstBefore() {
        return spaceUtilDstBefore;
    }


    /**
     * Sets the spaceUtilDstBefore value for this StorageMigrationAction.
     * 
     * @param spaceUtilDstBefore
     */
    public void setSpaceUtilDstBefore(java.lang.Float spaceUtilDstBefore) {
        this.spaceUtilDstBefore = spaceUtilDstBefore;
    }


    /**
     * Gets the spaceUtilSrcAfter value for this StorageMigrationAction.
     * 
     * @return spaceUtilSrcAfter
     */
    public java.lang.Float getSpaceUtilSrcAfter() {
        return spaceUtilSrcAfter;
    }


    /**
     * Sets the spaceUtilSrcAfter value for this StorageMigrationAction.
     * 
     * @param spaceUtilSrcAfter
     */
    public void setSpaceUtilSrcAfter(java.lang.Float spaceUtilSrcAfter) {
        this.spaceUtilSrcAfter = spaceUtilSrcAfter;
    }


    /**
     * Gets the spaceUtilDstAfter value for this StorageMigrationAction.
     * 
     * @return spaceUtilDstAfter
     */
    public java.lang.Float getSpaceUtilDstAfter() {
        return spaceUtilDstAfter;
    }


    /**
     * Sets the spaceUtilDstAfter value for this StorageMigrationAction.
     * 
     * @param spaceUtilDstAfter
     */
    public void setSpaceUtilDstAfter(java.lang.Float spaceUtilDstAfter) {
        this.spaceUtilDstAfter = spaceUtilDstAfter;
    }


    /**
     * Gets the ioLatencySrcBefore value for this StorageMigrationAction.
     * 
     * @return ioLatencySrcBefore
     */
    public java.lang.Float getIoLatencySrcBefore() {
        return ioLatencySrcBefore;
    }


    /**
     * Sets the ioLatencySrcBefore value for this StorageMigrationAction.
     * 
     * @param ioLatencySrcBefore
     */
    public void setIoLatencySrcBefore(java.lang.Float ioLatencySrcBefore) {
        this.ioLatencySrcBefore = ioLatencySrcBefore;
    }


    /**
     * Gets the ioLatencyDstBefore value for this StorageMigrationAction.
     * 
     * @return ioLatencyDstBefore
     */
    public java.lang.Float getIoLatencyDstBefore() {
        return ioLatencyDstBefore;
    }


    /**
     * Sets the ioLatencyDstBefore value for this StorageMigrationAction.
     * 
     * @param ioLatencyDstBefore
     */
    public void setIoLatencyDstBefore(java.lang.Float ioLatencyDstBefore) {
        this.ioLatencyDstBefore = ioLatencyDstBefore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageMigrationAction)) return false;
        StorageMigrationAction other = (StorageMigrationAction) obj;
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
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.sizeTransferred == other.getSizeTransferred() &&
            ((this.spaceUtilSrcBefore==null && other.getSpaceUtilSrcBefore()==null) || 
             (this.spaceUtilSrcBefore!=null &&
              this.spaceUtilSrcBefore.equals(other.getSpaceUtilSrcBefore()))) &&
            ((this.spaceUtilDstBefore==null && other.getSpaceUtilDstBefore()==null) || 
             (this.spaceUtilDstBefore!=null &&
              this.spaceUtilDstBefore.equals(other.getSpaceUtilDstBefore()))) &&
            ((this.spaceUtilSrcAfter==null && other.getSpaceUtilSrcAfter()==null) || 
             (this.spaceUtilSrcAfter!=null &&
              this.spaceUtilSrcAfter.equals(other.getSpaceUtilSrcAfter()))) &&
            ((this.spaceUtilDstAfter==null && other.getSpaceUtilDstAfter()==null) || 
             (this.spaceUtilDstAfter!=null &&
              this.spaceUtilDstAfter.equals(other.getSpaceUtilDstAfter()))) &&
            ((this.ioLatencySrcBefore==null && other.getIoLatencySrcBefore()==null) || 
             (this.ioLatencySrcBefore!=null &&
              this.ioLatencySrcBefore.equals(other.getIoLatencySrcBefore()))) &&
            ((this.ioLatencyDstBefore==null && other.getIoLatencyDstBefore()==null) || 
             (this.ioLatencyDstBefore!=null &&
              this.ioLatencyDstBefore.equals(other.getIoLatencyDstBefore())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += new Long(getSizeTransferred()).hashCode();
        if (getSpaceUtilSrcBefore() != null) {
            _hashCode += getSpaceUtilSrcBefore().hashCode();
        }
        if (getSpaceUtilDstBefore() != null) {
            _hashCode += getSpaceUtilDstBefore().hashCode();
        }
        if (getSpaceUtilSrcAfter() != null) {
            _hashCode += getSpaceUtilSrcAfter().hashCode();
        }
        if (getSpaceUtilDstAfter() != null) {
            _hashCode += getSpaceUtilDstAfter().hashCode();
        }
        if (getIoLatencySrcBefore() != null) {
            _hashCode += getIoLatencySrcBefore().hashCode();
        }
        if (getIoLatencyDstBefore() != null) {
            _hashCode += getIoLatencyDstBefore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageMigrationAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageMigrationAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relocateSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "relocateSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeTransferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sizeTransferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilSrcBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilSrcBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilDstBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilDstBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilSrcAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilSrcAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUtilDstAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceUtilDstAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLatencySrcBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLatencySrcBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLatencyDstBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLatencyDstBefore"));
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
