/**
 * GuestAuthAliasInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestAuthAliasInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.GuestAuthSubject subject;

    private java.lang.String comment;

    public GuestAuthAliasInfo() {
    }

    public GuestAuthAliasInfo(
           com.vmware.converter.GuestAuthSubject subject,
           java.lang.String comment) {
        this.subject = subject;
        this.comment = comment;
    }


    /**
     * Gets the subject value for this GuestAuthAliasInfo.
     * 
     * @return subject
     */
    public com.vmware.converter.GuestAuthSubject getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this GuestAuthAliasInfo.
     * 
     * @param subject
     */
    public void setSubject(com.vmware.converter.GuestAuthSubject subject) {
        this.subject = subject;
    }


    /**
     * Gets the comment value for this GuestAuthAliasInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this GuestAuthAliasInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestAuthAliasInfo)) return false;
        GuestAuthAliasInfo other = (GuestAuthAliasInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestAuthAliasInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAuthAliasInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestAuthSubject"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "comment"));
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
