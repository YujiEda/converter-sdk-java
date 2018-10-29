/**
 * ConverterEventFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEventFilterSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterEventFilterSpecByTime timeRange;

    private com.vmware.converter.ConverterEventFilterSpecByUsername userName;

    private java.lang.Integer eventChainId;

    private com.vmware.converter.ConverterEventType[] type;

    private java.lang.String[] typeId;

    private com.vmware.converter.ManagedObjectReference job;

    public ConverterEventFilterSpec() {
    }

    public ConverterEventFilterSpec(
           com.vmware.converter.ConverterEventFilterSpecByTime timeRange,
           com.vmware.converter.ConverterEventFilterSpecByUsername userName,
           java.lang.Integer eventChainId,
           com.vmware.converter.ConverterEventType[] type,
           java.lang.String[] typeId,
           com.vmware.converter.ManagedObjectReference job) {
        this.timeRange = timeRange;
        this.userName = userName;
        this.eventChainId = eventChainId;
        this.type = type;
        this.typeId = typeId;
        this.job = job;
    }


    /**
     * Gets the timeRange value for this ConverterEventFilterSpec.
     * 
     * @return timeRange
     */
    public com.vmware.converter.ConverterEventFilterSpecByTime getTimeRange() {
        return timeRange;
    }


    /**
     * Sets the timeRange value for this ConverterEventFilterSpec.
     * 
     * @param timeRange
     */
    public void setTimeRange(com.vmware.converter.ConverterEventFilterSpecByTime timeRange) {
        this.timeRange = timeRange;
    }


    /**
     * Gets the userName value for this ConverterEventFilterSpec.
     * 
     * @return userName
     */
    public com.vmware.converter.ConverterEventFilterSpecByUsername getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ConverterEventFilterSpec.
     * 
     * @param userName
     */
    public void setUserName(com.vmware.converter.ConverterEventFilterSpecByUsername userName) {
        this.userName = userName;
    }


    /**
     * Gets the eventChainId value for this ConverterEventFilterSpec.
     * 
     * @return eventChainId
     */
    public java.lang.Integer getEventChainId() {
        return eventChainId;
    }


    /**
     * Sets the eventChainId value for this ConverterEventFilterSpec.
     * 
     * @param eventChainId
     */
    public void setEventChainId(java.lang.Integer eventChainId) {
        this.eventChainId = eventChainId;
    }


    /**
     * Gets the type value for this ConverterEventFilterSpec.
     * 
     * @return type
     */
    public com.vmware.converter.ConverterEventType[] getType() {
        return type;
    }


    /**
     * Sets the type value for this ConverterEventFilterSpec.
     * 
     * @param type
     */
    public void setType(com.vmware.converter.ConverterEventType[] type) {
        this.type = type;
    }

    public com.vmware.converter.ConverterEventType getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.vmware.converter.ConverterEventType _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the typeId value for this ConverterEventFilterSpec.
     * 
     * @return typeId
     */
    public java.lang.String[] getTypeId() {
        return typeId;
    }


    /**
     * Sets the typeId value for this ConverterEventFilterSpec.
     * 
     * @param typeId
     */
    public void setTypeId(java.lang.String[] typeId) {
        this.typeId = typeId;
    }

    public java.lang.String getTypeId(int i) {
        return this.typeId[i];
    }

    public void setTypeId(int i, java.lang.String _value) {
        this.typeId[i] = _value;
    }


    /**
     * Gets the job value for this ConverterEventFilterSpec.
     * 
     * @return job
     */
    public com.vmware.converter.ManagedObjectReference getJob() {
        return job;
    }


    /**
     * Sets the job value for this ConverterEventFilterSpec.
     * 
     * @param job
     */
    public void setJob(com.vmware.converter.ManagedObjectReference job) {
        this.job = job;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEventFilterSpec)) return false;
        ConverterEventFilterSpec other = (ConverterEventFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeRange==null && other.getTimeRange()==null) || 
             (this.timeRange!=null &&
              this.timeRange.equals(other.getTimeRange()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.eventChainId==null && other.getEventChainId()==null) || 
             (this.eventChainId!=null &&
              this.eventChainId.equals(other.getEventChainId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.typeId==null && other.getTypeId()==null) || 
             (this.typeId!=null &&
              java.util.Arrays.equals(this.typeId, other.getTypeId()))) &&
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
        if (getTimeRange() != null) {
            _hashCode += getTimeRange().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getEventChainId() != null) {
            _hashCode += getEventChainId().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTypeId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterEventFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "timeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventFilterSpecByTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventFilterSpecByUsername"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "eventChainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "typeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
