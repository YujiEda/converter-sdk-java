/**
 * VMwareDvsIpfixCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDvsIpfixCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean ipfixSupported;

    private java.lang.Boolean ipv6ForIpfixSupported;

    private java.lang.Boolean observationDomainIdSupported;

    public VMwareDvsIpfixCapability() {
    }

    public VMwareDvsIpfixCapability(
           java.lang.Boolean ipfixSupported,
           java.lang.Boolean ipv6ForIpfixSupported,
           java.lang.Boolean observationDomainIdSupported) {
        this.ipfixSupported = ipfixSupported;
        this.ipv6ForIpfixSupported = ipv6ForIpfixSupported;
        this.observationDomainIdSupported = observationDomainIdSupported;
    }


    /**
     * Gets the ipfixSupported value for this VMwareDvsIpfixCapability.
     * 
     * @return ipfixSupported
     */
    public java.lang.Boolean getIpfixSupported() {
        return ipfixSupported;
    }


    /**
     * Sets the ipfixSupported value for this VMwareDvsIpfixCapability.
     * 
     * @param ipfixSupported
     */
    public void setIpfixSupported(java.lang.Boolean ipfixSupported) {
        this.ipfixSupported = ipfixSupported;
    }


    /**
     * Gets the ipv6ForIpfixSupported value for this VMwareDvsIpfixCapability.
     * 
     * @return ipv6ForIpfixSupported
     */
    public java.lang.Boolean getIpv6ForIpfixSupported() {
        return ipv6ForIpfixSupported;
    }


    /**
     * Sets the ipv6ForIpfixSupported value for this VMwareDvsIpfixCapability.
     * 
     * @param ipv6ForIpfixSupported
     */
    public void setIpv6ForIpfixSupported(java.lang.Boolean ipv6ForIpfixSupported) {
        this.ipv6ForIpfixSupported = ipv6ForIpfixSupported;
    }


    /**
     * Gets the observationDomainIdSupported value for this VMwareDvsIpfixCapability.
     * 
     * @return observationDomainIdSupported
     */
    public java.lang.Boolean getObservationDomainIdSupported() {
        return observationDomainIdSupported;
    }


    /**
     * Sets the observationDomainIdSupported value for this VMwareDvsIpfixCapability.
     * 
     * @param observationDomainIdSupported
     */
    public void setObservationDomainIdSupported(java.lang.Boolean observationDomainIdSupported) {
        this.observationDomainIdSupported = observationDomainIdSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDvsIpfixCapability)) return false;
        VMwareDvsIpfixCapability other = (VMwareDvsIpfixCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipfixSupported==null && other.getIpfixSupported()==null) || 
             (this.ipfixSupported!=null &&
              this.ipfixSupported.equals(other.getIpfixSupported()))) &&
            ((this.ipv6ForIpfixSupported==null && other.getIpv6ForIpfixSupported()==null) || 
             (this.ipv6ForIpfixSupported!=null &&
              this.ipv6ForIpfixSupported.equals(other.getIpv6ForIpfixSupported()))) &&
            ((this.observationDomainIdSupported==null && other.getObservationDomainIdSupported()==null) || 
             (this.observationDomainIdSupported!=null &&
              this.observationDomainIdSupported.equals(other.getObservationDomainIdSupported())));
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
        if (getIpfixSupported() != null) {
            _hashCode += getIpfixSupported().hashCode();
        }
        if (getIpv6ForIpfixSupported() != null) {
            _hashCode += getIpv6ForIpfixSupported().hashCode();
        }
        if (getObservationDomainIdSupported() != null) {
            _hashCode += getObservationDomainIdSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDvsIpfixCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsIpfixCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfixSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfixSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6ForIpfixSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6ForIpfixSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observationDomainIdSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "observationDomainIdSupported"));
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
