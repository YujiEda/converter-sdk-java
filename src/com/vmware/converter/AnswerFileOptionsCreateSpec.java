/**
 * AnswerFileOptionsCreateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AnswerFileOptionsCreateSpec  extends com.vmware.converter.AnswerFileCreateSpec  implements java.io.Serializable {
    private com.vmware.converter.ProfileDeferredPolicyOptionParameter[] userInput;

    public AnswerFileOptionsCreateSpec() {
    }

    public AnswerFileOptionsCreateSpec(
           java.lang.Boolean validating,
           com.vmware.converter.ProfileDeferredPolicyOptionParameter[] userInput) {
        super(
            validating);
        this.userInput = userInput;
    }


    /**
     * Gets the userInput value for this AnswerFileOptionsCreateSpec.
     * 
     * @return userInput
     */
    public com.vmware.converter.ProfileDeferredPolicyOptionParameter[] getUserInput() {
        return userInput;
    }


    /**
     * Sets the userInput value for this AnswerFileOptionsCreateSpec.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnswerFileOptionsCreateSpec)) return false;
        AnswerFileOptionsCreateSpec other = (AnswerFileOptionsCreateSpec) obj;
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
              java.util.Arrays.equals(this.userInput, other.getUserInput())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnswerFileOptionsCreateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AnswerFileOptionsCreateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInput");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileDeferredPolicyOptionParameter"));
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
