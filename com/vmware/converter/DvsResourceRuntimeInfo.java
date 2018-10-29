/**
 * DvsResourceRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsResourceRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer capacity;

    private java.lang.Integer usage;

    private java.lang.Integer available;

    private com.vmware.converter.DvsVnicAllocatedResource[] allocatedResource;

    private com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] vmVnicNetworkResourcePoolRuntime;

    public DvsResourceRuntimeInfo() {
    }

    public DvsResourceRuntimeInfo(
           java.lang.Integer capacity,
           java.lang.Integer usage,
           java.lang.Integer available,
           com.vmware.converter.DvsVnicAllocatedResource[] allocatedResource,
           com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] vmVnicNetworkResourcePoolRuntime) {
        this.capacity = capacity;
        this.usage = usage;
        this.available = available;
        this.allocatedResource = allocatedResource;
        this.vmVnicNetworkResourcePoolRuntime = vmVnicNetworkResourcePoolRuntime;
    }


    /**
     * Gets the capacity value for this DvsResourceRuntimeInfo.
     * 
     * @return capacity
     */
    public java.lang.Integer getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this DvsResourceRuntimeInfo.
     * 
     * @param capacity
     */
    public void setCapacity(java.lang.Integer capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the usage value for this DvsResourceRuntimeInfo.
     * 
     * @return usage
     */
    public java.lang.Integer getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this DvsResourceRuntimeInfo.
     * 
     * @param usage
     */
    public void setUsage(java.lang.Integer usage) {
        this.usage = usage;
    }


    /**
     * Gets the available value for this DvsResourceRuntimeInfo.
     * 
     * @return available
     */
    public java.lang.Integer getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this DvsResourceRuntimeInfo.
     * 
     * @param available
     */
    public void setAvailable(java.lang.Integer available) {
        this.available = available;
    }


    /**
     * Gets the allocatedResource value for this DvsResourceRuntimeInfo.
     * 
     * @return allocatedResource
     */
    public com.vmware.converter.DvsVnicAllocatedResource[] getAllocatedResource() {
        return allocatedResource;
    }


    /**
     * Sets the allocatedResource value for this DvsResourceRuntimeInfo.
     * 
     * @param allocatedResource
     */
    public void setAllocatedResource(com.vmware.converter.DvsVnicAllocatedResource[] allocatedResource) {
        this.allocatedResource = allocatedResource;
    }

    public com.vmware.converter.DvsVnicAllocatedResource getAllocatedResource(int i) {
        return this.allocatedResource[i];
    }

    public void setAllocatedResource(int i, com.vmware.converter.DvsVnicAllocatedResource _value) {
        this.allocatedResource[i] = _value;
    }


    /**
     * Gets the vmVnicNetworkResourcePoolRuntime value for this DvsResourceRuntimeInfo.
     * 
     * @return vmVnicNetworkResourcePoolRuntime
     */
    public com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] getVmVnicNetworkResourcePoolRuntime() {
        return vmVnicNetworkResourcePoolRuntime;
    }


    /**
     * Sets the vmVnicNetworkResourcePoolRuntime value for this DvsResourceRuntimeInfo.
     * 
     * @param vmVnicNetworkResourcePoolRuntime
     */
    public void setVmVnicNetworkResourcePoolRuntime(com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo[] vmVnicNetworkResourcePoolRuntime) {
        this.vmVnicNetworkResourcePoolRuntime = vmVnicNetworkResourcePoolRuntime;
    }

    public com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo getVmVnicNetworkResourcePoolRuntime(int i) {
        return this.vmVnicNetworkResourcePoolRuntime[i];
    }

    public void setVmVnicNetworkResourcePoolRuntime(int i, com.vmware.converter.DvsVmVnicNetworkResourcePoolRuntimeInfo _value) {
        this.vmVnicNetworkResourcePoolRuntime[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsResourceRuntimeInfo)) return false;
        DvsResourceRuntimeInfo other = (DvsResourceRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              this.available.equals(other.getAvailable()))) &&
            ((this.allocatedResource==null && other.getAllocatedResource()==null) || 
             (this.allocatedResource!=null &&
              java.util.Arrays.equals(this.allocatedResource, other.getAllocatedResource()))) &&
            ((this.vmVnicNetworkResourcePoolRuntime==null && other.getVmVnicNetworkResourcePoolRuntime()==null) || 
             (this.vmVnicNetworkResourcePoolRuntime!=null &&
              java.util.Arrays.equals(this.vmVnicNetworkResourcePoolRuntime, other.getVmVnicNetworkResourcePoolRuntime())));
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
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getAvailable() != null) {
            _hashCode += getAvailable().hashCode();
        }
        if (getAllocatedResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllocatedResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllocatedResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVmVnicNetworkResourcePoolRuntime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmVnicNetworkResourcePoolRuntime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmVnicNetworkResourcePoolRuntime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsResourceRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsResourceRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocatedResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allocatedResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsVnicAllocatedResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmVnicNetworkResourcePoolRuntime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmVnicNetworkResourcePoolRuntime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsVmVnicNetworkResourcePoolRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
