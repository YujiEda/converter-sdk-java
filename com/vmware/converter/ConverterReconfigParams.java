/**
 * ConverterReconfigParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterReconfigParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterReconfigPrerequisites prerequisites;

    private com.vmware.converter.ConverterServiceChangeRequest[] serviceChanges;

    public ConverterReconfigParams() {
    }

    public ConverterReconfigParams(
           com.vmware.converter.ConverterReconfigPrerequisites prerequisites,
           com.vmware.converter.ConverterServiceChangeRequest[] serviceChanges) {
        this.prerequisites = prerequisites;
        this.serviceChanges = serviceChanges;
    }


    /**
     * Gets the prerequisites value for this ConverterReconfigParams.
     * 
     * @return prerequisites
     */
    public com.vmware.converter.ConverterReconfigPrerequisites getPrerequisites() {
        return prerequisites;
    }


    /**
     * Sets the prerequisites value for this ConverterReconfigParams.
     * 
     * @param prerequisites
     */
    public void setPrerequisites(com.vmware.converter.ConverterReconfigPrerequisites prerequisites) {
        this.prerequisites = prerequisites;
    }


    /**
     * Gets the serviceChanges value for this ConverterReconfigParams.
     * 
     * @return serviceChanges
     */
    public com.vmware.converter.ConverterServiceChangeRequest[] getServiceChanges() {
        return serviceChanges;
    }


    /**
     * Sets the serviceChanges value for this ConverterReconfigParams.
     * 
     * @param serviceChanges
     */
    public void setServiceChanges(com.vmware.converter.ConverterServiceChangeRequest[] serviceChanges) {
        this.serviceChanges = serviceChanges;
    }

    public com.vmware.converter.ConverterServiceChangeRequest getServiceChanges(int i) {
        return this.serviceChanges[i];
    }

    public void setServiceChanges(int i, com.vmware.converter.ConverterServiceChangeRequest _value) {
        this.serviceChanges[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterReconfigParams)) return false;
        ConverterReconfigParams other = (ConverterReconfigParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prerequisites==null && other.getPrerequisites()==null) || 
             (this.prerequisites!=null &&
              this.prerequisites.equals(other.getPrerequisites()))) &&
            ((this.serviceChanges==null && other.getServiceChanges()==null) || 
             (this.serviceChanges!=null &&
              java.util.Arrays.equals(this.serviceChanges, other.getServiceChanges())));
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
        if (getPrerequisites() != null) {
            _hashCode += getPrerequisites().hashCode();
        }
        if (getServiceChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceChanges(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterReconfigParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prerequisites");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "prerequisites"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisites"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "serviceChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceChangeRequest"));
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
