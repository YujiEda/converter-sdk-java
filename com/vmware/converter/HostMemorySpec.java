/**
 * HostMemorySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostMemorySpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long serviceConsoleReservation;

    public HostMemorySpec() {
    }

    public HostMemorySpec(
           java.lang.Long serviceConsoleReservation) {
        this.serviceConsoleReservation = serviceConsoleReservation;
    }


    /**
     * Gets the serviceConsoleReservation value for this HostMemorySpec.
     * 
     * @return serviceConsoleReservation
     */
    public java.lang.Long getServiceConsoleReservation() {
        return serviceConsoleReservation;
    }


    /**
     * Sets the serviceConsoleReservation value for this HostMemorySpec.
     * 
     * @param serviceConsoleReservation
     */
    public void setServiceConsoleReservation(java.lang.Long serviceConsoleReservation) {
        this.serviceConsoleReservation = serviceConsoleReservation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMemorySpec)) return false;
        HostMemorySpec other = (HostMemorySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceConsoleReservation==null && other.getServiceConsoleReservation()==null) || 
             (this.serviceConsoleReservation!=null &&
              this.serviceConsoleReservation.equals(other.getServiceConsoleReservation())));
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
        if (getServiceConsoleReservation() != null) {
            _hashCode += getServiceConsoleReservation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMemorySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemorySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceConsoleReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serviceConsoleReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
