/**
 * ResourceAllocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ResourceAllocationInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long reservation;

    private java.lang.Boolean expandableReservation;

    private java.lang.Long limit;

    private com.vmware.converter.SharesInfo shares;

    private java.lang.Long overheadLimit;

    public ResourceAllocationInfo() {
    }

    public ResourceAllocationInfo(
           java.lang.Long reservation,
           java.lang.Boolean expandableReservation,
           java.lang.Long limit,
           com.vmware.converter.SharesInfo shares,
           java.lang.Long overheadLimit) {
        this.reservation = reservation;
        this.expandableReservation = expandableReservation;
        this.limit = limit;
        this.shares = shares;
        this.overheadLimit = overheadLimit;
    }


    /**
     * Gets the reservation value for this ResourceAllocationInfo.
     * 
     * @return reservation
     */
    public java.lang.Long getReservation() {
        return reservation;
    }


    /**
     * Sets the reservation value for this ResourceAllocationInfo.
     * 
     * @param reservation
     */
    public void setReservation(java.lang.Long reservation) {
        this.reservation = reservation;
    }


    /**
     * Gets the expandableReservation value for this ResourceAllocationInfo.
     * 
     * @return expandableReservation
     */
    public java.lang.Boolean getExpandableReservation() {
        return expandableReservation;
    }


    /**
     * Sets the expandableReservation value for this ResourceAllocationInfo.
     * 
     * @param expandableReservation
     */
    public void setExpandableReservation(java.lang.Boolean expandableReservation) {
        this.expandableReservation = expandableReservation;
    }


    /**
     * Gets the limit value for this ResourceAllocationInfo.
     * 
     * @return limit
     */
    public java.lang.Long getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this ResourceAllocationInfo.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Long limit) {
        this.limit = limit;
    }


    /**
     * Gets the shares value for this ResourceAllocationInfo.
     * 
     * @return shares
     */
    public com.vmware.converter.SharesInfo getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this ResourceAllocationInfo.
     * 
     * @param shares
     */
    public void setShares(com.vmware.converter.SharesInfo shares) {
        this.shares = shares;
    }


    /**
     * Gets the overheadLimit value for this ResourceAllocationInfo.
     * 
     * @return overheadLimit
     */
    public java.lang.Long getOverheadLimit() {
        return overheadLimit;
    }


    /**
     * Sets the overheadLimit value for this ResourceAllocationInfo.
     * 
     * @param overheadLimit
     */
    public void setOverheadLimit(java.lang.Long overheadLimit) {
        this.overheadLimit = overheadLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceAllocationInfo)) return false;
        ResourceAllocationInfo other = (ResourceAllocationInfo) obj;
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
            ((this.expandableReservation==null && other.getExpandableReservation()==null) || 
             (this.expandableReservation!=null &&
              this.expandableReservation.equals(other.getExpandableReservation()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.overheadLimit==null && other.getOverheadLimit()==null) || 
             (this.overheadLimit!=null &&
              this.overheadLimit.equals(other.getOverheadLimit())));
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
        if (getExpandableReservation() != null) {
            _hashCode += getExpandableReservation().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getOverheadLimit() != null) {
            _hashCode += getOverheadLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceAllocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceAllocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandableReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expandableReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("overheadLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overheadLimit"));
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
