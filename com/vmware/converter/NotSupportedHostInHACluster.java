/**
 * NotSupportedHostInHACluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NotSupportedHostInHACluster  extends com.vmware.converter.NotSupportedHost  implements java.io.Serializable {
    private java.lang.String hostName;

    private java.lang.String build;

    public NotSupportedHostInHACluster() {
    }

    public NotSupportedHostInHACluster(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String productName,
           java.lang.String productVersion,
           java.lang.String hostName,
           java.lang.String build) {
        super(
            faultCause,
            faultMessage,
            productName,
            productVersion);
        this.hostName = hostName;
        this.build = build;
    }


    /**
     * Gets the hostName value for this NotSupportedHostInHACluster.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this NotSupportedHostInHACluster.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the build value for this NotSupportedHostInHACluster.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this NotSupportedHostInHACluster.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotSupportedHostInHACluster)) return false;
        NotSupportedHostInHACluster other = (NotSupportedHostInHACluster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild())));
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotSupportedHostInHACluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NotSupportedHostInHACluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "build"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
