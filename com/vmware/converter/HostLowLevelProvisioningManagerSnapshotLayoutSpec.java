/**
 * HostLowLevelProvisioningManagerSnapshotLayoutSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLowLevelProvisioningManagerSnapshotLayoutSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int id;

    private java.lang.String srcFilename;

    private java.lang.String dstFilename;

    private com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] disk;

    public HostLowLevelProvisioningManagerSnapshotLayoutSpec() {
    }

    public HostLowLevelProvisioningManagerSnapshotLayoutSpec(
           int id,
           java.lang.String srcFilename,
           java.lang.String dstFilename,
           com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] disk) {
        this.id = id;
        this.srcFilename = srcFilename;
        this.dstFilename = dstFilename;
        this.disk = disk;
    }


    /**
     * Gets the id value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the srcFilename value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @return srcFilename
     */
    public java.lang.String getSrcFilename() {
        return srcFilename;
    }


    /**
     * Sets the srcFilename value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @param srcFilename
     */
    public void setSrcFilename(java.lang.String srcFilename) {
        this.srcFilename = srcFilename;
    }


    /**
     * Gets the dstFilename value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @return dstFilename
     */
    public java.lang.String getDstFilename() {
        return dstFilename;
    }


    /**
     * Sets the dstFilename value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @param dstFilename
     */
    public void setDstFilename(java.lang.String dstFilename) {
        this.dstFilename = dstFilename;
    }


    /**
     * Gets the disk value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @return disk
     */
    public com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this HostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec _value) {
        this.disk[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLowLevelProvisioningManagerSnapshotLayoutSpec)) return false;
        HostLowLevelProvisioningManagerSnapshotLayoutSpec other = (HostLowLevelProvisioningManagerSnapshotLayoutSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.id == other.getId() &&
            ((this.srcFilename==null && other.getSrcFilename()==null) || 
             (this.srcFilename!=null &&
              this.srcFilename.equals(other.getSrcFilename()))) &&
            ((this.dstFilename==null && other.getDstFilename()==null) || 
             (this.dstFilename!=null &&
              this.dstFilename.equals(other.getDstFilename()))) &&
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
        _hashCode += getId();
        if (getSrcFilename() != null) {
            _hashCode += getSrcFilename().hashCode();
        }
        if (getDstFilename() != null) {
            _hashCode += getDstFilename().hashCode();
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
        new org.apache.axis.description.TypeDesc(HostLowLevelProvisioningManagerSnapshotLayoutSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerSnapshotLayoutSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "srcFilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dstFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dstFilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerDiskLayoutSpec"));
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
