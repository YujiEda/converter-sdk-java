/**
 * AndAlarmExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AndAlarmExpression  extends com.vmware.converter.AlarmExpression  implements java.io.Serializable {
    private com.vmware.converter.AlarmExpression[] expression;

    public AndAlarmExpression() {
    }

    public AndAlarmExpression(
           com.vmware.converter.AlarmExpression[] expression) {
        this.expression = expression;
    }


    /**
     * Gets the expression value for this AndAlarmExpression.
     * 
     * @return expression
     */
    public com.vmware.converter.AlarmExpression[] getExpression() {
        return expression;
    }


    /**
     * Sets the expression value for this AndAlarmExpression.
     * 
     * @param expression
     */
    public void setExpression(com.vmware.converter.AlarmExpression[] expression) {
        this.expression = expression;
    }

    public com.vmware.converter.AlarmExpression getExpression(int i) {
        return this.expression[i];
    }

    public void setExpression(int i, com.vmware.converter.AlarmExpression _value) {
        this.expression[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndAlarmExpression)) return false;
        AndAlarmExpression other = (AndAlarmExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expression==null && other.getExpression()==null) || 
             (this.expression!=null &&
              java.util.Arrays.equals(this.expression, other.getExpression())));
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
        if (getExpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpression(), i);
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
        new org.apache.axis.description.TypeDesc(AndAlarmExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AndAlarmExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expression");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expression"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmExpression"));
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
