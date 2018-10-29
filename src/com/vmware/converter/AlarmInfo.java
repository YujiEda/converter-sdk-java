/**
 * AlarmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AlarmInfo  extends com.vmware.converter.AlarmSpec  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.converter.ManagedObjectReference alarm;

    private com.vmware.converter.ManagedObjectReference entity;

    private java.util.Calendar lastModifiedTime;

    private java.lang.String lastModifiedUser;

    private int creationEventId;

    public AlarmInfo() {
    }

    public AlarmInfo(
           java.lang.String name,
           java.lang.String systemName,
           java.lang.String description,
           boolean enabled,
           com.vmware.converter.AlarmExpression expression,
           com.vmware.converter.AlarmAction action,
           java.lang.Integer actionFrequency,
           com.vmware.converter.AlarmSetting setting,
           java.lang.String key,
           com.vmware.converter.ManagedObjectReference alarm,
           com.vmware.converter.ManagedObjectReference entity,
           java.util.Calendar lastModifiedTime,
           java.lang.String lastModifiedUser,
           int creationEventId) {
        super(
            name,
            systemName,
            description,
            enabled,
            expression,
            action,
            actionFrequency,
            setting);
        this.key = key;
        this.alarm = alarm;
        this.entity = entity;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedUser = lastModifiedUser;
        this.creationEventId = creationEventId;
    }


    /**
     * Gets the key value for this AlarmInfo.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this AlarmInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the alarm value for this AlarmInfo.
     * 
     * @return alarm
     */
    public com.vmware.converter.ManagedObjectReference getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this AlarmInfo.
     * 
     * @param alarm
     */
    public void setAlarm(com.vmware.converter.ManagedObjectReference alarm) {
        this.alarm = alarm;
    }


    /**
     * Gets the entity value for this AlarmInfo.
     * 
     * @return entity
     */
    public com.vmware.converter.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this AlarmInfo.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.converter.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the lastModifiedTime value for this AlarmInfo.
     * 
     * @return lastModifiedTime
     */
    public java.util.Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }


    /**
     * Sets the lastModifiedTime value for this AlarmInfo.
     * 
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(java.util.Calendar lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }


    /**
     * Gets the lastModifiedUser value for this AlarmInfo.
     * 
     * @return lastModifiedUser
     */
    public java.lang.String getLastModifiedUser() {
        return lastModifiedUser;
    }


    /**
     * Sets the lastModifiedUser value for this AlarmInfo.
     * 
     * @param lastModifiedUser
     */
    public void setLastModifiedUser(java.lang.String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }


    /**
     * Gets the creationEventId value for this AlarmInfo.
     * 
     * @return creationEventId
     */
    public int getCreationEventId() {
        return creationEventId;
    }


    /**
     * Sets the creationEventId value for this AlarmInfo.
     * 
     * @param creationEventId
     */
    public void setCreationEventId(int creationEventId) {
        this.creationEventId = creationEventId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmInfo)) return false;
        AlarmInfo other = (AlarmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.lastModifiedTime==null && other.getLastModifiedTime()==null) || 
             (this.lastModifiedTime!=null &&
              this.lastModifiedTime.equals(other.getLastModifiedTime()))) &&
            ((this.lastModifiedUser==null && other.getLastModifiedUser()==null) || 
             (this.lastModifiedUser!=null &&
              this.lastModifiedUser.equals(other.getLastModifiedUser()))) &&
            this.creationEventId == other.getCreationEventId();
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getLastModifiedTime() != null) {
            _hashCode += getLastModifiedTime().hashCode();
        }
        if (getLastModifiedUser() != null) {
            _hashCode += getLastModifiedUser().hashCode();
        }
        _hashCode += getCreationEventId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastModifiedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastModifiedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "creationEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
