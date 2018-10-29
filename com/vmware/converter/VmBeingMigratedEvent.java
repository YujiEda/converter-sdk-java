/**
 * VmBeingMigratedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmBeingMigratedEvent  extends com.vmware.converter.VmEvent  implements java.io.Serializable {
    private com.vmware.converter.HostEventArgument destHost;

    private com.vmware.converter.DatacenterEventArgument destDatacenter;

    private com.vmware.converter.DatastoreEventArgument destDatastore;

    public VmBeingMigratedEvent() {
    }

    public VmBeingMigratedEvent(
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
           com.vmware.converter.HostEventArgument destHost,
           com.vmware.converter.DatacenterEventArgument destDatacenter,
           com.vmware.converter.DatastoreEventArgument destDatastore) {
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
        this.destHost = destHost;
        this.destDatacenter = destDatacenter;
        this.destDatastore = destDatastore;
    }


    /**
     * Gets the destHost value for this VmBeingMigratedEvent.
     * 
     * @return destHost
     */
    public com.vmware.converter.HostEventArgument getDestHost() {
        return destHost;
    }


    /**
     * Sets the destHost value for this VmBeingMigratedEvent.
     * 
     * @param destHost
     */
    public void setDestHost(com.vmware.converter.HostEventArgument destHost) {
        this.destHost = destHost;
    }


    /**
     * Gets the destDatacenter value for this VmBeingMigratedEvent.
     * 
     * @return destDatacenter
     */
    public com.vmware.converter.DatacenterEventArgument getDestDatacenter() {
        return destDatacenter;
    }


    /**
     * Sets the destDatacenter value for this VmBeingMigratedEvent.
     * 
     * @param destDatacenter
     */
    public void setDestDatacenter(com.vmware.converter.DatacenterEventArgument destDatacenter) {
        this.destDatacenter = destDatacenter;
    }


    /**
     * Gets the destDatastore value for this VmBeingMigratedEvent.
     * 
     * @return destDatastore
     */
    public com.vmware.converter.DatastoreEventArgument getDestDatastore() {
        return destDatastore;
    }


    /**
     * Sets the destDatastore value for this VmBeingMigratedEvent.
     * 
     * @param destDatastore
     */
    public void setDestDatastore(com.vmware.converter.DatastoreEventArgument destDatastore) {
        this.destDatastore = destDatastore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmBeingMigratedEvent)) return false;
        VmBeingMigratedEvent other = (VmBeingMigratedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.destHost==null && other.getDestHost()==null) || 
             (this.destHost!=null &&
              this.destHost.equals(other.getDestHost()))) &&
            ((this.destDatacenter==null && other.getDestDatacenter()==null) || 
             (this.destDatacenter!=null &&
              this.destDatacenter.equals(other.getDestDatacenter()))) &&
            ((this.destDatastore==null && other.getDestDatastore()==null) || 
             (this.destDatastore!=null &&
              this.destDatastore.equals(other.getDestDatastore())));
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
        if (getDestHost() != null) {
            _hashCode += getDestHost().hashCode();
        }
        if (getDestDatacenter() != null) {
            _hashCode += getDestDatacenter().hashCode();
        }
        if (getDestDatastore() != null) {
            _hashCode += getDestDatastore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmBeingMigratedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmBeingMigratedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDatacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destDatacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatacenterEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreEventArgument"));
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
