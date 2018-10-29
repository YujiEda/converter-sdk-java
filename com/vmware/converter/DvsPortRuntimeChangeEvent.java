/**
 * DvsPortRuntimeChangeEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsPortRuntimeChangeEvent  extends com.vmware.converter.DvsEvent  implements java.io.Serializable {
    private java.lang.String portKey;

    private com.vmware.converter.DVPortStatus runtimeInfo;

    public DvsPortRuntimeChangeEvent() {
    }

    public DvsPortRuntimeChangeEvent(
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
           java.lang.String portKey,
           com.vmware.converter.DVPortStatus runtimeInfo) {
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
            changeTag);
        this.portKey = portKey;
        this.runtimeInfo = runtimeInfo;
    }


    /**
     * Gets the portKey value for this DvsPortRuntimeChangeEvent.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this DvsPortRuntimeChangeEvent.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }


    /**
     * Gets the runtimeInfo value for this DvsPortRuntimeChangeEvent.
     * 
     * @return runtimeInfo
     */
    public com.vmware.converter.DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }


    /**
     * Sets the runtimeInfo value for this DvsPortRuntimeChangeEvent.
     * 
     * @param runtimeInfo
     */
    public void setRuntimeInfo(com.vmware.converter.DVPortStatus runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsPortRuntimeChangeEvent)) return false;
        DvsPortRuntimeChangeEvent other = (DvsPortRuntimeChangeEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              this.portKey.equals(other.getPortKey()))) &&
            ((this.runtimeInfo==null && other.getRuntimeInfo()==null) || 
             (this.runtimeInfo!=null &&
              this.runtimeInfo.equals(other.getRuntimeInfo())));
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
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        if (getRuntimeInfo() != null) {
            _hashCode += getRuntimeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsPortRuntimeChangeEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsPortRuntimeChangeEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runtimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortStatus"));
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
