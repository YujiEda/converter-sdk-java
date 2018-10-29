/**
 * VirtualResourcePoolSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualResourcePoolSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vrpId;

    private java.lang.String vrpName;

    private java.lang.String description;

    private com.vmware.converter.VrpResourceAllocationInfo cpuAllocation;

    private com.vmware.converter.VrpResourceAllocationInfo memoryAllocation;

    private com.vmware.converter.ManagedObjectReference[] rpList;

    private com.vmware.converter.ManagedObjectReference[] hubList;

    private java.lang.Boolean rootVRP;

    private java.lang.Boolean staticVRP;

    private java.lang.Long changeVersion;

    public VirtualResourcePoolSpec() {
    }

    public VirtualResourcePoolSpec(
           java.lang.String vrpId,
           java.lang.String vrpName,
           java.lang.String description,
           com.vmware.converter.VrpResourceAllocationInfo cpuAllocation,
           com.vmware.converter.VrpResourceAllocationInfo memoryAllocation,
           com.vmware.converter.ManagedObjectReference[] rpList,
           com.vmware.converter.ManagedObjectReference[] hubList,
           java.lang.Boolean rootVRP,
           java.lang.Boolean staticVRP,
           java.lang.Long changeVersion) {
        this.vrpId = vrpId;
        this.vrpName = vrpName;
        this.description = description;
        this.cpuAllocation = cpuAllocation;
        this.memoryAllocation = memoryAllocation;
        this.rpList = rpList;
        this.hubList = hubList;
        this.rootVRP = rootVRP;
        this.staticVRP = staticVRP;
        this.changeVersion = changeVersion;
    }


    /**
     * Gets the vrpId value for this VirtualResourcePoolSpec.
     * 
     * @return vrpId
     */
    public java.lang.String getVrpId() {
        return vrpId;
    }


    /**
     * Sets the vrpId value for this VirtualResourcePoolSpec.
     * 
     * @param vrpId
     */
    public void setVrpId(java.lang.String vrpId) {
        this.vrpId = vrpId;
    }


    /**
     * Gets the vrpName value for this VirtualResourcePoolSpec.
     * 
     * @return vrpName
     */
    public java.lang.String getVrpName() {
        return vrpName;
    }


    /**
     * Sets the vrpName value for this VirtualResourcePoolSpec.
     * 
     * @param vrpName
     */
    public void setVrpName(java.lang.String vrpName) {
        this.vrpName = vrpName;
    }


    /**
     * Gets the description value for this VirtualResourcePoolSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VirtualResourcePoolSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the cpuAllocation value for this VirtualResourcePoolSpec.
     * 
     * @return cpuAllocation
     */
    public com.vmware.converter.VrpResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }


    /**
     * Sets the cpuAllocation value for this VirtualResourcePoolSpec.
     * 
     * @param cpuAllocation
     */
    public void setCpuAllocation(com.vmware.converter.VrpResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }


    /**
     * Gets the memoryAllocation value for this VirtualResourcePoolSpec.
     * 
     * @return memoryAllocation
     */
    public com.vmware.converter.VrpResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }


    /**
     * Sets the memoryAllocation value for this VirtualResourcePoolSpec.
     * 
     * @param memoryAllocation
     */
    public void setMemoryAllocation(com.vmware.converter.VrpResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }


    /**
     * Gets the rpList value for this VirtualResourcePoolSpec.
     * 
     * @return rpList
     */
    public com.vmware.converter.ManagedObjectReference[] getRpList() {
        return rpList;
    }


    /**
     * Sets the rpList value for this VirtualResourcePoolSpec.
     * 
     * @param rpList
     */
    public void setRpList(com.vmware.converter.ManagedObjectReference[] rpList) {
        this.rpList = rpList;
    }

    public com.vmware.converter.ManagedObjectReference getRpList(int i) {
        return this.rpList[i];
    }

    public void setRpList(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.rpList[i] = _value;
    }


    /**
     * Gets the hubList value for this VirtualResourcePoolSpec.
     * 
     * @return hubList
     */
    public com.vmware.converter.ManagedObjectReference[] getHubList() {
        return hubList;
    }


    /**
     * Sets the hubList value for this VirtualResourcePoolSpec.
     * 
     * @param hubList
     */
    public void setHubList(com.vmware.converter.ManagedObjectReference[] hubList) {
        this.hubList = hubList;
    }

    public com.vmware.converter.ManagedObjectReference getHubList(int i) {
        return this.hubList[i];
    }

    public void setHubList(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.hubList[i] = _value;
    }


    /**
     * Gets the rootVRP value for this VirtualResourcePoolSpec.
     * 
     * @return rootVRP
     */
    public java.lang.Boolean getRootVRP() {
        return rootVRP;
    }


    /**
     * Sets the rootVRP value for this VirtualResourcePoolSpec.
     * 
     * @param rootVRP
     */
    public void setRootVRP(java.lang.Boolean rootVRP) {
        this.rootVRP = rootVRP;
    }


    /**
     * Gets the staticVRP value for this VirtualResourcePoolSpec.
     * 
     * @return staticVRP
     */
    public java.lang.Boolean getStaticVRP() {
        return staticVRP;
    }


    /**
     * Sets the staticVRP value for this VirtualResourcePoolSpec.
     * 
     * @param staticVRP
     */
    public void setStaticVRP(java.lang.Boolean staticVRP) {
        this.staticVRP = staticVRP;
    }


    /**
     * Gets the changeVersion value for this VirtualResourcePoolSpec.
     * 
     * @return changeVersion
     */
    public java.lang.Long getChangeVersion() {
        return changeVersion;
    }


    /**
     * Sets the changeVersion value for this VirtualResourcePoolSpec.
     * 
     * @param changeVersion
     */
    public void setChangeVersion(java.lang.Long changeVersion) {
        this.changeVersion = changeVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualResourcePoolSpec)) return false;
        VirtualResourcePoolSpec other = (VirtualResourcePoolSpec) obj;
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
            ((this.vrpName==null && other.getVrpName()==null) || 
             (this.vrpName!=null &&
              this.vrpName.equals(other.getVrpName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.cpuAllocation==null && other.getCpuAllocation()==null) || 
             (this.cpuAllocation!=null &&
              this.cpuAllocation.equals(other.getCpuAllocation()))) &&
            ((this.memoryAllocation==null && other.getMemoryAllocation()==null) || 
             (this.memoryAllocation!=null &&
              this.memoryAllocation.equals(other.getMemoryAllocation()))) &&
            ((this.rpList==null && other.getRpList()==null) || 
             (this.rpList!=null &&
              java.util.Arrays.equals(this.rpList, other.getRpList()))) &&
            ((this.hubList==null && other.getHubList()==null) || 
             (this.hubList!=null &&
              java.util.Arrays.equals(this.hubList, other.getHubList()))) &&
            ((this.rootVRP==null && other.getRootVRP()==null) || 
             (this.rootVRP!=null &&
              this.rootVRP.equals(other.getRootVRP()))) &&
            ((this.staticVRP==null && other.getStaticVRP()==null) || 
             (this.staticVRP!=null &&
              this.staticVRP.equals(other.getStaticVRP()))) &&
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
        if (getVrpName() != null) {
            _hashCode += getVrpName().hashCode();
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
        if (getRpList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRpList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRpList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHubList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHubList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHubList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRootVRP() != null) {
            _hashCode += getRootVRP().hashCode();
        }
        if (getStaticVRP() != null) {
            _hashCode += getStaticVRP().hashCode();
        }
        if (getChangeVersion() != null) {
            _hashCode += getChangeVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualResourcePoolSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualResourcePoolSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrpId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vrpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrpName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vrpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VrpResourceAllocationInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rpList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hubList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootVRP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rootVRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticVRP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "staticVRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
