/**
 * VmShutdownOnIsolationEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmShutdownOnIsolationEvent  extends com.vmware.converter.VmPoweredOffEvent  implements java.io.Serializable {
    private com.vmware.converter.HostEventArgument isolatedHost;

    private java.lang.String shutdownResult;

    public VmShutdownOnIsolationEvent() {
    }

    public VmShutdownOnIsolationEvent(
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
           com.vmware.converter.HostEventArgument isolatedHost,
           java.lang.String shutdownResult) {
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
            template);
        this.isolatedHost = isolatedHost;
        this.shutdownResult = shutdownResult;
    }


    /**
     * Gets the isolatedHost value for this VmShutdownOnIsolationEvent.
     * 
     * @return isolatedHost
     */
    public com.vmware.converter.HostEventArgument getIsolatedHost() {
        return isolatedHost;
    }


    /**
     * Sets the isolatedHost value for this VmShutdownOnIsolationEvent.
     * 
     * @param isolatedHost
     */
    public void setIsolatedHost(com.vmware.converter.HostEventArgument isolatedHost) {
        this.isolatedHost = isolatedHost;
    }


    /**
     * Gets the shutdownResult value for this VmShutdownOnIsolationEvent.
     * 
     * @return shutdownResult
     */
    public java.lang.String getShutdownResult() {
        return shutdownResult;
    }


    /**
     * Sets the shutdownResult value for this VmShutdownOnIsolationEvent.
     * 
     * @param shutdownResult
     */
    public void setShutdownResult(java.lang.String shutdownResult) {
        this.shutdownResult = shutdownResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmShutdownOnIsolationEvent)) return false;
        VmShutdownOnIsolationEvent other = (VmShutdownOnIsolationEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isolatedHost==null && other.getIsolatedHost()==null) || 
             (this.isolatedHost!=null &&
              this.isolatedHost.equals(other.getIsolatedHost()))) &&
            ((this.shutdownResult==null && other.getShutdownResult()==null) || 
             (this.shutdownResult!=null &&
              this.shutdownResult.equals(other.getShutdownResult())));
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
        if (getIsolatedHost() != null) {
            _hashCode += getIsolatedHost().hashCode();
        }
        if (getShutdownResult() != null) {
            _hashCode += getShutdownResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmShutdownOnIsolationEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmShutdownOnIsolationEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isolatedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isolatedHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shutdownResult"));
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
