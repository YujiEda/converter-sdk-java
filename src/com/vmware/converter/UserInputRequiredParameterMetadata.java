/**
 * UserInputRequiredParameterMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class UserInputRequiredParameterMetadata  extends com.vmware.converter.ProfilePolicyOptionMetadata  implements java.io.Serializable {
    private com.vmware.converter.ProfileParameterMetadata[] userInputParameter;

    public UserInputRequiredParameterMetadata() {
    }

    public UserInputRequiredParameterMetadata(
           com.vmware.converter.ExtendedElementDescription id,
           com.vmware.converter.ProfileParameterMetadata[] parameter,
           com.vmware.converter.ProfileParameterMetadata[] userInputParameter) {
        super(
            id,
            parameter);
        this.userInputParameter = userInputParameter;
    }


    /**
     * Gets the userInputParameter value for this UserInputRequiredParameterMetadata.
     * 
     * @return userInputParameter
     */
    public com.vmware.converter.ProfileParameterMetadata[] getUserInputParameter() {
        return userInputParameter;
    }


    /**
     * Sets the userInputParameter value for this UserInputRequiredParameterMetadata.
     * 
     * @param userInputParameter
     */
    public void setUserInputParameter(com.vmware.converter.ProfileParameterMetadata[] userInputParameter) {
        this.userInputParameter = userInputParameter;
    }

    public com.vmware.converter.ProfileParameterMetadata getUserInputParameter(int i) {
        return this.userInputParameter[i];
    }

    public void setUserInputParameter(int i, com.vmware.converter.ProfileParameterMetadata _value) {
        this.userInputParameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInputRequiredParameterMetadata)) return false;
        UserInputRequiredParameterMetadata other = (UserInputRequiredParameterMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userInputParameter==null && other.getUserInputParameter()==null) || 
             (this.userInputParameter!=null &&
              java.util.Arrays.equals(this.userInputParameter, other.getUserInputParameter())));
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
        if (getUserInputParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInputParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInputParameter(), i);
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
        new org.apache.axis.description.TypeDesc(UserInputRequiredParameterMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserInputRequiredParameterMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userInputParameter"));
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
