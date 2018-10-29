/**
 * VsanUpgradeSystemUpgradeHistoryPreflightFail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemUpgradeHistoryPreflightFail  extends com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem  implements java.io.Serializable {
    private com.vmware.converter.VsanUpgradeSystemPreflightCheckResult preflightResult;

    public VsanUpgradeSystemUpgradeHistoryPreflightFail() {
    }

    public VsanUpgradeSystemUpgradeHistoryPreflightFail(
           java.util.Calendar timestamp,
           com.vmware.converter.ManagedObjectReference host,
           java.lang.String message,
           com.vmware.converter.ManagedObjectReference task,
           com.vmware.converter.VsanUpgradeSystemPreflightCheckResult preflightResult) {
        super(
            timestamp,
            host,
            message,
            task);
        this.preflightResult = preflightResult;
    }


    /**
     * Gets the preflightResult value for this VsanUpgradeSystemUpgradeHistoryPreflightFail.
     * 
     * @return preflightResult
     */
    public com.vmware.converter.VsanUpgradeSystemPreflightCheckResult getPreflightResult() {
        return preflightResult;
    }


    /**
     * Sets the preflightResult value for this VsanUpgradeSystemUpgradeHistoryPreflightFail.
     * 
     * @param preflightResult
     */
    public void setPreflightResult(com.vmware.converter.VsanUpgradeSystemPreflightCheckResult preflightResult) {
        this.preflightResult = preflightResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemUpgradeHistoryPreflightFail)) return false;
        VsanUpgradeSystemUpgradeHistoryPreflightFail other = (VsanUpgradeSystemUpgradeHistoryPreflightFail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.preflightResult==null && other.getPreflightResult()==null) || 
             (this.preflightResult!=null &&
              this.preflightResult.equals(other.getPreflightResult())));
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
        if (getPreflightResult() != null) {
            _hashCode += getPreflightResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemUpgradeHistoryPreflightFail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemUpgradeHistoryPreflightFail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preflightResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "preflightResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemPreflightCheckResult"));
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
