/**
 * ArrayOfAnswerFileStatusError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfAnswerFileStatusError  implements java.io.Serializable {
    private com.vmware.converter.AnswerFileStatusError[] answerFileStatusError;

    public ArrayOfAnswerFileStatusError() {
    }

    public ArrayOfAnswerFileStatusError(
           com.vmware.converter.AnswerFileStatusError[] answerFileStatusError) {
           this.answerFileStatusError = answerFileStatusError;
    }


    /**
     * Gets the answerFileStatusError value for this ArrayOfAnswerFileStatusError.
     * 
     * @return answerFileStatusError
     */
    public com.vmware.converter.AnswerFileStatusError[] getAnswerFileStatusError() {
        return answerFileStatusError;
    }


    /**
     * Sets the answerFileStatusError value for this ArrayOfAnswerFileStatusError.
     * 
     * @param answerFileStatusError
     */
    public void setAnswerFileStatusError(com.vmware.converter.AnswerFileStatusError[] answerFileStatusError) {
        this.answerFileStatusError = answerFileStatusError;
    }

    public com.vmware.converter.AnswerFileStatusError getAnswerFileStatusError(int i) {
        return this.answerFileStatusError[i];
    }

    public void setAnswerFileStatusError(int i, com.vmware.converter.AnswerFileStatusError _value) {
        this.answerFileStatusError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAnswerFileStatusError)) return false;
        ArrayOfAnswerFileStatusError other = (ArrayOfAnswerFileStatusError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answerFileStatusError==null && other.getAnswerFileStatusError()==null) || 
             (this.answerFileStatusError!=null &&
              java.util.Arrays.equals(this.answerFileStatusError, other.getAnswerFileStatusError())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAnswerFileStatusError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswerFileStatusError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswerFileStatusError(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAnswerFileStatusError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfAnswerFileStatusError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerFileStatusError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "AnswerFileStatusError"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileStatusError"));
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
