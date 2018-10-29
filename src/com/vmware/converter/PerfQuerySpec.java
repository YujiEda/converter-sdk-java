/**
 * PerfQuerySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PerfQuerySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference entity;

    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private java.lang.Integer maxSample;

    private com.vmware.converter.PerfMetricId[] metricId;

    private java.lang.Integer intervalId;

    private java.lang.String format;

    public PerfQuerySpec() {
    }

    public PerfQuerySpec(
           com.vmware.converter.ManagedObjectReference entity,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           java.lang.Integer maxSample,
           com.vmware.converter.PerfMetricId[] metricId,
           java.lang.Integer intervalId,
           java.lang.String format) {
        this.entity = entity;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxSample = maxSample;
        this.metricId = metricId;
        this.intervalId = intervalId;
        this.format = format;
    }


    /**
     * Gets the entity value for this PerfQuerySpec.
     * 
     * @return entity
     */
    public com.vmware.converter.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PerfQuerySpec.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.converter.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the startTime value for this PerfQuerySpec.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this PerfQuerySpec.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this PerfQuerySpec.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this PerfQuerySpec.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the maxSample value for this PerfQuerySpec.
     * 
     * @return maxSample
     */
    public java.lang.Integer getMaxSample() {
        return maxSample;
    }


    /**
     * Sets the maxSample value for this PerfQuerySpec.
     * 
     * @param maxSample
     */
    public void setMaxSample(java.lang.Integer maxSample) {
        this.maxSample = maxSample;
    }


    /**
     * Gets the metricId value for this PerfQuerySpec.
     * 
     * @return metricId
     */
    public com.vmware.converter.PerfMetricId[] getMetricId() {
        return metricId;
    }


    /**
     * Sets the metricId value for this PerfQuerySpec.
     * 
     * @param metricId
     */
    public void setMetricId(com.vmware.converter.PerfMetricId[] metricId) {
        this.metricId = metricId;
    }

    public com.vmware.converter.PerfMetricId getMetricId(int i) {
        return this.metricId[i];
    }

    public void setMetricId(int i, com.vmware.converter.PerfMetricId _value) {
        this.metricId[i] = _value;
    }


    /**
     * Gets the intervalId value for this PerfQuerySpec.
     * 
     * @return intervalId
     */
    public java.lang.Integer getIntervalId() {
        return intervalId;
    }


    /**
     * Sets the intervalId value for this PerfQuerySpec.
     * 
     * @param intervalId
     */
    public void setIntervalId(java.lang.Integer intervalId) {
        this.intervalId = intervalId;
    }


    /**
     * Gets the format value for this PerfQuerySpec.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this PerfQuerySpec.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerfQuerySpec)) return false;
        PerfQuerySpec other = (PerfQuerySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.maxSample==null && other.getMaxSample()==null) || 
             (this.maxSample!=null &&
              this.maxSample.equals(other.getMaxSample()))) &&
            ((this.metricId==null && other.getMetricId()==null) || 
             (this.metricId!=null &&
              java.util.Arrays.equals(this.metricId, other.getMetricId()))) &&
            ((this.intervalId==null && other.getIntervalId()==null) || 
             (this.intervalId!=null &&
              this.intervalId.equals(other.getIntervalId()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat())));
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getMaxSample() != null) {
            _hashCode += getMaxSample().hashCode();
        }
        if (getMetricId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntervalId() != null) {
            _hashCode += getIntervalId().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerfQuerySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfQuerySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSample");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSample"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "metricId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfMetricId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "intervalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "format"));
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
