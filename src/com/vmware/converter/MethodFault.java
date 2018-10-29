/**
 * MethodFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class MethodFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.vmware.converter.LocalizedMethodFault faultCause;

    private com.vmware.converter.LocalizableMessage[] faultMessage;

    public MethodFault() {
    }

    public MethodFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage) {
        this.faultCause = faultCause;
        this.faultMessage = faultMessage;
    }


    /**
     * Gets the faultCause value for this MethodFault.
     * 
     * @return faultCause
     */
    public com.vmware.converter.LocalizedMethodFault getFaultCause() {
        return faultCause;
    }


    /**
     * Sets the faultCause value for this MethodFault.
     * 
     * @param faultCause
     */
    public void setFaultCause(com.vmware.converter.LocalizedMethodFault faultCause) {
        this.faultCause = faultCause;
    }


    /**
     * Gets the faultMessage value for this MethodFault.
     * 
     * @return faultMessage
     */
    public com.vmware.converter.LocalizableMessage[] getFaultMessage() {
        return faultMessage;
    }


    /**
     * Sets the faultMessage value for this MethodFault.
     * 
     * @param faultMessage
     */
    public void setFaultMessage(com.vmware.converter.LocalizableMessage[] faultMessage) {
        this.faultMessage = faultMessage;
    }

    public com.vmware.converter.LocalizableMessage getFaultMessage(int i) {
        return this.faultMessage[i];
    }

    public void setFaultMessage(int i, com.vmware.converter.LocalizableMessage _value) {
        this.faultMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MethodFault)) return false;
        MethodFault other = (MethodFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultCause==null && other.getFaultCause()==null) || 
             (this.faultCause!=null &&
              this.faultCause.equals(other.getFaultCause()))) &&
            ((this.faultMessage==null && other.getFaultMessage()==null) || 
             (this.faultMessage!=null &&
              java.util.Arrays.equals(this.faultMessage, other.getFaultMessage())));
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
        if (getFaultCause() != null) {
            _hashCode += getFaultCause().hashCode();
        }
        if (getFaultMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultMessage(), i);
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
        new org.apache.axis.description.TypeDesc(MethodFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MethodFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCause");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizableMessage"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
