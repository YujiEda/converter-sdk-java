/**
 * VirtualDiskConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskConfigSpec  extends com.vmware.converter.VirtualDeviceConfigSpec  implements java.io.Serializable {
    private java.lang.String diskMoveType;

    private java.lang.Boolean migrateCache;

    public VirtualDiskConfigSpec() {
    }

    public VirtualDiskConfigSpec(
           com.vmware.converter.VirtualDeviceConfigSpecOperation operation,
           com.vmware.converter.VirtualDeviceConfigSpecFileOperation fileOperation,
           com.vmware.converter.VirtualDevice device,
           com.vmware.converter.VirtualMachineProfileSpec[] profile,
           java.lang.String diskMoveType,
           java.lang.Boolean migrateCache) {
        super(
            operation,
            fileOperation,
            device,
            profile);
        this.diskMoveType = diskMoveType;
        this.migrateCache = migrateCache;
    }


    /**
     * Gets the diskMoveType value for this VirtualDiskConfigSpec.
     * 
     * @return diskMoveType
     */
    public java.lang.String getDiskMoveType() {
        return diskMoveType;
    }


    /**
     * Sets the diskMoveType value for this VirtualDiskConfigSpec.
     * 
     * @param diskMoveType
     */
    public void setDiskMoveType(java.lang.String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }


    /**
     * Gets the migrateCache value for this VirtualDiskConfigSpec.
     * 
     * @return migrateCache
     */
    public java.lang.Boolean getMigrateCache() {
        return migrateCache;
    }


    /**
     * Sets the migrateCache value for this VirtualDiskConfigSpec.
     * 
     * @param migrateCache
     */
    public void setMigrateCache(java.lang.Boolean migrateCache) {
        this.migrateCache = migrateCache;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskConfigSpec)) return false;
        VirtualDiskConfigSpec other = (VirtualDiskConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskMoveType==null && other.getDiskMoveType()==null) || 
             (this.diskMoveType!=null &&
              this.diskMoveType.equals(other.getDiskMoveType()))) &&
            ((this.migrateCache==null && other.getMigrateCache()==null) || 
             (this.migrateCache!=null &&
              this.migrateCache.equals(other.getMigrateCache())));
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
        if (getDiskMoveType() != null) {
            _hashCode += getDiskMoveType().hashCode();
        }
        if (getMigrateCache() != null) {
            _hashCode += getMigrateCache().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMoveType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMoveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migrateCache");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "migrateCache"));
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
