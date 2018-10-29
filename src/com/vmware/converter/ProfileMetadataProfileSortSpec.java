/**
 * ProfileMetadataProfileSortSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfileMetadataProfileSortSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String policyId;

    private java.lang.String parameter;

    public ProfileMetadataProfileSortSpec() {
    }

    public ProfileMetadataProfileSortSpec(
           java.lang.String policyId,
           java.lang.String parameter) {
        this.policyId = policyId;
        this.parameter = parameter;
    }


    /**
     * Gets the policyId value for this ProfileMetadataProfileSortSpec.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this ProfileMetadataProfileSortSpec.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the parameter value for this ProfileMetadataProfileSortSpec.
     * 
     * @return parameter
     */
    public java.lang.String getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ProfileMetadataProfileSortSpec.
     * 
     * @param parameter
     */
    public void setParameter(java.lang.String parameter) {
        this.parameter = parameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileMetadataProfileSortSpec)) return false;
        ProfileMetadataProfileSortSpec other = (ProfileMetadataProfileSortSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter())));
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
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileMetadataProfileSortSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileMetadataProfileSortSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parameter"));
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
