/**
 * EventDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EventDescription  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ElementDescription[] category;

    private com.vmware.converter.EventDescriptionEventDetail[] eventInfo;

    private com.vmware.converter.EnumDescription[] enumeratedTypes;

    public EventDescription() {
    }

    public EventDescription(
           com.vmware.converter.ElementDescription[] category,
           com.vmware.converter.EventDescriptionEventDetail[] eventInfo,
           com.vmware.converter.EnumDescription[] enumeratedTypes) {
        this.category = category;
        this.eventInfo = eventInfo;
        this.enumeratedTypes = enumeratedTypes;
    }


    /**
     * Gets the category value for this EventDescription.
     * 
     * @return category
     */
    public com.vmware.converter.ElementDescription[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this EventDescription.
     * 
     * @param category
     */
    public void setCategory(com.vmware.converter.ElementDescription[] category) {
        this.category = category;
    }

    public com.vmware.converter.ElementDescription getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.vmware.converter.ElementDescription _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the eventInfo value for this EventDescription.
     * 
     * @return eventInfo
     */
    public com.vmware.converter.EventDescriptionEventDetail[] getEventInfo() {
        return eventInfo;
    }


    /**
     * Sets the eventInfo value for this EventDescription.
     * 
     * @param eventInfo
     */
    public void setEventInfo(com.vmware.converter.EventDescriptionEventDetail[] eventInfo) {
        this.eventInfo = eventInfo;
    }

    public com.vmware.converter.EventDescriptionEventDetail getEventInfo(int i) {
        return this.eventInfo[i];
    }

    public void setEventInfo(int i, com.vmware.converter.EventDescriptionEventDetail _value) {
        this.eventInfo[i] = _value;
    }


    /**
     * Gets the enumeratedTypes value for this EventDescription.
     * 
     * @return enumeratedTypes
     */
    public com.vmware.converter.EnumDescription[] getEnumeratedTypes() {
        return enumeratedTypes;
    }


    /**
     * Sets the enumeratedTypes value for this EventDescription.
     * 
     * @param enumeratedTypes
     */
    public void setEnumeratedTypes(com.vmware.converter.EnumDescription[] enumeratedTypes) {
        this.enumeratedTypes = enumeratedTypes;
    }

    public com.vmware.converter.EnumDescription getEnumeratedTypes(int i) {
        return this.enumeratedTypes[i];
    }

    public void setEnumeratedTypes(int i, com.vmware.converter.EnumDescription _value) {
        this.enumeratedTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventDescription)) return false;
        EventDescription other = (EventDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.eventInfo==null && other.getEventInfo()==null) || 
             (this.eventInfo!=null &&
              java.util.Arrays.equals(this.eventInfo, other.getEventInfo()))) &&
            ((this.enumeratedTypes==null && other.getEnumeratedTypes()==null) || 
             (this.enumeratedTypes!=null &&
              java.util.Arrays.equals(this.enumeratedTypes, other.getEnumeratedTypes())));
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
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getEnumeratedTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumeratedTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumeratedTypes(), i);
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
        new org.apache.axis.description.TypeDesc(EventDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventDescriptionEventDetail"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumeratedTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enumeratedTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EnumDescription"));
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
