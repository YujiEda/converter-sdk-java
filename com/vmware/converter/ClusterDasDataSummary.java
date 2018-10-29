/**
 * ClusterDasDataSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasDataSummary  extends com.vmware.converter.ClusterDasData  implements java.io.Serializable {
    private long hostListVersion;

    private long clusterConfigVersion;

    private long compatListVersion;

    public ClusterDasDataSummary() {
    }

    public ClusterDasDataSummary(
           long hostListVersion,
           long clusterConfigVersion,
           long compatListVersion) {
        this.hostListVersion = hostListVersion;
        this.clusterConfigVersion = clusterConfigVersion;
        this.compatListVersion = compatListVersion;
    }


    /**
     * Gets the hostListVersion value for this ClusterDasDataSummary.
     * 
     * @return hostListVersion
     */
    public long getHostListVersion() {
        return hostListVersion;
    }


    /**
     * Sets the hostListVersion value for this ClusterDasDataSummary.
     * 
     * @param hostListVersion
     */
    public void setHostListVersion(long hostListVersion) {
        this.hostListVersion = hostListVersion;
    }


    /**
     * Gets the clusterConfigVersion value for this ClusterDasDataSummary.
     * 
     * @return clusterConfigVersion
     */
    public long getClusterConfigVersion() {
        return clusterConfigVersion;
    }


    /**
     * Sets the clusterConfigVersion value for this ClusterDasDataSummary.
     * 
     * @param clusterConfigVersion
     */
    public void setClusterConfigVersion(long clusterConfigVersion) {
        this.clusterConfigVersion = clusterConfigVersion;
    }


    /**
     * Gets the compatListVersion value for this ClusterDasDataSummary.
     * 
     * @return compatListVersion
     */
    public long getCompatListVersion() {
        return compatListVersion;
    }


    /**
     * Sets the compatListVersion value for this ClusterDasDataSummary.
     * 
     * @param compatListVersion
     */
    public void setCompatListVersion(long compatListVersion) {
        this.compatListVersion = compatListVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasDataSummary)) return false;
        ClusterDasDataSummary other = (ClusterDasDataSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.hostListVersion == other.getHostListVersion() &&
            this.clusterConfigVersion == other.getClusterConfigVersion() &&
            this.compatListVersion == other.getCompatListVersion();
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
        _hashCode += new Long(getHostListVersion()).hashCode();
        _hashCode += new Long(getClusterConfigVersion()).hashCode();
        _hashCode += new Long(getCompatListVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasDataSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasDataSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostListVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostListVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterConfigVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterConfigVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatListVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "compatListVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
