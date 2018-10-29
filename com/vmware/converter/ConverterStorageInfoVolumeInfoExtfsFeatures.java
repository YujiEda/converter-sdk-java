/**
 * ConverterStorageInfoVolumeInfoExtfsFeatures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageInfoVolumeInfoExtfsFeatures  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean dirIndex;

    private boolean filetype;

    private boolean hasJournal;

    private boolean journalDev;

    private boolean resizeInode;

    private boolean sparseSuper;

    private java.lang.Boolean extent;

    private java.lang.Boolean flexBg;

    private java.lang.Boolean uninitBg;

    private java.lang.Long inodesCount;

    public ConverterStorageInfoVolumeInfoExtfsFeatures() {
    }

    public ConverterStorageInfoVolumeInfoExtfsFeatures(
           boolean dirIndex,
           boolean filetype,
           boolean hasJournal,
           boolean journalDev,
           boolean resizeInode,
           boolean sparseSuper,
           java.lang.Boolean extent,
           java.lang.Boolean flexBg,
           java.lang.Boolean uninitBg,
           java.lang.Long inodesCount) {
        this.dirIndex = dirIndex;
        this.filetype = filetype;
        this.hasJournal = hasJournal;
        this.journalDev = journalDev;
        this.resizeInode = resizeInode;
        this.sparseSuper = sparseSuper;
        this.extent = extent;
        this.flexBg = flexBg;
        this.uninitBg = uninitBg;
        this.inodesCount = inodesCount;
    }


    /**
     * Gets the dirIndex value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return dirIndex
     */
    public boolean isDirIndex() {
        return dirIndex;
    }


    /**
     * Sets the dirIndex value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param dirIndex
     */
    public void setDirIndex(boolean dirIndex) {
        this.dirIndex = dirIndex;
    }


    /**
     * Gets the filetype value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return filetype
     */
    public boolean isFiletype() {
        return filetype;
    }


    /**
     * Sets the filetype value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param filetype
     */
    public void setFiletype(boolean filetype) {
        this.filetype = filetype;
    }


    /**
     * Gets the hasJournal value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return hasJournal
     */
    public boolean isHasJournal() {
        return hasJournal;
    }


    /**
     * Sets the hasJournal value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param hasJournal
     */
    public void setHasJournal(boolean hasJournal) {
        this.hasJournal = hasJournal;
    }


    /**
     * Gets the journalDev value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return journalDev
     */
    public boolean isJournalDev() {
        return journalDev;
    }


    /**
     * Sets the journalDev value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param journalDev
     */
    public void setJournalDev(boolean journalDev) {
        this.journalDev = journalDev;
    }


    /**
     * Gets the resizeInode value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return resizeInode
     */
    public boolean isResizeInode() {
        return resizeInode;
    }


    /**
     * Sets the resizeInode value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param resizeInode
     */
    public void setResizeInode(boolean resizeInode) {
        this.resizeInode = resizeInode;
    }


    /**
     * Gets the sparseSuper value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return sparseSuper
     */
    public boolean isSparseSuper() {
        return sparseSuper;
    }


    /**
     * Sets the sparseSuper value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param sparseSuper
     */
    public void setSparseSuper(boolean sparseSuper) {
        this.sparseSuper = sparseSuper;
    }


    /**
     * Gets the extent value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return extent
     */
    public java.lang.Boolean getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param extent
     */
    public void setExtent(java.lang.Boolean extent) {
        this.extent = extent;
    }


    /**
     * Gets the flexBg value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return flexBg
     */
    public java.lang.Boolean getFlexBg() {
        return flexBg;
    }


    /**
     * Sets the flexBg value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param flexBg
     */
    public void setFlexBg(java.lang.Boolean flexBg) {
        this.flexBg = flexBg;
    }


    /**
     * Gets the uninitBg value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return uninitBg
     */
    public java.lang.Boolean getUninitBg() {
        return uninitBg;
    }


    /**
     * Sets the uninitBg value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param uninitBg
     */
    public void setUninitBg(java.lang.Boolean uninitBg) {
        this.uninitBg = uninitBg;
    }


    /**
     * Gets the inodesCount value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @return inodesCount
     */
    public java.lang.Long getInodesCount() {
        return inodesCount;
    }


    /**
     * Sets the inodesCount value for this ConverterStorageInfoVolumeInfoExtfsFeatures.
     * 
     * @param inodesCount
     */
    public void setInodesCount(java.lang.Long inodesCount) {
        this.inodesCount = inodesCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageInfoVolumeInfoExtfsFeatures)) return false;
        ConverterStorageInfoVolumeInfoExtfsFeatures other = (ConverterStorageInfoVolumeInfoExtfsFeatures) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.dirIndex == other.isDirIndex() &&
            this.filetype == other.isFiletype() &&
            this.hasJournal == other.isHasJournal() &&
            this.journalDev == other.isJournalDev() &&
            this.resizeInode == other.isResizeInode() &&
            this.sparseSuper == other.isSparseSuper() &&
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              this.extent.equals(other.getExtent()))) &&
            ((this.flexBg==null && other.getFlexBg()==null) || 
             (this.flexBg!=null &&
              this.flexBg.equals(other.getFlexBg()))) &&
            ((this.uninitBg==null && other.getUninitBg()==null) || 
             (this.uninitBg!=null &&
              this.uninitBg.equals(other.getUninitBg()))) &&
            ((this.inodesCount==null && other.getInodesCount()==null) || 
             (this.inodesCount!=null &&
              this.inodesCount.equals(other.getInodesCount())));
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
        _hashCode += (isDirIndex() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFiletype() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasJournal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isJournalDev() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isResizeInode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSparseSuper() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtent() != null) {
            _hashCode += getExtent().hashCode();
        }
        if (getFlexBg() != null) {
            _hashCode += getFlexBg().hashCode();
        }
        if (getUninitBg() != null) {
            _hashCode += getUninitBg().hashCode();
        }
        if (getInodesCount() != null) {
            _hashCode += getInodesCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageInfoVolumeInfoExtfsFeatures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageInfoVolumeInfoExtfsFeatures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dirIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filetype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "filetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasJournal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hasJournal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalDev");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "journalDev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resizeInode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resizeInode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparseSuper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sparseSuper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexBg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "flexBg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uninitBg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "uninitBg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inodesCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "inodesCount"));
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
