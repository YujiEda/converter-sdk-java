/**
 * ConverterServerJobJobJobUpdateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerJobJobJobUpdateSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.util.Calendar firstRun;

    private java.lang.Boolean doFirstRunNow;

    public ConverterServerJobJobJobUpdateSpec() {
    }

    public ConverterServerJobJobJobUpdateSpec(
           java.lang.String name,
           java.lang.String description,
           java.util.Calendar firstRun,
           java.lang.Boolean doFirstRunNow) {
        this.name = name;
        this.description = description;
        this.firstRun = firstRun;
        this.doFirstRunNow = doFirstRunNow;
    }


    /**
     * Gets the name value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the firstRun value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @return firstRun
     */
    public java.util.Calendar getFirstRun() {
        return firstRun;
    }


    /**
     * Sets the firstRun value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @param firstRun
     */
    public void setFirstRun(java.util.Calendar firstRun) {
        this.firstRun = firstRun;
    }


    /**
     * Gets the doFirstRunNow value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @return doFirstRunNow
     */
    public java.lang.Boolean getDoFirstRunNow() {
        return doFirstRunNow;
    }


    /**
     * Sets the doFirstRunNow value for this ConverterServerJobJobJobUpdateSpec.
     * 
     * @param doFirstRunNow
     */
    public void setDoFirstRunNow(java.lang.Boolean doFirstRunNow) {
        this.doFirstRunNow = doFirstRunNow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerJobJobJobUpdateSpec)) return false;
        ConverterServerJobJobJobUpdateSpec other = (ConverterServerJobJobJobUpdateSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.firstRun==null && other.getFirstRun()==null) || 
             (this.firstRun!=null &&
              this.firstRun.equals(other.getFirstRun()))) &&
            ((this.doFirstRunNow==null && other.getDoFirstRunNow()==null) || 
             (this.doFirstRunNow!=null &&
              this.doFirstRunNow.equals(other.getDoFirstRunNow())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFirstRun() != null) {
            _hashCode += getFirstRun().hashCode();
        }
        if (getDoFirstRunNow() != null) {
            _hashCode += getDoFirstRunNow().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerJobJobJobUpdateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerJobJobJobUpdateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "firstRun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doFirstRunNow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doFirstRunNow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
