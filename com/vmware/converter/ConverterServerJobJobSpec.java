/**
 * ConverterServerJobJobSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerJobJobSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.util.Calendar firstRun;

    private java.lang.Boolean startSuspended;

    public ConverterServerJobJobSpec() {
    }

    public ConverterServerJobJobSpec(
           java.lang.String name,
           java.lang.String description,
           java.util.Calendar firstRun,
           java.lang.Boolean startSuspended) {
        this.name = name;
        this.description = description;
        this.firstRun = firstRun;
        this.startSuspended = startSuspended;
    }


    /**
     * Gets the name value for this ConverterServerJobJobSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConverterServerJobJobSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ConverterServerJobJobSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ConverterServerJobJobSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the firstRun value for this ConverterServerJobJobSpec.
     * 
     * @return firstRun
     */
    public java.util.Calendar getFirstRun() {
        return firstRun;
    }


    /**
     * Sets the firstRun value for this ConverterServerJobJobSpec.
     * 
     * @param firstRun
     */
    public void setFirstRun(java.util.Calendar firstRun) {
        this.firstRun = firstRun;
    }


    /**
     * Gets the startSuspended value for this ConverterServerJobJobSpec.
     * 
     * @return startSuspended
     */
    public java.lang.Boolean getStartSuspended() {
        return startSuspended;
    }


    /**
     * Sets the startSuspended value for this ConverterServerJobJobSpec.
     * 
     * @param startSuspended
     */
    public void setStartSuspended(java.lang.Boolean startSuspended) {
        this.startSuspended = startSuspended;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerJobJobSpec)) return false;
        ConverterServerJobJobSpec other = (ConverterServerJobJobSpec) obj;
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
            ((this.startSuspended==null && other.getStartSuspended()==null) || 
             (this.startSuspended!=null &&
              this.startSuspended.equals(other.getStartSuspended())));
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
        if (getStartSuspended() != null) {
            _hashCode += getStartSuspended().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerJobJobSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerJobJobSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("startSuspended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "startSuspended"));
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
