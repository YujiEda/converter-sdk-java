/**
 * PrivilegeAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PrivilegeAvailability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String privId;

    private boolean isGranted;

    public PrivilegeAvailability() {
    }

    public PrivilegeAvailability(
           java.lang.String privId,
           boolean isGranted) {
        this.privId = privId;
        this.isGranted = isGranted;
    }


    /**
     * Gets the privId value for this PrivilegeAvailability.
     * 
     * @return privId
     */
    public java.lang.String getPrivId() {
        return privId;
    }


    /**
     * Sets the privId value for this PrivilegeAvailability.
     * 
     * @param privId
     */
    public void setPrivId(java.lang.String privId) {
        this.privId = privId;
    }


    /**
     * Gets the isGranted value for this PrivilegeAvailability.
     * 
     * @return isGranted
     */
    public boolean isIsGranted() {
        return isGranted;
    }


    /**
     * Sets the isGranted value for this PrivilegeAvailability.
     * 
     * @param isGranted
     */
    public void setIsGranted(boolean isGranted) {
        this.isGranted = isGranted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrivilegeAvailability)) return false;
        PrivilegeAvailability other = (PrivilegeAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.privId==null && other.getPrivId()==null) || 
             (this.privId!=null &&
              this.privId.equals(other.getPrivId()))) &&
            this.isGranted == other.isIsGranted();
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
        if (getPrivId() != null) {
            _hashCode += getPrivId().hashCode();
        }
        _hashCode += (isIsGranted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrivilegeAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PrivilegeAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGranted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isGranted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
