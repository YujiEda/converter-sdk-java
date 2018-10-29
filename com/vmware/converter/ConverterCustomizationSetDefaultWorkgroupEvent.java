/**
 * ConverterCustomizationSetDefaultWorkgroupEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCustomizationSetDefaultWorkgroupEvent  extends com.vmware.converter.ConverterCustomizationEvent  implements java.io.Serializable {
    private java.lang.String workgroup;

    public ConverterCustomizationSetDefaultWorkgroupEvent() {
    }

    public ConverterCustomizationSetDefaultWorkgroupEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String workgroup) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job);
        this.workgroup = workgroup;
    }


    /**
     * Gets the workgroup value for this ConverterCustomizationSetDefaultWorkgroupEvent.
     * 
     * @return workgroup
     */
    public java.lang.String getWorkgroup() {
        return workgroup;
    }


    /**
     * Sets the workgroup value for this ConverterCustomizationSetDefaultWorkgroupEvent.
     * 
     * @param workgroup
     */
    public void setWorkgroup(java.lang.String workgroup) {
        this.workgroup = workgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCustomizationSetDefaultWorkgroupEvent)) return false;
        ConverterCustomizationSetDefaultWorkgroupEvent other = (ConverterCustomizationSetDefaultWorkgroupEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.workgroup==null && other.getWorkgroup()==null) || 
             (this.workgroup!=null &&
              this.workgroup.equals(other.getWorkgroup())));
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
        if (getWorkgroup() != null) {
            _hashCode += getWorkgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCustomizationSetDefaultWorkgroupEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCustomizationSetDefaultWorkgroupEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "workgroup"));
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
