/**
 * AnswerFileUpdateFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AnswerFileUpdateFailure  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ProfilePropertyPath userInputPath;

    private com.vmware.converter.LocalizableMessage errMsg;

    public AnswerFileUpdateFailure() {
    }

    public AnswerFileUpdateFailure(
           com.vmware.converter.ProfilePropertyPath userInputPath,
           com.vmware.converter.LocalizableMessage errMsg) {
        this.userInputPath = userInputPath;
        this.errMsg = errMsg;
    }


    /**
     * Gets the userInputPath value for this AnswerFileUpdateFailure.
     * 
     * @return userInputPath
     */
    public com.vmware.converter.ProfilePropertyPath getUserInputPath() {
        return userInputPath;
    }


    /**
     * Sets the userInputPath value for this AnswerFileUpdateFailure.
     * 
     * @param userInputPath
     */
    public void setUserInputPath(com.vmware.converter.ProfilePropertyPath userInputPath) {
        this.userInputPath = userInputPath;
    }


    /**
     * Gets the errMsg value for this AnswerFileUpdateFailure.
     * 
     * @return errMsg
     */
    public com.vmware.converter.LocalizableMessage getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this AnswerFileUpdateFailure.
     * 
     * @param errMsg
     */
    public void setErrMsg(com.vmware.converter.LocalizableMessage errMsg) {
        this.errMsg = errMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnswerFileUpdateFailure)) return false;
        AnswerFileUpdateFailure other = (AnswerFileUpdateFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userInputPath==null && other.getUserInputPath()==null) || 
             (this.userInputPath!=null &&
              this.userInputPath.equals(other.getUserInputPath()))) &&
            ((this.errMsg==null && other.getErrMsg()==null) || 
             (this.errMsg!=null &&
              this.errMsg.equals(other.getErrMsg())));
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
        if (getUserInputPath() != null) {
            _hashCode += getUserInputPath().hashCode();
        }
        if (getErrMsg() != null) {
            _hashCode += getErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnswerFileUpdateFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileUpdateFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userInputPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePropertyPath"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "errMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizableMessage"));
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
