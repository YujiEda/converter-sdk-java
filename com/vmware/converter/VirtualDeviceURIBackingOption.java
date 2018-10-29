/**
 * VirtualDeviceURIBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDeviceURIBackingOption  extends com.vmware.converter.VirtualDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption directions;

    public VirtualDeviceURIBackingOption() {
    }

    public VirtualDeviceURIBackingOption(
           java.lang.String type,
           com.vmware.converter.ChoiceOption directions) {
        super(
            type);
        this.directions = directions;
    }


    /**
     * Gets the directions value for this VirtualDeviceURIBackingOption.
     * 
     * @return directions
     */
    public com.vmware.converter.ChoiceOption getDirections() {
        return directions;
    }


    /**
     * Sets the directions value for this VirtualDeviceURIBackingOption.
     * 
     * @param directions
     */
    public void setDirections(com.vmware.converter.ChoiceOption directions) {
        this.directions = directions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDeviceURIBackingOption)) return false;
        VirtualDeviceURIBackingOption other = (VirtualDeviceURIBackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.directions==null && other.getDirections()==null) || 
             (this.directions!=null &&
              this.directions.equals(other.getDirections())));
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
        if (getDirections() != null) {
            _hashCode += getDirections().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDeviceURIBackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceURIBackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "directions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
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
