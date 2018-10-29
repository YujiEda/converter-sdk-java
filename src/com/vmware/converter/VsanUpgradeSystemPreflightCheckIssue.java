/**
 * VsanUpgradeSystemPreflightCheckIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemPreflightCheckIssue  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String msg;

    public VsanUpgradeSystemPreflightCheckIssue() {
    }

    public VsanUpgradeSystemPreflightCheckIssue(
           java.lang.String msg) {
        this.msg = msg;
    }


    /**
     * Gets the msg value for this VsanUpgradeSystemPreflightCheckIssue.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this VsanUpgradeSystemPreflightCheckIssue.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemPreflightCheckIssue)) return false;
        VsanUpgradeSystemPreflightCheckIssue other = (VsanUpgradeSystemPreflightCheckIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg())));
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
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemPreflightCheckIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemPreflightCheckIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
