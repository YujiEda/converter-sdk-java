/**
 * VsanPolicySatisfiability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanPolicySatisfiability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String uuid;

    private boolean isSatisfiable;

    private com.vmware.converter.LocalizableMessage reason;

    private com.vmware.converter.VsanPolicyCost cost;

    public VsanPolicySatisfiability() {
    }

    public VsanPolicySatisfiability(
           java.lang.String uuid,
           boolean isSatisfiable,
           com.vmware.converter.LocalizableMessage reason,
           com.vmware.converter.VsanPolicyCost cost) {
        this.uuid = uuid;
        this.isSatisfiable = isSatisfiable;
        this.reason = reason;
        this.cost = cost;
    }


    /**
     * Gets the uuid value for this VsanPolicySatisfiability.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VsanPolicySatisfiability.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the isSatisfiable value for this VsanPolicySatisfiability.
     * 
     * @return isSatisfiable
     */
    public boolean isIsSatisfiable() {
        return isSatisfiable;
    }


    /**
     * Sets the isSatisfiable value for this VsanPolicySatisfiability.
     * 
     * @param isSatisfiable
     */
    public void setIsSatisfiable(boolean isSatisfiable) {
        this.isSatisfiable = isSatisfiable;
    }


    /**
     * Gets the reason value for this VsanPolicySatisfiability.
     * 
     * @return reason
     */
    public com.vmware.converter.LocalizableMessage getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this VsanPolicySatisfiability.
     * 
     * @param reason
     */
    public void setReason(com.vmware.converter.LocalizableMessage reason) {
        this.reason = reason;
    }


    /**
     * Gets the cost value for this VsanPolicySatisfiability.
     * 
     * @return cost
     */
    public com.vmware.converter.VsanPolicyCost getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this VsanPolicySatisfiability.
     * 
     * @param cost
     */
    public void setCost(com.vmware.converter.VsanPolicyCost cost) {
        this.cost = cost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanPolicySatisfiability)) return false;
        VsanPolicySatisfiability other = (VsanPolicySatisfiability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            this.isSatisfiable == other.isIsSatisfiable() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        _hashCode += (isIsSatisfiable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanPolicySatisfiability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanPolicySatisfiability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSatisfiable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isSatisfiable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizableMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanPolicyCost"));
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
