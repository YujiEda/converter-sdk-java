/**
 * StorageResourceManagerStorageProfileStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageResourceManagerStorageProfileStatistics  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String profileId;

    private long totalSpaceMB;

    private long usedSpaceMB;

    public StorageResourceManagerStorageProfileStatistics() {
    }

    public StorageResourceManagerStorageProfileStatistics(
           java.lang.String profileId,
           long totalSpaceMB,
           long usedSpaceMB) {
        this.profileId = profileId;
        this.totalSpaceMB = totalSpaceMB;
        this.usedSpaceMB = usedSpaceMB;
    }


    /**
     * Gets the profileId value for this StorageResourceManagerStorageProfileStatistics.
     * 
     * @return profileId
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this StorageResourceManagerStorageProfileStatistics.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the totalSpaceMB value for this StorageResourceManagerStorageProfileStatistics.
     * 
     * @return totalSpaceMB
     */
    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }


    /**
     * Sets the totalSpaceMB value for this StorageResourceManagerStorageProfileStatistics.
     * 
     * @param totalSpaceMB
     */
    public void setTotalSpaceMB(long totalSpaceMB) {
        this.totalSpaceMB = totalSpaceMB;
    }


    /**
     * Gets the usedSpaceMB value for this StorageResourceManagerStorageProfileStatistics.
     * 
     * @return usedSpaceMB
     */
    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }


    /**
     * Sets the usedSpaceMB value for this StorageResourceManagerStorageProfileStatistics.
     * 
     * @param usedSpaceMB
     */
    public void setUsedSpaceMB(long usedSpaceMB) {
        this.usedSpaceMB = usedSpaceMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageResourceManagerStorageProfileStatistics)) return false;
        StorageResourceManagerStorageProfileStatistics other = (StorageResourceManagerStorageProfileStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            this.totalSpaceMB == other.getTotalSpaceMB() &&
            this.usedSpaceMB == other.getUsedSpaceMB();
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
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        _hashCode += new Long(getTotalSpaceMB()).hashCode();
        _hashCode += new Long(getUsedSpaceMB()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageResourceManagerStorageProfileStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageResourceManagerStorageProfileStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSpaceMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalSpaceMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedSpaceMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usedSpaceMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
