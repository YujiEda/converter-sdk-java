/**
 * ConverterLicenseFeatureInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterLicenseFeatureInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String featureName;

    private java.lang.String featureDescription;

    private java.util.Calendar expiresOn;

    public ConverterLicenseFeatureInfo() {
    }

    public ConverterLicenseFeatureInfo(
           java.lang.String key,
           java.lang.String featureName,
           java.lang.String featureDescription,
           java.util.Calendar expiresOn) {
        this.key = key;
        this.featureName = featureName;
        this.featureDescription = featureDescription;
        this.expiresOn = expiresOn;
    }


    /**
     * Gets the key value for this ConverterLicenseFeatureInfo.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterLicenseFeatureInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the featureName value for this ConverterLicenseFeatureInfo.
     * 
     * @return featureName
     */
    public java.lang.String getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this ConverterLicenseFeatureInfo.
     * 
     * @param featureName
     */
    public void setFeatureName(java.lang.String featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the featureDescription value for this ConverterLicenseFeatureInfo.
     * 
     * @return featureDescription
     */
    public java.lang.String getFeatureDescription() {
        return featureDescription;
    }


    /**
     * Sets the featureDescription value for this ConverterLicenseFeatureInfo.
     * 
     * @param featureDescription
     */
    public void setFeatureDescription(java.lang.String featureDescription) {
        this.featureDescription = featureDescription;
    }


    /**
     * Gets the expiresOn value for this ConverterLicenseFeatureInfo.
     * 
     * @return expiresOn
     */
    public java.util.Calendar getExpiresOn() {
        return expiresOn;
    }


    /**
     * Sets the expiresOn value for this ConverterLicenseFeatureInfo.
     * 
     * @param expiresOn
     */
    public void setExpiresOn(java.util.Calendar expiresOn) {
        this.expiresOn = expiresOn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterLicenseFeatureInfo)) return false;
        ConverterLicenseFeatureInfo other = (ConverterLicenseFeatureInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            ((this.featureDescription==null && other.getFeatureDescription()==null) || 
             (this.featureDescription!=null &&
              this.featureDescription.equals(other.getFeatureDescription()))) &&
            ((this.expiresOn==null && other.getExpiresOn()==null) || 
             (this.expiresOn!=null &&
              this.expiresOn.equals(other.getExpiresOn())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        if (getFeatureDescription() != null) {
            _hashCode += getFeatureDescription().hashCode();
        }
        if (getExpiresOn() != null) {
            _hashCode += getExpiresOn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterLicenseFeatureInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterLicenseFeatureInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "featureDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiresOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "expiresOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
