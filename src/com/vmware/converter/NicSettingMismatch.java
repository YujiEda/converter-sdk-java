/**
 * NicSettingMismatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NicSettingMismatch  extends com.vmware.converter.CustomizationFault  implements java.io.Serializable {
    private int numberOfNicsInSpec;

    private int numberOfNicsInVM;

    public NicSettingMismatch() {
    }

    public NicSettingMismatch(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int numberOfNicsInSpec,
           int numberOfNicsInVM) {
        super(
            faultCause,
            faultMessage);
        this.numberOfNicsInSpec = numberOfNicsInSpec;
        this.numberOfNicsInVM = numberOfNicsInVM;
    }


    /**
     * Gets the numberOfNicsInSpec value for this NicSettingMismatch.
     * 
     * @return numberOfNicsInSpec
     */
    public int getNumberOfNicsInSpec() {
        return numberOfNicsInSpec;
    }


    /**
     * Sets the numberOfNicsInSpec value for this NicSettingMismatch.
     * 
     * @param numberOfNicsInSpec
     */
    public void setNumberOfNicsInSpec(int numberOfNicsInSpec) {
        this.numberOfNicsInSpec = numberOfNicsInSpec;
    }


    /**
     * Gets the numberOfNicsInVM value for this NicSettingMismatch.
     * 
     * @return numberOfNicsInVM
     */
    public int getNumberOfNicsInVM() {
        return numberOfNicsInVM;
    }


    /**
     * Sets the numberOfNicsInVM value for this NicSettingMismatch.
     * 
     * @param numberOfNicsInVM
     */
    public void setNumberOfNicsInVM(int numberOfNicsInVM) {
        this.numberOfNicsInVM = numberOfNicsInVM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NicSettingMismatch)) return false;
        NicSettingMismatch other = (NicSettingMismatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numberOfNicsInSpec == other.getNumberOfNicsInSpec() &&
            this.numberOfNicsInVM == other.getNumberOfNicsInVM();
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
        _hashCode += getNumberOfNicsInSpec();
        _hashCode += getNumberOfNicsInVM();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NicSettingMismatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NicSettingMismatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfNicsInSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numberOfNicsInSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfNicsInVM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numberOfNicsInVM"));
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
