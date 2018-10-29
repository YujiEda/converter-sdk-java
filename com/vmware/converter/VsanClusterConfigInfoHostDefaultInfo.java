/**
 * VsanClusterConfigInfoHostDefaultInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanClusterConfigInfoHostDefaultInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String uuid;

    private java.lang.Boolean autoClaimStorage;

    private java.lang.Boolean checksumEnabled;

    public VsanClusterConfigInfoHostDefaultInfo() {
    }

    public VsanClusterConfigInfoHostDefaultInfo(
           java.lang.String uuid,
           java.lang.Boolean autoClaimStorage,
           java.lang.Boolean checksumEnabled) {
        this.uuid = uuid;
        this.autoClaimStorage = autoClaimStorage;
        this.checksumEnabled = checksumEnabled;
    }


    /**
     * Gets the uuid value for this VsanClusterConfigInfoHostDefaultInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VsanClusterConfigInfoHostDefaultInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the autoClaimStorage value for this VsanClusterConfigInfoHostDefaultInfo.
     * 
     * @return autoClaimStorage
     */
    public java.lang.Boolean getAutoClaimStorage() {
        return autoClaimStorage;
    }


    /**
     * Sets the autoClaimStorage value for this VsanClusterConfigInfoHostDefaultInfo.
     * 
     * @param autoClaimStorage
     */
    public void setAutoClaimStorage(java.lang.Boolean autoClaimStorage) {
        this.autoClaimStorage = autoClaimStorage;
    }


    /**
     * Gets the checksumEnabled value for this VsanClusterConfigInfoHostDefaultInfo.
     * 
     * @return checksumEnabled
     */
    public java.lang.Boolean getChecksumEnabled() {
        return checksumEnabled;
    }


    /**
     * Sets the checksumEnabled value for this VsanClusterConfigInfoHostDefaultInfo.
     * 
     * @param checksumEnabled
     */
    public void setChecksumEnabled(java.lang.Boolean checksumEnabled) {
        this.checksumEnabled = checksumEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanClusterConfigInfoHostDefaultInfo)) return false;
        VsanClusterConfigInfoHostDefaultInfo other = (VsanClusterConfigInfoHostDefaultInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.autoClaimStorage==null && other.getAutoClaimStorage()==null) || 
             (this.autoClaimStorage!=null &&
              this.autoClaimStorage.equals(other.getAutoClaimStorage()))) &&
            ((this.checksumEnabled==null && other.getChecksumEnabled()==null) || 
             (this.checksumEnabled!=null &&
              this.checksumEnabled.equals(other.getChecksumEnabled())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getAutoClaimStorage() != null) {
            _hashCode += getAutoClaimStorage().hashCode();
        }
        if (getChecksumEnabled() != null) {
            _hashCode += getChecksumEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanClusterConfigInfoHostDefaultInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanClusterConfigInfoHostDefaultInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoClaimStorage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoClaimStorage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checksumEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checksumEnabled"));
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
