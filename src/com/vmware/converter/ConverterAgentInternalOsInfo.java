/**
 * ConverterAgentInternalOsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalOsInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalOsInfoOsFamily family;

    private java.lang.String displayName;

    private java.lang.String guestOsId;

    private java.lang.String vendor;

    private java.lang.String edition;

    private int majorVersion;

    private int minorVersion;

    public ConverterAgentInternalOsInfo() {
    }

    public ConverterAgentInternalOsInfo(
           com.vmware.converter.ConverterAgentInternalOsInfoOsFamily family,
           java.lang.String displayName,
           java.lang.String guestOsId,
           java.lang.String vendor,
           java.lang.String edition,
           int majorVersion,
           int minorVersion) {
        this.family = family;
        this.displayName = displayName;
        this.guestOsId = guestOsId;
        this.vendor = vendor;
        this.edition = edition;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the family value for this ConverterAgentInternalOsInfo.
     * 
     * @return family
     */
    public com.vmware.converter.ConverterAgentInternalOsInfoOsFamily getFamily() {
        return family;
    }


    /**
     * Sets the family value for this ConverterAgentInternalOsInfo.
     * 
     * @param family
     */
    public void setFamily(com.vmware.converter.ConverterAgentInternalOsInfoOsFamily family) {
        this.family = family;
    }


    /**
     * Gets the displayName value for this ConverterAgentInternalOsInfo.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ConverterAgentInternalOsInfo.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the guestOsId value for this ConverterAgentInternalOsInfo.
     * 
     * @return guestOsId
     */
    public java.lang.String getGuestOsId() {
        return guestOsId;
    }


    /**
     * Sets the guestOsId value for this ConverterAgentInternalOsInfo.
     * 
     * @param guestOsId
     */
    public void setGuestOsId(java.lang.String guestOsId) {
        this.guestOsId = guestOsId;
    }


    /**
     * Gets the vendor value for this ConverterAgentInternalOsInfo.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ConverterAgentInternalOsInfo.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the edition value for this ConverterAgentInternalOsInfo.
     * 
     * @return edition
     */
    public java.lang.String getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this ConverterAgentInternalOsInfo.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) {
        this.edition = edition;
    }


    /**
     * Gets the majorVersion value for this ConverterAgentInternalOsInfo.
     * 
     * @return majorVersion
     */
    public int getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this ConverterAgentInternalOsInfo.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this ConverterAgentInternalOsInfo.
     * 
     * @return minorVersion
     */
    public int getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this ConverterAgentInternalOsInfo.
     * 
     * @param minorVersion
     */
    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalOsInfo)) return false;
        ConverterAgentInternalOsInfo other = (ConverterAgentInternalOsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              this.family.equals(other.getFamily()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.guestOsId==null && other.getGuestOsId()==null) || 
             (this.guestOsId!=null &&
              this.guestOsId.equals(other.getGuestOsId()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            this.majorVersion == other.getMajorVersion() &&
            this.minorVersion == other.getMinorVersion();
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
        if (getFamily() != null) {
            _hashCode += getFamily().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getGuestOsId() != null) {
            _hashCode += getGuestOsId().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        _hashCode += getMajorVersion();
        _hashCode += getMinorVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalOsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalOsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalOsInfoOsFamily"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestOsId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "guestOsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "minorVersion"));
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
