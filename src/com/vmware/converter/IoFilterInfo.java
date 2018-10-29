/**
 * IoFilterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IoFilterInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String vendor;

    private java.lang.String version;

    private java.lang.String summary;

    private java.lang.String releaseDate;

    public IoFilterInfo() {
    }

    public IoFilterInfo(
           java.lang.String id,
           java.lang.String name,
           java.lang.String vendor,
           java.lang.String version,
           java.lang.String summary,
           java.lang.String releaseDate) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.version = version;
        this.summary = summary;
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the id value for this IoFilterInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this IoFilterInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this IoFilterInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this IoFilterInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vendor value for this IoFilterInfo.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this IoFilterInfo.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the version value for this IoFilterInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this IoFilterInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the summary value for this IoFilterInfo.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this IoFilterInfo.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the releaseDate value for this IoFilterInfo.
     * 
     * @return releaseDate
     */
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this IoFilterInfo.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IoFilterInfo)) return false;
        IoFilterInfo other = (IoFilterInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IoFilterInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IoFilterInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "releaseDate"));
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
