/**
 * ConverterUnixP2VVolumeCloneEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterUnixP2VVolumeCloneEvent  extends com.vmware.converter.ConverterUnixP2VEvent  implements java.io.Serializable {
    private java.lang.String hostName;

    private java.lang.String sourceMountPoint;

    public ConverterUnixP2VVolumeCloneEvent() {
    }

    public ConverterUnixP2VVolumeCloneEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String hostName,
           java.lang.String sourceMountPoint) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job);
        this.hostName = hostName;
        this.sourceMountPoint = sourceMountPoint;
    }


    /**
     * Gets the hostName value for this ConverterUnixP2VVolumeCloneEvent.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this ConverterUnixP2VVolumeCloneEvent.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the sourceMountPoint value for this ConverterUnixP2VVolumeCloneEvent.
     * 
     * @return sourceMountPoint
     */
    public java.lang.String getSourceMountPoint() {
        return sourceMountPoint;
    }


    /**
     * Sets the sourceMountPoint value for this ConverterUnixP2VVolumeCloneEvent.
     * 
     * @param sourceMountPoint
     */
    public void setSourceMountPoint(java.lang.String sourceMountPoint) {
        this.sourceMountPoint = sourceMountPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterUnixP2VVolumeCloneEvent)) return false;
        ConverterUnixP2VVolumeCloneEvent other = (ConverterUnixP2VVolumeCloneEvent) obj;
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
            ((this.sourceMountPoint==null && other.getSourceMountPoint()==null) || 
             (this.sourceMountPoint!=null &&
              this.sourceMountPoint.equals(other.getSourceMountPoint())));
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
        if (getSourceMountPoint() != null) {
            _hashCode += getSourceMountPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterUnixP2VVolumeCloneEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterUnixP2VVolumeCloneEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMountPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "sourceMountPoint"));
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
