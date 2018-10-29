/**
 * VsanHostRuntimeInfoDiskIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostRuntimeInfoDiskIssue  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String diskId;

    private java.lang.String issue;

    public VsanHostRuntimeInfoDiskIssue() {
    }

    public VsanHostRuntimeInfoDiskIssue(
           java.lang.String diskId,
           java.lang.String issue) {
        this.diskId = diskId;
        this.issue = issue;
    }


    /**
     * Gets the diskId value for this VsanHostRuntimeInfoDiskIssue.
     * 
     * @return diskId
     */
    public java.lang.String getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this VsanHostRuntimeInfoDiskIssue.
     * 
     * @param diskId
     */
    public void setDiskId(java.lang.String diskId) {
        this.diskId = diskId;
    }


    /**
     * Gets the issue value for this VsanHostRuntimeInfoDiskIssue.
     * 
     * @return issue
     */
    public java.lang.String getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this VsanHostRuntimeInfoDiskIssue.
     * 
     * @param issue
     */
    public void setIssue(java.lang.String issue) {
        this.issue = issue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostRuntimeInfoDiskIssue)) return false;
        VsanHostRuntimeInfoDiskIssue other = (VsanHostRuntimeInfoDiskIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskId==null && other.getDiskId()==null) || 
             (this.diskId!=null &&
              this.diskId.equals(other.getDiskId()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue())));
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
        if (getDiskId() != null) {
            _hashCode += getDiskId().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostRuntimeInfoDiskIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostRuntimeInfoDiskIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
