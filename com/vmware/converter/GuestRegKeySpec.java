/**
 * GuestRegKeySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestRegKeySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.GuestRegKeyNameSpec keyName;

    private java.lang.String classType;

    private java.util.Calendar lastWritten;

    public GuestRegKeySpec() {
    }

    public GuestRegKeySpec(
           com.vmware.converter.GuestRegKeyNameSpec keyName,
           java.lang.String classType,
           java.util.Calendar lastWritten) {
        this.keyName = keyName;
        this.classType = classType;
        this.lastWritten = lastWritten;
    }


    /**
     * Gets the keyName value for this GuestRegKeySpec.
     * 
     * @return keyName
     */
    public com.vmware.converter.GuestRegKeyNameSpec getKeyName() {
        return keyName;
    }


    /**
     * Sets the keyName value for this GuestRegKeySpec.
     * 
     * @param keyName
     */
    public void setKeyName(com.vmware.converter.GuestRegKeyNameSpec keyName) {
        this.keyName = keyName;
    }


    /**
     * Gets the classType value for this GuestRegKeySpec.
     * 
     * @return classType
     */
    public java.lang.String getClassType() {
        return classType;
    }


    /**
     * Sets the classType value for this GuestRegKeySpec.
     * 
     * @param classType
     */
    public void setClassType(java.lang.String classType) {
        this.classType = classType;
    }


    /**
     * Gets the lastWritten value for this GuestRegKeySpec.
     * 
     * @return lastWritten
     */
    public java.util.Calendar getLastWritten() {
        return lastWritten;
    }


    /**
     * Sets the lastWritten value for this GuestRegKeySpec.
     * 
     * @param lastWritten
     */
    public void setLastWritten(java.util.Calendar lastWritten) {
        this.lastWritten = lastWritten;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestRegKeySpec)) return false;
        GuestRegKeySpec other = (GuestRegKeySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyName==null && other.getKeyName()==null) || 
             (this.keyName!=null &&
              this.keyName.equals(other.getKeyName()))) &&
            ((this.classType==null && other.getClassType()==null) || 
             (this.classType!=null &&
              this.classType.equals(other.getClassType()))) &&
            ((this.lastWritten==null && other.getLastWritten()==null) || 
             (this.lastWritten!=null &&
              this.lastWritten.equals(other.getLastWritten())));
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
        if (getKeyName() != null) {
            _hashCode += getKeyName().hashCode();
        }
        if (getClassType() != null) {
            _hashCode += getClassType().hashCode();
        }
        if (getLastWritten() != null) {
            _hashCode += getLastWritten().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestRegKeySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegKeySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "keyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegKeyNameSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "classType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWritten");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastWritten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
