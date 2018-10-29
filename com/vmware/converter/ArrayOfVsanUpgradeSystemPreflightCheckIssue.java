/**
 * ArrayOfVsanUpgradeSystemPreflightCheckIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanUpgradeSystemPreflightCheckIssue  implements java.io.Serializable {
    private com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] vsanUpgradeSystemPreflightCheckIssue;

    public ArrayOfVsanUpgradeSystemPreflightCheckIssue() {
    }

    public ArrayOfVsanUpgradeSystemPreflightCheckIssue(
           com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] vsanUpgradeSystemPreflightCheckIssue) {
           this.vsanUpgradeSystemPreflightCheckIssue = vsanUpgradeSystemPreflightCheckIssue;
    }


    /**
     * Gets the vsanUpgradeSystemPreflightCheckIssue value for this ArrayOfVsanUpgradeSystemPreflightCheckIssue.
     * 
     * @return vsanUpgradeSystemPreflightCheckIssue
     */
    public com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] getVsanUpgradeSystemPreflightCheckIssue() {
        return vsanUpgradeSystemPreflightCheckIssue;
    }


    /**
     * Sets the vsanUpgradeSystemPreflightCheckIssue value for this ArrayOfVsanUpgradeSystemPreflightCheckIssue.
     * 
     * @param vsanUpgradeSystemPreflightCheckIssue
     */
    public void setVsanUpgradeSystemPreflightCheckIssue(com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] vsanUpgradeSystemPreflightCheckIssue) {
        this.vsanUpgradeSystemPreflightCheckIssue = vsanUpgradeSystemPreflightCheckIssue;
    }

    public com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue getVsanUpgradeSystemPreflightCheckIssue(int i) {
        return this.vsanUpgradeSystemPreflightCheckIssue[i];
    }

    public void setVsanUpgradeSystemPreflightCheckIssue(int i, com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue _value) {
        this.vsanUpgradeSystemPreflightCheckIssue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanUpgradeSystemPreflightCheckIssue)) return false;
        ArrayOfVsanUpgradeSystemPreflightCheckIssue other = (ArrayOfVsanUpgradeSystemPreflightCheckIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanUpgradeSystemPreflightCheckIssue==null && other.getVsanUpgradeSystemPreflightCheckIssue()==null) || 
             (this.vsanUpgradeSystemPreflightCheckIssue!=null &&
              java.util.Arrays.equals(this.vsanUpgradeSystemPreflightCheckIssue, other.getVsanUpgradeSystemPreflightCheckIssue())));
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
        if (getVsanUpgradeSystemPreflightCheckIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanUpgradeSystemPreflightCheckIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanUpgradeSystemPreflightCheckIssue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanUpgradeSystemPreflightCheckIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanUpgradeSystemPreflightCheckIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanUpgradeSystemPreflightCheckIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemPreflightCheckIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemPreflightCheckIssue"));
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
