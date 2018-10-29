/**
 * GuestFileAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestFileAttributes  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.util.Calendar modificationTime;

    private java.util.Calendar accessTime;

    private java.lang.String symlinkTarget;

    public GuestFileAttributes() {
    }

    public GuestFileAttributes(
           java.util.Calendar modificationTime,
           java.util.Calendar accessTime,
           java.lang.String symlinkTarget) {
        this.modificationTime = modificationTime;
        this.accessTime = accessTime;
        this.symlinkTarget = symlinkTarget;
    }


    /**
     * Gets the modificationTime value for this GuestFileAttributes.
     * 
     * @return modificationTime
     */
    public java.util.Calendar getModificationTime() {
        return modificationTime;
    }


    /**
     * Sets the modificationTime value for this GuestFileAttributes.
     * 
     * @param modificationTime
     */
    public void setModificationTime(java.util.Calendar modificationTime) {
        this.modificationTime = modificationTime;
    }


    /**
     * Gets the accessTime value for this GuestFileAttributes.
     * 
     * @return accessTime
     */
    public java.util.Calendar getAccessTime() {
        return accessTime;
    }


    /**
     * Sets the accessTime value for this GuestFileAttributes.
     * 
     * @param accessTime
     */
    public void setAccessTime(java.util.Calendar accessTime) {
        this.accessTime = accessTime;
    }


    /**
     * Gets the symlinkTarget value for this GuestFileAttributes.
     * 
     * @return symlinkTarget
     */
    public java.lang.String getSymlinkTarget() {
        return symlinkTarget;
    }


    /**
     * Sets the symlinkTarget value for this GuestFileAttributes.
     * 
     * @param symlinkTarget
     */
    public void setSymlinkTarget(java.lang.String symlinkTarget) {
        this.symlinkTarget = symlinkTarget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestFileAttributes)) return false;
        GuestFileAttributes other = (GuestFileAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modificationTime==null && other.getModificationTime()==null) || 
             (this.modificationTime!=null &&
              this.modificationTime.equals(other.getModificationTime()))) &&
            ((this.accessTime==null && other.getAccessTime()==null) || 
             (this.accessTime!=null &&
              this.accessTime.equals(other.getAccessTime()))) &&
            ((this.symlinkTarget==null && other.getSymlinkTarget()==null) || 
             (this.symlinkTarget!=null &&
              this.symlinkTarget.equals(other.getSymlinkTarget())));
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
        if (getModificationTime() != null) {
            _hashCode += getModificationTime().hashCode();
        }
        if (getAccessTime() != null) {
            _hashCode += getAccessTime().hashCode();
        }
        if (getSymlinkTarget() != null) {
            _hashCode += getSymlinkTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestFileAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestFileAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "modificationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symlinkTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "symlinkTarget"));
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
