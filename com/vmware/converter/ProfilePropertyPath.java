/**
 * ProfilePropertyPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfilePropertyPath  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String profilePath;

    private java.lang.String policyId;

    private java.lang.String parameterId;

    public ProfilePropertyPath() {
    }

    public ProfilePropertyPath(
           java.lang.String profilePath,
           java.lang.String policyId,
           java.lang.String parameterId) {
        this.profilePath = profilePath;
        this.policyId = policyId;
        this.parameterId = parameterId;
    }


    /**
     * Gets the profilePath value for this ProfilePropertyPath.
     * 
     * @return profilePath
     */
    public java.lang.String getProfilePath() {
        return profilePath;
    }


    /**
     * Sets the profilePath value for this ProfilePropertyPath.
     * 
     * @param profilePath
     */
    public void setProfilePath(java.lang.String profilePath) {
        this.profilePath = profilePath;
    }


    /**
     * Gets the policyId value for this ProfilePropertyPath.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this ProfilePropertyPath.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the parameterId value for this ProfilePropertyPath.
     * 
     * @return parameterId
     */
    public java.lang.String getParameterId() {
        return parameterId;
    }


    /**
     * Sets the parameterId value for this ProfilePropertyPath.
     * 
     * @param parameterId
     */
    public void setParameterId(java.lang.String parameterId) {
        this.parameterId = parameterId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfilePropertyPath)) return false;
        ProfilePropertyPath other = (ProfilePropertyPath) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.profilePath==null && other.getProfilePath()==null) || 
             (this.profilePath!=null &&
              this.profilePath.equals(other.getProfilePath()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.parameterId==null && other.getParameterId()==null) || 
             (this.parameterId!=null &&
              this.parameterId.equals(other.getParameterId())));
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
        if (getProfilePath() != null) {
            _hashCode += getProfilePath().hashCode();
        }
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getParameterId() != null) {
            _hashCode += getParameterId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfilePropertyPath.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePropertyPath"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parameterId"));
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
