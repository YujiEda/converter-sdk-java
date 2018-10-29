/**
 * DisallowedChangeByService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DisallowedChangeByService  extends com.vmware.converter.RuntimeFault  implements java.io.Serializable {
    private java.lang.String serviceName;

    private java.lang.String disallowedChange;

    public DisallowedChangeByService() {
    }

    public DisallowedChangeByService(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String serviceName,
           java.lang.String disallowedChange) {
        super(
            faultCause,
            faultMessage);
        this.serviceName = serviceName;
        this.disallowedChange = disallowedChange;
    }


    /**
     * Gets the serviceName value for this DisallowedChangeByService.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this DisallowedChangeByService.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the disallowedChange value for this DisallowedChangeByService.
     * 
     * @return disallowedChange
     */
    public java.lang.String getDisallowedChange() {
        return disallowedChange;
    }


    /**
     * Sets the disallowedChange value for this DisallowedChangeByService.
     * 
     * @param disallowedChange
     */
    public void setDisallowedChange(java.lang.String disallowedChange) {
        this.disallowedChange = disallowedChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisallowedChangeByService)) return false;
        DisallowedChangeByService other = (DisallowedChangeByService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.disallowedChange==null && other.getDisallowedChange()==null) || 
             (this.disallowedChange!=null &&
              this.disallowedChange.equals(other.getDisallowedChange())));
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
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getDisallowedChange() != null) {
            _hashCode += getDisallowedChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisallowedChangeByService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DisallowedChangeByService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disallowedChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disallowedChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
