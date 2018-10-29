/**
 * VsanUpgradeSystemNotEnoughFreeCapacityIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemNotEnoughFreeCapacityIssue  extends com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue  implements java.io.Serializable {
    private boolean reducedRedundancyUpgradePossible;

    public VsanUpgradeSystemNotEnoughFreeCapacityIssue() {
    }

    public VsanUpgradeSystemNotEnoughFreeCapacityIssue(
           java.lang.String msg,
           boolean reducedRedundancyUpgradePossible) {
        super(
            msg);
        this.reducedRedundancyUpgradePossible = reducedRedundancyUpgradePossible;
    }


    /**
     * Gets the reducedRedundancyUpgradePossible value for this VsanUpgradeSystemNotEnoughFreeCapacityIssue.
     * 
     * @return reducedRedundancyUpgradePossible
     */
    public boolean isReducedRedundancyUpgradePossible() {
        return reducedRedundancyUpgradePossible;
    }


    /**
     * Sets the reducedRedundancyUpgradePossible value for this VsanUpgradeSystemNotEnoughFreeCapacityIssue.
     * 
     * @param reducedRedundancyUpgradePossible
     */
    public void setReducedRedundancyUpgradePossible(boolean reducedRedundancyUpgradePossible) {
        this.reducedRedundancyUpgradePossible = reducedRedundancyUpgradePossible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemNotEnoughFreeCapacityIssue)) return false;
        VsanUpgradeSystemNotEnoughFreeCapacityIssue other = (VsanUpgradeSystemNotEnoughFreeCapacityIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.reducedRedundancyUpgradePossible == other.isReducedRedundancyUpgradePossible();
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
        _hashCode += (isReducedRedundancyUpgradePossible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemNotEnoughFreeCapacityIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemNotEnoughFreeCapacityIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reducedRedundancyUpgradePossible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reducedRedundancyUpgradePossible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
