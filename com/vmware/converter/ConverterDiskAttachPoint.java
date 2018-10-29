/**
 * ConverterDiskAttachPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDiskAttachPoint  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String controllerType;

    private int busNumber;

    private int unitNumber;

    public ConverterDiskAttachPoint() {
    }

    public ConverterDiskAttachPoint(
           java.lang.String controllerType,
           int busNumber,
           int unitNumber) {
        this.controllerType = controllerType;
        this.busNumber = busNumber;
        this.unitNumber = unitNumber;
    }


    /**
     * Gets the controllerType value for this ConverterDiskAttachPoint.
     * 
     * @return controllerType
     */
    public java.lang.String getControllerType() {
        return controllerType;
    }


    /**
     * Sets the controllerType value for this ConverterDiskAttachPoint.
     * 
     * @param controllerType
     */
    public void setControllerType(java.lang.String controllerType) {
        this.controllerType = controllerType;
    }


    /**
     * Gets the busNumber value for this ConverterDiskAttachPoint.
     * 
     * @return busNumber
     */
    public int getBusNumber() {
        return busNumber;
    }


    /**
     * Sets the busNumber value for this ConverterDiskAttachPoint.
     * 
     * @param busNumber
     */
    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }


    /**
     * Gets the unitNumber value for this ConverterDiskAttachPoint.
     * 
     * @return unitNumber
     */
    public int getUnitNumber() {
        return unitNumber;
    }


    /**
     * Sets the unitNumber value for this ConverterDiskAttachPoint.
     * 
     * @param unitNumber
     */
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDiskAttachPoint)) return false;
        ConverterDiskAttachPoint other = (ConverterDiskAttachPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.controllerType==null && other.getControllerType()==null) || 
             (this.controllerType!=null &&
              this.controllerType.equals(other.getControllerType()))) &&
            this.busNumber == other.getBusNumber() &&
            this.unitNumber == other.getUnitNumber();
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
        if (getControllerType() != null) {
            _hashCode += getControllerType().hashCode();
        }
        _hashCode += getBusNumber();
        _hashCode += getUnitNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDiskAttachPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskAttachPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "controllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "busNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "unitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
