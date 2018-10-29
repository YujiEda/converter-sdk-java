/**
 * ExtExtendedProductInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ExtExtendedProductInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String companyUrl;

    private java.lang.String productUrl;

    private java.lang.String managementUrl;

    private com.vmware.converter.ManagedObjectReference self;

    public ExtExtendedProductInfo() {
    }

    public ExtExtendedProductInfo(
           java.lang.String companyUrl,
           java.lang.String productUrl,
           java.lang.String managementUrl,
           com.vmware.converter.ManagedObjectReference self) {
        this.companyUrl = companyUrl;
        this.productUrl = productUrl;
        this.managementUrl = managementUrl;
        this.self = self;
    }


    /**
     * Gets the companyUrl value for this ExtExtendedProductInfo.
     * 
     * @return companyUrl
     */
    public java.lang.String getCompanyUrl() {
        return companyUrl;
    }


    /**
     * Sets the companyUrl value for this ExtExtendedProductInfo.
     * 
     * @param companyUrl
     */
    public void setCompanyUrl(java.lang.String companyUrl) {
        this.companyUrl = companyUrl;
    }


    /**
     * Gets the productUrl value for this ExtExtendedProductInfo.
     * 
     * @return productUrl
     */
    public java.lang.String getProductUrl() {
        return productUrl;
    }


    /**
     * Sets the productUrl value for this ExtExtendedProductInfo.
     * 
     * @param productUrl
     */
    public void setProductUrl(java.lang.String productUrl) {
        this.productUrl = productUrl;
    }


    /**
     * Gets the managementUrl value for this ExtExtendedProductInfo.
     * 
     * @return managementUrl
     */
    public java.lang.String getManagementUrl() {
        return managementUrl;
    }


    /**
     * Sets the managementUrl value for this ExtExtendedProductInfo.
     * 
     * @param managementUrl
     */
    public void setManagementUrl(java.lang.String managementUrl) {
        this.managementUrl = managementUrl;
    }


    /**
     * Gets the self value for this ExtExtendedProductInfo.
     * 
     * @return self
     */
    public com.vmware.converter.ManagedObjectReference getSelf() {
        return self;
    }


    /**
     * Sets the self value for this ExtExtendedProductInfo.
     * 
     * @param self
     */
    public void setSelf(com.vmware.converter.ManagedObjectReference self) {
        this.self = self;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtExtendedProductInfo)) return false;
        ExtExtendedProductInfo other = (ExtExtendedProductInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companyUrl==null && other.getCompanyUrl()==null) || 
             (this.companyUrl!=null &&
              this.companyUrl.equals(other.getCompanyUrl()))) &&
            ((this.productUrl==null && other.getProductUrl()==null) || 
             (this.productUrl!=null &&
              this.productUrl.equals(other.getProductUrl()))) &&
            ((this.managementUrl==null && other.getManagementUrl()==null) || 
             (this.managementUrl!=null &&
              this.managementUrl.equals(other.getManagementUrl()))) &&
            ((this.self==null && other.getSelf()==null) || 
             (this.self!=null &&
              this.self.equals(other.getSelf())));
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
        if (getCompanyUrl() != null) {
            _hashCode += getCompanyUrl().hashCode();
        }
        if (getProductUrl() != null) {
            _hashCode += getProductUrl().hashCode();
        }
        if (getManagementUrl() != null) {
            _hashCode += getManagementUrl().hashCode();
        }
        if (getSelf() != null) {
            _hashCode += getSelf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtExtendedProductInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtExtendedProductInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "companyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "managementUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("self");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "self"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
