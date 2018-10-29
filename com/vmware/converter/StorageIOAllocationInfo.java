/**
 * StorageIOAllocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageIOAllocationInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long limit;

    private com.vmware.converter.SharesInfo shares;

    private java.lang.Integer reservation;

    public StorageIOAllocationInfo() {
    }

    public StorageIOAllocationInfo(
           java.lang.Long limit,
           com.vmware.converter.SharesInfo shares,
           java.lang.Integer reservation) {
        this.limit = limit;
        this.shares = shares;
        this.reservation = reservation;
    }


    /**
     * Gets the limit value for this StorageIOAllocationInfo.
     * 
     * @return limit
     */
    public java.lang.Long getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this StorageIOAllocationInfo.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Long limit) {
        this.limit = limit;
    }


    /**
     * Gets the shares value for this StorageIOAllocationInfo.
     * 
     * @return shares
     */
    public com.vmware.converter.SharesInfo getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this StorageIOAllocationInfo.
     * 
     * @param shares
     */
    public void setShares(com.vmware.converter.SharesInfo shares) {
        this.shares = shares;
    }


    /**
     * Gets the reservation value for this StorageIOAllocationInfo.
     * 
     * @return reservation
     */
    public java.lang.Integer getReservation() {
        return reservation;
    }


    /**
     * Sets the reservation value for this StorageIOAllocationInfo.
     * 
     * @param reservation
     */
    public void setReservation(java.lang.Integer reservation) {
        this.reservation = reservation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageIOAllocationInfo)) return false;
        StorageIOAllocationInfo other = (StorageIOAllocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.reservation==null && other.getReservation()==null) || 
             (this.reservation!=null &&
              this.reservation.equals(other.getReservation())));
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
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getReservation() != null) {
            _hashCode += getReservation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageIOAllocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageIOAllocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservation"));
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
