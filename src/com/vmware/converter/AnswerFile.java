/**
 * AnswerFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AnswerFile  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ProfileDeferredPolicyOptionParameter[] userInput;

    private java.util.Calendar createdTime;

    private java.util.Calendar modifiedTime;

    public AnswerFile() {
    }

    public AnswerFile(
           com.vmware.converter.ProfileDeferredPolicyOptionParameter[] userInput,
           java.util.Calendar createdTime,
           java.util.Calendar modifiedTime) {
        this.userInput = userInput;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }


    /**
     * Gets the userInput value for this AnswerFile.
     * 
     * @return userInput
     */
    public com.vmware.converter.ProfileDeferredPolicyOptionParameter[] getUserInput() {
        return userInput;
    }


    /**
     * Sets the userInput value for this AnswerFile.
     * 
     * @param userInput
     */
    public void setUserInput(com.vmware.converter.ProfileDeferredPolicyOptionParameter[] userInput) {
        this.userInput = userInput;
    }

    public com.vmware.converter.ProfileDeferredPolicyOptionParameter getUserInput(int i) {
        return this.userInput[i];
    }

    public void setUserInput(int i, com.vmware.converter.ProfileDeferredPolicyOptionParameter _value) {
        this.userInput[i] = _value;
    }


    /**
     * Gets the createdTime value for this AnswerFile.
     * 
     * @return createdTime
     */
    public java.util.Calendar getCreatedTime() {
        return createdTime;
    }


    /**
     * Sets the createdTime value for this AnswerFile.
     * 
     * @param createdTime
     */
    public void setCreatedTime(java.util.Calendar createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * Gets the modifiedTime value for this AnswerFile.
     * 
     * @return modifiedTime
     */
    public java.util.Calendar getModifiedTime() {
        return modifiedTime;
    }


    /**
     * Sets the modifiedTime value for this AnswerFile.
     * 
     * @param modifiedTime
     */
    public void setModifiedTime(java.util.Calendar modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnswerFile)) return false;
        AnswerFile other = (AnswerFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userInput==null && other.getUserInput()==null) || 
             (this.userInput!=null &&
              java.util.Arrays.equals(this.userInput, other.getUserInput()))) &&
            ((this.createdTime==null && other.getCreatedTime()==null) || 
             (this.createdTime!=null &&
              this.createdTime.equals(other.getCreatedTime()))) &&
            ((this.modifiedTime==null && other.getModifiedTime()==null) || 
             (this.modifiedTime!=null &&
              this.modifiedTime.equals(other.getModifiedTime())));
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
        if (getUserInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedTime() != null) {
            _hashCode += getCreatedTime().hashCode();
        }
        if (getModifiedTime() != null) {
            _hashCode += getModifiedTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnswerFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInput");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileDeferredPolicyOptionParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "createdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "modifiedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
