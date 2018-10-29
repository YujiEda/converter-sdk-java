/**
 * ConverterEventDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterEventDescription  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ElementDescription[] eventInfo;

    private com.vmware.converter.ElementDescription[] type;

    public ConverterEventDescription() {
    }

    public ConverterEventDescription(
           com.vmware.converter.ElementDescription[] eventInfo,
           com.vmware.converter.ElementDescription[] type) {
        this.eventInfo = eventInfo;
        this.type = type;
    }


    /**
     * Gets the eventInfo value for this ConverterEventDescription.
     * 
     * @return eventInfo
     */
    public com.vmware.converter.ElementDescription[] getEventInfo() {
        return eventInfo;
    }


    /**
     * Sets the eventInfo value for this ConverterEventDescription.
     * 
     * @param eventInfo
     */
    public void setEventInfo(com.vmware.converter.ElementDescription[] eventInfo) {
        this.eventInfo = eventInfo;
    }

    public com.vmware.converter.ElementDescription getEventInfo(int i) {
        return this.eventInfo[i];
    }

    public void setEventInfo(int i, com.vmware.converter.ElementDescription _value) {
        this.eventInfo[i] = _value;
    }


    /**
     * Gets the type value for this ConverterEventDescription.
     * 
     * @return type
     */
    public com.vmware.converter.ElementDescription[] getType() {
        return type;
    }


    /**
     * Sets the type value for this ConverterEventDescription.
     * 
     * @param type
     */
    public void setType(com.vmware.converter.ElementDescription[] type) {
        this.type = type;
    }

    public com.vmware.converter.ElementDescription getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.vmware.converter.ElementDescription _value) {
        this.type[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterEventDescription)) return false;
        ConverterEventDescription other = (ConverterEventDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventInfo==null && other.getEventInfo()==null) || 
             (this.eventInfo!=null &&
              java.util.Arrays.equals(this.eventInfo, other.getEventInfo()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType())));
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
        if (getEventInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterEventDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterEventDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "eventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
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
