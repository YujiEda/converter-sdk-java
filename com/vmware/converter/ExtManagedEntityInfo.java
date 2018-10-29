/**
 * ExtManagedEntityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ExtManagedEntityInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String smallIconUrl;

    private java.lang.String iconUrl;

    private java.lang.String description;

    public ExtManagedEntityInfo() {
    }

    public ExtManagedEntityInfo(
           java.lang.String type,
           java.lang.String smallIconUrl,
           java.lang.String iconUrl,
           java.lang.String description) {
        this.type = type;
        this.smallIconUrl = smallIconUrl;
        this.iconUrl = iconUrl;
        this.description = description;
    }


    /**
     * Gets the type value for this ExtManagedEntityInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ExtManagedEntityInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the smallIconUrl value for this ExtManagedEntityInfo.
     * 
     * @return smallIconUrl
     */
    public java.lang.String getSmallIconUrl() {
        return smallIconUrl;
    }


    /**
     * Sets the smallIconUrl value for this ExtManagedEntityInfo.
     * 
     * @param smallIconUrl
     */
    public void setSmallIconUrl(java.lang.String smallIconUrl) {
        this.smallIconUrl = smallIconUrl;
    }


    /**
     * Gets the iconUrl value for this ExtManagedEntityInfo.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this ExtManagedEntityInfo.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the description value for this ExtManagedEntityInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExtManagedEntityInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtManagedEntityInfo)) return false;
        ExtManagedEntityInfo other = (ExtManagedEntityInfo) obj;
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
            ((this.smallIconUrl==null && other.getSmallIconUrl()==null) || 
             (this.smallIconUrl!=null &&
              this.smallIconUrl.equals(other.getSmallIconUrl()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getSmallIconUrl() != null) {
            _hashCode += getSmallIconUrl().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtManagedEntityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtManagedEntityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallIconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smallIconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
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
