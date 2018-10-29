/**
 * OvfCpuCompatibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfCpuCompatibility  extends com.vmware.converter.OvfImport  implements java.io.Serializable {
    private java.lang.String registerName;

    private int level;

    private java.lang.String registerValue;

    private java.lang.String desiredRegisterValue;

    public OvfCpuCompatibility() {
    }

    public OvfCpuCompatibility(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String registerName,
           int level,
           java.lang.String registerValue,
           java.lang.String desiredRegisterValue) {
        super(
            faultCause,
            faultMessage);
        this.registerName = registerName;
        this.level = level;
        this.registerValue = registerValue;
        this.desiredRegisterValue = desiredRegisterValue;
    }


    /**
     * Gets the registerName value for this OvfCpuCompatibility.
     * 
     * @return registerName
     */
    public java.lang.String getRegisterName() {
        return registerName;
    }


    /**
     * Sets the registerName value for this OvfCpuCompatibility.
     * 
     * @param registerName
     */
    public void setRegisterName(java.lang.String registerName) {
        this.registerName = registerName;
    }


    /**
     * Gets the level value for this OvfCpuCompatibility.
     * 
     * @return level
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this OvfCpuCompatibility.
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Gets the registerValue value for this OvfCpuCompatibility.
     * 
     * @return registerValue
     */
    public java.lang.String getRegisterValue() {
        return registerValue;
    }


    /**
     * Sets the registerValue value for this OvfCpuCompatibility.
     * 
     * @param registerValue
     */
    public void setRegisterValue(java.lang.String registerValue) {
        this.registerValue = registerValue;
    }


    /**
     * Gets the desiredRegisterValue value for this OvfCpuCompatibility.
     * 
     * @return desiredRegisterValue
     */
    public java.lang.String getDesiredRegisterValue() {
        return desiredRegisterValue;
    }


    /**
     * Sets the desiredRegisterValue value for this OvfCpuCompatibility.
     * 
     * @param desiredRegisterValue
     */
    public void setDesiredRegisterValue(java.lang.String desiredRegisterValue) {
        this.desiredRegisterValue = desiredRegisterValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfCpuCompatibility)) return false;
        OvfCpuCompatibility other = (OvfCpuCompatibility) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registerName==null && other.getRegisterName()==null) || 
             (this.registerName!=null &&
              this.registerName.equals(other.getRegisterName()))) &&
            this.level == other.getLevel() &&
            ((this.registerValue==null && other.getRegisterValue()==null) || 
             (this.registerValue!=null &&
              this.registerValue.equals(other.getRegisterValue()))) &&
            ((this.desiredRegisterValue==null && other.getDesiredRegisterValue()==null) || 
             (this.desiredRegisterValue!=null &&
              this.desiredRegisterValue.equals(other.getDesiredRegisterValue())));
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
        if (getRegisterName() != null) {
            _hashCode += getRegisterName().hashCode();
        }
        _hashCode += getLevel();
        if (getRegisterValue() != null) {
            _hashCode += getRegisterValue().hashCode();
        }
        if (getDesiredRegisterValue() != null) {
            _hashCode += getDesiredRegisterValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfCpuCompatibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfCpuCompatibility"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "registerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "registerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desiredRegisterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "desiredRegisterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
