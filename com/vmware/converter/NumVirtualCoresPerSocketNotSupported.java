/**
 * NumVirtualCoresPerSocketNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NumVirtualCoresPerSocketNotSupported  extends com.vmware.converter.VirtualHardwareCompatibilityIssue  implements java.io.Serializable {
    private int maxSupportedCoresPerSocketDest;

    private int numCoresPerSocketVm;

    public NumVirtualCoresPerSocketNotSupported() {
    }

    public NumVirtualCoresPerSocketNotSupported(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int maxSupportedCoresPerSocketDest,
           int numCoresPerSocketVm) {
        super(
            faultCause,
            faultMessage);
        this.maxSupportedCoresPerSocketDest = maxSupportedCoresPerSocketDest;
        this.numCoresPerSocketVm = numCoresPerSocketVm;
    }


    /**
     * Gets the maxSupportedCoresPerSocketDest value for this NumVirtualCoresPerSocketNotSupported.
     * 
     * @return maxSupportedCoresPerSocketDest
     */
    public int getMaxSupportedCoresPerSocketDest() {
        return maxSupportedCoresPerSocketDest;
    }


    /**
     * Sets the maxSupportedCoresPerSocketDest value for this NumVirtualCoresPerSocketNotSupported.
     * 
     * @param maxSupportedCoresPerSocketDest
     */
    public void setMaxSupportedCoresPerSocketDest(int maxSupportedCoresPerSocketDest) {
        this.maxSupportedCoresPerSocketDest = maxSupportedCoresPerSocketDest;
    }


    /**
     * Gets the numCoresPerSocketVm value for this NumVirtualCoresPerSocketNotSupported.
     * 
     * @return numCoresPerSocketVm
     */
    public int getNumCoresPerSocketVm() {
        return numCoresPerSocketVm;
    }


    /**
     * Sets the numCoresPerSocketVm value for this NumVirtualCoresPerSocketNotSupported.
     * 
     * @param numCoresPerSocketVm
     */
    public void setNumCoresPerSocketVm(int numCoresPerSocketVm) {
        this.numCoresPerSocketVm = numCoresPerSocketVm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumVirtualCoresPerSocketNotSupported)) return false;
        NumVirtualCoresPerSocketNotSupported other = (NumVirtualCoresPerSocketNotSupported) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.maxSupportedCoresPerSocketDest == other.getMaxSupportedCoresPerSocketDest() &&
            this.numCoresPerSocketVm == other.getNumCoresPerSocketVm();
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
        _hashCode += getMaxSupportedCoresPerSocketDest();
        _hashCode += getNumCoresPerSocketVm();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumVirtualCoresPerSocketNotSupported.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumVirtualCoresPerSocketNotSupported"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedCoresPerSocketDest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedCoresPerSocketDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCoresPerSocketVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCoresPerSocketVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
