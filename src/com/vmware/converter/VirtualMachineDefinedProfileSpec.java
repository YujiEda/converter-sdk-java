/**
 * VirtualMachineDefinedProfileSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineDefinedProfileSpec  extends com.vmware.converter.VirtualMachineProfileSpec  implements java.io.Serializable {
    private java.lang.String profileId;

    private com.vmware.converter.VirtualMachineProfileRawData profileData;

    public VirtualMachineDefinedProfileSpec() {
    }

    public VirtualMachineDefinedProfileSpec(
           java.lang.String profileId,
           com.vmware.converter.VirtualMachineProfileRawData profileData) {
        this.profileId = profileId;
        this.profileData = profileData;
    }


    /**
     * Gets the profileId value for this VirtualMachineDefinedProfileSpec.
     * 
     * @return profileId
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this VirtualMachineDefinedProfileSpec.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the profileData value for this VirtualMachineDefinedProfileSpec.
     * 
     * @return profileData
     */
    public com.vmware.converter.VirtualMachineProfileRawData getProfileData() {
        return profileData;
    }


    /**
     * Sets the profileData value for this VirtualMachineDefinedProfileSpec.
     * 
     * @param profileData
     */
    public void setProfileData(com.vmware.converter.VirtualMachineProfileRawData profileData) {
        this.profileData = profileData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineDefinedProfileSpec)) return false;
        VirtualMachineDefinedProfileSpec other = (VirtualMachineDefinedProfileSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.profileData==null && other.getProfileData()==null) || 
             (this.profileData!=null &&
              this.profileData.equals(other.getProfileData())));
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
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getProfileData() != null) {
            _hashCode += getProfileData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineDefinedProfileSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDefinedProfileSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineProfileRawData"));
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
