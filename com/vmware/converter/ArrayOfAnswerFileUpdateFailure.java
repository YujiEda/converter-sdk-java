/**
 * ArrayOfAnswerFileUpdateFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfAnswerFileUpdateFailure  implements java.io.Serializable {
    private com.vmware.converter.AnswerFileUpdateFailure[] answerFileUpdateFailure;

    public ArrayOfAnswerFileUpdateFailure() {
    }

    public ArrayOfAnswerFileUpdateFailure(
           com.vmware.converter.AnswerFileUpdateFailure[] answerFileUpdateFailure) {
           this.answerFileUpdateFailure = answerFileUpdateFailure;
    }


    /**
     * Gets the answerFileUpdateFailure value for this ArrayOfAnswerFileUpdateFailure.
     * 
     * @return answerFileUpdateFailure
     */
    public com.vmware.converter.AnswerFileUpdateFailure[] getAnswerFileUpdateFailure() {
        return answerFileUpdateFailure;
    }


    /**
     * Sets the answerFileUpdateFailure value for this ArrayOfAnswerFileUpdateFailure.
     * 
     * @param answerFileUpdateFailure
     */
    public void setAnswerFileUpdateFailure(com.vmware.converter.AnswerFileUpdateFailure[] answerFileUpdateFailure) {
        this.answerFileUpdateFailure = answerFileUpdateFailure;
    }

    public com.vmware.converter.AnswerFileUpdateFailure getAnswerFileUpdateFailure(int i) {
        return this.answerFileUpdateFailure[i];
    }

    public void setAnswerFileUpdateFailure(int i, com.vmware.converter.AnswerFileUpdateFailure _value) {
        this.answerFileUpdateFailure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAnswerFileUpdateFailure)) return false;
        ArrayOfAnswerFileUpdateFailure other = (ArrayOfAnswerFileUpdateFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answerFileUpdateFailure==null && other.getAnswerFileUpdateFailure()==null) || 
             (this.answerFileUpdateFailure!=null &&
              java.util.Arrays.equals(this.answerFileUpdateFailure, other.getAnswerFileUpdateFailure())));
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
        if (getAnswerFileUpdateFailure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswerFileUpdateFailure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswerFileUpdateFailure(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAnswerFileUpdateFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfAnswerFileUpdateFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerFileUpdateFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "AnswerFileUpdateFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileUpdateFailure"));
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
