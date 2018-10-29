/**
 * InsufficientStorageIops.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InsufficientStorageIops  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private long unreservedIops;

    private long requestedIops;

    private java.lang.String datastoreName;

    public InsufficientStorageIops() {
    }

    public InsufficientStorageIops(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           long unreservedIops,
           long requestedIops,
           java.lang.String datastoreName) {
        super(
            faultCause,
            faultMessage);
        this.unreservedIops = unreservedIops;
        this.requestedIops = requestedIops;
        this.datastoreName = datastoreName;
    }


    /**
     * Gets the unreservedIops value for this InsufficientStorageIops.
     * 
     * @return unreservedIops
     */
    public long getUnreservedIops() {
        return unreservedIops;
    }


    /**
     * Sets the unreservedIops value for this InsufficientStorageIops.
     * 
     * @param unreservedIops
     */
    public void setUnreservedIops(long unreservedIops) {
        this.unreservedIops = unreservedIops;
    }


    /**
     * Gets the requestedIops value for this InsufficientStorageIops.
     * 
     * @return requestedIops
     */
    public long getRequestedIops() {
        return requestedIops;
    }


    /**
     * Sets the requestedIops value for this InsufficientStorageIops.
     * 
     * @param requestedIops
     */
    public void setRequestedIops(long requestedIops) {
        this.requestedIops = requestedIops;
    }


    /**
     * Gets the datastoreName value for this InsufficientStorageIops.
     * 
     * @return datastoreName
     */
    public java.lang.String getDatastoreName() {
        return datastoreName;
    }


    /**
     * Sets the datastoreName value for this InsufficientStorageIops.
     * 
     * @param datastoreName
     */
    public void setDatastoreName(java.lang.String datastoreName) {
        this.datastoreName = datastoreName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsufficientStorageIops)) return false;
        InsufficientStorageIops other = (InsufficientStorageIops) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.unreservedIops == other.getUnreservedIops() &&
            this.requestedIops == other.getRequestedIops() &&
            ((this.datastoreName==null && other.getDatastoreName()==null) || 
             (this.datastoreName!=null &&
              this.datastoreName.equals(other.getDatastoreName())));
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
        _hashCode += new Long(getUnreservedIops()).hashCode();
        _hashCode += new Long(getRequestedIops()).hashCode();
        if (getDatastoreName() != null) {
            _hashCode += getDatastoreName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsufficientStorageIops.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InsufficientStorageIops"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unreservedIops");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unreservedIops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedIops");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requestedIops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreName"));
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
