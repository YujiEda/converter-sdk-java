/**
 * HostCertificateManagerCertificateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostCertificateManagerCertificateInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String issuer;

    private java.util.Calendar notBefore;

    private java.util.Calendar notAfter;

    private java.lang.String subject;

    private java.lang.String status;

    public HostCertificateManagerCertificateInfo() {
    }

    public HostCertificateManagerCertificateInfo(
           java.lang.String issuer,
           java.util.Calendar notBefore,
           java.util.Calendar notAfter,
           java.lang.String subject,
           java.lang.String status) {
        this.issuer = issuer;
        this.notBefore = notBefore;
        this.notAfter = notAfter;
        this.subject = subject;
        this.status = status;
    }


    /**
     * Gets the issuer value for this HostCertificateManagerCertificateInfo.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this HostCertificateManagerCertificateInfo.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the notBefore value for this HostCertificateManagerCertificateInfo.
     * 
     * @return notBefore
     */
    public java.util.Calendar getNotBefore() {
        return notBefore;
    }


    /**
     * Sets the notBefore value for this HostCertificateManagerCertificateInfo.
     * 
     * @param notBefore
     */
    public void setNotBefore(java.util.Calendar notBefore) {
        this.notBefore = notBefore;
    }


    /**
     * Gets the notAfter value for this HostCertificateManagerCertificateInfo.
     * 
     * @return notAfter
     */
    public java.util.Calendar getNotAfter() {
        return notAfter;
    }


    /**
     * Sets the notAfter value for this HostCertificateManagerCertificateInfo.
     * 
     * @param notAfter
     */
    public void setNotAfter(java.util.Calendar notAfter) {
        this.notAfter = notAfter;
    }


    /**
     * Gets the subject value for this HostCertificateManagerCertificateInfo.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this HostCertificateManagerCertificateInfo.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the status value for this HostCertificateManagerCertificateInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HostCertificateManagerCertificateInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostCertificateManagerCertificateInfo)) return false;
        HostCertificateManagerCertificateInfo other = (HostCertificateManagerCertificateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.notBefore==null && other.getNotBefore()==null) || 
             (this.notBefore!=null &&
              this.notBefore.equals(other.getNotBefore()))) &&
            ((this.notAfter==null && other.getNotAfter()==null) || 
             (this.notAfter!=null &&
              this.notAfter.equals(other.getNotAfter()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getNotBefore() != null) {
            _hashCode += getNotBefore().hashCode();
        }
        if (getNotAfter() != null) {
            _hashCode += getNotAfter().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCertificateManagerCertificateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCertificateManagerCertificateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "notBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "notAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
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
