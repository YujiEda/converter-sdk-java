/**
 * IscsiFaultPnicInUse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IscsiFaultPnicInUse  extends com.vmware.converter.IscsiFault  implements java.io.Serializable {
    private java.lang.String pnicDevice;

    public IscsiFaultPnicInUse() {
    }

    public IscsiFaultPnicInUse(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String pnicDevice) {
        super(
            faultCause,
            faultMessage);
        this.pnicDevice = pnicDevice;
    }


    /**
     * Gets the pnicDevice value for this IscsiFaultPnicInUse.
     * 
     * @return pnicDevice
     */
    public java.lang.String getPnicDevice() {
        return pnicDevice;
    }


    /**
     * Sets the pnicDevice value for this IscsiFaultPnicInUse.
     * 
     * @param pnicDevice
     */
    public void setPnicDevice(java.lang.String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IscsiFaultPnicInUse)) return false;
        IscsiFaultPnicInUse other = (IscsiFaultPnicInUse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pnicDevice==null && other.getPnicDevice()==null) || 
             (this.pnicDevice!=null &&
              this.pnicDevice.equals(other.getPnicDevice())));
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
        if (getPnicDevice() != null) {
            _hashCode += getPnicDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IscsiFaultPnicInUse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiFaultPnicInUse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicDevice"));
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
