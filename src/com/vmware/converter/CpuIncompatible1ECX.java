/**
 * CpuIncompatible1ECX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class CpuIncompatible1ECX  extends com.vmware.converter.CpuIncompatible  implements java.io.Serializable {
    private boolean sse3;

    private java.lang.Boolean pclmulqdq;

    private boolean ssse3;

    private boolean sse41;

    private boolean sse42;

    private java.lang.Boolean aes;

    private boolean other;

    private boolean otherOnly;

    public CpuIncompatible1ECX() {
    }

    public CpuIncompatible1ECX(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           int level,
           java.lang.String registerName,
           java.lang.String registerBits,
           java.lang.String desiredBits,
           com.vmware.converter.ManagedObjectReference host,
           boolean sse3,
           java.lang.Boolean pclmulqdq,
           boolean ssse3,
           boolean sse41,
           boolean sse42,
           java.lang.Boolean aes,
           boolean other,
           boolean otherOnly) {
        super(
            faultCause,
            faultMessage,
            level,
            registerName,
            registerBits,
            desiredBits,
            host);
        this.sse3 = sse3;
        this.pclmulqdq = pclmulqdq;
        this.ssse3 = ssse3;
        this.sse41 = sse41;
        this.sse42 = sse42;
        this.aes = aes;
        this.other = other;
        this.otherOnly = otherOnly;
    }


    /**
     * Gets the sse3 value for this CpuIncompatible1ECX.
     * 
     * @return sse3
     */
    public boolean isSse3() {
        return sse3;
    }


    /**
     * Sets the sse3 value for this CpuIncompatible1ECX.
     * 
     * @param sse3
     */
    public void setSse3(boolean sse3) {
        this.sse3 = sse3;
    }


    /**
     * Gets the pclmulqdq value for this CpuIncompatible1ECX.
     * 
     * @return pclmulqdq
     */
    public java.lang.Boolean getPclmulqdq() {
        return pclmulqdq;
    }


    /**
     * Sets the pclmulqdq value for this CpuIncompatible1ECX.
     * 
     * @param pclmulqdq
     */
    public void setPclmulqdq(java.lang.Boolean pclmulqdq) {
        this.pclmulqdq = pclmulqdq;
    }


    /**
     * Gets the ssse3 value for this CpuIncompatible1ECX.
     * 
     * @return ssse3
     */
    public boolean isSsse3() {
        return ssse3;
    }


    /**
     * Sets the ssse3 value for this CpuIncompatible1ECX.
     * 
     * @param ssse3
     */
    public void setSsse3(boolean ssse3) {
        this.ssse3 = ssse3;
    }


    /**
     * Gets the sse41 value for this CpuIncompatible1ECX.
     * 
     * @return sse41
     */
    public boolean isSse41() {
        return sse41;
    }


    /**
     * Sets the sse41 value for this CpuIncompatible1ECX.
     * 
     * @param sse41
     */
    public void setSse41(boolean sse41) {
        this.sse41 = sse41;
    }


    /**
     * Gets the sse42 value for this CpuIncompatible1ECX.
     * 
     * @return sse42
     */
    public boolean isSse42() {
        return sse42;
    }


    /**
     * Sets the sse42 value for this CpuIncompatible1ECX.
     * 
     * @param sse42
     */
    public void setSse42(boolean sse42) {
        this.sse42 = sse42;
    }


    /**
     * Gets the aes value for this CpuIncompatible1ECX.
     * 
     * @return aes
     */
    public java.lang.Boolean getAes() {
        return aes;
    }


    /**
     * Sets the aes value for this CpuIncompatible1ECX.
     * 
     * @param aes
     */
    public void setAes(java.lang.Boolean aes) {
        this.aes = aes;
    }


    /**
     * Gets the other value for this CpuIncompatible1ECX.
     * 
     * @return other
     */
    public boolean isOther() {
        return other;
    }


    /**
     * Sets the other value for this CpuIncompatible1ECX.
     * 
     * @param other
     */
    public void setOther(boolean other) {
        this.other = other;
    }


    /**
     * Gets the otherOnly value for this CpuIncompatible1ECX.
     * 
     * @return otherOnly
     */
    public boolean isOtherOnly() {
        return otherOnly;
    }


    /**
     * Sets the otherOnly value for this CpuIncompatible1ECX.
     * 
     * @param otherOnly
     */
    public void setOtherOnly(boolean otherOnly) {
        this.otherOnly = otherOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpuIncompatible1ECX)) return false;
        CpuIncompatible1ECX other = (CpuIncompatible1ECX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sse3 == other.isSse3() &&
            ((this.pclmulqdq==null && other.getPclmulqdq()==null) || 
             (this.pclmulqdq!=null &&
              this.pclmulqdq.equals(other.getPclmulqdq()))) &&
            this.ssse3 == other.isSsse3() &&
            this.sse41 == other.isSse41() &&
            this.sse42 == other.isSse42() &&
            ((this.aes==null && other.getAes()==null) || 
             (this.aes!=null &&
              this.aes.equals(other.getAes()))) &&
            this.other == other.isOther() &&
            this.otherOnly == other.isOtherOnly();
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
        _hashCode += (isSse3() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPclmulqdq() != null) {
            _hashCode += getPclmulqdq().hashCode();
        }
        _hashCode += (isSsse3() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSse41() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSse42() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAes() != null) {
            _hashCode += getAes().hashCode();
        }
        _hashCode += (isOther() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOtherOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpuIncompatible1ECX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CpuIncompatible1ECX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sse3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sse3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pclmulqdq");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pclmulqdq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssse3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ssse3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sse41");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sse41"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sse42");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sse42"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "aes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "other"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "otherOnly"));
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
