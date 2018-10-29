/**
 * ConverterSnapshotInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterSnapshotInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int snapshotId;

    private java.lang.String snapshotType;

    private java.lang.String backupType;

    private java.util.Calendar backupTime;

    private java.lang.String bitmapId;

    public ConverterSnapshotInfo() {
    }

    public ConverterSnapshotInfo(
           int snapshotId,
           java.lang.String snapshotType,
           java.lang.String backupType,
           java.util.Calendar backupTime,
           java.lang.String bitmapId) {
        this.snapshotId = snapshotId;
        this.snapshotType = snapshotType;
        this.backupType = backupType;
        this.backupTime = backupTime;
        this.bitmapId = bitmapId;
    }


    /**
     * Gets the snapshotId value for this ConverterSnapshotInfo.
     * 
     * @return snapshotId
     */
    public int getSnapshotId() {
        return snapshotId;
    }


    /**
     * Sets the snapshotId value for this ConverterSnapshotInfo.
     * 
     * @param snapshotId
     */
    public void setSnapshotId(int snapshotId) {
        this.snapshotId = snapshotId;
    }


    /**
     * Gets the snapshotType value for this ConverterSnapshotInfo.
     * 
     * @return snapshotType
     */
    public java.lang.String getSnapshotType() {
        return snapshotType;
    }


    /**
     * Sets the snapshotType value for this ConverterSnapshotInfo.
     * 
     * @param snapshotType
     */
    public void setSnapshotType(java.lang.String snapshotType) {
        this.snapshotType = snapshotType;
    }


    /**
     * Gets the backupType value for this ConverterSnapshotInfo.
     * 
     * @return backupType
     */
    public java.lang.String getBackupType() {
        return backupType;
    }


    /**
     * Sets the backupType value for this ConverterSnapshotInfo.
     * 
     * @param backupType
     */
    public void setBackupType(java.lang.String backupType) {
        this.backupType = backupType;
    }


    /**
     * Gets the backupTime value for this ConverterSnapshotInfo.
     * 
     * @return backupTime
     */
    public java.util.Calendar getBackupTime() {
        return backupTime;
    }


    /**
     * Sets the backupTime value for this ConverterSnapshotInfo.
     * 
     * @param backupTime
     */
    public void setBackupTime(java.util.Calendar backupTime) {
        this.backupTime = backupTime;
    }


    /**
     * Gets the bitmapId value for this ConverterSnapshotInfo.
     * 
     * @return bitmapId
     */
    public java.lang.String getBitmapId() {
        return bitmapId;
    }


    /**
     * Sets the bitmapId value for this ConverterSnapshotInfo.
     * 
     * @param bitmapId
     */
    public void setBitmapId(java.lang.String bitmapId) {
        this.bitmapId = bitmapId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterSnapshotInfo)) return false;
        ConverterSnapshotInfo other = (ConverterSnapshotInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.snapshotId == other.getSnapshotId() &&
            ((this.snapshotType==null && other.getSnapshotType()==null) || 
             (this.snapshotType!=null &&
              this.snapshotType.equals(other.getSnapshotType()))) &&
            ((this.backupType==null && other.getBackupType()==null) || 
             (this.backupType!=null &&
              this.backupType.equals(other.getBackupType()))) &&
            ((this.backupTime==null && other.getBackupTime()==null) || 
             (this.backupTime!=null &&
              this.backupTime.equals(other.getBackupTime()))) &&
            ((this.bitmapId==null && other.getBitmapId()==null) || 
             (this.bitmapId!=null &&
              this.bitmapId.equals(other.getBitmapId())));
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
        _hashCode += getSnapshotId();
        if (getSnapshotType() != null) {
            _hashCode += getSnapshotType().hashCode();
        }
        if (getBackupType() != null) {
            _hashCode += getBackupType().hashCode();
        }
        if (getBackupTime() != null) {
            _hashCode += getBackupTime().hashCode();
        }
        if (getBitmapId() != null) {
            _hashCode += getBitmapId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterSnapshotInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSnapshotInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "snapshotId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "snapshotType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "backupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "backupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitmapId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bitmapId"));
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
