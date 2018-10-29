/**
 * VRPEditSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VRPEditSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vrpId;

    private java.lang.String description;

    private com.vmware.converter.VrpResourceAllocationInfo cpuAllocation;

    private com.vmware.converter.VrpResourceAllocationInfo memoryAllocation;

    private com.vmware.converter.ManagedObjectReference[] addedHubs;

    private com.vmware.converter.ManagedObjectReference[] removedHubs;

    private java.lang.Long changeVersion;

    public VRPEditSpec() {
    }

    public VRPEditSpec(
           java.lang.String vrpId,
           java.lang.String description,
           com.vmware.converter.VrpResourceAllocationInfo cpuAllocation,
           com.vmware.converter.VrpResourceAllocationInfo memoryAllocation,
           com.vmware.converter.ManagedObjectReference[] addedHubs,
           com.vmware.converter.ManagedObjectReference[] removedHubs,
           java.lang.Long changeVersion) {
        this.vrpId = vrpId;
        this.description = description;
        this.cpuAllocation = cpuAllocation;
        this.memoryAllocation = memoryAllocation;
        this.addedHubs = addedHubs;
        this.removedHubs = removedHubs;
        this.changeVersion = changeVersion;
    }


    /**
     * Gets the vrpId value for this VRPEditSpec.
     * 
     * @return vrpId
     */
    public java.lang.String getVrpId() {
        return vrpId;
    }


    /**
     * Sets the vrpId value for this VRPEditSpec.
     * 
     * @param vrpId
     */
    public void setVrpId(java.lang.String vrpId) {
        this.vrpId = vrpId;
    }


    /**
     * Gets the description value for this VRPEditSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VRPEditSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the cpuAllocation value for this VRPEditSpec.
     * 
     * @return cpuAllocation
     */
    public com.vmware.converter.VrpResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }


    /**
     * Sets the cpuAllocation value for this VRPEditSpec.
     * 
     * @param cpuAllocation
     */
    public void setCpuAllocation(com.vmware.converter.VrpResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }


    /**
     * Gets the memoryAllocation value for this VRPEditSpec.
     * 
     * @return memoryAllocation
     */
    public com.vmware.converter.VrpResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }


    /**
     * Sets the memoryAllocation value for this VRPEditSpec.
     * 
     * @param memoryAllocation
     */
    public void setMemoryAllocation(com.vmware.converter.VrpResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }


    /**
     * Gets the addedHubs value for this VRPEditSpec.
     * 
     * @return addedHubs
     */
    public com.vmware.converter.ManagedObjectReference[] getAddedHubs() {
        return addedHubs;
    }


    /**
     * Sets the addedHubs value for this VRPEditSpec.
     * 
     * @param addedHubs
     */
    public void setAddedHubs(com.vmware.converter.ManagedObjectReference[] addedHubs) {
        this.addedHubs = addedHubs;
    }

    public com.vmware.converter.ManagedObjectReference getAddedHubs(int i) {
        return this.addedHubs[i];
    }

    public void setAddedHubs(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.addedHubs[i] = _value;
    }


    /**
     * Gets the removedHubs value for this VRPEditSpec.
     * 
     * @return removedHubs
     */
    public com.vmware.converter.ManagedObjectReference[] getRemovedHubs() {
        return removedHubs;
    }


    /**
     * Sets the removedHubs value for this VRPEditSpec.
     * 
     * @param removedHubs
     */
    public void setRemovedHubs(com.vmware.converter.ManagedObjectReference[] removedHubs) {
        this.removedHubs = removedHubs;
    }

    public com.vmware.converter.ManagedObjectReference getRemovedHubs(int i) {
        return this.removedHubs[i];
    }

    public void setRemovedHubs(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.removedHubs[i] = _value;
    }


    /**
     * Gets the changeVersion value for this VRPEditSpec.
     * 
     * @return changeVersion
     */
    public java.lang.Long getChangeVersion() {
        return changeVersion;
    }


    /**
     * Sets the changeVersion value for this VRPEditSpec.
     * 
     * @param changeVersion
     */
    public void setChangeVersion(java.lang.Long changeVersion) {
        this.changeVersion = changeVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VRPEditSpec)) return false;
        VRPEditSpec other = (VRPEditSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vrpId==null && other.getVrpId()==null) || 
             (this.vrpId!=null &&
              this.vrpId.equals(other.getVrpId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.cpuAllocation==null && other.getCpuAllocation()==null) || 
             (this.cpuAllocation!=null &&
              this.cpuAllocation.equals(other.getCpuAllocation()))) &&
            ((this.memoryAllocation==null && other.getMemoryAllocation()==null) || 
             (this.memoryAllocation!=null &&
              this.memoryAllocation.equals(other.getMemoryAllocation()))) &&
            ((this.addedHubs==null && other.getAddedHubs()==null) || 
             (this.addedHubs!=null &&
              java.util.Arrays.equals(this.addedHubs, other.getAddedHubs()))) &&
            ((this.removedHubs==null && other.getRemovedHubs()==null) || 
             (this.removedHubs!=null &&
              java.util.Arrays.equals(this.removedHubs, other.getRemovedHubs()))) &&
            ((this.changeVersion==null && other.getChangeVersion()==null) || 
             (this.changeVersion!=null &&
              this.changeVersion.equals(other.getChangeVersion())));
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
        if (getVrpId() != null) {
            _hashCode += getVrpId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCpuAllocation() != null) {
            _hashCode += getCpuAllocation().hashCode();
        }
        if (getMemoryAllocation() != null) {
            _hashCode += getMemoryAllocation().hashCode();
        }
        if (getAddedHubs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddedHubs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddedHubs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemovedHubs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemovedHubs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemovedHubs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangeVersion() != null) {
            _hashCode += getChangeVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VRPEditSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VRPEditSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrpId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vrpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VrpResourceAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VrpResourceAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedHubs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addedHubs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedHubs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "removedHubs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
