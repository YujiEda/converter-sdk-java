/**
 * RebootRequired.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RebootRequired  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private java.lang.String patch;

    public RebootRequired() {
    }

    public RebootRequired(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String patch) {
        super(
            faultCause,
            faultMessage);
        this.patch = patch;
    }


    /**
     * Gets the patch value for this RebootRequired.
     * 
     * @return patch
     */
    public java.lang.String getPatch() {
        return patch;
    }


    /**
     * Sets the patch value for this RebootRequired.
     * 
     * @param patch
     */
    public void setPatch(java.lang.String patch) {
        this.patch = patch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RebootRequired)) return false;
        RebootRequired other = (RebootRequired) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.patch==null && other.getPatch()==null) || 
             (this.patch!=null &&
              this.patch.equals(other.getPatch())));
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
        if (getPatch() != null) {
            _hashCode += getPatch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RebootRequired.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RebootRequired"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "patch"));
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

}
