/**
 * ConverterSSLVerificationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterSSLVerificationFault  extends com.vmware.converter.ConverterConverterFault  implements java.io.Serializable {
    private boolean selfSigned;

    private java.lang.String thumbprint;

    private java.lang.String msg;

    private java.lang.Long errorFlags;

    private com.vmware.converter.ConverterSSLCertificateData[] certificateChain;

    public ConverterSSLVerificationFault() {
    }

    public ConverterSSLVerificationFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           boolean selfSigned,
           java.lang.String thumbprint,
           java.lang.String msg,
           java.lang.Long errorFlags,
           com.vmware.converter.ConverterSSLCertificateData[] certificateChain) {
        super(
            faultCause,
            faultMessage);
        this.selfSigned = selfSigned;
        this.thumbprint = thumbprint;
        this.msg = msg;
        this.errorFlags = errorFlags;
        this.certificateChain = certificateChain;
    }


    /**
     * Gets the selfSigned value for this ConverterSSLVerificationFault.
     * 
     * @return selfSigned
     */
    public boolean isSelfSigned() {
        return selfSigned;
    }


    /**
     * Sets the selfSigned value for this ConverterSSLVerificationFault.
     * 
     * @param selfSigned
     */
    public void setSelfSigned(boolean selfSigned) {
        this.selfSigned = selfSigned;
    }


    /**
     * Gets the thumbprint value for this ConverterSSLVerificationFault.
     * 
     * @return thumbprint
     */
    public java.lang.String getThumbprint() {
        return thumbprint;
    }


    /**
     * Sets the thumbprint value for this ConverterSSLVerificationFault.
     * 
     * @param thumbprint
     */
    public void setThumbprint(java.lang.String thumbprint) {
        this.thumbprint = thumbprint;
    }


    /**
     * Gets the msg value for this ConverterSSLVerificationFault.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this ConverterSSLVerificationFault.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }


    /**
     * Gets the errorFlags value for this ConverterSSLVerificationFault.
     * 
     * @return errorFlags
     */
    public java.lang.Long getErrorFlags() {
        return errorFlags;
    }


    /**
     * Sets the errorFlags value for this ConverterSSLVerificationFault.
     * 
     * @param errorFlags
     */
    public void setErrorFlags(java.lang.Long errorFlags) {
        this.errorFlags = errorFlags;
    }


    /**
     * Gets the certificateChain value for this ConverterSSLVerificationFault.
     * 
     * @return certificateChain
     */
    public com.vmware.converter.ConverterSSLCertificateData[] getCertificateChain() {
        return certificateChain;
    }


    /**
     * Sets the certificateChain value for this ConverterSSLVerificationFault.
     * 
     * @param certificateChain
     */
    public void setCertificateChain(com.vmware.converter.ConverterSSLCertificateData[] certificateChain) {
        this.certificateChain = certificateChain;
    }

    public com.vmware.converter.ConverterSSLCertificateData getCertificateChain(int i) {
        return this.certificateChain[i];
    }

    public void setCertificateChain(int i, com.vmware.converter.ConverterSSLCertificateData _value) {
        this.certificateChain[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterSSLVerificationFault)) return false;
        ConverterSSLVerificationFault other = (ConverterSSLVerificationFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.selfSigned == other.isSelfSigned() &&
            ((this.thumbprint==null && other.getThumbprint()==null) || 
             (this.thumbprint!=null &&
              this.thumbprint.equals(other.getThumbprint()))) &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg()))) &&
            ((this.errorFlags==null && other.getErrorFlags()==null) || 
             (this.errorFlags!=null &&
              this.errorFlags.equals(other.getErrorFlags()))) &&
            ((this.certificateChain==null && other.getCertificateChain()==null) || 
             (this.certificateChain!=null &&
              java.util.Arrays.equals(this.certificateChain, other.getCertificateChain())));
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
        _hashCode += (isSelfSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getThumbprint() != null) {
            _hashCode += getThumbprint().hashCode();
        }
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        if (getErrorFlags() != null) {
            _hashCode += getErrorFlags().hashCode();
        }
        if (getCertificateChain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificateChain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificateChain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterSSLVerificationFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSSLVerificationFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "selfSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "thumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "errorFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateChain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "certificateChain"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSSLCertificateData"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
