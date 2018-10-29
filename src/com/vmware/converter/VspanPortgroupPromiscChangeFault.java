/**
 * VspanPortgroupPromiscChangeFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VspanPortgroupPromiscChangeFault  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private java.lang.String portgroupName;

    public VspanPortgroupPromiscChangeFault() {
    }

    public VspanPortgroupPromiscChangeFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String portgroupName) {
        super(
            faultCause,
            faultMessage);
        this.portgroupName = portgroupName;
    }


    /**
     * Gets the portgroupName value for this VspanPortgroupPromiscChangeFault.
     * 
     * @return portgroupName
     */
    public java.lang.String getPortgroupName() {
        return portgroupName;
    }


    /**
     * Sets the portgroupName value for this VspanPortgroupPromiscChangeFault.
     * 
     * @param portgroupName
     */
    public void setPortgroupName(java.lang.String portgroupName) {
        this.portgroupName = portgroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VspanPortgroupPromiscChangeFault)) return false;
        VspanPortgroupPromiscChangeFault other = (VspanPortgroupPromiscChangeFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.portgroupName==null && other.getPortgroupName()==null) || 
             (this.portgroupName!=null &&
              this.portgroupName.equals(other.getPortgroupName())));
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
        if (getPortgroupName() != null) {
            _hashCode += getPortgroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VspanPortgroupPromiscChangeFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VspanPortgroupPromiscChangeFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroupName"));
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
