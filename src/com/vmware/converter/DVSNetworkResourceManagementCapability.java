/**
 * DVSNetworkResourceManagementCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSNetworkResourceManagementCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean networkResourceManagementSupported;

    private int networkResourcePoolHighShareValue;

    private boolean qosSupported;

    private boolean userDefinedNetworkResourcePoolsSupported;

    private java.lang.Boolean networkResourceControlVersion3Supported;

    public DVSNetworkResourceManagementCapability() {
    }

    public DVSNetworkResourceManagementCapability(
           boolean networkResourceManagementSupported,
           int networkResourcePoolHighShareValue,
           boolean qosSupported,
           boolean userDefinedNetworkResourcePoolsSupported,
           java.lang.Boolean networkResourceControlVersion3Supported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
        this.qosSupported = qosSupported;
        this.userDefinedNetworkResourcePoolsSupported = userDefinedNetworkResourcePoolsSupported;
        this.networkResourceControlVersion3Supported = networkResourceControlVersion3Supported;
    }


    /**
     * Gets the networkResourceManagementSupported value for this DVSNetworkResourceManagementCapability.
     * 
     * @return networkResourceManagementSupported
     */
    public boolean isNetworkResourceManagementSupported() {
        return networkResourceManagementSupported;
    }


    /**
     * Sets the networkResourceManagementSupported value for this DVSNetworkResourceManagementCapability.
     * 
     * @param networkResourceManagementSupported
     */
    public void setNetworkResourceManagementSupported(boolean networkResourceManagementSupported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
    }


    /**
     * Gets the networkResourcePoolHighShareValue value for this DVSNetworkResourceManagementCapability.
     * 
     * @return networkResourcePoolHighShareValue
     */
    public int getNetworkResourcePoolHighShareValue() {
        return networkResourcePoolHighShareValue;
    }


    /**
     * Sets the networkResourcePoolHighShareValue value for this DVSNetworkResourceManagementCapability.
     * 
     * @param networkResourcePoolHighShareValue
     */
    public void setNetworkResourcePoolHighShareValue(int networkResourcePoolHighShareValue) {
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
    }


    /**
     * Gets the qosSupported value for this DVSNetworkResourceManagementCapability.
     * 
     * @return qosSupported
     */
    public boolean isQosSupported() {
        return qosSupported;
    }


    /**
     * Sets the qosSupported value for this DVSNetworkResourceManagementCapability.
     * 
     * @param qosSupported
     */
    public void setQosSupported(boolean qosSupported) {
        this.qosSupported = qosSupported;
    }


    /**
     * Gets the userDefinedNetworkResourcePoolsSupported value for this DVSNetworkResourceManagementCapability.
     * 
     * @return userDefinedNetworkResourcePoolsSupported
     */
    public boolean isUserDefinedNetworkResourcePoolsSupported() {
        return userDefinedNetworkResourcePoolsSupported;
    }


    /**
     * Sets the userDefinedNetworkResourcePoolsSupported value for this DVSNetworkResourceManagementCapability.
     * 
     * @param userDefinedNetworkResourcePoolsSupported
     */
    public void setUserDefinedNetworkResourcePoolsSupported(boolean userDefinedNetworkResourcePoolsSupported) {
        this.userDefinedNetworkResourcePoolsSupported = userDefinedNetworkResourcePoolsSupported;
    }


    /**
     * Gets the networkResourceControlVersion3Supported value for this DVSNetworkResourceManagementCapability.
     * 
     * @return networkResourceControlVersion3Supported
     */
    public java.lang.Boolean getNetworkResourceControlVersion3Supported() {
        return networkResourceControlVersion3Supported;
    }


    /**
     * Sets the networkResourceControlVersion3Supported value for this DVSNetworkResourceManagementCapability.
     * 
     * @param networkResourceControlVersion3Supported
     */
    public void setNetworkResourceControlVersion3Supported(java.lang.Boolean networkResourceControlVersion3Supported) {
        this.networkResourceControlVersion3Supported = networkResourceControlVersion3Supported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSNetworkResourceManagementCapability)) return false;
        DVSNetworkResourceManagementCapability other = (DVSNetworkResourceManagementCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.networkResourceManagementSupported == other.isNetworkResourceManagementSupported() &&
            this.networkResourcePoolHighShareValue == other.getNetworkResourcePoolHighShareValue() &&
            this.qosSupported == other.isQosSupported() &&
            this.userDefinedNetworkResourcePoolsSupported == other.isUserDefinedNetworkResourcePoolsSupported() &&
            ((this.networkResourceControlVersion3Supported==null && other.getNetworkResourceControlVersion3Supported()==null) || 
             (this.networkResourceControlVersion3Supported!=null &&
              this.networkResourceControlVersion3Supported.equals(other.getNetworkResourceControlVersion3Supported())));
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
        _hashCode += (isNetworkResourceManagementSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNetworkResourcePoolHighShareValue();
        _hashCode += (isQosSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUserDefinedNetworkResourcePoolsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNetworkResourceControlVersion3Supported() != null) {
            _hashCode += getNetworkResourceControlVersion3Supported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSNetworkResourceManagementCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourceManagementCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceManagementSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceManagementSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourcePoolHighShareValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourcePoolHighShareValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "qosSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedNetworkResourcePoolsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userDefinedNetworkResourcePoolsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceControlVersion3Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceControlVersion3Supported"));
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
