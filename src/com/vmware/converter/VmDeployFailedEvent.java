/**
 * VmDeployFailedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmDeployFailedEvent  extends com.vmware.converter.VmEvent  implements java.io.Serializable {
    private com.vmware.converter.EntityEventArgument destDatastore;

    private com.vmware.converter.LocalizedMethodFault reason;

    public VmDeployFailedEvent() {
    }

    public VmDeployFailedEvent(
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
           com.vmware.converter.EntityEventArgument destDatastore,
           com.vmware.converter.LocalizedMethodFault reason) {
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
        this.destDatastore = destDatastore;
        this.reason = reason;
    }


    /**
     * Gets the destDatastore value for this VmDeployFailedEvent.
     * 
     * @return destDatastore
     */
    public com.vmware.converter.EntityEventArgument getDestDatastore() {
        return destDatastore;
    }


    /**
     * Sets the destDatastore value for this VmDeployFailedEvent.
     * 
     * @param destDatastore
     */
    public void setDestDatastore(com.vmware.converter.EntityEventArgument destDatastore) {
        this.destDatastore = destDatastore;
    }


    /**
     * Gets the reason value for this VmDeployFailedEvent.
     * 
     * @return reason
     */
    public com.vmware.converter.LocalizedMethodFault getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this VmDeployFailedEvent.
     * 
     * @param reason
     */
    public void setReason(com.vmware.converter.LocalizedMethodFault reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDeployFailedEvent)) return false;
        VmDeployFailedEvent other = (VmDeployFailedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.destDatastore==null && other.getDestDatastore()==null) || 
             (this.destDatastore!=null &&
              this.destDatastore.equals(other.getDestDatastore()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getDestDatastore() != null) {
            _hashCode += getDestDatastore().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDeployFailedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmDeployFailedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EntityEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
