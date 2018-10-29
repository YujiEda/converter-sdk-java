/**
 * ExtensionOvfConsumerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ExtensionOvfConsumerInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String callbackUrl;

    private java.lang.String[] sectionType;

    public ExtensionOvfConsumerInfo() {
    }

    public ExtensionOvfConsumerInfo(
           java.lang.String callbackUrl,
           java.lang.String[] sectionType) {
        this.callbackUrl = callbackUrl;
        this.sectionType = sectionType;
    }


    /**
     * Gets the callbackUrl value for this ExtensionOvfConsumerInfo.
     * 
     * @return callbackUrl
     */
    public java.lang.String getCallbackUrl() {
        return callbackUrl;
    }


    /**
     * Sets the callbackUrl value for this ExtensionOvfConsumerInfo.
     * 
     * @param callbackUrl
     */
    public void setCallbackUrl(java.lang.String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    /**
     * Gets the sectionType value for this ExtensionOvfConsumerInfo.
     * 
     * @return sectionType
     */
    public java.lang.String[] getSectionType() {
        return sectionType;
    }


    /**
     * Sets the sectionType value for this ExtensionOvfConsumerInfo.
     * 
     * @param sectionType
     */
    public void setSectionType(java.lang.String[] sectionType) {
        this.sectionType = sectionType;
    }

    public java.lang.String getSectionType(int i) {
        return this.sectionType[i];
    }

    public void setSectionType(int i, java.lang.String _value) {
        this.sectionType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtensionOvfConsumerInfo)) return false;
        ExtensionOvfConsumerInfo other = (ExtensionOvfConsumerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callbackUrl==null && other.getCallbackUrl()==null) || 
             (this.callbackUrl!=null &&
              this.callbackUrl.equals(other.getCallbackUrl()))) &&
            ((this.sectionType==null && other.getSectionType()==null) || 
             (this.sectionType!=null &&
              java.util.Arrays.equals(this.sectionType, other.getSectionType())));
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
        if (getCallbackUrl() != null) {
            _hashCode += getCallbackUrl().hashCode();
        }
        if (getSectionType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSectionType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSectionType(), i);
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
        new org.apache.axis.description.TypeDesc(ExtensionOvfConsumerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionOvfConsumerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "callbackUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
