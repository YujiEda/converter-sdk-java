/**
 * ArrayOfVsanHostRuntimeInfoDiskIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostRuntimeInfoDiskIssue  implements java.io.Serializable {
    private com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] vsanHostRuntimeInfoDiskIssue;

    public ArrayOfVsanHostRuntimeInfoDiskIssue() {
    }

    public ArrayOfVsanHostRuntimeInfoDiskIssue(
           com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] vsanHostRuntimeInfoDiskIssue) {
           this.vsanHostRuntimeInfoDiskIssue = vsanHostRuntimeInfoDiskIssue;
    }


    /**
     * Gets the vsanHostRuntimeInfoDiskIssue value for this ArrayOfVsanHostRuntimeInfoDiskIssue.
     * 
     * @return vsanHostRuntimeInfoDiskIssue
     */
    public com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] getVsanHostRuntimeInfoDiskIssue() {
        return vsanHostRuntimeInfoDiskIssue;
    }


    /**
     * Sets the vsanHostRuntimeInfoDiskIssue value for this ArrayOfVsanHostRuntimeInfoDiskIssue.
     * 
     * @param vsanHostRuntimeInfoDiskIssue
     */
    public void setVsanHostRuntimeInfoDiskIssue(com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] vsanHostRuntimeInfoDiskIssue) {
        this.vsanHostRuntimeInfoDiskIssue = vsanHostRuntimeInfoDiskIssue;
    }

    public com.vmware.converter.VsanHostRuntimeInfoDiskIssue getVsanHostRuntimeInfoDiskIssue(int i) {
        return this.vsanHostRuntimeInfoDiskIssue[i];
    }

    public void setVsanHostRuntimeInfoDiskIssue(int i, com.vmware.converter.VsanHostRuntimeInfoDiskIssue _value) {
        this.vsanHostRuntimeInfoDiskIssue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostRuntimeInfoDiskIssue)) return false;
        ArrayOfVsanHostRuntimeInfoDiskIssue other = (ArrayOfVsanHostRuntimeInfoDiskIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostRuntimeInfoDiskIssue==null && other.getVsanHostRuntimeInfoDiskIssue()==null) || 
             (this.vsanHostRuntimeInfoDiskIssue!=null &&
              java.util.Arrays.equals(this.vsanHostRuntimeInfoDiskIssue, other.getVsanHostRuntimeInfoDiskIssue())));
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
        if (getVsanHostRuntimeInfoDiskIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostRuntimeInfoDiskIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostRuntimeInfoDiskIssue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostRuntimeInfoDiskIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostRuntimeInfoDiskIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostRuntimeInfoDiskIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostRuntimeInfoDiskIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostRuntimeInfoDiskIssue"));
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
