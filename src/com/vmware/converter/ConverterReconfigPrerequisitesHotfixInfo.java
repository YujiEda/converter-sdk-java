/**
 * ConverterReconfigPrerequisitesHotfixInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterReconfigPrerequisitesHotfixInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String identifier;

    private java.lang.String nameHint;

    private java.lang.String installerPath;

    public ConverterReconfigPrerequisitesHotfixInfo() {
    }

    public ConverterReconfigPrerequisitesHotfixInfo(
           java.lang.String type,
           java.lang.String identifier,
           java.lang.String nameHint,
           java.lang.String installerPath) {
        this.type = type;
        this.identifier = identifier;
        this.nameHint = nameHint;
        this.installerPath = installerPath;
    }


    /**
     * Gets the type value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the identifier value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the nameHint value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @return nameHint
     */
    public java.lang.String getNameHint() {
        return nameHint;
    }


    /**
     * Sets the nameHint value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @param nameHint
     */
    public void setNameHint(java.lang.String nameHint) {
        this.nameHint = nameHint;
    }


    /**
     * Gets the installerPath value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @return installerPath
     */
    public java.lang.String getInstallerPath() {
        return installerPath;
    }


    /**
     * Sets the installerPath value for this ConverterReconfigPrerequisitesHotfixInfo.
     * 
     * @param installerPath
     */
    public void setInstallerPath(java.lang.String installerPath) {
        this.installerPath = installerPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterReconfigPrerequisitesHotfixInfo)) return false;
        ConverterReconfigPrerequisitesHotfixInfo other = (ConverterReconfigPrerequisitesHotfixInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.nameHint==null && other.getNameHint()==null) || 
             (this.nameHint!=null &&
              this.nameHint.equals(other.getNameHint()))) &&
            ((this.installerPath==null && other.getInstallerPath()==null) || 
             (this.installerPath!=null &&
              this.installerPath.equals(other.getInstallerPath())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getNameHint() != null) {
            _hashCode += getNameHint().hashCode();
        }
        if (getInstallerPath() != null) {
            _hashCode += getInstallerPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterReconfigPrerequisitesHotfixInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesHotfixInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nameHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installerPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "installerPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
