/**
 * ArrayOfAnswerFileStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfAnswerFileStatusResult  implements java.io.Serializable {
    private com.vmware.converter.AnswerFileStatusResult[] answerFileStatusResult;

    public ArrayOfAnswerFileStatusResult() {
    }

    public ArrayOfAnswerFileStatusResult(
           com.vmware.converter.AnswerFileStatusResult[] answerFileStatusResult) {
           this.answerFileStatusResult = answerFileStatusResult;
    }


    /**
     * Gets the answerFileStatusResult value for this ArrayOfAnswerFileStatusResult.
     * 
     * @return answerFileStatusResult
     */
    public com.vmware.converter.AnswerFileStatusResult[] getAnswerFileStatusResult() {
        return answerFileStatusResult;
    }


    /**
     * Sets the answerFileStatusResult value for this ArrayOfAnswerFileStatusResult.
     * 
     * @param answerFileStatusResult
     */
    public void setAnswerFileStatusResult(com.vmware.converter.AnswerFileStatusResult[] answerFileStatusResult) {
        this.answerFileStatusResult = answerFileStatusResult;
    }

    public com.vmware.converter.AnswerFileStatusResult getAnswerFileStatusResult(int i) {
        return this.answerFileStatusResult[i];
    }

    public void setAnswerFileStatusResult(int i, com.vmware.converter.AnswerFileStatusResult _value) {
        this.answerFileStatusResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAnswerFileStatusResult)) return false;
        ArrayOfAnswerFileStatusResult other = (ArrayOfAnswerFileStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answerFileStatusResult==null && other.getAnswerFileStatusResult()==null) || 
             (this.answerFileStatusResult!=null &&
              java.util.Arrays.equals(this.answerFileStatusResult, other.getAnswerFileStatusResult())));
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
        if (getAnswerFileStatusResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswerFileStatusResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswerFileStatusResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAnswerFileStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfAnswerFileStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerFileStatusResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "AnswerFileStatusResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileStatusResult"));
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
