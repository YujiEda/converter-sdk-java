/**
 * GuestRegValueSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestRegValueSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.GuestRegValueNameSpec name;

    private com.vmware.converter.GuestRegValueDataSpec data;

    public GuestRegValueSpec() {
    }

    public GuestRegValueSpec(
           com.vmware.converter.GuestRegValueNameSpec name,
           com.vmware.converter.GuestRegValueDataSpec data) {
        this.name = name;
        this.data = data;
    }


    /**
     * Gets the name value for this GuestRegValueSpec.
     * 
     * @return name
     */
    public com.vmware.converter.GuestRegValueNameSpec getName() {
        return name;
    }


    /**
     * Sets the name value for this GuestRegValueSpec.
     * 
     * @param name
     */
    public void setName(com.vmware.converter.GuestRegValueNameSpec name) {
        this.name = name;
    }


    /**
     * Gets the data value for this GuestRegValueSpec.
     * 
     * @return data
     */
    public com.vmware.converter.GuestRegValueDataSpec getData() {
        return data;
    }


    /**
     * Sets the data value for this GuestRegValueSpec.
     * 
     * @param data
     */
    public void setData(com.vmware.converter.GuestRegValueDataSpec data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestRegValueSpec)) return false;
        GuestRegValueSpec other = (GuestRegValueSpec) obj;
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
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestRegValueSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegValueSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegValueNameSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestRegValueDataSpec"));
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
