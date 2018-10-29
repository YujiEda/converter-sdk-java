/**
 * VsanHostDecommissionMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostDecommissionMode  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String objectAction;

    public VsanHostDecommissionMode() {
    }

    public VsanHostDecommissionMode(
           java.lang.String objectAction) {
        this.objectAction = objectAction;
    }


    /**
     * Gets the objectAction value for this VsanHostDecommissionMode.
     * 
     * @return objectAction
     */
    public java.lang.String getObjectAction() {
        return objectAction;
    }


    /**
     * Sets the objectAction value for this VsanHostDecommissionMode.
     * 
     * @param objectAction
     */
    public void setObjectAction(java.lang.String objectAction) {
        this.objectAction = objectAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostDecommissionMode)) return false;
        VsanHostDecommissionMode other = (VsanHostDecommissionMode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.objectAction==null && other.getObjectAction()==null) || 
             (this.objectAction!=null &&
              this.objectAction.equals(other.getObjectAction())));
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
        if (getObjectAction() != null) {
            _hashCode += getObjectAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostDecommissionMode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDecommissionMode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectAction"));
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
