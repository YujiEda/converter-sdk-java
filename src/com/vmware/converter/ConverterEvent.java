/**
 * ConverterEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEvent  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int key;

    private int chainId;

    private com.vmware.converter.ConverterEventType type;

    private java.util.Calendar createdTime;

    private java.lang.String userName;

    private java.lang.String fullMessage;

    private com.vmware.converter.ManagedObjectReference job;

    public ConverterEvent() {
    }

    public ConverterEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job) {
        this.key = key;
        this.chainId = chainId;
        this.type = type;
        this.createdTime = createdTime;
        this.userName = userName;
        this.fullMessage = fullMessage;
        this.job = job;
    }


    /**
     * Gets the key value for this ConverterEvent.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterEvent.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the chainId value for this ConverterEvent.
     * 
     * @return chainId
     */
    public int getChainId() {
        return chainId;
    }


    /**
     * Sets the chainId value for this ConverterEvent.
     * 
     * @param chainId
     */
    public void setChainId(int chainId) {
        this.chainId = chainId;
    }


    /**
     * Gets the type value for this ConverterEvent.
     * 
     * @return type
     */
    public com.vmware.converter.ConverterEventType getType() {
        return type;
    }


    /**
     * Sets the type value for this ConverterEvent.
     * 
     * @param type
     */
    public void setType(com.vmware.converter.ConverterEventType type) {
        this.type = type;
    }


    /**
     * Gets the createdTime value for this ConverterEvent.
     * 
     * @return createdTime
     */
    public java.util.Calendar getCreatedTime() {
        return createdTime;
    }


    /**
     * Sets the createdTime value for this ConverterEvent.
     * 
     * @param createdTime
     */
    public void setCreatedTime(java.util.Calendar createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * Gets the userName value for this ConverterEvent.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ConverterEvent.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the fullMessage value for this ConverterEvent.
     * 
     * @return fullMessage
     */
    public java.lang.String getFullMessage() {
        return fullMessage;
    }


    /**
     * Sets the fullMessage value for this ConverterEvent.
     * 
     * @param fullMessage
     */
    public void setFullMessage(java.lang.String fullMessage) {
        this.fullMessage = fullMessage;
    }


    /**
     * Gets the job value for this ConverterEvent.
     * 
     * @return job
     */
    public com.vmware.converter.ManagedObjectReference getJob() {
        return job;
    }


    /**
     * Sets the job value for this ConverterEvent.
     * 
     * @param job
     */
    public void setJob(com.vmware.converter.ManagedObjectReference job) {
        this.job = job;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEvent)) return false;
        ConverterEvent other = (ConverterEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            this.chainId == other.getChainId() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.createdTime==null && other.getCreatedTime()==null) || 
             (this.createdTime!=null &&
              this.createdTime.equals(other.getCreatedTime()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.fullMessage==null && other.getFullMessage()==null) || 
             (this.fullMessage!=null &&
              this.fullMessage.equals(other.getFullMessage()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob())));
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
        _hashCode += getKey();
        _hashCode += getChainId();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCreatedTime() != null) {
            _hashCode += getCreatedTime().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFullMessage() != null) {
            _hashCode += getFullMessage().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "chainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "createdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "fullMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
