/**
 * VMwareDVSVspanCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSVspanCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean mixedDestSupported;

    private boolean dvportSupported;

    private boolean remoteSourceSupported;

    private boolean remoteDestSupported;

    private boolean encapRemoteSourceSupported;

    public VMwareDVSVspanCapability() {
    }

    public VMwareDVSVspanCapability(
           boolean mixedDestSupported,
           boolean dvportSupported,
           boolean remoteSourceSupported,
           boolean remoteDestSupported,
           boolean encapRemoteSourceSupported) {
        this.mixedDestSupported = mixedDestSupported;
        this.dvportSupported = dvportSupported;
        this.remoteSourceSupported = remoteSourceSupported;
        this.remoteDestSupported = remoteDestSupported;
        this.encapRemoteSourceSupported = encapRemoteSourceSupported;
    }


    /**
     * Gets the mixedDestSupported value for this VMwareDVSVspanCapability.
     * 
     * @return mixedDestSupported
     */
    public boolean isMixedDestSupported() {
        return mixedDestSupported;
    }


    /**
     * Sets the mixedDestSupported value for this VMwareDVSVspanCapability.
     * 
     * @param mixedDestSupported
     */
    public void setMixedDestSupported(boolean mixedDestSupported) {
        this.mixedDestSupported = mixedDestSupported;
    }


    /**
     * Gets the dvportSupported value for this VMwareDVSVspanCapability.
     * 
     * @return dvportSupported
     */
    public boolean isDvportSupported() {
        return dvportSupported;
    }


    /**
     * Sets the dvportSupported value for this VMwareDVSVspanCapability.
     * 
     * @param dvportSupported
     */
    public void setDvportSupported(boolean dvportSupported) {
        this.dvportSupported = dvportSupported;
    }


    /**
     * Gets the remoteSourceSupported value for this VMwareDVSVspanCapability.
     * 
     * @return remoteSourceSupported
     */
    public boolean isRemoteSourceSupported() {
        return remoteSourceSupported;
    }


    /**
     * Sets the remoteSourceSupported value for this VMwareDVSVspanCapability.
     * 
     * @param remoteSourceSupported
     */
    public void setRemoteSourceSupported(boolean remoteSourceSupported) {
        this.remoteSourceSupported = remoteSourceSupported;
    }


    /**
     * Gets the remoteDestSupported value for this VMwareDVSVspanCapability.
     * 
     * @return remoteDestSupported
     */
    public boolean isRemoteDestSupported() {
        return remoteDestSupported;
    }


    /**
     * Sets the remoteDestSupported value for this VMwareDVSVspanCapability.
     * 
     * @param remoteDestSupported
     */
    public void setRemoteDestSupported(boolean remoteDestSupported) {
        this.remoteDestSupported = remoteDestSupported;
    }


    /**
     * Gets the encapRemoteSourceSupported value for this VMwareDVSVspanCapability.
     * 
     * @return encapRemoteSourceSupported
     */
    public boolean isEncapRemoteSourceSupported() {
        return encapRemoteSourceSupported;
    }


    /**
     * Sets the encapRemoteSourceSupported value for this VMwareDVSVspanCapability.
     * 
     * @param encapRemoteSourceSupported
     */
    public void setEncapRemoteSourceSupported(boolean encapRemoteSourceSupported) {
        this.encapRemoteSourceSupported = encapRemoteSourceSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSVspanCapability)) return false;
        VMwareDVSVspanCapability other = (VMwareDVSVspanCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.mixedDestSupported == other.isMixedDestSupported() &&
            this.dvportSupported == other.isDvportSupported() &&
            this.remoteSourceSupported == other.isRemoteSourceSupported() &&
            this.remoteDestSupported == other.isRemoteDestSupported() &&
            this.encapRemoteSourceSupported == other.isEncapRemoteSourceSupported();
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
        _hashCode += (isMixedDestSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDvportSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRemoteSourceSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRemoteDestSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEncapRemoteSourceSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDVSVspanCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVspanCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mixedDestSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mixedDestSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvportSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvportSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSourceSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "remoteSourceSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteDestSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "remoteDestSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encapRemoteSourceSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "encapRemoteSourceSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
