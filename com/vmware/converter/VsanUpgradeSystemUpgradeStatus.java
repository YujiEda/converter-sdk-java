/**
 * VsanUpgradeSystemUpgradeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemUpgradeStatus  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean inProgress;

    private com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] history;

    private java.lang.Boolean aborted;

    private java.lang.Boolean completed;

    private java.lang.Integer progress;

    public VsanUpgradeSystemUpgradeStatus() {
    }

    public VsanUpgradeSystemUpgradeStatus(
           boolean inProgress,
           com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] history,
           java.lang.Boolean aborted,
           java.lang.Boolean completed,
           java.lang.Integer progress) {
        this.inProgress = inProgress;
        this.history = history;
        this.aborted = aborted;
        this.completed = completed;
        this.progress = progress;
    }


    /**
     * Gets the inProgress value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @return inProgress
     */
    public boolean isInProgress() {
        return inProgress;
    }


    /**
     * Sets the inProgress value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @param inProgress
     */
    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }


    /**
     * Gets the history value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @return history
     */
    public com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @param history
     */
    public void setHistory(com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] history) {
        this.history = history;
    }

    public com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem getHistory(int i) {
        return this.history[i];
    }

    public void setHistory(int i, com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem _value) {
        this.history[i] = _value;
    }


    /**
     * Gets the aborted value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @return aborted
     */
    public java.lang.Boolean getAborted() {
        return aborted;
    }


    /**
     * Sets the aborted value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @param aborted
     */
    public void setAborted(java.lang.Boolean aborted) {
        this.aborted = aborted;
    }


    /**
     * Gets the completed value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @return completed
     */
    public java.lang.Boolean getCompleted() {
        return completed;
    }


    /**
     * Sets the completed value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @param completed
     */
    public void setCompleted(java.lang.Boolean completed) {
        this.completed = completed;
    }


    /**
     * Gets the progress value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @return progress
     */
    public java.lang.Integer getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this VsanUpgradeSystemUpgradeStatus.
     * 
     * @param progress
     */
    public void setProgress(java.lang.Integer progress) {
        this.progress = progress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemUpgradeStatus)) return false;
        VsanUpgradeSystemUpgradeStatus other = (VsanUpgradeSystemUpgradeStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.inProgress == other.isInProgress() &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory()))) &&
            ((this.aborted==null && other.getAborted()==null) || 
             (this.aborted!=null &&
              this.aborted.equals(other.getAborted()))) &&
            ((this.completed==null && other.getCompleted()==null) || 
             (this.completed!=null &&
              this.completed.equals(other.getCompleted()))) &&
            ((this.progress==null && other.getProgress()==null) || 
             (this.progress!=null &&
              this.progress.equals(other.getProgress())));
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
        _hashCode += (isInProgress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAborted() != null) {
            _hashCode += getAborted().hashCode();
        }
        if (getCompleted() != null) {
            _hashCode += getCompleted().hashCode();
        }
        if (getProgress() != null) {
            _hashCode += getProgress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemUpgradeStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemUpgradeStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemUpgradeHistoryItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aborted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "aborted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "completed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
