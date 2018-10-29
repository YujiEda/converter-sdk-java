/**
 * ConverterReconfigPrerequisitesFileToUpdateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterReconfigPrerequisitesFileToUpdateInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String pathName;

    private java.lang.String version;

    private java.lang.Integer hotfixIndex;

    public ConverterReconfigPrerequisitesFileToUpdateInfo() {
    }

    public ConverterReconfigPrerequisitesFileToUpdateInfo(
           java.lang.String pathName,
           java.lang.String version,
           java.lang.Integer hotfixIndex) {
        this.pathName = pathName;
        this.version = version;
        this.hotfixIndex = hotfixIndex;
    }


    /**
     * Gets the pathName value for this ConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @return pathName
     */
    public java.lang.String getPathName() {
        return pathName;
    }


    /**
     * Sets the pathName value for this ConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @param pathName
     */
    public void setPathName(java.lang.String pathName) {
        this.pathName = pathName;
    }


    /**
     * Gets the version value for this ConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the hotfixIndex value for this ConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @return hotfixIndex
     */
    public java.lang.Integer getHotfixIndex() {
        return hotfixIndex;
    }


    /**
     * Sets the hotfixIndex value for this ConverterReconfigPrerequisitesFileToUpdateInfo.
     * 
     * @param hotfixIndex
     */
    public void setHotfixIndex(java.lang.Integer hotfixIndex) {
        this.hotfixIndex = hotfixIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterReconfigPrerequisitesFileToUpdateInfo)) return false;
        ConverterReconfigPrerequisitesFileToUpdateInfo other = (ConverterReconfigPrerequisitesFileToUpdateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pathName==null && other.getPathName()==null) || 
             (this.pathName!=null &&
              this.pathName.equals(other.getPathName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.hotfixIndex==null && other.getHotfixIndex()==null) || 
             (this.hotfixIndex!=null &&
              this.hotfixIndex.equals(other.getHotfixIndex())));
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
        if (getPathName() != null) {
            _hashCode += getPathName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getHotfixIndex() != null) {
            _hashCode += getHotfixIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterReconfigPrerequisitesFileToUpdateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesFileToUpdateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "pathName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotfixIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hotfixIndex"));
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
