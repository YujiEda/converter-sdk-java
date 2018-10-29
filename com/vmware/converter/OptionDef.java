/**
 * OptionDef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OptionDef  extends com.vmware.converter.ElementDescription  implements java.io.Serializable {
    private com.vmware.converter.OptionType optionType;

    public OptionDef() {
    }

    public OptionDef(
           java.lang.String label,
           java.lang.String summary,
           java.lang.String key,
           com.vmware.converter.OptionType optionType) {
        super(
            label,
            summary,
            key);
        this.optionType = optionType;
    }


    /**
     * Gets the optionType value for this OptionDef.
     * 
     * @return optionType
     */
    public com.vmware.converter.OptionType getOptionType() {
        return optionType;
    }


    /**
     * Sets the optionType value for this OptionDef.
     * 
     * @param optionType
     */
    public void setOptionType(com.vmware.converter.OptionType optionType) {
        this.optionType = optionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OptionDef)) return false;
        OptionDef other = (OptionDef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.optionType==null && other.getOptionType()==null) || 
             (this.optionType!=null &&
              this.optionType.equals(other.getOptionType())));
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
        if (getOptionType() != null) {
            _hashCode += getOptionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OptionDef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionDef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "optionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionType"));
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
