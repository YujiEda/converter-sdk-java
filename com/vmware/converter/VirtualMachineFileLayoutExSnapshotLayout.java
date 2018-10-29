/**
 * VirtualMachineFileLayoutExSnapshotLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineFileLayoutExSnapshotLayout  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference key;

    private int dataKey;

    private java.lang.Integer memoryKey;

    private com.vmware.converter.VirtualMachineFileLayoutExDiskLayout[] disk;

    public VirtualMachineFileLayoutExSnapshotLayout() {
    }

    public VirtualMachineFileLayoutExSnapshotLayout(
           com.vmware.converter.ManagedObjectReference key,
           int dataKey,
           java.lang.Integer memoryKey,
           com.vmware.converter.VirtualMachineFileLayoutExDiskLayout[] disk) {
        this.key = key;
        this.dataKey = dataKey;
        this.memoryKey = memoryKey;
        this.disk = disk;
    }


    /**
     * Gets the key value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @return key
     */
    public com.vmware.converter.ManagedObjectReference getKey() {
        return key;
    }


    /**
     * Sets the key value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @param key
     */
    public void setKey(com.vmware.converter.ManagedObjectReference key) {
        this.key = key;
    }


    /**
     * Gets the dataKey value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @return dataKey
     */
    public int getDataKey() {
        return dataKey;
    }


    /**
     * Sets the dataKey value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @param dataKey
     */
    public void setDataKey(int dataKey) {
        this.dataKey = dataKey;
    }


    /**
     * Gets the memoryKey value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @return memoryKey
     */
    public java.lang.Integer getMemoryKey() {
        return memoryKey;
    }


    /**
     * Sets the memoryKey value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @param memoryKey
     */
    public void setMemoryKey(java.lang.Integer memoryKey) {
        this.memoryKey = memoryKey;
    }


    /**
     * Gets the disk value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @return disk
     */
    public com.vmware.converter.VirtualMachineFileLayoutExDiskLayout[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VirtualMachineFileLayoutExSnapshotLayout.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.VirtualMachineFileLayoutExDiskLayout[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.VirtualMachineFileLayoutExDiskLayout getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.VirtualMachineFileLayoutExDiskLayout _value) {
        this.disk[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFileLayoutExSnapshotLayout)) return false;
        VirtualMachineFileLayoutExSnapshotLayout other = (VirtualMachineFileLayoutExSnapshotLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            this.dataKey == other.getDataKey() &&
            ((this.memoryKey==null && other.getMemoryKey()==null) || 
             (this.memoryKey!=null &&
              this.memoryKey.equals(other.getMemoryKey()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        _hashCode += getDataKey();
        if (getMemoryKey() != null) {
            _hashCode += getMemoryKey().hashCode();
        }
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineFileLayoutExSnapshotLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExSnapshotLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dataKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExDiskLayout"));
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
