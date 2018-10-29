/**
 * ProfilePolicyOptionMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfilePolicyOptionMetadata  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ExtendedElementDescription id;

    private com.vmware.converter.ProfileParameterMetadata[] parameter;

    public ProfilePolicyOptionMetadata() {
    }

    public ProfilePolicyOptionMetadata(
           com.vmware.converter.ExtendedElementDescription id,
           com.vmware.converter.ProfileParameterMetadata[] parameter) {
        this.id = id;
        this.parameter = parameter;
    }


    /**
     * Gets the id value for this ProfilePolicyOptionMetadata.
     * 
     * @return id
     */
    public com.vmware.converter.ExtendedElementDescription getId() {
        return id;
    }


    /**
     * Sets the id value for this ProfilePolicyOptionMetadata.
     * 
     * @param id
     */
    public void setId(com.vmware.converter.ExtendedElementDescription id) {
        this.id = id;
    }


    /**
     * Gets the parameter value for this ProfilePolicyOptionMetadata.
     * 
     * @return parameter
     */
    public com.vmware.converter.ProfileParameterMetadata[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ProfilePolicyOptionMetadata.
     * 
     * @param parameter
     */
    public void setParameter(com.vmware.converter.ProfileParameterMetadata[] parameter) {
        this.parameter = parameter;
    }

    public com.vmware.converter.ProfileParameterMetadata getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.vmware.converter.ProfileParameterMetadata _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfilePolicyOptionMetadata)) return false;
        ProfilePolicyOptionMetadata other = (ProfilePolicyOptionMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ProfilePolicyOptionMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePolicyOptionMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtendedElementDescription"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileParameterMetadata"));
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
