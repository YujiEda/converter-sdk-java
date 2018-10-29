/**
 * ConverterComputerOsInfoOsVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfoOsVersion  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String guestOsId;

    private java.lang.String displayName;

    private java.lang.String osType;

    private java.lang.String osEdition;

    private java.lang.String distribution;

    private java.lang.Integer majorVersion;

    private java.lang.Integer minorVersion;

    private java.lang.String kernelVersion;

    private java.lang.Boolean os64Bit;

    private java.lang.String spLevel;

    public ConverterComputerOsInfoOsVersion() {
    }

    public ConverterComputerOsInfoOsVersion(
           java.lang.String guestOsId,
           java.lang.String displayName,
           java.lang.String osType,
           java.lang.String osEdition,
           java.lang.String distribution,
           java.lang.Integer majorVersion,
           java.lang.Integer minorVersion,
           java.lang.String kernelVersion,
           java.lang.Boolean os64Bit,
           java.lang.String spLevel) {
        this.guestOsId = guestOsId;
        this.displayName = displayName;
        this.osType = osType;
        this.osEdition = osEdition;
        this.distribution = distribution;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.kernelVersion = kernelVersion;
        this.os64Bit = os64Bit;
        this.spLevel = spLevel;
    }


    /**
     * Gets the guestOsId value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return guestOsId
     */
    public java.lang.String getGuestOsId() {
        return guestOsId;
    }


    /**
     * Sets the guestOsId value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param guestOsId
     */
    public void setGuestOsId(java.lang.String guestOsId) {
        this.guestOsId = guestOsId;
    }


    /**
     * Gets the displayName value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the osType value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return osType
     */
    public java.lang.String getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param osType
     */
    public void setOsType(java.lang.String osType) {
        this.osType = osType;
    }


    /**
     * Gets the osEdition value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return osEdition
     */
    public java.lang.String getOsEdition() {
        return osEdition;
    }


    /**
     * Sets the osEdition value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param osEdition
     */
    public void setOsEdition(java.lang.String osEdition) {
        this.osEdition = osEdition;
    }


    /**
     * Gets the distribution value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return distribution
     */
    public java.lang.String getDistribution() {
        return distribution;
    }


    /**
     * Sets the distribution value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param distribution
     */
    public void setDistribution(java.lang.String distribution) {
        this.distribution = distribution;
    }


    /**
     * Gets the majorVersion value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return majorVersion
     */
    public java.lang.Integer getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(java.lang.Integer majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return minorVersion
     */
    public java.lang.Integer getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param minorVersion
     */
    public void setMinorVersion(java.lang.Integer minorVersion) {
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the kernelVersion value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return kernelVersion
     */
    public java.lang.String getKernelVersion() {
        return kernelVersion;
    }


    /**
     * Sets the kernelVersion value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param kernelVersion
     */
    public void setKernelVersion(java.lang.String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }


    /**
     * Gets the os64Bit value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return os64Bit
     */
    public java.lang.Boolean getOs64Bit() {
        return os64Bit;
    }


    /**
     * Sets the os64Bit value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param os64Bit
     */
    public void setOs64Bit(java.lang.Boolean os64Bit) {
        this.os64Bit = os64Bit;
    }


    /**
     * Gets the spLevel value for this ConverterComputerOsInfoOsVersion.
     * 
     * @return spLevel
     */
    public java.lang.String getSpLevel() {
        return spLevel;
    }


    /**
     * Sets the spLevel value for this ConverterComputerOsInfoOsVersion.
     * 
     * @param spLevel
     */
    public void setSpLevel(java.lang.String spLevel) {
        this.spLevel = spLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerOsInfoOsVersion)) return false;
        ConverterComputerOsInfoOsVersion other = (ConverterComputerOsInfoOsVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.guestOsId==null && other.getGuestOsId()==null) || 
             (this.guestOsId!=null &&
              this.guestOsId.equals(other.getGuestOsId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.osEdition==null && other.getOsEdition()==null) || 
             (this.osEdition!=null &&
              this.osEdition.equals(other.getOsEdition()))) &&
            ((this.distribution==null && other.getDistribution()==null) || 
             (this.distribution!=null &&
              this.distribution.equals(other.getDistribution()))) &&
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion()))) &&
            ((this.kernelVersion==null && other.getKernelVersion()==null) || 
             (this.kernelVersion!=null &&
              this.kernelVersion.equals(other.getKernelVersion()))) &&
            ((this.os64Bit==null && other.getOs64Bit()==null) || 
             (this.os64Bit!=null &&
              this.os64Bit.equals(other.getOs64Bit()))) &&
            ((this.spLevel==null && other.getSpLevel()==null) || 
             (this.spLevel!=null &&
              this.spLevel.equals(other.getSpLevel())));
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
        if (getGuestOsId() != null) {
            _hashCode += getGuestOsId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getOsEdition() != null) {
            _hashCode += getOsEdition().hashCode();
        }
        if (getDistribution() != null) {
            _hashCode += getDistribution().hashCode();
        }
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        if (getKernelVersion() != null) {
            _hashCode += getKernelVersion().hashCode();
        }
        if (getOs64Bit() != null) {
            _hashCode += getOs64Bit().hashCode();
        }
        if (getSpLevel() != null) {
            _hashCode += getSpLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfoOsVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoOsVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestOsId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "guestOsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osEdition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osEdition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "distribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "minorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernelVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "kernelVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("os64Bit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "os64Bit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spLevel"));
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
