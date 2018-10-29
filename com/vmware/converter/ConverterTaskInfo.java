/**
 * ConverterTaskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterTaskInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.converter.ManagedObjectReference task;

    private java.lang.String name;

    private java.lang.String descriptionId;

    private java.lang.String userName;

    private java.lang.String source;

    private java.lang.String target;

    private com.vmware.converter.ConverterTaskInfoState state;

    private boolean cancelled;

    private boolean cancelable;

    private java.lang.Object data;

    private com.vmware.converter.LocalizedMethodFault error;

    private java.lang.Object result;

    private java.lang.Integer progress;

    private java.lang.Integer estimatedTimeRemaining;

    private java.lang.Integer transferRate;

    private java.util.Calendar queueTime;

    private java.util.Calendar startTime;

    private java.util.Calendar completeTime;

    private int eventChainId;

    private com.vmware.converter.ManagedObjectReference vcTask;

    private com.vmware.converter.ConverterDiagnosticManagerTaskLogBundleInfo logBundleInfo;

    private com.vmware.converter.ManagedObjectReference job;

    private java.lang.Boolean hasChildren;

    private com.vmware.converter.ManagedObjectReference parentTask;

    private com.vmware.converter.ManagedObjectReference rootTask;

    private java.lang.Boolean incremental;

    public ConverterTaskInfo() {
    }

    public ConverterTaskInfo(
           java.lang.String key,
           com.vmware.converter.ManagedObjectReference task,
           java.lang.String name,
           java.lang.String descriptionId,
           java.lang.String userName,
           java.lang.String source,
           java.lang.String target,
           com.vmware.converter.ConverterTaskInfoState state,
           boolean cancelled,
           boolean cancelable,
           java.lang.Object data,
           com.vmware.converter.LocalizedMethodFault error,
           java.lang.Object result,
           java.lang.Integer progress,
           java.lang.Integer estimatedTimeRemaining,
           java.lang.Integer transferRate,
           java.util.Calendar queueTime,
           java.util.Calendar startTime,
           java.util.Calendar completeTime,
           int eventChainId,
           com.vmware.converter.ManagedObjectReference vcTask,
           com.vmware.converter.ConverterDiagnosticManagerTaskLogBundleInfo logBundleInfo,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.Boolean hasChildren,
           com.vmware.converter.ManagedObjectReference parentTask,
           com.vmware.converter.ManagedObjectReference rootTask,
           java.lang.Boolean incremental) {
        this.key = key;
        this.task = task;
        this.name = name;
        this.descriptionId = descriptionId;
        this.userName = userName;
        this.source = source;
        this.target = target;
        this.state = state;
        this.cancelled = cancelled;
        this.cancelable = cancelable;
        this.data = data;
        this.error = error;
        this.result = result;
        this.progress = progress;
        this.estimatedTimeRemaining = estimatedTimeRemaining;
        this.transferRate = transferRate;
        this.queueTime = queueTime;
        this.startTime = startTime;
        this.completeTime = completeTime;
        this.eventChainId = eventChainId;
        this.vcTask = vcTask;
        this.logBundleInfo = logBundleInfo;
        this.job = job;
        this.hasChildren = hasChildren;
        this.parentTask = parentTask;
        this.rootTask = rootTask;
        this.incremental = incremental;
    }


    /**
     * Gets the key value for this ConverterTaskInfo.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterTaskInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the task value for this ConverterTaskInfo.
     * 
     * @return task
     */
    public com.vmware.converter.ManagedObjectReference getTask() {
        return task;
    }


    /**
     * Sets the task value for this ConverterTaskInfo.
     * 
     * @param task
     */
    public void setTask(com.vmware.converter.ManagedObjectReference task) {
        this.task = task;
    }


    /**
     * Gets the name value for this ConverterTaskInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConverterTaskInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the descriptionId value for this ConverterTaskInfo.
     * 
     * @return descriptionId
     */
    public java.lang.String getDescriptionId() {
        return descriptionId;
    }


    /**
     * Sets the descriptionId value for this ConverterTaskInfo.
     * 
     * @param descriptionId
     */
    public void setDescriptionId(java.lang.String descriptionId) {
        this.descriptionId = descriptionId;
    }


    /**
     * Gets the userName value for this ConverterTaskInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ConverterTaskInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the source value for this ConverterTaskInfo.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterTaskInfo.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the target value for this ConverterTaskInfo.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterTaskInfo.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the state value for this ConverterTaskInfo.
     * 
     * @return state
     */
    public com.vmware.converter.ConverterTaskInfoState getState() {
        return state;
    }


    /**
     * Sets the state value for this ConverterTaskInfo.
     * 
     * @param state
     */
    public void setState(com.vmware.converter.ConverterTaskInfoState state) {
        this.state = state;
    }


    /**
     * Gets the cancelled value for this ConverterTaskInfo.
     * 
     * @return cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this ConverterTaskInfo.
     * 
     * @param cancelled
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the cancelable value for this ConverterTaskInfo.
     * 
     * @return cancelable
     */
    public boolean isCancelable() {
        return cancelable;
    }


    /**
     * Sets the cancelable value for this ConverterTaskInfo.
     * 
     * @param cancelable
     */
    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }


    /**
     * Gets the data value for this ConverterTaskInfo.
     * 
     * @return data
     */
    public java.lang.Object getData() {
        return data;
    }


    /**
     * Sets the data value for this ConverterTaskInfo.
     * 
     * @param data
     */
    public void setData(java.lang.Object data) {
        this.data = data;
    }


    /**
     * Gets the error value for this ConverterTaskInfo.
     * 
     * @return error
     */
    public com.vmware.converter.LocalizedMethodFault getError() {
        return error;
    }


    /**
     * Sets the error value for this ConverterTaskInfo.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.LocalizedMethodFault error) {
        this.error = error;
    }


    /**
     * Gets the result value for this ConverterTaskInfo.
     * 
     * @return result
     */
    public java.lang.Object getResult() {
        return result;
    }


    /**
     * Sets the result value for this ConverterTaskInfo.
     * 
     * @param result
     */
    public void setResult(java.lang.Object result) {
        this.result = result;
    }


    /**
     * Gets the progress value for this ConverterTaskInfo.
     * 
     * @return progress
     */
    public java.lang.Integer getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this ConverterTaskInfo.
     * 
     * @param progress
     */
    public void setProgress(java.lang.Integer progress) {
        this.progress = progress;
    }


    /**
     * Gets the estimatedTimeRemaining value for this ConverterTaskInfo.
     * 
     * @return estimatedTimeRemaining
     */
    public java.lang.Integer getEstimatedTimeRemaining() {
        return estimatedTimeRemaining;
    }


    /**
     * Sets the estimatedTimeRemaining value for this ConverterTaskInfo.
     * 
     * @param estimatedTimeRemaining
     */
    public void setEstimatedTimeRemaining(java.lang.Integer estimatedTimeRemaining) {
        this.estimatedTimeRemaining = estimatedTimeRemaining;
    }


    /**
     * Gets the transferRate value for this ConverterTaskInfo.
     * 
     * @return transferRate
     */
    public java.lang.Integer getTransferRate() {
        return transferRate;
    }


    /**
     * Sets the transferRate value for this ConverterTaskInfo.
     * 
     * @param transferRate
     */
    public void setTransferRate(java.lang.Integer transferRate) {
        this.transferRate = transferRate;
    }


    /**
     * Gets the queueTime value for this ConverterTaskInfo.
     * 
     * @return queueTime
     */
    public java.util.Calendar getQueueTime() {
        return queueTime;
    }


    /**
     * Sets the queueTime value for this ConverterTaskInfo.
     * 
     * @param queueTime
     */
    public void setQueueTime(java.util.Calendar queueTime) {
        this.queueTime = queueTime;
    }


    /**
     * Gets the startTime value for this ConverterTaskInfo.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ConverterTaskInfo.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the completeTime value for this ConverterTaskInfo.
     * 
     * @return completeTime
     */
    public java.util.Calendar getCompleteTime() {
        return completeTime;
    }


    /**
     * Sets the completeTime value for this ConverterTaskInfo.
     * 
     * @param completeTime
     */
    public void setCompleteTime(java.util.Calendar completeTime) {
        this.completeTime = completeTime;
    }


    /**
     * Gets the eventChainId value for this ConverterTaskInfo.
     * 
     * @return eventChainId
     */
    public int getEventChainId() {
        return eventChainId;
    }


    /**
     * Sets the eventChainId value for this ConverterTaskInfo.
     * 
     * @param eventChainId
     */
    public void setEventChainId(int eventChainId) {
        this.eventChainId = eventChainId;
    }


    /**
     * Gets the vcTask value for this ConverterTaskInfo.
     * 
     * @return vcTask
     */
    public com.vmware.converter.ManagedObjectReference getVcTask() {
        return vcTask;
    }


    /**
     * Sets the vcTask value for this ConverterTaskInfo.
     * 
     * @param vcTask
     */
    public void setVcTask(com.vmware.converter.ManagedObjectReference vcTask) {
        this.vcTask = vcTask;
    }


    /**
     * Gets the logBundleInfo value for this ConverterTaskInfo.
     * 
     * @return logBundleInfo
     */
    public com.vmware.converter.ConverterDiagnosticManagerTaskLogBundleInfo getLogBundleInfo() {
        return logBundleInfo;
    }


    /**
     * Sets the logBundleInfo value for this ConverterTaskInfo.
     * 
     * @param logBundleInfo
     */
    public void setLogBundleInfo(com.vmware.converter.ConverterDiagnosticManagerTaskLogBundleInfo logBundleInfo) {
        this.logBundleInfo = logBundleInfo;
    }


    /**
     * Gets the job value for this ConverterTaskInfo.
     * 
     * @return job
     */
    public com.vmware.converter.ManagedObjectReference getJob() {
        return job;
    }


    /**
     * Sets the job value for this ConverterTaskInfo.
     * 
     * @param job
     */
    public void setJob(com.vmware.converter.ManagedObjectReference job) {
        this.job = job;
    }


    /**
     * Gets the hasChildren value for this ConverterTaskInfo.
     * 
     * @return hasChildren
     */
    public java.lang.Boolean getHasChildren() {
        return hasChildren;
    }


    /**
     * Sets the hasChildren value for this ConverterTaskInfo.
     * 
     * @param hasChildren
     */
    public void setHasChildren(java.lang.Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }


    /**
     * Gets the parentTask value for this ConverterTaskInfo.
     * 
     * @return parentTask
     */
    public com.vmware.converter.ManagedObjectReference getParentTask() {
        return parentTask;
    }


    /**
     * Sets the parentTask value for this ConverterTaskInfo.
     * 
     * @param parentTask
     */
    public void setParentTask(com.vmware.converter.ManagedObjectReference parentTask) {
        this.parentTask = parentTask;
    }


    /**
     * Gets the rootTask value for this ConverterTaskInfo.
     * 
     * @return rootTask
     */
    public com.vmware.converter.ManagedObjectReference getRootTask() {
        return rootTask;
    }


    /**
     * Sets the rootTask value for this ConverterTaskInfo.
     * 
     * @param rootTask
     */
    public void setRootTask(com.vmware.converter.ManagedObjectReference rootTask) {
        this.rootTask = rootTask;
    }


    /**
     * Gets the incremental value for this ConverterTaskInfo.
     * 
     * @return incremental
     */
    public java.lang.Boolean getIncremental() {
        return incremental;
    }


    /**
     * Sets the incremental value for this ConverterTaskInfo.
     * 
     * @param incremental
     */
    public void setIncremental(java.lang.Boolean incremental) {
        this.incremental = incremental;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterTaskInfo)) return false;
        ConverterTaskInfo other = (ConverterTaskInfo) obj;
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
            ((this.task==null && other.getTask()==null) || 
             (this.task!=null &&
              this.task.equals(other.getTask()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.descriptionId==null && other.getDescriptionId()==null) || 
             (this.descriptionId!=null &&
              this.descriptionId.equals(other.getDescriptionId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.cancelled == other.isCancelled() &&
            this.cancelable == other.isCancelable() &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.progress==null && other.getProgress()==null) || 
             (this.progress!=null &&
              this.progress.equals(other.getProgress()))) &&
            ((this.estimatedTimeRemaining==null && other.getEstimatedTimeRemaining()==null) || 
             (this.estimatedTimeRemaining!=null &&
              this.estimatedTimeRemaining.equals(other.getEstimatedTimeRemaining()))) &&
            ((this.transferRate==null && other.getTransferRate()==null) || 
             (this.transferRate!=null &&
              this.transferRate.equals(other.getTransferRate()))) &&
            ((this.queueTime==null && other.getQueueTime()==null) || 
             (this.queueTime!=null &&
              this.queueTime.equals(other.getQueueTime()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.completeTime==null && other.getCompleteTime()==null) || 
             (this.completeTime!=null &&
              this.completeTime.equals(other.getCompleteTime()))) &&
            this.eventChainId == other.getEventChainId() &&
            ((this.vcTask==null && other.getVcTask()==null) || 
             (this.vcTask!=null &&
              this.vcTask.equals(other.getVcTask()))) &&
            ((this.logBundleInfo==null && other.getLogBundleInfo()==null) || 
             (this.logBundleInfo!=null &&
              this.logBundleInfo.equals(other.getLogBundleInfo()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.hasChildren==null && other.getHasChildren()==null) || 
             (this.hasChildren!=null &&
              this.hasChildren.equals(other.getHasChildren()))) &&
            ((this.parentTask==null && other.getParentTask()==null) || 
             (this.parentTask!=null &&
              this.parentTask.equals(other.getParentTask()))) &&
            ((this.rootTask==null && other.getRootTask()==null) || 
             (this.rootTask!=null &&
              this.rootTask.equals(other.getRootTask()))) &&
            ((this.incremental==null && other.getIncremental()==null) || 
             (this.incremental!=null &&
              this.incremental.equals(other.getIncremental())));
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
        if (getTask() != null) {
            _hashCode += getTask().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescriptionId() != null) {
            _hashCode += getDescriptionId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += (isCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCancelable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getProgress() != null) {
            _hashCode += getProgress().hashCode();
        }
        if (getEstimatedTimeRemaining() != null) {
            _hashCode += getEstimatedTimeRemaining().hashCode();
        }
        if (getTransferRate() != null) {
            _hashCode += getTransferRate().hashCode();
        }
        if (getQueueTime() != null) {
            _hashCode += getQueueTime().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getCompleteTime() != null) {
            _hashCode += getCompleteTime().hashCode();
        }
        _hashCode += getEventChainId();
        if (getVcTask() != null) {
            _hashCode += getVcTask().hashCode();
        }
        if (getLogBundleInfo() != null) {
            _hashCode += getLogBundleInfo().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getHasChildren() != null) {
            _hashCode += getHasChildren().hashCode();
        }
        if (getParentTask() != null) {
            _hashCode += getParentTask().hashCode();
        }
        if (getRootTask() != null) {
            _hashCode += getRootTask().hashCode();
        }
        if (getIncremental() != null) {
            _hashCode += getIncremental().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterTaskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "task"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "descriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTaskInfoState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cancelable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "estimatedTimeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "transferRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "queueTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "completeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "eventChainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vcTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vcTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logBundleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "logBundleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerTaskLogBundleInfo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hasChildren"));
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
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "rootTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incremental");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "incremental"));
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
