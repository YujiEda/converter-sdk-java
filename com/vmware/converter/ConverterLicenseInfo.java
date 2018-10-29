/**
 * ConverterLicenseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterLicenseInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String entityId;

    private boolean p2VProtectionEnabled;

    private boolean srmSanEnabled;

    private boolean srmHbrEnabled;

    private boolean evaluation;

    private boolean expired;

    private java.util.Calendar expiresOn;

    private int total;

    private int used;

    public ConverterLicenseInfo() {
    }

    public ConverterLicenseInfo(
           java.lang.String entityId,
           boolean p2VProtectionEnabled,
           boolean srmSanEnabled,
           boolean srmHbrEnabled,
           boolean evaluation,
           boolean expired,
           java.util.Calendar expiresOn,
           int total,
           int used) {
        this.entityId = entityId;
        this.p2VProtectionEnabled = p2VProtectionEnabled;
        this.srmSanEnabled = srmSanEnabled;
        this.srmHbrEnabled = srmHbrEnabled;
        this.evaluation = evaluation;
        this.expired = expired;
        this.expiresOn = expiresOn;
        this.total = total;
        this.used = used;
    }


    /**
     * Gets the entityId value for this ConverterLicenseInfo.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this ConverterLicenseInfo.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the p2VProtectionEnabled value for this ConverterLicenseInfo.
     * 
     * @return p2VProtectionEnabled
     */
    public boolean isP2VProtectionEnabled() {
        return p2VProtectionEnabled;
    }


    /**
     * Sets the p2VProtectionEnabled value for this ConverterLicenseInfo.
     * 
     * @param p2VProtectionEnabled
     */
    public void setP2VProtectionEnabled(boolean p2VProtectionEnabled) {
        this.p2VProtectionEnabled = p2VProtectionEnabled;
    }


    /**
     * Gets the srmSanEnabled value for this ConverterLicenseInfo.
     * 
     * @return srmSanEnabled
     */
    public boolean isSrmSanEnabled() {
        return srmSanEnabled;
    }


    /**
     * Sets the srmSanEnabled value for this ConverterLicenseInfo.
     * 
     * @param srmSanEnabled
     */
    public void setSrmSanEnabled(boolean srmSanEnabled) {
        this.srmSanEnabled = srmSanEnabled;
    }


    /**
     * Gets the srmHbrEnabled value for this ConverterLicenseInfo.
     * 
     * @return srmHbrEnabled
     */
    public boolean isSrmHbrEnabled() {
        return srmHbrEnabled;
    }


    /**
     * Sets the srmHbrEnabled value for this ConverterLicenseInfo.
     * 
     * @param srmHbrEnabled
     */
    public void setSrmHbrEnabled(boolean srmHbrEnabled) {
        this.srmHbrEnabled = srmHbrEnabled;
    }


    /**
     * Gets the evaluation value for this ConverterLicenseInfo.
     * 
     * @return evaluation
     */
    public boolean isEvaluation() {
        return evaluation;
    }


    /**
     * Sets the evaluation value for this ConverterLicenseInfo.
     * 
     * @param evaluation
     */
    public void setEvaluation(boolean evaluation) {
        this.evaluation = evaluation;
    }


    /**
     * Gets the expired value for this ConverterLicenseInfo.
     * 
     * @return expired
     */
    public boolean isExpired() {
        return expired;
    }


    /**
     * Sets the expired value for this ConverterLicenseInfo.
     * 
     * @param expired
     */
    public void setExpired(boolean expired) {
        this.expired = expired;
    }


    /**
     * Gets the expiresOn value for this ConverterLicenseInfo.
     * 
     * @return expiresOn
     */
    public java.util.Calendar getExpiresOn() {
        return expiresOn;
    }


    /**
     * Sets the expiresOn value for this ConverterLicenseInfo.
     * 
     * @param expiresOn
     */
    public void setExpiresOn(java.util.Calendar expiresOn) {
        this.expiresOn = expiresOn;
    }


    /**
     * Gets the total value for this ConverterLicenseInfo.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this ConverterLicenseInfo.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the used value for this ConverterLicenseInfo.
     * 
     * @return used
     */
    public int getUsed() {
        return used;
    }


    /**
     * Sets the used value for this ConverterLicenseInfo.
     * 
     * @param used
     */
    public void setUsed(int used) {
        this.used = used;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterLicenseInfo)) return false;
        ConverterLicenseInfo other = (ConverterLicenseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            this.p2VProtectionEnabled == other.isP2VProtectionEnabled() &&
            this.srmSanEnabled == other.isSrmSanEnabled() &&
            this.srmHbrEnabled == other.isSrmHbrEnabled() &&
            this.evaluation == other.isEvaluation() &&
            this.expired == other.isExpired() &&
            ((this.expiresOn==null && other.getExpiresOn()==null) || 
             (this.expiresOn!=null &&
              this.expiresOn.equals(other.getExpiresOn()))) &&
            this.total == other.getTotal() &&
            this.used == other.getUsed();
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
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        _hashCode += (isP2VProtectionEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSrmSanEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSrmHbrEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEvaluation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExpired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExpiresOn() != null) {
            _hashCode += getExpiresOn().hashCode();
        }
        _hashCode += getTotal();
        _hashCode += getUsed();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterLicenseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterLicenseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p2VProtectionEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "p2vProtectionEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srmSanEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "srmSanEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srmHbrEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "srmHbrEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "evaluation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "expired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiresOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "expiresOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "used"));
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
