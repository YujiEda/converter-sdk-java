/**
 * ConverterServerConversionConversionJobInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerConversionConversionJobInfo  extends com.vmware.converter.ConverterServerJobJobInfo  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference job;

    private com.vmware.converter.ConverterComputerSpec targetVm;

    private com.vmware.converter.ManagedObjectReference scheduledTask;

    private java.lang.String source;

    private java.lang.String target;

    private java.lang.Boolean editable;

    private java.lang.String descriptionId;

    public ConverterServerConversionConversionJobInfo() {
    }

    public ConverterServerConversionConversionJobInfo(
           java.lang.String key,
           java.lang.String owner,
           java.lang.String state,
           com.vmware.converter.ManagedObjectReference activeTask,
           java.util.Calendar creationTime,
           java.util.Calendar lastModifiedTime,
           com.vmware.converter.LocalizedMethodFault mostRecentError,
           int numConsecutiveErrors,
           java.util.Calendar lastRunStartTime,
           java.util.Calendar lastRunCompleteTime,
           java.util.Calendar nextRunStartTime,
           com.vmware.converter.ManagedObjectReference job,
           com.vmware.converter.ConverterComputerSpec targetVm,
           com.vmware.converter.ManagedObjectReference scheduledTask,
           java.lang.String source,
           java.lang.String target,
           java.lang.Boolean editable,
           java.lang.String descriptionId) {
        super(
            key,
            owner,
            state,
            activeTask,
            creationTime,
            lastModifiedTime,
            mostRecentError,
            numConsecutiveErrors,
            lastRunStartTime,
            lastRunCompleteTime,
            nextRunStartTime);
        this.job = job;
        this.targetVm = targetVm;
        this.scheduledTask = scheduledTask;
        this.source = source;
        this.target = target;
        this.editable = editable;
        this.descriptionId = descriptionId;
    }


    /**
     * Gets the job value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return job
     */
    public com.vmware.converter.ManagedObjectReference getJob() {
        return job;
    }


    /**
     * Sets the job value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param job
     */
    public void setJob(com.vmware.converter.ManagedObjectReference job) {
        this.job = job;
    }


    /**
     * Gets the targetVm value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return targetVm
     */
    public com.vmware.converter.ConverterComputerSpec getTargetVm() {
        return targetVm;
    }


    /**
     * Sets the targetVm value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param targetVm
     */
    public void setTargetVm(com.vmware.converter.ConverterComputerSpec targetVm) {
        this.targetVm = targetVm;
    }


    /**
     * Gets the scheduledTask value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return scheduledTask
     */
    public com.vmware.converter.ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }


    /**
     * Sets the scheduledTask value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param scheduledTask
     */
    public void setScheduledTask(com.vmware.converter.ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }


    /**
     * Gets the source value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the target value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the editable value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return editable
     */
    public java.lang.Boolean getEditable() {
        return editable;
    }


    /**
     * Sets the editable value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param editable
     */
    public void setEditable(java.lang.Boolean editable) {
        this.editable = editable;
    }


    /**
     * Gets the descriptionId value for this ConverterServerConversionConversionJobInfo.
     * 
     * @return descriptionId
     */
    public java.lang.String getDescriptionId() {
        return descriptionId;
    }


    /**
     * Sets the descriptionId value for this ConverterServerConversionConversionJobInfo.
     * 
     * @param descriptionId
     */
    public void setDescriptionId(java.lang.String descriptionId) {
        this.descriptionId = descriptionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerConversionConversionJobInfo)) return false;
        ConverterServerConversionConversionJobInfo other = (ConverterServerConversionConversionJobInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.targetVm==null && other.getTargetVm()==null) || 
             (this.targetVm!=null &&
              this.targetVm.equals(other.getTargetVm()))) &&
            ((this.scheduledTask==null && other.getScheduledTask()==null) || 
             (this.scheduledTask!=null &&
              this.scheduledTask.equals(other.getScheduledTask()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.editable==null && other.getEditable()==null) || 
             (this.editable!=null &&
              this.editable.equals(other.getEditable()))) &&
            ((this.descriptionId==null && other.getDescriptionId()==null) || 
             (this.descriptionId!=null &&
              this.descriptionId.equals(other.getDescriptionId())));
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
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getTargetVm() != null) {
            _hashCode += getTargetVm().hashCode();
        }
        if (getScheduledTask() != null) {
            _hashCode += getScheduledTask().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getEditable() != null) {
            _hashCode += getEditable().hashCode();
        }
        if (getDescriptionId() != null) {
            _hashCode += getDescriptionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerConversionConversionJobInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionConversionJobInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "scheduledTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "editable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "descriptionId"));
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
