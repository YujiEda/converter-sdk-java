/**
 * CustomizationSysprepFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class CustomizationSysprepFailed  extends com.vmware.converter.CustomizationFailed  implements java.io.Serializable {
    private java.lang.String sysprepVersion;

    private java.lang.String systemVersion;

    public CustomizationSysprepFailed() {
    }

    public CustomizationSysprepFailed(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           boolean template,
           java.lang.String logLocation,
           java.lang.String sysprepVersion,
           java.lang.String systemVersion) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag,
            template,
            logLocation);
        this.sysprepVersion = sysprepVersion;
        this.systemVersion = systemVersion;
    }


    /**
     * Gets the sysprepVersion value for this CustomizationSysprepFailed.
     * 
     * @return sysprepVersion
     */
    public java.lang.String getSysprepVersion() {
        return sysprepVersion;
    }


    /**
     * Sets the sysprepVersion value for this CustomizationSysprepFailed.
     * 
     * @param sysprepVersion
     */
    public void setSysprepVersion(java.lang.String sysprepVersion) {
        this.sysprepVersion = sysprepVersion;
    }


    /**
     * Gets the systemVersion value for this CustomizationSysprepFailed.
     * 
     * @return systemVersion
     */
    public java.lang.String getSystemVersion() {
        return systemVersion;
    }


    /**
     * Sets the systemVersion value for this CustomizationSysprepFailed.
     * 
     * @param systemVersion
     */
    public void setSystemVersion(java.lang.String systemVersion) {
        this.systemVersion = systemVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationSysprepFailed)) return false;
        CustomizationSysprepFailed other = (CustomizationSysprepFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sysprepVersion==null && other.getSysprepVersion()==null) || 
             (this.sysprepVersion!=null &&
              this.sysprepVersion.equals(other.getSysprepVersion()))) &&
            ((this.systemVersion==null && other.getSystemVersion()==null) || 
             (this.systemVersion!=null &&
              this.systemVersion.equals(other.getSystemVersion())));
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
        if (getSysprepVersion() != null) {
            _hashCode += getSysprepVersion().hashCode();
        }
        if (getSystemVersion() != null) {
            _hashCode += getSystemVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizationSysprepFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationSysprepFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysprepVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sysprepVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemVersion"));
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
