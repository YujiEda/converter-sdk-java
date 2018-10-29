/**
 * HbrManagerReplicationVmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HbrManagerReplicationVmInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String state;

    private com.vmware.converter.ReplicationVmProgressInfo progressInfo;

    private java.lang.String imageId;

    private com.vmware.converter.LocalizedMethodFault lastError;

    public HbrManagerReplicationVmInfo() {
    }

    public HbrManagerReplicationVmInfo(
           java.lang.String state,
           com.vmware.converter.ReplicationVmProgressInfo progressInfo,
           java.lang.String imageId,
           com.vmware.converter.LocalizedMethodFault lastError) {
        this.state = state;
        this.progressInfo = progressInfo;
        this.imageId = imageId;
        this.lastError = lastError;
    }


    /**
     * Gets the state value for this HbrManagerReplicationVmInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this HbrManagerReplicationVmInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the progressInfo value for this HbrManagerReplicationVmInfo.
     * 
     * @return progressInfo
     */
    public com.vmware.converter.ReplicationVmProgressInfo getProgressInfo() {
        return progressInfo;
    }


    /**
     * Sets the progressInfo value for this HbrManagerReplicationVmInfo.
     * 
     * @param progressInfo
     */
    public void setProgressInfo(com.vmware.converter.ReplicationVmProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
    }


    /**
     * Gets the imageId value for this HbrManagerReplicationVmInfo.
     * 
     * @return imageId
     */
    public java.lang.String getImageId() {
        return imageId;
    }


    /**
     * Sets the imageId value for this HbrManagerReplicationVmInfo.
     * 
     * @param imageId
     */
    public void setImageId(java.lang.String imageId) {
        this.imageId = imageId;
    }


    /**
     * Gets the lastError value for this HbrManagerReplicationVmInfo.
     * 
     * @return lastError
     */
    public com.vmware.converter.LocalizedMethodFault getLastError() {
        return lastError;
    }


    /**
     * Sets the lastError value for this HbrManagerReplicationVmInfo.
     * 
     * @param lastError
     */
    public void setLastError(com.vmware.converter.LocalizedMethodFault lastError) {
        this.lastError = lastError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HbrManagerReplicationVmInfo)) return false;
        HbrManagerReplicationVmInfo other = (HbrManagerReplicationVmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.progressInfo==null && other.getProgressInfo()==null) || 
             (this.progressInfo!=null &&
              this.progressInfo.equals(other.getProgressInfo()))) &&
            ((this.imageId==null && other.getImageId()==null) || 
             (this.imageId!=null &&
              this.imageId.equals(other.getImageId()))) &&
            ((this.lastError==null && other.getLastError()==null) || 
             (this.lastError!=null &&
              this.lastError.equals(other.getLastError())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getProgressInfo() != null) {
            _hashCode += getProgressInfo().hashCode();
        }
        if (getImageId() != null) {
            _hashCode += getImageId().hashCode();
        }
        if (getLastError() != null) {
            _hashCode += getLastError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HbrManagerReplicationVmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HbrManagerReplicationVmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "progressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationVmProgressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "imageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastError"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
