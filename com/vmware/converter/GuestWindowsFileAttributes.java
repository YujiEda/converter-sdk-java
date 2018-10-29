/**
 * GuestWindowsFileAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestWindowsFileAttributes  extends com.vmware.converter.GuestFileAttributes  implements java.io.Serializable {
    private java.lang.Boolean hidden;

    private java.lang.Boolean readOnly;

    private java.util.Calendar createTime;

    public GuestWindowsFileAttributes() {
    }

    public GuestWindowsFileAttributes(
           java.util.Calendar modificationTime,
           java.util.Calendar accessTime,
           java.lang.String symlinkTarget,
           java.lang.Boolean hidden,
           java.lang.Boolean readOnly,
           java.util.Calendar createTime) {
        super(
            modificationTime,
            accessTime,
            symlinkTarget);
        this.hidden = hidden;
        this.readOnly = readOnly;
        this.createTime = createTime;
    }


    /**
     * Gets the hidden value for this GuestWindowsFileAttributes.
     * 
     * @return hidden
     */
    public java.lang.Boolean getHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this GuestWindowsFileAttributes.
     * 
     * @param hidden
     */
    public void setHidden(java.lang.Boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the readOnly value for this GuestWindowsFileAttributes.
     * 
     * @return readOnly
     */
    public java.lang.Boolean getReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this GuestWindowsFileAttributes.
     * 
     * @param readOnly
     */
    public void setReadOnly(java.lang.Boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Gets the createTime value for this GuestWindowsFileAttributes.
     * 
     * @return createTime
     */
    public java.util.Calendar getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this GuestWindowsFileAttributes.
     * 
     * @param createTime
     */
    public void setCreateTime(java.util.Calendar createTime) {
        this.createTime = createTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestWindowsFileAttributes)) return false;
        GuestWindowsFileAttributes other = (GuestWindowsFileAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hidden==null && other.getHidden()==null) || 
             (this.hidden!=null &&
              this.hidden.equals(other.getHidden()))) &&
            ((this.readOnly==null && other.getReadOnly()==null) || 
             (this.readOnly!=null &&
              this.readOnly.equals(other.getReadOnly()))) &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime())));
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
        if (getHidden() != null) {
            _hashCode += getHidden().hashCode();
        }
        if (getReadOnly() != null) {
            _hashCode += getReadOnly().hashCode();
        }
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestWindowsFileAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestWindowsFileAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "readOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "createTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
