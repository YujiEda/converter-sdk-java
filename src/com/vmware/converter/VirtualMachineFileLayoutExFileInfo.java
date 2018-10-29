/**
 * VirtualMachineFileLayoutExFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineFileLayoutExFileInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int key;

    private java.lang.String name;

    private java.lang.String type;

    private long size;

    private java.lang.Long uniqueSize;

    private java.lang.String backingObjectId;

    private java.lang.Boolean accessible;

    public VirtualMachineFileLayoutExFileInfo() {
    }

    public VirtualMachineFileLayoutExFileInfo(
           int key,
           java.lang.String name,
           java.lang.String type,
           long size,
           java.lang.Long uniqueSize,
           java.lang.String backingObjectId,
           java.lang.Boolean accessible) {
        this.key = key;
        this.name = name;
        this.type = type;
        this.size = size;
        this.uniqueSize = uniqueSize;
        this.backingObjectId = backingObjectId;
        this.accessible = accessible;
    }


    /**
     * Gets the key value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the name value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the size value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the uniqueSize value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return uniqueSize
     */
    public java.lang.Long getUniqueSize() {
        return uniqueSize;
    }


    /**
     * Sets the uniqueSize value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param uniqueSize
     */
    public void setUniqueSize(java.lang.Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }


    /**
     * Gets the backingObjectId value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return backingObjectId
     */
    public java.lang.String getBackingObjectId() {
        return backingObjectId;
    }


    /**
     * Sets the backingObjectId value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param backingObjectId
     */
    public void setBackingObjectId(java.lang.String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }


    /**
     * Gets the accessible value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @return accessible
     */
    public java.lang.Boolean getAccessible() {
        return accessible;
    }


    /**
     * Sets the accessible value for this VirtualMachineFileLayoutExFileInfo.
     * 
     * @param accessible
     */
    public void setAccessible(java.lang.Boolean accessible) {
        this.accessible = accessible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFileLayoutExFileInfo)) return false;
        VirtualMachineFileLayoutExFileInfo other = (VirtualMachineFileLayoutExFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.size == other.getSize() &&
            ((this.uniqueSize==null && other.getUniqueSize()==null) || 
             (this.uniqueSize!=null &&
              this.uniqueSize.equals(other.getUniqueSize()))) &&
            ((this.backingObjectId==null && other.getBackingObjectId()==null) || 
             (this.backingObjectId!=null &&
              this.backingObjectId.equals(other.getBackingObjectId()))) &&
            ((this.accessible==null && other.getAccessible()==null) || 
             (this.accessible!=null &&
              this.accessible.equals(other.getAccessible())));
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
        _hashCode += getKey();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        if (getUniqueSize() != null) {
            _hashCode += getUniqueSize().hashCode();
        }
        if (getBackingObjectId() != null) {
            _hashCode += getBackingObjectId().hashCode();
        }
        if (getAccessible() != null) {
            _hashCode += getAccessible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineFileLayoutExFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uniqueSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backingObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backingObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
