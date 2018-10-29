/**
 * TaskDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class TaskDescription  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ElementDescription[] methodInfo;

    private com.vmware.converter.ElementDescription[] state;

    private com.vmware.converter.TypeDescription[] reason;

    public TaskDescription() {
    }

    public TaskDescription(
           com.vmware.converter.ElementDescription[] methodInfo,
           com.vmware.converter.ElementDescription[] state,
           com.vmware.converter.TypeDescription[] reason) {
        this.methodInfo = methodInfo;
        this.state = state;
        this.reason = reason;
    }


    /**
     * Gets the methodInfo value for this TaskDescription.
     * 
     * @return methodInfo
     */
    public com.vmware.converter.ElementDescription[] getMethodInfo() {
        return methodInfo;
    }


    /**
     * Sets the methodInfo value for this TaskDescription.
     * 
     * @param methodInfo
     */
    public void setMethodInfo(com.vmware.converter.ElementDescription[] methodInfo) {
        this.methodInfo = methodInfo;
    }

    public com.vmware.converter.ElementDescription getMethodInfo(int i) {
        return this.methodInfo[i];
    }

    public void setMethodInfo(int i, com.vmware.converter.ElementDescription _value) {
        this.methodInfo[i] = _value;
    }


    /**
     * Gets the state value for this TaskDescription.
     * 
     * @return state
     */
    public com.vmware.converter.ElementDescription[] getState() {
        return state;
    }


    /**
     * Sets the state value for this TaskDescription.
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
     * Gets the reason value for this TaskDescription.
     * 
     * @return reason
     */
    public com.vmware.converter.TypeDescription[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this TaskDescription.
     * 
     * @param reason
     */
    public void setReason(com.vmware.converter.TypeDescription[] reason) {
        this.reason = reason;
    }

    public com.vmware.converter.TypeDescription getReason(int i) {
        return this.reason[i];
    }

    public void setReason(int i, com.vmware.converter.TypeDescription _value) {
        this.reason[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskDescription)) return false;
        TaskDescription other = (TaskDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.methodInfo==null && other.getMethodInfo()==null) || 
             (this.methodInfo!=null &&
              java.util.Arrays.equals(this.methodInfo, other.getMethodInfo()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              java.util.Arrays.equals(this.reason, other.getReason())));
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
        if (getMethodInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethodInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMethodInfo(), i);
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
        if (getReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReason(), i);
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
        new org.apache.axis.description.TypeDesc(TaskDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "methodInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
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
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TypeDescription"));
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
