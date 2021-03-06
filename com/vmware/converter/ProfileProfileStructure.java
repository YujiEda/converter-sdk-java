/**
 * ProfileProfileStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfileProfileStructure  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String profileTypeName;

    private com.vmware.converter.ProfileProfileStructureProperty[] child;

    public ProfileProfileStructure() {
    }

    public ProfileProfileStructure(
           java.lang.String profileTypeName,
           com.vmware.converter.ProfileProfileStructureProperty[] child) {
        this.profileTypeName = profileTypeName;
        this.child = child;
    }


    /**
     * Gets the profileTypeName value for this ProfileProfileStructure.
     * 
     * @return profileTypeName
     */
    public java.lang.String getProfileTypeName() {
        return profileTypeName;
    }


    /**
     * Sets the profileTypeName value for this ProfileProfileStructure.
     * 
     * @param profileTypeName
     */
    public void setProfileTypeName(java.lang.String profileTypeName) {
        this.profileTypeName = profileTypeName;
    }


    /**
     * Gets the child value for this ProfileProfileStructure.
     * 
     * @return child
     */
    public com.vmware.converter.ProfileProfileStructureProperty[] getChild() {
        return child;
    }


    /**
     * Sets the child value for this ProfileProfileStructure.
     * 
     * @param child
     */
    public void setChild(com.vmware.converter.ProfileProfileStructureProperty[] child) {
        this.child = child;
    }

    public com.vmware.converter.ProfileProfileStructureProperty getChild(int i) {
        return this.child[i];
    }

    public void setChild(int i, com.vmware.converter.ProfileProfileStructureProperty _value) {
        this.child[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileProfileStructure)) return false;
        ProfileProfileStructure other = (ProfileProfileStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.profileTypeName==null && other.getProfileTypeName()==null) || 
             (this.profileTypeName!=null &&
              this.profileTypeName.equals(other.getProfileTypeName()))) &&
            ((this.child==null && other.getChild()==null) || 
             (this.child!=null &&
              java.util.Arrays.equals(this.child, other.getChild())));
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
        if (getProfileTypeName() != null) {
            _hashCode += getProfileTypeName().hashCode();
        }
        if (getChild() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChild());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChild(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileProfileStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileProfileStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "child"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileProfileStructureProperty"));
        elemField.setMinOccurs(0);
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

}
