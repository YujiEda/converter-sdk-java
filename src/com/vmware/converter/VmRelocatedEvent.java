/**
 * VmRelocatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmRelocatedEvent  extends com.vmware.converter.VmRelocateSpecEvent  implements java.io.Serializable {
    private com.vmware.converter.HostEventArgument sourceHost;

    private com.vmware.converter.DatacenterEventArgument sourceDatacenter;

    private com.vmware.converter.DatastoreEventArgument sourceDatastore;

    public VmRelocatedEvent() {
    }

    public VmRelocatedEvent(
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
           com.vmware.converter.HostEventArgument sourceHost,
           com.vmware.converter.DatacenterEventArgument sourceDatacenter,
           com.vmware.converter.DatastoreEventArgument sourceDatastore) {
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
        this.sourceHost = sourceHost;
        this.sourceDatacenter = sourceDatacenter;
        this.sourceDatastore = sourceDatastore;
    }


    /**
     * Gets the sourceHost value for this VmRelocatedEvent.
     * 
     * @return sourceHost
     */
    public com.vmware.converter.HostEventArgument getSourceHost() {
        return sourceHost;
    }


    /**
     * Sets the sourceHost value for this VmRelocatedEvent.
     * 
     * @param sourceHost
     */
    public void setSourceHost(com.vmware.converter.HostEventArgument sourceHost) {
        this.sourceHost = sourceHost;
    }


    /**
     * Gets the sourceDatacenter value for this VmRelocatedEvent.
     * 
     * @return sourceDatacenter
     */
    public com.vmware.converter.DatacenterEventArgument getSourceDatacenter() {
        return sourceDatacenter;
    }


    /**
     * Sets the sourceDatacenter value for this VmRelocatedEvent.
     * 
     * @param sourceDatacenter
     */
    public void setSourceDatacenter(com.vmware.converter.DatacenterEventArgument sourceDatacenter) {
        this.sourceDatacenter = sourceDatacenter;
    }


    /**
     * Gets the sourceDatastore value for this VmRelocatedEvent.
     * 
     * @return sourceDatastore
     */
    public com.vmware.converter.DatastoreEventArgument getSourceDatastore() {
        return sourceDatastore;
    }


    /**
     * Sets the sourceDatastore value for this VmRelocatedEvent.
     * 
     * @param sourceDatastore
     */
    public void setSourceDatastore(com.vmware.converter.DatastoreEventArgument sourceDatastore) {
        this.sourceDatastore = sourceDatastore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmRelocatedEvent)) return false;
        VmRelocatedEvent other = (VmRelocatedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceHost==null && other.getSourceHost()==null) || 
             (this.sourceHost!=null &&
              this.sourceHost.equals(other.getSourceHost()))) &&
            ((this.sourceDatacenter==null && other.getSourceDatacenter()==null) || 
             (this.sourceDatacenter!=null &&
              this.sourceDatacenter.equals(other.getSourceDatacenter()))) &&
            ((this.sourceDatastore==null && other.getSourceDatastore()==null) || 
             (this.sourceDatastore!=null &&
              this.sourceDatastore.equals(other.getSourceDatastore())));
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
        if (getSourceHost() != null) {
            _hashCode += getSourceHost().hashCode();
        }
        if (getSourceDatacenter() != null) {
            _hashCode += getSourceDatacenter().hashCode();
        }
        if (getSourceDatastore() != null) {
            _hashCode += getSourceDatastore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmRelocatedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmRelocatedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDatacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceDatacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatacenterEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceDatastore"));
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
