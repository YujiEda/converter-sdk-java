/**
 * EntityBackupConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EntityBackupConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String entityType;

    private byte[] configBlob;

    private java.lang.String key;

    private java.lang.String name;

    private com.vmware.converter.ManagedObjectReference container;

    private java.lang.String configVersion;

    public EntityBackupConfig() {
    }

    public EntityBackupConfig(
           java.lang.String entityType,
           byte[] configBlob,
           java.lang.String key,
           java.lang.String name,
           com.vmware.converter.ManagedObjectReference container,
           java.lang.String configVersion) {
        this.entityType = entityType;
        this.configBlob = configBlob;
        this.key = key;
        this.name = name;
        this.container = container;
        this.configVersion = configVersion;
    }


    /**
     * Gets the entityType value for this EntityBackupConfig.
     * 
     * @return entityType
     */
    public java.lang.String getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this EntityBackupConfig.
     * 
     * @param entityType
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the configBlob value for this EntityBackupConfig.
     * 
     * @return configBlob
     */
    public byte[] getConfigBlob() {
        return configBlob;
    }


    /**
     * Sets the configBlob value for this EntityBackupConfig.
     * 
     * @param configBlob
     */
    public void setConfigBlob(byte[] configBlob) {
        this.configBlob = configBlob;
    }


    /**
     * Gets the key value for this EntityBackupConfig.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this EntityBackupConfig.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this EntityBackupConfig.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EntityBackupConfig.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the container value for this EntityBackupConfig.
     * 
     * @return container
     */
    public com.vmware.converter.ManagedObjectReference getContainer() {
        return container;
    }


    /**
     * Sets the container value for this EntityBackupConfig.
     * 
     * @param container
     */
    public void setContainer(com.vmware.converter.ManagedObjectReference container) {
        this.container = container;
    }


    /**
     * Gets the configVersion value for this EntityBackupConfig.
     * 
     * @return configVersion
     */
    public java.lang.String getConfigVersion() {
        return configVersion;
    }


    /**
     * Sets the configVersion value for this EntityBackupConfig.
     * 
     * @param configVersion
     */
    public void setConfigVersion(java.lang.String configVersion) {
        this.configVersion = configVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityBackupConfig)) return false;
        EntityBackupConfig other = (EntityBackupConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.configBlob==null && other.getConfigBlob()==null) || 
             (this.configBlob!=null &&
              java.util.Arrays.equals(this.configBlob, other.getConfigBlob()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            ((this.configVersion==null && other.getConfigVersion()==null) || 
             (this.configVersion!=null &&
              this.configVersion.equals(other.getConfigVersion())));
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
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getConfigBlob() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigBlob());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigBlob(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        if (getConfigVersion() != null) {
            _hashCode += getConfigVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityBackupConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EntityBackupConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configBlob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configBlob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "container"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
