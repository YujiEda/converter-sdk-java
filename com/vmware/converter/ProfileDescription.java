/**
 * ProfileDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfileDescription  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ProfileDescriptionSection[] section;

    public ProfileDescription() {
    }

    public ProfileDescription(
           com.vmware.converter.ProfileDescriptionSection[] section) {
        this.section = section;
    }


    /**
     * Gets the section value for this ProfileDescription.
     * 
     * @return section
     */
    public com.vmware.converter.ProfileDescriptionSection[] getSection() {
        return section;
    }


    /**
     * Sets the section value for this ProfileDescription.
     * 
     * @param section
     */
    public void setSection(com.vmware.converter.ProfileDescriptionSection[] section) {
        this.section = section;
    }

    public com.vmware.converter.ProfileDescriptionSection getSection(int i) {
        return this.section[i];
    }

    public void setSection(int i, com.vmware.converter.ProfileDescriptionSection _value) {
        this.section[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileDescription)) return false;
        ProfileDescription other = (ProfileDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              java.util.Arrays.equals(this.section, other.getSection())));
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
        if (getSection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSection(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "section"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileDescriptionSection"));
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
