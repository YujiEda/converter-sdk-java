/**
 * VirtualDiskSeSparseBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskSeSparseBackingInfo  extends com.vmware.converter.VirtualDeviceFileBackingInfo  implements java.io.Serializable {
    private java.lang.String diskMode;

    private java.lang.Boolean writeThrough;

    private java.lang.String uuid;

    private java.lang.String contentId;

    private java.lang.String changeId;

    private com.vmware.converter.VirtualDiskSeSparseBackingInfo parent;

    private java.lang.String deltaDiskFormat;

    private java.lang.Boolean digestEnabled;

    private java.lang.Integer grainSize;

    public VirtualDiskSeSparseBackingInfo() {
    }

    public VirtualDiskSeSparseBackingInfo(
           java.lang.String fileName,
           com.vmware.converter.ManagedObjectReference datastore,
           java.lang.String backingObjectId,
           java.lang.String diskMode,
           java.lang.Boolean writeThrough,
           java.lang.String uuid,
           java.lang.String contentId,
           java.lang.String changeId,
           com.vmware.converter.VirtualDiskSeSparseBackingInfo parent,
           java.lang.String deltaDiskFormat,
           java.lang.Boolean digestEnabled,
           java.lang.Integer grainSize) {
        super(
            fileName,
            datastore,
            backingObjectId);
        this.diskMode = diskMode;
        this.writeThrough = writeThrough;
        this.uuid = uuid;
        this.contentId = contentId;
        this.changeId = changeId;
        this.parent = parent;
        this.deltaDiskFormat = deltaDiskFormat;
        this.digestEnabled = digestEnabled;
        this.grainSize = grainSize;
    }


    /**
     * Gets the diskMode value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return diskMode
     */
    public java.lang.String getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param diskMode
     */
    public void setDiskMode(java.lang.String diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return writeThrough
     */
    public java.lang.Boolean getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(java.lang.Boolean writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the uuid value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the contentId value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return contentId
     */
    public java.lang.String getContentId() {
        return contentId;
    }


    /**
     * Sets the contentId value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param contentId
     */
    public void setContentId(java.lang.String contentId) {
        this.contentId = contentId;
    }


    /**
     * Gets the changeId value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return changeId
     */
    public java.lang.String getChangeId() {
        return changeId;
    }


    /**
     * Sets the changeId value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param changeId
     */
    public void setChangeId(java.lang.String changeId) {
        this.changeId = changeId;
    }


    /**
     * Gets the parent value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return parent
     */
    public com.vmware.converter.VirtualDiskSeSparseBackingInfo getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param parent
     */
    public void setParent(com.vmware.converter.VirtualDiskSeSparseBackingInfo parent) {
        this.parent = parent;
    }


    /**
     * Gets the deltaDiskFormat value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return deltaDiskFormat
     */
    public java.lang.String getDeltaDiskFormat() {
        return deltaDiskFormat;
    }


    /**
     * Sets the deltaDiskFormat value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param deltaDiskFormat
     */
    public void setDeltaDiskFormat(java.lang.String deltaDiskFormat) {
        this.deltaDiskFormat = deltaDiskFormat;
    }


    /**
     * Gets the digestEnabled value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return digestEnabled
     */
    public java.lang.Boolean getDigestEnabled() {
        return digestEnabled;
    }


    /**
     * Sets the digestEnabled value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param digestEnabled
     */
    public void setDigestEnabled(java.lang.Boolean digestEnabled) {
        this.digestEnabled = digestEnabled;
    }


    /**
     * Gets the grainSize value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @return grainSize
     */
    public java.lang.Integer getGrainSize() {
        return grainSize;
    }


    /**
     * Sets the grainSize value for this VirtualDiskSeSparseBackingInfo.
     * 
     * @param grainSize
     */
    public void setGrainSize(java.lang.Integer grainSize) {
        this.grainSize = grainSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskSeSparseBackingInfo)) return false;
        VirtualDiskSeSparseBackingInfo other = (VirtualDiskSeSparseBackingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskMode==null && other.getDiskMode()==null) || 
             (this.diskMode!=null &&
              this.diskMode.equals(other.getDiskMode()))) &&
            ((this.writeThrough==null && other.getWriteThrough()==null) || 
             (this.writeThrough!=null &&
              this.writeThrough.equals(other.getWriteThrough()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.contentId==null && other.getContentId()==null) || 
             (this.contentId!=null &&
              this.contentId.equals(other.getContentId()))) &&
            ((this.changeId==null && other.getChangeId()==null) || 
             (this.changeId!=null &&
              this.changeId.equals(other.getChangeId()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.deltaDiskFormat==null && other.getDeltaDiskFormat()==null) || 
             (this.deltaDiskFormat!=null &&
              this.deltaDiskFormat.equals(other.getDeltaDiskFormat()))) &&
            ((this.digestEnabled==null && other.getDigestEnabled()==null) || 
             (this.digestEnabled!=null &&
              this.digestEnabled.equals(other.getDigestEnabled()))) &&
            ((this.grainSize==null && other.getGrainSize()==null) || 
             (this.grainSize!=null &&
              this.grainSize.equals(other.getGrainSize())));
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
        if (getDiskMode() != null) {
            _hashCode += getDiskMode().hashCode();
        }
        if (getWriteThrough() != null) {
            _hashCode += getWriteThrough().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getContentId() != null) {
            _hashCode += getContentId().hashCode();
        }
        if (getChangeId() != null) {
            _hashCode += getChangeId().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getDeltaDiskFormat() != null) {
            _hashCode += getDeltaDiskFormat().hashCode();
        }
        if (getDigestEnabled() != null) {
            _hashCode += getDigestEnabled().hashCode();
        }
        if (getGrainSize() != null) {
            _hashCode += getGrainSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskSeSparseBackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskSeSparseBackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "writeThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "contentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskSeSparseBackingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "digestEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grainSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "grainSize"));
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
