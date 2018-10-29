/**
 * DvsVmVnicResourceAllocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsVmVnicResourceAllocation  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long reservationQuota;

    public DvsVmVnicResourceAllocation() {
    }

    public DvsVmVnicResourceAllocation(
           java.lang.Long reservationQuota) {
        this.reservationQuota = reservationQuota;
    }


    /**
     * Gets the reservationQuota value for this DvsVmVnicResourceAllocation.
     * 
     * @return reservationQuota
     */
    public java.lang.Long getReservationQuota() {
        return reservationQuota;
    }


    /**
     * Sets the reservationQuota value for this DvsVmVnicResourceAllocation.
     * 
     * @param reservationQuota
     */
    public void setReservationQuota(java.lang.Long reservationQuota) {
        this.reservationQuota = reservationQuota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsVmVnicResourceAllocation)) return false;
        DvsVmVnicResourceAllocation other = (DvsVmVnicResourceAllocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reservationQuota==null && other.getReservationQuota()==null) || 
             (this.reservationQuota!=null &&
              this.reservationQuota.equals(other.getReservationQuota())));
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
        if (getReservationQuota() != null) {
            _hashCode += getReservationQuota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsVmVnicResourceAllocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsVmVnicResourceAllocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationQuota"));
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
