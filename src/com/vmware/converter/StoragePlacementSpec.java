/**
 * StoragePlacementSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StoragePlacementSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String type;

    private com.vmware.converter.VirtualMachineMovePriority priority;

    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.StorageDrsPodSelectionSpec podSelectionSpec;

    private com.vmware.converter.VirtualMachineCloneSpec cloneSpec;

    private java.lang.String cloneName;

    private com.vmware.converter.VirtualMachineConfigSpec configSpec;

    private com.vmware.converter.VirtualMachineRelocateSpec relocateSpec;

    private com.vmware.converter.ManagedObjectReference resourcePool;

    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.ManagedObjectReference folder;

    private java.lang.Boolean disallowPrerequisiteMoves;

    private java.lang.Integer resourceLeaseDurationSec;

    public StoragePlacementSpec() {
    }

    public StoragePlacementSpec(
           java.lang.String type,
           com.vmware.converter.VirtualMachineMovePriority priority,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.StorageDrsPodSelectionSpec podSelectionSpec,
           com.vmware.converter.VirtualMachineCloneSpec cloneSpec,
           java.lang.String cloneName,
           com.vmware.converter.VirtualMachineConfigSpec configSpec,
           com.vmware.converter.VirtualMachineRelocateSpec relocateSpec,
           com.vmware.converter.ManagedObjectReference resourcePool,
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.ManagedObjectReference folder,
           java.lang.Boolean disallowPrerequisiteMoves,
           java.lang.Integer resourceLeaseDurationSec) {
        this.type = type;
        this.priority = priority;
        this.vm = vm;
        this.podSelectionSpec = podSelectionSpec;
        this.cloneSpec = cloneSpec;
        this.cloneName = cloneName;
        this.configSpec = configSpec;
        this.relocateSpec = relocateSpec;
        this.resourcePool = resourcePool;
        this.host = host;
        this.folder = folder;
        this.disallowPrerequisiteMoves = disallowPrerequisiteMoves;
        this.resourceLeaseDurationSec = resourceLeaseDurationSec;
    }


    /**
     * Gets the type value for this StoragePlacementSpec.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this StoragePlacementSpec.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the priority value for this StoragePlacementSpec.
     * 
     * @return priority
     */
    public com.vmware.converter.VirtualMachineMovePriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this StoragePlacementSpec.
     * 
     * @param priority
     */
    public void setPriority(com.vmware.converter.VirtualMachineMovePriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the vm value for this StoragePlacementSpec.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this StoragePlacementSpec.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the podSelectionSpec value for this StoragePlacementSpec.
     * 
     * @return podSelectionSpec
     */
    public com.vmware.converter.StorageDrsPodSelectionSpec getPodSelectionSpec() {
        return podSelectionSpec;
    }


    /**
     * Sets the podSelectionSpec value for this StoragePlacementSpec.
     * 
     * @param podSelectionSpec
     */
    public void setPodSelectionSpec(com.vmware.converter.StorageDrsPodSelectionSpec podSelectionSpec) {
        this.podSelectionSpec = podSelectionSpec;
    }


    /**
     * Gets the cloneSpec value for this StoragePlacementSpec.
     * 
     * @return cloneSpec
     */
    public com.vmware.converter.VirtualMachineCloneSpec getCloneSpec() {
        return cloneSpec;
    }


    /**
     * Sets the cloneSpec value for this StoragePlacementSpec.
     * 
     * @param cloneSpec
     */
    public void setCloneSpec(com.vmware.converter.VirtualMachineCloneSpec cloneSpec) {
        this.cloneSpec = cloneSpec;
    }


    /**
     * Gets the cloneName value for this StoragePlacementSpec.
     * 
     * @return cloneName
     */
    public java.lang.String getCloneName() {
        return cloneName;
    }


    /**
     * Sets the cloneName value for this StoragePlacementSpec.
     * 
     * @param cloneName
     */
    public void setCloneName(java.lang.String cloneName) {
        this.cloneName = cloneName;
    }


    /**
     * Gets the configSpec value for this StoragePlacementSpec.
     * 
     * @return configSpec
     */
    public com.vmware.converter.VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }


    /**
     * Sets the configSpec value for this StoragePlacementSpec.
     * 
     * @param configSpec
     */
    public void setConfigSpec(com.vmware.converter.VirtualMachineConfigSpec configSpec) {
        this.configSpec = configSpec;
    }


    /**
     * Gets the relocateSpec value for this StoragePlacementSpec.
     * 
     * @return relocateSpec
     */
    public com.vmware.converter.VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }


    /**
     * Sets the relocateSpec value for this StoragePlacementSpec.
     * 
     * @param relocateSpec
     */
    public void setRelocateSpec(com.vmware.converter.VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }


    /**
     * Gets the resourcePool value for this StoragePlacementSpec.
     * 
     * @return resourcePool
     */
    public com.vmware.converter.ManagedObjectReference getResourcePool() {
        return resourcePool;
    }


    /**
     * Sets the resourcePool value for this StoragePlacementSpec.
     * 
     * @param resourcePool
     */
    public void setResourcePool(com.vmware.converter.ManagedObjectReference resourcePool) {
        this.resourcePool = resourcePool;
    }


    /**
     * Gets the host value for this StoragePlacementSpec.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this StoragePlacementSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the folder value for this StoragePlacementSpec.
     * 
     * @return folder
     */
    public com.vmware.converter.ManagedObjectReference getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this StoragePlacementSpec.
     * 
     * @param folder
     */
    public void setFolder(com.vmware.converter.ManagedObjectReference folder) {
        this.folder = folder;
    }


    /**
     * Gets the disallowPrerequisiteMoves value for this StoragePlacementSpec.
     * 
     * @return disallowPrerequisiteMoves
     */
    public java.lang.Boolean getDisallowPrerequisiteMoves() {
        return disallowPrerequisiteMoves;
    }


    /**
     * Sets the disallowPrerequisiteMoves value for this StoragePlacementSpec.
     * 
     * @param disallowPrerequisiteMoves
     */
    public void setDisallowPrerequisiteMoves(java.lang.Boolean disallowPrerequisiteMoves) {
        this.disallowPrerequisiteMoves = disallowPrerequisiteMoves;
    }


    /**
     * Gets the resourceLeaseDurationSec value for this StoragePlacementSpec.
     * 
     * @return resourceLeaseDurationSec
     */
    public java.lang.Integer getResourceLeaseDurationSec() {
        return resourceLeaseDurationSec;
    }


    /**
     * Sets the resourceLeaseDurationSec value for this StoragePlacementSpec.
     * 
     * @param resourceLeaseDurationSec
     */
    public void setResourceLeaseDurationSec(java.lang.Integer resourceLeaseDurationSec) {
        this.resourceLeaseDurationSec = resourceLeaseDurationSec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoragePlacementSpec)) return false;
        StoragePlacementSpec other = (StoragePlacementSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.podSelectionSpec==null && other.getPodSelectionSpec()==null) || 
             (this.podSelectionSpec!=null &&
              this.podSelectionSpec.equals(other.getPodSelectionSpec()))) &&
            ((this.cloneSpec==null && other.getCloneSpec()==null) || 
             (this.cloneSpec!=null &&
              this.cloneSpec.equals(other.getCloneSpec()))) &&
            ((this.cloneName==null && other.getCloneName()==null) || 
             (this.cloneName!=null &&
              this.cloneName.equals(other.getCloneName()))) &&
            ((this.configSpec==null && other.getConfigSpec()==null) || 
             (this.configSpec!=null &&
              this.configSpec.equals(other.getConfigSpec()))) &&
            ((this.relocateSpec==null && other.getRelocateSpec()==null) || 
             (this.relocateSpec!=null &&
              this.relocateSpec.equals(other.getRelocateSpec()))) &&
            ((this.resourcePool==null && other.getResourcePool()==null) || 
             (this.resourcePool!=null &&
              this.resourcePool.equals(other.getResourcePool()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.disallowPrerequisiteMoves==null && other.getDisallowPrerequisiteMoves()==null) || 
             (this.disallowPrerequisiteMoves!=null &&
              this.disallowPrerequisiteMoves.equals(other.getDisallowPrerequisiteMoves()))) &&
            ((this.resourceLeaseDurationSec==null && other.getResourceLeaseDurationSec()==null) || 
             (this.resourceLeaseDurationSec!=null &&
              this.resourceLeaseDurationSec.equals(other.getResourceLeaseDurationSec())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getPodSelectionSpec() != null) {
            _hashCode += getPodSelectionSpec().hashCode();
        }
        if (getCloneSpec() != null) {
            _hashCode += getCloneSpec().hashCode();
        }
        if (getCloneName() != null) {
            _hashCode += getCloneName().hashCode();
        }
        if (getConfigSpec() != null) {
            _hashCode += getConfigSpec().hashCode();
        }
        if (getRelocateSpec() != null) {
            _hashCode += getRelocateSpec().hashCode();
        }
        if (getResourcePool() != null) {
            _hashCode += getResourcePool().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getDisallowPrerequisiteMoves() != null) {
            _hashCode += getDisallowPrerequisiteMoves().hashCode();
        }
        if (getResourceLeaseDurationSec() != null) {
            _hashCode += getResourceLeaseDurationSec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoragePlacementSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StoragePlacementSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMovePriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podSelectionSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "podSelectionSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPodSelectionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cloneSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCloneSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cloneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relocateSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "relocateSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineRelocateSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disallowPrerequisiteMoves");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disallowPrerequisiteMoves"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceLeaseDurationSec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceLeaseDurationSec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
