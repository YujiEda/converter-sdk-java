/**
 * DVSNetworkResourcePoolAllocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSNetworkResourcePoolAllocationInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long limit;

    private com.vmware.converter.SharesInfo shares;

    private java.lang.Integer priorityTag;

    public DVSNetworkResourcePoolAllocationInfo() {
    }

    public DVSNetworkResourcePoolAllocationInfo(
           java.lang.Long limit,
           com.vmware.converter.SharesInfo shares,
           java.lang.Integer priorityTag) {
        this.limit = limit;
        this.shares = shares;
        this.priorityTag = priorityTag;
    }


    /**
     * Gets the limit value for this DVSNetworkResourcePoolAllocationInfo.
     * 
     * @return limit
     */
    public java.lang.Long getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this DVSNetworkResourcePoolAllocationInfo.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Long limit) {
        this.limit = limit;
    }


    /**
     * Gets the shares value for this DVSNetworkResourcePoolAllocationInfo.
     * 
     * @return shares
     */
    public com.vmware.converter.SharesInfo getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this DVSNetworkResourcePoolAllocationInfo.
     * 
     * @param shares
     */
    public void setShares(com.vmware.converter.SharesInfo shares) {
        this.shares = shares;
    }


    /**
     * Gets the priorityTag value for this DVSNetworkResourcePoolAllocationInfo.
     * 
     * @return priorityTag
     */
    public java.lang.Integer getPriorityTag() {
        return priorityTag;
    }


    /**
     * Sets the priorityTag value for this DVSNetworkResourcePoolAllocationInfo.
     * 
     * @param priorityTag
     */
    public void setPriorityTag(java.lang.Integer priorityTag) {
        this.priorityTag = priorityTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSNetworkResourcePoolAllocationInfo)) return false;
        DVSNetworkResourcePoolAllocationInfo other = (DVSNetworkResourcePoolAllocationInfo) obj;
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
            ((this.priorityTag==null && other.getPriorityTag()==null) || 
             (this.priorityTag!=null &&
              this.priorityTag.equals(other.getPriorityTag())));
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
        if (getPriorityTag() != null) {
            _hashCode += getPriorityTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSNetworkResourcePoolAllocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourcePoolAllocationInfo"));
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
        elemField.setFieldName("priorityTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "priorityTag"));
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
