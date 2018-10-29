/**
 * ScheduledTaskDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ScheduledTaskDescription  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.TypeDescription[] action;

    private com.vmware.converter.ScheduledTaskDetail[] schedulerInfo;

    private com.vmware.converter.ElementDescription[] state;

    private com.vmware.converter.ElementDescription[] dayOfWeek;

    private com.vmware.converter.ElementDescription[] weekOfMonth;

    public ScheduledTaskDescription() {
    }

    public ScheduledTaskDescription(
           com.vmware.converter.TypeDescription[] action,
           com.vmware.converter.ScheduledTaskDetail[] schedulerInfo,
           com.vmware.converter.ElementDescription[] state,
           com.vmware.converter.ElementDescription[] dayOfWeek,
           com.vmware.converter.ElementDescription[] weekOfMonth) {
        this.action = action;
        this.schedulerInfo = schedulerInfo;
        this.state = state;
        this.dayOfWeek = dayOfWeek;
        this.weekOfMonth = weekOfMonth;
    }


    /**
     * Gets the action value for this ScheduledTaskDescription.
     * 
     * @return action
     */
    public com.vmware.converter.TypeDescription[] getAction() {
        return action;
    }


    /**
     * Sets the action value for this ScheduledTaskDescription.
     * 
     * @param action
     */
    public void setAction(com.vmware.converter.TypeDescription[] action) {
        this.action = action;
    }

    public com.vmware.converter.TypeDescription getAction(int i) {
        return this.action[i];
    }

    public void setAction(int i, com.vmware.converter.TypeDescription _value) {
        this.action[i] = _value;
    }


    /**
     * Gets the schedulerInfo value for this ScheduledTaskDescription.
     * 
     * @return schedulerInfo
     */
    public com.vmware.converter.ScheduledTaskDetail[] getSchedulerInfo() {
        return schedulerInfo;
    }


    /**
     * Sets the schedulerInfo value for this ScheduledTaskDescription.
     * 
     * @param schedulerInfo
     */
    public void setSchedulerInfo(com.vmware.converter.ScheduledTaskDetail[] schedulerInfo) {
        this.schedulerInfo = schedulerInfo;
    }

    public com.vmware.converter.ScheduledTaskDetail getSchedulerInfo(int i) {
        return this.schedulerInfo[i];
    }

    public void setSchedulerInfo(int i, com.vmware.converter.ScheduledTaskDetail _value) {
        this.schedulerInfo[i] = _value;
    }


    /**
     * Gets the state value for this ScheduledTaskDescription.
     * 
     * @return state
     */
    public com.vmware.converter.ElementDescription[] getState() {
        return state;
    }


    /**
     * Sets the state value for this ScheduledTaskDescription.
     * 
     * @param state
     */
    public void setState(com.vmware.converter.ElementDescription[] state) {
        this.state = state;
    }

    public com.vmware.converter.ElementDescription getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.vmware.converter.ElementDescription _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the dayOfWeek value for this ScheduledTaskDescription.
     * 
     * @return dayOfWeek
     */
    public com.vmware.converter.ElementDescription[] getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this ScheduledTaskDescription.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(com.vmware.converter.ElementDescription[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public com.vmware.converter.ElementDescription getDayOfWeek(int i) {
        return this.dayOfWeek[i];
    }

    public void setDayOfWeek(int i, com.vmware.converter.ElementDescription _value) {
        this.dayOfWeek[i] = _value;
    }


    /**
     * Gets the weekOfMonth value for this ScheduledTaskDescription.
     * 
     * @return weekOfMonth
     */
    public com.vmware.converter.ElementDescription[] getWeekOfMonth() {
        return weekOfMonth;
    }


    /**
     * Sets the weekOfMonth value for this ScheduledTaskDescription.
     * 
     * @param weekOfMonth
     */
    public void setWeekOfMonth(com.vmware.converter.ElementDescription[] weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public com.vmware.converter.ElementDescription getWeekOfMonth(int i) {
        return this.weekOfMonth[i];
    }

    public void setWeekOfMonth(int i, com.vmware.converter.ElementDescription _value) {
        this.weekOfMonth[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledTaskDescription)) return false;
        ScheduledTaskDescription other = (ScheduledTaskDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              java.util.Arrays.equals(this.action, other.getAction()))) &&
            ((this.schedulerInfo==null && other.getSchedulerInfo()==null) || 
             (this.schedulerInfo!=null &&
              java.util.Arrays.equals(this.schedulerInfo, other.getSchedulerInfo()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              java.util.Arrays.equals(this.dayOfWeek, other.getDayOfWeek()))) &&
            ((this.weekOfMonth==null && other.getWeekOfMonth()==null) || 
             (this.weekOfMonth!=null &&
              java.util.Arrays.equals(this.weekOfMonth, other.getWeekOfMonth())));
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
        if (getAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchedulerInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedulerInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedulerInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDayOfWeek() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayOfWeek());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayOfWeek(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeekOfMonth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeekOfMonth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeekOfMonth(), i);
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
        new org.apache.axis.description.TypeDesc(ScheduledTaskDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TypeDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "schedulerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskDetail"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "weekOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
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
