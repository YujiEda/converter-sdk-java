/**
 * ConverterIncrementalP2VCloningParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterIncrementalP2VCloningParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer prevBackupSnapshotID;

    private long cloningIteration;

    private boolean finalIteration;

    public ConverterIncrementalP2VCloningParams() {
    }

    public ConverterIncrementalP2VCloningParams(
           java.lang.Integer prevBackupSnapshotID,
           long cloningIteration,
           boolean finalIteration) {
        this.prevBackupSnapshotID = prevBackupSnapshotID;
        this.cloningIteration = cloningIteration;
        this.finalIteration = finalIteration;
    }


    /**
     * Gets the prevBackupSnapshotID value for this ConverterIncrementalP2VCloningParams.
     * 
     * @return prevBackupSnapshotID
     */
    public java.lang.Integer getPrevBackupSnapshotID() {
        return prevBackupSnapshotID;
    }


    /**
     * Sets the prevBackupSnapshotID value for this ConverterIncrementalP2VCloningParams.
     * 
     * @param prevBackupSnapshotID
     */
    public void setPrevBackupSnapshotID(java.lang.Integer prevBackupSnapshotID) {
        this.prevBackupSnapshotID = prevBackupSnapshotID;
    }


    /**
     * Gets the cloningIteration value for this ConverterIncrementalP2VCloningParams.
     * 
     * @return cloningIteration
     */
    public long getCloningIteration() {
        return cloningIteration;
    }


    /**
     * Sets the cloningIteration value for this ConverterIncrementalP2VCloningParams.
     * 
     * @param cloningIteration
     */
    public void setCloningIteration(long cloningIteration) {
        this.cloningIteration = cloningIteration;
    }


    /**
     * Gets the finalIteration value for this ConverterIncrementalP2VCloningParams.
     * 
     * @return finalIteration
     */
    public boolean isFinalIteration() {
        return finalIteration;
    }


    /**
     * Sets the finalIteration value for this ConverterIncrementalP2VCloningParams.
     * 
     * @param finalIteration
     */
    public void setFinalIteration(boolean finalIteration) {
        this.finalIteration = finalIteration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterIncrementalP2VCloningParams)) return false;
        ConverterIncrementalP2VCloningParams other = (ConverterIncrementalP2VCloningParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prevBackupSnapshotID==null && other.getPrevBackupSnapshotID()==null) || 
             (this.prevBackupSnapshotID!=null &&
              this.prevBackupSnapshotID.equals(other.getPrevBackupSnapshotID()))) &&
            this.cloningIteration == other.getCloningIteration() &&
            this.finalIteration == other.isFinalIteration();
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
        if (getPrevBackupSnapshotID() != null) {
            _hashCode += getPrevBackupSnapshotID().hashCode();
        }
        _hashCode += new Long(getCloningIteration()).hashCode();
        _hashCode += (isFinalIteration() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterIncrementalP2VCloningParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterIncrementalP2VCloningParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevBackupSnapshotID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "prevBackupSnapshotID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningIteration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningIteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalIteration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "finalIteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
