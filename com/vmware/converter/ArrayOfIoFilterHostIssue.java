/**
 * ArrayOfIoFilterHostIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfIoFilterHostIssue  implements java.io.Serializable {
    private com.vmware.converter.IoFilterHostIssue[] ioFilterHostIssue;

    public ArrayOfIoFilterHostIssue() {
    }

    public ArrayOfIoFilterHostIssue(
           com.vmware.converter.IoFilterHostIssue[] ioFilterHostIssue) {
           this.ioFilterHostIssue = ioFilterHostIssue;
    }


    /**
     * Gets the ioFilterHostIssue value for this ArrayOfIoFilterHostIssue.
     * 
     * @return ioFilterHostIssue
     */
    public com.vmware.converter.IoFilterHostIssue[] getIoFilterHostIssue() {
        return ioFilterHostIssue;
    }


    /**
     * Sets the ioFilterHostIssue value for this ArrayOfIoFilterHostIssue.
     * 
     * @param ioFilterHostIssue
     */
    public void setIoFilterHostIssue(com.vmware.converter.IoFilterHostIssue[] ioFilterHostIssue) {
        this.ioFilterHostIssue = ioFilterHostIssue;
    }

    public com.vmware.converter.IoFilterHostIssue getIoFilterHostIssue(int i) {
        return this.ioFilterHostIssue[i];
    }

    public void setIoFilterHostIssue(int i, com.vmware.converter.IoFilterHostIssue _value) {
        this.ioFilterHostIssue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfIoFilterHostIssue)) return false;
        ArrayOfIoFilterHostIssue other = (ArrayOfIoFilterHostIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ioFilterHostIssue==null && other.getIoFilterHostIssue()==null) || 
             (this.ioFilterHostIssue!=null &&
              java.util.Arrays.equals(this.ioFilterHostIssue, other.getIoFilterHostIssue())));
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
        if (getIoFilterHostIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIoFilterHostIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIoFilterHostIssue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfIoFilterHostIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfIoFilterHostIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioFilterHostIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "IoFilterHostIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IoFilterHostIssue"));
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
