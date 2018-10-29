/**
 * VrpResourceAllocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VrpResourceAllocationInfo  extends com.vmware.converter.ResourceAllocationInfo  implements java.io.Serializable {
    private java.lang.Long reservationLimit;

    public VrpResourceAllocationInfo() {
    }

    public VrpResourceAllocationInfo(
           java.lang.Long reservation,
           java.lang.Boolean expandableReservation,
           java.lang.Long limit,
           com.vmware.converter.SharesInfo shares,
           java.lang.Long overheadLimit,
           java.lang.Long reservationLimit) {
        super(
            reservation,
            expandableReservation,
            limit,
            shares,
            overheadLimit);
        this.reservationLimit = reservationLimit;
    }


    /**
     * Gets the reservationLimit value for this VrpResourceAllocationInfo.
     * 
     * @return reservationLimit
     */
    public java.lang.Long getReservationLimit() {
        return reservationLimit;
    }


    /**
     * Sets the reservationLimit value for this VrpResourceAllocationInfo.
     * 
     * @param reservationLimit
     */
    public void setReservationLimit(java.lang.Long reservationLimit) {
        this.reservationLimit = reservationLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VrpResourceAllocationInfo)) return false;
        VrpResourceAllocationInfo other = (VrpResourceAllocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reservationLimit==null && other.getReservationLimit()==null) || 
             (this.reservationLimit!=null &&
              this.reservationLimit.equals(other.getReservationLimit())));
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
        if (getReservationLimit() != null) {
            _hashCode += getReservationLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VrpResourceAllocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VrpResourceAllocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
