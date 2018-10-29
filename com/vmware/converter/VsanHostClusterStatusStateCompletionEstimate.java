/**
 * VsanHostClusterStatusStateCompletionEstimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostClusterStatusStateCompletionEstimate  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.util.Calendar completeTime;

    private java.lang.Integer percentComplete;

    public VsanHostClusterStatusStateCompletionEstimate() {
    }

    public VsanHostClusterStatusStateCompletionEstimate(
           java.util.Calendar completeTime,
           java.lang.Integer percentComplete) {
        this.completeTime = completeTime;
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the completeTime value for this VsanHostClusterStatusStateCompletionEstimate.
     * 
     * @return completeTime
     */
    public java.util.Calendar getCompleteTime() {
        return completeTime;
    }


    /**
     * Sets the completeTime value for this VsanHostClusterStatusStateCompletionEstimate.
     * 
     * @param completeTime
     */
    public void setCompleteTime(java.util.Calendar completeTime) {
        this.completeTime = completeTime;
    }


    /**
     * Gets the percentComplete value for this VsanHostClusterStatusStateCompletionEstimate.
     * 
     * @return percentComplete
     */
    public java.lang.Integer getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this VsanHostClusterStatusStateCompletionEstimate.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Integer percentComplete) {
        this.percentComplete = percentComplete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostClusterStatusStateCompletionEstimate)) return false;
        VsanHostClusterStatusStateCompletionEstimate other = (VsanHostClusterStatusStateCompletionEstimate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.completeTime==null && other.getCompleteTime()==null) || 
             (this.completeTime!=null &&
              this.completeTime.equals(other.getCompleteTime()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete())));
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
        if (getCompleteTime() != null) {
            _hashCode += getCompleteTime().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostClusterStatusStateCompletionEstimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostClusterStatusStateCompletionEstimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "completeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "percentComplete"));
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
