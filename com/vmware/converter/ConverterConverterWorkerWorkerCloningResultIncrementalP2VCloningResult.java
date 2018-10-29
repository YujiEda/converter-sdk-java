/**
 * ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int backupSnapshotID;

    private java.util.Calendar cloningStartTime;

    private java.util.Calendar cloningEndTime;

    public ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult() {
    }

    public ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult(
           int backupSnapshotID,
           java.util.Calendar cloningStartTime,
           java.util.Calendar cloningEndTime) {
        this.backupSnapshotID = backupSnapshotID;
        this.cloningStartTime = cloningStartTime;
        this.cloningEndTime = cloningEndTime;
    }


    /**
     * Gets the backupSnapshotID value for this ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.
     * 
     * @return backupSnapshotID
     */
    public int getBackupSnapshotID() {
        return backupSnapshotID;
    }


    /**
     * Sets the backupSnapshotID value for this ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.
     * 
     * @param backupSnapshotID
     */
    public void setBackupSnapshotID(int backupSnapshotID) {
        this.backupSnapshotID = backupSnapshotID;
    }


    /**
     * Gets the cloningStartTime value for this ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.
     * 
     * @return cloningStartTime
     */
    public java.util.Calendar getCloningStartTime() {
        return cloningStartTime;
    }


    /**
     * Sets the cloningStartTime value for this ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.
     * 
     * @param cloningStartTime
     */
    public void setCloningStartTime(java.util.Calendar cloningStartTime) {
        this.cloningStartTime = cloningStartTime;
    }


    /**
     * Gets the cloningEndTime value for this ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.
     * 
     * @return cloningEndTime
     */
    public java.util.Calendar getCloningEndTime() {
        return cloningEndTime;
    }


    /**
     * Sets the cloningEndTime value for this ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.
     * 
     * @param cloningEndTime
     */
    public void setCloningEndTime(java.util.Calendar cloningEndTime) {
        this.cloningEndTime = cloningEndTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult)) return false;
        ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult other = (ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.backupSnapshotID == other.getBackupSnapshotID() &&
            ((this.cloningStartTime==null && other.getCloningStartTime()==null) || 
             (this.cloningStartTime!=null &&
              this.cloningStartTime.equals(other.getCloningStartTime()))) &&
            ((this.cloningEndTime==null && other.getCloningEndTime()==null) || 
             (this.cloningEndTime!=null &&
              this.cloningEndTime.equals(other.getCloningEndTime())));
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
        _hashCode += getBackupSnapshotID();
        if (getCloningStartTime() != null) {
            _hashCode += getCloningStartTime().hashCode();
        }
        if (getCloningEndTime() != null) {
            _hashCode += getCloningEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConverterWorkerWorkerCloningResultIncrementalP2VCloningResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupSnapshotID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "backupSnapshotID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
