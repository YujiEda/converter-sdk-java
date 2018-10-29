/**
 * ArrayOfVMwareVspanSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVMwareVspanSession  implements java.io.Serializable {
    private com.vmware.converter.VMwareVspanSession[] VMwareVspanSession;

    public ArrayOfVMwareVspanSession() {
    }

    public ArrayOfVMwareVspanSession(
           com.vmware.converter.VMwareVspanSession[] VMwareVspanSession) {
           this.VMwareVspanSession = VMwareVspanSession;
    }


    /**
     * Gets the VMwareVspanSession value for this ArrayOfVMwareVspanSession.
     * 
     * @return VMwareVspanSession
     */
    public com.vmware.converter.VMwareVspanSession[] getVMwareVspanSession() {
        return VMwareVspanSession;
    }


    /**
     * Sets the VMwareVspanSession value for this ArrayOfVMwareVspanSession.
     * 
     * @param VMwareVspanSession
     */
    public void setVMwareVspanSession(com.vmware.converter.VMwareVspanSession[] VMwareVspanSession) {
        this.VMwareVspanSession = VMwareVspanSession;
    }

    public com.vmware.converter.VMwareVspanSession getVMwareVspanSession(int i) {
        return this.VMwareVspanSession[i];
    }

    public void setVMwareVspanSession(int i, com.vmware.converter.VMwareVspanSession _value) {
        this.VMwareVspanSession[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVMwareVspanSession)) return false;
        ArrayOfVMwareVspanSession other = (ArrayOfVMwareVspanSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VMwareVspanSession==null && other.getVMwareVspanSession()==null) || 
             (this.VMwareVspanSession!=null &&
              java.util.Arrays.equals(this.VMwareVspanSession, other.getVMwareVspanSession())));
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
        if (getVMwareVspanSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVMwareVspanSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVMwareVspanSession(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVMwareVspanSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVMwareVspanSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMwareVspanSession");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanSession"));
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
