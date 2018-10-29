/**
 * ConverterServerJobJobInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerJobJobInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String owner;

    private java.lang.String state;

    private com.vmware.converter.ManagedObjectReference activeTask;

    private java.util.Calendar creationTime;

    private java.util.Calendar lastModifiedTime;

    private com.vmware.converter.LocalizedMethodFault mostRecentError;

    private int numConsecutiveErrors;

    private java.util.Calendar lastRunStartTime;

    private java.util.Calendar lastRunCompleteTime;

    private java.util.Calendar nextRunStartTime;

    public ConverterServerJobJobInfo() {
    }

    public ConverterServerJobJobInfo(
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
           java.util.Calendar nextRunStartTime) {
        this.key = key;
        this.owner = owner;
        this.state = state;
        this.activeTask = activeTask;
        this.creationTime = creationTime;
        this.lastModifiedTime = lastModifiedTime;
        this.mostRecentError = mostRecentError;
        this.numConsecutiveErrors = numConsecutiveErrors;
        this.lastRunStartTime = lastRunStartTime;
        this.lastRunCompleteTime = lastRunCompleteTime;
        this.nextRunStartTime = nextRunStartTime;
    }


    /**
     * Gets the key value for this ConverterServerJobJobInfo.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterServerJobJobInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the owner value for this ConverterServerJobJobInfo.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ConverterServerJobJobInfo.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the state value for this ConverterServerJobJobInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ConverterServerJobJobInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the activeTask value for this ConverterServerJobJobInfo.
     * 
     * @return activeTask
     */
    public com.vmware.converter.ManagedObjectReference getActiveTask() {
        return activeTask;
    }


    /**
     * Sets the activeTask value for this ConverterServerJobJobInfo.
     * 
     * @param activeTask
     */
    public void setActiveTask(com.vmware.converter.ManagedObjectReference activeTask) {
        this.activeTask = activeTask;
    }


    /**
     * Gets the creationTime value for this ConverterServerJobJobInfo.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this ConverterServerJobJobInfo.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the lastModifiedTime value for this ConverterServerJobJobInfo.
     * 
     * @return lastModifiedTime
     */
    public java.util.Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }


    /**
     * Sets the lastModifiedTime value for this ConverterServerJobJobInfo.
     * 
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(java.util.Calendar lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }


    /**
     * Gets the mostRecentError value for this ConverterServerJobJobInfo.
     * 
     * @return mostRecentError
     */
    public com.vmware.converter.LocalizedMethodFault getMostRecentError() {
        return mostRecentError;
    }


    /**
     * Sets the mostRecentError value for this ConverterServerJobJobInfo.
     * 
     * @param mostRecentError
     */
    public void setMostRecentError(com.vmware.converter.LocalizedMethodFault mostRecentError) {
        this.mostRecentError = mostRecentError;
    }


    /**
     * Gets the numConsecutiveErrors value for this ConverterServerJobJobInfo.
     * 
     * @return numConsecutiveErrors
     */
    public int getNumConsecutiveErrors() {
        return numConsecutiveErrors;
    }


    /**
     * Sets the numConsecutiveErrors value for this ConverterServerJobJobInfo.
     * 
     * @param numConsecutiveErrors
     */
    public void setNumConsecutiveErrors(int numConsecutiveErrors) {
        this.numConsecutiveErrors = numConsecutiveErrors;
    }


    /**
     * Gets the lastRunStartTime value for this ConverterServerJobJobInfo.
     * 
     * @return lastRunStartTime
     */
    public java.util.Calendar getLastRunStartTime() {
        return lastRunStartTime;
    }


    /**
     * Sets the lastRunStartTime value for this ConverterServerJobJobInfo.
     * 
     * @param lastRunStartTime
     */
    public void setLastRunStartTime(java.util.Calendar lastRunStartTime) {
        this.lastRunStartTime = lastRunStartTime;
    }


    /**
     * Gets the lastRunCompleteTime value for this ConverterServerJobJobInfo.
     * 
     * @return lastRunCompleteTime
     */
    public java.util.Calendar getLastRunCompleteTime() {
        return lastRunCompleteTime;
    }


    /**
     * Sets the lastRunCompleteTime value for this ConverterServerJobJobInfo.
     * 
     * @param lastRunCompleteTime
     */
    public void setLastRunCompleteTime(java.util.Calendar lastRunCompleteTime) {
        this.lastRunCompleteTime = lastRunCompleteTime;
    }


    /**
     * Gets the nextRunStartTime value for this ConverterServerJobJobInfo.
     * 
     * @return nextRunStartTime
     */
    public java.util.Calendar getNextRunStartTime() {
        return nextRunStartTime;
    }


    /**
     * Sets the nextRunStartTime value for this ConverterServerJobJobInfo.
     * 
     * @param nextRunStartTime
     */
    public void setNextRunStartTime(java.util.Calendar nextRunStartTime) {
        this.nextRunStartTime = nextRunStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerJobJobInfo)) return false;
        ConverterServerJobJobInfo other = (ConverterServerJobJobInfo) obj;
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
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.activeTask==null && other.getActiveTask()==null) || 
             (this.activeTask!=null &&
              this.activeTask.equals(other.getActiveTask()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.lastModifiedTime==null && other.getLastModifiedTime()==null) || 
             (this.lastModifiedTime!=null &&
              this.lastModifiedTime.equals(other.getLastModifiedTime()))) &&
            ((this.mostRecentError==null && other.getMostRecentError()==null) || 
             (this.mostRecentError!=null &&
              this.mostRecentError.equals(other.getMostRecentError()))) &&
            this.numConsecutiveErrors == other.getNumConsecutiveErrors() &&
            ((this.lastRunStartTime==null && other.getLastRunStartTime()==null) || 
             (this.lastRunStartTime!=null &&
              this.lastRunStartTime.equals(other.getLastRunStartTime()))) &&
            ((this.lastRunCompleteTime==null && other.getLastRunCompleteTime()==null) || 
             (this.lastRunCompleteTime!=null &&
              this.lastRunCompleteTime.equals(other.getLastRunCompleteTime()))) &&
            ((this.nextRunStartTime==null && other.getNextRunStartTime()==null) || 
             (this.nextRunStartTime!=null &&
              this.nextRunStartTime.equals(other.getNextRunStartTime())));
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getActiveTask() != null) {
            _hashCode += getActiveTask().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getLastModifiedTime() != null) {
            _hashCode += getLastModifiedTime().hashCode();
        }
        if (getMostRecentError() != null) {
            _hashCode += getMostRecentError().hashCode();
        }
        _hashCode += getNumConsecutiveErrors();
        if (getLastRunStartTime() != null) {
            _hashCode += getLastRunStartTime().hashCode();
        }
        if (getLastRunCompleteTime() != null) {
            _hashCode += getLastRunCompleteTime().hashCode();
        }
        if (getNextRunStartTime() != null) {
            _hashCode += getNextRunStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerJobJobInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerJobJobInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "activeTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lastModifiedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mostRecentError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "mostRecentError"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numConsecutiveErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numConsecutiveErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lastRunStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunCompleteTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "lastRunCompleteTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRunStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nextRunStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
