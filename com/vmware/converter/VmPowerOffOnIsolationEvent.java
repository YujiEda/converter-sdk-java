/**
 * VmPowerOffOnIsolationEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmPowerOffOnIsolationEvent  extends com.vmware.converter.VmPoweredOffEvent  implements java.io.Serializable {
    private com.vmware.converter.HostEventArgument isolatedHost;

    public VmPowerOffOnIsolationEvent() {
    }

    public VmPowerOffOnIsolationEvent(
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
           com.vmware.converter.HostEventArgument isolatedHost) {
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
    }


    /**
     * Gets the isolatedHost value for this VmPowerOffOnIsolationEvent.
     * 
     * @return isolatedHost
     */
    public com.vmware.converter.HostEventArgument getIsolatedHost() {
        return isolatedHost;
    }


    /**
     * Sets the isolatedHost value for this VmPowerOffOnIsolationEvent.
     * 
     * @param isolatedHost
     */
    public void setIsolatedHost(com.vmware.converter.HostEventArgument isolatedHost) {
        this.isolatedHost = isolatedHost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmPowerOffOnIsolationEvent)) return false;
        VmPowerOffOnIsolationEvent other = (VmPowerOffOnIsolationEvent) obj;
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
              this.isolatedHost.equals(other.getIsolatedHost())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmPowerOffOnIsolationEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmPowerOffOnIsolationEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isolatedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isolatedHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
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
