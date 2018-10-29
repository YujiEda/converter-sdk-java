/**
 * LatencySensitivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class LatencySensitivity  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.LatencySensitivitySensitivityLevel level;

    private java.lang.Integer sensitivity;

    public LatencySensitivity() {
    }

    public LatencySensitivity(
           com.vmware.converter.LatencySensitivitySensitivityLevel level,
           java.lang.Integer sensitivity) {
        this.level = level;
        this.sensitivity = sensitivity;
    }


    /**
     * Gets the level value for this LatencySensitivity.
     * 
     * @return level
     */
    public com.vmware.converter.LatencySensitivitySensitivityLevel getLevel() {
        return level;
    }


    /**
     * Sets the level value for this LatencySensitivity.
     * 
     * @param level
     */
    public void setLevel(com.vmware.converter.LatencySensitivitySensitivityLevel level) {
        this.level = level;
    }


    /**
     * Gets the sensitivity value for this LatencySensitivity.
     * 
     * @return sensitivity
     */
    public java.lang.Integer getSensitivity() {
        return sensitivity;
    }


    /**
     * Sets the sensitivity value for this LatencySensitivity.
     * 
     * @param sensitivity
     */
    public void setSensitivity(java.lang.Integer sensitivity) {
        this.sensitivity = sensitivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LatencySensitivity)) return false;
        LatencySensitivity other = (LatencySensitivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.sensitivity==null && other.getSensitivity()==null) || 
             (this.sensitivity!=null &&
              this.sensitivity.equals(other.getSensitivity())));
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
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getSensitivity() != null) {
            _hashCode += getSensitivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LatencySensitivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LatencySensitivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LatencySensitivitySensitivityLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensitivity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sensitivity"));
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
