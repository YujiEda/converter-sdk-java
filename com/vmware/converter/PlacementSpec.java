/**
 * PlacementSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineMovePriority priority;

    private com.vmware.converter.ManagedObjectReference vm;

    private com.vmware.converter.VirtualMachineConfigSpec configSpec;

    private com.vmware.converter.VirtualMachineRelocateSpec relocateSpec;

    private com.vmware.converter.ManagedObjectReference[] hosts;

    private com.vmware.converter.ManagedObjectReference[] datastores;

    private com.vmware.converter.ManagedObjectReference[] storagePods;

    private java.lang.Boolean disallowPrerequisiteMoves;

    private com.vmware.converter.ClusterRuleInfo[] rules;

    private java.lang.String key;

    private java.lang.String placementType;

    private com.vmware.converter.VirtualMachineCloneSpec cloneSpec;

    private java.lang.String cloneName;

    public PlacementSpec() {
    }

    public PlacementSpec(
           com.vmware.converter.VirtualMachineMovePriority priority,
           com.vmware.converter.ManagedObjectReference vm,
           com.vmware.converter.VirtualMachineConfigSpec configSpec,
           com.vmware.converter.VirtualMachineRelocateSpec relocateSpec,
           com.vmware.converter.ManagedObjectReference[] hosts,
           com.vmware.converter.ManagedObjectReference[] datastores,
           com.vmware.converter.ManagedObjectReference[] storagePods,
           java.lang.Boolean disallowPrerequisiteMoves,
           com.vmware.converter.ClusterRuleInfo[] rules,
           java.lang.String key,
           java.lang.String placementType,
           com.vmware.converter.VirtualMachineCloneSpec cloneSpec,
           java.lang.String cloneName) {
        this.priority = priority;
        this.vm = vm;
        this.configSpec = configSpec;
        this.relocateSpec = relocateSpec;
        this.hosts = hosts;
        this.datastores = datastores;
        this.storagePods = storagePods;
        this.disallowPrerequisiteMoves = disallowPrerequisiteMoves;
        this.rules = rules;
        this.key = key;
        this.placementType = placementType;
        this.cloneSpec = cloneSpec;
        this.cloneName = cloneName;
    }


    /**
     * Gets the priority value for this PlacementSpec.
     * 
     * @return priority
     */
    public com.vmware.converter.VirtualMachineMovePriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PlacementSpec.
     * 
     * @param priority
     */
    public void setPriority(com.vmware.converter.VirtualMachineMovePriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the vm value for this PlacementSpec.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this PlacementSpec.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the configSpec value for this PlacementSpec.
     * 
     * @return configSpec
     */
    public com.vmware.converter.VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }


    /**
     * Sets the configSpec value for this PlacementSpec.
     * 
     * @param configSpec
     */
    public void setConfigSpec(com.vmware.converter.VirtualMachineConfigSpec configSpec) {
        this.configSpec = configSpec;
    }


    /**
     * Gets the relocateSpec value for this PlacementSpec.
     * 
     * @return relocateSpec
     */
    public com.vmware.converter.VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }


    /**
     * Sets the relocateSpec value for this PlacementSpec.
     * 
     * @param relocateSpec
     */
    public void setRelocateSpec(com.vmware.converter.VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }


    /**
     * Gets the hosts value for this PlacementSpec.
     * 
     * @return hosts
     */
    public com.vmware.converter.ManagedObjectReference[] getHosts() {
        return hosts;
    }


    /**
     * Sets the hosts value for this PlacementSpec.
     * 
     * @param hosts
     */
    public void setHosts(com.vmware.converter.ManagedObjectReference[] hosts) {
        this.hosts = hosts;
    }

    public com.vmware.converter.ManagedObjectReference getHosts(int i) {
        return this.hosts[i];
    }

    public void setHosts(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.hosts[i] = _value;
    }


    /**
     * Gets the datastores value for this PlacementSpec.
     * 
     * @return datastores
     */
    public com.vmware.converter.ManagedObjectReference[] getDatastores() {
        return datastores;
    }


    /**
     * Sets the datastores value for this PlacementSpec.
     * 
     * @param datastores
     */
    public void setDatastores(com.vmware.converter.ManagedObjectReference[] datastores) {
        this.datastores = datastores;
    }

    public com.vmware.converter.ManagedObjectReference getDatastores(int i) {
        return this.datastores[i];
    }

    public void setDatastores(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.datastores[i] = _value;
    }


    /**
     * Gets the storagePods value for this PlacementSpec.
     * 
     * @return storagePods
     */
    public com.vmware.converter.ManagedObjectReference[] getStoragePods() {
        return storagePods;
    }


    /**
     * Sets the storagePods value for this PlacementSpec.
     * 
     * @param storagePods
     */
    public void setStoragePods(com.vmware.converter.ManagedObjectReference[] storagePods) {
        this.storagePods = storagePods;
    }

    public com.vmware.converter.ManagedObjectReference getStoragePods(int i) {
        return this.storagePods[i];
    }

    public void setStoragePods(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.storagePods[i] = _value;
    }


    /**
     * Gets the disallowPrerequisiteMoves value for this PlacementSpec.
     * 
     * @return disallowPrerequisiteMoves
     */
    public java.lang.Boolean getDisallowPrerequisiteMoves() {
        return disallowPrerequisiteMoves;
    }


    /**
     * Sets the disallowPrerequisiteMoves value for this PlacementSpec.
     * 
     * @param disallowPrerequisiteMoves
     */
    public void setDisallowPrerequisiteMoves(java.lang.Boolean disallowPrerequisiteMoves) {
        this.disallowPrerequisiteMoves = disallowPrerequisiteMoves;
    }


    /**
     * Gets the rules value for this PlacementSpec.
     * 
     * @return rules
     */
    public com.vmware.converter.ClusterRuleInfo[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this PlacementSpec.
     * 
     * @param rules
     */
    public void setRules(com.vmware.converter.ClusterRuleInfo[] rules) {
        this.rules = rules;
    }

    public com.vmware.converter.ClusterRuleInfo getRules(int i) {
        return this.rules[i];
    }

    public void setRules(int i, com.vmware.converter.ClusterRuleInfo _value) {
        this.rules[i] = _value;
    }


    /**
     * Gets the key value for this PlacementSpec.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PlacementSpec.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the placementType value for this PlacementSpec.
     * 
     * @return placementType
     */
    public java.lang.String getPlacementType() {
        return placementType;
    }


    /**
     * Sets the placementType value for this PlacementSpec.
     * 
     * @param placementType
     */
    public void setPlacementType(java.lang.String placementType) {
        this.placementType = placementType;
    }


    /**
     * Gets the cloneSpec value for this PlacementSpec.
     * 
     * @return cloneSpec
     */
    public com.vmware.converter.VirtualMachineCloneSpec getCloneSpec() {
        return cloneSpec;
    }


    /**
     * Sets the cloneSpec value for this PlacementSpec.
     * 
     * @param cloneSpec
     */
    public void setCloneSpec(com.vmware.converter.VirtualMachineCloneSpec cloneSpec) {
        this.cloneSpec = cloneSpec;
    }


    /**
     * Gets the cloneName value for this PlacementSpec.
     * 
     * @return cloneName
     */
    public java.lang.String getCloneName() {
        return cloneName;
    }


    /**
     * Sets the cloneName value for this PlacementSpec.
     * 
     * @param cloneName
     */
    public void setCloneName(java.lang.String cloneName) {
        this.cloneName = cloneName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementSpec)) return false;
        PlacementSpec other = (PlacementSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.configSpec==null && other.getConfigSpec()==null) || 
             (this.configSpec!=null &&
              this.configSpec.equals(other.getConfigSpec()))) &&
            ((this.relocateSpec==null && other.getRelocateSpec()==null) || 
             (this.relocateSpec!=null &&
              this.relocateSpec.equals(other.getRelocateSpec()))) &&
            ((this.hosts==null && other.getHosts()==null) || 
             (this.hosts!=null &&
              java.util.Arrays.equals(this.hosts, other.getHosts()))) &&
            ((this.datastores==null && other.getDatastores()==null) || 
             (this.datastores!=null &&
              java.util.Arrays.equals(this.datastores, other.getDatastores()))) &&
            ((this.storagePods==null && other.getStoragePods()==null) || 
             (this.storagePods!=null &&
              java.util.Arrays.equals(this.storagePods, other.getStoragePods()))) &&
            ((this.disallowPrerequisiteMoves==null && other.getDisallowPrerequisiteMoves()==null) || 
             (this.disallowPrerequisiteMoves!=null &&
              this.disallowPrerequisiteMoves.equals(other.getDisallowPrerequisiteMoves()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.placementType==null && other.getPlacementType()==null) || 
             (this.placementType!=null &&
              this.placementType.equals(other.getPlacementType()))) &&
            ((this.cloneSpec==null && other.getCloneSpec()==null) || 
             (this.cloneSpec!=null &&
              this.cloneSpec.equals(other.getCloneSpec()))) &&
            ((this.cloneName==null && other.getCloneName()==null) || 
             (this.cloneName!=null &&
              this.cloneName.equals(other.getCloneName())));
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getConfigSpec() != null) {
            _hashCode += getConfigSpec().hashCode();
        }
        if (getRelocateSpec() != null) {
            _hashCode += getRelocateSpec().hashCode();
        }
        if (getHosts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHosts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHosts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoragePods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoragePods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoragePods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisallowPrerequisiteMoves() != null) {
            _hashCode += getDisallowPrerequisiteMoves().hashCode();
        }
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getPlacementType() != null) {
            _hashCode += getPlacementType().hashCode();
        }
        if (getCloneSpec() != null) {
            _hashCode += getCloneSpec().hashCode();
        }
        if (getCloneName() != null) {
            _hashCode += getCloneName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("hosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastores");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastores"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagePods");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storagePods"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disallowPrerequisiteMoves");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disallowPrerequisiteMoves"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "placementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
