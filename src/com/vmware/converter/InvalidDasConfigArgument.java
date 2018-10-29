/**
 * InvalidDasConfigArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InvalidDasConfigArgument  extends com.vmware.converter.InvalidArgument  implements java.io.Serializable {
    private java.lang.String entry;

    private java.lang.String clusterName;

    public InvalidDasConfigArgument() {
    }

    public InvalidDasConfigArgument(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String invalidProperty,
           java.lang.String entry,
           java.lang.String clusterName) {
        super(
            faultCause,
            faultMessage,
            invalidProperty);
        this.entry = entry;
        this.clusterName = clusterName;
    }


    /**
     * Gets the entry value for this InvalidDasConfigArgument.
     * 
     * @return entry
     */
    public java.lang.String getEntry() {
        return entry;
    }


    /**
     * Sets the entry value for this InvalidDasConfigArgument.
     * 
     * @param entry
     */
    public void setEntry(java.lang.String entry) {
        this.entry = entry;
    }


    /**
     * Gets the clusterName value for this InvalidDasConfigArgument.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this InvalidDasConfigArgument.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidDasConfigArgument)) return false;
        InvalidDasConfigArgument other = (InvalidDasConfigArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entry==null && other.getEntry()==null) || 
             (this.entry!=null &&
              this.entry.equals(other.getEntry()))) &&
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName())));
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
        if (getEntry() != null) {
            _hashCode += getEntry().hashCode();
        }
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidDasConfigArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InvalidDasConfigArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterName"));
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
