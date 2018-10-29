/**
 * VirtualUSBControllerPciBusSlotInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualUSBControllerPciBusSlotInfo  extends com.vmware.converter.VirtualDevicePciBusSlotInfo  implements java.io.Serializable {
    private java.lang.Integer ehciPciSlotNumber;

    public VirtualUSBControllerPciBusSlotInfo() {
    }

    public VirtualUSBControllerPciBusSlotInfo(
           int pciSlotNumber,
           java.lang.Integer ehciPciSlotNumber) {
        super(
            pciSlotNumber);
        this.ehciPciSlotNumber = ehciPciSlotNumber;
    }


    /**
     * Gets the ehciPciSlotNumber value for this VirtualUSBControllerPciBusSlotInfo.
     * 
     * @return ehciPciSlotNumber
     */
    public java.lang.Integer getEhciPciSlotNumber() {
        return ehciPciSlotNumber;
    }


    /**
     * Sets the ehciPciSlotNumber value for this VirtualUSBControllerPciBusSlotInfo.
     * 
     * @param ehciPciSlotNumber
     */
    public void setEhciPciSlotNumber(java.lang.Integer ehciPciSlotNumber) {
        this.ehciPciSlotNumber = ehciPciSlotNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualUSBControllerPciBusSlotInfo)) return false;
        VirtualUSBControllerPciBusSlotInfo other = (VirtualUSBControllerPciBusSlotInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ehciPciSlotNumber==null && other.getEhciPciSlotNumber()==null) || 
             (this.ehciPciSlotNumber!=null &&
              this.ehciPciSlotNumber.equals(other.getEhciPciSlotNumber())));
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
        if (getEhciPciSlotNumber() != null) {
            _hashCode += getEhciPciSlotNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualUSBControllerPciBusSlotInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualUSBControllerPciBusSlotInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehciPciSlotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ehciPciSlotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
