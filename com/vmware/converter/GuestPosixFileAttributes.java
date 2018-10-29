/**
 * GuestPosixFileAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestPosixFileAttributes  extends com.vmware.converter.GuestFileAttributes  implements java.io.Serializable {
    private java.lang.Integer ownerId;

    private java.lang.Integer groupId;

    private java.lang.Long permissions;

    public GuestPosixFileAttributes() {
    }

    public GuestPosixFileAttributes(
           java.util.Calendar modificationTime,
           java.util.Calendar accessTime,
           java.lang.String symlinkTarget,
           java.lang.Integer ownerId,
           java.lang.Integer groupId,
           java.lang.Long permissions) {
        super(
            modificationTime,
            accessTime,
            symlinkTarget);
        this.ownerId = ownerId;
        this.groupId = groupId;
        this.permissions = permissions;
    }


    /**
     * Gets the ownerId value for this GuestPosixFileAttributes.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this GuestPosixFileAttributes.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the groupId value for this GuestPosixFileAttributes.
     * 
     * @return groupId
     */
    public java.lang.Integer getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this GuestPosixFileAttributes.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the permissions value for this GuestPosixFileAttributes.
     * 
     * @return permissions
     */
    public java.lang.Long getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this GuestPosixFileAttributes.
     * 
     * @param permissions
     */
    public void setPermissions(java.lang.Long permissions) {
        this.permissions = permissions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestPosixFileAttributes)) return false;
        GuestPosixFileAttributes other = (GuestPosixFileAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions())));
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
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestPosixFileAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestPosixFileAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
