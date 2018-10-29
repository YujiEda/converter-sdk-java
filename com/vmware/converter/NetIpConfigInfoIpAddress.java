/**
 * NetIpConfigInfoIpAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NetIpConfigInfoIpAddress  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ipAddress;

    private int prefixLength;

    private java.lang.String origin;

    private java.lang.String state;

    private java.util.Calendar lifetime;

    public NetIpConfigInfoIpAddress() {
    }

    public NetIpConfigInfoIpAddress(
           java.lang.String ipAddress,
           int prefixLength,
           java.lang.String origin,
           java.lang.String state,
           java.util.Calendar lifetime) {
        this.ipAddress = ipAddress;
        this.prefixLength = prefixLength;
        this.origin = origin;
        this.state = state;
        this.lifetime = lifetime;
    }


    /**
     * Gets the ipAddress value for this NetIpConfigInfoIpAddress.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this NetIpConfigInfoIpAddress.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the prefixLength value for this NetIpConfigInfoIpAddress.
     * 
     * @return prefixLength
     */
    public int getPrefixLength() {
        return prefixLength;
    }


    /**
     * Sets the prefixLength value for this NetIpConfigInfoIpAddress.
     * 
     * @param prefixLength
     */
    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }


    /**
     * Gets the origin value for this NetIpConfigInfoIpAddress.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this NetIpConfigInfoIpAddress.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the state value for this NetIpConfigInfoIpAddress.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this NetIpConfigInfoIpAddress.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the lifetime value for this NetIpConfigInfoIpAddress.
     * 
     * @return lifetime
     */
    public java.util.Calendar getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this NetIpConfigInfoIpAddress.
     * 
     * @param lifetime
     */
    public void setLifetime(java.util.Calendar lifetime) {
        this.lifetime = lifetime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetIpConfigInfoIpAddress)) return false;
        NetIpConfigInfoIpAddress other = (NetIpConfigInfoIpAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            this.prefixLength == other.getPrefixLength() &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        _hashCode += getPrefixLength();
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetIpConfigInfoIpAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetIpConfigInfoIpAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
