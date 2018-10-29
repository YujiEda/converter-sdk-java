/**
 * HostLowLevelProvisioningManagerVmMigrationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLowLevelProvisioningManagerVmMigrationStatus  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long migrationId;

    private java.lang.String type;

    private boolean source;

    private boolean consideredSuccessful;

    public HostLowLevelProvisioningManagerVmMigrationStatus() {
    }

    public HostLowLevelProvisioningManagerVmMigrationStatus(
           long migrationId,
           java.lang.String type,
           boolean source,
           boolean consideredSuccessful) {
        this.migrationId = migrationId;
        this.type = type;
        this.source = source;
        this.consideredSuccessful = consideredSuccessful;
    }


    /**
     * Gets the migrationId value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @return migrationId
     */
    public long getMigrationId() {
        return migrationId;
    }


    /**
     * Sets the migrationId value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @param migrationId
     */
    public void setMigrationId(long migrationId) {
        this.migrationId = migrationId;
    }


    /**
     * Gets the type value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the source value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @return source
     */
    public boolean isSource() {
        return source;
    }


    /**
     * Sets the source value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @param source
     */
    public void setSource(boolean source) {
        this.source = source;
    }


    /**
     * Gets the consideredSuccessful value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @return consideredSuccessful
     */
    public boolean isConsideredSuccessful() {
        return consideredSuccessful;
    }


    /**
     * Sets the consideredSuccessful value for this HostLowLevelProvisioningManagerVmMigrationStatus.
     * 
     * @param consideredSuccessful
     */
    public void setConsideredSuccessful(boolean consideredSuccessful) {
        this.consideredSuccessful = consideredSuccessful;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLowLevelProvisioningManagerVmMigrationStatus)) return false;
        HostLowLevelProvisioningManagerVmMigrationStatus other = (HostLowLevelProvisioningManagerVmMigrationStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.migrationId == other.getMigrationId() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.source == other.isSource() &&
            this.consideredSuccessful == other.isConsideredSuccessful();
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
        _hashCode += new Long(getMigrationId()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isSource() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConsideredSuccessful() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostLowLevelProvisioningManagerVmMigrationStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerVmMigrationStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migrationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "migrationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consideredSuccessful");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consideredSuccessful"));
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
