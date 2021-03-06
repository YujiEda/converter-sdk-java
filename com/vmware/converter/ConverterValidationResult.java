/**
 * ConverterValidationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterValidationResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterPropertyInfo[] validationInfo;

    public ConverterValidationResult() {
    }

    public ConverterValidationResult(
           com.vmware.converter.ConverterPropertyInfo[] validationInfo) {
        this.validationInfo = validationInfo;
    }


    /**
     * Gets the validationInfo value for this ConverterValidationResult.
     * 
     * @return validationInfo
     */
    public com.vmware.converter.ConverterPropertyInfo[] getValidationInfo() {
        return validationInfo;
    }


    /**
     * Sets the validationInfo value for this ConverterValidationResult.
     * 
     * @param validationInfo
     */
    public void setValidationInfo(com.vmware.converter.ConverterPropertyInfo[] validationInfo) {
        this.validationInfo = validationInfo;
    }

    public com.vmware.converter.ConverterPropertyInfo getValidationInfo(int i) {
        return this.validationInfo[i];
    }

    public void setValidationInfo(int i, com.vmware.converter.ConverterPropertyInfo _value) {
        this.validationInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterValidationResult)) return false;
        ConverterValidationResult other = (ConverterValidationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.validationInfo==null && other.getValidationInfo()==null) || 
             (this.validationInfo!=null &&
              java.util.Arrays.equals(this.validationInfo, other.getValidationInfo())));
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
        if (getValidationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterValidationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterValidationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "validationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterPropertyInfo"));
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
