/**
 * ArrayOfEntityBackupConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfEntityBackupConfig  implements java.io.Serializable {
    private com.vmware.converter.EntityBackupConfig[] entityBackupConfig;

    public ArrayOfEntityBackupConfig() {
    }

    public ArrayOfEntityBackupConfig(
           com.vmware.converter.EntityBackupConfig[] entityBackupConfig) {
           this.entityBackupConfig = entityBackupConfig;
    }


    /**
     * Gets the entityBackupConfig value for this ArrayOfEntityBackupConfig.
     * 
     * @return entityBackupConfig
     */
    public com.vmware.converter.EntityBackupConfig[] getEntityBackupConfig() {
        return entityBackupConfig;
    }


    /**
     * Sets the entityBackupConfig value for this ArrayOfEntityBackupConfig.
     * 
     * @param entityBackupConfig
     */
    public void setEntityBackupConfig(com.vmware.converter.EntityBackupConfig[] entityBackupConfig) {
        this.entityBackupConfig = entityBackupConfig;
    }

    public com.vmware.converter.EntityBackupConfig getEntityBackupConfig(int i) {
        return this.entityBackupConfig[i];
    }

    public void setEntityBackupConfig(int i, com.vmware.converter.EntityBackupConfig _value) {
        this.entityBackupConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEntityBackupConfig)) return false;
        ArrayOfEntityBackupConfig other = (ArrayOfEntityBackupConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityBackupConfig==null && other.getEntityBackupConfig()==null) || 
             (this.entityBackupConfig!=null &&
              java.util.Arrays.equals(this.entityBackupConfig, other.getEntityBackupConfig())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEntityBackupConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityBackupConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityBackupConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEntityBackupConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfEntityBackupConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityBackupConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "EntityBackupConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EntityBackupConfig"));
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
