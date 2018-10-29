/**
 * VirtualEthernetCardResourceAllocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualEthernetCardResourceAllocation  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long reservation;

    private com.vmware.converter.SharesInfo share;

    private java.lang.Long limit;

    public VirtualEthernetCardResourceAllocation() {
    }

    public VirtualEthernetCardResourceAllocation(
           java.lang.Long reservation,
           com.vmware.converter.SharesInfo share,
           java.lang.Long limit) {
        this.reservation = reservation;
        this.share = share;
        this.limit = limit;
    }


    /**
     * Gets the reservation value for this VirtualEthernetCardResourceAllocation.
     * 
     * @return reservation
     */
    public java.lang.Long getReservation() {
        return reservation;
    }


    /**
     * Sets the reservation value for this VirtualEthernetCardResourceAllocation.
     * 
     * @param reservation
     */
    public void setReservation(java.lang.Long reservation) {
        this.reservation = reservation;
    }


    /**
     * Gets the share value for this VirtualEthernetCardResourceAllocation.
     * 
     * @return share
     */
    public com.vmware.converter.SharesInfo getShare() {
        return share;
    }


    /**
     * Sets the share value for this VirtualEthernetCardResourceAllocation.
     * 
     * @param share
     */
    public void setShare(com.vmware.converter.SharesInfo share) {
        this.share = share;
    }


    /**
     * Gets the limit value for this VirtualEthernetCardResourceAllocation.
     * 
     * @return limit
     */
    public java.lang.Long getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this VirtualEthernetCardResourceAllocation.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Long limit) {
        this.limit = limit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualEthernetCardResourceAllocation)) return false;
        VirtualEthernetCardResourceAllocation other = (VirtualEthernetCardResourceAllocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reservation==null && other.getReservation()==null) || 
             (this.reservation!=null &&
              this.reservation.equals(other.getReservation()))) &&
            ((this.share==null && other.getShare()==null) || 
             (this.share!=null &&
              this.share.equals(other.getShare()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit())));
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
        if (getReservation() != null) {
            _hashCode += getReservation().hashCode();
        }
        if (getShare() != null) {
            _hashCode += getShare().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualEthernetCardResourceAllocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualEthernetCardResourceAllocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("share");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "share"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "limit"));
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
