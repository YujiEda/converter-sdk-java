/**
 * FaultTolerancePrimaryPowerOnNotAttempted.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FaultTolerancePrimaryPowerOnNotAttempted  extends com.vmware.converter.VmFaultToleranceIssue  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference secondaryVm;

    private com.vmware.converter.ManagedObjectReference primaryVm;

    public FaultTolerancePrimaryPowerOnNotAttempted() {
    }

    public FaultTolerancePrimaryPowerOnNotAttempted(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference secondaryVm,
           com.vmware.converter.ManagedObjectReference primaryVm) {
        super(
            faultCause,
            faultMessage);
        this.secondaryVm = secondaryVm;
        this.primaryVm = primaryVm;
    }


    /**
     * Gets the secondaryVm value for this FaultTolerancePrimaryPowerOnNotAttempted.
     * 
     * @return secondaryVm
     */
    public com.vmware.converter.ManagedObjectReference getSecondaryVm() {
        return secondaryVm;
    }


    /**
     * Sets the secondaryVm value for this FaultTolerancePrimaryPowerOnNotAttempted.
     * 
     * @param secondaryVm
     */
    public void setSecondaryVm(com.vmware.converter.ManagedObjectReference secondaryVm) {
        this.secondaryVm = secondaryVm;
    }


    /**
     * Gets the primaryVm value for this FaultTolerancePrimaryPowerOnNotAttempted.
     * 
     * @return primaryVm
     */
    public com.vmware.converter.ManagedObjectReference getPrimaryVm() {
        return primaryVm;
    }


    /**
     * Sets the primaryVm value for this FaultTolerancePrimaryPowerOnNotAttempted.
     * 
     * @param primaryVm
     */
    public void setPrimaryVm(com.vmware.converter.ManagedObjectReference primaryVm) {
        this.primaryVm = primaryVm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultTolerancePrimaryPowerOnNotAttempted)) return false;
        FaultTolerancePrimaryPowerOnNotAttempted other = (FaultTolerancePrimaryPowerOnNotAttempted) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.secondaryVm==null && other.getSecondaryVm()==null) || 
             (this.secondaryVm!=null &&
              this.secondaryVm.equals(other.getSecondaryVm()))) &&
            ((this.primaryVm==null && other.getPrimaryVm()==null) || 
             (this.primaryVm!=null &&
              this.primaryVm.equals(other.getPrimaryVm())));
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
        if (getSecondaryVm() != null) {
            _hashCode += getSecondaryVm().hashCode();
        }
        if (getPrimaryVm() != null) {
            _hashCode += getPrimaryVm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultTolerancePrimaryPowerOnNotAttempted.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultTolerancePrimaryPowerOnNotAttempted"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "secondaryVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
