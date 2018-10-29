/**
 * StorageProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageProfile  extends com.vmware.converter.ApplyProfile  implements java.io.Serializable {
    private com.vmware.converter.NasStorageProfile[] nasStorage;

    public StorageProfile() {
    }

    public StorageProfile(
           boolean enabled,
           com.vmware.converter.ProfilePolicy[] policy,
           java.lang.String profileTypeName,
           java.lang.String profileVersion,
           com.vmware.converter.ProfileApplyProfileProperty[] property,
           com.vmware.converter.NasStorageProfile[] nasStorage) {
        super(
            enabled,
            policy,
            profileTypeName,
            profileVersion,
            property);
        this.nasStorage = nasStorage;
    }


    /**
     * Gets the nasStorage value for this StorageProfile.
     * 
     * @return nasStorage
     */
    public com.vmware.converter.NasStorageProfile[] getNasStorage() {
        return nasStorage;
    }


    /**
     * Sets the nasStorage value for this StorageProfile.
     * 
     * @param nasStorage
     */
    public void setNasStorage(com.vmware.converter.NasStorageProfile[] nasStorage) {
        this.nasStorage = nasStorage;
    }

    public com.vmware.converter.NasStorageProfile getNasStorage(int i) {
        return this.nasStorage[i];
    }

    public void setNasStorage(int i, com.vmware.converter.NasStorageProfile _value) {
        this.nasStorage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageProfile)) return false;
        StorageProfile other = (StorageProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nasStorage==null && other.getNasStorage()==null) || 
             (this.nasStorage!=null &&
              java.util.Arrays.equals(this.nasStorage, other.getNasStorage())));
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
        if (getNasStorage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNasStorage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNasStorage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nasStorage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nasStorage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NasStorageProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
