/**
 * ConverterTaskFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTaskFilterSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterTaskFilterSpecByTime timeRange;

    private com.vmware.converter.ConverterTaskFilterSpecByUsername userName;

    private com.vmware.converter.ConverterTaskInfoState[] state;

    private java.lang.String[] descriptionId;

    private com.vmware.converter.ManagedObjectReference job;

    private java.lang.Boolean rootTaskOnly;

    private com.vmware.converter.ManagedObjectReference[] parentTask;

    private com.vmware.converter.ManagedObjectReference[] rootTask;

    public ConverterTaskFilterSpec() {
    }

    public ConverterTaskFilterSpec(
           com.vmware.converter.ConverterTaskFilterSpecByTime timeRange,
           com.vmware.converter.ConverterTaskFilterSpecByUsername userName,
           com.vmware.converter.ConverterTaskInfoState[] state,
           java.lang.String[] descriptionId,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.Boolean rootTaskOnly,
           com.vmware.converter.ManagedObjectReference[] parentTask,
           com.vmware.converter.ManagedObjectReference[] rootTask) {
        this.timeRange = timeRange;
        this.userName = userName;
        this.state = state;
        this.descriptionId = descriptionId;
        this.job = job;
        this.rootTaskOnly = rootTaskOnly;
        this.parentTask = parentTask;
        this.rootTask = rootTask;
    }


    /**
     * Gets the timeRange value for this ConverterTaskFilterSpec.
     * 
     * @return timeRange
     */
    public com.vmware.converter.ConverterTaskFilterSpecByTime getTimeRange() {
        return timeRange;
    }


    /**
     * Sets the timeRange value for this ConverterTaskFilterSpec.
     * 
     * @param timeRange
     */
    public void setTimeRange(com.vmware.converter.ConverterTaskFilterSpecByTime timeRange) {
        this.timeRange = timeRange;
    }


    /**
     * Gets the userName value for this ConverterTaskFilterSpec.
     * 
     * @return userName
     */
    public com.vmware.converter.ConverterTaskFilterSpecByUsername getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ConverterTaskFilterSpec.
     * 
     * @param userName
     */
    public void setUserName(com.vmware.converter.ConverterTaskFilterSpecByUsername userName) {
        this.userName = userName;
    }


    /**
     * Gets the state value for this ConverterTaskFilterSpec.
     * 
     * @return state
     */
    public com.vmware.converter.ConverterTaskInfoState[] getState() {
        return state;
    }


    /**
     * Sets the state value for this ConverterTaskFilterSpec.
     * 
     * @param state
     */
    public void setState(com.vmware.converter.ConverterTaskInfoState[] state) {
        this.state = state;
    }

    public com.vmware.converter.ConverterTaskInfoState getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.vmware.converter.ConverterTaskInfoState _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the descriptionId value for this ConverterTaskFilterSpec.
     * 
     * @return descriptionId
     */
    public java.lang.String[] getDescriptionId() {
        return descriptionId;
    }


    /**
     * Sets the descriptionId value for this ConverterTaskFilterSpec.
     * 
     * @param descriptionId
     */
    public void setDescriptionId(java.lang.String[] descriptionId) {
        this.descriptionId = descriptionId;
    }

    public java.lang.String getDescriptionId(int i) {
        return this.descriptionId[i];
    }

    public void setDescriptionId(int i, java.lang.String _value) {
        this.descriptionId[i] = _value;
    }


    /**
     * Gets the job value for this ConverterTaskFilterSpec.
     * 
     * @return job
     */
    public com.vmware.converter.ManagedObjectReference getJob() {
        return job;
    }


    /**
     * Sets the job value for this ConverterTaskFilterSpec.
     * 
     * @param job
     */
    public void setJob(com.vmware.converter.ManagedObjectReference job) {
        this.job = job;
    }


    /**
     * Gets the rootTaskOnly value for this ConverterTaskFilterSpec.
     * 
     * @return rootTaskOnly
     */
    public java.lang.Boolean getRootTaskOnly() {
        return rootTaskOnly;
    }


    /**
     * Sets the rootTaskOnly value for this ConverterTaskFilterSpec.
     * 
     * @param rootTaskOnly
     */
    public void setRootTaskOnly(java.lang.Boolean rootTaskOnly) {
        this.rootTaskOnly = rootTaskOnly;
    }


    /**
     * Gets the parentTask value for this ConverterTaskFilterSpec.
     * 
     * @return parentTask
     */
    public com.vmware.converter.ManagedObjectReference[] getParentTask() {
        return parentTask;
    }


    /**
     * Sets the parentTask value for this ConverterTaskFilterSpec.
     * 
     * @param parentTask
     */
    public void setParentTask(com.vmware.converter.ManagedObjectReference[] parentTask) {
        this.parentTask = parentTask;
    }

    public com.vmware.converter.ManagedObjectReference getParentTask(int i) {
        return this.parentTask[i];
    }

    public void setParentTask(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.parentTask[i] = _value;
    }


    /**
     * Gets the rootTask value for this ConverterTaskFilterSpec.
     * 
     * @return rootTask
     */
    public com.vmware.converter.ManagedObjectReference[] getRootTask() {
        return rootTask;
    }


    /**
     * Sets the rootTask value for this ConverterTaskFilterSpec.
     * 
     * @param rootTask
     */
    public void setRootTask(com.vmware.converter.ManagedObjectReference[] rootTask) {
        this.rootTask = rootTask;
    }

    public com.vmware.converter.ManagedObjectReference getRootTask(int i) {
        return this.rootTask[i];
    }

    public void setRootTask(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.rootTask[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterTaskFilterSpec)) return false;
        ConverterTaskFilterSpec other = (ConverterTaskFilterSpec) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.descriptionId==null && other.getDescriptionId()==null) || 
             (this.descriptionId!=null &&
              java.util.Arrays.equals(this.descriptionId, other.getDescriptionId()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.rootTaskOnly==null && other.getRootTaskOnly()==null) || 
             (this.rootTaskOnly!=null &&
              this.rootTaskOnly.equals(other.getRootTaskOnly()))) &&
            ((this.parentTask==null && other.getParentTask()==null) || 
             (this.parentTask!=null &&
              java.util.Arrays.equals(this.parentTask, other.getParentTask()))) &&
            ((this.rootTask==null && other.getRootTask()==null) || 
             (this.rootTask!=null &&
              java.util.Arrays.equals(this.rootTask, other.getRootTask())));
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
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescriptionId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescriptionId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescriptionId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getRootTaskOnly() != null) {
            _hashCode += getRootTaskOnly().hashCode();
        }
        if (getParentTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentTask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRootTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRootTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRootTask(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterTaskFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "timeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskFilterSpecByTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskFilterSpecByUsername"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskInfoState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "descriptionId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootTaskOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "rootTaskOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "parentTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "rootTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
