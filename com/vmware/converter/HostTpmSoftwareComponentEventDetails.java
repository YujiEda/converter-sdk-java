/**
 * HostTpmSoftwareComponentEventDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostTpmSoftwareComponentEventDetails  extends com.vmware.converter.HostTpmEventDetails  implements java.io.Serializable {
    private java.lang.String componentName;

    private java.lang.String vibName;

    private java.lang.String vibVersion;

    private java.lang.String vibVendor;

    public HostTpmSoftwareComponentEventDetails() {
    }

    public HostTpmSoftwareComponentEventDetails(
           byte[] dataHash,
           java.lang.String componentName,
           java.lang.String vibName,
           java.lang.String vibVersion,
           java.lang.String vibVendor) {
        super(
            dataHash);
        this.componentName = componentName;
        this.vibName = vibName;
        this.vibVersion = vibVersion;
        this.vibVendor = vibVendor;
    }


    /**
     * Gets the componentName value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @return componentName
     */
    public java.lang.String getComponentName() {
        return componentName;
    }


    /**
     * Sets the componentName value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @param componentName
     */
    public void setComponentName(java.lang.String componentName) {
        this.componentName = componentName;
    }


    /**
     * Gets the vibName value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @return vibName
     */
    public java.lang.String getVibName() {
        return vibName;
    }


    /**
     * Sets the vibName value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @param vibName
     */
    public void setVibName(java.lang.String vibName) {
        this.vibName = vibName;
    }


    /**
     * Gets the vibVersion value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @return vibVersion
     */
    public java.lang.String getVibVersion() {
        return vibVersion;
    }


    /**
     * Sets the vibVersion value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @param vibVersion
     */
    public void setVibVersion(java.lang.String vibVersion) {
        this.vibVersion = vibVersion;
    }


    /**
     * Gets the vibVendor value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @return vibVendor
     */
    public java.lang.String getVibVendor() {
        return vibVendor;
    }


    /**
     * Sets the vibVendor value for this HostTpmSoftwareComponentEventDetails.
     * 
     * @param vibVendor
     */
    public void setVibVendor(java.lang.String vibVendor) {
        this.vibVendor = vibVendor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostTpmSoftwareComponentEventDetails)) return false;
        HostTpmSoftwareComponentEventDetails other = (HostTpmSoftwareComponentEventDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.componentName==null && other.getComponentName()==null) || 
             (this.componentName!=null &&
              this.componentName.equals(other.getComponentName()))) &&
            ((this.vibName==null && other.getVibName()==null) || 
             (this.vibName!=null &&
              this.vibName.equals(other.getVibName()))) &&
            ((this.vibVersion==null && other.getVibVersion()==null) || 
             (this.vibVersion!=null &&
              this.vibVersion.equals(other.getVibVersion()))) &&
            ((this.vibVendor==null && other.getVibVendor()==null) || 
             (this.vibVendor!=null &&
              this.vibVendor.equals(other.getVibVendor())));
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
        if (getComponentName() != null) {
            _hashCode += getComponentName().hashCode();
        }
        if (getVibName() != null) {
            _hashCode += getVibName().hashCode();
        }
        if (getVibVersion() != null) {
            _hashCode += getVibVersion().hashCode();
        }
        if (getVibVendor() != null) {
            _hashCode += getVibVendor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostTpmSoftwareComponentEventDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmSoftwareComponentEventDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "componentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vibName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vibName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vibVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vibVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vibVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vibVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
